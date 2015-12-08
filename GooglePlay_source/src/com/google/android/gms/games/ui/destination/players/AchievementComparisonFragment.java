// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.Batch;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.achievement.Achievement;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationGamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.destination.LoggablePage;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            AchievementComparisonAdapter, BaseAchievementComparisonItem

public final class AchievementComparisonFragment extends DestinationGamesHeaderRecyclerViewFragment
    implements ResultCallback, LoggablePage, AchievementComparisonAdapter.AchievementComparisonEventListener
{
    private class _cls2
        implements com.google.android.gms.games.ui.destination.util.AchievementComparisonUtils.AchievementComparisonFactory
    {

        final AchievementComparisonFragment this$0;

        public final BaseAchievementComparisonItem makeAchievementComparison(String s, String s1, String s2, long l, long l1, 
                Uri uri, Uri uri1, Player player, int i, Player player1, int j)
        {
            return new AchievementComparisonItem(s, s1, s2, l, l1, uri, uri1, player, i, player1, j);
        }

        _cls2()
        {
            this$0 = AchievementComparisonFragment.this;
            super();
        }
    }

    private static class AchievementComparisonItem extends BaseAchievementComparisonItem
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new AchievementComparisonItem(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new BaseAchievementComparisonItem[i];
            }

        };

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(name);
            parcel.writeString(description);
            parcel.writeString(gameId);
            parcel.writeLong(xp);
            parcel.writeLong(date);
            parcel.writeParcelable(unlockedUri, 0);
            parcel.writeParcelable(revealedUri, 0);
            parcel.writeParcelable(playerMe, 0);
            parcel.writeInt(myAchievementState);
            parcel.writeParcelable(playerThem, 0);
            parcel.writeInt(theirAchievementState);
        }


        protected AchievementComparisonItem(Parcel parcel)
        {
            super(parcel);
        }

        public AchievementComparisonItem(String s, String s1, String s2, long l, long l1, 
                Uri uri, Uri uri1, Player player, int i, Player player1, int j)
        {
            super(s, s1, s2, l, l1, uri, uri1, player, i, player1, j);
        }
    }


    private AchievementComparisonAdapter mAchievementComparisonAdapter;
    private GameFirstParty mExtendedGame;
    private Player mMePlayer;
    private Player mOtherPlayer;
    private boolean mOtherPlayerLoaded;
    private boolean mViewDestroyed;

    public AchievementComparisonFragment()
    {
    }

    private void loadAchievementData()
    {
        DestinationFragmentActivity destinationfragmentactivity = mParent;
        Object obj1 = mExtendedGame;
        Object obj4 = mMePlayer;
        Object obj3 = mOtherPlayer;
        com.google.android.gms.games.ui.destination.util.AchievementComparisonUtils.AchievementComparisonDataLoadedListener achievementcomparisondataloadedlistener = new com.google.android.gms.games.ui.destination.util.AchievementComparisonUtils.AchievementComparisonDataLoadedListener() {

            final AchievementComparisonFragment this$0;

            public final void onAchievementComparisonDataLoaded(int i, AchievementBuffer achievementbuffer, AchievementBuffer achievementbuffer1)
            {
                if (mDetached || mRemoving || mViewDestroyed)
                {
                    return;
                } else
                {
                    AchievementComparisonFragment.access$100(AchievementComparisonFragment.this, i, achievementbuffer, achievementbuffer1);
                    return;
                }
            }

            
            {
                this$0 = AchievementComparisonFragment.this;
                super();
            }
        };
        Object obj = destinationfragmentactivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(((GoogleApiClient) (obj)), destinationfragmentactivity))
        {
            GamesLog.w("AchievementCompUtils", "onResult: not connected; ignoring...");
            return;
        } else
        {
            Object obj2 = ((Player) (obj4)).getPlayerId();
            obj3 = ((Player) (obj3)).getPlayerId();
            obj4 = ((GameFirstParty) (obj1)).getGame();
            obj1 = new com.google.android.gms.common.api.Batch.Builder(((GoogleApiClient) (obj)));
            obj2 = ((com.google.android.gms.common.api.Batch.Builder) (obj1)).add(Games.Achievements.loadFirstParty(((GoogleApiClient) (obj)), ((String) (obj2)), ((Game) (obj4)).getApplicationId(), true));
            obj = ((com.google.android.gms.common.api.Batch.Builder) (obj1)).add(Games.Achievements.loadFirstParty(((GoogleApiClient) (obj)), ((String) (obj3)), ((Game) (obj4)).getApplicationId(), true));
            ((com.google.android.gms.common.api.Batch.Builder) (obj1)).build().setResultCallback(new com.google.android.gms.games.ui.destination.util.AchievementComparisonUtils._cls1(((com.google.android.gms.common.api.BatchResultToken) (obj2)), ((com.google.android.gms.common.api.BatchResultToken) (obj)), achievementcomparisondataloadedlistener));
            return;
        }
    }

    private void loadData(GoogleApiClient googleapiclient)
    {
        if (!mOtherPlayerLoaded)
        {
            String s = mOtherPlayer.getPlayerId();
            Games.Players.loadPlayer(googleapiclient, s).setResultCallback(this);
            return;
        } else
        {
            loadAchievementData();
            return;
        }
    }

    protected final int getPlaylogElementType()
    {
        return 32;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void logPageView(PowerUpPlayLogger powerupplaylogger)
    {
        powerupplaylogger.logBasicAction(10, PowerUpUtils.getExperimentIdsForLogging());
    }

    public final void onAchievementComparisonClicked(BaseAchievementComparisonItem baseachievementcomparisonitem)
    {
        PowerUpUtils.viewGameDetail(mParent, baseachievementcomparisonitem.gameId, 10);
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Object obj = mParent.getIntent();
        mViewDestroyed = false;
        mOtherPlayer = (Player)((Intent) (obj)).getParcelableExtra("com.google.android.gms.games.OTHER_PLAYER");
        if (mOtherPlayer == null)
        {
            GamesLog.e("AchvCompareFragment", "We don't have another player to compare to, something went wrong. Finishing the activity");
            mParent.finish();
            return;
        }
        mExtendedGame = (GameFirstParty)((Intent) (obj)).getParcelableExtra("com.google.android.gms.games.EXTENDED_GAME");
        if (mExtendedGame == null)
        {
            GamesLog.e("AchvCompareFragment", "EXTRA_EXTENDED_GAME must be given to achievement comparison activity.");
            mParent.finish();
        }
        if (bundle == null)
        {
            mOtherPlayerLoaded = false;
        } else
        {
            mOtherPlayerLoaded = bundle.getBoolean("savedStateOtherPlayerLoaded");
        }
        bundle = new HeaderItemRecyclerAdapter(mParent);
        bundle.setTitle(0x7f10008e);
        mAchievementComparisonAdapter = new AchievementComparisonAdapter(mParent, this);
        obj = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(bundle);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mAchievementComparisonAdapter);
        setAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).build());
        mParent.setTitle(mOtherPlayer.getDisplayName());
    }

    public final void onDestroyView()
    {
        mViewDestroyed = true;
        super.onDestroyView();
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        mMePlayer = Games.Players.getCurrentPlayer(googleapiclient);
        if (mMePlayer == null)
        {
            GamesLog.w("AchvCompareFragment", "We don't have a current player, something went wrong. Finishing the activity");
            mParent.finish();
            return;
        } else
        {
            loadData(googleapiclient);
            return;
        }
    }

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.Players.LoadPlayersResult)result;
        if (result.getStatus().isSuccess() && result.getPlayers().getCount() > 0)
        {
            mOtherPlayerLoaded = true;
            loadAchievementData();
            return;
        } else
        {
            mLoadingDataViewManager.setViewState(5);
            return;
        }
    }

    public final void onRetry()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("AchvCompareFragment", "onRetry: not connected; ignoring...");
            return;
        } else
        {
            mLoadingDataViewManager.setViewState(1);
            loadData(googleapiclient);
            return;
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("savedStateOtherPlayerLoaded", mOtherPlayerLoaded);
    }



/*
    static void access$100(AchievementComparisonFragment achievementcomparisonfragment, int i, AchievementBuffer achievementbuffer, AchievementBuffer achievementbuffer1)
    {
        GameFirstParty gamefirstparty;
        Player player;
        Player player1;
        _cls2 _lcls2;
        ArrayList arraylist;
        int j;
        int l;
        gamefirstparty = achievementcomparisonfragment.mExtendedGame;
        player = achievementcomparisonfragment.mMePlayer;
        player1 = achievementcomparisonfragment.mOtherPlayer;
        _lcls2 = achievementcomparisonfragment. new _cls2();
        arraylist = new ArrayList();
        l = achievementbuffer.getCount();
        j = 0;
_L5:
        if (j >= l) goto _L2; else goto _L1
_L1:
        Achievement achievement1;
        int k;
        int i1;
        achievement1 = achievementbuffer.get(j);
        i1 = achievementbuffer1.getCount();
        k = 0;
_L6:
        Achievement achievement;
        if (k >= i1)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        achievement = achievementbuffer1.get(k);
        if (!achievement.getName().equals(achievement1.getName())) goto _L4; else goto _L3
_L3:
        String s = achievement1.getName();
        String s1 = achievement1.getDescription();
        String s2 = gamefirstparty.getGame().getApplicationId();
        long l1 = achievement1.getXpValue();
        long l2 = achievement1.getLastUpdatedTimestamp();
        Uri uri = achievement1.getUnlockedImageUri();
        Uri uri1 = achievement1.getRevealedImageUri();
        int j1 = achievement1.getState();
        if (achievement == null)
        {
            k = 2;
        } else
        {
            k = achievement.getState();
        }
        arraylist.add(_lcls2.makeAchievementComparison(s, s1, s2, l1, l2, uri, uri1, player, j1, player1, k));
        j++;
          goto _L5
_L4:
        k++;
          goto _L6
_L2:
        Collections.sort(arraylist, new com.google.android.gms.games.ui.destination.util.AchievementComparisonUtils._cls2());
        achievementbuffer = new ObjectDataBuffer(arraylist);
        achievementcomparisonfragment.mAchievementComparisonAdapter.setDataBuffer(achievementbuffer);
        achievementcomparisonfragment.mLoadingDataViewManager.handleViewState(i, achievementbuffer.getCount(), false);
        return;
        achievement = null;
          goto _L3
    }

*/
}
