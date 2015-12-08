// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.ats;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;

public class DriverApplicationDTO
    implements INullable
{

    public static final String REFERRAL_CODE_FIELD = "referralCode";
    String phone;
    String referralCode;
    String region;
    String self;
    Integer webOnboardingCompleteness;

    public DriverApplicationDTO(String s)
    {
        self = s;
    }

    public static DriverApplicationDTO empty()
    {
        return NullDriverApplicationDTO.getInstance();
    }

    public String getReferralCode()
    {
        return referralCode;
    }

    public String getRegion()
    {
        return region;
    }

    public String getSelf()
    {
        return self;
    }

    public Integer getWebOnboardingCompleteness()
    {
        return (Integer)Objects.firstNonNull(webOnboardingCompleteness, Integer.valueOf(0));
    }

    public boolean isNull()
    {
        return false;
    }

    public boolean isWebOnboardingComplete()
    {
        return getWebOnboardingCompleteness().intValue() == 100;
    }

    public void setPhone(String s)
    {
        phone = s;
    }

    public void setReferralCode(String s)
    {
        referralCode = s;
    }

    public void setRegion(String s)
    {
        region = s;
    }

    private class NullDriverApplicationDTO extends DriverApplicationDTO
    {

        private static final DriverApplicationDTO INSTANCE = new NullDriverApplicationDTO();

        public static DriverApplicationDTO getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        private NullDriverApplicationDTO()
        {
            super(null);
        }
    }

}
