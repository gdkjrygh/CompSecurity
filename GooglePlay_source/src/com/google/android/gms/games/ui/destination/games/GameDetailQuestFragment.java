// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.ui.ButtonRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.common.SlimGotItCardAdapter;
import com.google.android.gms.games.ui.common.quests.QuestFragment;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivityBase;
import com.google.android.gms.games.ui.destination.LoggablePage;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailActivity

public final class GameDetailQuestFragment extends QuestFragment
    implements android.view.View.OnClickListener, com.google.android.gms.games.ui.ButtonRecyclerAdapter.ButtonEventListener, LoggablePage, com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter.OnPageScrolledToListener
{

    private GameDetailActivity mParent;
    private SlimGotItCardAdapter mUpsellCardAdapter;
    private ButtonRecyclerAdapter mViewCompletedQuestsAdapter;

    public GameDetailQuestFragment()
    {
    }

    public final void logPageView(PowerUpPlayLogger powerupplaylogger)
    {
        powerupplaylogger.logGameAction(mParent.mCurrentGame, 5, false);
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        super.mForceQuestLoad = true;
        Asserts.checkState(super.mActivity instanceof GameDetailActivity);
        mParent = (GameDetailActivity)super.mActivity;
        mUpsellCardAdapter = new SlimGotItCardAdapter(mParent, new com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.Data(0x7f0b0061, 0x7f020120, 0x7f1000de, 0x7f1000bc), new com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.GotItEventListener() {

            final GameDetailQuestFragment this$0;

            public final void onGotItClicked(String s)
            {
                mParent.launchPlusUpgradeFlow(5, null);
            }

            public final void onLearnMoreClicked(String s)
            {
            }

            
            {
                this$0 = GameDetailQuestFragment.this;
                super();
            }
        });
        mViewCompletedQuestsAdapter = new ButtonRecyclerAdapter(mParent, this);
        mViewCompletedQuestsAdapter.setVisible(false);
        Object obj = mViewCompletedQuestsAdapter;
        obj.mButtonTextResId = 0x7f1000d5;
        ((ButtonRecyclerAdapter) (obj)).notifySingleItemChanged();
        obj = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mUpsellCardAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mQuestAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mViewCompletedQuestsAdapter);
        if (PlatformVersion.checkVersion(21) && bundle == null && super.mActivity.getIntent().getIntExtra("com.google.android.gms.games.ANIMATION", -1) != -1)
        {
            postponeInitialReveal();
        }
        setAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).build());
    }

    public final void onButtonClicked$5d527811()
    {
        GamesUiConfiguration gamesuiconfiguration = ((GamesFragmentActivity) (mParent)).mConfiguration;
        Intent intent = new Intent("com.google.android.gms.games.destination.VIEW_COMPLETED_QUEST_LIST");
        intent.putExtra("com.google.android.gms.games.GAME_ID", gamesuiconfiguration.getCurrentGameId());
        intent.putExtra("com.google.android.gms.games.PLAYER_ID", gamesuiconfiguration.getCurrentPlayerId());
        mParent.startActivity(intent);
    }

    public final void onClick(View view)
    {
        if (view.getId() == 0x7f0d011b)
        {
            mParent.logClickEvent(803, view);
            onButtonClicked$5d527811();
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = (ViewGroup)super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(0x7f04005c, null);
        layoutinflater.setVisibility(8);
        bundle = (Button)layoutinflater.findViewById(0x7f0d011b);
        bundle.setText(0x7f1000d5);
        bundle.setOnClickListener(this);
        viewgroup.addView(layoutinflater, 0);
        int i = 0;
        layoutinflater = UiUtils.findPlayHeaderListWrappable(this);
        if (layoutinflater != null)
        {
            i = layoutinflater.getHeaderHeight(mParent);
        }
        mLoadingDataViewManager.setViewState(4);
        mLoadingDataViewManager = new LoadingDataRecyclerViewManager(viewgroup, 0x102000a, 0x7f0d01b4, 0x7f0d0165, 0x7f0d01ae, 0x7f0d01b3, this, this, this, i);
        mLoadingDataViewManager.setViewState(1);
        return viewgroup;
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        super.onGoogleApiClientConnected(googleapiclient);
        boolean flag1 = ((GamesFragmentActivity) (mParent)).mIsPlusEnabled;
        if (!flag1)
        {
            mParent.logPlusUpgradeViewEvent(5, null);
        }
        googleapiclient = mUpsellCardAdapter;
        boolean flag;
        if (!flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        googleapiclient.setVisible(flag);
        mViewCompletedQuestsAdapter.setVisible(flag1);
    }

    public final void onPageScrolledTo()
    {
        logPageView(((DestinationFragmentActivityBase) (mParent)).mPlayLogger);
    }

    public final void onPageSelected()
    {
    }

    protected final void onQuestsLoaded(QuestBuffer questbuffer)
    {
        if (questbuffer == null || questbuffer.getCount() == 0)
        {
            mViewCompletedQuestsAdapter.setVisible(false);
            return;
        }
        int i = 0;
        for (int j = questbuffer.getCount(); i < j; i++)
        {
            if (((Quest)questbuffer.get(i)).getState() == 4)
            {
                mViewCompletedQuestsAdapter.setVisible(true);
                return;
            }
        }

        mViewCompletedQuestsAdapter.setVisible(false);
    }

    protected final boolean showDataWhileEmpty()
    {
        return !((GamesFragmentActivity) (mParent)).mIsPlusEnabled;
    }

}
