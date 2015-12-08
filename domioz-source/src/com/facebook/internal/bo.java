// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//            bn, bl

final class bo
    implements bn
{

    static final boolean a;
    final bl b;
    private final Runnable c;
    private bo d;
    private bo e;
    private boolean f;

    bo(bl bl1, Runnable runnable)
    {
        b = bl1;
        super();
        c = runnable;
    }

    final bo a(bo bo1)
    {
        if (!a && d == null)
        {
            throw new AssertionError();
        }
        if (!a && e == null)
        {
            throw new AssertionError();
        }
        bo bo2 = bo1;
        if (bo1 == this)
        {
            if (d == this)
            {
                bo2 = null;
            } else
            {
                bo2 = d;
            }
        }
        d.e = e;
        e.d = d;
        e = null;
        d = null;
        return bo2;
    }

    final bo a(bo bo1, boolean flag)
    {
        if (!a && d != null)
        {
            throw new AssertionError();
        }
        if (!a && e != null)
        {
            throw new AssertionError();
        }
        if (bo1 == null)
        {
            e = this;
            d = this;
            bo1 = this;
        } else
        {
            d = bo1;
            e = bo1.e;
            bo bo2 = d;
            e.d = this;
            bo2.e = this;
        }
        if (flag)
        {
            return this;
        } else
        {
            return bo1;
        }
    }

    final Runnable a()
    {
        return c;
    }

    final void b()
    {
        f = true;
    }

    static 
    {
        boolean flag;
        if (!com/facebook/internal/bl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
