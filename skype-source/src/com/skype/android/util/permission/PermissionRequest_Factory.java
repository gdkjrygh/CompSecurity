// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.permission;

import android.app.Activity;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.util.permission:
//            PermissionRequest, PermissionRequestStorage

public final class PermissionRequest_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider activityProvider;
    private final MembersInjector membersInjector;
    private final Provider requestStorageProvider;

    public PermissionRequest_Factory(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        activityProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            requestStorageProvider = provider1;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        return new PermissionRequest_Factory(membersinjector, provider, provider1);
    }

    public final PermissionRequest get()
    {
        PermissionRequest permissionrequest = new PermissionRequest((Activity)activityProvider.get(), (PermissionRequestStorage)requestStorageProvider.get());
        membersInjector.injectMembers(permissionrequest);
        return permissionrequest;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/util/permission/PermissionRequest_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
