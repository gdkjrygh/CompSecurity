// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.media.AudioManager;
import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.pcmhost.PcmHost;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            PlayVoicemailDialog

public final class PlayVoicemailDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider audioManagerProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider pcmHostProvider;

    public PlayVoicemailDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2)
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
        audioManagerProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            pcmHostProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new PlayVoicemailDialog_MembersInjector(provider, provider1, provider2);
    }

    public static void injectAudioManager(PlayVoicemailDialog playvoicemaildialog, Provider provider)
    {
        playvoicemaildialog.audioManager = (AudioManager)provider.get();
    }

    public static void injectPcmHost(PlayVoicemailDialog playvoicemaildialog, Provider provider)
    {
        playvoicemaildialog.pcmHost = (PcmHost)provider.get();
    }

    public final void injectMembers(PlayVoicemailDialog playvoicemaildialog)
    {
        if (playvoicemaildialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(playvoicemaildialog, objectInterfaceFinderProvider);
            playvoicemaildialog.audioManager = (AudioManager)audioManagerProvider.get();
            playvoicemaildialog.pcmHost = (PcmHost)pcmHostProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlayVoicemailDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/PlayVoicemailDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
