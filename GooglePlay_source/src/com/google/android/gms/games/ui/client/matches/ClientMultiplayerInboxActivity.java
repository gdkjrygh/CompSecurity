// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.matches;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.common.matches.InvitationClusterAdapter;
import com.google.android.gms.games.ui.common.matches.InvitationFragment;
import com.google.android.gms.games.ui.common.matches.MatchFragment;
import com.google.android.gms.games.ui.common.matches.MultiplayerInboxFragment;
import com.google.android.gms.games.ui.common.matches.MultiplayerInboxHelper;
import com.google.android.gms.games.ui.common.matches.MultiplayerInboxRecyclerAdapter;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.client.matches:
//            ClientMultiplayerInboxHelper

public final class ClientMultiplayerInboxActivity extends ClientFragmentActivity
    implements com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener, com.google.android.gms.games.ui.common.matches.MultiplayerInboxHelper.MultiplayerInboxHelperProvider
{

    private Fragment mCurrentFragment;
    private int mCurrentFragmentIndex;
    private int mEntryMode;
    private ClientMultiplayerInboxHelper mInboxHelper;

    public ClientMultiplayerInboxActivity()
    {
        super(0x7f040079, 0x7f12001a, true, true);
    }

    private void loadFragment(boolean flag)
    {
        android.support.v4.app.FragmentManagerImpl fragmentmanagerimpl = super.mFragments;
        if (!flag) goto _L2; else goto _L1
_L1:
        mCurrentFragmentIndex;
        JVM INSTR tableswitch 0 4: default 48
    //                   0 75
    //                   1 175
    //                   2 186
    //                   3 194
    //                   4 202;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        throw new IllegalArgumentException((new StringBuilder("getCurrentFragment: unexpected index ")).append(mCurrentFragmentIndex).toString());
_L4:
        Object obj = new MultiplayerInboxFragment();
_L19:
        mCurrentFragment = ((Fragment) (obj));
        obj = fragmentmanagerimpl.beginTransaction();
        ((FragmentTransaction) (obj)).replace(0x7f0d016f, mCurrentFragment);
        ((FragmentTransaction) (obj)).commit();
_L15:
        mCurrentFragmentIndex;
        JVM INSTR tableswitch 0 4: default 148
    //                   0 232
    //                   1 243
    //                   2 250
    //                   3 257
    //                   4 264;
           goto _L9 _L10 _L11 _L12 _L13 _L14
_L9:
        throw new IllegalArgumentException((new StringBuilder("setCurrentTitle: unexpected index: ")).append(mCurrentFragmentIndex).toString());
_L5:
        obj = new InvitationFragment();
        continue; /* Loop/switch isn't completed */
_L6:
        obj = MatchFragment.newInstance(1);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = MatchFragment.newInstance(2);
        continue; /* Loop/switch isn't completed */
_L8:
        obj = MatchFragment.newInstance(3);
        continue; /* Loop/switch isn't completed */
_L2:
        mCurrentFragment = fragmentmanagerimpl.findFragmentById(0x7f0d016f);
        Asserts.checkNotNull(mCurrentFragment, "Failed to find fragment during resume!");
          goto _L15
_L10:
        int i = 0x7f1001f8;
_L17:
        setTitle(i);
        return;
_L11:
        i = 0x7f10018b;
        continue; /* Loop/switch isn't completed */
_L12:
        i = 0x7f10018c;
        continue; /* Loop/switch isn't completed */
_L13:
        i = 0x7f10018f;
        continue; /* Loop/switch isn't completed */
_L14:
        i = 0x7f10018a;
        if (true) goto _L17; else goto _L16
_L16:
        if (true) goto _L19; else goto _L18
_L18:
    }

    protected final int getLogEventType()
    {
        return 10;
    }

    public final MultiplayerInboxHelper getMultiplayerInboxHelper()
    {
        return mInboxHelper;
    }

    protected final int getWrappableContentResId()
    {
        return 0x7f040088;
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

    public final void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1000 && j == 900)
        {
            if (mCurrentFragment instanceof MultiplayerInboxFragment)
            {
                MultiplayerInboxFragment multiplayerinboxfragment = (MultiplayerInboxFragment)mCurrentFragment;
                ZInvitationCluster zinvitationcluster = (ZInvitationCluster)intent.getParcelableExtra("com.google.android.gms.games.INVITATION_CLUSTER");
                boolean flag = intent.getBooleanExtra("com.google.android.gms.games.REMOVE_CLUSTER", false);
                java.util.ArrayList arraylist = intent.getStringArrayListExtra("com.google.android.gms.games.REMOVED_ID_LIST");
                if (intent.getBooleanExtra("com.google.android.gms.games.PLAYER_WAS_ADDED", false))
                {
                    multiplayerinboxfragment.reloadData();
                    return;
                } else
                {
                    intent = multiplayerinboxfragment.mMultiplayerInboxAdapter;
                    ((MultiplayerInboxRecyclerAdapter) (intent)).mInvitationClusterAdapter.updateInvitationCluster(zinvitationcluster, flag, arraylist);
                    intent.updateHeaders();
                    return;
                }
            }
            if (mCurrentFragment instanceof InvitationFragment)
            {
                InvitationFragment invitationfragment = (InvitationFragment)mCurrentFragment;
                ZInvitationCluster zinvitationcluster1 = (ZInvitationCluster)intent.getParcelableExtra("com.google.android.gms.games.INVITATION_CLUSTER");
                boolean flag1 = intent.getBooleanExtra("com.google.android.gms.games.REMOVE_CLUSTER", false);
                java.util.ArrayList arraylist1 = intent.getStringArrayListExtra("com.google.android.gms.games.REMOVED_ID_LIST");
                if (intent.getBooleanExtra("com.google.android.gms.games.PLAYER_WAS_ADDED", false))
                {
                    invitationfragment.reloadData();
                    return;
                } else
                {
                    invitationfragment.mInvitationClusterAdapter.updateInvitationCluster(zinvitationcluster1, flag1, arraylist1);
                    invitationfragment.computeInvitationCount();
                    return;
                }
            } else
            {
                GamesLog.w("ClientMultiInboxAct", "onActivityResult received coming from the Public Invitation UI but the current fragment cannot go to this UI. Something is really weird.");
                return;
            }
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

    public final void onBackPressed()
    {
        boolean flag;
        switch (mEntryMode)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Invalid entry mode: ")).append(mEntryMode).toString());

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_84;

        case 1: // '\001'
            if (mCurrentFragmentIndex != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            break;
        }
_L1:
        if (flag)
        {
            mCurrentFragmentIndex = 0;
            loadFragment(true);
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
        flag = false;
          goto _L1
    }

    public final void onCreate(Bundle bundle)
    {
        boolean flag;
        super.onCreate(bundle);
        mShowGameNameAsTitle = false;
        mInboxHelper = new ClientMultiplayerInboxHelper(this);
        String s = getIntent().getAction();
        if (s.equals("com.google.android.gms.games.SHOW_MULTIPLAYER_INBOX"))
        {
            mEntryMode = 1;
        } else
        if (s.equals("com.google.android.gms.games.SHOW_INVITATIONS"))
        {
            mEntryMode = 2;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Intent action is invalid: ")).append(s).toString());
        }
        if (bundle == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        mEntryMode;
        JVM INSTR tableswitch 1 2: default 80
    //                   1 153
    //                   2 164;
           goto _L3 _L4 _L5
_L3:
        throw new IllegalArgumentException((new StringBuilder("Invalid entry mode: ")).append(mEntryMode).toString());
_L4:
        mCurrentFragmentIndex = 0;
_L7:
        loadFragment(flag);
        return;
_L5:
        mCurrentFragmentIndex = 1;
        continue; /* Loop/switch isn't completed */
_L2:
        mCurrentFragmentIndex = bundle.getInt("savedStateCurrentFragmentIndex");
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean onCreateOptionsMenu(Menu menu)
    {
        boolean flag = super.onCreateOptionsMenu(menu);
        menu = menu.findItem(0x7f0d0354);
        Asserts.checkNotNull(menu);
        menu.setVisible(((Boolean)G.allowNearbyPlayerSearch.get()).booleanValue());
        return flag;
    }

    public final void onHeaderClicked(String s)
    {
        int i = -1;
        if (!"invitationsButton".equals(s)) goto _L2; else goto _L1
_L1:
        i = 1;
_L4:
        if (i >= 0 && i != mCurrentFragmentIndex)
        {
            mCurrentFragmentIndex = i;
            loadFragment(true);
        }
        return;
_L2:
        if ("myTurnButton".equals(s))
        {
            i = 2;
        } else
        if ("theirTurnButton".equals(s))
        {
            i = 3;
        } else
        if ("completedMatchesButton".equals(s))
        {
            i = 4;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0d0354)
        {
            UiUtils.launchNearbyLearnMore(this);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("savedStateCurrentFragmentIndex", mCurrentFragmentIndex);
    }
}
