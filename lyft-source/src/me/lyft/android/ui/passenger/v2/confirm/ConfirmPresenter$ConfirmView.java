// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.confirm;


interface estRideStepView
    extends me.lyft.android.ui.passenger.v2.BaseRequestRideStepView
{

    public abstract void setDestinationAddress(String s);

    public abstract void setDestinationAddressLoading();

    public abstract void setDestinationAddressUnavailable();

    public abstract void setPickupAddress(String s);

    public abstract void setPickupAddressLoading();

    public abstract void setPickupAddressUnavailable();

    public abstract void setRequestButtonBackground(String s, String s1);

    public abstract void setRequestButtonText(String s);

    public abstract void showCancelOption(boolean flag);
}
