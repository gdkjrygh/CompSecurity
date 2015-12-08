// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class jjh
{

    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final List e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final int n;
    public final String o;
    public final long p;
    MediaFormat q;
    private int r;
    private int s;

    public jjh(int i1, String s1, int j1, int k1, long l1, int i2, 
            int j2, int k2, float f1, int l2, int i3, String s2, long l3, List list, boolean flag, int j3, int k3)
    {
        a = i1;
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException();
        }
        b = s1;
        c = j1;
        r = k1;
        d = l1;
        g = i2;
        h = j2;
        k = k2;
        l = f1;
        m = l2;
        n = i3;
        o = s2;
        p = l3;
        s1 = list;
        if (list == null)
        {
            s1 = Collections.emptyList();
        }
        e = s1;
        f = flag;
        i = j3;
        j = k3;
    }

    public static jjh a(int i1, String s1, int j1, int k1, long l1, int i2, int j2, 
            List list, int k2, float f1)
    {
        return new jjh(i1, s1, j1, k1, l1, i2, j2, k2, f1, -1, -1, null, 0x7fffffffffffffffL, list, false, -1, -1);
    }

    public static jjh a(int i1, String s1, int j1, int k1, long l1, int i2, int j2, 
            List list, String s2)
    {
        return new jjh(i1, s1, -1, k1, l1, -1, -1, -1, -1F, i2, j2, s2, 0x7fffffffffffffffL, list, false, -1, -1);
    }

    public static jjh a(int i1, String s1, int j1, long l1)
    {
        return new jjh(-1, s1, -1, -1, l1, -1, -1, -1, -1F, -1, -1, null, 0x7fffffffffffffffL, null, false, -1, -1);
    }

    public static jjh a(int i1, String s1, int j1, long l1, String s2)
    {
        return a(i1, s1, -1, l1, s2, 0x7fffffffffffffffL);
    }

    public static jjh a(int i1, String s1, int j1, long l1, String s2, long l2)
    {
        return new jjh(i1, s1, j1, -1, l1, -1, -1, -1, -1F, -1, -1, s2, l2, null, false, -1, -1);
    }

    private static final void a(MediaFormat mediaformat, String s1, int i1)
    {
        if (i1 != -1)
        {
            mediaformat.setInteger(s1, i1);
        }
    }

    public final MediaFormat a()
    {
        if (q == null)
        {
            MediaFormat mediaformat = new MediaFormat();
            mediaformat.setString("mime", b);
            String s1 = o;
            if (s1 != null)
            {
                mediaformat.setString("language", s1);
            }
            a(mediaformat, "max-input-size", r);
            a(mediaformat, "width", g);
            a(mediaformat, "height", h);
            a(mediaformat, "rotation-degrees", k);
            a(mediaformat, "max-width", i);
            a(mediaformat, "max-height", j);
            a(mediaformat, "channel-count", m);
            a(mediaformat, "sample-rate", n);
            for (int i1 = 0; i1 < e.size(); i1++)
            {
                mediaformat.setByteBuffer((new StringBuilder(15)).append("csd-").append(i1).toString(), ByteBuffer.wrap((byte[])e.get(i1)));
            }

            if (d != -1L)
            {
                mediaformat.setLong("durationUs", d);
            }
            q = mediaformat;
        }
        return q;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (getClass() == obj.getClass())
            {
                obj = (jjh)obj;
                flag = flag1;
                if (f == ((jjh) (obj)).f)
                {
                    flag = flag1;
                    if (c == ((jjh) (obj)).c)
                    {
                        flag = flag1;
                        if (r == ((jjh) (obj)).r)
                        {
                            flag = flag1;
                            if (g == ((jjh) (obj)).g)
                            {
                                flag = flag1;
                                if (h == ((jjh) (obj)).h)
                                {
                                    flag = flag1;
                                    if (k == ((jjh) (obj)).k)
                                    {
                                        flag = flag1;
                                        if (l == ((jjh) (obj)).l)
                                        {
                                            flag = flag1;
                                            if (i == ((jjh) (obj)).i)
                                            {
                                                flag = flag1;
                                                if (j == ((jjh) (obj)).j)
                                                {
                                                    flag = flag1;
                                                    if (m == ((jjh) (obj)).m)
                                                    {
                                                        flag = flag1;
                                                        if (n == ((jjh) (obj)).n)
                                                        {
                                                            flag = flag1;
                                                            if (a == ((jjh) (obj)).a)
                                                            {
                                                                flag = flag1;
                                                                if (jno.a(o, ((jjh) (obj)).o))
                                                                {
                                                                    flag = flag1;
                                                                    if (jno.a(b, ((jjh) (obj)).b))
                                                                    {
                                                                        flag = flag1;
                                                                        if (e.size() == ((jjh) (obj)).e.size())
                                                                        {
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
                                                                                    flag = flag1;
                                                                                    if (!Arrays.equals((byte[])e.get(i1), (byte[])((jjh) (obj)).e.get(i1)))
                                                                                    {
                                                                                        break label0;
                                                                                    }
                                                                                    i1++;
                                                                                }
                                                                            } while (true);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return true;
    }

    public final int hashCode()
    {
        boolean flag = false;
        if (s == 0)
        {
            int l1 = a;
            int i1;
            int j1;
            int k1;
            int i2;
            int j2;
            int k2;
            int l2;
            int i3;
            int j3;
            int k3;
            int l3;
            int i4;
            int j4;
            int k4;
            if (b == null)
            {
                i1 = 0;
            } else
            {
                i1 = b.hashCode();
            }
            i2 = c;
            j2 = r;
            k2 = g;
            l2 = h;
            i3 = k;
            j3 = Float.floatToRawIntBits(l);
            k3 = (int)d;
            if (f)
            {
                j1 = 1231;
            } else
            {
                j1 = 1237;
            }
            l3 = i;
            i4 = j;
            j4 = m;
            k4 = n;
            if (o == null)
            {
                k1 = 0;
            } else
            {
                k1 = o.hashCode();
            }
            j1 = k1 + (((((j1 + ((((((((i1 + (l1 + 527) * 31) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31;
            for (i1 = ((flag) ? 1 : 0); i1 < e.size(); i1++)
            {
                j1 = Arrays.hashCode((byte[])e.get(i1)) + j1 * 31;
            }

            s = j1;
        }
        return s;
    }

    public final String toString()
    {
        int i1 = a;
        String s1 = b;
        int j1 = c;
        int k1 = r;
        int l1 = g;
        int i2 = h;
        int j2 = k;
        float f1 = l;
        int k2 = m;
        int l2 = n;
        String s2 = o;
        long l3 = d;
        boolean flag = f;
        int i3 = i;
        int j3 = j;
        return (new StringBuilder(String.valueOf(s1).length() + 191 + String.valueOf(s2).length())).append("MediaFormat(").append(i1).append(", ").append(s1).append(", ").append(j1).append(", ").append(k1).append(", ").append(l1).append(", ").append(i2).append(", ").append(j2).append(", ").append(f1).append(", ").append(k2).append(", ").append(l2).append(", ").append(s2).append(", ").append(l3).append(", ").append(flag).append(", ").append(i3).append(", ").append(j3).append(")").toString();
    }
}
