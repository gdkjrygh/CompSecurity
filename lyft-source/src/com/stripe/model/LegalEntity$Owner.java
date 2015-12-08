// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject, Address

public class cation extends StripeObject
{

    Address address;
    Birth dob;
    String firstName;
    String lastName;
    cation verification;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (cation)obj;
            if (!equals(address, ((address) (obj)).address) || !equals(dob, ((dob) (obj)).dob) || !equals(firstName, ((firstName) (obj)).firstName) || !equals(lastName, ((lastName) (obj)).lastName) || !equals(verification, ((verification) (obj)).verification))
            {
                return false;
            }
        }
        return true;
    }

    public Address getAddress()
    {
        return address;
    }

    public Birth getDob()
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

    public cation getVerification()
    {
        return verification;
    }

    public cation()
    {
    }
}
