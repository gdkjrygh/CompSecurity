// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject

public class  extends StripeObject
{

    Integer day;
    Integer month;
    Integer year;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = ()obj;
            if (!equals(day, ((day) (obj)).day) || !equals(month, ((month) (obj)).month) || !equals(year, ((year) (obj)).year))
            {
                return false;
            }
        }
        return true;
    }

    public Integer getDay()
    {
        return day;
    }

    public Integer getMonth()
    {
        return month;
    }

    public Integer getYear()
    {
        return year;
    }

    public ()
    {
    }
}
