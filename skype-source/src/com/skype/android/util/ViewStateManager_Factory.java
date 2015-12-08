// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import dagger.MembersInjector;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.util:
//            ViewStateManager

public final class ViewStateManager_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final MembersInjector membersInjector;

    public ViewStateManager_Factory(MembersInjector membersinjector)
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
        return new ViewStateManager_Factory(membersinjector);
    }

    public final ViewStateManager get()
    {
        ViewStateManager viewstatemanager = new ViewStateManager();
        membersInjector.injectMembers(viewstatemanager);
        return viewstatemanager;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/util/ViewStateManager_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
