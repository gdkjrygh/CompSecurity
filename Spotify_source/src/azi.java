// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class azi
{

    public final String a;
    public final int b;
    public final int c;
    public final float d;
    public final List e;
    public int f;
    public int g;
    public MediaFormat h;
    private int i;
    private long j;
    private int k;
    private int l;
    private int m;

    private azi(String s, int i1, long l1, int j1, int k1, float f1, 
            int i2, int j2, List list)
    {
        a = s;
        i = i1;
        j = l1;
        b = j1;
        c = k1;
        d = f1;
        k = i2;
        l = j2;
        s = list;
        if (list == null)
        {
            s = Collections.emptyList();
        }
        e = s;
        f = -1;
        g = -1;
    }

    public static azi a(String s, int i1, int j1)
    {
        return a(s, -1, -1L, i1, j1, null);
    }

    public static azi a(String s, int i1, long l1, int j1, int k1, float f1, List list)
    {
        return new azi(s, i1, l1, j1, k1, f1, -1, -1, list);
    }

    public static azi a(String s, int i1, long l1, int j1, int k1, List list)
    {
        return new azi(s, i1, l1, -1, -1, -1F, j1, k1, list);
    }

    public static azi a(String s, long l1)
    {
        return new azi(s, -1, l1, -1, -1, -1F, -1, -1, null);
    }

    private static final void a(MediaFormat mediaformat, String s, int i1)
    {
        if (i1 != -1)
        {
            mediaformat.setInteger(s, i1);
        }
    }

    public final MediaFormat a()
    {
        if (h == null)
        {
            MediaFormat mediaformat = new MediaFormat();
            mediaformat.setString("mime", a);
            a(mediaformat, "max-input-size", i);
            a(mediaformat, "width", b);
            a(mediaformat, "height", c);
            a(mediaformat, "channel-count", k);
            a(mediaformat, "sample-rate", l);
            float f1 = d;
            if (f1 != -1F)
            {
                mediaformat.setFloat("com.google.android.videos.pixelWidthHeightRatio", f1);
            }
            for (int i1 = 0; i1 < e.size(); i1++)
            {
                mediaformat.setByteBuffer((new StringBuilder("csd-")).append(i1).toString(), ByteBuffer.wrap((byte[])e.get(i1)));
            }

            if (j != -1L)
            {
                mediaformat.setLong("durationUs", j);
            }
            a(mediaformat);
            h = mediaformat;
        }
        return h;
    }

    public final void a(MediaFormat mediaformat)
    {
        a(mediaformat, "max-width", f);
        a(mediaformat, "max-height", g);
    }

    public final boolean a(azi azi1, boolean flag)
    {
        if (i == azi1.i && b == azi1.b && c == azi1.c && d == azi1.d && (flag || f == azi1.f && g == azi1.g) && k == azi1.k && l == azi1.l && bej.a(a, azi1.a) && e.size() == azi1.e.size()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1 = 0;
label0:
        do
        {
label1:
            {
                if (i1 >= e.size())
                {
                    break label1;
                }
                if (!Arrays.equals((byte[])e.get(i1), (byte[])azi1.e.get(i1)))
                {
                    break label0;
                }
                i1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (getClass() == obj.getClass())
                {
                    return a((azi)obj, false);
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int j1 = 0;
        if (m == 0)
        {
            int i1;
            int k1;
            if (a == null)
            {
                i1 = 0;
            } else
            {
                i1 = a.hashCode();
            }
            k1 = (((((((((i1 + 527) * 31 + i) * 31 + b) * 31 + c) * 31 + Float.floatToRawIntBits(d)) * 31 + (int)j) * 31 + f) * 31 + g) * 31 + k) * 31 + l;
            i1 = j1;
            j1 = k1;
            for (; i1 < e.size(); i1++)
            {
                j1 = Arrays.hashCode((byte[])e.get(i1)) + j1 * 31;
            }

            m = j1;
        }
        return m;
    }

    public final String toString()
    {
        return (new StringBuilder("MediaFormat(")).append(a).append(", ").append(i).append(", ").append(b).append(", ").append(c).append(", ").append(d).append(", ").append(k).append(", ").append(l).append(", ").append(j).append(", ").append(f).append(", ").append(g).append(")").toString();
    }
}
