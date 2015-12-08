// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Activity;
import com.skype.SkyLib;
import com.skype.android.event.EventBus;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app:
//            ActionBarCustomizer, Navigation, LayoutExperience

public final class ActionBarCustomizer_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider activityProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider eventBusProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final MembersInjector membersInjector;
    private final Provider navigationProvider;
    private final Provider timeAnomalyTelemetryProvider;
    private final Provider timeUtilProvider;

    public ActionBarCustomizer_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7, Provider provider8)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        activityProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        } else
        {
            timeAnomalyTelemetryProvider = provider8;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8)
    {
        return new ActionBarCustomizer_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public final ActionBarCustomizer get()
    {
        ActionBarCustomizer actionbarcustomizer = new ActionBarCustomizer((Activity)activityProvider.get(), (SkyLib)libProvider.get(), (ContactUtil)contactUtilProvider.get(), (ConversationUtil)conversationUtilProvider.get(), (TimeUtil)timeUtilProvider.get(), (Navigation)navigationProvider.get(), (EventBus)eventBusProvider.get(), (LayoutExperience)layoutExperienceProvider.get(), (TimeAnomalyTelemetry)timeAnomalyTelemetryProvider.get());
        membersInjector.injectMembers(actionbarcustomizer);
        return actionbarcustomizer;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/ActionBarCustomizer_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
