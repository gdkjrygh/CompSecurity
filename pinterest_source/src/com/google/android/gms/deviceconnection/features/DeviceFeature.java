// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.deviceconnection.features;


public interface DeviceFeature
{

    public abstract String getFeatureName();

    public abstract long getLastConnectionTimestampMillis();
}
