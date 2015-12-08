// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.IUserSession;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.payment.Coupon;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.MoneyMapper;
import me.lyft.android.domain.ride.RideFare;
import me.lyft.android.domain.splitfare.SplitFareState;
import me.lyft.android.infrastructure.lyft.payment.LineItemDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.ui.dialogs.DialogContainerView;

public class PriceBreakdownDialogView extends DialogContainerView
{

    AppFlow appFlow;
    View chargedLabel;
    ICheckoutSession checkoutSession;
    LinearLayout container;
    int contributorCount;
    DialogFlow dialogFlow;
    IRideFareRepository fareRepository;
    LayoutInflater inflater;
    private Coupon selectedCoupon;
    ISplitFareStateRepository splitFareStateRepository;
    private int tip;
    TextView totalAmount;
    IUserSession userSession;

    public PriceBreakdownDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
        tip = checkoutSession.getSelectedTipAmount();
        selectedCoupon = checkoutSession.getSelectedOrFirstEligibleCoupon();
    }

    void addPriceBreakdownItem(String s, String s1)
    {
        ViewGroup viewgroup = (ViewGroup)inflater.inflate(0x7f0300fc, container, false);
        ((TextView)viewgroup.getChildAt(0)).setText(s);
        ((TextView)viewgroup.getChildAt(1)).setText(s1);
        container.addView(viewgroup);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        RideFare ridefare = fareRepository.getFare();
        contributorCount = splitFareStateRepository.getSplitFareState().getTotalContributorsCount();
        Object obj = userSession.getRide();
        int i;
        if (obj != null)
        {
            obj = ((RideDTO) (obj)).getLineItems();
        } else
        {
            obj = null;
        }
        obj = ((List)Objects.firstNonNull(obj, Collections.EMPTY_LIST)).iterator();
        int k;
        for (i = 0; ((Iterator) (obj)).hasNext(); i += k)
        {
            LineItemDTO lineitemdto = (LineItemDTO)((Iterator) (obj)).next();
            k = (int)Math.ceil((double)MoneyMapper.fromMoneyDTO(lineitemdto.getMoney()).getAmount().intValue() / (double)contributorCount);
            addPriceBreakdownItem((String)Objects.firstNonNull(lineitemdto.getTitle(), ""), Money.format(k));
        }

        int l = i;
        if (selectedCoupon != null)
        {
            Money money = selectedCoupon.getMoney();
            l = i;
            if (money.getAmount().intValue() > 0)
            {
                l = Math.min((int)Math.ceil((double)ridefare.getTotalMoney().getAmount().intValue() / (double)contributorCount), money.getAmount().intValue());
                addPriceBreakdownItem(selectedCoupon.getLineItemTitle(), Money.format(-l));
                l = i - l;
            }
        }
        if (tip != 0)
        {
            int j = (int)Math.ceil((double)tip / (double)contributorCount);
            chargedLabel.setVisibility(0);
            addPriceBreakdownItem(getContext().getString(0x7f0702dc), Money.format(j));
            l += j;
        } else
        {
            chargedLabel.setVisibility(8);
        }
        totalAmount.setText(Money.format(l));
    }

    void onCancelClicked()
    {
        dialogFlow.dismiss();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        inflater = LayoutInflater.from(getContext());
    }

    void onPricingInfoClicked()
    {
        dialogFlow.dismiss();
        appFlow.goTo(new PassengerScreens.PaymentHelpScreen());
    }
}
