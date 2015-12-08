// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.players;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.api.DestinationApiHelper;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;

// Referenced classes of package com.google.android.gms.games.ui.common.players:
//            ProfileSummaryDialogFragment

public final class ProfileSummaryActivity extends FragmentActivity
    implements com.google.android.gms.games.ui.GamesUiConfiguration.GamesUiConfigurationProvider, com.google.android.gms.games.ui.api.DestinationApiHelper.DestinationApiHelperProvider
{

    public ProfileSummaryActivity()
    {
    }

    public final GamesUiConfiguration getConfiguration()
    {
        return new GamesUiConfiguration(this, 1, 0);
    }

    public final DestinationApiHelper getDestinationApiHelper()
    {
        return new DestinationApiHelper(this);
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        DialogFragmentUtil.show(this, ProfileSummaryDialogFragment.newInstance((Player)getIntent().getParcelableExtra("com.google.android.gms.games.PLAYER"), getIntent().getBooleanExtra("com.google.android.gms.games.IS_SELF", true), true), "profile_summary");
    }
}
