// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence.driverdocuments;

import me.lyft.android.infrastructure.lyft.driverdocuments.DriverDocumentsDTO;
import me.lyft.android.infrastructure.lyft.driverdocuments.InspectionDTO;
import me.lyft.android.infrastructure.lyft.driverdocuments.InsuranceDTO;
import me.lyft.android.infrastructure.lyft.driverdocuments.RegistrationDTO;

public interface IDriverDocumentsStorage
{

    public abstract InspectionDTO getInspection();

    public abstract InsuranceDTO getInsurance();

    public abstract long getLastCachedDriverDocuments();

    public abstract RegistrationDTO getRegistration();

    public abstract void reset();

    public abstract void setDriverDocuments(DriverDocumentsDTO driverdocumentsdto);
}
