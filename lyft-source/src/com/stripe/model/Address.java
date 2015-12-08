// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject

public final class Address extends StripeObject
{

    protected String city;
    protected String country;
    protected String line1;
    protected String line2;
    protected String postalCode;
    protected String state;

    public Address()
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
            obj = (Address)obj;
            if (city == null ? ((Address) (obj)).city != null : !city.equals(((Address) (obj)).city))
            {
                return false;
            }
            if (country == null ? ((Address) (obj)).country != null : !country.equals(((Address) (obj)).country))
            {
                return false;
            }
            if (line1 == null ? ((Address) (obj)).line1 != null : !line1.equals(((Address) (obj)).line1))
            {
                return false;
            }
            if (line2 == null ? ((Address) (obj)).line2 != null : !line2.equals(((Address) (obj)).line2))
            {
                return false;
            }
            if (postalCode == null ? ((Address) (obj)).postalCode != null : !postalCode.equals(((Address) (obj)).postalCode))
            {
                return false;
            }
            if (state == null ? ((Address) (obj)).state != null : !state.equals(((Address) (obj)).state))
            {
                return false;
            }
        }
        return true;
    }

    public String getCity()
    {
        return city;
    }

    public String getCountry()
    {
        return country;
    }

    public String getLine1()
    {
        return line1;
    }

    public String getLine2()
    {
        return line2;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public String getState()
    {
        return state;
    }

    public int hashCode()
    {
        int j1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (line1 != null)
        {
            i = line1.hashCode();
        } else
        {
            i = 0;
        }
        if (city != null)
        {
            j = city.hashCode();
        } else
        {
            j = 0;
        }
        if (country != null)
        {
            k = country.hashCode();
        } else
        {
            k = 0;
        }
        if (line2 != null)
        {
            l = line2.hashCode();
        } else
        {
            l = 0;
        }
        if (postalCode != null)
        {
            i1 = postalCode.hashCode();
        } else
        {
            i1 = 0;
        }
        if (state != null)
        {
            j1 = state.hashCode();
        }
        return (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31 + j1;
    }

    public Address setCity(String s)
    {
        city = s;
        return this;
    }

    public Address setCountry(String s)
    {
        country = s;
        return this;
    }

    public Address setLine1(String s)
    {
        line1 = s;
        return this;
    }

    public Address setLine2(String s)
    {
        line2 = s;
        return this;
    }

    public Address setPostalCode(String s)
    {
        postalCode = s;
        return this;
    }

    public Address setState(String s)
    {
        state = s;
        return this;
    }
}
