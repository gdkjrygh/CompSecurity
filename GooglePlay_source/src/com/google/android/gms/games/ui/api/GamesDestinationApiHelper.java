// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.api;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;
import com.google.android.gms.games.ui.dialog.changeaccount.IntentChangeAccountDialogFragment;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.api:
//            DestinationApiHelper

public final class GamesDestinationApiHelper extends DestinationApiHelper
    implements com.google.android.gms.games.ui.dialog.changeaccount.IntentChangeAccountDialogFragment.IntentAccountSwitcher
{

    private final GamesFragmentActivity mActivity;

    public GamesDestinationApiHelper(GamesFragmentActivity gamesfragmentactivity)
    {
        super(gamesfragmentactivity);
        mActivity = gamesfragmentactivity;
    }

    private String getPlayGamesPackage()
    {
        boolean flag;
        if (UiUtils.getDestinationAppVersion(mActivity) >= 0x14fb180)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return "com.google.android.play.games";
        } else
        {
            return "com.google.android.gms";
        }
    }

    protected final boolean checkDestAppValidity(Intent intent, String s)
    {
        if (super.checkDestAppValidity(intent, s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String s1;
        GoogleApiClient googleapiclient;
        String s2;
        googleapiclient = mActivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mActivity))
        {
            GamesLog.w("GamesDestApiHelper", "startIntent: not connected; ignoring...");
            return false;
        }
        Asserts.checkState(googleapiclient.isConnected());
        s2 = getPlayGamesPackage();
        s1 = Games.getSelectedAccountForGameRestricted(googleapiclient, s2);
        if (s1 != null) goto _L4; else goto _L3
_L3:
        Games.updateSelectedAccountForGameRestricted(googleapiclient, s2, s);
_L7:
        boolean flag = false;
_L8:
        if (flag) goto _L1; else goto _L5
_L5:
        return true;
_L4:
        if (s1.equals(s)) goto _L7; else goto _L6
_L6:
        GamesFragmentActivity gamesfragmentactivity = mActivity;
        IntentChangeAccountDialogFragment intentchangeaccountdialogfragment = new IntentChangeAccountDialogFragment();
        intentchangeaccountdialogfragment.setArguments(IntentChangeAccountDialogFragment.createArgs(gamesfragmentactivity.getString(0x7f10009f), s1, s, intent));
        DialogFragmentUtil.show(mActivity, intentchangeaccountdialogfragment, "com.google.android.gms.games.ui.dialog.changeAccountDialog");
        flag = true;
          goto _L8
    }

    public final void switchAccountForIntent(Intent intent)
    {
        Asserts.checkState(mActivity.mConfiguration.isClientUi(), "This method can only be called from client UI");
        GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mActivity))
        {
            GamesLog.w("GamesDestApiHelper", "switchAccountForIntent: not connected; ignoring...");
            return;
        } else
        {
            String s = mActivity.mConfiguration.getCurrentAccountName();
            Games.updateSelectedAccountForGameRestricted(googleapiclient, getPlayGamesPackage(), s);
            startIntentInternal(intent);
            return;
        }
    }
}
