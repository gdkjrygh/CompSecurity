// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            ParticipantAdapter

public final class ParticipantAdapter_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider imageCacheProvider;

    public ParticipantAdapter_MembersInjector(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            imageCacheProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new ParticipantAdapter_MembersInjector(provider, provider1, provider2);
    }

    public static void injectContactUtil(ParticipantAdapter participantadapter, Provider provider)
    {
        participantadapter.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(ParticipantAdapter participantadapter, Provider provider)
    {
        participantadapter.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectImageCache(ParticipantAdapter participantadapter, Provider provider)
    {
        participantadapter.imageCache = (ImageCache)provider.get();
    }

    public final void injectMembers(ParticipantAdapter participantadapter)
    {
        if (participantadapter == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            participantadapter.contactUtil = (ContactUtil)contactUtilProvider.get();
            participantadapter.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            participantadapter.imageCache = (ImageCache)imageCacheProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ParticipantAdapter)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/ParticipantAdapter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
