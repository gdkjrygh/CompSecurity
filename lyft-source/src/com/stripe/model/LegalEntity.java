// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import java.util.List;

// Referenced classes of package com.stripe.model:
//            StripeObject, Address

public class LegalEntity extends StripeObject
{

    List additionalOwners;
    Address address;
    String businessName;
    DateOfBirth dob;
    String firstName;
    String lastName;
    Address personalAddress;
    String type;
    Verification verification;

    public LegalEntity()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LegalEntity)obj;
            if (!equals(type, ((LegalEntity) (obj)).type) || !equals(address, ((LegalEntity) (obj)).address) || !equals(businessName, ((LegalEntity) (obj)).businessName) || !equals(dob, ((LegalEntity) (obj)).dob) || !equals(firstName, ((LegalEntity) (obj)).firstName) || !equals(lastName, ((LegalEntity) (obj)).lastName) || !equals(personalAddress, ((LegalEntity) (obj)).personalAddress) || !equals(verification, ((LegalEntity) (obj)).verification) || !equals(additionalOwners, ((LegalEntity) (obj)).additionalOwners))
            {
                return false;
            }
        }
        return true;
    }

    public List getAdditionalOwners()
    {
        return additionalOwners;
    }

    public Address getAddress()
    {
        return address;
    }

    public String getBusinessName()
    {
        return businessName;
    }

    public DateOfBirth getDob()
    {
        return dob;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Address getPersonalAddress()
    {
        return personalAddress;
    }

    public String getType()
    {
        return type;
    }

    public Verification getVerification()
    {
        return verification;
    }
}
