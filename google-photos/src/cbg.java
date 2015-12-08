// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cbg extends caq
{

    static final float a[] = {
        0.05882353F, 0.05882353F, 0.05882353F, 1.0F
    };
    static final float b[] = {
        0.0F, 0.0F, 0.0F, 0.0F
    };
    private static TimeInterpolator c = new AccelerateDecelerateInterpolator();
    private static final Matrix d = new Matrix();
    private long A;
    private long B;
    private int e;
    private int f;
    private Matrix g;
    private float h;
    private int i;
    private int j;
    private Matrix k;
    private float l;
    private int m;
    private int n;
    private Matrix o;
    private float p;
    private int q;
    private int r;
    private float s;
    private car t;
    private Matrix u;
    private Matrix v;
    private Matrix w;
    private Matrix x;
    private long y;
    private long z;

    protected cbg()
    {
        h = 1.0F;
        i = caz.a;
        l = 1.0F;
        m = caz.a;
        p = 1.0F;
        q = caz.a;
        t = car.a;
        u = new Matrix();
        v = new Matrix();
        w = new Matrix();
        x = new Matrix();
    }

    protected cbg(int i1)
    {
        this();
        e = i1;
    }

    protected cbg(cbh cbh1)
    {
        this();
        e = cbh1.a;
        f = cbh1.b;
        h = cbh1.c;
        i = cbh1.d;
        g = new Matrix();
        j = cbh1.e;
        l = cbh1.f;
        m = cbh1.g;
        k = new Matrix();
        n = 0;
        p = cbh1.h;
        q = cbh1.i;
        o = new Matrix();
        r = cbh1.k;
        s = 0.0F;
        t = cbh1.j;
        y = cbh1.l;
        z = cbh1.m;
        A = cbh1.n;
        B = cbh1.o;
    }

    public List D_()
    {
        ArrayList arraylist = new ArrayList();
        if (f != 0)
        {
            arraylist.add(Integer.valueOf(f));
        }
        if (j != 0)
        {
            arraylist.add(Integer.valueOf(j));
        }
        return arraylist;
    }

    public final car E_()
    {
        return t;
    }

    public long a(cnt cnt1, cnt cnt2)
    {
        long l1 = 0L;
        if (cnt1 != cnt.a) goto _L2; else goto _L1
_L1:
        if (cnt2 != cnt.c) goto _L4; else goto _L3
_L3:
        l1 = A;
_L6:
        return l1;
_L4:
        return y;
_L2:
        if (cnt1 == cnt.c)
        {
            if (cnt2 == cnt.a)
            {
                return B;
            } else
            {
                return z;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final Bitmap a(Context context, cba cba1, int i1, int j1)
    {
        return null;
    }

    public Matrix a(cba cba1, cpy cpy1)
    {
        cnw cnw1;
        u.reset();
        cnw1 = cba1.s;
        if (cpy1 == null) goto _L2; else goto _L1
_L1:
        long l1 = cba1.d;
        if (cpy1.c.a()) goto _L4; else goto _L3
_L3:
        l1 = 0L;
_L6:
        cnw1 = cpy1.b.d.a(l1, cba1.e);
_L2:
        cnw1.a(u);
        return u;
_L4:
        cpz cpz1 = cpy1.c;
        boolean flag;
        if (cpz1.a() && cpz1.a == cpz1.b - 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            l1 = -1L;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public List a(cnq cnq)
    {
        return Collections.emptyList();
    }

    public boolean a(cba cba1)
    {
        return false;
    }

    public Matrix b(cba cba1)
    {
        v.reset();
        cba1.t.a(v);
        return v;
    }

    public pyh b(cnq cnq)
    {
        return null;
    }

    public Matrix c(cba cba1)
    {
        return null;
    }

    public List c(cnq cnq)
    {
        return Collections.emptyList();
    }

    public Matrix d(cba cba1)
    {
        return null;
    }

    public final int e(cba cba1)
    {
        return e;
    }

    public int f(cba cba1)
    {
        return f;
    }

    public Matrix g(cba cba1)
    {
        return g;
    }

    public float h(cba cba1)
    {
        return h;
    }

    public float[] h()
    {
        return a;
    }

    public int i(cba cba1)
    {
        return i;
    }

    public int j(cba cba1)
    {
        return j;
    }

    public Matrix k(cba cba1)
    {
        return k;
    }

    public float l(cba cba1)
    {
        return l;
    }

    public int m(cba cba1)
    {
        return m;
    }

    public int n(cba cba1)
    {
        return n;
    }

    public Matrix o(cba cba1)
    {
        return o;
    }

    public float p(cba cba1)
    {
        return p;
    }

    public int q(cba cba1)
    {
        return q;
    }

    public final int r(cba cba1)
    {
        return r;
    }

    public long s(cba cba1)
    {
        return 0L;
    }

    public float t(cba cba1)
    {
        return s;
    }

    public String toString()
    {
        return b.a(getClass(), new Object[0]);
    }

    public final float u(cba cba1)
    {
        return t.h;
    }

    public float v(cba cba1)
    {
        float f1 = 0.0F;
        if (cba1.w)
        {
            return 0.0F;
        }
        TimeInterpolator timeinterpolator = c;
        if (cba1.i != cnt.d || b.e(cba1))
        {
            boolean flag;
            if (cba1.f == cba1.h - 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if ((!flag || cba1.i == cnt.e) && (flag || cba1.k != cnt.d))
            {
                f1 = 1.0F;
            } else
            {
                long l1 = Math.min(0x16e360L, cba1.e);
                long l2 = cba1.e - cba1.d;
                if (l2 > l1)
                {
                    f1 = 1.0F;
                } else
                {
                    f1 = (float)l2 / (float)l1;
                }
            }
        }
        return timeinterpolator.getInterpolation(f1) - 1.0F;
    }

    public final float w(cba cba1)
    {
        return cba1.m;
    }

    public final Matrix x(cba cba1)
    {
        cba1 = cba1.s.a();
        if (cba1 == null)
        {
            return d;
        } else
        {
            w.reset();
            cba1.a(w);
            return w;
        }
    }

    public final Matrix y(cba cba1)
    {
        cba1 = cba1.t.a();
        if (cba1 == null)
        {
            return d;
        } else
        {
            x.reset();
            cba1.a(x);
            return x;
        }
    }

    public void z(cba cba1)
    {
    }

}
