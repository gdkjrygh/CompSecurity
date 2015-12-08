// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import com.nbcsports.liveextra.ApplicationComponent;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            DaggerSelectProviderActivity_Component

public static final class <init>
{

    private ApplicationComponent applicationComponent;
    private module module;

    public <init> applicationComponent(ApplicationComponent applicationcomponent)
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

    public applicationComponent build()
    {
        if (module == null)
        {
            throw new IllegalStateException("module must be set");
        }
        if (applicationComponent == null)
        {
            throw new IllegalStateException("applicationComponent must be set");
        } else
        {
            return new DaggerSelectProviderActivity_Component(this, null);
        }
    }

    public applicationComponent module(applicationComponent applicationcomponent)
    {
        if (applicationcomponent == null)
        {
            throw new NullPointerException("module");
        } else
        {
            module = applicationcomponent;
            return this;
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
