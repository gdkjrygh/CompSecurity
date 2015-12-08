// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.ringtone.RingtoneStorage;
import com.skype.android.util.ConversationUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.account:
//            CustomizeRingtoneDialog

public final class CustomizeRingtoneDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider conversationUtilProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider ringtoneStorageProvider;

    public CustomizeRingtoneDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2)
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
        ringtoneStorageProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            conversationUtilProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new CustomizeRingtoneDialog_MembersInjector(provider, provider1, provider2);
    }

    public static void injectConversationUtil(CustomizeRingtoneDialog customizeringtonedialog, Provider provider)
    {
        customizeringtonedialog.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectRingtoneStorage(CustomizeRingtoneDialog customizeringtonedialog, Provider provider)
    {
        customizeringtonedialog.ringtoneStorage = (RingtoneStorage)provider.get();
    }

    public final void injectMembers(CustomizeRingtoneDialog customizeringtonedialog)
    {
        if (customizeringtonedialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(customizeringtonedialog, objectInterfaceFinderProvider);
            customizeringtonedialog.ringtoneStorage = (RingtoneStorage)ringtoneStorageProvider.get();
            customizeringtonedialog.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CustomizeRingtoneDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/account/CustomizeRingtoneDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
