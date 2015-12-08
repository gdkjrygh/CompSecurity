// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.Credit;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.SlideMenuController;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddCreditCardPaymentItemView, PaymentListItemView, AddWalletCardPaymentItemView, AddPayPalPaymentItemView, 
//            AddCouponView

public class PaymentView extends ScrollView
{

    public static final int PAYMENT_EDIT_MODE = 2;
    public static final int PAYMENT_SELECT_MODE = 1;
    public static final int PAYMENT_VIEW_MODE = 0;
    LinearLayout addCard;
    AddCouponView addCoupon;
    AppFlow appFlow;
    Binder binder;
    LinearLayout cardList;
    IChargeAccountsProvider chargeAccountsProvider;
    MessageBus messageBus;
    private Action1 onToolbarItemClicked;
    final PaymentScreens.PaymentBaseScreen params;
    private final Scoop scoop = Scoop.a(this);
    SlideMenuController slideMenuController;

    public PaymentView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onToolbarItemClicked = new Action1() {

            final PaymentView this$0;

            public void call(Integer integer)
            {
                switch (integer.intValue())
                {
                default:
                    return;

                case 2131558419: 
                    appFlow.goTo(new PaymentScreens.PaymentEditScreen());
                    return;

                case 2131558418: 
                    appFlow.goTo(new PaymentScreens.PaymentSelectScreen());
                    return;
                }
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = PaymentView.this;
                super();
            }
        };
        scoop.b(this);
        params = (PaymentScreens.PaymentBaseScreen)scoop.a();
    }

    private void addChargeAccountView()
    {
        if (!chargeAccountsProvider.hasMaximumCreditCardsAmount())
        {
            AddCreditCardPaymentItemView addcreditcardpaymentitemview = new AddCreditCardPaymentItemView(scoop.b(getContext()));
            addCard.addView(addcreditcardpaymentitemview);
        }
    }

    private void refreshCoupons()
    {
        Iterator iterator = chargeAccountsProvider.getCredits().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (Credit)iterator.next();
            obj = PaymentListItemView.createCreditListItem(scoop.b(getContext()), ((Credit) (obj)), params.getPaymentMode());
            if (obj != null)
            {
                cardList.addView(((android.view.View) (obj)));
            }
        } while (true);
    }

    private void refreshCreditCards()
    {
        Object obj = chargeAccountsProvider.getChargeAccounts();
        cardList.removeAllViews();
        if (!chargeAccountsProvider.hasWalletCard())
        {
            cardList.addView(new AddWalletCardPaymentItemView(getContext()));
        }
        if (!chargeAccountsProvider.hasPayPalChargeAccount())
        {
            cardList.addView(new AddPayPalPaymentItemView(getContext()));
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (ChargeAccount)((Iterator) (obj)).next();
            obj1 = PaymentListItemView.createChargeAccountListItem(scoop.b(getContext()), ((ChargeAccount) (obj1)), params.getPaymentMode());
            if (obj1 != null)
            {
                cardList.addView(((android.view.View) (obj1)));
            }
        } while (true);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isInEditMode())
        {
            slideMenuController.enableMenu();
            Toolbar toolbar = (Toolbar)((ViewGroup)getParent()).findViewById(0x7f0d002c);
            binder = Binder.attach(this);
            binder.bind(toolbar.observeItemClick(), onToolbarItemClicked);
            binder.bind(messageBus.observe(me/lyft/android/ui/payment/PaymentView$ReloadCardListEvent), new Action1() {

                final PaymentView this$0;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    refreshCreditCards();
                    refreshCoupons();
                }

            
            {
                this$0 = PaymentView.this;
                super();
            }
            });
            refreshCreditCards();
            refreshCoupons();
            addChargeAccountView();
            if (!Strings.isNullOrEmpty(params.getCoupon()))
            {
                addCoupon.setCoupon(params.getCoupon());
                params.resetCoupon();
                return;
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        slideMenuController.disableMenu();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }


}
