// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.quantcast.measurement.service:
//            QCLog

public class QCReferrerReceiver extends BroadcastReceiver
{

    private static final QCLog.Tag TAG = new QCLog.Tag(com/quantcast/measurement/service/QCReferrerReceiver);
    protected static String referrer;

    public QCReferrerReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Bundle bundle = intent.getExtras();
        if (bundle != null)
        {
            referrer = bundle.getString("referrer");
        }
        QCLog.i(TAG, (new StringBuilder()).append("Referrer is: ").append(referrer).toString());
        Object obj = context.getPackageManager();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        obj = ((PackageManager) (obj)).getReceiverInfo(new ComponentName(context, "com.quantcast.measurement.service.QCReferrerReceiver"), 128);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        obj = ((ActivityInfo) (obj)).metaData;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        Iterator iterator = ((Bundle) (obj)).keySet().iterator();
_L1:
        String s;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_210;
        }
        s = ((Bundle) (obj)).getString((String)iterator.next());
        ((BroadcastReceiver)Class.forName(s).newInstance()).onReceive(context, intent);
        QCLog.i(TAG, (new StringBuilder()).append("PASS REFERRER TO...").append(s).toString());
          goto _L1
        Exception exception;
        exception;
        QCLog.e(TAG, (new StringBuilder()).append("Error when passing to referrer.  Class might not exist: ").append(s).toString(), exception);
          goto _L1
        context;
        QCLog.e(TAG, "Could not find package Name for referrer", context);
    }

}
