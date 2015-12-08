// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.inputmethod.InputMethodManager;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.contacts.ContactSearchAdapter;
import com.skype.android.app.recents.RecentAdapter;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.res.ChatText;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ViewStateManager;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            AddParticipantsActivity

public final class AddParticipantsActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider asyncProvider;
    private final Provider chatTextProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider immProvider;
    private final Provider layoutExperienceProvider;
    private final Provider mapProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider recentAdapterProvider;
    private final Provider searchAdapterProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;
    private final Provider viewStateProvider;

    public AddParticipantsActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        upActionObserverProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        analyticsObserverProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        analyticsInAppObserverProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        shakeBugReportObserverProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        crashReporterProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        typeFaceTextStyleCallbackProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        activityAccountStateObserverProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        asyncProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        viewStateProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        recentAdapterProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        immProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        }
        searchAdapterProvider = provider17;
        if (!$assertionsDisabled && provider18 == null)
        {
            throw new AssertionError();
        } else
        {
            chatTextProvider = provider18;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18)
    {
        return new AddParticipantsActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    public static void injectAsync(AddParticipantsActivity addparticipantsactivity, Provider provider)
    {
        addparticipantsactivity.async = (AsyncService)provider.get();
    }

    public static void injectChatText(AddParticipantsActivity addparticipantsactivity, Provider provider)
    {
        addparticipantsactivity.chatText = (ChatText)provider.get();
    }

    public static void injectContactUtil(AddParticipantsActivity addparticipantsactivity, Provider provider)
    {
        addparticipantsactivity.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(AddParticipantsActivity addparticipantsactivity, Provider provider)
    {
        addparticipantsactivity.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectImm(AddParticipantsActivity addparticipantsactivity, Provider provider)
    {
        addparticipantsactivity.imm = (InputMethodManager)provider.get();
    }

    public static void injectLayoutExperience(AddParticipantsActivity addparticipantsactivity, Provider provider)
    {
        addparticipantsactivity.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectMap(AddParticipantsActivity addparticipantsactivity, Provider provider)
    {
        addparticipantsactivity.map = (ObjectIdMap)provider.get();
    }

    public static void injectNavigation(AddParticipantsActivity addparticipantsactivity, Provider provider)
    {
        addparticipantsactivity.navigation = (Navigation)provider.get();
    }

    public static void injectRecentAdapter(AddParticipantsActivity addparticipantsactivity, Provider provider)
    {
        addparticipantsactivity.recentAdapter = (RecentAdapter)provider.get();
    }

    public static void injectSearchAdapter(AddParticipantsActivity addparticipantsactivity, Provider provider)
    {
        addparticipantsactivity.searchAdapter = (ContactSearchAdapter)provider.get();
    }

    public static void injectViewState(AddParticipantsActivity addparticipantsactivity, Provider provider)
    {
        addparticipantsactivity.viewState = (ViewStateManager)provider.get();
    }

    public final void injectMembers(AddParticipantsActivity addparticipantsactivity)
    {
        if (addparticipantsactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(addparticipantsactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(addparticipantsactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(addparticipantsactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(addparticipantsactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(addparticipantsactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(addparticipantsactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(addparticipantsactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(addparticipantsactivity, activityAccountStateObserverProvider);
            addparticipantsactivity.async = (AsyncService)asyncProvider.get();
            addparticipantsactivity.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            addparticipantsactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            addparticipantsactivity.map = (ObjectIdMap)mapProvider.get();
            addparticipantsactivity.navigation = (Navigation)navigationProvider.get();
            addparticipantsactivity.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            addparticipantsactivity.viewState = (ViewStateManager)viewStateProvider.get();
            addparticipantsactivity.recentAdapter = (RecentAdapter)recentAdapterProvider.get();
            addparticipantsactivity.imm = (InputMethodManager)immProvider.get();
            addparticipantsactivity.searchAdapter = (ContactSearchAdapter)searchAdapterProvider.get();
            addparticipantsactivity.chatText = (ChatText)chatTextProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AddParticipantsActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/AddParticipantsActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
