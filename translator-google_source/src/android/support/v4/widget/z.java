// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            ci, aa, DrawerLayout, cf, 
//            x, w

final class z extends ci
{

    final int a;
    cf b;
    final DrawerLayout c;
    private final Runnable d = new aa(this);

    public z(DrawerLayout drawerlayout, int i)
    {
        c = drawerlayout;
        super();
        a = i;
    }

    public final void a()
    {
        c.removeCallbacks(d);
    }

    public final void a(int i)
    {
        DrawerLayout drawerlayout;
        View view;
        x x1;
        drawerlayout = c;
        view = b.k;
        int j = drawerlayout.a.a;
        int k = drawerlayout.b.a;
        if (j == 1 || k == 1)
        {
            j = 1;
        } else
        if (j == 2 || k == 2)
        {
            j = 2;
        } else
        {
            j = 0;
        }
        if (view == null || i != 0) goto _L2; else goto _L1
_L1:
        x1 = (x)view.getLayoutParams();
        if (x1.b != 0.0F) goto _L4; else goto _L3
_L3:
        x1 = (x)view.getLayoutParams();
        if (x1.d)
        {
            x1.d = false;
            if (drawerlayout.e != null)
            {
                drawerlayout.e.b();
            }
            drawerlayout.a(view, false);
            if (drawerlayout.hasWindowFocus())
            {
                view = drawerlayout.getRootView();
                if (view != null)
                {
                    view.sendAccessibilityEvent(32);
                }
            }
        }
_L2:
        if (j != drawerlayout.c)
        {
            drawerlayout.c = j;
            if (drawerlayout.e != null)
            {
                drawerlayout.e.a(j);
            }
        }
        return;
_L4:
        if (x1.b == 1.0F)
        {
            x x2 = (x)view.getLayoutParams();
            if (!x2.d)
            {
                x2.d = true;
                if (drawerlayout.e != null)
                {
                    drawerlayout.e.a();
                }
                drawerlayout.a(view, true);
                if (drawerlayout.hasWindowFocus())
                {
                    drawerlayout.sendAccessibilityEvent(32);
                }
                view.requestFocus();
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void a(int i, int j)
    {
        View view;
        if ((i & 1) == 1)
        {
            view = c.a(3);
        } else
        {
            view = c.a(5);
        }
        if (view != null && c.a(view) == 0)
        {
            b.a(view, j);
        }
    }

    public final void a(View view, float f)
    {
        float f1;
        int k;
        f1 = DrawerLayout.b(view);
        k = view.getWidth();
        if (!c.a(view, 3)) goto _L2; else goto _L1
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
        b.a(i, view.getTop());
        c.invalidate();
        return;
_L2:
        int j = c.getWidth();
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
        if (c.a(view, 3))
        {
            f = (float)(j + i) / (float)j;
        } else
        {
            f = (float)(c.getWidth() - i) / (float)j;
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
        c.invalidate();
    }

    public final boolean a(View view)
    {
        return DrawerLayout.d(view) && c.a(view, a) && c.a(view) == 0;
    }

    public final int b(View view, int i)
    {
        if (c.a(view, 3))
        {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        } else
        {
            int j = c.getWidth();
            return Math.max(j - view.getWidth(), Math.min(i, j));
        }
    }

    final void b()
    {
        byte byte0 = 3;
        if (a == 3)
        {
            byte0 = 5;
        }
        View view = c.a(byte0);
        if (view != null)
        {
            c.f(view);
        }
    }

    public final void b(View view)
    {
        ((x)view.getLayoutParams()).c = false;
        b();
    }

    public final int c(View view)
    {
        if (DrawerLayout.d(view))
        {
            return view.getWidth();
        } else
        {
            return 0;
        }
    }

    public final void c()
    {
        c.postDelayed(d, 160L);
    }

    public final int d(View view)
    {
        return view.getTop();
    }
}
