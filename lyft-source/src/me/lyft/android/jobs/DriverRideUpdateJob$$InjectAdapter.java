// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.LyftApplication;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.utils.TextToSpeech;

// Referenced classes of package me.lyft.android.jobs:
//            DriverRideUpdateJob

public final class  extends Binding
    implements MembersInjector
{

    private Binding application;
    private Binding dialogFlow;
    private Binding driverRideProvider;
    private Binding textToSpeech;

    public void attach(Linker linker)
    {
        application = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/jobs/DriverRideUpdateJob, getClass().getClassLoader());
        driverRideProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/jobs/DriverRideUpdateJob, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/jobs/DriverRideUpdateJob, getClass().getClassLoader());
        textToSpeech = linker.requestBinding("me.lyft.android.utils.TextToSpeech", me/lyft/android/jobs/DriverRideUpdateJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(application);
        set1.add(driverRideProvider);
        set1.add(dialogFlow);
        set1.add(textToSpeech);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverRideUpdateJob)obj);
    }

    public void injectMembers(DriverRideUpdateJob driverrideupdatejob)
    {
        driverrideupdatejob.application = (LyftApplication)application.get();
        driverrideupdatejob.driverRideProvider = (IDriverRideProvider)driverRideProvider.get();
        driverrideupdatejob.dialogFlow = (DialogFlow)dialogFlow.get();
        driverrideupdatejob.textToSpeech = (TextToSpeech)textToSpeech.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.jobs.DriverRideUpdateJob", false, me/lyft/android/jobs/DriverRideUpdateJob);
    }
}
