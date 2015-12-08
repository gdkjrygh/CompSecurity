// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.util;


public interface BeaconConfigurationPreferences
{

    public abstract int beaconVersionCode();

    public abstract boolean enableAllStores();

    public abstract int geoFenceRadius();

    public abstract long lastGefenceSetTime();

    public abstract String lastGefenceSetZipcode();

    public abstract int scanDelayInterval();

    public abstract int scanDuration();

    public abstract String storeLocationInfo();

    public abstract boolean tabletSupported();
}
