// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.widget.Toast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.common.players.ProfileVisibilityHelper;

public abstract class BaseGamesProfileVisibilityHelper
    implements ResultCallback, ProfileVisibilityHelper
{
    public static interface ProfileVisibilityInformer
    {

        public abstract boolean getProfileVisibility();

        public abstract void updateProfileVisibility(boolean flag);
    }


    protected GamesFragmentActivity mActivity;
    private ProfileVisibilityInformer mInformer;
    private boolean mPubliclyVisible;

    protected BaseGamesProfileVisibilityHelper(GamesFragmentActivity gamesfragmentactivity, ProfileVisibilityInformer profilevisibilityinformer)
    {
        mInformer = (ProfileVisibilityInformer)Preconditions.checkNotNull(profilevisibilityinformer);
        mActivity = (GamesFragmentActivity)Preconditions.checkNotNull(gamesfragmentactivity);
    }

    protected abstract void dismissWaitingDialog();

    public final boolean isProfileVisibilityPublic()
    {
        return mInformer.getProfileVisibility();
    }

    public final volatile void onResult(Result result)
    {
        result = (Status)result;
        dismissWaitingDialog();
        if (((Status) (result)).mStatusCode == 0)
        {
            Toast.makeText(mActivity, 0x7f100228, 1).show();
            mInformer.updateProfileVisibility(mPubliclyVisible);
            return;
        } else
        {
            Toast.makeText(mActivity, 0x7f100227, 1).show();
            return;
        }
    }

    public final void setProfileVisibility(boolean flag)
    {
        GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("ProfileVisiHelp", "Trying to set visibility when not connected.");
            return;
        } else
        {
            Games.Players.updateProfileSettingsInternal(googleapiclient, flag).setResultCallback(this);
            mPubliclyVisible = flag;
            showWaitingDialog();
            return;
        }
    }

    protected abstract void showWaitingDialog();
}
