// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.core;

import dagger.MembersInjector;
import dagger.internal.Factory;

// Referenced classes of package com.nbcsports.liveextra.core:
//            CustomRxExecutionHook

public final class CustomRxExecutionHook_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final MembersInjector membersInjector;

    public CustomRxExecutionHook_Factory(MembersInjector membersinjector)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        } else
        {
            membersInjector = membersinjector;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector)
    {
        return new CustomRxExecutionHook_Factory(membersinjector);
    }

    public CustomRxExecutionHook get()
    {
        CustomRxExecutionHook customrxexecutionhook = new CustomRxExecutionHook();
        membersInjector.injectMembers(customrxexecutionhook);
        return customrxexecutionhook;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/core/CustomRxExecutionHook_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
