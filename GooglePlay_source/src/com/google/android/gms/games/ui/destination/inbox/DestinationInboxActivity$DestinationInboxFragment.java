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
import com.google.android.gms.games.ui.OnMultiplayerUpdatedListener;
import com.google.android.gms.games.ui.OnQuestUpdatedListener;
import com.google.android.gms.games.ui.OnRequestUpdatedListener;
import com.google.android.gms.games.ui.common.matches.MultiplayerInboxFragment;
import com.google.android.gms.games.ui.common.quests.QuestInboxFragment;
import com.google.android.gms.games.ui.common.requests.RequestInboxFragment;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationMultiContainerFragment;
import com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter;
import com.google.android.gms.games.ui.util.TabConfig;
import com.google.android.gms.games.ui.util.TabSpec;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination.inbox:
//            DestinationInboxActivity

public static final class TAB_CONFIG extends DestinationMultiContainerFragment
    implements OnMultiplayerUpdatedListener, OnQuestUpdatedListener, OnRequestUpdatedListener, com.google.android.gms.games.ui.util.nboxFragment
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



    public _cls1.this._cls0()
    {
        super(TAB_CONFIG, 0x7f0400d7);
    }
}
