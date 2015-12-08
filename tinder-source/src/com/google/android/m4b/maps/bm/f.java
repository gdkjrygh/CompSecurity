// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bm;

import com.google.android.m4b.maps.bn.d;
import com.google.android.m4b.maps.bn.h;
import com.google.android.m4b.maps.bn.l;
import com.google.android.m4b.maps.bo.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public final class f
    implements d, h, l
{

    public float a[];
    public final List b = new ArrayList();
    public List c;
    public List d;
    public List e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final int j = 9;
    public ByteBuffer k;
    private List l;
    private final boolean m = true;
    private final boolean n = false;
    private final boolean o = false;
    private int p;

    public f(int i1)
    {
        a = null;
        f = 0;
        g = 0;
        h = 0;
        i = 0;
        p = 12;
        if (n)
        {
            p = p + 16;
            d = com.google.android.m4b.maps.aa.f.c(i1);
        }
        if (m)
        {
            p = p + 8;
            c = com.google.android.m4b.maps.aa.f.c(i1);
        }
        if (o)
        {
            l = com.google.android.m4b.maps.aa.f.c(i1);
            p = p + 1;
        }
        k = ByteBuffer.allocateDirect(p * i1).order(ByteOrder.nativeOrder());
    }

    public final int a()
    {
        c();
        return g;
    }

    public final void a(float f1, float f2)
    {
        i = i + 1;
        if (!m)
        {
            throw new IllegalStateException("Texture coordinate 0 not enabled in this VBO");
        } else
        {
            c.add(Float.valueOf(f1));
            c.add(Float.valueOf(f2));
            return;
        }
    }

    public final void a(float f1, float f2, float f3)
    {
        b.add(Float.valueOf(f1));
        b.add(Float.valueOf(f2));
        b.add(Float.valueOf(f3));
        g = g + 1;
    }

    public final void a(int i1)
    {
        if (k == null)
        {
            k = ByteBuffer.allocateDirect(p * i1).order(ByteOrder.nativeOrder());
        } else
        if (p * i1 > k.capacity())
        {
            ByteBuffer bytebuffer = ByteBuffer.allocateDirect(p * i1).order(ByteOrder.nativeOrder());
            if (k.position() != 0)
            {
                k.rewind();
                bytebuffer.put(k);
            }
            k = bytebuffer;
            return;
        }
    }

    public final void a(int i1, int j1)
    {
        i = i + 1;
        c.add(Float.valueOf((float)i1 / 65536F));
        c.add(Float.valueOf((float)j1 / 65536F));
    }

    public final void a(int i1, int j1, int k1)
    {
        e.add(Short.valueOf((short)i1));
        e.add(Short.valueOf((short)j1));
        e.add(Short.valueOf((short)k1));
        h = h + 3;
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        e.add(Short.valueOf((short)i1));
        e.add(Short.valueOf((short)j1));
        e.add(Short.valueOf((short)k1));
        e.add(Short.valueOf((short)k1));
        e.add(Short.valueOf((short)j1));
        e.add(Short.valueOf((short)l1));
        h = h + 6;
    }

    public final void a(g g1, int i1)
    {
        b.add(Float.valueOf((float)g1.a / (float)i1));
        b.add(Float.valueOf((float)g1.b / (float)i1));
        b.add(Float.valueOf((float)g1.c / (float)i1));
        if (l != null)
        {
            throw new RuntimeException("Expecting styleIndex");
        } else
        {
            g = g + 1;
            return;
        }
    }

    public final void a(int ai[])
    {
        i = i + ai.length / 2;
        a(ai, 0, ai.length);
    }

    public final void a(int ai[], int i1, int j1)
    {
        i = i + j1 / 2;
        for (int k1 = i1; k1 < i1 + j1; k1++)
        {
            c.add(Float.valueOf((float)ai[k1] / 65536F));
        }

    }

    public final int b()
    {
        return h;
    }

    public final void b(int i1)
    {
    }

    public final void b(g g1, int i1)
    {
        b.add(Float.valueOf((float)g1.a / (float)i1));
        b.add(Float.valueOf((float)g1.b / (float)i1));
        b.add(Float.valueOf((float)g1.c / (float)i1));
        if (l != null)
        {
            l.add(Byte.valueOf((byte)0));
        }
        g = g + 1;
    }

    public final void c()
    {
        if (b.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j1;
        int k1;
        k1 = b.size() / 3;
        if (m && k1 != c.size() / 2)
        {
            int i1 = c.size();
            throw new RuntimeException((new StringBuilder(61)).append("Buffer mismatch verts = ").append(k1).append("  tex coords = ").append(i1).toString());
        }
        if (n && k1 != d.size() / 4)
        {
            throw new RuntimeException("Buffer mismatch");
        }
        if (o && k1 != l.size())
        {
            throw new RuntimeException("Buffer mismatch");
        }
        j1 = 0;
_L4:
        if (j1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        k.putFloat(((Float)b.get(j1 * 3)).floatValue());
        k.putFloat(((Float)b.get(j1 * 3 + 1)).floatValue());
        k.putFloat(((Float)b.get(j1 * 3 + 2)).floatValue());
        if (n)
        {
            k.putFloat(((Float)d.get(j1 * 4)).floatValue());
            k.putFloat(((Float)d.get(j1 * 4 + 1)).floatValue());
            k.putFloat(((Float)d.get(j1 * 4 + 2)).floatValue());
            k.putFloat(((Float)d.get(j1 * 4 + 3)).floatValue());
        }
        if (m)
        {
            k.putFloat(((Float)c.get(j1 * 2)).floatValue());
            k.putFloat(((Float)c.get(j1 * 2 + 1)).floatValue());
        }
        if (o)
        {
            k.put(((Byte)l.get(j1)).byteValue());
        }
        j1++;
        if (true) goto _L4; else goto _L3
        Exception exception;
        exception;
        exception.printStackTrace();
        System.exit(1);
_L3:
        b.clear();
        if (c != null)
        {
            c.clear();
        }
        if (d != null)
        {
            d.clear();
        }
        if (l != null)
        {
            l.clear();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void c(int i1)
    {
    }

    public final ByteBuffer d()
    {
        c();
        ByteBuffer bytebuffer = k;
        bytebuffer.rewind();
        k = null;
        return bytebuffer;
    }

    public final void d(int i1)
    {
        e.add(Short.valueOf((short)i1));
        h = h + 1;
    }

    public final int e()
    {
        return i;
    }
}
