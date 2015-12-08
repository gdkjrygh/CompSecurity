// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.content.Intent;
import android.os.Bundle;
import com.dominos.android.sdk.common.GoogleWalletUtil;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.e;
import com.google.android.gms.wallet.f;

// Referenced classes of package com.dominos.fragments:
//            GoogleWalletFragment, GoogleFullWalletFragment_

public class GoogleFullWalletFragment extends GoogleWalletFragment
{

    private static final int GW_REQUEST_CODE_LOAD_FULL_WALLET_PLS = 20;
    private static final int GW_REQUEST_CODE_RESOLVE_CHANGE_MASKED_WALLET = 21;
    private static final String TAG = com/dominos/fragments/GoogleWalletFragment.getSimpleName();
    OnChangedWalletListener mChangedWalletListener;
    private FullWallet mFullWallet;
    OnFullWalletLoadedListener mFullWalletLoadedListener;

    public GoogleFullWalletFragment()
    {
    }

    public static GoogleFullWalletFragment newInstance(MaskedWallet maskedwallet, boolean flag)
    {
        GoogleFullWalletFragment_ googlefullwalletfragment_ = new GoogleFullWalletFragment_();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MaskedWallet", maskedwallet);
        bundle.putBoolean("ShowWalletError", flag);
        googlefullwalletfragment_.setArguments(bundle);
        return googlefullwalletfragment_;
    }

    public void changeMaskedWallet()
    {
        LogUtil.d(TAG, "Change the masked wallet", new Object[0]);
        if (mMaskedWallet == null)
        {
            LogUtil.d(TAG, "Masked wallet is not valid to make change wallet request", new Object[0]);
            handleError(413);
            return;
        }
        mLoadingWallet = true;
        if (mConnectionResult != null)
        {
            LogUtil.d(TAG, "Unable to change masked wallet.Trying to resolve the connection.", new Object[0]);
            resolveUnsuccessfulConnectionResult();
            return;
        } else
        {
            LogUtil.d(TAG, "Changing Masked Wallet..", new Object[0]);
            f.b.a(mGoogleApiClient, mMaskedWallet.b(), mMaskedWallet.c());
            return;
        }
    }

    public FullWallet getFullWallet()
    {
        return mFullWallet;
    }

    public void loadFullWallet(LabsOrder labsorder)
    {
        LogUtil.d(TAG, "Load the Full wallet", new Object[0]);
        if (mMaskedWallet == null)
        {
            LogUtil.d(TAG, "Masked wallet is not valid to make full wallet request", new Object[0]);
            handleError(413);
            return;
        } else
        {
            mLoadingWallet = true;
            labsorder = (new GoogleWalletUtil()).createFullWalletRequest(labsorder, mMaskedWallet.b());
            LogUtil.d(TAG, "Loading Full Wallet..", new Object[0]);
            f.b.a(mGoogleApiClient, labsorder);
            return;
        }
    }

    public void onChangeMaskedWallet(int i, Intent intent)
    {
        LogUtil.d(TAG, "ActivityResult : onChangeMaskedWallet", new Object[0]);
        mLoadingWallet = false;
        i;
        JVM INSTR tableswitch -1 0: default 40
    //                   -1 97
    //                   0 113;
           goto _L1 _L2 _L3
_L1:
        int j = intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", -1);
        LogUtil.d(TAG, String.format("GW: Error code %d when changing masked wallet.", new Object[] {
            Integer.valueOf(j)
        }), new Object[0]);
        handleError(j);
_L5:
        if (mChangedWalletListener != null)
        {
            mChangedWalletListener.onChangedWalletLoaded(i);
        }
        return;
_L2:
        mMaskedWallet = (MaskedWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
        continue; /* Loop/switch isn't completed */
_L3:
        LogUtil.d(TAG, "GW: Change wallet load cancelled.", new Object[0]);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onLoadFullWallet(int i, Intent intent)
    {
        LogUtil.d(TAG, "ActivityResult : onLoadFullWallet", new Object[0]);
        mLoadingWallet = false;
        i;
        JVM INSTR tableswitch -1 0: default 40
    //                   -1 81
    //                   0 162;
           goto _L1 _L2 _L3
_L1:
        LogUtil.d(TAG, "GW: Error loading full wallet.", new Object[0]);
        handleError(intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", -1));
_L5:
        if (mFullWalletLoadedListener != null)
        {
            mFullWalletLoadedListener.onFullWalletLoaded(i);
        }
        return;
_L2:
        if (intent.hasExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET"))
        {
            mFullWallet = (FullWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET");
            LogUtil.d(TAG, String.format("GW: Full wallet call succeeded.", new Object[0]), new Object[0]);
            f.b.a(mGoogleApiClient);
        } else
        if (intent.hasExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET"))
        {
            mMaskedWallet = (MaskedWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
        }
        continue; /* Loop/switch isn't completed */
_L3:
        LogUtil.d(TAG, "GW: Full wallet load cancelled.", new Object[0]);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void setOnChangedWalletListener(OnChangedWalletListener onchangedwalletlistener)
    {
        mChangedWalletListener = onchangedwalletlistener;
    }

    public void setOnFullWalletLoadedListener(OnFullWalletLoadedListener onfullwalletloadedlistener)
    {
        mFullWalletLoadedListener = onfullwalletloadedlistener;
    }


    private class OnChangedWalletListener
    {

        public abstract void onChangedWalletLoaded(int i);
    }


    private class OnFullWalletLoadedListener
    {

        public abstract void onFullWalletLoaded(int i);
    }

}
