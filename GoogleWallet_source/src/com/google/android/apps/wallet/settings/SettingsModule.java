// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.util.async.ActionExecutor;

// Referenced classes of package com.google.android.apps.wallet.settings:
//            ActionQueue, UserSettingsPublisher

public class SettingsModule
{

    public SettingsModule()
    {
    }

    static InitializedEventPublisher getInitializedEventPublishers(UserSettingsPublisher usersettingspublisher)
    {
        return usersettingspublisher;
    }

    static ActionQueue getRequestActionsQueue(ActionExecutor actionexecutor)
    {
        return new ActionQueue(actionexecutor);
    }
}
