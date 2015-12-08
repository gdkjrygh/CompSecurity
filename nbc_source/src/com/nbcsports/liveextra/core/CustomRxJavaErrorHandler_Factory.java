// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.core;

import dagger.MembersInjector;
import dagger.internal.Factory;

// Referenced classes of package com.nbcsports.liveextra.core:
//            CustomRxJavaErrorHandler

public final class CustomRxJavaErrorHandler_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final MembersInjector membersInjector;

    public CustomRxJavaErrorHandler_Factory(MembersInjector membersinjector)
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
        return new CustomRxJavaErrorHandler_Factory(membersinjector);
    }

    public CustomRxJavaErrorHandler get()
    {
        CustomRxJavaErrorHandler customrxjavaerrorhandler = new CustomRxJavaErrorHandler();
        membersInjector.injectMembers(customrxjavaerrorhandler);
        return customrxjavaerrorhandler;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/core/CustomRxJavaErrorHandler_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
