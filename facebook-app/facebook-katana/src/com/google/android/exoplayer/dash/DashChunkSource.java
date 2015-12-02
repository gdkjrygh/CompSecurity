// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import com.facebook.tools.dextr.runtime.detour.HandlerDetour;
import com.google.android.exoplayer.BehindLiveWindowException;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.TimeRange;
import com.google.android.exoplayer.TrackInfo;
import com.google.android.exoplayer.chunk.Chunk;
import com.google.android.exoplayer.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer.chunk.ChunkOperationHolder;
import com.google.android.exoplayer.chunk.ChunkSource;
import com.google.android.exoplayer.chunk.ContainerMediaChunk;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.FormatEvaluator;
import com.google.android.exoplayer.chunk.InitializationChunk;
import com.google.android.exoplayer.chunk.MediaChunk;
import com.google.android.exoplayer.chunk.SingleSampleMediaChunk;
import com.google.android.exoplayer.dash.mpd.AdaptationSet;
import com.google.android.exoplayer.dash.mpd.ContentProtection;
import com.google.android.exoplayer.dash.mpd.MediaPresentationDescription;
import com.google.android.exoplayer.dash.mpd.Period;
import com.google.android.exoplayer.dash.mpd.RangedUri;
import com.google.android.exoplayer.dash.mpd.Representation;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.ChunkIndex;
import com.google.android.exoplayer.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer.extractor.webm.WebmExtractor;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.Clock;
import com.google.android.exoplayer.util.ManifestFetcher;
import com.google.android.exoplayer.util.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash:
//            DashSegmentIndex, DashWrappingSegmentIndex

public class DashChunkSource
    implements ChunkSource
{

    private IOException A;
    private final Handler a;
    private final EventListener b;
    private final TrackInfo c;
    private final DataSource d;
    private final FormatEvaluator e;
    private final com.google.android.exoplayer.chunk.FormatEvaluator.Evaluation f;
    private final Clock g;
    private final StringBuilder h;
    private final long i;
    private final long j;
    private final int k;
    private final int l;
    private final Format m[];
    private final HashMap n;
    private final ManifestFetcher o;
    private final int p;
    private final int q[];
    private MediaPresentationDescription r;
    private boolean s;
    private DrmInitData t;
    private TimeRange u;
    private long v[];
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    public DashChunkSource(MediaPresentationDescription mediapresentationdescription, int i1, int ai[], DataSource datasource, FormatEvaluator formatevaluator)
    {
        this(null, mediapresentationdescription, i1, ai, datasource, formatevaluator, ((Clock) (new SystemClock())), 0L, 0L, false, null, null);
    }

    public transient DashChunkSource(DataSource datasource, FormatEvaluator formatevaluator, Representation arepresentation[])
    {
        this(a(Arrays.asList(arepresentation)), 0, null, datasource, formatevaluator);
    }

    private DashChunkSource(ManifestFetcher manifestfetcher, MediaPresentationDescription mediapresentationdescription, int i1, int ai[], DataSource datasource, FormatEvaluator formatevaluator, Clock clock, 
            long l1, long l2, boolean flag, Handler handler, EventListener eventlistener)
    {
        o = manifestfetcher;
        r = mediapresentationdescription;
        p = i1;
        q = ai;
        d = datasource;
        e = formatevaluator;
        g = clock;
        i = l1;
        j = l2;
        y = flag;
        a = handler;
        b = eventlistener;
        f = new com.google.android.exoplayer.chunk.FormatEvaluator.Evaluation();
        h = new StringBuilder();
        v = new long[2];
        t = a(r, i1);
        mediapresentationdescription = a(r, i1, ai);
        int j1;
        int k1;
        if (((Representation) (mediapresentationdescription[0])).e == -1L)
        {
            l1 = -1L;
        } else
        {
            l1 = ((Representation) (mediapresentationdescription[0])).e * 1000L;
        }
        c = new TrackInfo(((Representation) (mediapresentationdescription[0])).c.b, l1);
        m = new Format[mediapresentationdescription.length];
        n = new HashMap();
        k1 = 0;
        j1 = 0;
        i1 = 0;
        while (i1 < mediapresentationdescription.length) 
        {
            m[i1] = ((Representation) (mediapresentationdescription[i1])).c;
            k1 = Math.max(m[i1].d, k1);
            j1 = Math.max(m[i1].e, j1);
            if (a(m[i1].b))
            {
                manifestfetcher = new WebmExtractor();
            } else
            {
                manifestfetcher = new FragmentedMp4Extractor();
            }
            n.put(m[i1].a, new RepresentationHolder(mediapresentationdescription[i1], new ChunkExtractorWrapper(manifestfetcher)));
            i1++;
        }
        k = k1;
        l = j1;
        Arrays.sort(m, new com.google.android.exoplayer.chunk.Format.DecreasingBandwidthComparator());
    }

    private Chunk a(RepresentationHolder representationholder, DataSource datasource, int i1, int j1)
    {
        Representation representation = representationholder.a;
        Object obj = representationholder.c;
        long l1 = ((DashSegmentIndex) (obj)).a(i1);
        long l2 = l1 + ((DashSegmentIndex) (obj)).b(i1);
        int k1 = i1 + representationholder.e;
        long l3;
        boolean flag;
        if (!r.d && i1 == ((DashSegmentIndex) (obj)).b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = ((DashSegmentIndex) (obj)).c(i1);
        obj = new DataSpec(((RangedUri) (obj)).a(), ((RangedUri) (obj)).a, ((RangedUri) (obj)).b, representation.g());
        l3 = representation.d * 1000L - representation.f;
        if (representation.c.b.equals("text/vtt"))
        {
            if (representationholder.f != l3)
            {
                h.setLength(0);
                h.append("EXO-HEADER=").append("OFFSET:").append(l3).append("\n");
                representationholder.g = h.toString().getBytes();
                representationholder.f = l3;
            }
            return new SingleSampleMediaChunk(datasource, ((DataSpec) (obj)), 1, representation.c, l1, l2, k1, flag, MediaFormat.a("text/vtt"), null, representationholder.g);
        } else
        {
            return new ContainerMediaChunk(datasource, ((DataSpec) (obj)), j1, representation.c, l1, l2, k1, flag, l3, representationholder.b, representationholder.d, t, true);
        }
    }

    private static Chunk a(RangedUri rangeduri, RangedUri rangeduri1, Representation representation, ChunkExtractorWrapper chunkextractorwrapper, DataSource datasource, int i1)
    {
        if (rangeduri != null)
        {
            rangeduri1 = rangeduri.a(rangeduri1);
            if (rangeduri1 != null)
            {
                rangeduri = rangeduri1;
            }
        } else
        {
            rangeduri = rangeduri1;
        }
        return new InitializationChunk(datasource, new DataSpec(rangeduri.a(), rangeduri.a, rangeduri.b, representation.g()), i1, representation.c, chunkextractorwrapper);
    }

    private static MediaPresentationDescription a(List list)
    {
        Representation representation = (Representation)list.get(0);
        list = new AdaptationSet(0, -1, list);
        list = new Period(null, representation.d, representation.e, Collections.singletonList(list));
        return new MediaPresentationDescription(-1L, representation.e - representation.d, -1L, false, -1L, -1L, null, null, Collections.singletonList(list));
    }

    private static DrmInitData a(MediaPresentationDescription mediapresentationdescription, int i1)
    {
        String s1;
        Object obj;
        obj = null;
        Object obj2 = null;
        mediapresentationdescription = (AdaptationSet)((Period)mediapresentationdescription.i.get(0)).d.get(i1);
        if (a(((Representation)((AdaptationSet) (mediapresentationdescription)).c.get(0)).c.b))
        {
            s1 = "video/webm";
        } else
        {
            s1 = "video/mp4";
        }
        if (!((AdaptationSet) (mediapresentationdescription)).d.isEmpty()) goto _L2; else goto _L1
_L1:
        obj = obj2;
_L4:
        return ((DrmInitData) (obj));
_L2:
        Iterator iterator = ((AdaptationSet) (mediapresentationdescription)).d.iterator();
        mediapresentationdescription = ((MediaPresentationDescription) (obj));
        do
        {
            obj = mediapresentationdescription;
            if (!iterator.hasNext())
            {
                continue;
            }
            ContentProtection contentprotection = (ContentProtection)iterator.next();
            if (contentprotection.b != null && contentprotection.c != null)
            {
                Object obj1 = mediapresentationdescription;
                if (mediapresentationdescription == null)
                {
                    obj1 = new com.google.android.exoplayer.drm.DrmInitData.Mapped(s1);
                }
                ((com.google.android.exoplayer.drm.DrmInitData.Mapped) (obj1)).a(contentprotection.b, contentprotection.c);
                mediapresentationdescription = ((MediaPresentationDescription) (obj1));
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(TimeRange timerange)
    {
        if (a != null && b != null)
        {
            HandlerDetour.a(a, new _cls1(timerange), 0x782fe5fc);
        }
    }

    private void a(DashSegmentIndex dashsegmentindex, long l1)
    {
        int j1 = dashsegmentindex.a();
        int k1 = dashsegmentindex.b();
        int i1;
        if (k1 == -1)
        {
            l1 -= r.a * 1000L;
            i1 = j1;
            if (r.f != -1L)
            {
                i1 = Math.max(j1, dashsegmentindex.a(l1 - r.f * 1000L));
            }
            j1 = dashsegmentindex.a(l1);
            j1--;
        } else
        {
            i1 = j1;
            j1 = k1;
        }
        w = i1;
        x = j1;
    }

    private static boolean a(String s1)
    {
        return s1.startsWith("video/webm") || s1.startsWith("audio/webm");
    }

    private static Representation[] a(MediaPresentationDescription mediapresentationdescription, int i1, int ai[])
    {
        boolean flag = false;
        mediapresentationdescription = ((AdaptationSet)((Period)mediapresentationdescription.i.get(0)).d.get(i1)).c;
        if (ai == null)
        {
            ai = new Representation[mediapresentationdescription.size()];
            mediapresentationdescription.toArray(ai);
            return ai;
        }
        Representation arepresentation[] = new Representation[ai.length];
        for (i1 = ((flag) ? 1 : 0); i1 < ai.length; i1++)
        {
            arepresentation[i1] = (Representation)mediapresentationdescription.get(ai[i1]);
        }

        return arepresentation;
    }

    private void b(DashSegmentIndex dashsegmentindex, long l1)
    {
        long l2;
        long l4;
        l4 = dashsegmentindex.a(w);
        l2 = dashsegmentindex.a(x);
        l2 = dashsegmentindex.b(x) + l2;
        if (!r.d) goto _L2; else goto _L1
_L1:
        if (dashsegmentindex.b() != -1) goto _L4; else goto _L3
_L3:
        l2 = l1 - r.a * 1000L;
_L6:
        l2 = Math.max(l4, l2 - i);
_L2:
        dashsegmentindex = new TimeRange(0, l4, l2);
        if (u == null || !u.equals(dashsegmentindex))
        {
            u = dashsegmentindex;
            a(u);
        }
        return;
_L4:
        long l3 = dashsegmentindex.a(dashsegmentindex.b()) + dashsegmentindex.b(dashsegmentindex.b());
        l2 = l3;
        if (!dashsegmentindex.c())
        {
            l2 = Math.min(l3, l1 - r.a * 1000L);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private long f()
    {
        if (j != 0L)
        {
            return g.a() * 1000L + j;
        } else
        {
            return System.currentTimeMillis() * 1000L;
        }
    }

    public final TrackInfo a()
    {
        return c;
    }

    public final void a(MediaFormat mediaformat)
    {
        if (c.a.startsWith("video"))
        {
            mediaformat.a(k, l);
        }
    }

    public final void a(Chunk chunk)
    {
        if (chunk instanceof InitializationChunk)
        {
            chunk = (InitializationChunk)chunk;
            Object obj = ((InitializationChunk) (chunk)).d.a;
            obj = (RepresentationHolder)n.get(obj);
            if (chunk.a())
            {
                obj.d = chunk.b();
            }
            if (chunk.i())
            {
                obj.c = new DashWrappingSegmentIndex((ChunkIndex)chunk.j(), ((InitializationChunk) (chunk)).e.a.toString(), ((RepresentationHolder) (obj)).a.d * 1000L);
            }
            if (t == null && chunk.c())
            {
                t = chunk.d();
            }
        }
    }

    public final void a(List list, long l1, long l2, ChunkOperationHolder chunkoperationholder)
    {
        if (A != null)
        {
            chunkoperationholder.b = null;
        } else
        {
            f.a = list.size();
            if (f.c == null || !z)
            {
                e.a(list, l2, m, f);
            }
            Object obj = f.c;
            chunkoperationholder.a = f.a;
            if (obj == null)
            {
                chunkoperationholder.b = null;
                return;
            }
            if (chunkoperationholder.a != list.size() || chunkoperationholder.b == null || !chunkoperationholder.b.d.equals(obj))
            {
                chunkoperationholder.b = null;
                RepresentationHolder representationholder = (RepresentationHolder)n.get(((Format) (obj)).a);
                Representation representation = representationholder.a;
                DashSegmentIndex dashsegmentindex = representationholder.c;
                ChunkExtractorWrapper chunkextractorwrapper = representationholder.b;
                obj = null;
                RangedUri rangeduri = null;
                if (representationholder.d == null)
                {
                    obj = representation.d();
                }
                if (dashsegmentindex == null)
                {
                    rangeduri = representation.e();
                }
                if (obj != null || rangeduri != null)
                {
                    list = a(((RangedUri) (obj)), rangeduri, representation, chunkextractorwrapper, d, f.b);
                    z = true;
                    chunkoperationholder.b = list;
                    return;
                }
                int j1;
                boolean flag;
                if (dashsegmentindex.b() == -1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    l2 = f();
                    int i1 = w;
                    int k1 = x;
                    a(dashsegmentindex, l2);
                    if (i1 != w || k1 != x)
                    {
                        b(dashsegmentindex, l2);
                    }
                }
                if (list.isEmpty())
                {
                    l2 = l1;
                    if (r.d)
                    {
                        v = u.a(v);
                        int i2;
                        if (y)
                        {
                            y = false;
                            l2 = v[1];
                        } else
                        {
                            l2 = Math.min(Math.max(l1, v[0]), v[1]);
                        }
                    }
                    i2 = dashsegmentindex.a(l2);
                    j1 = i2;
                    if (flag)
                    {
                        j1 = Math.min(i2, x);
                    }
                } else
                {
                    list = (MediaChunk)list.get(chunkoperationholder.a - 1);
                    if (((MediaChunk) (list)).j)
                    {
                        j1 = -1;
                    } else
                    {
                        j1 = (((MediaChunk) (list)).i + 1) - representationholder.e;
                    }
                }
                if (r.d)
                {
                    if (j1 < w)
                    {
                        A = new BehindLiveWindowException();
                        return;
                    }
                    if (j1 > x)
                    {
                        boolean flag1;
                        if (!flag)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        s = flag1;
                        return;
                    }
                    if (!flag && j1 == x)
                    {
                        s = true;
                    }
                }
                if (j1 != -1)
                {
                    list = a(representationholder, d, j1, f.b);
                    z = false;
                    chunkoperationholder.b = list;
                    return;
                }
            }
        }
    }

    public final void b()
    {
        A = null;
        e.a();
        if (o != null)
        {
            o.d();
        }
        DashSegmentIndex dashsegmentindex = ((RepresentationHolder)n.get(m[0].a)).a.f();
        if (dashsegmentindex == null)
        {
            u = new TimeRange(0, 0L, r.b * 1000L);
            a(u);
            return;
        } else
        {
            long l1 = f();
            a(dashsegmentindex, l1);
            b(dashsegmentindex, l1);
            return;
        }
    }

    public final void c()
    {
        e.b();
        if (o != null)
        {
            o.e();
        }
        u = null;
    }

    public final void d()
    {
        if (o != null && r.d && A == null)
        {
            MediaPresentationDescription mediapresentationdescription = (MediaPresentationDescription)o.a();
            if (r != mediapresentationdescription && mediapresentationdescription != null)
            {
                Representation arepresentation[] = a(mediapresentationdescription, p, q);
                int k1 = arepresentation.length;
                int i1 = 0;
                while (i1 < k1) 
                {
                    Object obj = arepresentation[i1];
                    RepresentationHolder representationholder = (RepresentationHolder)n.get(((Representation) (obj)).c.a);
                    DashSegmentIndex dashsegmentindex = representationholder.c;
                    int j1 = dashsegmentindex.b();
                    long l1 = dashsegmentindex.a(j1);
                    l1 = dashsegmentindex.b(j1) + l1;
                    obj = ((Representation) (obj)).f();
                    j1 = ((DashSegmentIndex) (obj)).a();
                    long l4 = ((DashSegmentIndex) (obj)).a(j1);
                    if (l1 < l4)
                    {
                        A = new BehindLiveWindowException();
                        return;
                    }
                    if (l1 == l4)
                    {
                        j1 = (dashsegmentindex.b() + 1) - j1;
                    } else
                    {
                        j1 = dashsegmentindex.a(l4) - j1;
                    }
                    representationholder.e = j1 + representationholder.e;
                    representationholder.c = ((DashSegmentIndex) (obj));
                    i1++;
                }
                r = mediapresentationdescription;
                s = false;
                long l2 = f();
                a(arepresentation[0].f(), l2);
                b(arepresentation[0].f(), l2);
            }
            long l5 = r.e;
            long l3 = l5;
            if (l5 == 0L)
            {
                l3 = 5000L;
            }
            if (s && android.os.SystemClock.elapsedRealtime() > l3 + o.b())
            {
                o.g();
                return;
            }
        }
    }

    public final void e()
    {
        if (A != null)
        {
            throw A;
        }
        if (o != null)
        {
            o.c();
        }
    }

    private class RepresentationHolder
    {

        public final Representation a;
        public final ChunkExtractorWrapper b;
        public DashSegmentIndex c;
        public MediaFormat d;
        public int e;
        public long f;
        public byte g[];

        public RepresentationHolder(Representation representation, ChunkExtractorWrapper chunkextractorwrapper)
        {
            a = representation;
            b = chunkextractorwrapper;
            c = representation.f();
        }
    }


    private class _cls1
        implements Runnable
    {

        final TimeRange a;
        final DashChunkSource b;

        public void run()
        {
        }

        _cls1(TimeRange timerange)
        {
            b = DashChunkSource.this;
            a = timerange;
            super();
        }
    }

}
