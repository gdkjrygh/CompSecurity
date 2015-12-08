// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.filter.ActivityFilter;
import com.google.android.apps.wallet.init.InitializerTaskManager;

// Referenced classes of package com.google.android.apps.wallet.init.ui:
//            InitializerActivity

public class InitializerFilter extends ActivityFilter
{

    private final Activity activity;
    private final InitializerTaskManager initializerTaskManager;

    InitializerFilter(Activity activity1, InitializerTaskManager initializertaskmanager)
    {
        activity = activity1;
        initializerTaskManager = initializertaskmanager;
    }

    protected final Intent onCreate(Bundle bundle)
    {
        if (!initializerTaskManager.initializerTasksComplete())
        {
            return InternalIntents.forClass(activity, com/google/android/apps/wallet/init/ui/InitializerActivity);
        } else
        {
            return null;
        }
    }
}
