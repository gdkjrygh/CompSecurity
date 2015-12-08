// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.domain.ride.PreRideInfo;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.events.AppStateUpdatedEvent;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.location.NullLocationDTO;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func3;

// Referenced classes of package me.lyft.android.ui.passenger:
//            FarePriceWidgetView, SelectPaymentWidgetView

public class PaymentWidgetContainerView extends LinearLayout
{

    private static final int ANIM_TIME = 500;
    private static final int WIDGET_PAYMENT_PARTY_SIZE = 1;
    private final Action1 appStateChange = new Action1() {

        final PaymentWidgetContainerView this$0;

        public volatile void call(Object obj)
        {
            call((AppStateDTO)obj);
        }

        public void call(AppStateDTO appstatedto)
        {
            updateProperties();
            updatePaymentWidget();
            updatePaymentWidgetVisibility();
            updateFarePriceWidget();
            updateFarePriceWidgetVisibility();
        }

            
            {
                this$0 = PaymentWidgetContainerView.this;
                super();
            }
    };
    MessageBus bus;
    final ReactiveProperty chargeAccount = ReactiveProperty.create();
    private final Action1 chargeAccountChange = new Action1() {

        final PaymentWidgetContainerView this$0;

        public volatile void call(Object obj)
        {
            call((ChargeAccount)obj);
        }

        public void call(ChargeAccount chargeaccount)
        {
            updatePaymentWidget();
            updatePaymentWidgetVisibility();
        }

            
            {
                this$0 = PaymentWidgetContainerView.this;
                super();
            }
    };
    IChargeAccountsProvider chargeAccountsProvider;
    IConstantsProvider constantsProvider;
    final Observable courierFaresObservable;
    final ReactiveProperty courierFaresSubject = ReactiveProperty.create();
    FarePriceWidgetView farePriceWidgetView;
    final ReactiveProperty mapDragging = ReactiveProperty.create(Boolean.valueOf(false));
    private final Action1 onCourierFareChange = new Action1() {

        final PaymentWidgetContainerView this$0;

        public volatile void call(Object obj)
        {
            call((List)obj);
        }

        public void call(List list)
        {
            list = FixedFare.findFareByPartySize(list, 1);
            rideFare.onNext(list);
        }

            
            {
                this$0 = PaymentWidgetContainerView.this;
                super();
            }
    };
    IPreRideInfoRepository preRideInfoRepository;
    final ReactiveProperty rideFare = ReactiveProperty.create(FixedFare.empty());
    IRideRequestSession rideRequestSession;
    private final Action1 rideTypeChange = new Action1() {

        final PaymentWidgetContainerView this$0;

        public volatile void call(Object obj)
        {
            call((RequestRideType)obj);
        }

        public void call(RequestRideType requestridetype)
        {
            updatePaymentWidgetVisibility();
            updateFarePriceWidgetVisibility();
        }

            
            {
                this$0 = PaymentWidgetContainerView.this;
                super();
            }
    };
    SelectPaymentWidgetView selectPaymentWidgetView;
    private final Action1 showFareButton = new Action1() {

        final PaymentWidgetContainerView this$0;

        public void call(Boolean boolean1)
        {
            updatePaymentWidgetVisibility();
            updateFarePriceWidget();
            if (boolean1.booleanValue())
            {
                showPriceFareWidget();
                return;
            } else
            {
                hidePriceFareWidget();
                return;
            }
        }

        public volatile void call(Object obj)
        {
            call((Boolean)obj);
        }

            
            {
                this$0 = PaymentWidgetContainerView.this;
                super();
            }
    };
    IUserSession userSession;
    private final Action1 viewsChange = new Action1() {

        final PaymentWidgetContainerView this$0;

        public volatile void call(Object obj)
        {
            call((List)obj);
        }

        public void call(List list)
        {
            int k = list.size();
            Rect rect = new Rect();
            int j = 0;
            while (j < list.size()) 
            {
                View view;
                int i;
                if (j == 0 && j == k - 1)
                {
                    i = 0x7f02001b;
                } else
                if (j == 0)
                {
                    i = 0x7f02001d;
                } else
                if (j > 0 && j < k - 1)
                {
                    i = 0x7f02001c;
                } else
                {
                    i = 0x7f02001e;
                }
                view = (View)list.get(j);
                PaymentWidgetContainerView.obtainPadding(view, rect);
                view.setBackgroundResource(i);
                PaymentWidgetContainerView.applyPadding(view, rect);
                j++;
            }
        }

            
            {
                this$0 = PaymentWidgetContainerView.this;
                super();
            }
    };
    final ReactiveProperty viewsSubject = ReactiveProperty.create();

    public PaymentWidgetContainerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        courierFaresObservable = courierFaresSubject.map(new Func1() {

            final PaymentWidgetContainerView this$0;

            public volatile Object call(Object obj)
            {
                return call((List)obj);
            }

            public List call(List list)
            {
                Object obj = userSession.getAppState();
                Location location = rideRequestSession.getDropoffLocation();
                Location location1 = LocationMapper.fromLocationDTO((LocationDTO)Objects.firstNonNull(((AppStateDTO) (obj)).getMarkerDestination(), NullLocationDTO.getInstance()));
                Location location2 = rideRequestSession.getPickupLocation();
                obj = LocationMapper.fromLocationDTO((LocationDTO)Objects.firstNonNull(((AppStateDTO) (obj)).getMarker(), NullLocationDTO.getInstance()));
                boolean flag;
                if (location1.hasSameCoordinates(location) && ((Location) (obj)).hasSameCoordinates(location2))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    return list;
                } else
                {
                    return Collections.emptyList();
                }
            }

            
            {
                this$0 = PaymentWidgetContainerView.this;
                super();
            }
        });
        super.setChildrenDrawingOrderEnabled(true);
        Scoop.a(this).b(this);
    }

    private static void applyPadding(View view, Rect rect)
    {
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    private Observable getShouldShowCourierPriceButtonObservable()
    {
        return Observable.combineLatest(courierFaresObservable, mapDragging, rideRequestSession.observeDropoffLocationChange(), new Func3() {

            final PaymentWidgetContainerView this$0;

            public Boolean call(List list, Boolean boolean1, Location location)
            {
                boolean flag;
                if (!boolean1.booleanValue() && !list.isEmpty() && rideRequestSession.getCurrentRideType().isCourier() && !location.isNull())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj, Object obj1, Object obj2)
            {
                return call((List)obj, (Boolean)obj1, (Location)obj2);
            }

            
            {
                this$0 = PaymentWidgetContainerView.this;
                super();
            }
        }).distinctUntilChanged();
    }

    private void hidePriceFareWidget()
    {
        if (isPaymentWidgetHasDefaultChargeAccount())
        {
            farePriceWidgetView.animateButtonVisibility(false);
            return;
        } else
        {
            farePriceWidgetView.setButtonVisibility(true);
            show(false);
            return;
        }
    }

    private void init()
    {
        updateProperties();
        updatePaymentWidget();
        updatePaymentWidgetVisibility();
        updateFarePriceWidget();
        updateFarePriceWidgetVisibility();
    }

    private boolean isPaymentWidgetHasDefaultChargeAccount()
    {
        ChargeAccount chargeaccount = (ChargeAccount)chargeAccount.get();
        return chargeaccount != null && chargeaccount.isDefault().booleanValue();
    }

    private static void obtainPadding(View view, Rect rect)
    {
        rect.left = view.getPaddingLeft();
        rect.top = view.getPaddingTop();
        rect.right = view.getPaddingRight();
        rect.bottom = view.getPaddingBottom();
    }

    private void showPriceFareWidget()
    {
        if (isPaymentWidgetHasDefaultChargeAccount())
        {
            farePriceWidgetView.animateButtonVisibility(true);
            return;
        } else
        {
            farePriceWidgetView.setButtonVisibility(true);
            show(true);
            return;
        }
    }

    private void updateFarePriceWidget()
    {
        FixedFare fixedfare = (FixedFare)rideFare.get();
        farePriceWidgetView.setCourierFare(fixedfare);
    }

    private void updateFarePriceWidgetVisibility()
    {
        boolean flag1 = true;
        if (!rideRequestSession.getCurrentRideType().isCourier())
        {
            hidePriceFareWidget();
            return;
        }
        boolean flag;
        if (!rideRequestSession.getPickupLocation().isNull())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (rideRequestSession.getDropoffLocation().isNull())
        {
            flag1 = false;
        }
        if (!flag || !flag1)
        {
            hidePriceFareWidget();
            return;
        }
        if (((Boolean)mapDragging.get()).booleanValue())
        {
            hidePriceFareWidget();
            return;
        }
        if (!((FixedFare)rideFare.get()).isNull())
        {
            showPriceFareWidget();
            return;
        } else
        {
            hidePriceFareWidget();
            return;
        }
    }

    private void updatePaymentWidget()
    {
        ChargeAccount chargeaccount = (ChargeAccount)chargeAccount.get();
        if (chargeaccount != null && chargeaccount.isDefault().booleanValue())
        {
            selectPaymentWidgetView.setChargeAccount(chargeaccount);
        }
    }

    private void updatePaymentWidgetVisibility()
    {
        if (isPaymentWidgetHasDefaultChargeAccount())
        {
            selectPaymentWidgetView.setButtonVisibility(true);
            show(true);
            return;
        } else
        {
            selectPaymentWidgetView.setButtonVisibility(false);
            return;
        }
    }

    private void updateProperties()
    {
        ChargeAccount chargeaccount = chargeAccountsProvider.getDefaultOrFirstValidChargeAccount();
        chargeAccount.onNext(chargeaccount);
        courierFaresSubject.onNext(preRideInfoRepository.getPreRideInfo().getFares());
    }

    private void updateShowingViews()
    {
        int j = getChildCount();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            View view = getChildAt(i);
            if (((MapWidget)view).isShowing())
            {
                arraylist.add(view);
            }
        }

        viewsSubject.onNext(arraylist);
    }

    protected int getChildDrawingOrder(int i, int j)
    {
        return i - j - 1;
    }

    public void isMapDragging(boolean flag)
    {
        mapDragging.onNext(Boolean.valueOf(flag));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            Binder binder = Binder.attach(this);
            binder.bind(viewsSubject, viewsChange);
            binder.bind(courierFaresObservable, onCourierFareChange);
            binder.bind(rideRequestSession.observeCurrentRideType(), rideTypeChange);
            binder.bind(chargeAccount, chargeAccountChange);
            binder.bind(getShouldShowCourierPriceButtonObservable(), showFareButton);
            binder.bind(bus.observe(me/lyft/android/events/AppStateUpdatedEvent), appStateChange);
            return;
        }
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
            init();
            return;
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        updateShowingViews();
    }

    public void show(boolean flag)
    {
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.o(this);
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.0F;
        }
        viewpropertyanimatorcompat.a(f).a(500L).b();
    }










    private class MapWidget
    {

        public abstract void animateButtonVisibility(boolean flag);

        public abstract boolean isShowing();

        public abstract void setButtonVisibility(boolean flag);
    }

}
