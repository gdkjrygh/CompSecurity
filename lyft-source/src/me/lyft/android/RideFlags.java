// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;


public class RideFlags
{

    boolean dropoffMessageShown;
    boolean hasAutoSwitchedback;
    boolean pickupConfirmationDialogShown;
    boolean pickupMessageShown;

    public RideFlags()
    {
    }

    public boolean hasAutoSwitchedBack()
    {
        return hasAutoSwitchedback;
    }

    public boolean isDropoffMessageShown()
    {
        return dropoffMessageShown;
    }

    public boolean isPickupConfirmationDialogShown()
    {
        return pickupConfirmationDialogShown;
    }

    public boolean isPickupMessageShown()
    {
        return pickupMessageShown;
    }

    public void setDropoffMessageShown(boolean flag)
    {
        dropoffMessageShown = flag;
    }

    public void setHasAutoSwitchedback(boolean flag)
    {
        hasAutoSwitchedback = flag;
    }

    public void setPickupConfirmationDialogShown(boolean flag)
    {
        pickupConfirmationDialogShown = flag;
    }

    public void setPickupMessageShown(boolean flag)
    {
        pickupMessageShown = flag;
    }
}
