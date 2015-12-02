// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.audio.AudioCapabilities;
import com.google.android.exoplayer.chunk.Chunk;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.extractor.ts.AdtsExtractor;
import com.google.android.exoplayer.extractor.ts.TsExtractor;
import com.google.android.exoplayer.upstream.BandwidthMeter;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.UriUtil;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.exoplayer.hls:
//            HlsPlaylist, HlsPlaylistParser, Variant, HlsMediaPlaylist, 
//            HlsMasterPlaylist, TsChunk, HlsExtractorWrapper

public class HlsChunkSource
{

    private final DataSource a;
    private final HlsPlaylistParser b;
    private final BandwidthMeter c;
    private final int d;
    private final String e;
    private final int f;
    private final int g;
    private final long h;
    private final long i;
    private final AudioCapabilities j;
    private final Variant k[];
    private final HlsMediaPlaylist l[];
    private final long m[];
    private final long n[];
    private int o;
    private byte p[];
    private boolean q;
    private long r;
    private Uri s;
    private byte t[];
    private String u;
    private byte v[];

    private HlsChunkSource(DataSource datasource, String s1, HlsPlaylist hlsplaylist, BandwidthMeter bandwidthmeter, int ai[], int i1, long l1, long l2, AudioCapabilities audiocapabilities)
    {
        a = datasource;
        c = bandwidthmeter;
        d = i1;
        j = audiocapabilities;
        h = 1000L * l1;
        i = 1000L * l2;
        e = hlsplaylist.g;
        b = new HlsPlaylistParser();
        if (hlsplaylist.h != 1) goto _L2; else goto _L1
_L1:
        k = (new Variant[] {
            new Variant(0, s1, 0, null, -1, -1)
        });
        l = new HlsMediaPlaylist[1];
        m = new long[1];
        n = new long[1];
        a(0, (HlsMediaPlaylist)hlsplaylist);
        f = -1;
        i1 = -1;
_L4:
        g = i1;
        return;
_L2:
        datasource = ((HlsMasterPlaylist)hlsplaylist).a;
        k = a(datasource, ai);
        l = new HlsMediaPlaylist[k.length];
        m = new long[k.length];
        n = new long[k.length];
        int k1 = -1;
        int j1 = -1;
        int j2 = 0x7fffffff;
        for (int i2 = 0; i2 < k.length;)
        {
            int i3 = datasource.indexOf(k[i2]);
            int k2 = j2;
            if (i3 < j2)
            {
                o = i2;
                k2 = i3;
            }
            s1 = k[i2].b;
            k1 = Math.max(((Format) (s1)).d, k1);
            j1 = Math.max(((Format) (s1)).e, j1);
            i2++;
            j2 = k2;
        }

        if (k.length <= 1 || i1 == 0)
        {
            f = -1;
            i1 = -1;
        } else
        {
            if (k1 <= 0)
            {
                k1 = 1920;
            }
            f = k1;
            i1 = j1;
            if (j1 <= 0)
            {
                i1 = 1080;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public HlsChunkSource(DataSource datasource, String s1, HlsPlaylist hlsplaylist, BandwidthMeter bandwidthmeter, int ai[], int i1, AudioCapabilities audiocapabilities)
    {
        this(datasource, s1, hlsplaylist, bandwidthmeter, ai, i1, 5000L, 20000L, audiocapabilities);
    }

    private int a(long l1)
    {
        boolean flag = false;
        long l2 = l1;
        if (l1 == -1L)
        {
            l2 = 0L;
        }
        int k1 = (int)((float)l2 * 0.8F);
        int i1 = 0;
        int j1 = -1;
        for (; i1 < k.length; i1++)
        {
            if (n[i1] != 0L)
            {
                continue;
            }
            if (k[i1].b.c <= k1)
            {
                return i1;
            }
            j1 = i1;
        }

        if (j1 != -1)
        {
            flag = true;
        }
        Assertions.b(flag);
        return j1;
    }

    private int a(Format format)
    {
        for (int i1 = 0; i1 < k.length; i1++)
        {
            if (k[i1].b.equals(format))
            {
                return i1;
            }
        }

        throw new IllegalStateException((new StringBuilder("Invalid format: ")).append(format).toString());
    }

    private int a(TsChunk tschunk, long l1)
    {
        d();
        long l2 = c.a();
        if (n[o] != 0L)
        {
            return a(l2);
        }
        if (tschunk == null)
        {
            return o;
        }
        if (l2 == -1L)
        {
            return o;
        }
        int i1 = a(l2);
        if (i1 == o)
        {
            return o;
        }
        if (d == 1)
        {
            l2 = tschunk.g;
        } else
        {
            l2 = tschunk.h;
        }
        l1 = l2 - l1;
        if (n[o] != 0L || i1 > o && l1 < i || i1 < o && l1 > h)
        {
            return i1;
        } else
        {
            return o;
        }
    }

    private EncryptionKeyChunk a(Uri uri, String s1, int i1)
    {
        uri = new DataSpec(uri, 0L, -1L, null, 1);
        return new EncryptionKeyChunk(a, uri, p, s1, i1);
    }

    private void a(int i1, HlsMediaPlaylist hlsmediaplaylist)
    {
        m[i1] = SystemClock.elapsedRealtime();
        l[i1] = hlsmediaplaylist;
        q = q | hlsmediaplaylist.e;
        r = hlsmediaplaylist.f;
    }

    private void a(Uri uri, String s1, byte abyte0[])
    {
        Object obj;
        byte abyte1[];
        int i1;
        if (s1.toLowerCase(Locale.getDefault()).startsWith("0x"))
        {
            obj = s1.substring(2);
        } else
        {
            obj = s1;
        }
        obj = (new BigInteger(((String) (obj)), 16)).toByteArray();
        abyte1 = new byte[16];
        if (obj.length > 16)
        {
            i1 = obj.length - 16;
        } else
        {
            i1 = 0;
        }
        System.arraycopy(obj, i1, abyte1, (16 - obj.length) + i1, obj.length - i1);
        s = uri;
        t = abyte0;
        u = s1;
        v = abyte1;
    }

    private boolean a(int i1)
    {
        HlsMediaPlaylist hlsmediaplaylist = l[i1];
        return SystemClock.elapsedRealtime() - m[i1] >= (long)((hlsmediaplaylist.b * 1000) / 2);
    }

    private static boolean a(Variant variant, String s1)
    {
        variant = variant.b.i;
        if (!TextUtils.isEmpty(variant))
        {
            variant = variant.split("(\\s*,\\s*)|(\\s*$)");
            int i1 = 0;
            while (i1 < variant.length) 
            {
                if (variant[i1].startsWith(s1))
                {
                    return true;
                }
                i1++;
            }
        }
        return false;
    }

    private static Variant[] a(List list, int ai[])
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        if (ai != null)
        {
            for (int i1 = 0; i1 < ai.length; i1++)
            {
                arraylist.add(list.get(ai[i1]));
            }

        } else
        {
            arraylist.addAll(list);
        }
        list = new ArrayList();
        ai = new ArrayList();
        int j1 = ((flag) ? 1 : 0);
        while (j1 < arraylist.size()) 
        {
            Variant variant = (Variant)arraylist.get(j1);
            if (variant.b.e > 0 || a(variant, "avc"))
            {
                list.add(variant);
            } else
            if (a(variant, "mp4a"))
            {
                ai.add(variant);
            }
            j1++;
        }
        if (list.isEmpty())
        {
            if (ai.size() < arraylist.size())
            {
                arraylist.removeAll(ai);
            }
            list = arraylist;
        }
        ai = new Variant[list.size()];
        list.toArray(ai);
        Arrays.sort(ai, new _cls1());
        return ai;
    }

    private int b(int i1)
    {
        HlsMediaPlaylist hlsmediaplaylist = l[i1];
        if (hlsmediaplaylist.d.size() > 3)
        {
            i1 = hlsmediaplaylist.d.size() - 3;
        } else
        {
            i1 = 0;
        }
        return i1 + hlsmediaplaylist.a;
    }

    private void b()
    {
        s = null;
        t = null;
        u = null;
        v = null;
    }

    private MediaPlaylistChunk c(int i1)
    {
        Uri uri = UriUtil.a(e, k[i1].a);
        DataSpec dataspec = new DataSpec(uri, 0L, -1L, null, 1);
        return new MediaPlaylistChunk(a, dataspec, p, b, i1, uri.toString());
    }

    private boolean c()
    {
        for (int i1 = 0; i1 < n.length; i1++)
        {
            if (n[i1] == 0L)
            {
                return false;
            }
        }

        return true;
    }

    private void d()
    {
        long l1 = SystemClock.elapsedRealtime();
        for (int i1 = 0; i1 < n.length; i1++)
        {
            if (n[i1] != 0L && l1 - n[i1] > 60000L)
            {
                n[i1] = 0L;
            }
        }

    }

    public final long a()
    {
        if (q)
        {
            return -1L;
        } else
        {
            return r;
        }
    }

    public final Chunk a(TsChunk tschunk, long l1, long l2)
    {
        if (d != 0) goto _L2; else goto _L1
_L1:
        int i1 = o;
_L4:
        int k1;
        boolean flag2;
        flag2 = false;
        k1 = i1;
_L7:
        Object obj1;
        obj1 = l[k1];
        if (obj1 == null)
        {
            return c(k1);
        }
        break MISSING_BLOCK_LABEL_100;
_L2:
        k1 = a(tschunk, l2);
        i1 = k1;
        if (tschunk == null) goto _L4; else goto _L3
_L3:
        i1 = k1;
        if (k[k1].b.equals(tschunk.d)) goto _L4; else goto _L5
_L5:
        i1 = k1;
        if (d != 1) goto _L4; else goto _L6
_L6:
        flag2 = true;
          goto _L7
        o = k1;
        if (!q) goto _L9; else goto _L8
_L8:
        if (tschunk != null) goto _L11; else goto _L10
_L10:
        i1 = b(k1);
_L14:
        int j1;
        boolean flag = false;
        j1 = i1;
        i1 = ((flag) ? 1 : 0);
_L13:
        int i2;
        i2 = j1 - ((HlsMediaPlaylist) (obj1)).a;
        if (i2 >= ((HlsMediaPlaylist) (obj1)).d.size())
        {
            if (((HlsMediaPlaylist) (obj1)).e && a(k1))
            {
                return c(k1);
            } else
            {
                return null;
            }
        }
        break; /* Loop/switch isn't completed */
_L11:
        if (flag2)
        {
            i1 = tschunk.i;
        } else
        {
            i1 = tschunk.i + 1;
        }
        Object obj;
        HlsMediaPlaylist.Segment segment;
        Uri uri;
        boolean flag3;
        if (i1 < ((HlsMediaPlaylist) (obj1)).a)
        {
            j1 = b(k1);
            i1 = 1;
        } else
        {
            boolean flag1 = false;
            j1 = i1;
            i1 = ((flag1) ? 1 : 0);
        }
        if (true) goto _L13; else goto _L12
_L9:
        if (tschunk == null)
        {
            i1 = Util.a(((HlsMediaPlaylist) (obj1)).d, Long.valueOf(l1), true, true) + ((HlsMediaPlaylist) (obj1)).a;
        } else
        if (flag2)
        {
            i1 = tschunk.i;
        } else
        {
            i1 = tschunk.i + 1;
        }
        if (true) goto _L14; else goto _L12
_L12:
        segment = (HlsMediaPlaylist.Segment)((HlsMediaPlaylist) (obj1)).d.get(i2);
        uri = UriUtil.a(((HlsMediaPlaylist) (obj1)).g, segment.c);
        if (segment.e)
        {
            obj = UriUtil.a(((HlsMediaPlaylist) (obj1)).g, segment.f);
            if (!((Uri) (obj)).equals(s))
            {
                return a(((Uri) (obj)), segment.g, o);
            }
            if (!Util.a(segment.g, u))
            {
                a(((Uri) (obj)), segment.g, t);
            }
        } else
        {
            b();
        }
        obj = new DataSpec(uri, segment.h, segment.i, null);
        if (q)
        {
            if (tschunk == null)
            {
                l1 = 0L;
            } else
            if (flag2)
            {
                l1 = tschunk.g;
            } else
            {
                l1 = tschunk.h;
            }
        } else
        {
            l1 = segment.d;
        }
        l2 = (long)(segment.b * 1000000D);
        if (!((HlsMediaPlaylist) (obj1)).e && i2 == ((HlsMediaPlaylist) (obj1)).d.size() - 1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        obj1 = k[o].b;
        if (tschunk == null || segment.a || !((Format) (obj1)).equals(tschunk.d) || i1 != 0)
        {
            if (uri.getLastPathSegment().endsWith(".aac"))
            {
                tschunk = new AdtsExtractor(l1);
            } else
            {
                tschunk = new TsExtractor(l1, j);
            }
            tschunk = new HlsExtractorWrapper(0, ((Format) (obj1)), l1, tschunk, flag2);
        } else
        {
            tschunk = tschunk.a;
        }
        return new TsChunk(a, ((DataSpec) (obj)), 0, ((Format) (obj1)), l1, l1 + l2, j1, flag3, tschunk, t, v);
    }

    public final void a(MediaFormat mediaformat)
    {
        if (f == -1 || g == -1)
        {
            return;
        } else
        {
            mediaformat.a(f, g);
            return;
        }
    }

    public final void a(Chunk chunk)
    {
        if (chunk instanceof MediaPlaylistChunk)
        {
            chunk = (MediaPlaylistChunk)chunk;
            p = chunk.a();
            a(((MediaPlaylistChunk) (chunk)).a, chunk.b());
        } else
        if (chunk instanceof EncryptionKeyChunk)
        {
            chunk = (EncryptionKeyChunk)chunk;
            p = chunk.a();
            a(((EncryptionKeyChunk) (chunk)).e.a, ((EncryptionKeyChunk) (chunk)).a, chunk.b());
            return;
        }
    }

    public final boolean a(Chunk chunk, IOException ioexception)
    {
        int i1;
        int j1;
label0:
        {
            if (chunk.e() == 0L && ((chunk instanceof TsChunk) || (chunk instanceof MediaPlaylistChunk) || (chunk instanceof EncryptionKeyChunk)) && (ioexception instanceof com.google.android.exoplayer.upstream.HttpDataSource.InvalidResponseCodeException))
            {
                j1 = ((com.google.android.exoplayer.upstream.HttpDataSource.InvalidResponseCodeException)ioexception).responseCode;
                if (j1 == 404 || j1 == 410)
                {
                    boolean flag;
                    if (chunk instanceof TsChunk)
                    {
                        i1 = a(((TsChunk)chunk).d);
                    } else
                    if (chunk instanceof MediaPlaylistChunk)
                    {
                        i1 = ((MediaPlaylistChunk)chunk).a;
                    } else
                    {
                        i1 = ((EncryptionKeyChunk)chunk).g;
                    }
                    if (n[i1] != 0L)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    n[i1] = SystemClock.elapsedRealtime();
                    if (!flag)
                    {
                        break label0;
                    }
                    Log.w("HlsChunkSource", (new StringBuilder("Already blacklisted variant (")).append(j1).append("): ").append(chunk.e.a).toString());
                }
            }
            return false;
        }
        if (!c())
        {
            Log.w("HlsChunkSource", (new StringBuilder("Blacklisted variant (")).append(j1).append("): ").append(chunk.e.a).toString());
            return true;
        } else
        {
            Log.w("HlsChunkSource", (new StringBuilder("Final variant not blacklisted (")).append(j1).append("): ").append(chunk.e.a).toString());
            n[i1] = 0L;
            return false;
        }
    }

    private class EncryptionKeyChunk extends DataChunk
    {

        public final String a;
        public final int g;
        private byte h[];

        protected final void a(byte abyte0[], int i1)
        {
            h = Arrays.copyOf(abyte0, i1);
        }

        public final byte[] b()
        {
            return h;
        }

        public EncryptionKeyChunk(DataSource datasource, DataSpec dataspec, byte abyte0[], String s1, int i1)
        {
            super(datasource, dataspec, 3, 0, null, abyte0);
            a = s1;
            g = i1;
        }
    }


    private class _cls1
        implements Comparator
    {

        private final Comparator a = new com.google.android.exoplayer.chunk.Format.DecreasingBandwidthComparator();

        private int a(Variant variant, Variant variant1)
        {
            return a.compare(variant.b, variant1.b);
        }

        public final int compare(Object obj, Object obj1)
        {
            return a((Variant)obj, (Variant)obj1);
        }

        _cls1()
        {
        }
    }


    private class MediaPlaylistChunk extends DataChunk
    {

        public final int a;
        private final HlsPlaylistParser g;
        private final String h;
        private HlsMediaPlaylist i;

        protected final void a(byte abyte0[], int i1)
        {
            i = (HlsMediaPlaylist)HlsPlaylistParser.a(h, new ByteArrayInputStream(abyte0, 0, i1));
        }

        public final HlsMediaPlaylist b()
        {
            return i;
        }

        public MediaPlaylistChunk(DataSource datasource, DataSpec dataspec, byte abyte0[], HlsPlaylistParser hlsplaylistparser, int i1, String s1)
        {
            super(datasource, dataspec, 4, 0, null, abyte0);
            a = i1;
            g = hlsplaylistparser;
            h = s1;
        }
    }

}
