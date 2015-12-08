// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;


interface 
    extends me.lyft.android.ui.stRideViewV2
{

    public abstract String getWebDialogParams();

    public abstract boolean isSwitchToDriverMode();

    public abstract void resetSwitchToDriverMode();

    public abstract void resetWebDialogParams();

    public abstract void showStep(me.lyft.android.domain.ride.wV2 wv2);
}
