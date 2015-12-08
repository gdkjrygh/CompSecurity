// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.events.AppStateUpdatedEvent;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ride.BannerDTO;
import me.lyft.android.infrastructure.lyft.ride.BannerItemDTO;
import me.lyft.android.managers.DeepLinkManager;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func2;

public class PromoBannerView extends RelativeLayout
{

    private ReactiveProperty actionDeepLinkSubject;
    private ReactiveProperty bannerTextSubject;
    TextView bannerTextView;
    MessageBus bus;
    private Observable canClickBanner;
    DeepLinkManager deepLinkManager;
    DialogFlow dialogFlow;
    private ReactiveProperty notificationUrlSubject;
    private final Action1 onAppStateUpdated = new Action1() {

        final PromoBannerView this$0;

        private void setBanner(BannerItemDTO banneritemdto, String s)
        {
            bannerTextSubject.onNext(banneritemdto.getText());
            notificationUrlSubject.onNext(banneritemdto.getUrl());
            actionDeepLinkSubject.onNext(banneritemdto.getDeeplink());
            if (getVisibility() != 0)
            {
                setVisibility(0);
                RideAnalytics.trackPromoBannerShown(banneritemdto, s);
            }
        }

        public volatile void call(Object obj)
        {
            call((AppStateDTO)obj);
        }

        public void call(AppStateDTO appstatedto)
        {
            appstatedto = rideRequestSession.getCurrentRideType().getId();
            Object obj = userSession.getAppState().getBanners();
            if (obj == null || ((List) (obj)).isEmpty())
            {
                setVisibility(8);
                return;
            }
            obj = getBannerItemByRideType(((List) (obj)), appstatedto);
            if (obj == null)
            {
                setVisibility(8);
                return;
            } else
            {
                setBanner(((BannerItemDTO) (obj)), appstatedto);
                return;
            }
        }

            
            {
                this$0 = PromoBannerView.this;
                super();
            }
    };
    private final Action1 onClickBehaviorChange = new Action1() {

        final PromoBannerView this$0;

        public void call(Boolean boolean1)
        {
            String s = (String)actionDeepLinkSubject.get();
            String s1 = (String)notificationUrlSubject.get();
            setClickable(boolean1.booleanValue());
            if (Strings.isNullOrEmpty(s) && !Strings.isNullOrEmpty(s1))
            {
                bannerTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(0x7f020198), null);
                return;
            } else
            {
                bannerTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                return;
            }
        }

        public volatile void call(Object obj)
        {
            call((Boolean)obj);
        }

            
            {
                this$0 = PromoBannerView.this;
                super();
            }
    };
    private final Action1 onPromoBannerTextChange = new Action1() {

        final PromoBannerView this$0;

        public volatile void call(Object obj)
        {
            call((String)obj);
        }

        public void call(String s)
        {
            bannerTextView.setText(Html.fromHtml(s));
        }

            
            {
                this$0 = PromoBannerView.this;
                super();
            }
    };
    IRideRequestSession rideRequestSession;
    IUserSession userSession;

    public PromoBannerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        bannerTextSubject = ReactiveProperty.create("");
        notificationUrlSubject = ReactiveProperty.create("");
        actionDeepLinkSubject = ReactiveProperty.create("");
        canClickBanner = Observable.combineLatest(notificationUrlSubject, actionDeepLinkSubject, new Func2() {

            final PromoBannerView this$0;

            public Boolean call(String s, String s1)
            {
                boolean flag;
                if (!Strings.isNullOrEmpty(s) || !Strings.isNullOrEmpty(s1))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj, Object obj1)
            {
                return call((String)obj, (String)obj1);
            }

            
            {
                this$0 = PromoBannerView.this;
                super();
            }
        });
        context = Scoop.a(this);
        context.b(this);
        context.a(getContext()).inflate(0x7f030111, this, true);
    }

    private BannerItemDTO getBannerItemByRideType(List list, String s)
    {
        Iterator iterator = list.iterator();
        BannerItemDTO banneritemdto = null;
        list = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            BannerDTO bannerdto = (BannerDTO)iterator.next();
            if (bannerdto.rideType.equalsIgnoreCase(s))
            {
                banneritemdto = bannerdto.bannerItem;
            }
            if (bannerdto.rideType.equalsIgnoreCase("default"))
            {
                list = bannerdto.bannerItem;
            }
        } while (true);
        if (banneritemdto != null)
        {
            return banneritemdto;
        } else
        {
            return list;
        }
    }

    private void openNotificationUrl(String s)
    {
        s = new me.lyft.android.ui.Dialogs.InAppNotificationDialog(s);
        if (!dialogFlow.hasActiveDialog())
        {
            dialogFlow.show(s);
        }
    }

    private void performDeepLink(String s)
    {
        deepLinkManager.route(s);
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
            binder.bind(bus.observe(me/lyft/android/events/AppStateUpdatedEvent), onAppStateUpdated);
            binder.bind(bannerTextSubject, onPromoBannerTextChange);
            binder.bind(canClickBanner, onClickBehaviorChange);
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
            return;
        }
    }

    public boolean performClick()
    {
        String s;
        String s1;
        RideAnalytics.trackPromoBannerTapped();
        s = (String)actionDeepLinkSubject.get();
        s1 = (String)notificationUrlSubject.get();
        if (Strings.isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        performDeepLink(s);
_L4:
        return true;
_L2:
        if (!Strings.isNullOrEmpty(s1))
        {
            openNotificationUrl(s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }




}
