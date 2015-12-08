// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bn;

import android.util.Log;
import com.google.android.m4b.maps.as.e;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bn:
//            d

public class c
    implements com.google.android.m4b.maps.bn.d
{

    protected short a[];
    public int b;
    ShortBuffer c;
    protected int d;
    protected e e;
    private int f;
    private int g;
    private boolean h;

    public c(int i)
    {
        this(i, false);
    }

    public c(int i, boolean flag)
    {
        d = 0;
        h = flag;
        f = i;
        f();
    }

    private void a(short aword0[], int i, int j)
    {
        if (e == null)
        {
            System.arraycopy(aword0, i, a, g, j);
            g = g + j;
        } else
        {
            int k = i + j;
            while (i < k) 
            {
                int l = Math.min(k - i, 2048 - g);
                System.arraycopy(aword0, i, a, g, l);
                i += l;
                g = l + g;
                e();
            }
        }
        b = b + j;
    }

    private void e()
    {
        if (g >= 2048)
        {
            a();
        }
    }

    private void f()
    {
        g = 0;
        if (a != null) goto _L2; else goto _L1
_L1:
        if (f < 2048 || h)
        {
            a = new short[f];
        } else
        {
            e = new e(f);
            a();
        }
_L4:
        b = 0;
        c = null;
        return;
_L2:
        if (e != null)
        {
            e.a();
            a();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void a()
    {
        if (e != null)
        {
            e.b(g);
            a = (short[])e.c;
            g = e.d;
        }
    }

    public final void a(int i, int j, int k)
    {
        short aword0[] = a;
        int l = g;
        g = l + 1;
        aword0[l] = (short)i;
        aword0 = a;
        i = g;
        g = i + 1;
        aword0[i] = (short)j;
        aword0 = a;
        i = g;
        g = i + 1;
        aword0[i] = (short)k;
        b = b + 3;
        if (g >= 2048)
        {
            a();
        }
    }

    public final void a(int i, int j, int k, int l)
    {
        short aword0[] = a;
        int i1 = g;
        g = i1 + 1;
        aword0[i1] = (short)i;
        aword0 = a;
        i = g;
        g = i + 1;
        aword0[i] = (short)j;
        aword0 = a;
        i = g;
        g = i + 1;
        aword0[i] = (short)k;
        aword0 = a;
        i = g;
        g = i + 1;
        aword0[i] = (short)k;
        aword0 = a;
        i = g;
        g = i + 1;
        aword0[i] = (short)j;
        aword0 = a;
        i = g;
        g = i + 1;
        aword0[i] = (short)l;
        b = b + 6;
        if (g >= 2048)
        {
            a();
        }
    }

    public void a(d d1)
    {
        b(d1);
        f();
    }

    public void a(d d1, int i)
    {
        if (c == null)
        {
            d(d1);
        }
        d = c.limit() * 2;
        d1.a.glDrawElements(i, b, 5123, c);
    }

    public final void a(c c1, int i, int j)
    {
        boolean flag2 = true;
        boolean flag;
        boolean flag1;
        if (c1.e == null || c1.b < 2048)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag2;
        if (e != null)
        {
            if (g + j <= 2048)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
        }
        if (flag && flag1)
        {
            System.arraycopy(c1.a, i, a, g, j);
            g = g + j;
            b = b + j;
            if (g >= 2048 && e != null)
            {
                a();
            }
        } else
        {
            if (c1.e == null)
            {
                a(c1.a, i, j);
                return;
            }
            c1.e();
            int l = i & 0x7ff;
            i >>= 11;
            int k = j;
            j = l;
            while (k > 0) 
            {
                int i1 = Math.min(2048 - j, k);
                a((short[])c1.e.a(i), j, i1);
                k -= i1;
                i++;
                j = 0;
            }
        }
    }

    public final void a(short word0, short word1)
    {
        short aword0[] = a;
        int i = g;
        g = i + 1;
        aword0[i] = word0;
        aword0 = a;
        i = g;
        g = i + 1;
        aword0[i] = word1;
        b = b + 2;
        if (g >= 2048)
        {
            a();
        }
    }

    public final void a(short word0, short word1, short word2)
    {
        short aword0[] = a;
        int i = g;
        g = i + 1;
        aword0[i] = word0;
        aword0 = a;
        i = g;
        g = i + 1;
        aword0[i] = word1;
        aword0 = a;
        i = g;
        g = i + 1;
        aword0[i] = word2;
        b = b + 3;
        if (g >= 2048)
        {
            a();
        }
    }

    public final int b()
    {
        return b;
    }

    public final void b(int i)
    {
        if (i > f)
        {
            i = Math.max(i, f * 2);
            if (e == null)
            {
                if (i < 2048 || h)
                {
                    if (h && ab.a("IndexBuffer", 5))
                    {
                        Log.w("IndexBuffer", "Attempt to grow fixed size buffer");
                    }
                    short aword0[] = new short[i];
                    System.arraycopy(a, 0, aword0, 0, g);
                    a = aword0;
                } else
                {
                    e = new e(i);
                    e.a(a, g);
                    a = (short[])e.c;
                    g = e.d;
                }
            } else
            {
                e.c(i);
            }
            f = i;
        }
    }

    public void b(d d1)
    {
    }

    public final int c()
    {
        return d;
    }

    public final void c(d d1)
    {
        b(d1);
        if (e != null)
        {
            e.c();
            e = null;
        }
        a = null;
    }

    public int d()
    {
        int i = 32;
        if (e == null) goto _L2; else goto _L1
_L1:
        i = e.b() * 2 + 32;
_L4:
        int j = i;
        if (c != null)
        {
            j = i + c.capacity() * 2;
        }
        return j;
_L2:
        if (a != null)
        {
            i = a.length * 2 + 16 + 32;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void d(int i)
    {
        short aword0[] = a;
        int j = g;
        g = j + 1;
        aword0[j] = (short)i;
        b = b + 1;
        if (g >= 2048)
        {
            a();
        }
    }

    protected void d(d d1)
    {
        d1 = d1.c.a(b * 2);
        d1.order(ByteOrder.nativeOrder());
        c = d1.asShortBuffer();
        if (e == null)
        {
            c.put(a, 0, b);
        } else
        {
            a();
            e.a(c);
            e.c();
            e = null;
        }
        c.position(0);
        a = null;
    }
}
