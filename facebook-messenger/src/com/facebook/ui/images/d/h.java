// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.d;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.common.w.n;
import com.facebook.ui.images.base.b;
import com.google.common.a.hq;
import com.google.common.base.Joiner;
import java.util.List;

// Referenced classes of package com.facebook.ui.images.d:
//            i, a, e, m, 
//            n, f, b

public class h
{

    private final com.facebook.ui.images.d.b a;
    private final f b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private volatile String j;

    h(i k)
    {
        a = k.e();
        b = k.f();
        c = k.a();
        d = k.b();
        e = k.c();
        f = k.d();
        g = k.g();
        h = k.h();
        i = k.i();
    }

    private void a(List list, Rect rect)
    {
        if (!i && (!g() || rect.width() > e() && e() != -1 || rect.height() > f() && f() != -1 || rect.width() < c() && c() != -1 || rect.height() < d()) && d() != -1)
        {
            if (b() != null)
            {
                a a1 = new a(b());
                a1.a(rect, rect);
                list.add(a1);
            }
            if (a() != null)
            {
                Object obj = a();
                rect.width();
                rect.height();
                obj = new e(((com.facebook.ui.images.d.b) (obj)), c(), d());
                ((e) (obj)).a(rect, rect);
                list.add(obj);
                return;
            }
        }
    }

    private void b(List list, Rect rect)
    {
        boolean flag3 = true;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (rect.width() > e() && e() != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (rect.height() > f() && f() != -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (rect.width() < c() && c() != -1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (rect.height() >= d() || d() == -1)
        {
            flag3 = false;
        }
        if (i && (flag || flag1) || !i && flag && flag1)
        {
            m m1 = new m(e(), f());
            m1.a(rect, rect);
            list.add(m1);
        } else
        if (i && (flag2 || flag3) || !i && flag2 && flag3)
        {
            m m2 = new m(c(), d(), n.UPSCALE);
            m2.a(rect, rect);
            list.add(m2);
            return;
        }
    }

    public Matrix a(int k, int l, int i1, int j1)
    {
        Rect rect = new Rect(0, 0, k, l);
        Matrix matrix = new Matrix();
        if (!g() || rect.width() > e() && e() != -1 || rect.height() > f() && f() != -1 || rect.width() < c() || rect.height() < d())
        {
            if (b() != null)
            {
                b().a(rect, rect);
            }
            if (a() != null)
            {
                a().a(rect, c(), d(), rect);
            }
        }
        matrix.postTranslate(-rect.left, -rect.top);
        float f1 = Math.max((float)i1 / (float)k, (float)j1 / (float)l);
        matrix.postScale(f1, f1);
        return matrix;
    }

    public com.facebook.ui.images.d.b a()
    {
        return a;
    }

    public List a(Rect rect)
    {
        java.util.ArrayList arraylist = hq.a();
        a(((List) (arraylist)), rect);
        b(arraylist, rect);
        return arraylist;
    }

    public f b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public int e()
    {
        return e;
    }

    public int f()
    {
        return f;
    }

    public boolean g()
    {
        return h;
    }

    public String h()
    {
        if (g)
        {
            return b.d;
        }
        if (j == null)
        {
            Joiner joiner = Joiner.on(":");
            Object obj = (new StringBuilder()).append("(");
            String s;
            StringBuilder stringbuilder;
            if (a != null)
            {
                s = a.a();
            } else
            {
                s = "null";
            }
            obj = ((StringBuilder) (obj)).append(s).append(")").toString();
            stringbuilder = (new StringBuilder()).append("(");
            if (b != null)
            {
                s = b.a();
            } else
            {
                s = "null";
            }
            j = Long.toString(n.d(joiner.join("3", obj, new Object[] {
                stringbuilder.append(s).append(")").toString(), Integer.valueOf(c), Integer.valueOf(d), Integer.valueOf(e), Integer.valueOf(f), Boolean.valueOf(h)
            })));
        }
        return j;
    }
}
