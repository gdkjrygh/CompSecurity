// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout, s

private final class b extends b
{

    final DrawerLayout a;
    private final int b;
    private s c;
    private final Runnable d = new Runnable() {

        final DrawerLayout.h a;

        public final void run()
        {
            DrawerLayout.h.a(a);
        }

            
            {
                a = DrawerLayout.h.this;
                super();
            }
    };

    static void a(b b1)
    {
        int i = 0;
        int j = b1.c.b();
        View view;
        boolean flag;
        if (b1.b == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view = b1.a.b(3);
            if (view != null)
            {
                i = -view.getWidth();
            }
            i += j;
        } else
        {
            view = b1.a.b(5);
            i = b1.a.getWidth();
            i -= j;
        }
        if (view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && b1.a.a(view) == 0)
        {
            b b2 = (a)view.getLayoutParams();
            b1.c.a(view, i, view.getTop());
            b2.c = true;
            b1.a.invalidate();
            b1.c();
            b1.a.e();
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

    public final int a(View view, int i)
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

    public final void a(s s1)
    {
        c = s1;
    }

    public final void a(View view, float f)
    {
        float f1;
        int j;
        f1 = DrawerLayout.b(view);
        j = view.getWidth();
        if (!a.a(view, 3)) goto _L2; else goto _L1
_L1:
        int i;
        if (f > 0.0F || f == 0.0F && f1 > 0.5F)
        {
            i = 0;
        } else
        {
            i = -j;
        }
_L4:
        c.a(i, view.getTop());
        a.invalidate();
        return;
_L2:
        i = a.getWidth();
        if (f < 0.0F || f == 0.0F && f1 > 0.5F)
        {
            i -= j;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a(View view)
    {
        return DrawerLayout.d(view) && a.a(view, b) && a.a(view) == 0;
    }

    public final int b(View view)
    {
        if (DrawerLayout.d(view))
        {
            return view.getWidth();
        } else
        {
            return 0;
        }
    }

    public final void b()
    {
        a.postDelayed(d, 160L);
    }

    public final void b(View view, int i)
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

    public final int c(View view)
    {
        return view.getTop();
    }

    public final void d(View view)
    {
        ((validate)view.getLayoutParams()).c = false;
        c();
    }

    public _cls1.a(DrawerLayout drawerlayout, int i)
    {
        a = drawerlayout;
        super();
        b = i;
    }
}
