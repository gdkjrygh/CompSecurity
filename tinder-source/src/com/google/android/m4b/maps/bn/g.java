// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bn;

import android.util.Log;
import com.google.android.m4b.maps.as.d;
import com.google.android.m4b.maps.ay.ab;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bn:
//            h

public class g
    implements h
{

    protected int a;
    int b[];
    int c;
    int d;
    Buffer e;
    protected final int f;
    protected final int g;
    protected final int h;
    int i;
    protected d j;
    private boolean k;

    g()
    {
        a = 0;
        f = 5132;
        g = 4;
        h = 1;
    }

    public g(int l)
    {
        this(l, false);
    }

    protected g(int l, byte byte0)
    {
        a = 0;
        k = true;
        c = l;
        g = 2;
        f = 5122;
        h = 1;
        d();
    }

    public g(int l, boolean flag)
    {
        a = 0;
        k = flag;
        c = l;
        f = 5132;
        g = 4;
        h = 1;
        d();
    }

    private void d()
    {
        i = 0;
        if (b != null) goto _L2; else goto _L1
_L1:
        int l = c * 2;
        if (l < 1024 || k)
        {
            b = new int[l];
        } else
        {
            j = new d(l);
            a();
        }
_L4:
        d = 0;
        e = null;
        return;
_L2:
        if (j != null)
        {
            j.a();
            a();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void a()
    {
        if (j != null)
        {
            j.b(i);
            b = (int[])j.c;
            i = j.d;
        }
    }

    public void a(float f1, float f2)
    {
        d = d + 1;
        int ai[] = b;
        int l = i;
        i = l + 1;
        ai[l] = Math.round(f1 * 65536F);
        ai = b;
        l = i;
        i = l + 1;
        ai[l] = Math.round(f2 * 65536F);
        if (i >= 1024)
        {
            a();
        }
    }

    public void a(int l, int i1)
    {
        d = d + 1;
        int ai[] = b;
        int j1 = i;
        i = j1 + 1;
        ai[j1] = l;
        ai = b;
        l = i;
        i = l + 1;
        ai[l] = i1;
        if (i >= 1024)
        {
            a();
        }
    }

    public final void a(int l, int i1, int j1)
    {
        for (int k1 = 0; k1 < j1; k1++)
        {
            int ai[] = b;
            int l1 = i;
            i = l1 + 1;
            ai[l1] = l;
            ai = b;
            l1 = i;
            i = l1 + 1;
            ai[l1] = i1;
            if (i >= 1024)
            {
                a();
            }
        }

        d = d + j1;
    }

    public void a(com.google.android.m4b.maps.bm.d d1)
    {
        b(d1);
        d();
    }

    public void a(com.google.android.m4b.maps.bm.d d1, int l)
    {
        if (e == null)
        {
            e(d1);
        }
        e.position(l * 2);
        a = (e.limit() - l) * g;
        d1.a.glTexCoordPointer(2, f, 0, e);
    }

    protected final void a(ByteBuffer bytebuffer, int l)
    {
        for (int i1 = 0; i1 < l; i1++)
        {
            bytebuffer.put((byte)(b[i1] / h));
        }

    }

    protected final void a(ShortBuffer shortbuffer, int l)
    {
        for (int i1 = 0; i1 < l; i1++)
        {
            shortbuffer.put((short)(b[i1] / h));
        }

    }

    public final void a(int ai[])
    {
        a(ai, 0, ai.length);
    }

    public void a(int ai[], int l, int i1)
    {
        if (j == null || i + i1 < 1024)
        {
            System.arraycopy(ai, l, b, i, i1);
            i = i + i1;
        } else
        {
            int j1 = l + i1;
            while (l < j1) 
            {
                int k1 = Math.min(j1 - l, 1024 - i);
                System.arraycopy(ai, l, b, i, k1);
                l += k1;
                i = k1 + i;
                a();
            }
        }
        d = d + i1 / 2;
    }

    public final int b()
    {
        return a;
    }

    public void b(com.google.android.m4b.maps.bm.d d1)
    {
    }

    public int c()
    {
        int l = 44;
        if (j == null) goto _L2; else goto _L1
_L1:
        l = j.b() * 4 + 44;
_L4:
        int i1 = l;
        if (e != null)
        {
            i1 = l + e.capacity() * g;
        }
        return i1;
_L2:
        if (b != null)
        {
            l = b.length * 4 + 16 + 44;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void c(int l)
    {
        if (l > c)
        {
            l = Math.max(l, c * 2);
            int i1 = l * 2;
            if (j == null)
            {
                if (i1 < 1024 || k)
                {
                    if (k && ab.a("TexCoordBuffer", 5))
                    {
                        Log.w("TexCoordBuffer", "Attempt to grow fixed size buffer");
                    }
                    int ai[] = new int[i1];
                    System.arraycopy(b, 0, ai, 0, i);
                    b = ai;
                } else
                {
                    j = new d(i1);
                    j.a(b, i);
                    b = (int[])j.c;
                    i = j.d;
                }
            } else
            {
                j.c(i1);
            }
            c = l;
        }
    }

    public final void c(com.google.android.m4b.maps.bm.d d1)
    {
        b(d1);
        if (j != null)
        {
            j.c();
            j = null;
        }
        b = null;
    }

    public void d(com.google.android.m4b.maps.bm.d d1)
    {
        if (e == null)
        {
            e(d1);
        }
        e.position(0);
        a = e.limit() * g;
        d1.a.glTexCoordPointer(2, f, 0, e);
    }

    public final int e()
    {
        return d;
    }

    protected void e(com.google.android.m4b.maps.bm.d d1)
    {
        int l = d * 2;
        d1 = d1.c.a(g * l);
        d1.order(ByteOrder.nativeOrder());
        if (f == 5122)
        {
            e = d1.asShortBuffer();
            if (j == null)
            {
                a((ShortBuffer)e, l);
            } else
            {
                a();
                j.a((ShortBuffer)e, h);
            }
        } else
        if (f == 5120 || f == 5121)
        {
            e = d1;
            if (j == null)
            {
                a((ByteBuffer)e, l);
            } else
            {
                a();
                j.a((ByteBuffer)e, h);
            }
        } else
        {
            e = d1.asIntBuffer();
            if (j == null)
            {
                ((IntBuffer)e).put(b, 0, l);
            } else
            {
                a();
                j.a((IntBuffer)e);
            }
        }
        if (j != null)
        {
            j.c();
            j = null;
        }
        b = null;
    }
}
