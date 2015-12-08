// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.StandbySwitcher;
import me.lyft.android.controls.SwitcherSelection;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.MoneyMapper;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.PreRideInfo;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.logging.L;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.ride.RideMap;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.ui.passenger:
//            MatchingStartTime, PassengerRideAddressInput, PassengerMatchingBottomView

public class PassengerCourierRideMatchingView extends RelativeLayout
{

    private Binder binder;
    MessageBus bus;
    IConstantsProvider constantsProvider;
    PassengerMatchingBottomView contactingDriverBottomView;
    private final BehaviorSubject currentStandbySelectionSubject = BehaviorSubject.create();
    DialogFlow dialogFlow;
    View farePriceView;
    private final Action1 onCurrentStandbySelectionChanged = new Action1() {

        final PassengerCourierRideMatchingView this$0;

        public volatile void call(Object obj)
        {
            call((String)obj);
        }

        public void call(String s)
        {
            standbySwitcher.moveThumbToItemId(s);
        }

            
            {
                this$0 = PassengerCourierRideMatchingView.this;
                super();
            }
    };
    private final Action1 onMapLoaded = new Action1() {

        final PassengerCourierRideMatchingView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            rideMap.bindPadding(passengerRideTop, passengerRideBottom);
            unit = passengerRideProvider.getPassengerRide();
            rideMap.fitMapTo(new Location[] {
                unit.getPickup(), unit.getDropoff()
            });
            if (!unit.getStatus().isPending())
            {
                L.e(new IllegalStateException("PassengerCourierRideMatchingView expected pending ride"), (new StringBuilder()).append("Ride id:").append(unit.getId()).append(", ride status: ").append(unit.getStatus()).toString(), new Object[0]);
            }
            binder.bind(passengerRideProvider.observeStopsChange(), new Action1() {

                final _cls1 this$1;

                public volatile void call(Object obj)
                {
                    call((List)obj);
                }

                public void call(List list)
                {
                    rideMap.showCourierRouteMarkers(list);
                }

            
            {
                this$1 = _cls1.this;
                super();
            }
            });
        }

            
            {
                this$0 = PassengerCourierRideMatchingView.this;
                super();
            }
    };
    private final Action1 onMenuItemClicked = new Action1() {

        final PassengerCourierRideMatchingView this$0;

        public void call(Integer integer)
        {
            switch (integer.intValue())
            {
            default:
                return;

            case 2131558403: 
                dialogFlow.show(new PassengerDialogs.PassengerCancelRideDialog());
                break;
            }
        }

        public volatile void call(Object obj)
        {
            call((Integer)obj);
        }

            
            {
                this$0 = PassengerCourierRideMatchingView.this;
                super();
            }
    };
    private final Action1 onRideUpdated = new Action1() {

        final PassengerCourierRideMatchingView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            int i = passengerRideProvider.getPassengerRide().getWaitEstimateInSec();
            waitTimeSubject.onNext(Integer.valueOf(i));
            updateSwitcherOptions(preRideInfoRepository.getPreRideInfo().getFares());
            currentStandbySelectionSubject.onNext(getCurrentSelectedFare().getFixedFareToken());
        }

            
            {
                this$0 = PassengerCourierRideMatchingView.this;
                super();
            }
    };
    private final Action1 onStandbyOptionSelected = new Action1() {

        final PassengerCourierRideMatchingView this$0;

        public volatile void call(Object obj)
        {
            call((me.lyft.android.controls.StandbySwitcher.StandbySwitcherItem)obj);
        }

        public void call(me.lyft.android.controls.StandbySwitcher.StandbySwitcherItem standbyswitcheritem)
        {
            dialogFlow.show(new PassengerDialogs.StandbyConfirmationDialog(standbyswitcheritem.getFare()));
            standbyswitcheritem = getCurrentSelectedFare().getFixedFareToken();
            standbySwitcher.animateThumbToItemId(standbyswitcheritem);
        }

            
            {
                this$0 = PassengerCourierRideMatchingView.this;
                super();
            }
    };
    private final Action1 onWaitTimeChange = new Action1() {

        final PassengerCourierRideMatchingView this$0;

        public void call(Integer integer)
        {
            if (integer.intValue() > 0)
            {
                int i = Math.max((int)TimeUnit.SECONDS.toMinutes(integer.intValue()), 1);
                String s = constantsProvider.getConstants().getPlaceholderMatchingScreenHeaderString(getResources().getString(0x7f0702b4));
                s = getResources().getQuantityString(0x7f0f0000, i, new Object[] {
                    s, Integer.valueOf(i)
                });
                waitTimeTextView.setText(Html.fromHtml(s));
                contactingDriverBottomView.setWaitTime(integer.intValue());
            }
        }

        public volatile void call(Object obj)
        {
            call((Integer)obj);
        }

            
            {
                this$0 = PassengerCourierRideMatchingView.this;
                super();
            }
    };
    TextView partySizeTextView;
    PassengerRideAddressInput passengerRideAddressInput;
    HeightObservableLayout passengerRideBottom;
    IPassengerRideProvider passengerRideProvider;
    HeightObservableLayout passengerRideTop;
    IPreRideInfoRepository preRideInfoRepository;
    ILyftPreferences preferences;
    RideMap rideMap;
    TextView ridePriceDescriptionView;
    TextView ridePriceTextView;
    View singleRideOptionView;
    SlideMenuController slideMenuController;
    StandbySwitcher standbySwitcher;
    Toolbar toolbar;
    IUserSession userSession;
    private final ReactiveProperty waitTimeSubject = ReactiveProperty.create();
    TextView waitTimeTextView;

    public PassengerCourierRideMatchingView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private FixedFare getCurrentSelectedFare()
    {
        return preRideInfoRepository.getPreRideInfo().selectedFare();
    }

    private long getMatchingStartTime()
    {
        MatchingStartTime matchingstarttime1 = preferences.getPassengerMatchingStartTime();
        String s = passengerRideProvider.getPassengerRide().getId();
        MatchingStartTime matchingstarttime = matchingstarttime1;
        if (!Objects.equals(matchingstarttime1.getRideId(), s))
        {
            matchingstarttime = new MatchingStartTime(s);
            preferences.setPassengerMatchingStartTime(matchingstarttime);
        }
        return matchingstarttime.getStartTime();
    }

    private String resolveAddressName(Location location)
    {
        String s = location.getDisplayName();
        if (location.isNull() || !Strings.isNullOrEmpty(s))
        {
            return s;
        } else
        {
            return getResources().getString(0x7f070064);
        }
    }

    private void setupCourierFareButton()
    {
        int i = passengerRideProvider.getPassengerRide().getSelf().getPartySize();
        partySizeTextView.setText(String.valueOf(i));
        Object obj;
        TextView textview;
        if (i == 1)
        {
            i = 0x7f0201bc;
        } else
        {
            i = 0x7f020194;
        }
        partySizeTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        obj = userSession.getRide();
        textview = ridePriceTextView;
        if (obj != null)
        {
            obj = ((RideDTO) (obj)).getTotalMoney();
        } else
        {
            obj = null;
        }
        textview.setText(MoneyMapper.fromMoneyDTO(((me.lyft.android.infrastructure.lyft.payment.MoneyDTO) (obj))).format());
        binder.bind(standbySwitcher.observeSelectionChanges().filter(new Func1() {

            final PassengerCourierRideMatchingView this$0;

            public Boolean call(SwitcherSelection switcherselection)
            {
                String s = getCurrentSelectedFare().getFixedFareToken();
                boolean flag;
                if (switcherselection.isUserAction() && !Objects.equals(((me.lyft.android.controls.StandbySwitcher.StandbySwitcherItem)switcherselection.getSwitcherItem()).getId(), s))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj1)
            {
                return call((SwitcherSelection)obj1);
            }

            
            {
                this$0 = PassengerCourierRideMatchingView.this;
                super();
            }
        }).map(new Func1() {

            final PassengerCourierRideMatchingView this$0;

            public volatile Object call(Object obj1)
            {
                return call((SwitcherSelection)obj1);
            }

            public me.lyft.android.controls.StandbySwitcher.StandbySwitcherItem call(SwitcherSelection switcherselection)
            {
                return (me.lyft.android.controls.StandbySwitcher.StandbySwitcherItem)switcherselection.getSwitcherItem();
            }

            
            {
                this$0 = PassengerCourierRideMatchingView.this;
                super();
            }
        }), onStandbyOptionSelected);
        binder.bind(currentStandbySelectionSubject, onCurrentStandbySelectionChanged);
    }

    private void setupRideAddressInput()
    {
        passengerRideAddressInput.showPickupAndDropoff();
        passengerRideAddressInput.setInputsFocusable(false);
        passengerRideAddressInput.setPickupAddress(resolveAddressName(passengerRideProvider.getPassengerRide().getPickup()));
        passengerRideAddressInput.setDropoffAddress(resolveAddressName(passengerRideProvider.getPassengerRide().getDropoff()));
        binder.bind(passengerRideAddressInput.observePickupClick(), new Action1() {

            final PassengerCourierRideMatchingView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                dialogFlow.show(new PassengerDialogs.LockAddressDialog(true));
            }

            
            {
                this$0 = PassengerCourierRideMatchingView.this;
                super();
            }
        });
        binder.bind(passengerRideAddressInput.observeDropoffClick(), new Action1() {

            final PassengerCourierRideMatchingView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                dialogFlow.show(new PassengerDialogs.LockAddressDialog(false));
            }

            
            {
                this$0 = PassengerCourierRideMatchingView.this;
                super();
            }
        });
    }

    private void updateSwitcherOptions(List list)
    {
        list = Iterables.select(list, new Func1() {

            final PassengerCourierRideMatchingView this$0;

            public volatile Object call(Object obj)
            {
                return call((FixedFare)obj);
            }

            public me.lyft.android.controls.StandbySwitcher.StandbySwitcherItem call(FixedFare fixedfare)
            {
                return new me.lyft.android.controls.StandbySwitcher.StandbySwitcherItem(fixedfare);
            }

            
            {
                this$0 = PassengerCourierRideMatchingView.this;
                super();
            }
        });
        if (list.size() > 1)
        {
            standbySwitcher.setItems(list);
            singleRideOptionView.setVisibility(8);
            standbySwitcher.setVisibility(0);
            farePriceView.setOnClickListener(null);
            farePriceView.setClickable(false);
            return;
        }
        singleRideOptionView.setVisibility(0);
        standbySwitcher.setVisibility(8);
        list = getCurrentSelectedFare();
        ridePriceTextView.setText(list.getTotalMoney().format());
        String s = list.getDescriptionText();
        TextView textview = ridePriceDescriptionView;
        list = s;
        if (Strings.isNullOrEmpty(s))
        {
            list = getResources().getString(0x7f07017a);
        }
        textview.setText(list);
        farePriceView.setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerCourierRideMatchingView this$0;

            public void onClick(View view)
            {
                FixedFare fixedfare = preRideInfoRepository.getPreRideInfo().findCourierByPartySize(passengerRideProvider.getPassengerRide().getSelf().getPartySize());
                view = userSession.getRide();
                DialogFlow dialogflow = dialogFlow;
                if (view != null)
                {
                    view = view.getTotalMoney();
                } else
                {
                    view = null;
                }
                dialogflow.show(new PassengerDialogs.CourierRideTypeInfoDialog(MoneyMapper.fromMoneyDTO(view), fixedfare.getComparisonMoney(), fixedfare.getComparisonText()));
            }

            
            {
                this$0 = PassengerCourierRideMatchingView.this;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            slideMenuController.enableMenu();
            toolbar.addItem(0x7f0d0003, 0x7f02012a);
            binder = Binder.attach(this);
            binder.bind(passengerRideProvider.observeRideUpdateEvent(), onRideUpdated);
            binder.bind(toolbar.observeItemClick(), onMenuItemClicked);
            setupRideAddressInput();
            setupCourierFareButton();
            contactingDriverBottomView.setRotatingMessages(constantsProvider.getConstants().getPlaceholderMatchingScreenStrings());
            contactingDriverBottomView.setStartTime(getMatchingStartTime());
            contactingDriverBottomView.showEmptyPassengerView();
            binder.bind(waitTimeSubject, onWaitTimeChange);
            binder.bind(rideMap.observeMapLoaded(), onMapLoaded);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        slideMenuController.disableMenu();
        rideMap.clearAllMarkers();
        rideMap.clearRoutes();
        rideMap.reset();
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
