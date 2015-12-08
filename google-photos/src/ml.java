// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;

class ml
    implements mv
{

    WeakHashMap a;

    ml()
    {
        a = null;
    }

    public boolean A(View view)
    {
        return view.getWindowToken() != null;
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

    public or a(View view, or or)
    {
        return or;
    }

    public void a(View view, float f1)
    {
    }

    public void a(View view, int i1, Paint paint)
    {
    }

    public void a(View view, ColorStateList colorstatelist)
    {
        if (view instanceof mf)
        {
            ((mf)view).setSupportBackgroundTintList(colorstatelist);
        }
    }

    public void a(View view, android.graphics.PorterDuff.Mode mode)
    {
        if (view instanceof mf)
        {
            ((mf)view).setSupportBackgroundTintMode(mode);
        }
    }

    public void a(View view, Rect rect)
    {
    }

    public void a(View view, AccessibilityEvent accessibilityevent)
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

    public void a(View view, kc kc)
    {
    }

    public void a(View view, mc mc)
    {
    }

    public void a(View view, pa pa)
    {
    }

    public void a(View view, boolean flag)
    {
    }

    public boolean a(View view, int i1)
    {
        if (!(view instanceof me)) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        view = (me)view;
        j1 = view.computeHorizontalScrollOffset();
        k1 = view.computeHorizontalScrollRange() - view.computeHorizontalScrollExtent();
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

    public boolean a(View view, int i1, Bundle bundle)
    {
        return false;
    }

    public void b(View view, float f1)
    {
    }

    public void b(View view, boolean flag)
    {
    }

    public boolean b(View view)
    {
        return false;
    }

    public boolean b(View view, int i1)
    {
        if (!(view instanceof me)) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        view = (me)view;
        j1 = view.computeVerticalScrollOffset();
        k1 = view.computeVerticalScrollRange() - view.computeVerticalScrollExtent();
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

    public float f(View view)
    {
        return 1.0F;
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

    public int j(View view)
    {
        return view.getMeasuredWidth();
    }

    public int k(View view)
    {
        return 0;
    }

    public int l(View view)
    {
        return view.getPaddingLeft();
    }

    public int m(View view)
    {
        return view.getPaddingRight();
    }

    public boolean n(View view)
    {
        return true;
    }

    public float o(View view)
    {
        return 0.0F;
    }

    public float p(View view)
    {
        return 0.0F;
    }

    public int q(View view)
    {
        return b.b(view);
    }

    public int r(View view)
    {
        return b.c(view);
    }

    public ob s(View view)
    {
        return new ob(view);
    }

    public int t(View view)
    {
        return 0;
    }

    public void u(View view)
    {
    }

    public float v(View view)
    {
        return 0.0F;
    }

    public boolean w(View view)
    {
        return false;
    }

    public void x(View view)
    {
    }

    public void y(View view)
    {
        if (view instanceof ly)
        {
            ((ly)view).stopNestedScroll();
        }
    }

    public boolean z(View view)
    {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }
}
