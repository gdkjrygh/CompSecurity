// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ScrollingView, ViewCompatBase, ViewPropertyAnimatorCompat, NestedScrollingChild, 
//            AccessibilityDelegateCompat

class a
    implements a
{

    WeakHashMap a;

    private boolean a(ScrollingView scrollingview, int i1)
    {
        int j1;
        int k1;
        boolean flag;
        flag = true;
        j1 = scrollingview.computeHorizontalScrollOffset();
        k1 = scrollingview.computeHorizontalScrollRange() - scrollingview.computeHorizontalScrollExtent();
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

    private boolean b(ScrollingView scrollingview, int i1)
    {
        int j1;
        int k1;
        boolean flag;
        flag = true;
        j1 = scrollingview.computeVerticalScrollOffset();
        k1 = scrollingview.computeVerticalScrollRange() - scrollingview.computeVerticalScrollExtent();
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

    public void a(View view, int i1, int j1, int k1, int l1)
    {
        view.invalidate(i1, j1, k1, l1);
    }

    public void a(View view, int i1, Paint paint)
    {
    }

    public void a(View view, Paint paint)
    {
    }

    public void a(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
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

    public void a(ViewGroup viewgroup, boolean flag)
    {
    }

    public boolean a(View view, int i1)
    {
        return (view instanceof ScrollingView) && a((ScrollingView)view, i1);
    }

    public void b(View view, float f1)
    {
    }

    public boolean b(View view)
    {
        return false;
    }

    public boolean b(View view, int i1)
    {
        return (view instanceof ScrollingView) && b((ScrollingView)view, i1);
    }

    public void c(View view, float f1)
    {
    }

    public void c(View view, int i1)
    {
    }

    public boolean c(View view)
    {
        return false;
    }

    public void d(View view)
    {
        view.invalidate();
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

    public float f(View view)
    {
        return 1.0F;
    }

    public void f(View view, float f1)
    {
    }

    public int g(View view)
    {
        return 0;
    }

    public int h(View view)
    {
        return 0;
    }

    public ViewParent i(View view)
    {
        return view.getParent();
    }

    public boolean j(View view)
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

    public boolean k(View view)
    {
        return true;
    }

    public float l(View view)
    {
        return 0.0F;
    }

    public float m(View view)
    {
        return 0.0F;
    }

    public float n(View view)
    {
        return 0.0F;
    }

    public int o(View view)
    {
        return ViewCompatBase.a(view);
    }

    public int p(View view)
    {
        return ViewCompatBase.b(view);
    }

    public ViewPropertyAnimatorCompat q(View view)
    {
        return new ViewPropertyAnimatorCompat(view);
    }

    public float r(View view)
    {
        return 0.0F;
    }

    public boolean s(View view)
    {
        return false;
    }

    public boolean t(View view)
    {
        if (view instanceof NestedScrollingChild)
        {
            return ((NestedScrollingChild)view).isNestedScrollingEnabled();
        } else
        {
            return false;
        }
    }

    public void u(View view)
    {
        if (view instanceof NestedScrollingChild)
        {
            ((NestedScrollingChild)view).stopNestedScroll();
        }
    }

    ()
    {
        a = null;
    }
}
