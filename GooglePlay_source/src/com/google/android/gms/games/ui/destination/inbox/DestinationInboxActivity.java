// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.inbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.OnMultiplayerUpdatedListener;
import com.google.android.gms.games.ui.OnQuestUpdatedListener;
import com.google.android.gms.games.ui.OnRequestUpdatedListener;
import com.google.android.gms.games.ui.common.matches.MultiplayerInboxFragment;
import com.google.android.gms.games.ui.common.matches.MultiplayerInboxHelper;
import com.google.android.gms.games.ui.common.quests.DestinationQuestInboxHelper;
import com.google.android.gms.games.ui.common.quests.QuestInboxFragment;
import com.google.android.gms.games.ui.common.quests.QuestInboxHelper;
import com.google.android.gms.games.ui.common.quests.QuestMetadataProvider;
import com.google.android.gms.games.ui.common.quests.QuestUiConfiguration;
import com.google.android.gms.games.ui.common.requests.RequestInboxFragment;
import com.google.android.gms.games.ui.common.requests.RequestInboxHelper;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationMultiContainerFragment;
import com.google.android.gms.games.ui.destination.HelpContextProvider;
import com.google.android.gms.games.ui.destination.matches.DestinationMultiplayerInboxHelper;
import com.google.android.gms.games.ui.destination.requests.DestinationRequestInboxHelper;
import com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter;
import com.google.android.gms.games.ui.util.TabConfig;
import com.google.android.gms.games.ui.util.TabSpec;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

public final class DestinationInboxActivity extends DestinationFragmentActivity
    implements com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener, com.google.android.gms.games.ui.common.matches.MultiplayerInboxHelper.MultiplayerInboxHelperProvider, com.google.android.gms.games.ui.common.quests.QuestInboxHelper.QuestInboxHelperProvider, QuestMetadataProvider, QuestUiConfiguration, com.google.android.gms.games.ui.common.requests.RequestInboxHelper.RequestInboxHelperProvider, HelpContextProvider, com.google.android.gms.games.ui.dialog.changeaccount.InvitationChangeAccountDialogFragment.InvitationAccountSwitcherProvider, com.google.android.gms.games.ui.dialog.changeaccount.MatchChangeAccountDialogFragment.MatchAccountSwitcherProvider, com.google.android.gms.games.ui.dialog.changeaccount.QuestChangeAccountDialogFragment.QuestAccountSwitcherProvider, com.google.android.gms.games.ui.dialog.changeaccount.RequestChangeAccountDialogFragment.RequestAccountSwitcherProvider
{
    public static final class DestinationInboxFragment extends DestinationMultiContainerFragment
        implements OnMultiplayerUpdatedListener, OnQuestUpdatedListener, OnRequestUpdatedListener, com.google.android.gms.games.ui.util.InboxCountAdapter.OnInboxCountUpdatedListener
    {

        private static final TabConfig TAB_CONFIG;
        private static final TabSpec TAB_SPECS[];
        private int TAB_INBOX_COUNT[] = {
            0, 0, 0
        };

        private void loadInboxActivityCounts(GoogleApiClient googleapiclient)
        {
            if (!((GamesFragmentActivity) (mParent)).mIsPlusEnabled)
            {
                return;
            } else
            {
                Games.Notifications.getInboxActivityCounts(googleapiclient).setResultCallback(new ResultCallback() );
                return;
            }
        }

        public final int getPageInboxCount(int i)
        {
            if (i >= 0 && i < TAB_INBOX_COUNT.length)
            {
                return TAB_INBOX_COUNT[i];
            } else
            {
                return getPageInboxCount(i);
            }
        }

        protected final int getPlaylogElementType()
        {
            return 40;
        }

        public final boolean hasPlayHeader()
        {
            return true;
        }

        public final void onActivityCreated(Bundle bundle)
        {
            onActivityCreated(bundle);
            if (bundle == null)
            {
                int i = mParent.getIntent().getIntExtra("com.google.android.gms.games.TAB", 0);
                super.mViewPager.setCurrentItem(i);
            }
        }

        public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
        {
            loadInboxActivityCounts(googleapiclient);
            Games.Notifications.clearFirstParty(googleapiclient, null, 7);
            mParent.updateInboxCount();
        }

        public final void onInboxCountUpdated()
        {
            GoogleApiClient googleapiclient = getGoogleApiClient();
            if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
            {
                GamesLog.w("DestinationInboxFragment", "reloadData: not connected; ignoring...");
                return;
            } else
            {
                loadInboxActivityCounts(googleapiclient);
                return;
            }
        }

        public final void onMultiplayerUpdated()
        {
            ArrayList arraylist = super.mPagerAdapter.getFragments();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                Fragment fragment = (Fragment)arraylist.get(i);
                if (fragment instanceof OnMultiplayerUpdatedListener)
                {
                    ((OnMultiplayerUpdatedListener)fragment).onMultiplayerUpdated();
                }
            }

        }

        public final void onQuestUpdated()
        {
            ArrayList arraylist = super.mPagerAdapter.getFragments();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                Fragment fragment = (Fragment)arraylist.get(i);
                if (fragment instanceof OnQuestUpdatedListener)
                {
                    ((OnQuestUpdatedListener)fragment).onQuestUpdated();
                }
            }

        }

        public final void onRequestUpdated()
        {
            ArrayList arraylist = super.mPagerAdapter.getFragments();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                Fragment fragment = (Fragment)arraylist.get(i);
                if (fragment instanceof OnRequestUpdatedListener)
                {
                    ((OnRequestUpdatedListener)fragment).onRequestUpdated();
                }
            }

        }

        static 
        {
            Bundle bundle = new Bundle();
            bundle.putInt("FRAGMENT_TAGS", 611);
            Bundle bundle1 = new Bundle();
            bundle1.putInt("FRAGMENT_TAGS", 612);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("FRAGMENT_TAGS", 613);
            TAB_SPECS = (new TabSpec[] {
                new TabSpec(com/google/android/gms/games/ui/common/matches/MultiplayerInboxFragment, 0x7f1001f8, bundle), new TabSpec(com/google/android/gms/games/ui/common/requests/RequestInboxFragment, 0x7f10024f, bundle1), new TabSpec(com/google/android/gms/games/ui/common/quests/QuestInboxFragment, 0x7f100238, bundle2)
            });
            TAB_CONFIG = new TabConfig(TAB_SPECS);
        }



        public DestinationInboxFragment()
        {
            super(TAB_CONFIG, 0x7f0400d7);
        }
    }


    private static final int QUEST_SELECTORS[] = {
        3
    };
    private DestinationMultiplayerInboxHelper mMultiplayerInboxHelper;
    private DestinationQuestInboxHelper mQuestInboxHelper;
    private DestinationRequestInboxHelper mRequestInboxHelper;

    public DestinationInboxActivity()
    {
        DestinationFragmentActivity(0x7f04005e, 0x7f120013, true, false);
    }

    public final String getHelpContext()
    {
        return "mobile_inbox";
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.InvitationChangeAccountDialogFragment.InvitationAccountSwitcher getInvitationAccountSwitcher()
    {
        return mMultiplayerInboxHelper;
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.MatchChangeAccountDialogFragment.MatchAccountSwitcher getMatchAccountSwitcher()
    {
        return mMultiplayerInboxHelper;
    }

    public final MultiplayerInboxHelper getMultiplayerInboxHelper()
    {
        return mMultiplayerInboxHelper;
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.QuestChangeAccountDialogFragment.QuestAccountSwitcher getQuestAccountSwitcher()
    {
        return mQuestInboxHelper;
    }

    public final QuestInboxHelper getQuestInboxHelper()
    {
        return mQuestInboxHelper;
    }

    public final int[] getQuestSelectors()
    {
        return QUEST_SELECTORS;
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.RequestChangeAccountDialogFragment.RequestAccountSwitcher getRequestAccountSwitcher()
    {
        return mRequestInboxHelper;
    }

    public final RequestInboxHelper getRequestInboxHelper()
    {
        return mRequestInboxHelper;
    }

    public final void onCreate(Bundle bundle)
    {
        onCreate(bundle);
        mMultiplayerInboxHelper = new DestinationMultiplayerInboxHelper(this);
        mRequestInboxHelper = new DestinationRequestInboxHelper(this);
        mQuestInboxHelper = new DestinationQuestInboxHelper(this);
    }

    public final void onHeaderClicked(String s)
    {
        String s1;
        byte byte0;
        s1 = null;
        byte0 = -1;
        if (!"invitationsButton".equals(s)) goto _L2; else goto _L1
_L1:
        s1 = "com.google.android.gms.games.destination.SHOW_MULTIPLAYER_LIST";
        byte0 = 0;
_L4:
        if (s1 != null)
        {
            s = new Intent(s1);
            s.putExtra("com.google.android.gms.games.FRAGMENT_INDEX", byte0);
            s.putExtra("com.google.android.gms.games.GAME_ID", super.mConfiguration.getCurrentGameId());
            startActivity(s);
        }
        return;
_L2:
        if ("myTurnButton".equals(s))
        {
            s1 = "com.google.android.gms.games.destination.SHOW_MULTIPLAYER_LIST";
            byte0 = 1;
        } else
        if ("theirTurnButton".equals(s))
        {
            s1 = "com.google.android.gms.games.destination.SHOW_MULTIPLAYER_LIST";
            byte0 = 2;
        } else
        if ("completedMatchesButton".equals(s))
        {
            s1 = "com.google.android.gms.games.destination.SHOW_MULTIPLAYER_LIST";
            byte0 = 3;
        } else
        if ("giftsButton".equals(s))
        {
            s1 = "com.google.android.gms.games.destination.SHOW_REQUEST_LIST";
            byte0 = 0;
        } else
        if ("wishesButton".equals(s))
        {
            s1 = "com.google.android.gms.games.destination.SHOW_REQUEST_LIST";
            byte0 = 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void onUpPressed()
    {
        if (getIntent().getBooleanExtra("com.google.android.gms.games.LAUNCHED_VIA_API", false))
        {
            Intent intent = new Intent("com.google.android.gms.games.destination.MAIN_ACTIVITY");
            intent.addFlags(0x4000000);
            startActivity(intent);
            finish();
            return;
        } else
        {
            onUpPressed();
            return;
        }
    }

    public final boolean useActionBarProgressBar()
    {
        return true;
    }

    public final boolean useFixedHeightQuestTiles()
    {
        return true;
    }

}
