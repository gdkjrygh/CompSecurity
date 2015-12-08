// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import dagger.internal.Factory;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            SelectProviderActivity

public final class module
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final .assertionsDisabled module;

    public static Factory create(module module1)
    {
        return new <init>(module1);
    }

    public SelectProviderActivity get()
    {
        SelectProviderActivity selectprovideractivity = module.module();
        if (selectprovideractivity == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return selectprovideractivity;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/accessenable/SelectProviderActivity$Module_ActivityFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    public ( )
    {
        if (!$assertionsDisabled &&  == null)
        {
            throw new AssertionError();
        } else
        {
            module = ;
            return;
        }
    }
}
