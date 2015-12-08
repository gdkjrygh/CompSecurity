// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.work;


// Referenced classes of package me.lyft.android.infrastructure.lyft.work:
//            OrganizationBenefitDetailsDTO, OrganizationBenefitStatusDTO, OrganizationJoinDetailsDTO, OrganizationPromotionDetailsDTO, 
//            OrganizationPromotionStatusDTO, OrganizationUnverifiedDetailsDTO

public class OrganizationDTO
{

    public static final String STATUS_APPROVED = "approved";
    public static final String STATUS_UNAPPROVED = "unapproved";
    public static final String STATUS_UNVERIFIED = "unverified";
    public final OrganizationBenefitDetailsDTO benefitDetails;
    public final OrganizationBenefitStatusDTO benefitStatus;
    public final String email;
    public final OrganizationJoinDetailsDTO joinDetails;
    public final String name;
    public final OrganizationPromotionDetailsDTO promotionDetails;
    public final OrganizationPromotionStatusDTO promotionStatus;
    public final String status;
    public final OrganizationUnverifiedDetailsDTO unverifiedDetails;

    public OrganizationDTO(String s, String s1, String s2, OrganizationPromotionStatusDTO organizationpromotionstatusdto, OrganizationPromotionDetailsDTO organizationpromotiondetailsdto, OrganizationBenefitDetailsDTO organizationbenefitdetailsdto, OrganizationBenefitStatusDTO organizationbenefitstatusdto, 
            OrganizationJoinDetailsDTO organizationjoindetailsdto, OrganizationUnverifiedDetailsDTO organizationunverifieddetailsdto)
    {
        name = s;
        email = s1;
        status = s2;
        promotionStatus = organizationpromotionstatusdto;
        promotionDetails = organizationpromotiondetailsdto;
        benefitDetails = organizationbenefitdetailsdto;
        benefitStatus = organizationbenefitstatusdto;
        joinDetails = organizationjoindetailsdto;
        unverifiedDetails = organizationunverifieddetailsdto;
    }

    public OrganizationBenefitDetailsDTO getBenefitDetails()
    {
        return benefitDetails;
    }

    public OrganizationBenefitStatusDTO getBenefitStatus()
    {
        return benefitStatus;
    }

    public String getEmail()
    {
        return email;
    }

    public OrganizationJoinDetailsDTO getJoinDetails()
    {
        return joinDetails;
    }

    public String getName()
    {
        return name;
    }

    public OrganizationPromotionDetailsDTO getPromotionDetails()
    {
        return promotionDetails;
    }

    public OrganizationPromotionStatusDTO getPromotionStatus()
    {
        return promotionStatus;
    }

    public String getStatus()
    {
        return status;
    }

    public OrganizationUnverifiedDetailsDTO getUnverifiedDetails()
    {
        return unverifiedDetails;
    }
}
