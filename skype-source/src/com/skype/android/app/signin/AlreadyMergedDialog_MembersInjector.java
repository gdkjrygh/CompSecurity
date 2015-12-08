// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            SignInNavigation, AlreadyMergedDialog

public final class AlreadyMergedDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider objectInterfaceFinderProvider;
    private final Provider signInNavigationProvider;

    public AlreadyMergedDialog_MembersInjector(Provider provider, Provider provider1)
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
            signInNavigationProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new AlreadyMergedDialog_MembersInjector(provider, provider1);
    }

    public static void injectSignInNavigation(AlreadyMergedDialog alreadymergeddialog, Provider provider)
    {
        alreadymergeddialog.signInNavigation = (SignInNavigation)provider.get();
    }

    public final void injectMembers(AlreadyMergedDialog alreadymergeddialog)
    {
        if (alreadymergeddialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(alreadymergeddialog, objectInterfaceFinderProvider);
            alreadymergeddialog.signInNavigation = (SignInNavigation)signInNavigationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AlreadyMergedDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/AlreadyMergedDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
