// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wearable;

import android.app.NotificationManager;
import android.content.Context;
import com.skype.SkyLib;
import com.skype.android.app.chat.MessageHolderUtil;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.cache.FormattedMessageCache;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.wearable:
//            WearMessageNotificationRenderer

public final class WearMessageNotificationRenderer_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider asyncProvider;
    private final Provider contextProvider;
    private final Provider conversationUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final MembersInjector membersInjector;
    private final Provider messageCacheProvider;
    private final Provider messageHolderUtilProvider;
    private final Provider notificationManagerProvider;
    private final Provider transferUtilProvider;

    public WearMessageNotificationRenderer_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7, Provider provider8, Provider provider9)
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
        messageCacheProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        notificationManagerProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        asyncProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        messageHolderUtilProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        } else
        {
            transferUtilProvider = provider9;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9)
    {
        return new WearMessageNotificationRenderer_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public final WearMessageNotificationRenderer get()
    {
        WearMessageNotificationRenderer wearmessagenotificationrenderer = new WearMessageNotificationRenderer((Context)contextProvider.get(), (SkyLib)libProvider.get(), (ConversationUtil)conversationUtilProvider.get(), (FormattedMessageCache)messageCacheProvider.get(), (ImageCache)imageCacheProvider.get(), (NotificationManager)notificationManagerProvider.get(), (AsyncService)asyncProvider.get(), (ObjectIdMap)mapProvider.get(), (MessageHolderUtil)messageHolderUtilProvider.get(), (TransferUtil)transferUtilProvider.get());
        membersInjector.injectMembers(wearmessagenotificationrenderer);
        return wearmessagenotificationrenderer;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/wearable/WearMessageNotificationRenderer_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
