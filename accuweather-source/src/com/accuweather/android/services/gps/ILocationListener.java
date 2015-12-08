// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.gps;

import android.location.Location;

public interface ILocationListener
{

    public abstract void onLocationChanged(double d, double d1);

    public abstract void onLocationChanged(Location location);

    public abstract void onLocationFixError(Exception exception);
}
