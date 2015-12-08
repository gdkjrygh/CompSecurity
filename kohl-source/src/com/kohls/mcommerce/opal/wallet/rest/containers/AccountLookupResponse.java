// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import java.io.Serializable;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.rest.containers:
//            WalletBaseResponse

public class AccountLookupResponse extends WalletBaseResponse
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String emailId;
    private String firstName;
    private String lastName;
    private String loyaltyId;

    public AccountLookupResponse()
    {
    }

    public String getEmailId()
    {
        return emailId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getLoyaltyId()
    {
        return loyaltyId;
    }

    public void setEmailId(String s)
    {
        emailId = s;
    }

    public void setFirstName(String s)
    {
        firstName = s;
    }

    public void setLastName(String s)
    {
        lastName = s;
    }

    public void setLoyaltyId(String s)
    {
        loyaltyId = s;
    }
}
