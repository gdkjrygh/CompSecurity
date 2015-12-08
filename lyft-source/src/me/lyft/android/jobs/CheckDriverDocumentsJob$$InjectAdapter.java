// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.jobs:
//            CheckDriverDocumentsJob

public final class Service extends Binding
    implements MembersInjector, Provider
{

    private Binding dialogFlow;
    private Binding driverDocumentsProvider;
    private Binding driverDocumentsService;

    public void attach(Linker linker)
    {
        driverDocumentsProvider = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsProvider", me/lyft/android/jobs/CheckDriverDocumentsJob, getClass().getClassLoader());
        driverDocumentsService = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsService", me/lyft/android/jobs/CheckDriverDocumentsJob, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/jobs/CheckDriverDocumentsJob, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public CheckDriverDocumentsJob get()
    {
        CheckDriverDocumentsJob checkdriverdocumentsjob = new CheckDriverDocumentsJob();
        injectMembers(checkdriverdocumentsjob);
        return checkdriverdocumentsjob;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(driverDocumentsProvider);
        set1.add(driverDocumentsService);
        set1.add(dialogFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((CheckDriverDocumentsJob)obj);
    }

    public void injectMembers(CheckDriverDocumentsJob checkdriverdocumentsjob)
    {
        checkdriverdocumentsjob.driverDocumentsProvider = (IDriverDocumentsProvider)driverDocumentsProvider.get();
        checkdriverdocumentsjob.driverDocumentsService = (IDriverDocumentsService)driverDocumentsService.get();
        checkdriverdocumentsjob.dialogFlow = (DialogFlow)dialogFlow.get();
    }

    public Service()
    {
        super("me.lyft.android.jobs.CheckDriverDocumentsJob", "members/me.lyft.android.jobs.CheckDriverDocumentsJob", false, me/lyft/android/jobs/CheckDriverDocumentsJob);
    }
}
