// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import com.a.a.a;
import com.a.a.q;
import com.facebook.ui.a.e;
import com.google.common.base.Preconditions;
import com.google.common.d.a.i;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.orca.chatheads:
//            dw

public class dv
{

    protected static final int a;
    private final WindowManager b;
    private android.view.WindowManager.LayoutParams c;
    private View d;
    private boolean e;
    private double f;
    private a g;
    private s h;
    private Handler i;
    private int j;
    private boolean k;

    public dv(WindowManager windowmanager, android.view.WindowManager.LayoutParams layoutparams)
    {
        b = windowmanager;
        c = layoutparams;
        k = true;
        i = new Handler();
        b(true);
        c(false);
    }

    private void a(int i1, boolean flag)
    {
        android.view.WindowManager.LayoutParams layoutparams = k();
        if (flag)
        {
            i1 = layoutparams.flags | i1;
        } else
        {
            i1 = layoutparams.flags & ~i1;
        }
        if (i1 != layoutparams.flags)
        {
            layoutparams.flags = i1;
            a(layoutparams);
        }
    }

    protected s a(float f1, int i1)
    {
        if (f == (double)f1)
        {
            if (h == null)
            {
                h = com.google.common.d.a.i.a(null);
            }
            return h;
        }
        if (g != null && g.e())
        {
            g.b();
        }
        f = f1;
        g = q.a(this, "alpha", new float[] {
            f1
        });
        g.a(i1);
        g.a();
        h = new e(g);
        return h;
    }

    public void a()
    {
        if (e)
        {
            return;
        } else
        {
            b.addView(d, c);
            e = true;
            i.post(new dw(this));
            return;
        }
    }

    public void a(View view)
    {
        Preconditions.checkNotNull(view);
        boolean flag;
        if (d == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        d = view;
    }

    protected void a(android.view.WindowManager.LayoutParams layoutparams)
    {
        if (e && j == 0)
        {
            b.updateViewLayout(d, layoutparams);
            k = false;
            return;
        } else
        {
            c = layoutparams;
            k = true;
            return;
        }
    }

    public void b()
    {
        if (!e)
        {
            return;
        } else
        {
            c = k();
            b.removeView(d);
            e = false;
            return;
        }
    }

    protected void b(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(16, flag);
    }

    public void c(int i1)
    {
        android.view.WindowManager.LayoutParams layoutparams = k();
        if (layoutparams.width != i1)
        {
            layoutparams.width = i1;
            a(layoutparams);
        }
    }

    protected void c(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(8, flag);
    }

    public void d(int i1)
    {
        android.view.WindowManager.LayoutParams layoutparams = k();
        if (layoutparams.height != i1)
        {
            layoutparams.height = i1;
            a(layoutparams);
        }
    }

    public s e(int i1)
    {
        return a(1.0F, i1);
    }

    public s f(int i1)
    {
        return a(0.0F, i1);
    }

    public float getAlpha()
    {
        return k().alpha;
    }

    public int getX()
    {
        return k().x;
    }

    public int getY()
    {
        return k().y;
    }

    public View h()
    {
        return d;
    }

    public boolean i()
    {
        return e;
    }

    public void j()
    {
        setX(0x186a0);
    }

    protected android.view.WindowManager.LayoutParams k()
    {
        if (e && j == 0)
        {
            return (android.view.WindowManager.LayoutParams)d.getLayoutParams();
        } else
        {
            return c;
        }
    }

    public void l()
    {
        int i1 = j;
        j = i1 + 1;
        if (i1 == 0)
        {
            c = k();
        }
    }

    public void m()
    {
        int i1 = j - 1;
        j = i1;
        if (i1 == 0 && k)
        {
            a(c);
        }
    }

    public void setAlpha(float f1)
    {
        android.view.WindowManager.LayoutParams layoutparams = k();
        if (layoutparams.alpha != f1)
        {
            layoutparams.alpha = f1;
            a(layoutparams);
        }
    }

    public void setX(int i1)
    {
        i.removeCallbacksAndMessages(null);
        android.view.WindowManager.LayoutParams layoutparams = k();
        if (layoutparams.x != i1)
        {
            layoutparams.x = i1;
            a(layoutparams);
        }
    }

    public void setY(int i1)
    {
        i.removeCallbacksAndMessages(null);
        android.view.WindowManager.LayoutParams layoutparams = k();
        if (layoutparams.y != i1)
        {
            layoutparams.y = i1;
            a(layoutparams);
        }
    }

    static 
    {
        int i1;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            i1 = 2002;
        } else
        {
            i1 = 2007;
        }
        a = i1;
    }
}
