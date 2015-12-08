// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            az, DrawerLayout, ax

final class k extends az
{

    final DrawerLayout a;
    private final int b;
    private ax c;
    private final Runnable d;

    public final void a()
    {
        a.removeCallbacks(d);
    }

    public final void a(int i)
    {
        a.a(i, c.c());
    }

    public final void a(int i, int j)
    {
        View view;
        if ((i & 1) == 1)
        {
            view = a.a(3);
        } else
        {
            view = a.a(5);
        }
        if (view != null && a.a(view) == 0)
        {
            c.a(view, j);
        }
    }

    public final void a(View view, float f)
    {
        float f1;
        int l;
        f1 = DrawerLayout.b(view);
        l = view.getWidth();
        if (!a.a(view, 3)) goto _L2; else goto _L1
_L1:
        int i;
        if (f > 0.0F || f == 0.0F && f1 > 0.5F)
        {
            i = 0;
        } else
        {
            i = -l;
        }
_L4:
        c.a(i, view.getTop());
        a.invalidate();
        return;
_L2:
        int j = a.getWidth();
        if (f >= 0.0F)
        {
            i = j;
            if (f != 0.0F)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = j;
            if (f1 <= 0.5F)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i = j - l;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(View view, int i)
    {
        int j = view.getWidth();
        float f;
        if (a.a(view, 3))
        {
            f = (float)(j + i) / (float)j;
        } else
        {
            f = (float)(a.getWidth() - i) / (float)j;
        }
        DrawerLayout.a(view, f);
        if (f == 0.0F)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        a.invalidate();
    }

    public final boolean a(View view)
    {
        return DrawerLayout.c(view) && a.a(view, b) && a.a(view) == 0;
    }

    public final int b(View view, int i)
    {
        if (a.a(view, 3))
        {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        } else
        {
            int j = a.getWidth();
            return Math.max(j - view.getWidth(), Math.min(i, j));
        }
    }

    public final void b()
    {
        a.postDelayed(d, 160L);
    }

    public final void b(View view)
    {
        ((DrawerLayout.LayoutParams)view.getLayoutParams()).c = false;
        byte byte0;
        if (b == 3)
        {
            byte0 = 5;
        } else
        {
            byte0 = 3;
        }
        view = a.a(byte0);
        if (view != null)
        {
            a.d(view);
        }
    }

    public final int c(View view)
    {
        if (DrawerLayout.c(view))
        {
            return view.getWidth();
        } else
        {
            return 0;
        }
    }

    public final int d(View view)
    {
        return view.getTop();
    }
}
