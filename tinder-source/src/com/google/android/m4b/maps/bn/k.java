// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bn;

import android.util.Log;
import com.google.android.m4b.maps.as.d;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bo.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bn:
//            l

public class k
    implements l
{

    protected int a;
    int b[];
    int c;
    int d;
    IntBuffer e;
    int f;
    protected d g;
    private boolean h;

    k()
    {
        a = 0;
    }

    public k(int i)
    {
        this(i, false);
    }

    public k(int i, boolean flag)
    {
        a = 0;
        h = flag;
        c = i;
        e();
    }

    private void e()
    {
        f = 0;
        if (b != null) goto _L2; else goto _L1
_L1:
        int i = c * 3;
        if (i < 1024 || h)
        {
            b = new int[i];
        } else
        {
            g = new d(i);
            b();
        }
_L4:
        d = 0;
        e = null;
        return;
_L2:
        if (g != null)
        {
            g.a();
            b();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int a()
    {
        return d;
    }

    public void a(float f1, float f2, float f3)
    {
        d = d + 1;
        int ai[] = b;
        int i = f;
        f = i + 1;
        ai[i] = (int)(f1 * 65536F);
        ai = b;
        i = f;
        f = i + 1;
        ai[i] = (int)(f2 * 65536F);
        ai = b;
        i = f;
        f = i + 1;
        ai[i] = (int)(f3 * 65536F);
        if (f >= 1024)
        {
            b();
        }
    }

    public final void a(int i)
    {
        if (i > c)
        {
            i = Math.max(i, c * 2);
            int j = i * 3;
            if (g == null)
            {
                if (j < 1024 || h)
                {
                    if (h && ab.a("VertexBuffer", 5))
                    {
                        Log.w("VertexBuffer", "Attempt to grow fixed size buffer");
                    }
                    int ai[] = new int[j];
                    System.arraycopy(b, 0, ai, 0, f);
                    b = ai;
                } else
                {
                    g = new d(j);
                    g.a(b, f);
                    b = (int[])g.c;
                    f = g.d;
                }
            } else
            {
                g.c(j);
            }
            c = i;
        }
    }

    public void a(com.google.android.m4b.maps.bm.d d1)
    {
        b(d1);
        e();
    }

    public void a(g g1, int i)
    {
        d = d + 1;
        int ai[] = b;
        int j = f;
        int i1 = (int)(((long)g1.a << 16) / (long)i);
        int j1 = (int)(((long)g1.b << 16) / (long)i);
        i = (int)(((long)g1.c << 16) / (long)i);
        ai[j] = i1;
        ai[j + 1] = j1;
        ai[j + 2] = i;
        f = f + 3;
        if (f >= 1024)
        {
            b();
        }
    }

    protected final void b()
    {
        if (g != null)
        {
            g.b(f);
            b = (int[])g.c;
            f = g.d;
        }
    }

    public void b(com.google.android.m4b.maps.bm.d d1)
    {
    }

    public final void b(g g1, int i)
    {
        a(g1, i);
    }

    public final int c()
    {
        return a;
    }

    public final void c(com.google.android.m4b.maps.bm.d d1)
    {
        b(d1);
        if (g != null)
        {
            g.c();
            g = null;
        }
        b = null;
    }

    public int d()
    {
        int i = 32;
        if (g == null) goto _L2; else goto _L1
_L1:
        i = g.b() * 4 + 32;
_L4:
        int j = i;
        if (e != null)
        {
            j = i + e.capacity() * 4;
        }
        return j;
_L2:
        if (b != null)
        {
            i = b.length * 4 + 16 + 32;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void d(com.google.android.m4b.maps.bm.d d1)
    {
        this;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e(d1);
        }
        this;
        JVM INSTR monitorexit ;
        a = e.limit() * 4;
        d1.a.glVertexPointer(3, 5132, 0, e);
        return;
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
    }

    protected void e(com.google.android.m4b.maps.bm.d d1)
    {
        int i = d * 3;
        d1 = d1.c.a(i * 4);
        d1.order(ByteOrder.nativeOrder());
        e = d1.asIntBuffer();
        if (g == null)
        {
            e.put(b, 0, i);
        } else
        {
            b();
            g.a(e);
            g.c();
            g = null;
        }
        e.position(0);
        b = null;
    }
}
