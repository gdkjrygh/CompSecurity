// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import com.skype.Account;
import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.util.ImageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.account:
//            ChangeAvatarDialog

public final class ChangeAvatarDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider imageCacheProvider;
    private final Provider objectInterfaceFinderProvider;

    public ChangeAvatarDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            imageCacheProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new ChangeAvatarDialog_MembersInjector(provider, provider1, provider2);
    }

    public static void injectAccount(ChangeAvatarDialog changeavatardialog, Provider provider)
    {
        changeavatardialog.account = (Account)provider.get();
    }

    public static void injectImageCache(ChangeAvatarDialog changeavatardialog, Provider provider)
    {
        changeavatardialog.imageCache = (ImageCache)provider.get();
    }

    public final void injectMembers(ChangeAvatarDialog changeavatardialog)
    {
        if (changeavatardialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(changeavatardialog, objectInterfaceFinderProvider);
            changeavatardialog.account = (Account)accountProvider.get();
            changeavatardialog.imageCache = (ImageCache)imageCacheProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ChangeAvatarDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/account/ChangeAvatarDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
