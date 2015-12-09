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
//            c, b

public class com.bumptech.glide.b.a
{
    public static interface a
    {

        public abstract Bitmap a(int i1, int j1, android.graphics.Bitmap.Config config);

        public abstract void a(Bitmap bitmap);
    }


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
    private c m;
    private a n;
    private Bitmap o;
    private boolean p;
    private int q;

    public com.bumptech.glide.b.a(a a1)
    {
        n = a1;
        m = new c();
    }

    private Bitmap a(b b1, b b2)
    {
        int ai[];
        int j1;
        int k1;
        int l1;
        int i2;
        int i3;
        int j3;
        i3 = m.f;
        j3 = m.g;
        ai = j;
        int j2;
        int k2;
        int l2;
        int k3;
        if (b2 != null && b2.g > 0)
        {
            if (b2.g == 2)
            {
                int i1 = 0;
                if (!b1.f)
                {
                    i1 = m.l;
                }
                Arrays.fill(ai, i1);
            } else
            if (b2.g == 3 && o != null)
            {
                o.getPixels(ai, 0, i3, 0, 0, i3, j3);
            }
        }
        a(b1);
        j2 = 1;
        i2 = 8;
        k2 = 0;
        l1 = 0;
        if (l1 >= b1.d) goto _L2; else goto _L1
_L1:
        if (!b1.e)
        {
            break MISSING_BLOCK_LABEL_472;
        }
        j1 = k2;
        k1 = i2;
        l2 = j2;
        if (k2 < b1.d) goto _L4; else goto _L3
_L3:
        l2 = j2 + 1;
        l2;
        JVM INSTR tableswitch 2 4: default 156
    //                   2 356
    //                   3 366
    //                   4 375;
           goto _L5 _L6 _L7 _L8
_L5:
        k1 = i2;
        j1 = k2;
_L4:
        k2 = j1 + k1;
        j2 = l2;
        break MISSING_BLOCK_LABEL_175;
_L6:
        j1 = 4;
        k1 = i2;
        continue; /* Loop/switch isn't completed */
_L7:
        j1 = 2;
        k1 = 4;
        continue; /* Loop/switch isn't completed */
_L8:
        j1 = 1;
        k1 = 2;
        continue; /* Loop/switch isn't completed */
_L10:
        j1 += b1.b;
        if (j1 < m.g)
        {
            k3 = m.f * j1;
            l2 = k3 + b1.a;
            i2 = b1.c + l2;
            j1 = i2;
            if (m.f + k3 < i2)
            {
                j1 = m.f + k3;
            }
            for (i2 = b1.c * l1; l2 < j1; i2++)
            {
                k3 = i[i2];
                k3 = c[k3 & 0xff];
                if (k3 != 0)
                {
                    ai[l2] = k3;
                }
                l2++;
            }

        }
        l1++;
        i2 = k1;
        break MISSING_BLOCK_LABEL_85;
_L2:
        if (p && (b1.g == 0 || b1.g == 1))
        {
            if (o == null)
            {
                o = j();
            }
            o.setPixels(ai, 0, i3, 0, 0, i3, j3);
        }
        b1 = j();
        b1.setPixels(ai, 0, i3, 0, 0, i3, j3);
        return b1;
        j1 = l1;
        k1 = i2;
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L4; else goto _L11
_L11:
    }

    private static void a(Bitmap bitmap)
    {
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            bitmap.setHasAlpha(true);
        }
    }

    private void a(b b1)
    {
        int j1;
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
        int j4;
        int k4;
        int l4;
        int k6;
        int l6;
        if (b1 != null)
        {
            d.position(b1.j);
        }
        if (b1 == null)
        {
            k4 = m.f * m.g;
        } else
        {
            k4 = b1.c * b1.d;
        }
        if (i == null || i.length < k4)
        {
            i = new byte[k4];
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
        k6 = h();
        l6 = 1 << k6;
        l4 = -1;
        k1 = k6 + 1;
        for (int i1 = 0; i1 < l6; i1++)
        {
            f[i1] = 0;
            g[i1] = (byte)i1;
        }

        k3 = 0;
        j4 = 0;
        i3 = 0;
        j2 = 0;
        j3 = 0;
        i2 = k1;
        l2 = (1 << k1) - 1;
        k2 = l6 + 2;
        k1 = 0;
        l1 = 0;
        j1 = 0;
        break MISSING_BLOCK_LABEL_212;
        l3 = 0;
        int i4;
        byte byte0 = e[l3];
        i4 = l3 + 1;
        l3 = k1 - 1;
        l1 = i2;
        int i5 = l2;
        i2 = j2;
        l2 = k3 + ((byte0 & 0xff) << j3);
        k1 = k2;
        k3 = j3 + 8;
        j2 = l4;
        k2 = j1;
        j1 = i5;
        break MISSING_BLOCK_LABEL_333;
_L2:
        if (j4 < k4)
        {
            l3 = k1;
            k1 = l1;
            if (l1 != 0)
            {
                break MISSING_BLOCK_LABEL_267;
            }
            k1 = i();
            if (k1 > 0)
            {
                break MISSING_BLOCK_LABEL_264;
            }
            q = 3;
        }
        int j5;
        int i6;
        for (; j1 < k4; j1++)
        {
            i[j1] = 0;
        }

        return;
        do
        {
            if (k3 < l1)
            {
                break;
            }
            j3 = l2 & j1;
            l2 >>= l1;
            k3 -= l1;
            if (j3 == l6)
            {
                l1 = k6 + 1;
                j1 = (1 << l1) - 1;
                k1 = l6 + 2;
                j2 = -1;
                continue;
            }
            if (j3 > k1)
            {
                q = 3;
                j5 = i2;
                j3 = k3;
                i2 = l1;
                i6 = k1;
                k1 = i4;
                k3 = l2;
                l2 = j1;
                l1 = l3;
                j1 = k2;
                l4 = j2;
                j2 = j5;
                k2 = i6;
                continue; /* Loop/switch isn't completed */
            }
            if (j3 == l6 + 1)
            {
                j5 = i2;
                j3 = k3;
                i2 = l1;
                i6 = k1;
                k1 = i4;
                k3 = l2;
                l2 = j1;
                l1 = l3;
                j1 = k2;
                l4 = j2;
                j2 = j5;
                k2 = i6;
                continue; /* Loop/switch isn't completed */
            }
            if (j2 == -1)
            {
                h[i3] = g[j3];
                i3++;
                i2 = j3;
                j2 = j3;
                continue;
            }
            int k5;
            if (j3 >= k1)
            {
                h[i3] = (byte)i2;
                i3++;
                i2 = j2;
            } else
            {
                i2 = j3;
            }
            while (i2 >= l6) 
            {
                h[i3] = g[i2];
                i2 = f[i2];
                i3++;
            }
            k5 = g[i2] & 0xff;
            b1 = h;
            i6 = i3 + 1;
            b1[i3] = (byte)k5;
            l4 = l1;
            i3 = j1;
            i2 = k1;
            if (k1 < 4096)
            {
                f[k1] = (short)j2;
                g[k1] = (byte)k5;
                k1++;
                l4 = l1;
                i3 = j1;
                i2 = k1;
                if ((k1 & j1) == 0)
                {
                    l4 = l1;
                    i3 = j1;
                    i2 = k1;
                    if (k1 < 4096)
                    {
                        l4 = l1 + 1;
                        i3 = j1 + k1;
                        i2 = k1;
                    }
                }
            }
            k1 = j4;
            for (j1 = i6; j1 > 0;)
            {
                j1--;
                i[k2] = h[j1];
                k1++;
                k2++;
            }

            j4 = k1;
            j2 = j3;
            j3 = j1;
            l1 = l4;
            j1 = i3;
            k1 = i2;
            i3 = j3;
            i2 = k5;
        } while (true);
        int l5 = i2;
        int j6 = j1;
        j1 = l3;
        i2 = l1;
        l3 = k1;
        j3 = k3;
        k1 = i4;
        l1 = j1;
        j1 = k2;
        k3 = l2;
        l4 = j2;
        j2 = l5;
        l2 = j6;
        k2 = l3;
        if (true) goto _L2; else goto _L1
_L1:
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
        a(bitmap);
        return bitmap;
    }

    public int a(int i1)
    {
        byte byte0 = -1;
        int j1 = byte0;
        if (i1 >= 0)
        {
            j1 = byte0;
            if (i1 < m.c)
            {
                j1 = ((b)m.e.get(i1)).i;
            }
        }
        return j1;
    }

    public void a()
    {
        k = (k + 1) % m.c;
    }

    public void a(c c1, byte abyte0[])
    {
        m = c1;
        l = abyte0;
        q = 0;
        k = -1;
        d = ByteBuffer.wrap(abyte0);
        d.rewind();
        d.order(ByteOrder.LITTLE_ENDIAN);
        p = false;
        abyte0 = c1.e.iterator();
        do
        {
            if (!abyte0.hasNext())
            {
                break;
            }
            if (((b)abyte0.next()).g != 3)
            {
                continue;
            }
            p = true;
            break;
        } while (true);
        i = new byte[c1.f * c1.g];
        j = new int[c1.f * c1.g];
    }

    public int b()
    {
        if (m.c <= 0 || k < 0)
        {
            return -1;
        } else
        {
            return a(k);
        }
    }

    public int c()
    {
        return m.c;
    }

    public int d()
    {
        return k;
    }

    public int e()
    {
        return m.m;
    }

    public Bitmap f()
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        if (m.c <= 0 || k < 0)
        {
            if (Log.isLoggable(a, 3))
            {
                Log.d(a, (new StringBuilder()).append("unable to decode frame, frameCount=").append(m.c).append(" framePointer=").append(k).toString());
            }
            q = 1;
        }
        if (q != 1 && q != 2) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable(a, 3))
        {
            Log.d(a, (new StringBuilder()).append("Unable to decode frame, status=").append(q).toString());
        }
        Object obj = null;
_L7:
        this;
        JVM INSTR monitorexit ;
        return ((Bitmap) (obj));
_L2:
        b b1;
        int j1;
        q = 0;
        b1 = (b)m.e.get(k);
        j1 = k - 1;
        if (j1 < 0)
        {
            break MISSING_BLOCK_LABEL_345;
        }
        obj = (b)m.e.get(j1);
_L9:
        if (b1.k != null) goto _L4; else goto _L3
_L3:
        c = m.a;
_L8:
        if (b1.f)
        {
            i1 = c[b1.h];
            c[b1.h] = 0;
        }
        if (c != null) goto _L6; else goto _L5
_L5:
        if (Log.isLoggable(a, 3))
        {
            Log.d(a, "No Valid Color Table");
        }
        q = 1;
        obj = null;
          goto _L7
_L4:
        c = b1.k;
        if (m.j == b1.h)
        {
            m.l = 0;
        }
          goto _L8
        obj;
        throw obj;
_L6:
        obj = a(b1, ((b) (obj)));
        if (b1.f)
        {
            c[b1.h] = i1;
        }
          goto _L7
        obj = null;
          goto _L9
    }

    public void g()
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
