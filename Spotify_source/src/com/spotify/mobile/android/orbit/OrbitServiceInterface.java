// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;

import com.spotify.cosmos.router.NativeRouter;
import com.spotify.mobile.android.core.internal.ConnectivitySetter;

// Referenced classes of package com.spotify.mobile.android.orbit:
//            OrbitPlayerInterface, OrbitProviderInterface, OrbitPushNotificationsInterface, OrbitSessionInterface, 
//            OrbitServiceObserver, OrbitProviderObserver

public interface OrbitServiceInterface
    extends ConnectivitySetter
{

    public abstract void crash();

    public abstract void destroy();

    public abstract OrbitPlayerInterface getOrbitPlayer();

    public abstract OrbitProviderInterface getOrbitProvider();

    public abstract OrbitPushNotificationsInterface getOrbitPushNotifications();

    public abstract OrbitSessionInterface getOrbitSession();

    public abstract boolean hasBananaFlavour();

    public abstract void setConnectivityType(int i, boolean flag);

    public abstract void setObserver(OrbitServiceObserver orbitserviceobserver);

    public abstract void start(String s, String s1, String s2, boolean flag, boolean flag1, NativeRouter nativerouter, OrbitProviderObserver orbitproviderobserver);

    public abstract void stop();
}
