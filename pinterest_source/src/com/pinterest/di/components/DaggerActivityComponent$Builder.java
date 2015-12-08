// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.components;

import com.pinterest.di.modules.ActivityModule;

// Referenced classes of package com.pinterest.di.components:
//            DaggerActivityComponent, ApplicationComponent, ActivityComponent

public final class <init>
{

    private ActivityModule a;
    private ApplicationComponent b;

    static ApplicationComponent a(<init> <init>1)
    {
        return <init>1.b;
    }

    static ActivityModule b(b b1)
    {
        return b1.a;
    }

    public final ActivityComponent a()
    {
        if (a == null)
        {
            throw new IllegalStateException("activityModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("applicationComponent must be set");
        } else
        {
            return new DaggerActivityComponent(this, (byte)0);
        }
    }

    public final b a(ApplicationComponent applicationcomponent)
    {
        if (applicationcomponent == null)
        {
            throw new NullPointerException("applicationComponent");
        } else
        {
            b = applicationcomponent;
            return this;
        }
    }

    public final b a(ActivityModule activitymodule)
    {
        if (activitymodule == null)
        {
            throw new NullPointerException("activityModule");
        } else
        {
            a = activitymodule;
            return this;
        }
    }

    private A()
    {
    }

    A(byte byte0)
    {
        this();
    }
}
