// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driverdocuments;

import java.text.DateFormat;
import me.lyft.android.common.DateUtils;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.lyft.driverdocuments.InspectionDTO;
import me.lyft.android.infrastructure.lyft.driverdocuments.InsuranceDTO;
import me.lyft.android.infrastructure.lyft.driverdocuments.RegistrationDTO;

// Referenced classes of package me.lyft.android.domain.driverdocuments:
//            Inspection, Insurance, Registration

public class DriverDocumentsMapper
{

    private static final DateFormat DATE_FORMAT = DateUtils.createDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    public DriverDocumentsMapper()
    {
    }

    public static InspectionDTO fromInspection(Inspection inspection)
    {
        return new InspectionDTO(inspection.getPhotoUrl(), inspection.getPhotoUploadUrl());
    }

    public static Inspection fromInspectionDTO(InspectionDTO inspectiondto)
    {
        if (inspectiondto == null)
        {
            return Inspection.NullInspection.getInstance();
        } else
        {
            return new Inspection(Strings.nullToEmpty(inspectiondto.getPhotoUrl()), Strings.nullToEmpty(inspectiondto.getPhotoUploadUrl()));
        }
    }

    public static InsuranceDTO fromInsurance(Insurance insurance)
    {
        DriverDocument.Status status = insurance.getStatus();
        String s = null;
        if (status != null)
        {
            s = status.toString().toLowerCase();
        }
        return new InsuranceDTO(s, insurance.getState(), DATE_FORMAT.format(insurance.getExpirationDate()), insurance.getPhotoUrl(), insurance.getPhotoUploadUrl());
    }

    public static Insurance fromInsuranceDTO(InsuranceDTO insurancedto)
    {
        if (insurancedto == null)
        {
            return Insurance.NullInsurance.getInstance();
        } else
        {
            return new Insurance(Strings.nullToEmpty(insurancedto.getPhotoUrl()), Strings.nullToEmpty(insurancedto.getPhotoUploadUrl()), Strings.nullToEmpty(insurancedto.getStatus()).toUpperCase(), Strings.nullToEmpty(insurancedto.getState()), insurancedto.getExpirationDate());
        }
    }

    public static RegistrationDTO fromRegistration(Registration registration)
    {
        return new RegistrationDTO(registration.getPhotoUrl(), registration.getPhotoUploadUrl());
    }

    public static Registration fromRegistrationDTO(RegistrationDTO registrationdto)
    {
        if (registrationdto == null)
        {
            return Registration.NullRegistration.getInstance();
        } else
        {
            return new Registration(Strings.nullToEmpty(registrationdto.getPhotoUrl()), Strings.nullToEmpty(registrationdto.getPhotoUploadUrl()));
        }
    }

}
