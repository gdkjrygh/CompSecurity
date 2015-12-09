// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.games.internal.GamesIntents;
import com.google.android.gms.games.ui.api.GamesDestinationApi;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

final class this._cls0
    implements android.view.ettingsFragment._cls11
{

    final GamesSettingsFragment this$0;

    public final void onClick(View view)
    {
        view = mActivity;
        String s = GamesSettingsFragment.access$800(GamesSettingsFragment.this);
        GamesDestinationApi.checkClientUi(view);
        Bundle bundle = new Bundle();
        GamesIntents.addObfuscatedAccount(bundle, s);
        bundle.putBoolean("com.google.android.gms.games.FORCE_RESOLVE_ACCOUNT_KEY", true);
        Intent intent = new Intent("com.google.android.gms.games.destination.MAIN_ACTIVITY");
        intent.putExtras(bundle);
        GamesDestinationApi.startIntent(view, intent, s);
    }

    ()
    {
        this$0 = GamesSettingsFragment.this;
        super();
    }
}
