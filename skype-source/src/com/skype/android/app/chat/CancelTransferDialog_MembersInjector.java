// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.SkyLib;
import com.skype.android.SkypeDialogFragment_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            CancelTransferDialog

public final class CancelTransferDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider libProvider;
    private final Provider objectInterfaceFinderProvider;

    public CancelTransferDialog_MembersInjector(Provider provider, Provider provider1)
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
            libProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new CancelTransferDialog_MembersInjector(provider, provider1);
    }

    public static void injectLib(CancelTransferDialog canceltransferdialog, Provider provider)
    {
        canceltransferdialog.lib = (SkyLib)provider.get();
    }

    public final void injectMembers(CancelTransferDialog canceltransferdialog)
    {
        if (canceltransferdialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(canceltransferdialog, objectInterfaceFinderProvider);
            canceltransferdialog.lib = (SkyLib)libProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CancelTransferDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/CancelTransferDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
