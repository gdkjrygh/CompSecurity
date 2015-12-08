// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.matches;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.common.matches.InvitationFragment;
import com.google.android.gms.games.ui.common.matches.MatchFragment;
import com.google.android.gms.games.ui.common.matches.MultiplayerInboxHelper;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.destination.matches:
//            DestinationMultiplayerInboxHelper

public final class DestinationMultiplayerListActivity extends DestinationFragmentActivity
    implements com.google.android.gms.games.ui.common.matches.MultiplayerInboxHelper.MultiplayerInboxHelperProvider, com.google.android.gms.games.ui.dialog.changeaccount.InvitationChangeAccountDialogFragment.InvitationAccountSwitcherProvider, com.google.android.gms.games.ui.dialog.changeaccount.MatchChangeAccountDialogFragment.MatchAccountSwitcherProvider
{

    private int mCurrentFragmentIndex;
    private DestinationMultiplayerInboxHelper mInboxHelper;

    public DestinationMultiplayerListActivity()
    {
        super(0x7f040087, 0x7f120013, true, false);
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.InvitationChangeAccountDialogFragment.InvitationAccountSwitcher getInvitationAccountSwitcher()
    {
        return mInboxHelper;
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.MatchChangeAccountDialogFragment.MatchAccountSwitcher getMatchAccountSwitcher()
    {
        return mInboxHelper;
    }

    public final MultiplayerInboxHelper getMultiplayerInboxHelper()
    {
        return mInboxHelper;
    }

    public final void onCreate(Bundle bundle)
    {
        Object obj;
        super.onCreate(bundle);
        if (isFinishing())
        {
            return;
        }
        mInboxHelper = new DestinationMultiplayerInboxHelper(this);
        mCurrentFragmentIndex = getIntent().getIntExtra("com.google.android.gms.games.FRAGMENT_INDEX", -1);
        if (mCurrentFragmentIndex == -1)
        {
            GamesLog.e("DestMultiplayerListAct", "Fragment Index not found in the Intent! Bailing!");
            finish();
            return;
        }
        obj = super.mFragments;
        mCurrentFragmentIndex;
        JVM INSTR tableswitch 0 3: default 100
    //                   0 127
    //                   1 215
    //                   2 223
    //                   3 231;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder("getCurrentFragment: unexpected index ")).append(mCurrentFragmentIndex).toString());
_L2:
        bundle = new InvitationFragment();
_L11:
        obj = ((FragmentManager) (obj)).beginTransaction();
        ((FragmentTransaction) (obj)).replace(0x7f0d016f, bundle);
        ((FragmentTransaction) (obj)).commit();
        mCurrentFragmentIndex;
        JVM INSTR tableswitch 0 3: default 188
    //                   0 239
    //                   1 248
    //                   2 254
    //                   3 260;
           goto _L6 _L7 _L8 _L9 _L10
_L6:
        throw new IllegalArgumentException((new StringBuilder("setCurrentTitle: unexpected index: ")).append(mCurrentFragmentIndex).toString());
_L3:
        bundle = MatchFragment.newInstance(1);
          goto _L11
_L4:
        bundle = MatchFragment.newInstance(2);
          goto _L11
_L5:
        bundle = MatchFragment.newInstance(3);
          goto _L11
_L7:
        int i = 0x7f10018b;
_L13:
        setTitle(i);
        return;
_L8:
        i = 0x7f10018c;
        continue; /* Loop/switch isn't completed */
_L9:
        i = 0x7f10018f;
        continue; /* Loop/switch isn't completed */
_L10:
        i = 0x7f10018a;
        if (true) goto _L13; else goto _L12
_L12:
    }
}
