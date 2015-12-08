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
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.utils.Navigator;
import me.lyft.android.utils.TextToSpeech;
import me.lyft.android.utils.Vibrator;

// Referenced classes of package me.lyft.android.jobs:
//            CourierDriverRideUpdatedJob

public final class  extends Binding
    implements MembersInjector
{

    private Binding appForegroundDetector;
    private Binding application;
    private Binding lyftPreferences;
    private Binding navigator;
    private Binding textToSpeech;
    private Binding vibrator;

    public void attach(Linker linker)
    {
        application = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/jobs/CourierDriverRideUpdatedJob, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/jobs/CourierDriverRideUpdatedJob, getClass().getClassLoader());
        navigator = linker.requestBinding("me.lyft.android.utils.Navigator", me/lyft/android/jobs/CourierDriverRideUpdatedJob, getClass().getClassLoader());
        appForegroundDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/jobs/CourierDriverRideUpdatedJob, getClass().getClassLoader());
        textToSpeech = linker.requestBinding("me.lyft.android.utils.TextToSpeech", me/lyft/android/jobs/CourierDriverRideUpdatedJob, getClass().getClassLoader());
        vibrator = linker.requestBinding("me.lyft.android.utils.Vibrator", me/lyft/android/jobs/CourierDriverRideUpdatedJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(application);
        set1.add(lyftPreferences);
        set1.add(navigator);
        set1.add(appForegroundDetector);
        set1.add(textToSpeech);
        set1.add(vibrator);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((CourierDriverRideUpdatedJob)obj);
    }

    public void injectMembers(CourierDriverRideUpdatedJob courierdriverrideupdatedjob)
    {
        courierdriverrideupdatedjob.application = (LyftApplication)application.get();
        courierdriverrideupdatedjob.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        courierdriverrideupdatedjob.navigator = (Navigator)navigator.get();
        courierdriverrideupdatedjob.appForegroundDetector = (IAppForegroundDetector)appForegroundDetector.get();
        courierdriverrideupdatedjob.textToSpeech = (TextToSpeech)textToSpeech.get();
        courierdriverrideupdatedjob.vibrator = (Vibrator)vibrator.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.jobs.CourierDriverRideUpdatedJob", false, me/lyft/android/jobs/CourierDriverRideUpdatedJob);
    }
}
