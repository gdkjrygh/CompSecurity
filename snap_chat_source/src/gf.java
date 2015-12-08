// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class gf extends kl
{

    public Double cashAmount;
    public String cashCurrency;
    private final String eventName = "CASH_PAYMENT_SENT";

    public gf()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "CASH_PAYMENT_SENT");
        if (cashAmount != null)
        {
            hashmap.put("cash_amount", cashAmount);
        }
        if (cashCurrency != null)
        {
            hashmap.put("cash_currency", cashCurrency);
        }
        hashmap.putAll(super.a());
        return hashmap;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            obj = (gf)obj;
            if (cashAmount == null ? ((gf) (obj)).cashAmount != null : !cashAmount.equals(((gf) (obj)).cashAmount))
            {
                return false;
            }
            if (cashCurrency == null ? ((gf) (obj)).cashCurrency != null : !cashCurrency.equals(((gf) (obj)).cashCurrency))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int k = super.hashCode();
        int i;
        if (cashAmount != null)
        {
            i = cashAmount.hashCode();
        } else
        {
            i = 0;
        }
        if (cashCurrency != null)
        {
            j = cashCurrency.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }
}
