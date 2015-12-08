// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;


// Referenced classes of package com.skype.android.inject:
//            DaggerApplicationComponent, ApplicationModule, ApplicationComponent

public static final class <init>
{

    private ApplicationModule applicationModule;

    public final <init> applicationModule(ApplicationModule applicationmodule)
    {
        if (applicationmodule == null)
        {
            throw new NullPointerException("applicationModule");
        } else
        {
            applicationModule = applicationmodule;
            return this;
        }
    }

    public final ApplicationComponent build()
    {
        if (applicationModule == null)
        {
            throw new IllegalStateException("applicationModule must be set");
        } else
        {
            return new DaggerApplicationComponent(this, null);
        }
    }


    private A()
    {
    }

    A(A a)
    {
        this();
    }
}
