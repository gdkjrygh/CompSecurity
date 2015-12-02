// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.content.Context;
import android.view.WindowManager;

// Referenced classes of package com.qihoo.security.floatview.ui:
//            c, i, b

public class a extends c
{

    private static final String t = com/qihoo/security/floatview/ui/a.getSimpleName();
    b a;
    private i u;
    private int v;
    private boolean w;
    private boolean x;

    public a(Context context, String s, String s1, String s2, String s3, boolean flag, c.a a1)
    {
        super(context, s, s1, s2, s3, flag, a1);
        u = null;
        v = 0;
        w = false;
        x = true;
        a = null;
        m();
    }

    private void m()
    {
        u = new i(getContext());
        addView(u);
        n();
    }

    private void n()
    {
        u.g();
        switch (getSide())
        {
        default:
            return;

        case 0: // '\0'
        case 2: // '\002'
            u.d();
            return;

        case 1: // '\001'
        case 3: // '\003'
            u.f();
            break;
        }
    }

    public void a()
    {
        if (u != null)
        {
            u.a();
        }
    }

    public void a(int j)
    {
        super.a(j);
        if (u == null || w)
        {
            return;
        } else
        {
            n();
            return;
        }
    }

    protected void a(int j, int k)
    {
        super.a(j, k);
        b b1 = getActionListener();
        if (b1 != null)
        {
            b1.a(j, k);
        }
    }

    protected void a(android.view.WindowManager.LayoutParams layoutparams)
    {
        if (!d())
        {
            return;
        } else
        {
            super.a(layoutparams);
            return;
        }
    }

    public void a(boolean flag)
    {
label0:
        {
            if (w != flag)
            {
                w = flag;
                if (!flag)
                {
                    break label0;
                }
                u.e();
            }
            return;
        }
        n();
    }

    protected boolean a(int j, int k, boolean flag)
    {
        boolean flag1 = super.a(j, k, flag);
        b b1 = getActionListener();
        if (b1 != null)
        {
            flag1 = b1.a(j, k, flag);
        }
        return flag1;
    }

    public void b()
    {
        if (u != null)
        {
            u.b();
        }
    }

    public void b(int j)
    {
        if (u != null && v != j)
        {
            try
            {
                u.a(j);
            }
            catch (Exception exception) { }
            catch (Error error) { }
            if (!h() && (v == 0 || j == 0 || v / 10 != j / 10))
            {
                k();
            }
            v = j;
        }
    }

    public void b(boolean flag)
    {
        h.x = q;
        h.y = r;
        if (h.x >= i / 2)
        {
            h.x = i - getWidthOnSide();
            setSide(1);
        } else
        {
            h.x = 0;
            setSide(0);
        }
        if (isShown() && flag)
        {
            g.updateViewLayout(this, h);
        }
    }

    public void c()
    {
        if (u != null)
        {
            u.c();
        }
    }

    public boolean d()
    {
        return u.getVisibility() == 0;
    }

    public void e()
    {
        b b1 = getActionListener();
        if (b1 != null)
        {
            b1.a();
        }
    }

    public boolean f()
    {
        a(false);
        b b1 = getActionListener();
        if (b1 != null)
        {
            b1.b();
        }
        boolean flag = super.f();
        u.g();
        if (flag && !w)
        {
            if (x)
            {
                a();
            } else
            {
                c();
            }
        }
        if (flag)
        {
            x = false;
        }
        return flag;
    }

    public void g()
    {
        b b1 = getActionListener();
        if (b1 != null)
        {
            b1.c();
        }
        super.g();
    }

    public b getActionListener()
    {
        return a;
    }

    public int getCurX()
    {
        return k;
    }

    public int getCurY()
    {
        return m;
    }

    public int getDownX()
    {
        return o;
    }

    public int getDownY()
    {
        return p;
    }

    public i getMemoryUsageView()
    {
        return u;
    }

    public int getPercent()
    {
        return v;
    }

    public int getWidthOnSide()
    {
        if (u != null)
        {
            return u.getWidthOnSide();
        } else
        {
            return super.getWidthOnSide();
        }
    }

    public boolean h()
    {
        return s;
    }

    public boolean i()
    {
        return x;
    }

    public void setActionListener(b b1)
    {
        a = b1;
    }

}
