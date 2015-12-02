// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor;

import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.MediaFormatHolder;
import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.SampleSource;
import com.google.android.exoplayer.TrackInfo;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.upstream.Allocator;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.Loader;
import com.google.android.exoplayer.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.extractor:
//            ExtractorOutput, Extractor, SeekMap, TrackOutput

public final class ExtractorSampleSource
    implements SampleSource, com.google.android.exoplayer.SampleSource.SampleSourceReader, ExtractorOutput, com.google.android.exoplayer.upstream.Loader.Callback
{

    private static final List a;
    private ExtractingLoadable A;
    private IOException B;
    private int C;
    private long D;
    private boolean E;
    private int F;
    private int G;
    private final ExtractorHolder b;
    private final Allocator c;
    private final int d;
    private final SparseArray e;
    private final int f;
    private final Uri g;
    private final DataSource h;
    private volatile boolean i;
    private volatile SeekMap j;
    private volatile DrmInitData k;
    private boolean l;
    private int m;
    private TrackInfo n[];
    private long o;
    private boolean p[];
    private boolean q[];
    private boolean r[];
    private int s;
    private long t;
    private long u;
    private long v;
    private boolean w;
    private long x;
    private long y;
    private Loader z;

    private transient ExtractorSampleSource(Uri uri, DataSource datasource, Allocator allocator, int i1, int j1, Extractor aextractor[])
    {
label0:
        {
            super();
            g = uri;
            h = datasource;
            c = allocator;
            d = i1;
            f = j1;
            if (aextractor != null)
            {
                uri = aextractor;
                if (aextractor.length != 0)
                {
                    break label0;
                }
            }
            datasource = new Extractor[a.size()];
            i1 = 0;
            do
            {
                uri = datasource;
                if (i1 >= datasource.length)
                {
                    break;
                }
                try
                {
                    datasource[i1] = (Extractor)((Class)a.get(i1)).newInstance();
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri)
                {
                    throw new IllegalStateException("Unexpected error creating default extractor", uri);
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri)
                {
                    throw new IllegalStateException("Unexpected error creating default extractor", uri);
                }
                i1++;
            } while (true);
        }
        b = new ExtractorHolder(uri, this);
        e = new SparseArray();
        v = -1L;
    }

    public transient ExtractorSampleSource(Uri uri, DataSource datasource, Allocator allocator, int i1, Extractor aextractor[])
    {
        this(uri, datasource, allocator, i1, -1, aextractor);
    }

    static int a(ExtractorSampleSource extractorsamplesource)
    {
        int i1 = extractorsamplesource.F;
        extractorsamplesource.F = i1 + 1;
        return i1;
    }

    private void c(long l1)
    {
        v = l1;
        if (!z.a() && !k())
        {
            return;
        }
        E = false;
        if (z.a())
        {
            z.b();
            return;
        } else
        {
            j();
            g();
            return;
        }
    }

    private ExtractingLoadable d(long l1)
    {
        return new ExtractingLoadable(g, h, b, c, d, j.b(l1));
    }

    private void e(long l1)
    {
        for (int i1 = 0; i1 < r.length; i1++)
        {
            if (!r[i1])
            {
                ((InternalTrackOutput)e.valueAt(i1)).a(l1);
            }
        }

    }

    private static long f(long l1)
    {
        return Math.min((l1 - 1L) * 1000L, 5000L);
    }

    private void g()
    {
        int i1;
        boolean flag;
        flag = false;
        i1 = 0;
        if (!E && !z.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (B == null) goto _L4; else goto _L3
_L3:
        if (l()) goto _L1; else goto _L5
_L5:
        boolean flag1;
        if (A != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertions.b(flag1);
        if (SystemClock.elapsedRealtime() - D < f(C)) goto _L1; else goto _L6
_L6:
        B = null;
        if (l) goto _L8; else goto _L7
_L7:
        for (; i1 < e.size(); i1++)
        {
            ((InternalTrackOutput)e.valueAt(i1)).a();
        }

        A = h();
_L9:
        G = F;
        z.a(A, this);
        return;
_L8:
        if (!j.a())
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < e.size(); j1++)
            {
                ((InternalTrackOutput)e.valueAt(j1)).a();
            }

            A = h();
            x = t;
            w = true;
        }
        if (true) goto _L9; else goto _L4
_L4:
        y = 0L;
        w = false;
        if (!l)
        {
            A = h();
        } else
        {
            Assertions.b(k());
            if (o != -1L && v >= o)
            {
                E = true;
                v = -1L;
                return;
            }
            A = d(v);
            v = -1L;
        }
        G = F;
        z.a(A, this);
        return;
    }

    private ExtractingLoadable h()
    {
        return new ExtractingLoadable(g, h, b, c, d, 0L);
    }

    private boolean i()
    {
        for (int i1 = 0; i1 < e.size(); i1++)
        {
            if (!((InternalTrackOutput)e.valueAt(i1)).d())
            {
                return false;
            }
        }

        return true;
    }

    private void j()
    {
        for (int i1 = 0; i1 < e.size(); i1++)
        {
            ((InternalTrackOutput)e.valueAt(i1)).a();
        }

        A = null;
        B = null;
        C = 0;
    }

    private boolean k()
    {
        return v != -1L;
    }

    private boolean l()
    {
        return B instanceof UnrecognizedInputFormatException;
    }

    public final int a(int i1, long l1, MediaFormatHolder mediaformatholder, SampleHolder sampleholder, boolean flag)
    {
        t = l1;
        if (q[i1])
        {
            q[i1] = false;
            return -5;
        }
        if (flag || k())
        {
            return -2;
        }
        InternalTrackOutput internaltrackoutput = (InternalTrackOutput)e.valueAt(i1);
        if (p[i1])
        {
            mediaformatholder.a = internaltrackoutput.e();
            mediaformatholder.b = k;
            p[i1] = false;
            return -4;
        }
        if (internaltrackoutput.a(sampleholder))
        {
            int j1;
            if (sampleholder.e < u)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            j1 = sampleholder.d;
            if (i1 != 0)
            {
                i1 = 0x8000000;
            } else
            {
                i1 = 0;
            }
            sampleholder.d = i1 | j1;
            if (w)
            {
                y = x - sampleholder.e;
                w = false;
            }
            sampleholder.e = sampleholder.e + y;
            return -3;
        }
        return !E ? -2 : -1;
    }

    public final TrackInfo a(int i1)
    {
        Assertions.b(l);
        return n[i1];
    }

    public final void a()
    {
        i = true;
    }

    public final void a(int i1, long l1)
    {
        Assertions.b(l);
        boolean flag;
        if (!r[i1])
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        m = m + 1;
        r[i1] = true;
        p[i1] = true;
        if (m == 1)
        {
            b(l1);
        }
        q[i1] = false;
    }

    public final void a(DrmInitData drminitdata)
    {
        k = drminitdata;
    }

    public final void a(SeekMap seekmap)
    {
        j = seekmap;
    }

    public final void a(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
    {
        E = true;
    }

    public final void a(com.google.android.exoplayer.upstream.Loader.Loadable loadable, IOException ioexception)
    {
        B = ioexception;
        int i1;
        if (F > G)
        {
            i1 = 1;
        } else
        {
            i1 = C + 1;
        }
        C = i1;
        D = SystemClock.elapsedRealtime();
        g();
    }

    public final boolean a(long l1)
    {
        boolean flag1 = false;
        boolean flag;
        if (l)
        {
            flag = true;
        } else
        {
            if (z == null)
            {
                z = new Loader("Loader:ExtractorSampleSource");
            }
            g();
            flag = flag1;
            if (j != null)
            {
                flag = flag1;
                if (i)
                {
                    flag = flag1;
                    if (i())
                    {
                        int j1 = e.size();
                        r = new boolean[j1];
                        q = new boolean[j1];
                        p = new boolean[j1];
                        n = new TrackInfo[j1];
                        o = -1L;
                        for (int i1 = 0; i1 < j1; i1++)
                        {
                            MediaFormat mediaformat = ((InternalTrackOutput)e.valueAt(i1)).e();
                            n[i1] = new TrackInfo(mediaformat.a, mediaformat.c);
                            if (mediaformat.c != -1L && mediaformat.c > o)
                            {
                                o = mediaformat.c;
                            }
                        }

                        l = true;
                        return true;
                    }
                }
            }
        }
        return flag;
    }

    public final TrackOutput a_(int i1)
    {
        InternalTrackOutput internaltrackoutput1 = (InternalTrackOutput)e.get(i1);
        InternalTrackOutput internaltrackoutput = internaltrackoutput1;
        if (internaltrackoutput1 == null)
        {
            internaltrackoutput = new InternalTrackOutput(c);
            e.put(i1, internaltrackoutput);
        }
        return internaltrackoutput;
    }

    public final int b()
    {
        return e.size();
    }

    public final void b(int i1)
    {
label0:
        {
            Assertions.b(l);
            Assertions.b(r[i1]);
            m = m - 1;
            r[i1] = false;
            if (m == 0)
            {
                t = 0x8000000000000000L;
                if (!z.a())
                {
                    break label0;
                }
                z.b();
            }
            return;
        }
        j();
        c.a(0);
    }

    public final void b(long l1)
    {
        boolean flag1 = false;
        Assertions.b(l);
        long l2;
        boolean flag2;
        if (m > 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Assertions.b(flag2);
        if (!j.a())
        {
            l1 = 0L;
        }
        if (k())
        {
            l2 = v;
        } else
        {
            l2 = t;
        }
        t = l1;
        u = l1;
        if (l2 != l1)
        {
            boolean flag;
            int i1;
            if (!k())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            for (i1 = 0; flag && i1 < e.size(); i1++)
            {
                flag &= ((InternalTrackOutput)e.valueAt(i1)).b(l1);
            }

            i1 = ((flag1) ? 1 : 0);
            if (!flag)
            {
                c(l1);
                i1 = ((flag1) ? 1 : 0);
            }
            while (i1 < q.length) 
            {
                q[i1] = true;
                i1++;
            }
        }
    }

    public final boolean b(int i1, long l1)
    {
        Assertions.b(l);
        Assertions.b(r[i1]);
        t = l1;
        e(t);
        if (E)
        {
            return true;
        }
        g();
        if (k())
        {
            return false;
        }
        return !((InternalTrackOutput)e.valueAt(i1)).g();
    }

    public final void c()
    {
        if (B != null)
        {
            if (l())
            {
                throw B;
            }
            int i1;
            if (f != -1)
            {
                i1 = f;
            } else
            if (j != null && !j.a())
            {
                i1 = 6;
            } else
            {
                i1 = 3;
            }
            if (C > i1)
            {
                throw B;
            }
        }
    }

    public final long d()
    {
        long l2;
        if (E)
        {
            l2 = -3L;
        } else
        {
            if (k())
            {
                return v;
            }
            int i1 = 0;
            long l1 = 0x8000000000000000L;
            for (; i1 < e.size(); i1++)
            {
                l1 = Math.max(l1, ((InternalTrackOutput)e.valueAt(i1)).f());
            }

            l2 = l1;
            if (l1 == 0x8000000000000000L)
            {
                return t;
            }
        }
        return l2;
    }

    public final void e()
    {
        int i1;
        boolean flag;
        if (s > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        i1 = s - 1;
        s = i1;
        if (i1 == 0 && z != null)
        {
            z.c();
            z = null;
        }
    }

    public final void f()
    {
        if (m > 0)
        {
            c(v);
            return;
        } else
        {
            j();
            c.a(0);
            return;
        }
    }

    public final com.google.android.exoplayer.SampleSource.SampleSourceReader f_()
    {
        s = s + 1;
        return this;
    }

    static 
    {
        a = new ArrayList();
        try
        {
            a.add(Class.forName("com.google.android.exoplayer.extractor.webm.WebmExtractor").asSubclass(com/google/android/exoplayer/extractor/Extractor));
        }
        catch (ClassNotFoundException classnotfoundexception5) { }
        try
        {
            a.add(Class.forName("com.google.android.exoplayer.extractor.mp4.FragmentedMp4Extractor").asSubclass(com/google/android/exoplayer/extractor/Extractor));
        }
        catch (ClassNotFoundException classnotfoundexception4) { }
        try
        {
            a.add(Class.forName("com.google.android.exoplayer.extractor.mp4.Mp4Extractor").asSubclass(com/google/android/exoplayer/extractor/Extractor));
        }
        catch (ClassNotFoundException classnotfoundexception3) { }
        try
        {
            a.add(Class.forName("com.google.android.exoplayer.extractor.mp3.Mp3Extractor").asSubclass(com/google/android/exoplayer/extractor/Extractor));
        }
        catch (ClassNotFoundException classnotfoundexception2) { }
        try
        {
            a.add(Class.forName("com.google.android.exoplayer.extractor.ts.AdtsExtractor").asSubclass(com/google/android/exoplayer/extractor/Extractor));
        }
        catch (ClassNotFoundException classnotfoundexception1) { }
        try
        {
            a.add(Class.forName("com.google.android.exoplayer.extractor.ts.TsExtractor").asSubclass(com/google/android/exoplayer/extractor/Extractor));
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return;
        }
    }

    private class ExtractorHolder
    {

        private final Extractor a[];
        private final ExtractorOutput b;
        private Extractor c;

        public final Extractor a(ExtractorInput extractorinput)
        {
            Extractor aextractor[];
            int i1;
            int j1;
            if (c != null)
            {
                return c;
            }
            aextractor = a;
            j1 = aextractor.length;
            i1 = 0;
_L2:
            Extractor extractor;
            if (i1 >= j1)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            extractor = aextractor[i1];
            if (!extractor.a(extractorinput))
            {
                break MISSING_BLOCK_LABEL_71;
            }
            c = extractor;
            EOFException eofexception;
            if (c == null)
            {
                throw new UnrecognizedInputFormatException(a);
            } else
            {
                c.a(b);
                return c;
            }
            eofexception;
            extractorinput.a();
            i1++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public ExtractorHolder(Extractor aextractor[], ExtractorOutput extractoroutput)
        {
            a = aextractor;
            b = extractoroutput;
        }
    }


    private class ExtractingLoadable
        implements com.google.android.exoplayer.upstream.Loader.Loadable
    {

        private final Uri a;
        private final DataSource b;
        private final ExtractorHolder c;
        private final Allocator d;
        private final int e;
        private final PositionHolder f = new PositionHolder();
        private volatile boolean g;
        private boolean h;

        public final void f()
        {
            g = true;
        }

        public final boolean g()
        {
            return g;
        }

        public final void h()
        {
            int i1 = 0;
_L4:
            if (i1 != 0 || g)
            {
                break; /* Loop/switch isn't completed */
            }
            long l2;
            long l3;
            l3 = f.a;
            l2 = b.a(new DataSpec(a, l3, -1L, null));
            long l1;
            l1 = l2;
            if (l2 != -1L)
            {
                l1 = l2 + l3;
            }
            Object obj = new DefaultExtractorInput(b, l3, l1);
            Object obj1;
            obj1 = c.a(((ExtractorInput) (obj)));
            if (h)
            {
                ((Extractor) (obj1)).b();
                h = false;
            }
_L2:
            if (i1 != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            int j1;
            if (g)
            {
                break; /* Loop/switch isn't completed */
            }
            d.b(e);
            j1 = ((Extractor) (obj1)).a(((ExtractorInput) (obj)), f);
            i1 = j1;
            if (true) goto _L2; else goto _L1
_L1:
            if (i1 == 1)
            {
                i1 = 0;
            } else
            {
                f.a = ((ExtractorInput) (obj)).b();
            }
            b.a();
            if (true) goto _L4; else goto _L3
            obj;
            obj1 = null;
_L6:
            if (i1 != 1 && obj1 != null)
            {
                f.a = ((ExtractorInput) (obj1)).b();
            }
            b.a();
            throw obj;
_L3:
            return;
            Exception exception;
            exception;
            Object obj2 = obj;
            obj = exception;
            exception = ((Exception) (obj2));
            continue; /* Loop/switch isn't completed */
            Exception exception1;
            exception1;
            exception = ((Exception) (obj));
            obj = exception1;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public ExtractingLoadable(Uri uri, DataSource datasource, ExtractorHolder extractorholder, Allocator allocator, int i1, long l1)
        {
            a = (Uri)Assertions.a(uri);
            b = (DataSource)Assertions.a(datasource);
            c = (ExtractorHolder)Assertions.a(extractorholder);
            d = (Allocator)Assertions.a(allocator);
            e = i1;
            f.a = l1;
            h = true;
        }
    }


    private class InternalTrackOutput extends DefaultTrackOutput
    {

        final ExtractorSampleSource a;

        public final void a(long l1, int i1, int j1, int k1, byte abyte0[])
        {
            super.a(l1, i1, j1, k1, abyte0);
            ExtractorSampleSource.a(a);
        }

        public InternalTrackOutput(Allocator allocator)
        {
            a = ExtractorSampleSource.this;
            super(allocator);
        }
    }


    private class UnrecognizedInputFormatException extends ParserException
    {

        public UnrecognizedInputFormatException(Extractor aextractor[])
        {
            super((new StringBuilder("None of the available extractors (")).append(Util.a(aextractor)).append(") could read the stream.").toString());
        }
    }

}
