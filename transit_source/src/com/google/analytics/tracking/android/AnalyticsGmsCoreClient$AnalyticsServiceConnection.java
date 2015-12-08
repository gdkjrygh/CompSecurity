// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

// Referenced classes of package com.google.analytics.tracking.android:
//            AnalyticsGmsCoreClient, Log

final class this._cls0
    implements ServiceConnection
{

    final AnalyticsGmsCoreClient this$0;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Log.dDebug((new StringBuilder()).append("service connected, binder: ").append(ibinder).toString());
        try
        {
            if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
            {
                Log.dDebug("bound to service");
                AnalyticsGmsCoreClient.access$002(AnalyticsGmsCoreClient.this, com.google.android.gms.analytics.internal.._mth0(ibinder));
                AnalyticsGmsCoreClient.access$100(AnalyticsGmsCoreClient.this);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        AnalyticsGmsCoreClient.access$200(AnalyticsGmsCoreClient.this).unbindService(this);
        AnalyticsGmsCoreClient.access$302(AnalyticsGmsCoreClient.this, null);
        AnalyticsGmsCoreClient.access$400(AnalyticsGmsCoreClient.this).onConnectionFailed(2, null);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        Log.dDebug((new StringBuilder()).append("service disconnected: ").append(componentname).toString());
        AnalyticsGmsCoreClient.access$302(AnalyticsGmsCoreClient.this, null);
        AnalyticsGmsCoreClient.access$500(AnalyticsGmsCoreClient.this).nnected();
    }

    ()
    {
        this$0 = AnalyticsGmsCoreClient.this;
        super();
    }
}
