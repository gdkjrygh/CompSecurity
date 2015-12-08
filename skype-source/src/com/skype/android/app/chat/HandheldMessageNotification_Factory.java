// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.NotificationManager;
import android.content.Context;
import com.skype.SkyLib;
import com.skype.android.app.BackgroundNavigation;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.cache.FormattedMessageCache;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            HandheldMessageNotification

public final class HandheldMessageNotification_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider configurationProvider;
    private final Provider contextProvider;
    private final Provider conversationUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final MembersInjector membersInjector;
    private final Provider messageCacheProvider;
    private final Provider navigationProvider;
    private final Provider notificationManagerProvider;
    private final Provider userPreferencesProvider;

    public HandheldMessageNotification_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
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
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        messageCacheProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        notificationManagerProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        userPreferencesProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        } else
        {
            configurationProvider = provider8;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8)
    {
        return new HandheldMessageNotification_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public final HandheldMessageNotification get()
    {
        HandheldMessageNotification handheldmessagenotification = new HandheldMessageNotification((Context)contextProvider.get(), (SkyLib)libProvider.get(), (ConversationUtil)conversationUtilProvider.get(), (ImageCache)imageCacheProvider.get(), (FormattedMessageCache)messageCacheProvider.get(), (NotificationManager)notificationManagerProvider.get(), (UserPreferences)userPreferencesProvider.get(), (BackgroundNavigation)navigationProvider.get(), (EcsConfiguration)configurationProvider.get());
        membersInjector.injectMembers(handheldmessagenotification);
        return handheldmessagenotification;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/HandheldMessageNotification_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
