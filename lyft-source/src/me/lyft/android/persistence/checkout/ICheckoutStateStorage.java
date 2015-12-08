// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence.checkout;


public interface ICheckoutStateStorage
{

    public abstract String getSelectedChargeAccountId();

    public abstract String getSelectedCouponId();

    public abstract int getSelectedTip();

    public abstract void reset();

    public abstract void setSelectedChargeAccountId(String s);

    public abstract void setSelectedCouponId(String s);

    public abstract void setSelectedTip(int i);
}
