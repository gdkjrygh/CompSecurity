// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui.controller;

import com.fitbit.synclair.SynclairManager;
import com.fitbit.synclair.config.bean.DeviceBaseConfigBean;
import com.fitbit.synclair.ui.SynclairActivity;
import com.fitbit.synclair.ui.states.SynclairScreenState;
import com.fitbit.synclair.ui.states.a.d;
import com.fitbit.synclair.ui.states.c.a;
import com.fitbit.synclair.ui.states.c.b;

public abstract class c
{

    protected DeviceBaseConfigBean a;
    protected SynclairActivity b;
    protected com.fitbit.synclair.ui.states.b.d c;
    protected d d;
    protected SynclairScreenState e;
    protected int f;

    public c()
    {
        a = null;
        f = 0;
    }

    public boolean A()
    {
        return x() || w();
    }

    public void B()
    {
        if (e != null)
        {
            SynclairActivity synclairactivity = b;
            b b1 = a(e, f);
            boolean flag;
            if (!z())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            synclairactivity.b(b1, flag);
        }
    }

    public void C()
    {
        b.b(new a(SynclairScreenState.a, null, g()), false);
    }

    public void D()
    {
        if (e())
        {
            f = f + 1;
        } else
        {
            f = 0;
            e = d.a(e);
        }
        B();
    }

    public void E()
    {
        if (x())
        {
            f = f - 1;
            B();
        } else
        if (w())
        {
            f = 0;
            e = d.b(e);
            while (e()) 
            {
                f = f + 1;
            }
            B();
            return;
        }
    }

    public void F()
    {
        b.a(new a(SynclairScreenState.a, null, g()), false);
    }

    protected Boolean G()
    {
        if (e == null)
        {
            return null;
        }
        boolean flag;
        if (SynclairScreenState.g.equals(e) || SynclairScreenState.h.equals(e) || SynclairScreenState.m.equals(e) || SynclairScreenState.i.equals(e))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public abstract b a(SynclairScreenState synclairscreenstate, int k);

    public abstract void a();

    public void a(SynclairScreenState synclairscreenstate)
    {
        f = 0;
        e = synclairscreenstate;
        B();
    }

    public abstract int b();

    public abstract void d();

    protected abstract boolean e();

    public abstract void f();

    protected abstract String g();

    public abstract void h();

    public abstract com.fitbit.synclair.ui.SynclairActivity.ExitMessageTypes i();

    public abstract SynclairManager j();

    public void q()
    {
        a(SynclairScreenState.r);
    }

    public boolean r()
    {
        return false;
    }

    public DeviceBaseConfigBean t()
    {
        return a;
    }

    public SynclairScreenState u()
    {
        return e;
    }

    public boolean v()
    {
        return d.a(e) != null;
    }

    public boolean w()
    {
        return d.b(e) != null;
    }

    public boolean x()
    {
        return f > 0;
    }

    public com.fitbit.synclair.ui.states.b.d y()
    {
        return c;
    }

    public boolean z()
    {
        return e() || v();
    }
}
