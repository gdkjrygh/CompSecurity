// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesFragmentActivity

public final class GamesUiConfiguration
{
    public static interface CurrentGameProvider
    {

        public abstract Game getCurrentGame();
    }

    public static interface GamesUiConfigurationProvider
    {

        public abstract GamesUiConfiguration getConfiguration();
    }


    private final Activity mActivity;
    private final int mDeviceType;
    public final int mUiType;

    public GamesUiConfiguration(Activity activity, int i, int j)
    {
        boolean flag1 = true;
        super();
        mActivity = activity;
        mUiType = i;
        boolean flag;
        if (i == 1 || mUiType == 2 || mUiType == 3 || mUiType == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "Invalid UI Type");
        mDeviceType = j;
        if (j == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "Invalid Device Type");
    }

    private GamesFragmentActivity getGamesActivity()
    {
        if (!(mActivity instanceof GamesFragmentActivity))
        {
            throw new UnsupportedOperationException("This method can only be called from a GamesFragmentActivity context");
        } else
        {
            return (GamesFragmentActivity)mActivity;
        }
    }

    public final String getCurrentAccountName()
    {
        if (isClientUi() || isDestinationUi())
        {
            GamesFragmentActivity gamesfragmentactivity = getGamesActivity();
            com.google.android.gms.common.api.GoogleApiClient googleapiclient = gamesfragmentactivity.getGoogleApiClient();
            if (UiUtils.checkClientDisconnected(googleapiclient, gamesfragmentactivity))
            {
                GamesLog.w("GamesUiConfig", "getCurrentAccountName: not connected; ignoring...");
                return null;
            } else
            {
                return Games.getCurrentAccountName(googleapiclient);
            }
        } else
        {
            return mActivity.getIntent().getStringExtra("com.google.android.gms.games.ACCOUNT_NAME");
        }
    }

    public final String getCurrentGameId()
    {
        if (isClientUi())
        {
            GamesFragmentActivity gamesfragmentactivity = getGamesActivity();
            com.google.android.gms.common.api.GoogleApiClient googleapiclient = gamesfragmentactivity.getGoogleApiClient();
            if (UiUtils.checkClientDisconnected(googleapiclient, gamesfragmentactivity))
            {
                GamesLog.w("GamesUiConfig", "getCurrentGameId: not connected; ignoring...");
                return null;
            } else
            {
                return Games.GamesMetadata.getCurrentGame(googleapiclient).getApplicationId();
            }
        }
        boolean flag;
        if (mUiType == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || isRestrictedUi())
        {
            return mActivity.getIntent().getStringExtra("com.google.android.gms.games.GAME_ID");
        }
        if (mActivity instanceof CurrentGameProvider)
        {
            Game game = ((CurrentGameProvider)mActivity).getCurrentGame();
            if (game != null)
            {
                return game.getApplicationId();
            } else
            {
                GamesLog.w("GamesUiConfig", "Trying to get a current game Id from a CurrentGameProvider but we don't have a current game yet.");
                return null;
            }
        } else
        {
            GamesLog.w("GamesUiConfig", "Trying to get a current game Id in a destination context. Returning null as we are not game specific here");
            return null;
        }
    }

    public final String getCurrentPlayerId()
    {
        GamesFragmentActivity gamesfragmentactivity = getGamesActivity();
        if (isClientUi() || isDestinationUi())
        {
            com.google.android.gms.common.api.GoogleApiClient googleapiclient = gamesfragmentactivity.getGoogleApiClient();
            if (UiUtils.checkClientDisconnected(googleapiclient, gamesfragmentactivity))
            {
                GamesLog.w("GamesUiConfig", "getCurrentPlayerId: not connected; ignoring...");
                return null;
            } else
            {
                return Games.Players.getCurrentPlayerId(googleapiclient);
            }
        } else
        {
            return mActivity.getIntent().getStringExtra("com.google.android.gms.games.PLAYER_ID");
        }
    }

    public final boolean is3PContext()
    {
        return mUiType == 1;
    }

    public final boolean isClientUi()
    {
        return mUiType == 1;
    }

    public final boolean isDestinationUi()
    {
        return mUiType == 3;
    }

    public final boolean isRestrictedUi()
    {
        return mUiType == 0;
    }
}
