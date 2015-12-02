// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;


// Referenced classes of package com.facebook.reflex:
//            Countable

public abstract class d extends Countable
{

    private boolean b;

    public d()
    {
        b = false;
    }

    protected abstract void a();

    protected abstract void c();

    public void d()
    {
        if (!e())
        {
            b = true;
            f();
        }
    }

    public boolean e()
    {
        return b;
    }

    public void f()
    {
        if (e())
        {
            c();
        }
    }

    public void g()
    {
        if (e())
        {
            b = false;
            a();
        }
    }
}
