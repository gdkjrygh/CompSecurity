// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.rest.containers:
//            Address, Customer

public class ProfileData
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private Address address;
    private String birthday;
    private Customer customerName;
    private boolean donationEligibilityFlag;
    private String earningPeriod;
    private String email;
    private List kohlsCashCoupons;
    private String lifeTimePoints;
    private String loyaltyId;
    private String memberSince;
    private String phoneNumber;
    private String phoneNumberType;
    private String pointBalance;
    private String pointThreshold;
    private String postalCode;
    private List rewards;
    private List transactions;

    public ProfileData()
    {
    }

    public Address getAddress()
    {
        return address;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public Customer getCustomerName()
    {
        return customerName;
    }

    public String getEarningPeriod()
    {
        if (!TextUtils.isEmpty(earningPeriod))
        {
            if (earningPeriod.equalsIgnoreCase("null"))
            {
                return "";
            } else
            {
                return earningPeriod;
            }
        } else
        {
            return earningPeriod;
        }
    }

    public String getEmail()
    {
        return email;
    }

    public List getKohlsCashCoupons()
    {
        return kohlsCashCoupons;
    }

    public String getLifeTimePoints()
    {
        return lifeTimePoints;
    }

    public String getLoyaltyId()
    {
        return loyaltyId;
    }

    public String getMemberSince()
    {
        if (!TextUtils.isEmpty(memberSince))
        {
            if (memberSince.equalsIgnoreCase("null"))
            {
                return "";
            } else
            {
                return memberSince;
            }
        } else
        {
            return memberSince;
        }
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getPhoneNumberType()
    {
        return phoneNumberType;
    }

    public String getPointBalance()
    {
        return pointBalance;
    }

    public String getPointThreshold()
    {
        return pointThreshold;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public List getRewards()
    {
        return rewards;
    }

    public List getTransactions()
    {
        return transactions;
    }

    public boolean isDonationEligibilityFlag()
    {
        return donationEligibilityFlag;
    }

    public void setAddress(Address address1)
    {
        address = address1;
    }

    public void setBirthday(String s)
    {
        birthday = s;
    }

    public void setCustomerName(Customer customer)
    {
        customerName = customer;
    }

    public void setDonationEligibilityFlag(boolean flag)
    {
        donationEligibilityFlag = flag;
    }

    public void setEarningPeriod(String s)
    {
        earningPeriod = s;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setKohlsCashCoupons(List list)
    {
        kohlsCashCoupons = list;
    }

    public void setLifeTimePoints(String s)
    {
        lifeTimePoints = s;
    }

    public void setLoyaltyId(String s)
    {
        loyaltyId = s;
    }

    public void setMemberSince(String s)
    {
        memberSince = s;
    }

    public void setPhoneNumber(String s)
    {
        phoneNumber = s;
    }

    public void setPhoneNumberType(String s)
    {
        phoneNumberType = s;
    }

    public void setPointBalance(String s)
    {
        pointBalance = s;
    }

    public void setPointThreshold(String s)
    {
        pointThreshold = s;
    }

    public void setPostalCode(String s)
    {
        postalCode = s;
    }

    public void setRewards(List list)
    {
        rewards = list;
    }

    public void setTransactions(List list)
    {
        transactions = list;
    }
}
