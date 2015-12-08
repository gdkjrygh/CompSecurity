// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.skylib.ObjectIdMap;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app:
//            ObjectInterfaceMenuDialog

public final class ObjectInterfaceMenuDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider mapProvider;
    private final Provider objectInterfaceFinderProvider;

    public ObjectInterfaceMenuDialog_MembersInjector(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            mapProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new ObjectInterfaceMenuDialog_MembersInjector(provider, provider1);
    }

    public static void injectMap(ObjectInterfaceMenuDialog objectinterfacemenudialog, Provider provider)
    {
        objectinterfacemenudialog.map = (ObjectIdMap)provider.get();
    }

    public final void injectMembers(ObjectInterfaceMenuDialog objectinterfacemenudialog)
    {
        if (objectinterfacemenudialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(objectinterfacemenudialog, objectInterfaceFinderProvider);
            objectinterfacemenudialog.map = (ObjectIdMap)mapProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ObjectInterfaceMenuDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/ObjectInterfaceMenuDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
