// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.facades.ApiFacade;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.services:
//            LyftDriverToggleService

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding apiFacade;
    private Binding bus;
    private Binding device;
    private Binding lyftPreferences;
    private Binding userSession;

    public void attach(Linker linker)
    {
        apiFacade = linker.requestBinding("me.lyft.android.facades.ApiFacade", me/lyft/android/services/LyftDriverToggleService, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/services/LyftDriverToggleService, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/services/LyftDriverToggleService, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/services/LyftDriverToggleService, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/services/LyftDriverToggleService, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public LyftDriverToggleService get()
    {
        LyftDriverToggleService lyftdrivertoggleservice = new LyftDriverToggleService();
        injectMembers(lyftdrivertoggleservice);
        return lyftdrivertoggleservice;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(apiFacade);
        set1.add(userSession);
        set1.add(bus);
        set1.add(device);
        set1.add(lyftPreferences);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((LyftDriverToggleService)obj);
    }

    public void injectMembers(LyftDriverToggleService lyftdrivertoggleservice)
    {
        lyftdrivertoggleservice.apiFacade = (ApiFacade)apiFacade.get();
        lyftdrivertoggleservice.userSession = (IUserSession)userSession.get();
        lyftdrivertoggleservice.bus = (MessageBus)bus.get();
        lyftdrivertoggleservice.device = (IDevice)device.get();
        lyftdrivertoggleservice.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
    }

    public ()
    {
        super("me.lyft.android.services.LyftDriverToggleService", "members/me.lyft.android.services.LyftDriverToggleService", false, me/lyft/android/services/LyftDriverToggleService);
    }
}
