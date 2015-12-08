// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            ay, t, DrawerLayout, av, 
//            q

class s extends ay
{

    final DrawerLayout a;
    private final int b;
    private av c;
    private final Runnable d = new t(this);

    public s(DrawerLayout drawerlayout, int i)
    {
        a = drawerlayout;
        super();
        b = i;
    }

    static void a(s s1)
    {
        s1.c();
    }

    private void b()
    {
        byte byte0 = 3;
        if (b == 3)
        {
            byte0 = 5;
        }
        View view = a.b(byte0);
        if (view != null)
        {
            a.i(view);
        }
    }

    private void c()
    {
        int i = 0;
        int j = c.b();
        View view;
        boolean flag;
        if (b == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view = a.b(3);
            if (view != null)
            {
                i = -view.getWidth();
            }
            i += j;
        } else
        {
            view = a.b(5);
            i = a.getWidth();
            i -= j;
        }
        if (view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && a.a(view) == 0)
        {
            q q1 = (q)view.getLayoutParams();
            c.a(view, i, view.getTop());
            q1.c = true;
            a.invalidate();
            b();
            a.c();
        }
    }

    public int a(View view)
    {
        if (a.g(view))
        {
            return view.getWidth();
        } else
        {
            return 0;
        }
    }

    public int a(View view, int i, int j)
    {
        if (a.a(view, 3))
        {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        } else
        {
            j = a.getWidth();
            return Math.max(j - view.getWidth(), Math.min(i, j));
        }
    }

    public void a()
    {
        a.removeCallbacks(d);
    }

    public void a(int i)
    {
        a.a(b, i, c.c());
    }

    public void a(int i, int j)
    {
        a.postDelayed(d, 160L);
    }

    public void a(av av1)
    {
        c = av1;
    }

    public void a(View view, float f, float f1)
    {
        int k;
        f1 = a.d(view);
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

    public void a(View view, int i, int j, int k, int l)
    {
        j = view.getWidth();
        float f;
        if (a.a(view, 3))
        {
            f = (float)(j + i) / (float)j;
        } else
        {
            f = (float)(a.getWidth() - i) / (float)j;
        }
        a.b(view, f);
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

    public boolean a(View view, int i)
    {
        return a.g(view) && a.a(view, b) && a.a(view) == 0;
    }

    public int b(View view, int i, int j)
    {
        return view.getTop();
    }

    public void b(int i, int j)
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

    public void b(View view, int i)
    {
        ((q)view.getLayoutParams()).c = false;
        b();
    }

    public boolean b(int i)
    {
        return false;
    }
}
