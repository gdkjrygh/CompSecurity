// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class gg extends kl
{

    public Double cashAmount;
    public String cashCurrency;
    private final String eventName = "CASH_SNAP_REPLAY_PAYMENT_SUCCESS";
    public hS product;

    public gg()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "CASH_SNAP_REPLAY_PAYMENT_SUCCESS");
        if (cashAmount != null)
        {
            hashmap.put("cash_amount", cashAmount);
        }
        if (cashCurrency != null)
        {
            hashmap.put("cash_currency", cashCurrency);
        }
        if (product != null)
        {
            hashmap.put("product", product);
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
            obj = (gg)obj;
            if (cashAmount == null ? ((gg) (obj)).cashAmount != null : !cashAmount.equals(((gg) (obj)).cashAmount))
            {
                return false;
            }
            if (cashCurrency == null ? ((gg) (obj)).cashCurrency != null : !cashCurrency.equals(((gg) (obj)).cashCurrency))
            {
                return false;
            }
            if (product == null ? ((gg) (obj)).product != null : !product.equals(((gg) (obj)).product))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k = 0;
        int l = super.hashCode();
        int i;
        int j;
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
        } else
        {
            j = 0;
        }
        if (product != null)
        {
            k = product.hashCode();
        }
        return (j + (i + l * 31) * 31) * 31 + k;
    }
}
