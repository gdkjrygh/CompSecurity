// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.app.transfer.TransferUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            TransferDetailsDialog

public final class TransferDetailsDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider objectInterfaceFinderProvider;
    private final Provider transferUtilProvider;

    public TransferDetailsDialog_MembersInjector(Provider provider, Provider provider1)
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
            transferUtilProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new TransferDetailsDialog_MembersInjector(provider, provider1);
    }

    public static void injectTransferUtil(TransferDetailsDialog transferdetailsdialog, Provider provider)
    {
        transferdetailsdialog.transferUtil = (TransferUtil)provider.get();
    }

    public final void injectMembers(TransferDetailsDialog transferdetailsdialog)
    {
        if (transferdetailsdialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(transferdetailsdialog, objectInterfaceFinderProvider);
            transferdetailsdialog.transferUtil = (TransferUtil)transferUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((TransferDetailsDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/TransferDetailsDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
