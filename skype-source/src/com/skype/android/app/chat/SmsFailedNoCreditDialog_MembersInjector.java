// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.app.NavigationUrl;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            SmsFailedNoCreditDialog

public final class SmsFailedNoCreditDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider navigationUrlProvider;
    private final Provider objectInterfaceFinderProvider;

    public SmsFailedNoCreditDialog_MembersInjector(Provider provider, Provider provider1)
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
            navigationUrlProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new SmsFailedNoCreditDialog_MembersInjector(provider, provider1);
    }

    public static void injectNavigationUrl(SmsFailedNoCreditDialog smsfailednocreditdialog, Provider provider)
    {
        smsfailednocreditdialog.navigationUrl = (NavigationUrl)provider.get();
    }

    public final void injectMembers(SmsFailedNoCreditDialog smsfailednocreditdialog)
    {
        if (smsfailednocreditdialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(smsfailednocreditdialog, objectInterfaceFinderProvider);
            smsfailednocreditdialog.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SmsFailedNoCreditDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/SmsFailedNoCreditDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
