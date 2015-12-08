// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            yc, xr

public abstract class yb
{

    protected volatile int n;

    public yb()
    {
        n = -1;
    }

    protected int a()
    {
        return 0;
    }

    public void a(xr xr)
    {
    }

    public yb b()
    {
        return (yb)super.clone();
    }

    public final int c()
    {
        if (n < 0)
        {
            d();
        }
        return n;
    }

    public Object clone()
    {
        return b();
    }

    public final int d()
    {
        int i = a();
        n = i;
        return i;
    }

    public String toString()
    {
        return yc.a(this);
    }
}
