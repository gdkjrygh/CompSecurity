// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.e;


// Referenced classes of package com.mobvista.sdk.m.a.e:
//            d

public abstract class c
    implements Runnable
{

    private int a;
    protected boolean c;
    protected d d;
    protected int e;

    public c()
    {
        c = true;
        e = 1;
        a = 0;
    }

    public abstract void a();

    final void a(int i)
    {
        a = i;
    }

    public final void a(d d1)
    {
        d = d1;
    }

    public final int b()
    {
        return a;
    }

    public void run()
    {
        if (d != null)
        {
            d.a(this);
        }
        a();
        if (d != null)
        {
            d.b(this);
        }
    }
}
