// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.SkyLib;
import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.util.ContactUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            ParticipantRemoveDialog

public final class ParticipantRemoveDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider contactUtilProvider;
    private final Provider libProvider;
    private final Provider objectInterfaceFinderProvider;

    public ParticipantRemoveDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2)
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
        contactUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            libProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new ParticipantRemoveDialog_MembersInjector(provider, provider1, provider2);
    }

    public static void injectContactUtil(ParticipantRemoveDialog participantremovedialog, Provider provider)
    {
        participantremovedialog.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectLib(ParticipantRemoveDialog participantremovedialog, Provider provider)
    {
        participantremovedialog.lib = (SkyLib)provider.get();
    }

    public final void injectMembers(ParticipantRemoveDialog participantremovedialog)
    {
        if (participantremovedialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(participantremovedialog, objectInterfaceFinderProvider);
            participantremovedialog.contactUtil = (ContactUtil)contactUtilProvider.get();
            participantremovedialog.lib = (SkyLib)libProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ParticipantRemoveDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/ParticipantRemoveDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
