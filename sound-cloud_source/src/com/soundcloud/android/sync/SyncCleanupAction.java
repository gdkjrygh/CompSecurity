// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.SharedPreferences;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncStateManager

public class SyncCleanupAction
{

    private final SharedPreferences activitiesPrefs;
    private final SyncStateManager stateManager;
    private final SharedPreferences streamPrefs;

    public SyncCleanupAction(SyncStateManager syncstatemanager, SharedPreferences sharedpreferences, SharedPreferences sharedpreferences1)
    {
        stateManager = syncstatemanager;
        streamPrefs = sharedpreferences;
        activitiesPrefs = sharedpreferences1;
    }

    public void clear()
    {
        stateManager.clear();
        streamPrefs.edit().clear().apply();
        activitiesPrefs.edit().clear().apply();
    }
}
