// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.components;

import com.pinterest.di.modules.ApiBaseModule;
import com.pinterest.di.modules.ApiModule;
import com.pinterest.di.modules.ApplicationModule;
import com.pinterest.di.modules.DeviceModule;

// Referenced classes of package com.pinterest.di.components:
//            DaggerApplicationComponent, ApplicationComponent

public final class <init>
{

    private ApplicationModule a;
    private ApiModule b;
    private DeviceModule c;
    private ApiBaseModule d;

    static ApplicationModule a(<init> <init>1)
    {
        return <init>1.a;
    }

    static ApiBaseModule b(a a1)
    {
        return a1.d;
    }

    static ApiModule c(d d1)
    {
        return d1.b;
    }

    static DeviceModule d(b b1)
    {
        return b1.c;
    }

    public final ApplicationComponent a()
    {
        if (a == null)
        {
            throw new IllegalStateException("applicationModule must be set");
        }
        if (b == null)
        {
            b = new ApiModule();
        }
        if (c == null)
        {
            c = new DeviceModule();
        }
        if (d == null)
        {
            d = new ApiBaseModule();
        }
        return new DaggerApplicationComponent(this, (byte)0);
    }

    public final d a(ApplicationModule applicationmodule)
    {
        a = applicationmodule;
        return this;
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
