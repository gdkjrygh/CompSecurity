// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import com.google.android.gms.common.audience.dialogs.CircleSelection;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.common.players.PlayerAvatarAdapter;
import com.google.android.gms.games.ui.common.players.PlayerSearchResultsFragment;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.ManageCirclesHelper;
import com.google.android.gms.games.ui.util.SearchHelper;
import com.google.android.gms.people.People;
import java.util.ArrayList;

public final class ClientPlayerSearchActivity extends ClientFragmentActivity
    implements com.google.android.gms.games.ui.common.players.PlayerAvatarAdapter.PlayerAvatarEventListener, com.google.android.gms.games.ui.util.ManageCirclesHelper.ContinueProcessingCallback
{

    private String mCurrentAccountName;
    private ManageCirclesHelper mManageCirclesHelper;
    private SearchHelper mPlayerSearchHelper;

    public ClientPlayerSearchActivity()
    {
        super(0x7f040051, 0x7f120018);
    }

    protected final void addApisToGoogleApiClient(com.google.android.gms.common.api.GoogleApiClient.Builder builder)
    {
        super.addApisToGoogleApiClient(builder);
        com.google.android.gms.people.People.PeopleOptions1p.Builder builder1 = new com.google.android.gms.people.People.PeopleOptions1p.Builder();
        builder1.clientApplicationId = 118;
        builder.addApi(People.API_1P, builder1.build());
    }

    public final boolean canContinueProcessing()
    {
        return !isFinishing();
    }

    protected final int getLogEventType()
    {
        return 8;
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        boolean flag1 = true;
        if (i == 1 && j == -1)
        {
            intent = CircleSelection.getResults(intent);
            boolean flag = flag1;
            if (intent.getAddedCirclesDelta().isEmpty())
            {
                if (!intent.getRemovedCirclesDelta().isEmpty())
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
            GamesPlayLogger.logAddToCirclesAction(this, "", mCurrentAccountName, 3, flag);
            return;
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

    public final void onConnected(Bundle bundle)
    {
        super.onConnected(bundle);
        mCurrentAccountName = Games.getCurrentAccountName(getGoogleApiClient());
        if (mCurrentAccountName == null)
        {
            GamesLog.w("CliPlayerSearchAct", "onConnected: no current account! Bailing out...");
            finish();
        }
    }

    public final void onCreate(Bundle bundle)
    {
        getIntent();
        super.onCreate(bundle);
        setTitle(0x7f100219);
        mShowGameNameAsTitle = false;
        PlayerSearchResultsFragment playersearchresultsfragment = (PlayerSearchResultsFragment)super.mFragments.findFragmentById(0x7f0d0132);
        Asserts.checkNotNull(playersearchresultsfragment);
        mPlayerSearchHelper = new SearchHelper(this, playersearchresultsfragment);
        mPlayerSearchHelper.onCreate(bundle);
    }

    public final boolean onCreateOptionsMenu(Menu menu)
    {
        boolean flag = super.onCreateOptionsMenu(menu);
        mPlayerSearchHelper.onCreateOptionsMenu$1eec55bd();
        return flag;
    }

    protected final void onNewIntent(Intent intent)
    {
        setIntent(intent);
        mPlayerSearchHelper.onNewIntent(intent);
    }

    public final void onPlayerAvatarClicked(Player player, SharedElementTransition sharedelementtransition)
    {
        sharedelementtransition = (Player)player.freeze();
        player = new ArrayList();
        player.add(sharedelementtransition);
        sharedelementtransition = new Intent();
        sharedelementtransition.putParcelableArrayListExtra("player_search_results", player);
        setResult(-1, sharedelementtransition);
        finish();
    }

    public final void onPlayerFollowClicked(PlayerAvatarAdapter playeravataradapter, Player player)
    {
    }

    public final void onPlayerOverflowMenuClicked(Player player)
    {
        mPlayerSearchHelper.clearFocus();
        if (mManageCirclesHelper != null)
        {
            GamesLog.d("CliPlayerSearchAct", "onManageCircles(): canceling the helper that was already running...");
            mManageCirclesHelper.cancel();
        }
        player = new ManageCirclesHelper(player, this, this, getGoogleApiClient(), mCurrentAccountName, 1);
        player.start();
        mManageCirclesHelper = player;
    }

    public final void onPlayerSubtitleClicked(Player player, SharedElementTransition sharedelementtransition)
    {
    }

    public final void onPlayerUnfollowClicked(PlayerAvatarAdapter playeravataradapter, Player player)
    {
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
