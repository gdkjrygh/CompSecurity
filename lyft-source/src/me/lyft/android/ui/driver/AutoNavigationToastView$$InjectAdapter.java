// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.services.TimerManager;
import me.lyft.android.utils.Navigator;
import me.lyft.android.utils.TextToSpeech;

// Referenced classes of package me.lyft.android.ui.driver:
//            AutoNavigationToastView

public final class  extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding dialogFlow;
    private Binding navigator;
    private Binding routeProvider;
    private Binding supertype;
    private Binding textToSpeech;
    private Binding timerManager;

    public void attach(Linker linker)
    {
        timerManager = linker.requestBinding("me.lyft.android.services.TimerManager", me/lyft/android/ui/driver/AutoNavigationToastView, getClass().getClassLoader());
        textToSpeech = linker.requestBinding("me.lyft.android.utils.TextToSpeech", me/lyft/android/ui/driver/AutoNavigationToastView, getClass().getClassLoader());
        navigator = linker.requestBinding("me.lyft.android.utils.Navigator", me/lyft/android/ui/driver/AutoNavigationToastView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/AutoNavigationToastView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/driver/AutoNavigationToastView, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/driver/AutoNavigationToastView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/driver/AutoNavigationToastView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(timerManager);
        set1.add(textToSpeech);
        set1.add(navigator);
        set1.add(dialogFlow);
        set1.add(bus);
        set1.add(routeProvider);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((AutoNavigationToastView)obj);
    }

    public void injectMembers(AutoNavigationToastView autonavigationtoastview)
    {
        autonavigationtoastview.timerManager = (TimerManager)timerManager.get();
        autonavigationtoastview.textToSpeech = (TextToSpeech)textToSpeech.get();
        autonavigationtoastview.navigator = (Navigator)navigator.get();
        autonavigationtoastview.dialogFlow = (DialogFlow)dialogFlow.get();
        autonavigationtoastview.bus = (MessageBus)bus.get();
        autonavigationtoastview.routeProvider = (IDriverRideProvider)routeProvider.get();
        supertype.injectMembers(autonavigationtoastview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.AutoNavigationToastView", false, me/lyft/android/ui/driver/AutoNavigationToastView);
    }
}
