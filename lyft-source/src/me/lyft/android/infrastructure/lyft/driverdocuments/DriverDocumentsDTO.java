// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.driverdocuments;

import java.util.Date;

// Referenced classes of package me.lyft.android.infrastructure.lyft.driverdocuments:
//            InspectionDTO, InsuranceDTO, RegistrationDTO

public class DriverDocumentsDTO
{

    public final InspectionDTO inspection;
    public final InsuranceDTO insurance;
    public final Date lastUpdated;
    public final RegistrationDTO registration;

    public DriverDocumentsDTO(Date date, InsuranceDTO insurancedto, InspectionDTO inspectiondto, RegistrationDTO registrationdto)
    {
        lastUpdated = date;
        insurance = insurancedto;
        inspection = inspectiondto;
        registration = registrationdto;
    }
}
