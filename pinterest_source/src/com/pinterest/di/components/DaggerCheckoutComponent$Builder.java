// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.components;

import com.pinterest.di.modules.CheckoutModule;

// Referenced classes of package com.pinterest.di.components:
//            DaggerCheckoutComponent, ActivityComponent, CheckoutComponent

public final class <init>
{

    private CheckoutModule a;
    private ActivityComponent b;

    static ActivityComponent a(<init> <init>1)
    {
        return <init>1.b;
    }

    static CheckoutModule b(b b1)
    {
        return b1.a;
    }

    public final CheckoutComponent a()
    {
        if (a == null)
        {
            throw new IllegalStateException("checkoutModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("activityComponent must be set");
        } else
        {
            return new DaggerCheckoutComponent(this, (byte)0);
        }
    }

    public final b a(ActivityComponent activitycomponent)
    {
        if (activitycomponent == null)
        {
            throw new NullPointerException("activityComponent");
        } else
        {
            b = activitycomponent;
            return this;
        }
    }

    public final b a(CheckoutModule checkoutmodule)
    {
        a = checkoutmodule;
        return this;
    }

    private A()
    {
    }

    A(byte byte0)
    {
        this();
    }
}
