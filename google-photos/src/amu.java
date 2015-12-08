// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class amu
{

    private static final String k = amu.getSimpleName();
    public ByteBuffer a;
    public byte b[];
    public byte c[];
    public byte d[];
    public int e[];
    public int f;
    public amx g;
    public amv h;
    public Bitmap i;
    public boolean j;
    private int l[];
    private int m;
    private int n;
    private short o[];
    private byte p[];
    private byte q[];
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;

    private amu(amv amv1)
    {
        m = 0;
        n = 0;
        h = amv1;
        g = new amx();
    }

    public amu(amv amv1, amx amx1, ByteBuffer bytebuffer, int i1)
    {
        this(amv1);
        a(amx1, bytebuffer, i1);
    }

    private Bitmap a(amw amw1, amw amw2)
    {
        int ai[] = e;
        if (amw2 == null || amw2.g <= 0) goto _L2; else goto _L1
_L1:
        if (amw2.g != 2) goto _L4; else goto _L3
_L3:
        int j1 = 0;
        if (amw1.f) goto _L6; else goto _L5
_L5:
        int i1 = g.k;
_L24:
        int j4;
        int k4;
        int l6;
        int j7;
        Arrays.fill(ai, i1);
          goto _L2
_L6:
        i1 = j1;
        if (f == 0)
        {
            j = true;
            i1 = j1;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (amw2.g == 3 && i != null)
        {
            i.getPixels(ai, 0, v, 0, 0, v, u);
        }
_L2:
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int i4;
        m = 0;
        n = 0;
        if (amw1 != null)
        {
            a.position(amw1.j);
        }
        if (amw1 == null)
        {
            j4 = g.f * g.g;
        } else
        {
            j4 = amw1.c * amw1.d;
        }
        if (d == null || d.length < j4)
        {
            d = h.a(j4);
        }
        if (o == null)
        {
            o = new short[4096];
        }
        if (p == null)
        {
            p = new byte[4096];
        }
        if (q == null)
        {
            q = new byte[4097];
        }
        l6 = d();
        j7 = 1 << l6;
        k4 = -1;
        j1 = l6 + 1;
        for (i1 = 0; i1 < j7; i1++)
        {
            o[i1] = 0;
            p[i1] = (byte)i1;
        }

        j3 = 0;
        i4 = 0;
        l2 = 0;
        i2 = 0;
        i3 = 0;
        l1 = j1;
        k2 = (1 << j1) - 1;
        j2 = j7 + 2;
        j1 = 0;
        k1 = 0;
        i1 = 0;
          goto _L7
        k3 = 0;
        int l3;
        byte byte0 = b[k3];
        l3 = k3 + 1;
        k3 = j1 - 1;
        k1 = l1;
        int l4 = k2;
        l1 = i2;
        k2 = j3 + ((byte0 & 0xff) << i3);
        j1 = j2;
        j3 = i3 + 8;
        i2 = k4;
        j2 = i1;
        i1 = l4;
        break MISSING_BLOCK_LABEL_485;
_L7:
        if (i4 < j4)
        {
            k3 = j1;
            j1 = k1;
            if (k1 != 0)
            {
                break MISSING_BLOCK_LABEL_415;
            }
            j1 = e();
            if (j1 > 0)
            {
                break MISSING_BLOCK_LABEL_412;
            }
            s = 3;
        }
        byte abyte0[];
        boolean flag;
        int l5;
        for (; i1 < j4; i1++)
        {
            d[i1] = 0;
        }

        int l7 = amw1.d / t;
        int i8 = amw1.b / t;
        int j8 = amw1.c / t;
        int k8 = amw1.a / t;
        k1 = 1;
        j1 = 8;
        l1 = 0;
        int j9;
        if (f == 0)
        {
            k3 = 1;
        } else
        {
            k3 = 0;
        }
        j2 = 0;
_L20:
        if (j2 >= l7) goto _L9; else goto _L8
_L8:
        if (!amw1.e)
        {
            break MISSING_BLOCK_LABEL_1777;
        }
        i1 = l1;
        i2 = j1;
        k2 = k1;
        if (l1 < l7) goto _L11; else goto _L10
_L10:
        k2 = k1 + 1;
        k2;
        JVM INSTR tableswitch 2 4: default 1036
    //                   2 1350
    //                   3 1360
    //                   4 1369;
           goto _L12 _L13 _L14 _L15
_L12:
        i2 = j1;
        i1 = l1;
_L11:
        l1 = i1 + i2;
        k1 = i2;
        j1 = k2;
_L21:
        i1 += i8;
        if (i1 >= u) goto _L17; else goto _L16
_L16:
        i1 = v * i1;
        i4 = i1 + k8;
        l3 = i4 + j8;
        if (v + i1 < l3)
        {
            l3 = v + i1;
        }
        i1 = t;
        i1 = amw1.c * (i1 * j2);
        l8 = i1 + (l3 - i4) * t;
_L19:
        if (i4 >= l3) goto _L17; else goto _L18
_L13:
        i1 = 4;
        i2 = j1;
          goto _L11
_L14:
        i1 = 2;
        i2 = 4;
          goto _L11
_L15:
        i1 = 1;
        i2 = 2;
          goto _L11
_L18:
        int i9 = amw1.c;
        j3 = 0;
        i3 = 0;
        l2 = 0;
        k2 = 0;
        i2 = 0;
        for (j4 = i1; j4 < t + i1 && j4 < d.length && j4 < l8;)
        {
            k4 = d[j4];
            j9 = l[k4 & 0xff];
            j7 = i2;
            l6 = k2;
            i6 = l2;
            i5 = i3;
            k4 = j3;
            if (j9 != 0)
            {
                k4 = j3 + (j9 >>> 24);
                i5 = i3 + (j9 >> 16 & 0xff);
                i6 = l2 + (j9 >> 8 & 0xff);
                l6 = k2 + (j9 & 0xff);
                j7 = i2 + 1;
            }
            j4++;
            i2 = j7;
            k2 = l6;
            l2 = i6;
            i3 = i5;
            j3 = k4;
        }

        k4 = i1 + i9;
        j4 = j3;
        j3 = i3;
        i3 = l2;
        l2 = k2;
        k2 = i2;
        for (i2 = k4; i2 < i1 + i9 + t && i2 < d.length && i2 < l8;)
        {
            k4 = d[i2];
            int k9 = l[k4 & 0xff];
            int k7 = k2;
            int i7 = l2;
            i6 = i3;
            i5 = j3;
            k4 = j4;
            if (k9 != 0)
            {
                k4 = j4 + (k9 >>> 24);
                i5 = j3 + (k9 >> 16 & 0xff);
                i6 = i3 + (k9 >> 8 & 0xff);
                i7 = l2 + (k9 & 0xff);
                k7 = k2 + 1;
            }
            i2++;
            k2 = k7;
            l2 = i7;
            i3 = i6;
            j3 = i5;
            j4 = k4;
        }

        if (k2 == 0)
        {
            i2 = 0;
        } else
        {
            i2 = j4 / k2 << 24 | j3 / k2 << 16 | i3 / k2 << 8 | l2 / k2;
        }
        if (i2 != 0)
        {
            ai[i4] = i2;
        } else
        if (!j && k3 != 0)
        {
            j = true;
        }
        i1 += t;
        i4++;
          goto _L19
_L17:
        j2++;
        i1 = j1;
        j1 = k1;
        k1 = i1;
          goto _L20
_L9:
        if (r && (amw1.g == 0 || amw1.g == 1))
        {
            if (i == null)
            {
                i = f();
            }
            i.setPixels(ai, 0, v, 0, 0, v, u);
        }
        amw1 = f();
        amw1.setPixels(ai, 0, v, 0, 0, v, u);
        return amw1;
        i2 = k1;
        i1 = j2;
        k1 = j1;
        j1 = i2;
          goto _L21
        do
        {
            if (j3 < k1)
            {
                break MISSING_BLOCK_LABEL_1885;
            }
            i3 = k2 & i1;
            k2 >>= k1;
            j3 -= k1;
            if (i3 == j7)
            {
                k1 = l6 + 1;
                i1 = (1 << k1) - 1;
                j1 = j7 + 2;
                i2 = -1;
                continue;
            }
            if (i3 > j1)
            {
                s = 3;
                flag = l1;
                i3 = j3;
                l1 = k1;
                l5 = j1;
                j1 = l3;
                j3 = k2;
                k2 = i1;
                k1 = k3;
                i1 = j2;
                k4 = i2;
                i2 = ((flag) ? 1 : 0);
                j2 = l5;
                continue; /* Loop/switch isn't completed */
            }
            if (i3 == j7 + 1)
            {
                break;
            }
            if (i2 == -1)
            {
                q[l2] = p[i3];
                l2++;
                l1 = i3;
                i2 = i3;
                continue;
            }
            int i5;
            int i6;
            int l8;
            if (i3 >= j1)
            {
                q[l2] = (byte)l1;
                l2++;
                l1 = i2;
            } else
            {
                l1 = i3;
            }
            while (l1 >= j7) 
            {
                q[l2] = p[l1];
                l1 = o[l1];
                l2++;
            }
            i6 = p[l1] & 0xff;
            q[l2] = (byte)i6;
            i5 = k1;
            k4 = i1;
            l1 = j1;
            if (j1 < 4096)
            {
                o[j1] = (short)i2;
                p[j1] = (byte)i6;
                j1++;
                i5 = k1;
                k4 = i1;
                l1 = j1;
                if ((j1 & i1) == 0)
                {
                    i5 = k1;
                    k4 = i1;
                    l1 = j1;
                    if (j1 < 4096)
                    {
                        i5 = k1 + 1;
                        k4 = i1 + j1;
                        l1 = j1;
                    }
                }
            }
            i1 = i4;
            for (j1 = l2 + 1; j1 > 0;)
            {
                amw2 = d;
                abyte0 = q;
                j1--;
                amw2[j2] = abyte0[j1];
                i1++;
                j2++;
            }

            i2 = i3;
            l2 = j1;
            i4 = i1;
            k1 = i5;
            i1 = k4;
            j1 = l1;
            l1 = i6;
        } while (true);
        int j5 = l1;
        i3 = j3;
        l1 = k1;
        int j6 = j1;
        j1 = l3;
        j3 = k2;
        k2 = i1;
        k1 = k3;
        i1 = j2;
        k4 = i2;
        i2 = j5;
        j2 = j6;
        continue; /* Loop/switch isn't completed */
        int k5 = l1;
        int k6 = i1;
        i1 = k3;
        l1 = k1;
        k3 = j1;
        i3 = j3;
        j1 = l3;
        k1 = i1;
        i1 = j2;
        j3 = k2;
        k4 = i2;
        i2 = k5;
        k2 = k6;
        j2 = k3;
        if (true) goto _L7; else goto _L22
_L22:
        if (true) goto _L24; else goto _L23
_L23:
    }

    private void a(amx amx1, ByteBuffer bytebuffer, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        throw new IllegalArgumentException((new StringBuilder(41)).append("Sample size must be >=0, not: ").append(i1).toString());
        amx1;
        this;
        JVM INSTR monitorexit ;
        throw amx1;
        i1 = Integer.highestOneBit(i1);
        s = 0;
        g = amx1;
        j = false;
        f = -1;
        a = bytebuffer.asReadOnlyBuffer();
        a.position(0);
        a.order(ByteOrder.LITTLE_ENDIAN);
        r = false;
        bytebuffer = amx1.e.iterator();
        do
        {
            if (!bytebuffer.hasNext())
            {
                break;
            }
            if (((amw)bytebuffer.next()).g != 3)
            {
                continue;
            }
            r = true;
            break;
        } while (true);
        t = i1;
        d = h.a(amx1.f * amx1.g);
        e = h.b((amx1.f / i1) * (amx1.g / i1));
        v = amx1.f / i1;
        u = amx1.g / i1;
        this;
        JVM INSTR monitorexit ;
    }

    private void c()
    {
        if (m > n)
        {
            return;
        }
        if (c == null)
        {
            c = h.a(16384);
        }
        n = 0;
        m = Math.min(a.remaining(), 16384);
        a.get(c, 0, m);
    }

    private int d()
    {
        byte abyte0[];
        int i1;
        try
        {
            c();
            abyte0 = c;
            i1 = n;
            n = i1 + 1;
        }
        catch (Exception exception)
        {
            s = 1;
            return 0;
        }
        i1 = abyte0[i1];
        return i1 & 0xff;
    }

    private int e()
    {
        int i1;
        i1 = d();
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        int j1;
        int k1;
        try
        {
            if (b == null)
            {
                b = h.a(255);
            }
            j1 = m - n;
        }
        catch (Exception exception)
        {
            Log.w(k, "Error Reading Block", exception);
            s = 1;
            return i1;
        }
        if (j1 < i1)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        System.arraycopy(c, n, b, 0, i1);
        n = n + i1;
        return i1;
        if (a.remaining() + j1 < i1)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        System.arraycopy(c, n, b, 0, j1);
        n = m;
        c();
        k1 = i1 - j1;
        System.arraycopy(c, 0, b, j1, k1);
        n = n + k1;
        return i1;
        s = 1;
        return i1;
    }

    private Bitmap f()
    {
        Object obj;
        if (j)
        {
            obj = android.graphics.Bitmap.Config.ARGB_8888;
        } else
        {
            obj = android.graphics.Bitmap.Config.RGB_565;
        }
        obj = h.a(v, u, ((android.graphics.Bitmap.Config) (obj)));
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            ((Bitmap) (obj)).setHasAlpha(true);
        }
        return ((Bitmap) (obj));
    }

    public final void a()
    {
        f = (f + 1) % g.c;
    }

    public final Bitmap b()
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        if (g.c <= 0 || f < 0)
        {
            if (Log.isLoggable(k, 3))
            {
                int j1 = g.c;
                int l1 = f;
                (new StringBuilder(71)).append("unable to decode frame, frameCount=").append(j1).append(" framePointer=").append(l1);
            }
            s = 1;
        }
        if (s != 1 && s != 2) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable(k, 3))
        {
            i1 = s;
            (new StringBuilder(42)).append("Unable to decode frame, status=").append(i1);
        }
        Object obj = null;
_L7:
        this;
        JVM INSTR monitorexit ;
        return ((Bitmap) (obj));
_L2:
        amw amw1;
        int k1;
        s = 0;
        amw1 = (amw)g.e.get(f);
        k1 = f - 1;
        if (k1 < 0)
        {
            break MISSING_BLOCK_LABEL_341;
        }
        obj = (amw)g.e.get(k1);
_L9:
        k1 = g.k;
        if (amw1.k != null) goto _L4; else goto _L3
_L3:
        l = g.a;
_L8:
        if (amw1.f)
        {
            i1 = l[amw1.h];
            l[amw1.h] = 0;
        }
        if (l != null) goto _L6; else goto _L5
_L5:
        s = 1;
        obj = null;
          goto _L7
_L4:
        l = amw1.k;
        if (g.j == amw1.h)
        {
            g.k = 0;
        }
          goto _L8
        obj;
        throw obj;
_L6:
        obj = a(amw1, ((amw) (obj)));
        if (amw1.f)
        {
            l[amw1.h] = i1;
        }
        g.k = k1;
          goto _L7
        obj = null;
          goto _L9
    }

}
