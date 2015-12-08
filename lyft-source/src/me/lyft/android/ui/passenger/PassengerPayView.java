// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import java.util.Collections;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IExpenseNoteSession;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.BalloonView;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.TipOption;
import me.lyft.android.domain.ride.TipOptionMapper;
import me.lyft.android.infrastructure.lyft.payment.TipOptionDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.logging.L;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.SlideMenuController;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerPayPresenter, TipSelectorWidget

public class PassengerPayView extends LinearLayout
{

    AppFlow appFlow;
    BalloonView balloonView;
    MessageBus bus;
    ICheckoutSession checkoutSession;
    ImageView concurImage;
    DialogFlow dialogFlow;
    ImageView driverPhotoImageView;
    IExpenseNoteSession expenseNoteSession;
    ImageLoader imageLoader;
    TextView lyftCreditAppliedTextView;
    Button nextButton;
    IPassengerRideProvider passengerRideProvider;
    LinearLayout paymentMethodSelectionView;
    private final PassengerPayPresenter presenter;
    TextView selectedPaymentMethodLabelTextView;
    SlideMenuController slideMenuController;
    ISplitFareStateRepository splitFareStateRepository;
    TextView splitInfo;
    TipSelectorWidget tipSelectorWidget;
    Toolbar toolbar;
    TextView totalAmountChargedTextView;
    IUserProvider userProvider;
    IUserSession userSession;

    public PassengerPayView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
        presenter = new PassengerPayPresenter(checkoutSession, splitFareStateRepository, getResources());
    }

    private void showBalloons(int i)
    {
        if (i > 0)
        {
            balloonView.startBalloonAnimation();
            return;
        } else
        {
            balloonView.finishBalloonAnimation();
            return;
        }
    }

    private void updatePriceAndPaymentMethod()
    {
        selectedPaymentMethodLabelTextView.setText(presenter.getPaymentMethodLabel());
        lyftCreditAppliedTextView.setText(presenter.getAppliedCreditsTitle());
        totalAmountChargedTextView.setText(presenter.getFormattedTotalAmount());
        splitInfo.setText(presenter.getSplitPaymentTitle());
        ImageView imageview = concurImage;
        int i;
        if (expenseNoteSession.isConcurEnabled())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
    }

    private void updateViewWithTip()
    {
        int i = checkoutSession.getSelectedTipAmount();
        tipSelectorWidget.select(i);
        showBalloons(i);
        updatePriceAndPaymentMethod();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        ScreenAnalytics.trackScreenView("passenger_ride_payment");
        toolbar.setTitle(getResources().getString(0x7f0702db));
        slideMenuController.enableMenu();
        paymentMethodSelectionView.setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerPayView this$0;

            public void onClick(View view)
            {
                PaymentAnalytics.trackPaymentSelectTap();
                appFlow.goTo(new me.lyft.android.ui.payment.PaymentScreens.PaymentSelectScreen());
            }

            
            {
                this$0 = PassengerPayView.this;
                super();
            }
        });
        nextButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerPayView this$0;

            public void onClick(View view)
            {
                if (Strings.isNullOrEmpty(checkoutSession.getSelectedPaymentMethodId()))
                {
                    L.e(new IllegalStateException("No payment id found in checkout session."), "selectedPaymentMethodId is empty.", new Object[0]);
                    appFlow.goTo(new me.lyft.android.ui.payment.PaymentScreens.PaymentSelectScreen());
                    return;
                } else
                {
                    appFlow.goTo(new PassengerScreens.PassengerRateRideScreen());
                    return;
                }
            }

            
            {
                this$0 = PassengerPayView.this;
                super();
            }
        });
        totalAmountChargedTextView.setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerPayView this$0;

            public void onClick(View view)
            {
                dialogFlow.show(new PassengerDialogs.PriceBreakdownDialog());
            }

            
            {
                this$0 = PassengerPayView.this;
                super();
            }
        });
        imageLoader.load(passengerRideProvider.getPassengerRide().getDriver().getPhoto()).placeholder(0x7f0201fc).fit().centerCrop().into(driverPhotoImageView);
        Object obj = userSession.getRide();
        TipSelectorWidget tipselectorwidget = tipSelectorWidget;
        if (obj != null)
        {
            obj = ((RideDTO) (obj)).getTipOptions();
        } else
        {
            obj = null;
        }
        tipselectorwidget.createOptions(Iterables.select((Iterable)Objects.firstNonNull(obj, Collections.emptyList()), new Func1() {

            final PassengerPayView this$0;

            public volatile Object call(Object obj1)
            {
                return call((TipOptionDTO)obj1);
            }

            public TipOption call(TipOptionDTO tipoptiondto)
            {
                return TipOptionMapper.fromTipOptionDTO(tipoptiondto);
            }

            
            {
                this$0 = PassengerPayView.this;
                super();
            }
        }));
        obj = Binder.attach(this);
        ((Binder) (obj)).bind(tipSelectorWidget.observeSelectionChange(), new Action1() {

            final PassengerPayView this$0;

            public void call(Integer integer)
            {
                checkoutSession.selectTip(integer.intValue());
            }

            public volatile void call(Object obj1)
            {
                call((Integer)obj1);
            }

            
            {
                this$0 = PassengerPayView.this;
                super();
            }
        });
        ((Binder) (obj)).bind(checkoutSession.observeTipChange(), new Action1() {

            final PassengerPayView this$0;

            public volatile void call(Object obj1)
            {
                call((Unit)obj1);
            }

            public void call(Unit unit)
            {
                updateViewWithTip();
            }

            
            {
                this$0 = PassengerPayView.this;
                super();
            }
        });
        ((Binder) (obj)).bind(tipSelectorWidget.observeCustomTipClick(), new Action1() {

            final PassengerPayView this$0;

            public volatile void call(Object obj1)
            {
                call((Unit)obj1);
            }

            public void call(Unit unit)
            {
                dialogFlow.show(new PassengerDialogs.TipDialog());
            }

            
            {
                this$0 = PassengerPayView.this;
                super();
            }
        });
        updateViewWithTip();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        balloonView.stopBalloonAnimation();
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
