// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout, u

private final class a extends a
{

    final int a;
    u b;
    final DrawerLayout c;
    private final Runnable d = new Runnable() {

        final DrawerLayout.h a;

        public final void run()
        {
            int j = 0;
            DrawerLayout.h h1 = a;
            int k = h1.b.i;
            View view;
            boolean flag;
            if (h1.a == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                view = h1.c.findDrawerWithGravity(3);
                if (view != null)
                {
                    j = -view.getWidth();
                }
                j += k;
            } else
            {
                view = h1.c.findDrawerWithGravity(5);
                j = h1.c.getWidth();
                j -= k;
            }
            if (view != null && (flag && view.getLeft() < j || !flag && view.getLeft() > j) && h1.c.getDrawerLockMode(view) == 0)
            {
                DrawerLayout.g g = (DrawerLayout.g)view.getLayoutParams();
                h1.b.a(view, j, view.getTop());
                g.c = true;
                h1.c.invalidate();
                h1.b();
                h1.c.cancelChildViewTouch();
            }
        }

            
            {
                a = DrawerLayout.h.this;
                super();
            }
    };

    public final int a(View view, int i)
    {
        if (c.checkDrawerViewAbsoluteGravity(view, 3))
        {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        } else
        {
            int j = c.getWidth();
            return Math.max(j - view.getWidth(), Math.min(i, j));
        }
    }

    public final void a()
    {
        c.removeCallbacks(d);
    }

    public final void a(int i)
    {
        c.updateDrawerState(a, i, b.k);
    }

    public final void a(int i, int j)
    {
        View view;
        if ((i & 1) == 1)
        {
            view = c.findDrawerWithGravity(3);
        } else
        {
            view = c.findDrawerWithGravity(5);
        }
        if (view != null && c.getDrawerLockMode(view) == 0)
        {
            b.a(view, j);
        }
    }

    public final void a(View view, float f)
    {
        float f1;
        int k;
        f1 = c.getDrawerViewOffset(view);
        k = view.getWidth();
        if (!c.checkDrawerViewAbsoluteGravity(view, 3)) goto _L2; else goto _L1
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

    public final boolean a(View view)
    {
        return c.isDrawerView(view) && c.checkDrawerViewAbsoluteGravity(view, a) && c.getDrawerLockMode(view) == 0;
    }

    public final int b(View view)
    {
        if (c.isDrawerView(view))
        {
            return view.getWidth();
        } else
        {
            return 0;
        }
    }

    final void b()
    {
        byte byte0 = 3;
        if (a == 3)
        {
            byte0 = 5;
        }
        View view = c.findDrawerWithGravity(byte0);
        if (view != null)
        {
            c.closeDrawer(view);
        }
    }

    public final void b(View view, int i)
    {
        int j = view.getWidth();
        float f;
        if (c.checkDrawerViewAbsoluteGravity(view, 3))
        {
            f = (float)(j + i) / (float)j;
        } else
        {
            f = (float)(c.getWidth() - i) / (float)j;
        }
        c.setDrawerViewOffset(view, f);
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

    public final int c(View view)
    {
        return view.getTop();
    }

    public final void c()
    {
        c.postDelayed(d, 160L);
    }

    public final void d(View view)
    {
        ((d)view.getLayoutParams()).c = false;
        b();
    }

    public _cls1.a(DrawerLayout drawerlayout, int i)
    {
        c = drawerlayout;
        super();
        a = i;
    }
}
