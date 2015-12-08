// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.requests;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.common.requests.RequestFragment;
import com.google.android.gms.games.ui.common.requests.RequestInboxHelper;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.destination.requests:
//            DestinationRequestInboxHelper

public final class DestinationRequestListActivity extends DestinationFragmentActivity
    implements com.google.android.gms.games.ui.common.requests.RequestInboxHelper.RequestInboxHelperProvider, com.google.android.gms.games.ui.dialog.changeaccount.RequestChangeAccountDialogFragment.RequestAccountSwitcherProvider
{

    private int mCurrentFragmentIndex;
    private DestinationRequestInboxHelper mInboxHelper;

    public DestinationRequestListActivity()
    {
        super(0x7f040087, 0x7f120013, true);
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.RequestChangeAccountDialogFragment.RequestAccountSwitcher getRequestAccountSwitcher()
    {
        return mInboxHelper;
    }

    public final RequestInboxHelper getRequestInboxHelper()
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
        mInboxHelper = new DestinationRequestInboxHelper(this);
        mCurrentFragmentIndex = getIntent().getIntExtra("com.google.android.gms.games.FRAGMENT_INDEX", -1);
        if (mCurrentFragmentIndex == -1)
        {
            GamesLog.e("DestRequestActivity", "Fragment Index not found in the Intent! Bailing!");
            finish();
            return;
        }
        obj = super.mFragments;
        mCurrentFragmentIndex;
        JVM INSTR tableswitch 0 1: default 92
    //                   0 119
    //                   1 195;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("getCurrentFragment: unexpected index ")).append(mCurrentFragmentIndex).toString());
_L2:
        bundle = RequestFragment.newInstance(1);
_L7:
        obj = ((FragmentManager) (obj)).beginTransaction();
        ((FragmentTransaction) (obj)).replace(0x7f0d016f, bundle);
        ((FragmentTransaction) (obj)).commit();
        mCurrentFragmentIndex;
        JVM INSTR tableswitch 0 1: default 168
    //                   0 203
    //                   1 212;
           goto _L4 _L5 _L6
_L4:
        throw new IllegalArgumentException((new StringBuilder("setCurrentTitle: unexpected index: ")).append(mCurrentFragmentIndex).toString());
_L3:
        bundle = RequestFragment.newInstance(2);
          goto _L7
_L5:
        int i = 0x7f10024a;
_L9:
        setTitle(i);
        return;
_L6:
        i = 0x7f10024d;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
