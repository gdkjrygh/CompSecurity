// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.graphics.Canvas;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            l, ab, aa, ah, 
//            z

public class h
{

    public boolean a;
    private ab b;
    private int c;
    private int d;
    private long e;
    private boolean f;
    private float g;
    private float h;
    private float i;
    private float j;

    public h(ab ab1)
    {
        a = false;
        b = ab1;
        f = false;
        e = 0L;
    }

    private int a(aa aa1, l l1, int k)
    {
        int i1 = Math.round((((l1.a - b.a) + (float)k) - g) + i);
        int j1 = Math.round((float)i1 + l1.f);
        if ((float)i1 < aa1.d() / -2F)
        {
            i1 = k + ((int)(aa1.d() / -2F) - i1);
        } else
        {
            i1 = k;
            if ((float)j1 > aa1.d() / 2.0F)
            {
                return k + ((int)(aa1.d() / 2.0F) - j1);
            }
        }
        return i1;
    }

    private int b(aa aa1, l l1, int k)
    {
        int i1 = Math.round((((l1.b - b.b) + (float)k) - h) + j);
        int j1 = Math.round((float)i1 + l1.g);
        if ((float)i1 < aa1.e() / -2F)
        {
            i1 = k + ((int)(aa1.e() / -2F) - i1);
        } else
        {
            i1 = k;
            if ((float)j1 > aa1.e() / 2.0F)
            {
                return k + ((int)(aa1.e() / 2.0F) - j1);
            }
        }
        return i1;
    }

    private void d(aa aa1, int k, int i1)
    {
        c = k;
        d = i1;
        b.a = ((float)c - g) + i;
        b.b = ((float)d - h) + j;
    }

    public void a()
    {
        f = false;
        e = 0L;
        i = 0.0F;
        j = 0.0F;
        g = 0.0F;
        h = 0.0F;
        c = 0;
        d = 0;
        a = false;
        b.a = 0.0F;
        b.b = 0.0F;
    }

    public void a(long l1)
    {
        if (b instanceof ah)
        {
            z z1 = ((ah)b).c();
            e = (e + l1) % z1.c();
        }
    }

    public void a(aa aa1)
    {
        aa1.c().save();
        if (f)
        {
            aa1.c().translate(-g, -h);
            aa1.c().translate(i, j);
            aa1.c().translate(c, d);
        }
        b.a(aa1, e);
        aa1.c().restore();
    }

    public void a(aa aa1, int k, int i1)
    {
        l l1 = b.b(aa1, e);
        d(aa1, a(aa1, l1, k), b(aa1, l1, i1));
    }

    public void a(aa aa1, int k, int i1, long l1)
    {
        l l2 = b.b(aa1, l1);
        if (!f)
        {
            f = true;
            e = l1;
            g = l2.a;
            h = l2.b;
            i = l2.a - (float)k;
            j = l2.b - (float)i1;
        } else
        {
            i = l2.a - (float)k;
            j = l2.b - (float)i1;
        }
        d(aa1, k, i1);
    }

    public ab b()
    {
        return b;
    }

    public void b(aa aa1, int k, int i1)
    {
        l l1 = b.b(aa1, e);
        d(aa1, a(aa1, l1, k), b(aa1, l1, i1));
    }

    public boolean c(aa aa1, int k, int i1)
    {
        aa1 = b.b(aa1, e);
        if ((float)k >= ((l) (aa1)).a && (float)i1 >= ((l) (aa1)).b && (float)k < ((l) (aa1)).a + ((l) (aa1)).f)
        {
            float f1 = i1;
            float f2 = ((l) (aa1)).b;
            if (f1 < ((l) (aa1)).g + f2)
            {
                return true;
            }
        }
        return false;
    }
}
