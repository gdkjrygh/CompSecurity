// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import me.lyft.android.domain.payment.Money;

interface 
    extends me.lyft.android.ui.senter.FixedFareView
{

    public abstract void setComparisonLabel(Money money, String s);

    public abstract void setFarePrice(Money money);

    public abstract void setLoading(boolean flag);

    public abstract void showComparisonLabel(boolean flag);
}
