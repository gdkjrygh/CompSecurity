// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            PlayerDetailMyProfileFragment, PlayerDetailProfileComparisonFragment

public final class PlayerDetailActivity extends DestinationFragmentActivity
{

    private boolean mShouldMarkNotificationOpened;

    public PlayerDetailActivity()
    {
        super(0x7f040063, 0x7f120015);
        mShouldMarkNotificationOpened = false;
    }

    public final void onConnected(Bundle bundle)
    {
        super.onConnected(bundle);
        if (mShouldMarkNotificationOpened)
        {
            mShouldMarkNotificationOpened = false;
            Games.Notifications.notificationOpenedFirstParty(getGoogleApiClient());
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        Object obj = bundle.getAction();
        int i;
        if ("com.google.android.gms.games.destination.VIEW_MY_PROFILE".equals(obj))
        {
            i = 0;
        } else
        if ("com.google.android.gms.games.destination.VIEW_PROFILE_COMPARISON".equals(obj))
        {
            i = 1;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Intent action is invalid: ")).append(((String) (obj))).toString());
        }
        mShouldMarkNotificationOpened = bundle.getBooleanExtra("com.google.android.gms.games.NOTIFICATION_OPENED", false);
        obj = super.mFragments;
        i;
        JVM INSTR tableswitch 1 1: default 60
    //                   1 125;
           goto _L1 _L2
_L1:
        bundle = new PlayerDetailMyProfileFragment();
_L4:
        obj = ((FragmentManager) (obj)).beginTransaction();
        ((FragmentTransaction) (obj)).replace(0x7f0d016f, bundle);
        ((FragmentTransaction) (obj)).commit();
        return;
_L2:
        if ((Player)getIntent().getParcelableExtra("com.google.android.gms.games.OTHER_PLAYER") == null)
        {
            Asserts.checkNotNull(getIntent().getStringExtra("com.google.android.gms.games.PLAYER_ID"), "EXTRA_OTHER_PLAYER and EXTRA_PLAYER_ID cannot both be null for the Profile comparison screen");
        }
        bundle = new PlayerDetailProfileComparisonFragment();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131559251: 
            PowerUpUtils.launchPlayerSearch(this);
            break;
        }
        return true;
    }
}
