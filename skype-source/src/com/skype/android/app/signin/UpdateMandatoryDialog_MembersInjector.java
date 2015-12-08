// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.res.Urls;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            UpdateMandatoryDialog

public final class UpdateMandatoryDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider objectInterfaceFinderProvider;
    private final Provider urlsProvider;

    public UpdateMandatoryDialog_MembersInjector(Provider provider, Provider provider1)
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
            urlsProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new UpdateMandatoryDialog_MembersInjector(provider, provider1);
    }

    public static void injectUrls(UpdateMandatoryDialog updatemandatorydialog, Provider provider)
    {
        updatemandatorydialog.urls = (Urls)provider.get();
    }

    public final void injectMembers(UpdateMandatoryDialog updatemandatorydialog)
    {
        if (updatemandatorydialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(updatemandatorydialog, objectInterfaceFinderProvider);
            updatemandatorydialog.urls = (Urls)urlsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UpdateMandatoryDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/UpdateMandatoryDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
