// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.upsell.UpsellManager;
import java.util.List;

// Referenced classes of package com.dominos.views:
//            LabsSubtotalView_, LabsSubtotalView, CheckoutButtonSectionView_, CheckoutButtonSectionView, 
//            UpsellBarView_, UpsellBarView

public class CartFooterView extends LinearLayout
    implements CheckoutButtonSectionView.OnButtonClickListener, UpsellBarView.OnUpsellBarClickedListener
{

    private static final String TAG = com/dominos/views/CartFooterView.getSimpleName();
    private CheckoutButtonSectionView mCheckoutButtonSectionView;
    FrameLayout mCheckoutLayout;
    private final Context mContext;
    FrameLayout mDomLayout;
    private OnFooterViewsClickListener mFooterViewsClickListener;
    MobileSession mMobileSession;
    OrderUtil mOrderUtil;
    FrameLayout mSubTotalLayout;
    FrameLayout mUpSellBarLayout;
    private UpsellManager mUpsellManager;

    public CartFooterView(Context context)
    {
        super(context);
        mContext = context;
    }

    public void addDomView(View view)
    {
        mDomLayout.removeAllViews();
        mDomLayout.addView(view);
    }

    public void bind(LabsOrder labsorder)
    {
label0:
        {
            mSubTotalLayout.removeAllViews();
            mUpSellBarLayout.removeAllViews();
            mCheckoutLayout.removeAllViews();
            LabsSubtotalView labssubtotalview = LabsSubtotalView_.build(mContext);
            labssubtotalview.bind(labsorder);
            FontManager.applyDominosFont(labssubtotalview);
            mSubTotalLayout.addView(labssubtotalview);
            mCheckoutButtonSectionView = CheckoutButtonSectionView_.build(mContext);
            mCheckoutButtonSectionView.setClickListener(this);
            mCheckoutLayout.addView(mCheckoutButtonSectionView);
            if (!mOrderUtil.containsDrink(labsorder))
            {
                labsorder = mUpsellManager.getUpsellBarForCurrentStore();
                UpsellBarView upsellbarview = UpsellBarView_.build(mContext);
                if (labsorder == null || labsorder.isEmpty())
                {
                    break label0;
                }
                upsellbarview.bind(labsorder, this);
                mUpSellBarLayout.addView(upsellbarview);
            }
            return;
        }
        LogUtil.d(TAG, "No up-sell products to display!", new Object[0]);
    }

    protected void onAfterInject()
    {
        mUpsellManager = (UpsellManager)mMobileSession.getManager("upsell_manager");
    }

    public void onCheckoutClick()
    {
        mFooterViewsClickListener.onCheckoutClick();
    }

    public void onGoogleWalletClick()
    {
        mFooterViewsClickListener.onGoogleWalletClick();
    }

    public void onUpsellBarItemClicked(int i, List list)
    {
        mFooterViewsClickListener.onUpsellBarItemClicked(i, list);
    }

    public void setFooterViewsClickListener(OnFooterViewsClickListener onfooterviewsclicklistener)
    {
        mFooterViewsClickListener = onfooterviewsclicklistener;
    }

    public void updateCheckoutView(boolean flag, boolean flag1)
    {
        if (mCheckoutButtonSectionView != null)
        {
            mCheckoutButtonSectionView.setButtonsEnabled(flag, flag1);
        }
    }

    public void updateGoogleWalletView(boolean flag, boolean flag1)
    {
        if (mCheckoutButtonSectionView != null)
        {
            mCheckoutButtonSectionView.setGoogleWalletButtonEnabled(flag, flag1);
        }
    }


    private class OnFooterViewsClickListener
    {

        public abstract void onCheckoutClick();

        public abstract void onGoogleWalletClick();

        public abstract void onUpsellBarItemClicked(int i, List list);
    }

}
