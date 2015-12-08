// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            bz, bk, ca, cy, 
//            be, dr, a, bi

class bq
    implements bz
{

    WeakHashMap a;

    bq()
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

    public dr a(View view, dr dr)
    {
        return dr;
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

    public void a(View view, a a1)
    {
    }

    public void a(View view, bi bi)
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
        if (!(view instanceof bk)) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        view = (bk)view;
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

    public void b(View view, float f1)
    {
    }

    public boolean b(View view)
    {
        return false;
    }

    public boolean b(View view, int i1)
    {
        if (!(view instanceof bk)) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        view = (bk)view;
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

    public boolean i(View view)
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

    public int j(View view)
    {
        return 0;
    }

    public float k(View view)
    {
        return 0.0F;
    }

    public float l(View view)
    {
        return 0.0F;
    }

    public float m(View view)
    {
        return 0.0F;
    }

    public int n(View view)
    {
        return ca.a(view);
    }

    public int o(View view)
    {
        return ca.b(view);
    }

    public cy p(View view)
    {
        return new cy(view);
    }

    public int q(View view)
    {
        return 0;
    }

    public void r(View view)
    {
    }

    public boolean s(View view)
    {
        return false;
    }

    public void t(View view)
    {
    }

    public void u(View view)
    {
    }

    public void v(View view)
    {
        if (view instanceof be)
        {
            ((be)view).stopNestedScroll();
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
