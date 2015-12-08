// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import com.nbcsports.liveextra.library.configuration.Sport;
import dagger.internal.Factory;

public final class module
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final .assertionsDisabled module;

    public static Factory create(module module1)
    {
        return new <init>(module1);
    }

    public Sport get()
    {
        return module.module();
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/MainNavigationContentActivity$Module_SportFactory.desiredAssertionStatus())
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
