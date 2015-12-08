// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;


// Referenced classes of package com.skype.android.inject:
//            DaggerActivityComponent, ActivityModule, ApplicationComponent, ActivityComponent

public static final class <init>
{

    private ActivityModule activityModule;
    private ApplicationComponent applicationComponent;

    public final <init> activityModule(ActivityModule activitymodule)
    {
        if (activitymodule == null)
        {
            throw new NullPointerException("activityModule");
        } else
        {
            activityModule = activitymodule;
            return this;
        }
    }

    public final activityModule applicationComponent(ApplicationComponent applicationcomponent)
    {
        if (applicationcomponent == null)
        {
            throw new NullPointerException("applicationComponent");
        } else
        {
            applicationComponent = applicationcomponent;
            return this;
        }
    }

    public final ActivityComponent build()
    {
        if (activityModule == null)
        {
            throw new IllegalStateException("activityModule must be set");
        }
        if (applicationComponent == null)
        {
            throw new IllegalStateException("applicationComponent must be set");
        } else
        {
            return new DaggerActivityComponent(this, null);
        }
    }


    private ()
    {
    }

    ( )
    {
        this();
    }
}
