// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import com.google.android.exoplayer.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class MediaFormat
{

    public final String a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;
    public final float f;
    public final int g;
    public final int h;
    public final List i;
    private int j;
    private int k;
    private int l;
    private android.media.MediaFormat m;

    private MediaFormat(String s, int i1, long l1, int j1, int k1, float f1, 
            int i2, int j2, List list)
    {
        a = s;
        b = i1;
        c = l1;
        d = j1;
        e = k1;
        f = f1;
        g = i2;
        h = j2;
        s = list;
        if (list == null)
        {
            s = Collections.emptyList();
        }
        i = s;
        j = -1;
        k = -1;
    }

    public static MediaFormat a(String s)
    {
        return a(s, -1L);
    }

    public static MediaFormat a(String s, int i1, int j1, int k1, List list)
    {
        return a(s, i1, -1L, j1, k1, list);
    }

    public static MediaFormat a(String s, int i1, long l1, int j1, int k1, float f1, List list)
    {
        return new MediaFormat(s, i1, l1, j1, k1, f1, -1, -1, list);
    }

    public static MediaFormat a(String s, int i1, long l1, int j1, int k1, List list)
    {
        return a(s, i1, l1, j1, k1, 1.0F, list);
    }

    public static MediaFormat a(String s, long l1)
    {
        return b(s, l1);
    }

    private final void a(android.media.MediaFormat mediaformat)
    {
        a(mediaformat, "max-width", j);
        a(mediaformat, "max-height", k);
    }

    private static final void a(android.media.MediaFormat mediaformat, String s, float f1)
    {
        if (f1 != -1F)
        {
            mediaformat.setFloat(s, f1);
        }
    }

    private static final void a(android.media.MediaFormat mediaformat, String s, int i1)
    {
        if (i1 != -1)
        {
            mediaformat.setInteger(s, i1);
        }
    }

    public static MediaFormat b(String s, int i1, int j1, int k1, List list)
    {
        return b(s, i1, -1L, j1, k1, list);
    }

    public static MediaFormat b(String s, int i1, long l1, int j1, int k1, List list)
    {
        return new MediaFormat(s, i1, l1, -1, -1, -1F, j1, k1, list);
    }

    private static MediaFormat b(String s, long l1)
    {
        return new MediaFormat(s, -1, l1, -1, -1, -1F, -1, -1, null);
    }

    private boolean b(MediaFormat mediaformat, boolean flag)
    {
        if (b == mediaformat.b && d == mediaformat.d && e == mediaformat.e && f == mediaformat.f && (flag || j == mediaformat.j && k == mediaformat.k) && g == mediaformat.g && h == mediaformat.h && Util.a(a, mediaformat.a) && i.size() == mediaformat.i.size()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1 = 0;
label0:
        do
        {
label1:
            {
                if (i1 >= i.size())
                {
                    break label1;
                }
                if (!Arrays.equals((byte[])i.get(i1), (byte[])mediaformat.i.get(i1)))
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

    public final android.media.MediaFormat a()
    {
        if (m == null)
        {
            android.media.MediaFormat mediaformat = new android.media.MediaFormat();
            mediaformat.setString("mime", a);
            a(mediaformat, "max-input-size", b);
            a(mediaformat, "width", d);
            a(mediaformat, "height", e);
            a(mediaformat, "channel-count", g);
            a(mediaformat, "sample-rate", h);
            a(mediaformat, "com.google.android.videos.pixelWidthHeightRatio", f);
            for (int i1 = 0; i1 < i.size(); i1++)
            {
                mediaformat.setByteBuffer((new StringBuilder("csd-")).append(i1).toString(), ByteBuffer.wrap((byte[])i.get(i1)));
            }

            if (c != -1L)
            {
                mediaformat.setLong("durationUs", c);
            }
            a(mediaformat);
            m = mediaformat;
        }
        return m;
    }

    public final void a(int i1, int j1)
    {
        j = i1;
        k = j1;
        if (m != null)
        {
            a(m);
        }
    }

    public final boolean a(MediaFormat mediaformat, boolean flag)
    {
        if (this == mediaformat)
        {
            return true;
        }
        if (mediaformat == null)
        {
            return false;
        } else
        {
            return b(mediaformat, flag);
        }
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
                    return b((MediaFormat)obj, false);
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int j1 = 0;
        if (l == 0)
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
            k1 = (((((((((i1 + 527) * 31 + b) * 31 + d) * 31 + e) * 31 + Float.floatToRawIntBits(f)) * 31 + (int)c) * 31 + j) * 31 + k) * 31 + g) * 31 + h;
            i1 = j1;
            j1 = k1;
            for (; i1 < i.size(); i1++)
            {
                j1 = Arrays.hashCode((byte[])i.get(i1)) + j1 * 31;
            }

            l = j1;
        }
        return l;
    }

    public final String toString()
    {
        return (new StringBuilder("MediaFormat(")).append(a).append(", ").append(b).append(", ").append(d).append(", ").append(e).append(", ").append(f).append(", ").append(g).append(", ").append(h).append(", ").append(c).append(", ").append(j).append(", ").append(k).append(")").toString();
    }
}
