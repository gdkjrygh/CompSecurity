// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core;


// Referenced classes of package com.digby.localpoint.sdk.core:
//            ILPDevice, ILPLocationProvider, ILPMessageProvider, ILPVersion, 
//            ILPUser, ILPLocalNotificationListener

public interface ILPLocalpointService
{

    public abstract ILPDevice getDevice();

    public abstract ILPLocationProvider getLocationProvider();

    public abstract ILPMessageProvider getMessageProvider();

    public abstract ILPVersion getSDKVersion();

    public abstract ILPUser getUser();

    public abstract boolean isBrandEnabled();

    public abstract void setLocalNotificationListener(ILPLocalNotificationListener ilplocalnotificationlistener);

    public abstract void start();

    public abstract void stop();
}
