// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.bluetooth;

import com.fitbit.e.a;

// Referenced classes of package com.fitbit.galileo.bluetooth:
//            f

public abstract class e extends f
{

    private f a;

    public e()
    {
    }

    static f a(e e1)
    {
        return e1.a;
    }

    protected abstract f a();

    protected void a(f f1)
    {
        if (!l())
        {
            f();
            return;
        } else
        {
            q();
            return;
        }
    }

    protected void b()
    {
        a = null;
    }

    protected void b(f f1)
    {
        a(f1.s());
        r();
    }

    protected void c(f f1)
    {
    }

    protected final void d()
    {
        if (a == null)
        {
            f();
        }
    }

    protected void d(f f1)
    {
        q();
    }

    protected void e()
    {
        if (a != null)
        {
            a.n();
            return;
        } else
        {
            q();
            return;
        }
    }

    protected void e(f f1)
    {
        p();
    }

    protected final void f()
    {
        a = a();
        if (a == null)
        {
            o();
            return;
        } else
        {
            com.fitbit.e.a.a(c(), "Executing nested task: %s", new Object[] {
                a
            });
            a.a(new _cls1());
            a.m();
            return;
        }
    }

    protected boolean g()
    {
        if (a != null)
        {
            a.n();
            return true;
        } else
        {
            return false;
        }
    }

    /* member class not found */
    class _cls1 {}

}
