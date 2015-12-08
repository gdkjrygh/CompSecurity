// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.pickup;


interface estRideStepView
    extends me.lyft.android.ui.passenger.v2.aseRequestRideStepView
{

    public abstract void setPickupAddress(String s);

    public abstract void setPickupAddressLoading();

    public abstract void setPickupAddressUnavailable();

    public abstract void showDriverModeToggle(boolean flag);

    public abstract void showInviteFriendsToolbarItem(boolean flag);

    public abstract void showSwitchToDriverToolbarItem(boolean flag);
}
