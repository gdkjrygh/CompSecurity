// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            am, h, aj, DrawerLayout

final class g extends am
{

    final DrawerLayout a;
    private final int b;
    private aj c;
    private final Runnable d = new h(this);

    public g(DrawerLayout drawerlayout, int i)
    {
        a = drawerlayout;
        super();
        b = i;
    }

    static void a(g g1)
    {
        int i = 0;
        int j = g1.c.b();
        View view;
        boolean flag;
        if (g1.b == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view = g1.a.b(3);
            if (view != null)
            {
                i = -view.getWidth();
            }
            i += j;
        } else
        {
            view = g1.a.b(5);
            i = g1.a.getWidth();
            i -= j;
        }
        if (view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && g1.a.a(view) == 0)
        {
            DrawerLayout.LayoutParams layoutparams = (DrawerLayout.LayoutParams)view.getLayoutParams();
            g1.c.a(view, i, view.getTop());
            layoutparams.c = true;
            g1.a.invalidate();
            g1.c();
            g1.a.b();
        }
    }

    private void c()
    {
        byte byte0 = 3;
        if (b == 3)
        {
            byte0 = 5;
        }
        View view = a.b(byte0);
        if (view != null)
        {
            a.e(view);
        }
    }

    public final void a()
    {
        a.removeCallbacks(d);
    }

    public final void a(int i)
    {
        DrawerLayout drawerlayout = a;
        int j = b;
        drawerlayout.a(i, c.c());
    }

    public final void a(int i, int j)
    {
        View view;
        if ((i & 1) == 1)
        {
            view = a.b(3);
        } else
        {
            view = a.b(5);
        }
        if (view != null && a.a(view) == 0)
        {
            c.a(view, j);
        }
    }

    public final void a(aj aj1)
    {
        c = aj1;
    }

    public final void a(View view, float f)
    {
        float f1;
        int k;
        DrawerLayout drawerlayout = a;
        f1 = DrawerLayout.b(view);
        k = view.getWidth();
        if (!a.a(view, 3)) goto _L2; else goto _L1
_L1:
        int i;
        if (f > 0.0F || f == 0.0F && f1 > 0.5F)
        {
            i = 0;
        } else
        {
            i = -k;
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
        i = j - k;
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
        a.a(view, f);
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
        DrawerLayout drawerlayout = a;
        return DrawerLayout.d(view) && a.a(view, b) && a.a(view) == 0;
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
        c();
    }

    public final int c(View view)
    {
        return view.getWidth();
    }

    public final int d(View view)
    {
        return view.getTop();
    }
}
