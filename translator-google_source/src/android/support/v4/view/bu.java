// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ce, bo, bn, cf, 
//            dq, az, ej, a, 
//            bd

class bu
    implements ce
{

    WeakHashMap a;

    bu()
    {
        a = null;
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

    public ej a(View view, ej ej)
    {
        return ej;
    }

    public void a(View view, float f1)
    {
    }

    public void a(View view, int i1, int j1, int k1, int l1)
    {
        view.invalidate(i1, j1, k1, l1);
    }

    public void a(View view, int i1, Paint paint)
    {
    }

    public void a(View view, ColorStateList colorstatelist)
    {
        if (view instanceof bo)
        {
            ((bo)view).setSupportBackgroundTintList(colorstatelist);
        }
    }

    public void a(View view, Paint paint)
    {
    }

    public void a(View view, android.graphics.PorterDuff.Mode mode)
    {
        if (view instanceof bo)
        {
            ((bo)view).setSupportBackgroundTintMode(mode);
        }
    }

    public void a(View view, a a1)
    {
    }

    public void a(View view, bd bd)
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

    public void a(ViewGroup viewgroup)
    {
    }

    public boolean a(View view, int i1)
    {
        if (!(view instanceof bn)) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        view = (bn)view;
        j1 = view.b();
        k1 = view.a() - view.c();
        if (k1 == 0) goto _L4; else goto _L3
_L3:
        if (i1 >= 0) goto _L6; else goto _L5
_L5:
        if (j1 > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
_L7:
        if (i1 != 0)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (j1 < k1 - 1)
        {
            i1 = 1;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        i1 = 0;
        if (true) goto _L7; else goto _L2
_L2:
        return false;
    }

    public void b(View view)
    {
        view.invalidate();
    }

    public void b(View view, float f1)
    {
    }

    public boolean b(View view, int i1)
    {
        if (!(view instanceof bn)) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        view = (bn)view;
        j1 = view.e();
        k1 = view.d() - view.f();
        if (k1 == 0) goto _L4; else goto _L3
_L3:
        if (i1 >= 0) goto _L6; else goto _L5
_L5:
        if (j1 > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
_L7:
        if (i1 != 0)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (j1 < k1 - 1)
        {
            i1 = 1;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        i1 = 0;
        if (true) goto _L7; else goto _L2
_L2:
        return false;
    }

    public int c(View view)
    {
        return 0;
    }

    public void c(View view, float f1)
    {
    }

    public void c(View view, int i1)
    {
    }

    public int d(View view)
    {
        return 0;
    }

    public void d(View view, float f1)
    {
    }

    public int e(View view)
    {
        return 0;
    }

    public void e(View view, float f1)
    {
    }

    public ViewParent f(View view)
    {
        return view.getParent();
    }

    public boolean g(View view)
    {
        boolean flag1 = false;
        view = view.getBackground();
        boolean flag = flag1;
        if (view != null)
        {
            flag = flag1;
            if (view.getOpacity() == -1)
            {
                flag = true;
            }
        }
        return flag;
    }

    public int h(View view)
    {
        return view.getMeasuredWidth();
    }

    public int i(View view)
    {
        return 0;
    }

    public boolean j(View view)
    {
        return true;
    }

    public float k(View view)
    {
        return 0.0F;
    }

    public float l(View view)
    {
        return 0.0F;
    }

    public int m(View view)
    {
        return cf.a(view);
    }

    public dq n(View view)
    {
        return new dq(view);
    }

    public int o(View view)
    {
        return 0;
    }

    public void p(View view)
    {
    }

    public float q(View view)
    {
        return 0.0F;
    }

    public boolean r(View view)
    {
        return false;
    }

    public void s(View view)
    {
    }

    public void t(View view)
    {
    }

    public boolean u(View view)
    {
        if (view instanceof az)
        {
            return ((az)view).isNestedScrollingEnabled();
        } else
        {
            return false;
        }
    }

    public void v(View view)
    {
        if (view instanceof az)
        {
            ((az)view).stopNestedScroll();
        }
    }

    public boolean w(View view)
    {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public boolean x(View view)
    {
        return view.getWindowToken() != null;
    }
}
