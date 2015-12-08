// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.passenger:
//            SelectPaymentWidgetView

public final class I extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/passenger/SelectPaymentWidgetView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/passenger/SelectPaymentWidgetView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(userProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SelectPaymentWidgetView)obj);
    }

    public void injectMembers(SelectPaymentWidgetView selectpaymentwidgetview)
    {
        selectpaymentwidgetview.appFlow = (AppFlow)appFlow.get();
        selectpaymentwidgetview.userProvider = (IUserProvider)userProvider.get();
    }

    public I()
    {
        super(null, "members/me.lyft.android.ui.passenger.SelectPaymentWidgetView", false, me/lyft/android/ui/passenger/SelectPaymentWidgetView);
    }
}
