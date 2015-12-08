// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;


public interface OrbitPushNotificationsInterface
{

    public abstract void registerGcmDevice(String s);

    public abstract void setPreviousGcmRegistrationId(String s);
}
