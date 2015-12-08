// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.User;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.CreditCardChargeAccount;
import me.lyft.android.utils.CardExtensions;

public class SelectPaymentWidgetView extends LinearLayout
    implements PaymentWidgetContainerView.MapWidget
{

    AppFlow appFlow;
    ImageView concurImage;
    ImageView creditCardImage;
    TextView creditCardLabel;
    boolean isShowing;
    IUserProvider userProvider;

    public SelectPaymentWidgetView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        isShowing = false;
    }

    private void show(boolean flag)
    {
        trackShownIfNeeded(flag);
        isShowing = flag;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setVisibility(i);
    }

    private void trackShownIfNeeded(boolean flag)
    {
        if (!isShowing && flag)
        {
            RideAnalytics.trackPaymentWidgetShown();
        }
    }

    private void updateViewState(int i, String s)
    {
        creditCardImage.setImageResource(i);
        if (Strings.isNullOrBlank(s))
        {
            creditCardLabel.setVisibility(8);
            return;
        } else
        {
            creditCardLabel.setText(s);
            creditCardLabel.setVisibility(0);
            return;
        }
    }

    public void animateButtonVisibility(boolean flag)
    {
        show(flag);
    }

    public boolean isShowing()
    {
        return isShowing;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        Scoop.a(this).b(this);
        ButterKnife.a(this);
    }

    public boolean performClick()
    {
        RideAnalytics.trackPaymentWidgetTap();
        appFlow.goTo(new me.lyft.android.ui.payment.PaymentScreens.PaymentScreenWithBackButton());
        return super.performClick();
    }

    public void setButtonVisibility(boolean flag)
    {
        show(flag);
    }

    public void setChargeAccount(ChargeAccount chargeaccount)
    {
        Object obj = null;
        int i;
        if (chargeaccount.isWallet())
        {
            i = 0x7f020070;
            chargeaccount = obj;
        } else
        if (chargeaccount.isPayPal())
        {
            i = 0x7f020079;
            chargeaccount = obj;
        } else
        if (chargeaccount.isFacebook())
        {
            i = 0x7f020078;
            chargeaccount = obj;
        } else
        if (chargeaccount.isCreditLine())
        {
            i = 0x7f02007d;
            chargeaccount = chargeaccount.getLabel();
        } else
        if (chargeaccount.isCreditCard())
        {
            i = CardExtensions.getCardTypeImageResource(((CreditCardChargeAccount)chargeaccount).getType());
            chargeaccount = chargeaccount.getLabel();
        } else
        {
            i = 0x7f020069;
            chargeaccount = obj;
        }
        updateViewState(i, chargeaccount);
        chargeaccount = concurImage;
        if (userProvider.getUser().sendConcurRideReceipts())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        chargeaccount.setVisibility(i);
    }
}
