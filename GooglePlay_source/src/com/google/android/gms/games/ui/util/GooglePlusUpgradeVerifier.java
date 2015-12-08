// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.games.ui.util:
//            DialogFragmentUtil

public final class GooglePlusUpgradeVerifier
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, Runnable
{

    private static final long MILLIS_BETWEEN_CONNECTIONS;
    private final GamesFragmentActivity mActivity;
    private int mAttempts;
    public final GoogleApiClient mClient;
    private long mConnectionTimestamp;
    private final Runnable mOnValid;
    private long mTimeout;

    public GooglePlusUpgradeVerifier(GamesFragmentActivity gamesfragmentactivity, Runnable runnable)
    {
        mActivity = gamesfragmentactivity;
        mOnValid = runnable;
        gamesfragmentactivity = Games.getCurrentAccountName(mActivity.getGoogleApiClient());
        mClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(mActivity, this, this)).setAccountName(gamesfragmentactivity).addApi(Games.API_1P, com.google.android.gms.games.Games.GamesOptions.builder().setShowConnectingPopup$371b5ca1().build()).build();
    }

    public final void loop()
    {
        if (mClient.isConnected())
        {
            Games.signOut(mClient);
            mClient.disconnect();
        }
        run();
    }

    public final void onConnected(Bundle bundle)
    {
        if (TextUtils.isEmpty(Games.Players.getCurrentPlayerId(mClient)))
        {
            loop();
            return;
        } else
        {
            DialogFragmentUtil.dismiss(mActivity, "VerifyAccountDialog");
            mOnValid.run();
            return;
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        if (connectionresult.hasResolution())
        {
            try
            {
                connectionresult.startResolutionForResult(mActivity, 903);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ConnectionResult connectionresult)
            {
                loop();
            }
            return;
        } else
        {
            loop();
            return;
        }
    }

    public final void onConnectionSuspended(int i)
    {
        loop();
    }

    public final void run()
    {
        long l = SystemClock.elapsedRealtime();
        int i = mAttempts;
        mAttempts = i + 1;
        if (i == 0)
        {
            com.google.android.gms.games.ui.dialog.GamesDialogFragment gamesdialogfragment = PrebuiltDialogs.newProgressDialog(0x7f1002d3);
            DialogFragmentUtil.show(mActivity, gamesdialogfragment, "VerifyAccountDialog");
            mTimeout = TimeUnit.SECONDS.toMillis(30L) + l;
        } else
        if (l > mTimeout && mAttempts > 5)
        {
            DialogFragmentUtil.dismiss(mActivity, "VerifyAccountDialog");
            com.google.android.gms.games.ui.dialog.PrebuiltDialogs._cls5 _lcls5 = new com.google.android.gms.games.ui.dialog.PrebuiltDialogs._cls5(0x7f1002d2, 0x7f1002d1);
            DialogFragmentUtil.show(mActivity, _lcls5, "VerificationFailedDialog");
            return;
        }
        if (l - mConnectionTimestamp < MILLIS_BETWEEN_CONNECTIONS)
        {
            SystemClock.sleep(l - mConnectionTimestamp);
        }
        mConnectionTimestamp = l;
        mClient.connect();
    }

    static 
    {
        MILLIS_BETWEEN_CONNECTIONS = TimeUnit.SECONDS.toMillis(1L);
    }
}
