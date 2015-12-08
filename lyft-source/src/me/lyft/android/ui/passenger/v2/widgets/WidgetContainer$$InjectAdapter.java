// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package me.lyft.android.ui.passenger.v2.widgets:
//            WidgetContainer, PaymentWidgetPresenter, PriceEstimatePresenter, FixedFareWidgetPresenter, 
//            PrimeTimeWidgetPresenter, WidgetContainerPresenter

public final class  extends Binding
    implements MembersInjector
{

    private Binding fixedFareWidgetPresenter;
    private Binding paymentWidgetPresenter;
    private Binding priceEstimatePresenter;
    private Binding primeTimeWidgetPresenter;
    private Binding widgetContainerPresenter;

    public void attach(Linker linker)
    {
        paymentWidgetPresenter = linker.requestBinding("me.lyft.android.ui.passenger.v2.widgets.PaymentWidgetPresenter", me/lyft/android/ui/passenger/v2/widgets/WidgetContainer, getClass().getClassLoader());
        priceEstimatePresenter = linker.requestBinding("me.lyft.android.ui.passenger.v2.widgets.PriceEstimatePresenter", me/lyft/android/ui/passenger/v2/widgets/WidgetContainer, getClass().getClassLoader());
        fixedFareWidgetPresenter = linker.requestBinding("me.lyft.android.ui.passenger.v2.widgets.FixedFareWidgetPresenter", me/lyft/android/ui/passenger/v2/widgets/WidgetContainer, getClass().getClassLoader());
        primeTimeWidgetPresenter = linker.requestBinding("me.lyft.android.ui.passenger.v2.widgets.PrimeTimeWidgetPresenter", me/lyft/android/ui/passenger/v2/widgets/WidgetContainer, getClass().getClassLoader());
        widgetContainerPresenter = linker.requestBinding("me.lyft.android.ui.passenger.v2.widgets.WidgetContainerPresenter", me/lyft/android/ui/passenger/v2/widgets/WidgetContainer, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(paymentWidgetPresenter);
        set1.add(priceEstimatePresenter);
        set1.add(fixedFareWidgetPresenter);
        set1.add(primeTimeWidgetPresenter);
        set1.add(widgetContainerPresenter);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((WidgetContainer)obj);
    }

    public void injectMembers(WidgetContainer widgetcontainer)
    {
        widgetcontainer.paymentWidgetPresenter = (PaymentWidgetPresenter)paymentWidgetPresenter.get();
        widgetcontainer.priceEstimatePresenter = (PriceEstimatePresenter)priceEstimatePresenter.get();
        widgetcontainer.fixedFareWidgetPresenter = (FixedFareWidgetPresenter)fixedFareWidgetPresenter.get();
        widgetcontainer.primeTimeWidgetPresenter = (PrimeTimeWidgetPresenter)primeTimeWidgetPresenter.get();
        widgetcontainer.widgetContainerPresenter = (WidgetContainerPresenter)widgetContainerPresenter.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.v2.widgets.WidgetContainer", false, me/lyft/android/ui/passenger/v2/widgets/WidgetContainer);
    }
}
