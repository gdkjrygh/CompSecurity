// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place;

import android.location.Location;

public interface 
{

    public abstract void onGPSLocationUpdate(Location location);

    public abstract void onNetworkLocationUpdate(Location location);
}
