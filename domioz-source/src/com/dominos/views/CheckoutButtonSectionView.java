// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.extension.google.wallet.GoogleWalletManager;

public class CheckoutButtonSectionView extends RelativeLayout
{

    public static final int BUTTON_CLICK_DE_BOUNCE_TIME = 1000;
    ImageButton checkoutButton;
    private OnButtonClickListener clickListener;
    ImageButton googleWalletButton;
    private long mCheckoutButtonClickTime;
    private long mGWButtonClickTime;
    MobileSession mMobileSession;
    private StoreManager mStoreManager;
    private GoogleWalletManager mWalletManager;
    TextView or;
    LinearLayout orDivider;

    public CheckoutButtonSectionView(Context context)
    {
        super(context);
    }

    void afterViews()
    {
        boolean flag = false;
        FontManager.applyDominosFont(or);
        ConfigurationManager configurationmanager = (ConfigurationManager)mMobileSession.getManager("configuration_manager");
        Object obj = orDivider;
        int i;
        if (configurationmanager.getApplicationConfiguration().isGoogleWalletEnabled())
        {
            i = 0;
        } else
        {
            i = 4;
        }
        ((LinearLayout) (obj)).setVisibility(i);
        obj = googleWalletButton;
        if (configurationmanager.getApplicationConfiguration().isGoogleWalletEnabled())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 4;
        }
        ((ImageButton) (obj)).setVisibility(i);
        mWalletManager = (GoogleWalletManager)mMobileSession.getManager("google_wallet_manager");
        mStoreManager = (StoreManager)mMobileSession.getManager("store_manager");
    }

    void checkoutClick()
    {
        if (System.currentTimeMillis() - mCheckoutButtonClickTime < 1000L)
        {
            mCheckoutButtonClickTime = System.currentTimeMillis();
        } else
        {
            mCheckoutButtonClickTime = System.currentTimeMillis();
            if (clickListener != null)
            {
                clickListener.onCheckoutClick();
                return;
            }
        }
    }

    public void setButtonsEnabled(boolean flag, boolean flag1)
    {
        ImageButton imagebutton = googleWalletButton;
        if (flag && flag1 && mWalletManager.isGoogleWalletAvailable(mStoreManager.getStoreProfile()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        imagebutton.setEnabled(flag1);
        checkoutButton.setEnabled(flag);
    }

    public void setClickListener(OnButtonClickListener onbuttonclicklistener)
    {
        clickListener = onbuttonclicklistener;
    }

    public void setGoogleWalletButtonEnabled(boolean flag, boolean flag1)
    {
        ImageButton imagebutton = googleWalletButton;
        if (flag && flag1 && mWalletManager.isGoogleWalletAvailable(mStoreManager.getStoreProfile()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
    }

    void walletClick()
    {
        if (System.currentTimeMillis() - mGWButtonClickTime < 1000L)
        {
            mGWButtonClickTime = System.currentTimeMillis();
        } else
        {
            mGWButtonClickTime = System.currentTimeMillis();
            if (clickListener != null)
            {
                clickListener.onGoogleWalletClick();
                return;
            }
        }
    }

    private class OnButtonClickListener
    {

        public abstract void onCheckoutClick();

        public abstract void onGoogleWalletClick();
    }

}
