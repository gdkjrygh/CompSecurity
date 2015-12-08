// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.notifications;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.infrastructure.notifications:
//            InAppNotificationService

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding bus;
    private Binding dialogFlow;
    private Binding lyftApi;
    private Binding lyftPreferences;
    private Binding supertype;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/infrastructure/notifications/InAppNotificationService, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/infrastructure/notifications/InAppNotificationService, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/infrastructure/notifications/InAppNotificationService, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/notifications/InAppNotificationService, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/infrastructure/notifications/InAppNotificationService, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.infrastructure.activity.ActivityService", me/lyft/android/infrastructure/notifications/InAppNotificationService, getClass().getClassLoader(), false, true);
    }

    public volatile Object get()
    {
        return get();
    }

    public InAppNotificationService get()
    {
        InAppNotificationService inappnotificationservice = new InAppNotificationService((ILyftApi)lyftApi.get(), (IUserProvider)userProvider.get(), (MessageBus)bus.get(), (ILyftPreferences)lyftPreferences.get(), (DialogFlow)dialogFlow.get());
        injectMembers(inappnotificationservice);
        return inappnotificationservice;
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApi);
        set.add(userProvider);
        set.add(bus);
        set.add(lyftPreferences);
        set.add(dialogFlow);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((InAppNotificationService)obj);
    }

    public void injectMembers(InAppNotificationService inappnotificationservice)
    {
        supertype.injectMembers(inappnotificationservice);
    }

    public ()
    {
        super("me.lyft.android.infrastructure.notifications.InAppNotificationService", "members/me.lyft.android.infrastructure.notifications.InAppNotificationService", false, me/lyft/android/infrastructure/notifications/InAppNotificationService);
    }
}
