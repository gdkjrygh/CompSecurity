// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

final class this._cls0
    implements ResultCallback
{

    final GamesSettingsFragment this$0;

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.ngsResult)result;
        GamesSettingsFragment gamessettingsfragment = GamesSettingsFragment.this;
        if (result.getStatus().mStatusCode == 2)
        {
            gamessettingsfragment.showErrorView();
            gamessettingsfragment.onSectionLoaded();
            return;
        } else
        {
            gamessettingsfragment.mPublicProfile = result.isProfileVisible();
            gamessettingsfragment.onSectionLoaded();
            return;
        }
    }

    Result()
    {
        this$0 = GamesSettingsFragment.this;
        super();
    }
}
