// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.driverdocuments.Insurance;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class CheckDriverDocumentsJob
    implements Job
{

    DialogFlow dialogFlow;
    IDriverDocumentsProvider driverDocumentsProvider;
    IDriverDocumentsService driverDocumentsService;

    public CheckDriverDocumentsJob()
    {
    }

    public void execute()
    {
        Insurance insurance = driverDocumentsProvider.getInsurance();
        if (driverDocumentsService.isDriverDocumentsEnabled() && !insurance.isPending())
        {
            if (insurance.isNull())
            {
                driverDocumentsService.forceRefresh();
                return;
            }
            if (insurance.shouldShowInsuranceExpirationDialog())
            {
                dialogFlow.show(new me.lyft.android.ui.Dialogs.InsuranceExpiringDialog());
                return;
            }
        }
    }
}
