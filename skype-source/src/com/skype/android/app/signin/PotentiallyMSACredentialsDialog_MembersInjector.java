// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            SignInNavigation, PotentiallyMSACredentialsDialog

public final class PotentiallyMSACredentialsDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider objectInterfaceFinderProvider;
    private final Provider signInNavigationProvider;

    public PotentiallyMSACredentialsDialog_MembersInjector(Provider provider, Provider provider1)
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
        return new PotentiallyMSACredentialsDialog_MembersInjector(provider, provider1);
    }

    public static void injectSignInNavigation(PotentiallyMSACredentialsDialog potentiallymsacredentialsdialog, Provider provider)
    {
        potentiallymsacredentialsdialog.signInNavigation = (SignInNavigation)provider.get();
    }

    public final void injectMembers(PotentiallyMSACredentialsDialog potentiallymsacredentialsdialog)
    {
        if (potentiallymsacredentialsdialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(potentiallymsacredentialsdialog, objectInterfaceFinderProvider);
            potentiallymsacredentialsdialog.signInNavigation = (SignInNavigation)signInNavigationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PotentiallyMSACredentialsDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/PotentiallyMSACredentialsDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
