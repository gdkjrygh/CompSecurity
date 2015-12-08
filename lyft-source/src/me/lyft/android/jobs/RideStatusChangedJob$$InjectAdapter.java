// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.utils.SoundManager;
import me.lyft.android.utils.Vibrator;

// Referenced classes of package me.lyft.android.jobs:
//            RideStatusChangedJob

public final class ationService extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding appForegroundDetector;
    private Binding application;
    private Binding bus;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding inAppNotificationService;
    private Binding preferences;
    private Binding soundManager;
    private Binding vibrator;

    public void attach(Linker linker)
    {
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/jobs/RideStatusChangedJob, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/jobs/RideStatusChangedJob, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/jobs/RideStatusChangedJob, getClass().getClassLoader());
        application = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/jobs/RideStatusChangedJob, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/jobs/RideStatusChangedJob, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/jobs/RideStatusChangedJob, getClass().getClassLoader());
        soundManager = linker.requestBinding("me.lyft.android.utils.SoundManager", me/lyft/android/jobs/RideStatusChangedJob, getClass().getClassLoader());
        vibrator = linker.requestBinding("me.lyft.android.utils.Vibrator", me/lyft/android/jobs/RideStatusChangedJob, getClass().getClassLoader());
        appForegroundDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/jobs/RideStatusChangedJob, getClass().getClassLoader());
        inAppNotificationService = linker.requestBinding("me.lyft.android.infrastructure.notifications.InAppNotificationService", me/lyft/android/jobs/RideStatusChangedJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(preferences);
        set1.add(constantsProvider);
        set1.add(bus);
        set1.add(application);
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(soundManager);
        set1.add(vibrator);
        set1.add(appForegroundDetector);
        set1.add(inAppNotificationService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((RideStatusChangedJob)obj);
    }

    public void injectMembers(RideStatusChangedJob ridestatuschangedjob)
    {
        ridestatuschangedjob.preferences = (ILyftPreferences)preferences.get();
        ridestatuschangedjob.constantsProvider = (IConstantsProvider)constantsProvider.get();
        ridestatuschangedjob.bus = (MessageBus)bus.get();
        ridestatuschangedjob.application = (LyftApplication)application.get();
        ridestatuschangedjob.appFlow = (AppFlow)appFlow.get();
        ridestatuschangedjob.dialogFlow = (DialogFlow)dialogFlow.get();
        ridestatuschangedjob.soundManager = (SoundManager)soundManager.get();
        ridestatuschangedjob.vibrator = (Vibrator)vibrator.get();
        ridestatuschangedjob.appForegroundDetector = (IAppForegroundDetector)appForegroundDetector.get();
        ridestatuschangedjob.inAppNotificationService = (InAppNotificationService)inAppNotificationService.get();
    }

    public ationService()
    {
        super(null, "members/me.lyft.android.jobs.RideStatusChangedJob", false, me/lyft/android/jobs/RideStatusChangedJob);
    }
}
