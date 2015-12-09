// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.requests;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.common.requests.RequestClusterAdapter;
import com.google.android.gms.games.ui.common.requests.RequestFragment;
import com.google.android.gms.games.ui.common.requests.RequestInboxFragment;
import com.google.android.gms.games.ui.common.requests.RequestInboxHelper;
import com.google.android.gms.games.ui.common.requests.RequestInboxRecyclerAdapter;

// Referenced classes of package com.google.android.gms.games.ui.client.requests:
//            ClientRequestInboxHelper

public final class ClientRequestInboxActivity extends ClientFragmentActivity
    implements com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener, com.google.android.gms.games.ui.common.requests.RequestInboxHelper.RequestInboxHelperProvider
{

    private Fragment mCurrentFragment;
    private int mCurrentFragmentIndex;
    private ClientRequestInboxHelper mInboxHelper;

    public ClientRequestInboxActivity()
    {
        super(0x7f040079, 0x7f120019, true, true);
    }

    private void loadFragment(boolean flag)
    {
        android.support.v4.app.FragmentManagerImpl fragmentmanagerimpl = super.mFragments;
        if (!flag) goto _L2; else goto _L1
_L1:
        mCurrentFragmentIndex;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 67
    //                   1 159
    //                   2 167;
           goto _L3 _L4 _L5 _L6
_L3:
        throw new IllegalArgumentException((new StringBuilder("getCurrentFragment: unexpected index ")).append(mCurrentFragmentIndex).toString());
_L4:
        Object obj = new RequestInboxFragment();
_L15:
        mCurrentFragment = ((Fragment) (obj));
        obj = fragmentmanagerimpl.beginTransaction();
        ((FragmentTransaction) (obj)).replace(0x7f0d016f, mCurrentFragment);
        ((FragmentTransaction) (obj)).commit();
_L11:
        mCurrentFragmentIndex;
        JVM INSTR tableswitch 0 2: default 132
    //                   0 197
    //                   1 208
    //                   2 215;
           goto _L7 _L8 _L9 _L10
_L7:
        throw new IllegalArgumentException((new StringBuilder("setCurrentTitle: unexpected index: ")).append(mCurrentFragmentIndex).toString());
_L5:
        obj = RequestFragment.newInstance(1);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = RequestFragment.newInstance(2);
        continue; /* Loop/switch isn't completed */
_L2:
        mCurrentFragment = fragmentmanagerimpl.findFragmentById(0x7f0d016f);
        Asserts.checkNotNull(mCurrentFragment, "Failed to find fragment during resume!");
          goto _L11
_L8:
        int i = 0x7f10024f;
_L13:
        setTitle(i);
        return;
_L9:
        i = 0x7f10024a;
        continue; /* Loop/switch isn't completed */
_L10:
        i = 0x7f10024d;
        if (true) goto _L13; else goto _L12
_L12:
        if (true) goto _L15; else goto _L14
_L14:
    }

    protected final int getLogEventType()
    {
        return 12;
    }

    public final RequestInboxHelper getRequestInboxHelper()
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

    public final void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1000 && j == 900)
        {
            if (mCurrentFragment instanceof RequestInboxFragment)
            {
                RequestInboxFragment requestinboxfragment = (RequestInboxFragment)mCurrentFragment;
                GameRequestCluster gamerequestcluster = (GameRequestCluster)intent.getParcelableExtra("com.google.android.gms.games.GAME_REQUEST_CLUSTER");
                boolean flag = intent.getBooleanExtra("com.google.android.gms.games.REMOVE_CLUSTER", false);
                java.util.ArrayList arraylist = intent.getStringArrayListExtra("com.google.android.gms.games.REMOVED_ID_LIST");
                if (intent.getBooleanExtra("com.google.android.gms.games.PLAYER_WAS_ADDED", false))
                {
                    requestinboxfragment.reloadData();
                    return;
                } else
                {
                    intent = requestinboxfragment.mInboxAdapter;
                    ((RequestInboxRecyclerAdapter) (intent)).mGiftClusterAdapter.updateRequestCluster(gamerequestcluster, flag, arraylist);
                    ((RequestInboxRecyclerAdapter) (intent)).mWishClusterAdapter.updateRequestCluster(gamerequestcluster, flag, arraylist);
                    intent.updateHeaders();
                    return;
                }
            }
            if (mCurrentFragment instanceof RequestFragment)
            {
                RequestFragment requestfragment = (RequestFragment)mCurrentFragment;
                GameRequestCluster gamerequestcluster1 = (GameRequestCluster)intent.getParcelableExtra("com.google.android.gms.games.GAME_REQUEST_CLUSTER");
                boolean flag1 = intent.getBooleanExtra("com.google.android.gms.games.REMOVE_CLUSTER", false);
                java.util.ArrayList arraylist1 = intent.getStringArrayListExtra("com.google.android.gms.games.REMOVED_ID_LIST");
                if (intent.getBooleanExtra("com.google.android.gms.games.PLAYER_WAS_ADDED", false))
                {
                    requestfragment.reloadData();
                    return;
                } else
                {
                    requestfragment.mRequestClusterAdapter.updateRequestCluster(gamerequestcluster1, flag1, arraylist1);
                    requestfragment.updateAdapter();
                    return;
                }
            } else
            {
                GamesLog.w("ClientReqInboxAct", "onActivityResult received coming from the Public Invitation UI but the current fragment cannot go to this UI. Something is really weird.");
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
        if (mCurrentFragmentIndex != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
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
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mShowGameNameAsTitle = false;
        mInboxHelper = new ClientRequestInboxHelper(this);
        boolean flag;
        if (bundle == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            mCurrentFragmentIndex = 0;
        } else
        {
            mCurrentFragmentIndex = bundle.getInt("savedStateCurrentFragmentIndex");
        }
        loadFragment(flag);
    }

    public final void onHeaderClicked(String s)
    {
        int i = -1;
        if (!"giftsButton".equals(s)) goto _L2; else goto _L1
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
        if ("wishesButton".equals(s))
        {
            i = 2;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("savedStateCurrentFragmentIndex", mCurrentFragmentIndex);
    }
}
