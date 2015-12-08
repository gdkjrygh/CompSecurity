// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class cka
{

    public final long a;
    public final cjx b;
    public final MediaFormat c;
    public final int d;

    cka(long l, cjx cjx1, MediaFormat mediaformat, int i)
    {
        a = b.a(l, "timeUnitsPerSecond");
        b = (cjx)b.a(cjx1, "stblAtom", null);
        c = (MediaFormat)b.a(mediaformat, "mediaFormat", null);
        d = i;
    }

    static MediaFormat a(ckd ckd1)
    {
        ckd1.a(4);
        int j1 = ckd1.c();
        int i = 0;
        Object obj = null;
        while (i < j1) 
        {
            int k1 = ckd1.b;
            int l1 = b.a(ckd1.c(), "childAtomSize");
            int j = ckd1.c();
            if (j == cjw.m)
            {
                ckd1.a(k1 + 8);
                ckd1.b(24);
                int i2 = ckd1.b();
                int j2 = ckd1.b();
                ckd1.b(50);
                j = ckd1.b;
                obj = null;
                int k2;
                for (; j - k1 < l1; j += k2)
                {
                    ckd1.a(j);
                    int k = ckd1.b;
                    k2 = b.a(ckd1.c(), "childAtomSize");
                    if (ckd1.c() != cjw.n)
                    {
                        continue;
                    }
                    ckd1.a(k + 12);
                    if ((ckd1.a() & 3) + 1 != 4)
                    {
                        throw b.a("Unexpected NAL unit length.");
                    }
                    obj = new ArrayList();
                    int l2 = ckd1.a();
                    for (int l = 0; l < (l2 & 0x1f); l++)
                    {
                        ((List) (obj)).add(c(ckd1));
                    }

                    l2 = ckd1.a();
                    for (int i1 = 0; i1 < l2; i1++)
                    {
                        ((List) (obj)).add(c(ckd1));
                    }

                    obj = (byte[][])((List) (obj)).toArray(new byte[0][]);
                }

                obj = c.a("video/avc", i2, j2, ((byte [][]) (obj)));
            } else
            if (j == cjw.p)
            {
                obj = b(ckd1, k1, l1);
            } else
            if (j == cjw.o)
            {
                obj = a(ckd1, k1, l1);
            }
            ckd1.a(k1 + l1);
            i++;
        }
        return ((MediaFormat) (obj));
    }

    private static MediaFormat a(ckd ckd1, int i, int j)
    {
        ckd1.a(i + 8);
        ckd1.b(24);
        int l = ckd1.b();
        int i1 = ckd1.b();
        ckd1.b(50);
        int k = ckd1.b;
        byte abyte0[] = null;
        int k1;
        for (; k - i < j; k += k1)
        {
            ckd1.a(k);
            int j1 = ckd1.b;
            k1 = b.a(ckd1.c(), "childAtomSize");
            if (ckd1.c() == cjw.q)
            {
                abyte0 = a(ckd1, j1);
            }
        }

        return c.a("video/mp4v-es", l, i1, new byte[][] {
            abyte0
        });
    }

    private static byte[] a(ckd ckd1, int i)
    {
        ckd1.a(i + 12);
        ckd1.b(1);
        for (i = ckd1.a(); i > 127; i = ckd1.a()) { }
        ckd1.b(2);
        i = ckd1.a();
        if ((i & 0x80) != 0)
        {
            ckd1.b(2);
        }
        if ((i & 0x40) != 0)
        {
            ckd1.b(ckd1.b());
        }
        if ((i & 0x20) != 0)
        {
            ckd1.b(2);
        }
        ckd1.b(1);
        for (i = ckd1.a(); i > 127; i = ckd1.a()) { }
        ckd1.b(13);
        ckd1.b(1);
        int j = ckd1.a();
        for (i = j & 0x7f; j > 127; i = i << 8 | j & 0x7f)
        {
            j = ckd1.a();
        }

        byte abyte0[] = new byte[i];
        System.arraycopy(ckd1.a, ckd1.b, abyte0, 0, i);
        ckd1.b(i);
        return abyte0;
    }

    static int b(ckd ckd1)
    {
        int i = ckd1.c();
        int j = ckd1.c();
        ckd1.b(28);
        double d1 = ckc.a(i);
        double d2 = ckc.a(j);
        if (d1 > 0.5D)
        {
            return 0;
        }
        if (d2 > 0.5D)
        {
            return 90;
        }
        if (d1 < -0.5D)
        {
            return 180;
        }
        return d2 >= -0.5D ? -1 : 270;
    }

    private static MediaFormat b(ckd ckd1, int i, int j)
    {
        ckd1.a(i + 8);
        ckd1.b(16);
        int l = ckd1.b();
        ckd1.b();
        ckd1.b(4);
        int i1 = ckd.a(ckd1.a, ckd1.b, 2);
        ckd1.b(4);
        int k = ckd1.b;
        byte abyte0[] = null;
        int j1;
        for (; k - i < j; k += j1)
        {
            ckd1.a(k);
            int k1 = ckd1.b;
            j1 = b.a(ckd1.c(), "childAtomSize");
            if (ckd1.c() == cjw.q)
            {
                abyte0 = a(ckd1, k1);
                Pair pair = cjr.a(abyte0);
                i1 = ((Integer)pair.first).intValue();
                l = ((Integer)pair.second).intValue();
            }
        }

        ckd1 = Collections.singletonList(abyte0);
        b.a("audio/mp4a-latm".startsWith("audio/"), "mimeType");
        b.a(ckd1, "initializationData", null);
        MediaFormat mediaformat = new MediaFormat();
        mediaformat.setString("mime", "audio/mp4a-latm");
        mediaformat.setInteger("channel-count", b.a(l, "channelCount"));
        mediaformat.setInteger("sample-rate", b.a(i1, "sampleRate"));
        for (i = 0; i < ckd1.size(); i++)
        {
            mediaformat.setByteBuffer((new StringBuilder(15)).append("csd-").append(i).toString(), ByteBuffer.wrap((byte[])ckd1.get(i)));
        }

        return mediaformat;
    }

    private static byte[] c(ckd ckd1)
    {
        int i = ckd1.b();
        int j = ckd1.b;
        ckd1.b(i);
        return cjr.a(ckd1.a, j, i);
    }
}
