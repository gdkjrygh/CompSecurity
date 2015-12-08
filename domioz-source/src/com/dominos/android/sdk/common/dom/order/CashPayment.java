// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.order;

import com.google.a.b.av;
import java.util.Map;
import org.a.a.a.a.b;
import org.a.a.a.a.c;
import org.a.a.a.a.f;

// Referenced classes of package com.dominos.android.sdk.common.dom.order:
//            Payment

public class CashPayment extends Payment
{

    private double amount;

    private CashPayment(double d)
    {
        amount = d;
    }

    CashPayment(double d, _cls1 _pcls1)
    {
        this(d);
    }

    public boolean equals(Object obj)
    {
        return b.a(this, obj);
    }

    public double getAmount()
    {
        return amount;
    }

    public int hashCode()
    {
        return c.a(this);
    }

    public CashPayment setAmount(double d)
    {
        amount = d;
        return this;
    }

    public volatile Payment setAmount(double d)
    {
        return setAmount(d);
    }

    public Map toMap()
    {
        return av.a("Type", "Cash", "Amount", Double.valueOf(amount));
    }

    public String toString()
    {
        return f.a(this);
    }
}
