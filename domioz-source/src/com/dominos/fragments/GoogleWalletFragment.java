// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.GoogleWalletUtil;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.android.sdk.extension.google.wallet.GoogleWalletManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.e;
import com.google.android.gms.wallet.f;
import org.androidannotations.api.c.p;

// Referenced classes of package com.dominos.fragments:
//            BaseFragment, GoogleWalletFragment_

public class GoogleWalletFragment extends BaseFragment
    implements n, o
{

    public static final long GW_INITIAL_RETRY_DELAY = 3000L;
    public static final int GW_MAX_RETRIES = 3;
    public static final int GW_MESSAGE_RETRY_CONNECTION = 18;
    public static final int GW_REQUEST_CODE_LOAD_MASKED_WALLET_PLS = 17;
    public static final int GW_REQUEST_CODE_RESOLVE_ERR = 19;
    public static final int GW_REQUEST_CODE_RESOLVE_PRE_AUTH_PLS = 16;
    public static final String MASKED_WALLET_KEY = "MaskedWallet";
    public static final String SHOW_WALLET_ERROR_KEY = "ShowWalletError";
    private static final String TAG = com/dominos/fragments/GoogleWalletFragment.getSimpleName();
    String googleWalletUnavailableString;
    private boolean isGoogleWalletPreAuthed;
    boolean mCanShowWalletErrorDialog;
    private int mConnectRetryCounter;
    protected ConnectionResult mConnectionResult;
    protected l mGoogleApiClient;
    private GoogleWalletManager mGoogleWalletManager;
    protected boolean mLoadingWallet;
    MaskedWallet mMaskedWallet;
    protected OnMaskedWalletLoadedListener mMaskedWalletLoadedListener;
    protected OnWalletConnectionListener mOnWalletConnectionListener;
    DominosPrefs_ mPrefs;
    protected RetryHandler mRetryHandler;
    String spendingLimitExceededString;

    public GoogleWalletFragment()
    {
        mLoadingWallet = false;
    }

    private void displayGoogleWalletErrorToast()
    {
        showLongToast(googleWalletUnavailableString);
    }

    public static GoogleWalletFragment newInstance(boolean flag)
    {
        GoogleWalletFragment_ googlewalletfragment_ = new GoogleWalletFragment_();
        (new Bundle()).putBoolean("ShowWalletError", flag);
        return googlewalletfragment_;
    }

    private void reconnect()
    {
        if (mConnectRetryCounter < 3)
        {
            Message message = mRetryHandler.obtainMessage(18);
            long l1 = (long)(3000D * Math.pow(2D, mConnectRetryCounter));
            mRetryHandler.sendMessageDelayed(message, l1);
            mConnectRetryCounter = mConnectRetryCounter + 1;
            return;
        } else
        {
            handleError(402);
            return;
        }
    }

    public void connectWallet()
    {
        if (!mGoogleApiClient.f())
        {
            mLoadingWallet = true;
            mGoogleApiClient.c();
        }
    }

    public MaskedWallet getMaskedWallet()
    {
        return mMaskedWallet;
    }

    protected void handleError(int i)
    {
        switch (i)
        {
        default:
            LogUtil.d(TAG, "GW: Unrecoverable error.", new Object[0]);
            if (mOnWalletConnectionListener != null)
            {
                mOnWalletConnectionListener.onWalletFailure();
            }
            displayGoogleWalletErrorToast();
            return;

        case 406: 
            showLongToast(spendingLimitExceededString);
            return;
        }
    }

    public boolean isLoadingWallet()
    {
        return mLoadingWallet;
    }

    public boolean isUserPreAuthorized()
    {
        return isGoogleWalletPreAuthed;
    }

    public boolean isWalletConnected()
    {
        return mGoogleApiClient.f();
    }

    public void loadMaskedWallet(LabsOrder labsorder)
    {
        mLoadingWallet = true;
        if (mGoogleApiClient.g())
        {
            LogUtil.d(TAG, "Unable to load masked wallet. Wallet client is connecting", new Object[0]);
            return;
        }
        if (!mGoogleApiClient.f())
        {
            LogUtil.d(TAG, "Unable to load masked wallet. Wallet client is not connected", new Object[0]);
            mGoogleApiClient.c();
            return;
        } else
        {
            labsorder = (new GoogleWalletUtil()).createMaskedWalletRequest(labsorder, mConfigurationManager.getApplicationConfiguration().getGoogleWalletTipPad());
            LogUtil.d(TAG, "Loading Masked Wallet..", new Object[0]);
            f.b.a(mGoogleApiClient, labsorder);
            return;
        }
    }

    public void onAfterInject()
    {
        mGoogleWalletManager = (GoogleWalletManager)mMobileSession.getManager("google_wallet_manager");
    }

    public void onConnected(Bundle bundle)
    {
        LogUtil.d(TAG, "Connected to Google Play Services. Requesting PreAuth!", new Object[0]);
        mLoadingWallet = true;
        f.b.a(mGoogleApiClient);
        if (mOnWalletConnectionListener != null)
        {
            mOnWalletConnectionListener.onWalletConnected();
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        LogUtil.d(TAG, "Connected to Google Play Services Failed.", new Object[0]);
        mConnectionResult = connectionresult;
        resolveUnsuccessfulConnectionResult();
        if (mOnWalletConnectionListener != null)
        {
            mOnWalletConnectionListener.onWalletFailure();
        }
        mLoadingWallet = false;
    }

    public void onConnectionSuspended(int i)
    {
        LogUtil.d(TAG, "Connected to Google Play Services suspended.", new Object[0]);
        if (mOnWalletConnectionListener != null)
        {
            mOnWalletConnectionListener.onWalletFailure();
        }
        mLoadingWallet = false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mRetryHandler = new RetryHandler(null);
        mGoogleApiClient = mGoogleWalletManager.getWalletClient(getActivity(), this, this);
    }

    public void onLoadMaskedWallet(int i, Intent intent)
    {
        LogUtil.d(TAG, "ActivityResult : onLoadMaskedWallet", new Object[0]);
        mLoadingWallet = false;
        i;
        JVM INSTR tableswitch -1 0: default 40
    //                   -1 92
    //                   0 122;
           goto _L1 _L2 _L3
_L1:
        int j = intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", -1);
        LogUtil.d(TAG, String.format("GW: Error code %d when loading masked wallet.", new Object[] {
            Integer.valueOf(j)
        }), new Object[0]);
        handleError(j);
_L5:
        mMaskedWalletLoadedListener.onMaskedWalletLoaded(i);
        return;
_L2:
        LogUtil.d(TAG, "GW: Masked wallet successfully loaded.", new Object[0]);
        mMaskedWallet = (MaskedWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
        continue; /* Loop/switch isn't completed */
_L3:
        LogUtil.d(TAG, "GW: Masked wallet load cancelled by user.", new Object[0]);
        mPrefs.googleWalletState().b("not_authorized");
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onResolveGoogleWalletError(int i, Intent intent)
    {
        LogUtil.d(TAG, "ActivityResult : onResolveGoogleWalletError", new Object[0]);
        if (i == -1)
        {
            mGoogleApiClient.c();
            return;
        } else
        {
            mOnWalletConnectionListener.onWalletFailure();
            return;
        }
    }

    public void onResolvePreAuth(int i, Intent intent)
    {
        LogUtil.d(TAG, "ActivityResult : onResolvePreAuth", new Object[0]);
        mLoadingWallet = false;
        switch (i)
        {
        default:
            return;

        case -1: 
            isGoogleWalletPreAuthed = intent.getBooleanExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", false);
            break;
        }
        Object obj = TAG;
        if (isGoogleWalletPreAuthed)
        {
            intent = "";
        } else
        {
            intent = "not ";
        }
        LogUtil.d(((String) (obj)), String.format("GW: User is %spreauthed.", new Object[] {
            intent
        }), new Object[0]);
        obj = mPrefs.googleWalletState();
        if (isGoogleWalletPreAuthed)
        {
            intent = "app_authorized";
        } else
        {
            intent = "not_authorized";
        }
        ((p) (obj)).b(intent);
    }

    public void onStart()
    {
        super.onStart();
        LogUtil.d(TAG, "Connecting to Google Play Services.", new Object[0]);
        mLoadingWallet = true;
        mGoogleApiClient.c();
    }

    public void onStop()
    {
        super.onStop();
        LogUtil.d(TAG, "Disconnecting from Google Play Services.", new Object[0]);
        mLoadingWallet = false;
        mGoogleApiClient.e();
        mRetryHandler.removeMessages(18);
    }

    protected void resolveUnsuccessfulConnectionResult()
    {
        if (!mConnectionResult.a()) goto _L2; else goto _L1
_L1:
        try
        {
            mConnectionResult.a(getActivity(), 19);
        }
        catch (android.content.IntentSender.SendIntentException sendintentexception)
        {
            reconnect();
        }
_L4:
        mConnectionResult = null;
        return;
_L2:
        int i;
        i = mConnectionResult.c();
        if (!mCanShowWalletErrorDialog || !com.google.android.gms.common.e.b(i))
        {
            break; /* Loop/switch isn't completed */
        }
        com.google.android.gms.common.e.a(i, getActivity(), 19, new _cls1()).show();
        if (true) goto _L4; else goto _L3
_L3:
        switch (i)
        {
        default:
            handleError(i);
            break;

        case 7: // '\007'
        case 8: // '\b'
            reconnect();
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void setOnMaskedWalletLoadedListener(OnMaskedWalletLoadedListener onmaskedwalletloadedlistener)
    {
        mMaskedWalletLoadedListener = onmaskedwalletloadedlistener;
    }

    public void setOnWalletConnectionListener(OnWalletConnectionListener onwalletconnectionlistener)
    {
        mOnWalletConnectionListener = onwalletconnectionlistener;
    }


    private class RetryHandler extends Handler
    {

        final GoogleWalletFragment this$0;

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 18 18: default 24
        //                       18 25;
               goto _L1 _L2
_L1:
            return;
_L2:
            if (mGoogleApiClient != null && !mGoogleApiClient.g())
            {
                mLoadingWallet = true;
                mGoogleApiClient.c();
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        private RetryHandler()
        {
            this$0 = GoogleWalletFragment.this;
            super();
        }

        RetryHandler(_cls1 _pcls1)
        {
            this();
        }
    }


    private class OnWalletConnectionListener
    {

        public abstract void onWalletConnected();

        public abstract void onWalletFailure();
    }


    private class OnMaskedWalletLoadedListener
    {

        public abstract void onMaskedWalletLoaded(int i);
    }


    private class _cls1
        implements android.content.DialogInterface.OnCancelListener
    {

        final GoogleWalletFragment this$0;

        public void onCancel(DialogInterface dialoginterface)
        {
            mGoogleApiClient.c();
        }

        _cls1()
        {
            this$0 = GoogleWalletFragment.this;
            super();
        }
    }

}
