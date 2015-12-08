// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;


// Referenced classes of package com.spotify.mobile.android.orbit:
//            OrbitPushNotificationsInterface

public final class OrbitPushNotifications
    implements OrbitPushNotificationsInterface
{

    private long nOrbitPushNotificationsPtr;

    private OrbitPushNotifications()
    {
    }

    public final native void registerGcmDevice(String s);

    public final native void setPreviousGcmRegistrationId(String s);
}
