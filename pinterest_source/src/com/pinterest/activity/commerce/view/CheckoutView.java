// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import com.google.common.base.Strings;
import com.pinterest.activity.commerce.event.CheckoutClickEvent;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.commerce.viewmodel.CheckoutViewModel;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.FontUtils;
import com.pinterest.ui.scrollview.ObservableScrollView;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            TwoColumnTextView

public class CheckoutView extends LinearLayout
{

    private static final StyleSpan BOLD_SPAN = new StyleSpan(1);
    private static final String DASH = "-";
    private static final String SPACE = " ";
    Button actionButton;
    TwoColumnTextView addressInput;
    TwoColumnTextView amountShippingTextView;
    TwoColumnTextView amountSubTotalTextView;
    TwoColumnTextView amountTaxTextView;
    TwoColumnTextView amountTotalTextView;
    ObservableScrollView detailContainer;
    PTextView merchantLearnMoreTextView;
    LinearLayout payContainer;
    TwoColumnTextView paymentInput;
    ProgressBar progressContainer;
    TwoColumnTextView quantityInput;
    TwoColumnTextView shipInput;

    public CheckoutView(Context context)
    {
        super(context);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f030040, this);
        setOrientation(1);
        ButterKnife.a(this);
        FontUtils.setFont(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD, actionButton);
        detailContainer.addListener(new _cls1());
        detailContainer.getViewTreeObserver().addOnGlobalLayoutListener(new _cls2());
    }

    private void updateAmountFieldsVisibility(int i)
    {
        amountSubTotalTextView.setVisibility(i);
        amountTaxTextView.setVisibility(i);
        amountShippingTextView.setVisibility(i);
    }

    public void handleAddressClicked()
    {
        Events.post(new CheckoutClickEvent(com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.Address));
    }

    public void handlePayButtonClicked()
    {
        Events.post(new CheckoutClickEvent(com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.PayCalculateButton));
    }

    public void handlePaymentClicked()
    {
        Events.post(new CheckoutClickEvent(com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.Payment));
    }

    public void handleQuantityClicked()
    {
        Events.post(new CheckoutClickEvent(com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.Quantity));
    }

    public void handleShipMethodClicked()
    {
        Events.post(new CheckoutClickEvent(com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.ShipMethod));
    }

    public void update(final CheckoutViewModel checkoutViewModel)
    {
        if (!checkoutViewModel.isInitialized())
        {
            detailContainer.setVisibility(8);
            payContainer.setVisibility(8);
            progressContainer.setVisibility(0);
            return;
        }
        detailContainer.setVisibility(0);
        quantityInput.setValue(String.valueOf(checkoutViewModel.getQuantity()));
        Object obj = checkoutViewModel.getShippingAddress();
        int i;
        if (obj != null)
        {
            addressInput.setValue(BuyableProductHelper.getFormattedAddress(((com.pinterest.model.commerce.DetailedShipping) (obj))));
        } else
        {
            addressInput.setValueAndColor(Resources.string(0x7f070106), Resources.color(0x7f0e0051));
        }
        obj = checkoutViewModel.getPaymentMethod();
        if (obj != null)
        {
            if (Strings.isNullOrEmpty(checkoutViewModel.getPaymentIncentiveExtra()))
            {
                paymentInput.setValue(BuyableProductHelper.getFormattedUserCard(((com.pinterest.model.commerce.UserCard) (obj))));
            } else
            {
                String s1 = BuyableProductHelper.getFormattedUserCard(((com.pinterest.model.commerce.UserCard) (obj)));
                obj = checkoutViewModel.getPaymentIncentiveExtra();
                s1 = (new StringBuilder()).append(s1).append("\n").append(((String) (obj))).toString();
                SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s1);
                spannablestringbuilder.setSpan(BOLD_SPAN, s1.indexOf(((String) (obj))), s1.length(), 33);
                paymentInput.setValue(spannablestringbuilder);
            }
        } else
        {
            paymentInput.setValueAndColor(Resources.string(0x7f070107), Resources.color(0x7f0e0051));
        }
        obj = checkoutViewModel.getShippingMethod();
        if (obj != null)
        {
            shipInput.setValue(BuyableProductHelper.getFormattedShippingMethod(((com.pinterest.model.commerce.ShippingRate) (obj))));
            shipInput.setVisibility(0);
        } else
        {
            shipInput.setVisibility(8);
        }
        if (checkoutViewModel.isInProgress())
        {
            updateAmountFieldsVisibility(8);
        } else
        {
            amountSubTotalTextView.setValue(checkoutViewModel.getCostSubtotal());
            if (checkoutViewModel.getShippingAddress() != null)
            {
                amountTaxTextView.setValue(checkoutViewModel.getCostEstimatedTax());
            } else
            {
                amountTaxTextView.setValue("-");
            }
            if (checkoutViewModel.getShippingMethod() != null)
            {
                amountShippingTextView.setValue(checkoutViewModel.getCostShipping());
            } else
            {
                amountShippingTextView.setValue("-");
            }
            updateAmountFieldsVisibility(0);
        }
        if (checkoutViewModel.getShippingAddress() != null && !checkoutViewModel.isInProgress())
        {
            obj = actionButton;
            String s;
            Object obj1;
            if (checkoutViewModel.hasError())
            {
                i = 0x7f070115;
            } else
            {
                i = 0x7f070112;
            }
            ((Button) (obj)).setText(i);
            amountTotalTextView.setValue(checkoutViewModel.getCostTotal());
            obj1 = new StringBuilder();
            obj = Resources.string(0x7f070110);
            ((StringBuilder) (obj1)).append(Resources.string(0x7f07010f, new Object[] {
                checkoutViewModel.getMerchantName()
            })).append(" ").append(((String) (obj)));
            s = ((StringBuilder) (obj1)).toString();
            obj1 = new SpannableStringBuilder(((StringBuilder) (obj1)).toString());
            i = s.indexOf(((String) (obj)));
            ((SpannableStringBuilder) (obj1)).setSpan(new _cls3(), i, ((String) (obj)).length() + i, 33);
            merchantLearnMoreTextView.setText(((CharSequence) (obj1)));
            merchantLearnMoreTextView.setMovementMethod(LinkMovementMethod.getInstance());
            payContainer.setVisibility(0);
        } else
        {
            payContainer.setVisibility(8);
        }
        obj = progressContainer;
        if (checkoutViewModel.isInProgress())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ProgressBar) (obj)).setVisibility(i);
    }


    private class _cls1 extends com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener
    {

        final CheckoutView this$0;

        public void onScroll(View view, int i, int j, int k, int l)
        {
            if (EducationHelper.m())
            {
                Events.post(new com.pinterest.activity.task.education.view.EducationContainerView.PositionPulsarEvent());
            }
        }

        _cls1()
        {
            this$0 = CheckoutView.this;
            super();
        }
    }


    private class _cls2
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final CheckoutView this$0;

        public void onGlobalLayout()
        {
            if (EducationHelper.m())
            {
                Events.post(new com.pinterest.activity.task.education.view.EducationContainerView.PositionPulsarEvent());
            }
        }

        _cls2()
        {
            this$0 = CheckoutView.this;
            super();
        }
    }


    private class _cls3 extends ClickableSpan
    {

        final CheckoutView this$0;
        final CheckoutViewModel val$checkoutViewModel;

        public void onClick(View view)
        {
            Events.post(new Navigation(Location.BROWSER, checkoutViewModel.getPrivacyPolicyLink()));
        }

        public void updateDrawState(TextPaint textpaint)
        {
            textpaint.setColor(Resources.color(0x7f0e0051));
            textpaint.setFakeBoldText(true);
        }

        _cls3()
        {
            this$0 = CheckoutView.this;
            checkoutViewModel = checkoutviewmodel;
            super();
        }
    }

}
