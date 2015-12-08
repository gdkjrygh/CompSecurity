// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.b;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.bumptech.glide.b:
//            d, c, b

public class a
{

    private static final String a = com/bumptech/glide/b/a.getSimpleName();
    private static final android.graphics.Bitmap.Config b;
    private int c[];
    private ByteBuffer d;
    private final byte e[] = new byte[256];
    private short f[];
    private byte g[];
    private byte h[];
    private byte i[];
    private int j[];
    private int k;
    private byte l[];
    private d m;
    private b n;
    private Bitmap o;
    private boolean p;
    private int q;

    public a(b b1)
    {
        n = b1;
        m = new d();
    }

    private Bitmap a(c c1, c c2)
    {
        int ai[];
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int k4;
        int l4;
        int i5;
        int i7;
        int j7;
        int k7;
        int l7;
        i7 = m.f;
        j7 = m.g;
        ai = j;
        if (c2 != null && c2.g > 0)
        {
            if (c2.g == 2)
            {
                int i1 = 0;
                if (!c1.f)
                {
                    i1 = m.l;
                }
                Arrays.fill(ai, i1);
            } else
            if (c2.g == 3 && o != null)
            {
                o.getPixels(ai, 0, i7, 0, 0, i7, j7);
            }
        }
        if (c1 != null)
        {
            d.position(c1.j);
        }
        if (c1 == null)
        {
            l4 = m.f * m.g;
        } else
        {
            l4 = c1.c * c1.d;
        }
        if (i == null || i.length < l4)
        {
            i = new byte[l4];
        }
        if (f == null)
        {
            f = new short[4096];
        }
        if (g == null)
        {
            g = new byte[4096];
        }
        if (h == null)
        {
            h = new byte[4097];
        }
        k7 = h();
        l7 = 1 << k7;
        i5 = -1;
        l1 = k7 + 1;
        for (int j1 = 0; j1 < l7; j1++)
        {
            f[j1] = 0;
            g[j1] = (byte)j1;
        }

        l3 = 0;
        k4 = 0;
        j3 = 0;
        k2 = 0;
        k3 = 0;
        j2 = l1;
        i3 = (1 << l1) - 1;
        l2 = l7 + 2;
        l1 = 0;
        i2 = 0;
        k1 = 0;
_L18:
        if (k4 >= l4) goto _L2; else goto _L1
_L1:
        int i4;
        i4 = l1;
        l1 = i2;
        if (i2 != 0) goto _L4; else goto _L3
_L3:
        l1 = i();
        if (l1 > 0) goto _L6; else goto _L5
_L5:
        q = 3;
_L2:
        int j4;
        int j5;
        int j6;
        for (; k1 < l4; k1++)
        {
            i[k1] = 0;
        }

        k2 = 1;
        j2 = 8;
        l2 = 0;
        i2 = 0;
          goto _L7
_L6:
        i4 = 0;
_L4:
        j6 = e[i4];
        j4 = i4 + 1;
        i4 = l1 - 1;
        i2 = j2;
        j5 = i3;
        j2 = k2;
        i3 = l3 + ((j6 & 0xff) << k3);
        l1 = l2;
        l3 = k3 + 8;
        k2 = i5;
        l2 = k1;
        k1 = j5;
        break MISSING_BLOCK_LABEL_459;
_L7:
        if (i2 >= c1.d) goto _L9; else goto _L8
_L8:
        if (!c1.e)
        {
            break MISSING_BLOCK_LABEL_1241;
        }
        k1 = l2;
        l1 = j2;
        i3 = k2;
        if (l2 < c1.d) goto _L11; else goto _L10
_L10:
        i3 = k2 + 1;
        i3;
        JVM INSTR tableswitch 2 4: default 960
    //                   2 1125
    //                   3 1135
    //                   4 1144;
           goto _L12 _L13 _L14 _L15
_L12:
        l1 = j2;
        k1 = l2;
_L11:
        l2 = k1 + l1;
        k2 = i3;
          goto _L16
_L13:
        k1 = 4;
        l1 = j2;
          goto _L11
_L14:
        k1 = 2;
        l1 = 4;
          goto _L11
_L15:
        k1 = 1;
        l1 = 2;
          goto _L11
_L16:
        k1 += c1.b;
        if (k1 < m.g)
        {
            j3 = k1 * m.f;
            i3 = j3 + c1.a;
            j2 = c1.c + i3;
            k1 = j2;
            if (m.f + j3 < j2)
            {
                k1 = m.f + j3;
            }
            for (j2 = c1.c * i2; i3 < k1; j2++)
            {
                j3 = i[j2];
                j3 = c[j3 & 0xff];
                if (j3 != 0)
                {
                    ai[i3] = j3;
                }
                i3++;
            }

        }
        i2++;
        j2 = l1;
          goto _L7
_L9:
        if (p && (c1.g == 0 || c1.g == 1))
        {
            if (o == null)
            {
                o = j();
            }
            o.setPixels(ai, 0, i7, 0, 0, i7, j7);
        }
        c1 = j();
        c1.setPixels(ai, 0, i7, 0, 0, i7, j7);
        return c1;
        k1 = i2;
        l1 = j2;
          goto _L16
        do
        {
            if (l3 < i2)
            {
                break MISSING_BLOCK_LABEL_1345;
            }
            k3 = i3 & k1;
            i3 >>= i2;
            l3 -= i2;
            if (k3 == l7)
            {
                i2 = k7 + 1;
                k1 = (1 << i2) - 1;
                l1 = l7 + 2;
                k2 = -1;
                continue;
            }
            if (k3 > l1)
            {
                q = 3;
                j5 = j2;
                k3 = l3;
                j2 = i2;
                j6 = l1;
                l1 = j4;
                l3 = i3;
                i3 = k1;
                i2 = i4;
                k1 = l2;
                i5 = k2;
                k2 = j5;
                l2 = j6;
                continue; /* Loop/switch isn't completed */
            }
            if (k3 == l7 + 1)
            {
                break;
            }
            if (k2 == -1)
            {
                h[j3] = g[k3];
                j3++;
                j2 = k3;
                k2 = k3;
                continue;
            }
            int k5;
            if (k3 >= l1)
            {
                h[j3] = (byte)j2;
                j3++;
                j2 = k2;
            } else
            {
                j2 = k3;
            }
            while (j2 >= l7) 
            {
                h[j3] = g[j2];
                j2 = f[j2];
                j3++;
            }
            k5 = g[j2] & 0xff;
            c2 = h;
            j6 = j3 + 1;
            c2[j3] = (byte)k5;
            i5 = i2;
            j3 = k1;
            j2 = l1;
            if (l1 < 4096)
            {
                f[l1] = (short)k2;
                g[l1] = (byte)k5;
                l1++;
                i5 = i2;
                j3 = k1;
                j2 = l1;
                if ((l1 & k1) == 0)
                {
                    i5 = i2;
                    j3 = k1;
                    j2 = l1;
                    if (l1 < 4096)
                    {
                        i5 = i2 + 1;
                        j3 = k1 + l1;
                        j2 = l1;
                    }
                }
            }
            l1 = k4;
            for (k1 = j6; k1 > 0;)
            {
                k1--;
                i[l2] = h[k1];
                l1++;
                l2++;
            }

            k4 = l1;
            k2 = k3;
            k3 = k1;
            i2 = i5;
            k1 = j3;
            l1 = j2;
            j3 = k3;
            j2 = k5;
        } while (true);
        int l5 = j2;
        k3 = l3;
        j2 = i2;
        int k6 = l1;
        l1 = j4;
        l3 = i3;
        i3 = k1;
        i2 = i4;
        k1 = l2;
        i5 = k2;
        k2 = l5;
        l2 = k6;
        continue; /* Loop/switch isn't completed */
        int i6 = j2;
        int l6 = k1;
        k1 = i4;
        j2 = i2;
        i4 = l1;
        k3 = l3;
        l1 = j4;
        i2 = k1;
        k1 = l2;
        l3 = i3;
        i5 = k2;
        k2 = i6;
        i3 = l6;
        l2 = i4;
        if (true) goto _L18; else goto _L17
_L17:
    }

    private int h()
    {
        byte byte0;
        try
        {
            byte0 = d.get();
        }
        catch (Exception exception)
        {
            q = 1;
            return 0;
        }
        return byte0 & 0xff;
    }

    private int i()
    {
        int i1;
        int j1;
        int k1;
        k1 = h();
        j1 = 0;
        i1 = 0;
        if (k1 <= 0) goto _L2; else goto _L1
_L1:
        j1 = i1;
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = k1 - i1;
        d.get(e, i1, j1);
        i1 += j1;
        if (true) goto _L1; else goto _L2
        Exception exception;
        exception;
        Log.w(a, "Error Reading Block", exception);
        q = 1;
        j1 = i1;
_L2:
        return j1;
    }

    private Bitmap j()
    {
        Bitmap bitmap1 = n.a(m.f, m.g, b);
        Bitmap bitmap = bitmap1;
        if (bitmap1 == null)
        {
            bitmap = Bitmap.createBitmap(m.f, m.g, b);
        }
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            bitmap.setHasAlpha(true);
        }
        return bitmap;
    }

    public final int a(int i1)
    {
        byte byte0 = -1;
        int j1 = byte0;
        if (i1 >= 0)
        {
            j1 = byte0;
            if (i1 < m.c)
            {
                j1 = ((c)m.e.get(i1)).i;
            }
        }
        return j1;
    }

    public final void a()
    {
        k = (k + 1) % m.c;
    }

    public final void a(d d1, byte abyte0[])
    {
        m = d1;
        l = abyte0;
        q = 0;
        k = -1;
        d = ByteBuffer.wrap(abyte0);
        d.rewind();
        d.order(ByteOrder.LITTLE_ENDIAN);
        p = false;
        abyte0 = d1.e.iterator();
        do
        {
            if (!abyte0.hasNext())
            {
                break;
            }
            if (((c)abyte0.next()).g != 3)
            {
                continue;
            }
            p = true;
            break;
        } while (true);
        i = new byte[d1.f * d1.g];
        j = new int[d1.f * d1.g];
    }

    public final int b()
    {
        if (m.c <= 0 || k < 0)
        {
            return -1;
        } else
        {
            return a(k);
        }
    }

    public final int c()
    {
        return m.c;
    }

    public final int d()
    {
        return k;
    }

    public final int e()
    {
        return m.m;
    }

    public final Bitmap f()
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        if (m.c <= 0 || k < 0)
        {
            if (Log.isLoggable(a, 3))
            {
                (new StringBuilder("unable to decode frame, frameCount=")).append(m.c).append(" framePointer=").append(k);
            }
            q = 1;
        }
        if (q != 1 && q != 2) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable(a, 3))
        {
            (new StringBuilder("Unable to decode frame, status=")).append(q);
        }
        Object obj = null;
_L7:
        this;
        JVM INSTR monitorexit ;
        return ((Bitmap) (obj));
_L2:
        c c1;
        int j1;
        q = 0;
        c1 = (c)m.e.get(k);
        j1 = k - 1;
        if (j1 < 0)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        obj = (c)m.e.get(j1);
_L9:
        if (c1.k != null) goto _L4; else goto _L3
_L3:
        c = m.a;
_L8:
        if (c1.f)
        {
            i1 = c[c1.h];
            c[c1.h] = 0;
        }
        if (c != null) goto _L6; else goto _L5
_L5:
        Log.isLoggable(a, 3);
        q = 1;
        obj = null;
          goto _L7
_L4:
        c = c1.k;
        if (m.j == c1.h)
        {
            m.l = 0;
        }
          goto _L8
        obj;
        throw obj;
_L6:
        obj = a(c1, ((c) (obj)));
        if (c1.f)
        {
            c[c1.h] = i1;
        }
          goto _L7
        obj = null;
          goto _L9
    }

    public final void g()
    {
        m = null;
        l = null;
        i = null;
        j = null;
        if (o != null)
        {
            n.a(o);
        }
        o = null;
    }

    static 
    {
        b = android.graphics.Bitmap.Config.ARGB_8888;
    }
}
