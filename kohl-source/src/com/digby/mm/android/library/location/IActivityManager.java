// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.location;


// Referenced classes of package com.digby.mm.android.library.location:
//            IMonitorable

public interface IActivityManager
    extends com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, IMonitorable
{

    public static final String ACTION_ACTION_DETECTED = "Action_Action_Detected";
    public static final long ACTION_DETECTION_INTERVAL_MILLIS = 10000L;

    public abstract void startMonitoring();

    public abstract void stopMontioring();
}
