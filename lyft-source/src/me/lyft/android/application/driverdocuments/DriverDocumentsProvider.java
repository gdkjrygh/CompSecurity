// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driverdocuments;

import me.lyft.android.domain.driverdocuments.DriverDocumentsMapper;
import me.lyft.android.domain.driverdocuments.Inspection;
import me.lyft.android.domain.driverdocuments.Insurance;
import me.lyft.android.domain.driverdocuments.Registration;
import me.lyft.android.persistence.driverdocuments.IDriverDocumentsStorage;

// Referenced classes of package me.lyft.android.application.driverdocuments:
//            IDriverDocumentsProvider

public class DriverDocumentsProvider
    implements IDriverDocumentsProvider
{

    private IDriverDocumentsStorage driverDocumentsStorage;

    public DriverDocumentsProvider(IDriverDocumentsStorage idriverdocumentsstorage)
    {
        driverDocumentsStorage = idriverdocumentsstorage;
    }

    public Inspection getInspection()
    {
        return DriverDocumentsMapper.fromInspectionDTO(driverDocumentsStorage.getInspection());
    }

    public Insurance getInsurance()
    {
        return DriverDocumentsMapper.fromInsuranceDTO(driverDocumentsStorage.getInsurance());
    }

    public Registration getRegistration()
    {
        return DriverDocumentsMapper.fromRegistrationDTO(driverDocumentsStorage.getRegistration());
    }
}
