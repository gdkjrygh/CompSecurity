// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout, j

private class b extends b
{

    final DrawerLayout a;
    private final int b;
    private j c;
    private final Runnable d = new Runnable() {

        final DrawerLayout.d a;

        public void run()
        {
            DrawerLayout.d.a(a);
        }

            
            {
                a = DrawerLayout.d.this;
                super();
            }
    };

    static void a(b b1)
    {
        b1.c();
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
        int k = c.b();
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
            i += k;
        } else
        {
            view = a.b(5);
            i = a.getWidth();
            i -= k;
        }
        if (view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && a.a(view) == 0)
        {
            youtParams youtparams = (youtParams)view.getLayoutParams();
            c.a(view, i, view.getTop());
            youtparams.c = true;
            a.invalidate();
            b();
            a.c();
        }
    }

    public int a(View view)
    {
        return view.getWidth();
    }

    public int a(View view, int i, int k)
    {
        if (a.a(view, 3))
        {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        } else
        {
            k = a.getWidth();
            return Math.max(k - view.getWidth(), Math.min(i, k));
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

    public void a(int i, int k)
    {
        a.postDelayed(d, 160L);
    }

    public void a(j j1)
    {
        c = j1;
    }

    public void a(View view, float f, float f1)
    {
        int l;
        f1 = a.d(view);
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
        int k = a.getWidth();
        if (f >= 0.0F)
        {
            i = k;
            if (f != 0.0F)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = k;
            if (f1 <= 0.5F)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i = k - l;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(View view, int i, int k, int l, int i1)
    {
        k = view.getWidth();
        float f;
        if (a.a(view, 3))
        {
            f = (float)(k + i) / (float)k;
        } else
        {
            f = (float)(a.getWidth() - i) / (float)k;
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

    public int b(View view, int i, int k)
    {
        return view.getTop();
    }

    public void b(int i, int k)
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
            c.a(view, k);
        }
    }

    public void b(View view, int i)
    {
        ((youtParams)view.getLayoutParams()).c = false;
        b();
    }

    public boolean b(int i)
    {
        return false;
    }

    public _cls1.a(DrawerLayout drawerlayout, int i)
    {
        a = drawerlayout;
        super();
        b = i;
    }
}
