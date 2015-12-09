// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.matches;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.client.players.SelectPlayersMetadataProvider;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.people.People;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class SelectOpponentsActivity extends ClientFragmentActivity
    implements android.view.View.OnClickListener, android.view.animation.Animation.AnimationListener, com.google.android.gms.games.ui.client.players.SelectPlayersFragment.SelectPlayersListener, SelectPlayersMetadataProvider
{

    private int mMaxParticipants;
    private int mMinParticipants;
    private int mMultiplayerType;
    private int mNumAutoMatchPlayers;
    private View mPlayButtonBarContainer;
    private boolean mPlayButtonIsAnimating;
    private Animation mPlaySlideInAnimation;
    private Animation mPlaySlideOutAnimation;
    private ArrayList mPreselectedPlayerIds;
    private ArrayMap mSelectedPlayers;
    private boolean mShowAutomatch;
    private boolean mShowNearbySearch;
    private boolean mShowPlayButton;

    public SelectOpponentsActivity()
    {
        super(0, 0x7f12000d);
    }

    private boolean hasMinPlayers()
    {
        int i = mSelectedPlayers.size() + mNumAutoMatchPlayers;
        if (i > mMaxParticipants)
        {
            GamesLog.w("SelectOpponentsActivity", (new StringBuilder("hasMinPlayers: numSelected too large (")).append(i).append(" > ").append(mMaxParticipants).append(")!").toString());
        }
        return i >= mMinParticipants;
    }

    private Animation loadAnimation(int i)
    {
        Animation animation = AnimationUtils.loadAnimation(this, i);
        animation.setFillAfter(true);
        animation.setAnimationListener(this);
        return animation;
    }

    protected final void addApisToGoogleApiClient(com.google.android.gms.common.api.GoogleApiClient.Builder builder)
    {
        super.addApisToGoogleApiClient(builder);
        com.google.android.gms.people.People.PeopleOptions1p.Builder builder1 = new com.google.android.gms.people.People.PeopleOptions1p.Builder();
        builder1.clientApplicationId = 118;
        builder.addApi(People.API_1P, builder1.build());
    }

    public final boolean allowAutoMatch()
    {
        return mShowAutomatch;
    }

    public final boolean allowNearbySearch()
    {
        return mShowNearbySearch;
    }

    public final int getBottomPadding()
    {
        if (mShowPlayButton)
        {
            return getResources().getDimensionPixelSize(0x7f0c0075);
        } else
        {
            return 0;
        }
    }

    public final int getHeaderMode()
    {
        return 2;
    }

    protected final int getLogEventType()
    {
        return 7;
    }

    public final int getMaxParticipants()
    {
        return mMaxParticipants;
    }

    public final int getMinParticipants()
    {
        return mMinParticipants;
    }

    public final ArrayList getPreselectedPlayerIds()
    {
        return mPreselectedPlayerIds;
    }

    public final int getRecentPlayersType()
    {
        return 1;
    }

    protected final int getWrappableContentResId()
    {
        return 0x7f0400ca;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    protected final void modifyGamesOptions(com.google.android.gms.games.Games.GamesOptions.Builder builder)
    {
        super.modifyGamesOptions(builder);
        builder.addProxyApi("copresence");
    }

    public final void onAnimationEnd(Animation animation)
    {
        mPlayButtonIsAnimating = false;
        if (animation == mPlaySlideInAnimation && !mShowPlayButton)
        {
            mPlayButtonBarContainer.startAnimation(mPlaySlideOutAnimation);
        } else
        if (animation == mPlaySlideOutAnimation && mShowPlayButton)
        {
            mPlayButtonBarContainer.startAnimation(mPlaySlideInAnimation);
            return;
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    public final void onClick(View view)
    {
        if (view.getId() == 0x7f0d0276)
        {
            if (!hasMinPlayers())
            {
                GamesLog.w("SelectOpponentsActivity", "onPlay: 'Play' action shouldn't have been enabled; ignoring...");
                return;
            }
            view = new Intent();
            Object obj = new ArrayList(mSelectedPlayers.size());
            ArrayMap arraymap = new ArrayMap(mSelectedPlayers.size());
            String s;
            for (Iterator iterator = mSelectedPlayers.keySet().iterator(); iterator.hasNext(); arraymap.put(s, ((Pair)mSelectedPlayers.get(s)).second))
            {
                s = (String)iterator.next();
                ((ArrayList) (obj)).add(s);
            }

            view.putStringArrayListExtra("players", ((ArrayList) (obj)));
            view.putExtra("min_automatch_players", mNumAutoMatchPlayers);
            view.putExtra("max_automatch_players", mNumAutoMatchPlayers);
            obj = Games.getCurrentAccountName(getGoogleApiClient());
            com.google.android.gms.games.GameEntity gameentity = super.mClientGame;
            GamesPlayLogger.logPlayerSelections(this, super.mClientPackageName, gameentity.getApplicationId(), ((String) (obj)), arraymap, mNumAutoMatchPlayers);
            setResult(-1, view);
            finish();
            return;
        } else
        {
            GamesLog.w("SelectOpponentsActivity", (new StringBuilder("onClick: unexpected view: ")).append(view).append(", id ").append(view.getId()).toString());
            return;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        trackFragments();
        setTitle(0x7f10025f);
        mShowGameNameAsTitle = false;
        mPlayButtonBarContainer = findViewById(0x7f0d0266);
        findViewById(0x7f0d0276).setOnClickListener(this);
        mPlaySlideInAnimation = loadAnimation(0x7f05000f);
        mPlaySlideOutAnimation = loadAnimation(0x7f050010);
        mPlayButtonBarContainer.setVisibility(8);
        mPlayButtonIsAnimating = false;
        mShowPlayButton = false;
        bundle = getIntent();
        mMinParticipants = bundle.getIntExtra("com.google.android.gms.games.MIN_SELECTIONS", 0);
        mMaxParticipants = bundle.getIntExtra("com.google.android.gms.games.MAX_SELECTIONS", 0);
        mShowAutomatch = bundle.getBooleanExtra("com.google.android.gms.games.SHOW_AUTOMATCH", true);
        mShowNearbySearch = bundle.getBooleanExtra("com.google.android.gms.games.SHOW_NEARBY_SEARCH", true);
        if (!((Boolean)G.allowNearbyPlayerSearch.get()).booleanValue())
        {
            mShowNearbySearch = false;
        }
        mMultiplayerType = bundle.getIntExtra("com.google.android.gms.games.MULTIPLAYER_TYPE", -1);
        mPreselectedPlayerIds = bundle.getStringArrayListExtra("players");
        if (mMultiplayerType == -1)
        {
            GamesLog.i("SelectOpponentsActivity", "parseIntent: missing intent extra 'EXTRA_MULTIPLAYER_TYPE'... defaulting type to to RTMP");
            mMultiplayerType = 1;
        }
        android.view.ViewGroup.LayoutParams layoutparams;
        boolean flag;
        if (mMinParticipants <= 0)
        {
            GamesLog.e("SelectOpponentsActivity", (new StringBuilder("minPlayers was ")).append(mMinParticipants).append(", but must be greater than or equal to 1.").toString());
            flag = false;
        } else
        {
            if (mMaxParticipants > 7)
            {
                GamesLog.w("SelectOpponentsActivity", (new StringBuilder("maxPlayers was ")).append(mMaxParticipants).append(", but is currently limited to 7 (for 8").append(" players total, counting the current player).").toString());
                mMaxParticipants = 7;
            }
            if (mMaxParticipants < mMinParticipants)
            {
                GamesLog.e("SelectOpponentsActivity", (new StringBuilder("Max must be greater than or equal to min. Max: ")).append(mMaxParticipants).append(" Min: ").append(mMinParticipants).toString());
                flag = false;
            } else
            {
                flag = true;
            }
        }
        if (!flag)
        {
            GamesLog.e("SelectOpponentsActivity", "Error parsing intent; bailing out...");
            finish();
        }
        bundle = findViewById(0x7f0d0053);
        layoutparams = bundle.getLayoutParams();
        layoutparams.height = getHeaderHeight(this);
        bundle.setLayoutParams(layoutparams);
    }

    public final boolean onSearchRequested()
    {
        return onFragmentSearchRequested();
    }

    public final void onSelectedPlayersChanged(ArrayMap arraymap, int i)
    {
        mSelectedPlayers = arraymap;
        mNumAutoMatchPlayers = i;
        boolean flag = hasMinPlayers();
        if (!flag && mShowPlayButton)
        {
            if (!mPlayButtonIsAnimating)
            {
                mPlayButtonIsAnimating = true;
                mPlayButtonBarContainer.startAnimation(mPlaySlideOutAnimation);
            }
            mPlayButtonBarContainer.setVisibility(0);
            mShowPlayButton = false;
        } else
        if (flag && !mShowPlayButton)
        {
            if (!mPlayButtonIsAnimating)
            {
                mPlayButtonIsAnimating = true;
                mPlayButtonBarContainer.startAnimation(mPlaySlideInAnimation);
            }
            mPlayButtonBarContainer.setVisibility(0);
            mShowPlayButton = true;
            UiUtils.sendAccessibilityEventWithText(this, getString(0x7f100274), mPlayButtonBarContainer);
            return;
        }
    }

    public final boolean showIdentitySharingCard()
    {
        return mMultiplayerType == 0;
    }

    public final boolean updateSubtitle()
    {
        return true;
    }
}
