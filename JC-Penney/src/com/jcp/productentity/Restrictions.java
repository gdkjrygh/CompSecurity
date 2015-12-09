// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.io.Serializable;

public class Restrictions
    implements Serializable
{

    private boolean internationalShippingAllowed;
    private String maxQuantity;
    private boolean reviewsAllowed;
    private boolean socialShareAllowed;

    public Restrictions()
    {
    }

    public String getMaxQuantity()
    {
        return maxQuantity;
    }

    public boolean isInternationalShippingAllowed()
    {
        return internationalShippingAllowed;
    }

    public boolean isReviewsAllowed()
    {
        return reviewsAllowed;
    }

    public boolean isSocialShareAllowed()
    {
        return socialShareAllowed;
    }

    public void setInternationalShippingAllowed(boolean flag)
    {
        internationalShippingAllowed = flag;
    }

    public void setMaxQuantity(String s)
    {
        maxQuantity = s;
    }

    public void setReviewsAllowed(boolean flag)
    {
        reviewsAllowed = flag;
    }

    public void setSocialShareAllowed(boolean flag)
    {
        socialShareAllowed = flag;
    }
}
