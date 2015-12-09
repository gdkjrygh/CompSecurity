// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.logging.GamesLogflowLogger;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

final class val.previousValue
    implements ResultCallback
{

    final GamesSettingsFragment this$0;
    final int val$actionType;
    final boolean val$previousValue;

    public final volatile void onResult(Result result)
    {
        boolean flag1 = true;
        result = (Status)result;
        GamesSettingsFragment.onContactSettingsUpdated$e184e5d();
        GamesLogflowLogger gameslogflowlogger = GamesSettingsFragment.access$000(GamesSettingsFragment.this);
        int i = val$actionType;
        boolean flag2 = val$previousValue;
        boolean flag;
        if (!val$previousValue)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((Status) (result)).mStatusCode != 0)
        {
            flag1 = false;
        }
        gameslogflowlogger.logSettingChangeEvent(i, flag2, flag, flag1);
    }

    ()
    {
        this$0 = final_gamessettingsfragment;
        val$actionType = i;
        val$previousValue = Z.this;
        super();
    }
}
