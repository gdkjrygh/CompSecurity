// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.x;
import android.support.v4.widget.s;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            SwipeDismissBehavior

final class a extends android.support.v4.widget.r._cls1
{

    final SwipeDismissBehavior a;
    private int b;

    public final int a(View view, int i)
    {
        int j;
        int k;
        if (x.h(view) == 1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (SwipeDismissBehavior.c(a) == 0)
        {
            if (j != 0)
            {
                k = b - view.getWidth();
                j = b;
            } else
            {
                k = b;
                j = b + view.getWidth();
            }
        } else
        if (SwipeDismissBehavior.c(a) == 1)
        {
            if (j != 0)
            {
                k = b;
                j = b + view.getWidth();
            } else
            {
                k = b - view.getWidth();
                j = b;
            }
        } else
        {
            k = b - view.getWidth();
            j = b + view.getWidth();
        }
        return SwipeDismissBehavior.a(k, i, j);
    }

    public final void a(int i)
    {
        if (SwipeDismissBehavior.a(a) != null)
        {
            SwipeDismissBehavior.a(a).a(i);
        }
    }

    public final void a(View view, float f)
    {
        boolean flag = true;
        int j = view.getWidth();
        boolean flag1 = false;
        int i;
        if (f != 0.0F)
        {
            if (x.h(view) == 1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            int k;
            int l;
            int i1;
            if (SwipeDismissBehavior.c(a) == 2)
            {
                i = ((flag) ? 1 : 0);
            } else
            if (SwipeDismissBehavior.c(a) == 0)
            {
                if (i != 0)
                {
                    i = ((flag) ? 1 : 0);
                    if (f >= 0.0F)
                    {
                        i = 0;
                    }
                } else
                {
                    i = ((flag) ? 1 : 0);
                    if (f <= 0.0F)
                    {
                        i = 0;
                    }
                }
            } else
            if (SwipeDismissBehavior.c(a) == 1)
            {
                if (i != 0)
                {
                    i = ((flag) ? 1 : 0);
                    if (f <= 0.0F)
                    {
                        i = 0;
                    }
                } else
                {
                    i = ((flag) ? 1 : 0);
                    if (f >= 0.0F)
                    {
                        i = 0;
                    }
                }
            } else
            {
                i = 0;
            }
        } else
        {
            k = view.getLeft();
            l = b;
            i1 = Math.round((float)view.getWidth() * SwipeDismissBehavior.d(a));
            i = ((flag) ? 1 : 0);
            if (Math.abs(k - l) < i1)
            {
                i = 0;
            }
        }
        if (i != 0)
        {
            if (view.getLeft() < b)
            {
                i = b - j;
            } else
            {
                i = b + j;
            }
            flag1 = true;
        } else
        {
            i = b;
        }
        if (SwipeDismissBehavior.b(a).a(i, view.getTop()))
        {
            x.a(view, new <init>(a, view, flag1));
        } else
        if (flag1 && SwipeDismissBehavior.a(a) != null)
        {
            SwipeDismissBehavior.a(a).a();
            return;
        }
    }

    public final boolean a(View view)
    {
        b = view.getLeft();
        return true;
    }

    public final int b(View view)
    {
        return view.getWidth();
    }

    public final void b(View view, int i)
    {
        float f = (float)b + (float)view.getWidth() * SwipeDismissBehavior.e(a);
        float f1 = (float)b + (float)view.getWidth() * SwipeDismissBehavior.f(a);
        if ((float)i <= f)
        {
            x.c(view, 1.0F);
            return;
        }
        if ((float)i >= f1)
        {
            x.c(view, 0.0F);
            return;
        } else
        {
            x.c(view, SwipeDismissBehavior.a(1.0F - SwipeDismissBehavior.a(f, f1, i)));
            return;
        }
    }

    public final int c(View view)
    {
        return view.getTop();
    }

    (SwipeDismissBehavior swipedismissbehavior)
    {
        a = swipedismissbehavior;
        super();
    }
}
