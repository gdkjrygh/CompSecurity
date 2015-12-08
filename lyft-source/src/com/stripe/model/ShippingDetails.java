// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject, Address

public final class ShippingDetails extends StripeObject
{

    protected Address address;
    protected String name;
    protected String phone;

    public ShippingDetails()
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
            obj = (ShippingDetails)obj;
            if (address == null ? ((ShippingDetails) (obj)).address != null : !address.equals(((ShippingDetails) (obj)).address))
            {
                return false;
            }
            if (name == null ? ((ShippingDetails) (obj)).name != null : !name.equals(((ShippingDetails) (obj)).name))
            {
                return false;
            }
            if (phone == null ? ((ShippingDetails) (obj)).phone != null : !phone.equals(((ShippingDetails) (obj)).phone))
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

    public String getName()
    {
        return name;
    }

    public String getPhone()
    {
        return phone;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (address != null)
        {
            i = address.hashCode();
        } else
        {
            i = 0;
        }
        if (name != null)
        {
            j = name.hashCode();
        } else
        {
            j = 0;
        }
        if (phone != null)
        {
            k = phone.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    public void setAddress(Address address1)
    {
        address = address1;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPhone(String s)
    {
        phone = s;
    }
}
