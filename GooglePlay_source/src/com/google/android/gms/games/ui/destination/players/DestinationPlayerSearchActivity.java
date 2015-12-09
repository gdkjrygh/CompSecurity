// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.common.players.PlayerAvatarAdapter;
import com.google.android.gms.games.ui.common.players.PlayerSearchResultsFragment;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.SearchHelper;
import com.google.android.gms.games.ui.util.UiUtils;

public final class DestinationPlayerSearchActivity extends DestinationFragmentActivity
    implements com.google.android.gms.games.ui.common.players.PlayerAvatarAdapter.PlayerAvatarEventListener
{

    private SearchHelper mPlayerSearchHelper;

    public DestinationPlayerSearchActivity()
    {
        super(0x7f040070, 0x7f120018);
    }

    public final void onCreate(Bundle bundle)
    {
        getIntent();
        super.onCreate(bundle);
        PlayerSearchResultsFragment playersearchresultsfragment = (PlayerSearchResultsFragment)super.mFragments.findFragmentById(0x7f0d0132);
        Asserts.checkNotNull(playersearchresultsfragment);
        mPlayerSearchHelper = new SearchHelper(this, playersearchresultsfragment);
        mPlayerSearchHelper.onCreate(bundle);
    }

    public final boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        mPlayerSearchHelper.onCreateOptionsMenu$1eec55bd();
        return true;
    }

    protected final void onNewIntent(Intent intent)
    {
        setIntent(intent);
        mPlayerSearchHelper.onNewIntent(intent);
    }

    public final void onPlayerAvatarClicked(Player player, SharedElementTransition sharedelementtransition)
    {
        mPlayerSearchHelper.clearFocus();
        String s = super.mConfiguration.getCurrentPlayerId();
        if (player.getPlayerId().equals(s))
        {
            UiUtils.viewMyProfile(this, player, sharedelementtransition);
            return;
        } else
        {
            UiUtils.viewProfileComparison(this, player, sharedelementtransition);
            return;
        }
    }

    public final void onPlayerFollowClicked(PlayerAvatarAdapter playeravataradapter, Player player)
    {
        ((PlayerSearchResultsFragment)super.mFragments.findFragmentById(0x7f0d0132)).onPlayerFollowClicked(playeravataradapter, player);
    }

    public final void onPlayerOverflowMenuClicked(Player player)
    {
    }

    public final void onPlayerSubtitleClicked(Player player, SharedElementTransition sharedelementtransition)
    {
    }

    public final void onPlayerUnfollowClicked(PlayerAvatarAdapter playeravataradapter, Player player)
    {
        ((PlayerSearchResultsFragment)super.mFragments.findFragmentById(0x7f0d0132)).onPlayerUnfollowClicked(playeravataradapter, player);
    }

    protected final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        mPlayerSearchHelper.onSaveInstanceState(bundle);
    }

    public final boolean onSearchRequested()
    {
        return mPlayerSearchHelper.onSearchRequested();
    }

    public final void onStart()
    {
        super.onStart();
        mPlayerSearchHelper.mStopped = false;
    }

    public final void onStop()
    {
        super.onStop();
        mPlayerSearchHelper.onStop();
    }
}
