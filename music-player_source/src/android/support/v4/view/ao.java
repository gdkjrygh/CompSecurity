// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            aw, a

class ao
    implements aw
{

    ao()
    {
    }

    long a()
    {
        return 10L;
    }

    public void a(View view, int j, int k, int l, int i1)
    {
        view.postInvalidateDelayed(a(), j, k, l, i1);
    }

    public void a(View view, int j, Paint paint)
    {
    }

    public void a(View view, Paint paint)
    {
    }

    public void a(View view, a a1)
    {
    }

    public void a(View view, Runnable runnable)
    {
        view.postDelayed(runnable, a());
    }

    public boolean a(View view)
    {
        return false;
    }

    public boolean a(View view, int j)
    {
        return false;
    }

    public int b(View view)
    {
        return 2;
    }

    public void c(View view)
    {
        view.postInvalidateDelayed(a());
    }

    public int d(View view)
    {
        return 0;
    }

    public void e(View view)
    {
    }

    public int f(View view)
    {
        return 0;
    }

    public int g(View view)
    {
        return 0;
    }

    public ViewParent h(View view)
    {
        return view.getParent();
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
}
