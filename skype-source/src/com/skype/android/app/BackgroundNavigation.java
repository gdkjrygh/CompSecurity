// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Application;
import android.content.Context;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.TimeUtil;
import com.skype.android.wakeup.DreamKeeper;

// Referenced classes of package com.skype.android.app:
//            Navigation, LayoutExperience

public class BackgroundNavigation extends Navigation
{

    public BackgroundNavigation(Application application, AccountProvider accountprovider, SkyLib skylib, DreamKeeper dreamkeeper, ConversationUtil conversationutil, Analytics analytics, NetworkUtil networkutil, 
            EcsConfiguration ecsconfiguration, SignInDurationReporter signindurationreporter, AnalyticsPersistentStorage analyticspersistentstorage, LayoutExperience layoutexperience, TimeUtil timeutil)
    {
        super(null, accountprovider, skylib, dreamkeeper, conversationutil, analytics, networkutil, ecsconfiguration, signindurationreporter, analyticspersistentstorage, layoutexperience, timeutil);
        context = application;
    }

    public Context getContext()
    {
        return context;
    }
}
