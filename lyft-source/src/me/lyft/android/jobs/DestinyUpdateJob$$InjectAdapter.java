// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IDestinySession;

// Referenced classes of package me.lyft.android.jobs:
//            DestinyUpdateJob

public final class  extends Binding
    implements MembersInjector
{

    private Binding destinySession;

    public void attach(Linker linker)
    {
        destinySession = linker.requestBinding("me.lyft.android.application.ride.IDestinySession", me/lyft/android/jobs/DestinyUpdateJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(destinySession);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DestinyUpdateJob)obj);
    }

    public void injectMembers(DestinyUpdateJob destinyupdatejob)
    {
        destinyupdatejob.destinySession = (IDestinySession)destinySession.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.jobs.DestinyUpdateJob", false, me/lyft/android/jobs/DestinyUpdateJob);
    }
}
