// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.achievements;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.achievement.Achievement;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.common.SlimGotItCardAdapter;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.games.ui.common.achievements:
//            AchievementAdapter, AchievementHeaderAdapter

public class AchievementFragment extends GamesHeaderRecyclerViewFragment
    implements android.support.v7.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener, ResultCallback, com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.GotItEventListener, AchievementAdapter.AchievementEventListener
{

    private AchievementAdapter mAchievementAdapter;
    private AchievementHeaderAdapter mAchievementHeaderAdapter;
    private SlimGotItCardAdapter mNoPlusUpsellAdapter;
    private String mTargetAchievementId;

    public AchievementFragment()
    {
    }

    public final boolean alwaysUseFloatingBackground()
    {
        return false;
    }

    public final int getHeaderHeight(Context context)
    {
        context = context.getResources();
        return context.getDimensionPixelSize(0x7f0c01e3) - context.getDimensionPixelSize(0x7f0c01e1);
    }

    protected final int getPlaylogElementType()
    {
        return 9;
    }

    public boolean hasPlayHeader()
    {
        return true;
    }

    public final void onAchievementClicked(Achievement achievement)
    {
        GoogleApiClient googleapiclient = mParent.getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("AchievementFrag", "Api client not connected; aborting");
            return;
        } else
        {
            UiUtils.viewAchievementDescription(googleapiclient, super.mActivity, mParent.mConfiguration, achievement);
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        mAchievementAdapter = new AchievementAdapter(mParent, this);
        boolean flag = mParent.mConfiguration.isClientUi();
        int i;
        if (flag)
        {
            i = 0x7f02014b;
        } else
        {
            i = 0x7f02014a;
        }
        setEmptyViewElements(i, 0x7f10009c, 0);
        if (flag)
        {
            bundle = mParent.getResources();
            setEmptyViewElementsColor(bundle.getColor(0x106000b), bundle.getColor(0x7f0b0257));
        }
        bundle = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        mAchievementHeaderAdapter = new AchievementHeaderAdapter(mParent, hasPlayHeader());
        mNoPlusUpsellAdapter = new SlimGotItCardAdapter(mParent, new com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.Data(0x7f0b0061, 0x7f020120, 0x7f10009a, 0x7f1000bc), this);
        bundle.addAdapter(mAchievementHeaderAdapter);
        bundle.addAdapter(mNoPlusUpsellAdapter);
        bundle.addAdapter(mAchievementAdapter);
        setAdapter(bundle.build());
        bundle = mParent.getIntent().getExtras();
        if (bundle != null)
        {
            mTargetAchievementId = bundle.getString("com.google.android.gms.games.ACHIEVEMENT_ID");
            bundle.remove("com.google.android.gms.games.ACHIEVEMENT_ID");
        }
    }

    public final void onAnimationsFinished()
    {
        Iterator iterator = ((DatabufferRecyclerAdapter) (mAchievementAdapter)).mDataBuffer.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Achievement achievement = (Achievement)iterator.next();
            if (!achievement.getAchievementId().equals(mTargetAchievementId))
            {
                continue;
            }
            mTargetAchievementId = null;
            UiUtils.viewAchievementDescription(mParent.getGoogleApiClient(), super.mActivity, mParent.mConfiguration, achievement);
            break;
        } while (true);
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        boolean flag = false;
        GamesUiConfiguration gamesuiconfiguration = mParent.mConfiguration;
        boolean flag1;
        if (gamesuiconfiguration.is3PContext())
        {
            Games.Achievements.load$4b6585cf(googleapiclient).setResultCallback(this);
        } else
        {
            Games.Achievements.loadFirstParty(googleapiclient, gamesuiconfiguration.getCurrentPlayerId(), gamesuiconfiguration.getCurrentGameId(), false).setResultCallback(this);
        }
        flag1 = mParent.mIsPlusEnabled;
        mAchievementHeaderAdapter.setVisible(flag1);
        googleapiclient = mNoPlusUpsellAdapter;
        if (!flag1)
        {
            flag = true;
        }
        googleapiclient.setVisible(flag);
        if (!flag1)
        {
            mParent.logPlusUpgradeViewEvent(4, null);
        }
    }

    public final void onGotItClicked(String s)
    {
        mParent.launchPlusUpgradeFlow(4, null);
    }

    public final void onLearnMoreClicked(String s)
    {
    }

    public final volatile void onResult(Result result)
    {
        Object obj;
        int j;
        int l;
        j = 0;
        obj = (com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult)result;
        l = ((com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult) (obj)).getStatus().mStatusCode;
        result = ((com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult) (obj)).getAchievements();
        boolean flag = canUseResult(((Result) (obj)));
        if (!flag)
        {
            result.release();
            return;
        }
        mAchievementAdapter.setDataBuffer(result);
        obj = mRecyclerView.mItemAnimator;
        if (obj == null) goto _L2; else goto _L1
_L1:
        flag = ((android.support.v7.widget.RecyclerView.ItemAnimator) (obj)).isRunning();
        if (this == null) goto _L2; else goto _L3
_L3:
        if (flag) goto _L5; else goto _L4
_L4:
        onAnimationsFinished();
_L2:
        int i1 = result.getCount();
        int i = 0;
_L8:
        if (i >= i1) goto _L7; else goto _L6
_L6:
        int k = j;
        if (result.get(i).getState() == 0)
        {
            k = j + 1;
        }
        break MISSING_BLOCK_LABEL_184;
_L5:
        ((android.support.v7.widget.RecyclerView.ItemAnimator) (obj)).mFinishedListeners.add(this);
          goto _L2
        Exception exception;
        exception;
        result.release();
        throw exception;
_L7:
        if (mAchievementHeaderAdapter != null)
        {
            AchievementHeaderAdapter achievementheaderadapter = mAchievementHeaderAdapter;
            achievementheaderadapter.mUnlockedAchievementCount = j;
            achievementheaderadapter.mTotalAchievementCount = i1;
            achievementheaderadapter.notifySingleItemChanged();
        }
        mLoadingDataViewManager.handleViewState(l, i1, false);
        return;
        i++;
        j = k;
          goto _L8
    }

    public final void onRetry()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            return;
        }
        GamesUiConfiguration gamesuiconfiguration = mParent.mConfiguration;
        if (gamesuiconfiguration.is3PContext())
        {
            Games.Achievements.load$4b6585cf(googleapiclient).setResultCallback(this);
        } else
        {
            Games.Achievements.loadFirstParty(googleapiclient, gamesuiconfiguration.getCurrentPlayerId(), gamesuiconfiguration.getCurrentGameId(), false).setResultCallback(this);
        }
        mLoadingDataViewManager.setViewState(1);
    }
}
