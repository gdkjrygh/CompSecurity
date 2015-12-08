// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.destination;


interface 
    extends me.lyft.android.ui.passenger.v2.ConfirmView
{

    public abstract void setDestinationAddress(String s);

    public abstract void setDestinationAddressLoading();

    public abstract void setDestinationAddressUnavailable();

    public abstract void setPickupAddress(String s);

    public abstract void setPickupAddressLoading();

    public abstract void setPickupAddressUnavailable();

    public abstract void showCancelToolbarItem(boolean flag);
}
