// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            cb, bj, cc, dn, 
//            a

class br
    implements cb
{

    WeakHashMap a;

    br()
    {
        a = null;
    }

    private boolean a(bj bj1, int i1)
    {
        int j1;
        int k1;
        boolean flag;
        flag = true;
        j1 = bj1.b();
        k1 = bj1.a() - bj1.c();
        if (k1 != 0) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (i1 >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j1 > 0) goto _L4; else goto _L3
_L3:
        return false;
        if (j1 < k1 - 1) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int a(int i1, int j1, int k1)
    {
        return View.resolveSize(i1, j1);
    }

    public int a(View view)
    {
        return 2;
    }

    long a()
    {
        return 10L;
    }

    public void a(View view, float f1)
    {
    }

    public void a(View view, int i1, Paint paint)
    {
    }

    public void a(View view, ColorStateList colorstatelist)
    {
        cc.a(view, colorstatelist);
    }

    public void a(View view, android.graphics.PorterDuff.Mode mode)
    {
        cc.a(view, mode);
    }

    public void a(View view, a a1)
    {
    }

    public void a(View view, Runnable runnable)
    {
        view.postDelayed(runnable, a());
    }

    public void a(View view, Runnable runnable, long l1)
    {
        view.postDelayed(runnable, a() + l1);
    }

    public void a(View view, boolean flag)
    {
    }

    public boolean a(View view, int i1)
    {
        return (view instanceof bj) && a((bj)view, i1);
    }

    public void b(View view)
    {
        view.invalidate();
    }

    public void b(View view, float f1)
    {
    }

    public void b(View view, int i1)
    {
    }

    public void b(View view, boolean flag)
    {
    }

    public int c(View view)
    {
        return 0;
    }

    public int d(View view)
    {
        return 0;
    }

    public int e(View view)
    {
        return 0;
    }

    public ViewParent f(View view)
    {
        return view.getParent();
    }

    public int g(View view)
    {
        return 0;
    }

    public boolean h(View view)
    {
        return true;
    }

    public float i(View view)
    {
        return 0.0F;
    }

    public int j(View view)
    {
        return cc.a(view);
    }

    public dn k(View view)
    {
        return new dn(view);
    }

    public int l(View view)
    {
        return 0;
    }

    public void m(View view)
    {
    }

    public float n(View view)
    {
        return 0.0F;
    }

    public boolean o(View view)
    {
        return false;
    }

    public void p(View view)
    {
    }

    public boolean q(View view)
    {
        return cc.b(view);
    }
}
