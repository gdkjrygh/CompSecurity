// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.os.Bundle;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.NotificationChannel;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

final class this._cls0
    implements ResultCallback
{

    final GamesSettingsFragment this$0;

    public final volatile void onResult(Result result)
    {
        Object obj;
        int i;
        obj = (com.google.android.gms.games.tingLoadResult)result;
        result = GamesSettingsFragment.this;
        i = ((com.google.android.gms.games.tingLoadResult) (obj)).getStatus().mStatusCode;
        obj = ((com.google.android.gms.games.tingLoadResult) (obj)).getDataHolder();
        if (i != 2) goto _L2; else goto _L1
_L1:
        result.showErrorView();
        result.onSectionLoaded();
_L4:
        return;
_L2:
        if (i != 0) goto _L4; else goto _L3
_L3:
        int j = ((DataHolder) (obj)).getWindowIndex(0);
        result.mNotificationsEnabled = ((DataHolder) (obj)).getBoolean("mobile_notifications_enabled", 0, j);
        boolean flag = ((DataHolder) (obj)).getBoolean("match_notifications_enabled", 0, j);
        boolean flag1 = ((DataHolder) (obj)).getBoolean("quest_notifications_enabled", 0, j);
        boolean flag2 = ((DataHolder) (obj)).getBoolean("request_notifications_enabled", 0, j);
        ((GamesSettingsFragment) (result)).mNotificationChannels.putBoolean(NotificationChannel.fromInt(0), flag);
        ((GamesSettingsFragment) (result)).mNotificationChannels.putBoolean(NotificationChannel.fromInt(2), flag1);
        ((GamesSettingsFragment) (result)).mNotificationChannels.putBoolean(NotificationChannel.fromInt(1), flag2);
        result.onSectionLoaded();
        ((DataHolder) (obj)).close();
        return;
        result;
        ((DataHolder) (obj)).close();
        throw result;
    }

    tionChannel()
    {
        this$0 = GamesSettingsFragment.this;
        super();
    }
}
