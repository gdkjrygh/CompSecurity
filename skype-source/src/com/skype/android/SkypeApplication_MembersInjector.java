// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.app.WakeupSchedulerAgent;
import com.skype.android.app.access.AccessAgent;
import com.skype.android.app.ads.AdManagerInitializer;
import com.skype.android.app.calling.CallAgent;
import com.skype.android.app.chat.MessageAgent;
import com.skype.android.app.contacts.ContactAgent;
import com.skype.android.app.media.MediaMessageAgent;
import com.skype.android.app.media.MediaSaveToGalleryAgent;
import com.skype.android.app.signin.AccountAgent;
import com.skype.android.app.transfer.TransferAgent;
import com.skype.android.crash.DumpUploader;
import com.skype.android.push.PushManager;
import com.skype.android.service.ContactsScrapeAgent;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.wakeup.ForegroundObserver;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeApplication

public final class SkypeApplication_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessAgentProvider;
    private final Provider accessibilityUtilProvider;
    private final Provider accountAgentProvider;
    private final Provider adManagerInitializerProvider;
    private final Provider callAgentProvider;
    private final Provider contactAgentProvider;
    private final Provider contactsScrapeAgentProvider;
    private final Provider dumpUploaderProvider;
    private final Provider foregroundObserverProvider;
    private final Provider mediaMessageAgentProvider;
    private final Provider mediaSaveToGalleryAgentProvider;
    private final Provider messageAgentProvider;
    private final Provider pushManagerProvider;
    private final Provider sctManagerProvider;
    private final Provider transferAgentProvider;
    private final Provider wakeupSchedulerAgentProvider;

    public SkypeApplication_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        foregroundObserverProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        pushManagerProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        dumpUploaderProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        adManagerInitializerProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        wakeupSchedulerAgentProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        accountAgentProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        callAgentProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        messageAgentProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        mediaSaveToGalleryAgentProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        transferAgentProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        contactAgentProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        accessAgentProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        accessibilityUtilProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        mediaMessageAgentProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        contactsScrapeAgentProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        } else
        {
            sctManagerProvider = provider15;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15)
    {
        return new SkypeApplication_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static void injectAccessAgent(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.l = (AccessAgent)provider.get();
    }

    public static void injectAccessibilityUtil(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.m = (AccessibilityUtil)provider.get();
    }

    public static void injectAccountAgent(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.f = (AccountAgent)provider.get();
    }

    public static void injectAdManagerInitializer(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.d = (AdManagerInitializer)provider.get();
    }

    public static void injectCallAgent(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.g = (CallAgent)provider.get();
    }

    public static void injectContactAgent(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.k = (ContactAgent)provider.get();
    }

    public static void injectContactsScrapeAgent(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.o = (ContactsScrapeAgent)provider.get();
    }

    public static void injectDumpUploader(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.c = (DumpUploader)provider.get();
    }

    public static void injectForegroundObserver(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.a = (ForegroundObserver)provider.get();
    }

    public static void injectMediaMessageAgent(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.n = (MediaMessageAgent)provider.get();
    }

    public static void injectMediaSaveToGalleryAgent(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.i = (MediaSaveToGalleryAgent)provider.get();
    }

    public static void injectMessageAgent(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.h = (MessageAgent)provider.get();
    }

    public static void injectPushManager(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.b = (PushManager)provider.get();
    }

    public static void injectSctManager(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.p = (SCTManager)provider.get();
    }

    public static void injectTransferAgent(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.j = (TransferAgent)provider.get();
    }

    public static void injectWakeupSchedulerAgent(SkypeApplication skypeapplication, Provider provider)
    {
        skypeapplication.e = (WakeupSchedulerAgent)provider.get();
    }

    public final void injectMembers(SkypeApplication skypeapplication)
    {
        if (skypeapplication == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            skypeapplication.a = (ForegroundObserver)foregroundObserverProvider.get();
            skypeapplication.b = (PushManager)pushManagerProvider.get();
            skypeapplication.c = (DumpUploader)dumpUploaderProvider.get();
            skypeapplication.d = (AdManagerInitializer)adManagerInitializerProvider.get();
            skypeapplication.e = (WakeupSchedulerAgent)wakeupSchedulerAgentProvider.get();
            skypeapplication.f = (AccountAgent)accountAgentProvider.get();
            skypeapplication.g = (CallAgent)callAgentProvider.get();
            skypeapplication.h = (MessageAgent)messageAgentProvider.get();
            skypeapplication.i = (MediaSaveToGalleryAgent)mediaSaveToGalleryAgentProvider.get();
            skypeapplication.j = (TransferAgent)transferAgentProvider.get();
            skypeapplication.k = (ContactAgent)contactAgentProvider.get();
            skypeapplication.l = (AccessAgent)accessAgentProvider.get();
            skypeapplication.m = (AccessibilityUtil)accessibilityUtilProvider.get();
            skypeapplication.n = (MediaMessageAgent)mediaMessageAgentProvider.get();
            skypeapplication.o = (ContactsScrapeAgent)contactsScrapeAgentProvider.get();
            skypeapplication.p = (SCTManager)sctManagerProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SkypeApplication)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeApplication_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
