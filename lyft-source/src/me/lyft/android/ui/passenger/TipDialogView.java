// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.IUserSession;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.MoneyMapper;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.dialogs.DialogContainerView;

public class TipDialogView extends DialogContainerView
{

    private static final int MIN_TIP_AMOUNT = 0;
    private static final int TIP_INCREMENTATION_AMOUNT = 100;
    MessageBus bus;
    ICheckoutSession checkoutSession;
    Button decrementDonationButton;
    DialogFlow dialogFlow;
    Button incrementDonationButton;
    private int maxTipAmount;
    private final int rideTotal;
    private int tip;
    TextView tipAmountTextView;
    TextView totalText;
    IUserSession userSession;

    public TipDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        maxTipAmount = 0;
        Scoop.a(this).b(this);
        context = userSession.getRide();
        if (context != null)
        {
            context = context.getTotalMoney();
        } else
        {
            context = null;
        }
        rideTotal = MoneyMapper.fromMoneyDTO(context).getAmount().intValue();
        maxTipAmount = getMaxTotalAmount() - rideTotal;
        setTip(checkoutSession.getSelectedTipAmount());
    }

    private int getMaxTotalAmount()
    {
        Object obj = userSession.getRide();
        if (obj != null)
        {
            obj = ((RideDTO) (obj)).getMaximumTotalMoney();
        } else
        {
            obj = null;
        }
        obj = MoneyMapper.fromMoneyDTO(((me.lyft.android.infrastructure.lyft.payment.MoneyDTO) (obj)));
        if (((Money) (obj)).isNull())
        {
            return 0x7fffffff;
        } else
        {
            return ((Money) (obj)).getAmount().intValue();
        }
    }

    private void setTip(int i)
    {
        tip = i;
        if (tip < 0)
        {
            tip = 0;
        } else
        if (tip > maxTipAmount)
        {
            tip = maxTipAmount;
            return;
        }
    }

    void applyCustomTip()
    {
        checkoutSession.selectTip(tip);
        dialogFlow.dismiss();
    }

    void decrementDonation()
    {
        setTip(tip - 100);
        updateTipAndTotalText();
    }

    void incrementDonation()
    {
        setTip(tip + 100);
        updateTipAndTotalText();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        updateTipAndTotalText();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    void updateTipAndTotalText()
    {
        float f1 = 1.0F;
        boolean flag1 = true;
        tipAmountTextView.setText(Money.format(tip));
        totalText.setText(getResources().getString(0x7f07036c, new Object[] {
            Money.format(tip + rideTotal)
        }));
        float f;
        Button button;
        boolean flag;
        if (tip > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        decrementDonationButton.setEnabled(flag);
        button = decrementDonationButton;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.5F;
        }
        button.setAlpha(f);
        if (tip < maxTipAmount)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        incrementDonationButton.setEnabled(flag);
        button = incrementDonationButton;
        if (flag)
        {
            f = f1;
        } else
        {
            f = 0.5F;
        }
        button.setAlpha(f);
    }
}
