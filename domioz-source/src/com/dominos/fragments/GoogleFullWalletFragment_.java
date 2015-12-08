// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import com.google.android.gms.wallet.MaskedWallet;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments:
//            GoogleFullWalletFragment, BaseFragment

public final class GoogleFullWalletFragment_ extends GoogleFullWalletFragment
    implements a
{

    public static final String M_CAN_SHOW_WALLET_ERROR_DIALOG_ARG = "ShowWalletError";
    public static final String M_MASKED_WALLET_ARG = "MaskedWallet";
    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public GoogleFullWalletFragment_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    public static FragmentBuilder_ builder()
    {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle)
    {
        mPrefs = new DominosPrefs_(getActivity());
        bundle = getActivity().getResources();
        spendingLimitExceededString = bundle.getString(0x7f08043e);
        googleWalletUnavailableString = bundle.getString(0x7f080389);
        injectFragmentArguments_();
        mActivityHelper = ActivityHelper_.getInstance_(getActivity());
        mMobileSession = MobileSession_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        onBaseAfterInject();
        onAfterInject();
    }

    private void injectFragmentArguments_()
    {
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            if (bundle.containsKey("ShowWalletError"))
            {
                mCanShowWalletErrorDialog = bundle.getBoolean("ShowWalletError");
            }
            if (bundle.containsKey("MaskedWallet"))
            {
                mMaskedWallet = (MaskedWallet)bundle.getParcelable("MaskedWallet");
            }
        }
    }

    public final View findViewById(int i)
    {
        if (contentView_ == null)
        {
            return null;
        } else
        {
            return contentView_.findViewById(i);
        }
    }

    public final void hideLoading()
    {
        handler_.post(new _cls1());
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        switch (i)
        {
        case 18: // '\022'
        default:
            return;

        case 17: // '\021'
            onLoadMaskedWallet(j, intent);
            return;

        case 16: // '\020'
            onResolvePreAuth(j, intent);
            return;

        case 19: // '\023'
            onResolveGoogleWalletError(j, intent);
            return;

        case 21: // '\025'
            onChangeMaskedWallet(j, intent);
            return;

        case 20: // '\024'
            onLoadFullWallet(j, intent);
            return;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        contentView_ = super.onCreateView(layoutinflater, viewgroup, bundle);
        return contentView_;
    }

    public final void onDestroyView()
    {
        contentView_ = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    public final void showLoading()
    {
        handler_.post(new _cls2());
    }



    private class FragmentBuilder_ extends d
    {

        public GoogleFullWalletFragment build()
        {
            GoogleFullWalletFragment_ googlefullwalletfragment_ = new GoogleFullWalletFragment_();
            googlefullwalletfragment_.setArguments(args);
            return googlefullwalletfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_ mCanShowWalletErrorDialog(boolean flag)
        {
            args.putBoolean("ShowWalletError", flag);
            return this;
        }

        public FragmentBuilder_ mMaskedWallet(MaskedWallet maskedwallet)
        {
            args.putParcelable("MaskedWallet", maskedwallet);
            return this;
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls1
        implements Runnable
    {

        final GoogleFullWalletFragment_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls1()
        {
            this$0 = GoogleFullWalletFragment_.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final GoogleFullWalletFragment_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls2()
        {
            this$0 = GoogleFullWalletFragment_.this;
            super();
        }
    }

}
