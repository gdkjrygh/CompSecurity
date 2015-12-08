// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.u;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.fragments.ContractDialogFragment;
import com.dominos.model.StJudesAmount;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.ImageManagerCDN;
import com.nuance.b.e.c;

public class UpsellDialog extends ContractDialogFragment
{

    AnalyticsUtil mAnalyticsUtil;
    private CartManager mCartManager;
    RadioGroup mGroupRadioButton;
    private MenuManager mMenuManager;
    MobileSession mMobileSession;
    Button mOrderButton;
    private OrderManager mOrderManager;
    TextView mProductDescription;
    LinearLayout mProductDescriptionLayout;
    ImageView mProductImage;
    private boolean mReturnCart;
    SpeechManager mSpeechManager;
    TextView mStjudeSavings;
    LinearLayout mStjudesLayout;
    TextView mTitleText;
    String mUpsellCode;
    private LabsProductLine mUpsellProductLine;

    public UpsellDialog()
    {
        mReturnCart = true;
    }

    private void buildStJudeUpsell()
    {
        boolean flag;
        flag = true;
        mProductDescriptionLayout.setVisibility(8);
        mStjudesLayout.setVisibility(0);
        mTitleText.setVisibility(4);
        double d;
        NumberUtil numberutil = new NumberUtil();
        String s = mOrderManager.getOrder().getSavings();
        if (!StringHelper.isNotEmpty(s))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        d = numberutil.doubleToFormattedDouble(Double.valueOf(Double.parseDouble(s)));
        if (Double.compare(d, 0.0D) <= 0)
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        mStjudeSavings.setText(getString(0x7f0802c1, new Object[] {
            NumberUtil.formatPrice(Double.valueOf(d))
        }));
        mStjudeSavings.setVisibility(0);
        return;
        NumberFormatException numberformatexception;
        numberformatexception;
    }

    private void getStJudeDonationAmount()
    {
        switch (mGroupRadioButton.getCheckedRadioButtonId())
        {
        default:
            return;

        case 2131690127: 
            mUpsellCode = StJudesAmount.ONE.toString();
            return;

        case 2131690128: 
            mUpsellCode = StJudesAmount.TWO.toString();
            return;

        case 2131690129: 
            mUpsellCode = StJudesAmount.FIVE.toString();
            return;

        case 2131690130: 
            mUpsellCode = StJudesAmount.TEN.toString();
            break;
        }
    }

    private boolean isStJudeUpsell()
    {
        return StringHelper.equals(mUpsellCode, StJudesAmount.ONE.toString());
    }

    private void onUpsellNoThanksContinueToCheckout()
    {
        mReturnCart = false;
        mAnalyticsUtil.postUpsellClickNo(mUpsellProductLine.getCode(), mUpsellProductLine.getProduct().getName());
        ((UpsellDialogListener)getContract()).onUpsellGoToCheckoutClicked(this);
    }

    private void onUpsellYesAddToCart(boolean flag)
    {
        mReturnCart = false;
        mAnalyticsUtil.postUpsellClickYes(mUpsellProductLine.getCode(), mUpsellProductLine.getProduct().getName());
        if (isStJudeUpsell())
        {
            getStJudeDonationAmount();
            prepareUpsellProductLine();
        }
        ((UpsellDialogListener)getContract()).onUpsellAddToOrderClicked(this, flag);
    }

    private void prepareUpsellProductLine()
    {
        mUpsellProductLine = new LabsProductLine(mMenuManager.getVariant(mUpsellCode));
        mMenuManager.loadOptionsFromMenu(mUpsellProductLine);
        mUpsellProductLine.setQuantity(1);
    }

    private void setDialogFeatures()
    {
        getDialog().getWindow().setBackgroundDrawableResource(0x7f0e009e);
        getDialog().getWindow().setFeatureInt(7, 0x7f0300b9);
        setCancelable(true);
    }

    private void setProductDescriptionText()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("\n").append(mUpsellProductLine.getProduct().getName()).append(" ").append(getString(0x7f080044)).append(" ").append(NumberUtil.formatPrice(Double.valueOf(mUpsellProductLine.getPrice()))).append("?");
        mProductDescription.setText(stringbuilder.toString());
    }

    public void afterViews()
    {
        setDialogFeatures();
        if (!isStJudeUpsell())
        {
            prepareUpsellProductLine();
            setProductDescriptionText();
            ImageManagerCDN.INSTANCE.addUpsellImage(mProductImage, mUpsellProductLine.getCode());
            mAnalyticsUtil.postUpsellDisplayed(mUpsellProductLine.getCode(), mUpsellProductLine.getProduct().getName());
            return;
        } else
        {
            buildStJudeUpsell();
            ImageManagerCDN.INSTANCE.addUpsellImage(mProductImage, mUpsellCode);
            return;
        }
    }

    public void answerUpsell(com.dominos.bus.events.OriginatedFromSpeech.UpsellAnswered upsellanswered)
    {
        final boolean answer = upsellanswered.getAnswer();
        mReturnCart = false;
        mSpeechManager.getCurrentNinaActivity().runOnUiThread(new _cls1());
    }

    public void dismiss()
    {
        mCartManager.setUpsellAnswered(true);
        if (mReturnCart)
        {
            mCartManager.setUpsellDismissed(true);
        }
        App.getInstance().bus.unregister(this);
        if (c.i() && mReturnCart)
        {
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.UpsellCanceled());
        }
        super.dismiss();
    }

    public LabsProductLine getUpsellProductLine()
    {
        return mUpsellProductLine;
    }

    public void onAfterInject()
    {
        mMenuManager = (MenuManager)mMobileSession.getManager("menu_manager");
        mOrderManager = (OrderManager)mMobileSession.getManager("order_manager");
        mCartManager = (CartManager)mMobileSession.getManager("cart_manager");
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        mCartManager.setUpsellAnswered(true);
        mCartManager.setUpsellDismissed(true);
        ((UpsellDialogListener)getContract()).onUpsellCanceled(this);
        super.onCancel(dialoginterface);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0);
    }

    public void show(u u, String s)
    {
        super.show(u, s);
        App.getInstance().bus.register(this);
    }

    public void upsellAddToOrderClick()
    {
        onUpsellYesAddToCart(c.i());
        if (c.i())
        {
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.UpsellAccepted());
        }
    }

    public void upsellGoToCheckoutClick()
    {
        onUpsellNoThanksContinueToCheckout();
        if (c.i())
        {
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.UpsellRejected());
        }
    }



    private class UpsellDialogListener
    {

        public abstract void onUpsellAddToOrderClicked(UpsellDialog upselldialog, boolean flag);

        public abstract void onUpsellCanceled(UpsellDialog upselldialog);

        public abstract void onUpsellGoToCheckoutClicked(UpsellDialog upselldialog);
    }


    private class _cls1
        implements Runnable
    {

        final UpsellDialog this$0;
        final boolean val$answer;

        public void run()
        {
            if (answer)
            {
                onUpsellYesAddToCart(true);
                return;
            } else
            {
                App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.UpsellProceededCheckout());
                onUpsellNoThanksContinueToCheckout();
                return;
            }
        }

        _cls1()
        {
            this$0 = UpsellDialog.this;
            answer = flag;
            super();
        }
    }

}
