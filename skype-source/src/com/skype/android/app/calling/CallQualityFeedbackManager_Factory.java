// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            CallQualityFeedbackManager

public final class CallQualityFeedbackManager_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider conversationUtilProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider userPreferencesProvider;

    public CallQualityFeedbackManager_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider;
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
        userPreferencesProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider4;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new CallQualityFeedbackManager_Factory(provider, provider1, provider2, provider3, provider4);
    }

    public final CallQualityFeedbackManager get()
    {
        return new CallQualityFeedbackManager((ObjectIdMap)mapProvider.get(), (SkyLib)libProvider.get(), (ConversationUtil)conversationUtilProvider.get(), userPreferencesProvider, (Analytics)analyticsProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/calling/CallQualityFeedbackManager_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
