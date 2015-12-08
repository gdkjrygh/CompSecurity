// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push.common;

import android.os.AsyncTask;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.worklight.common.Logger;
import java.io.IOException;

// Referenced classes of package com.worklight.wlclient.push.common:
//            GCMAPIClient, GCMRegistrationListener, GCMRetryWorker

class Listener extends AsyncTask
{

    final GCMAPIClient this$0;
    final String val$gcmSenderId;
    final GCMRegistrationListener val$listener;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        avoid = GCMAPIClient.access$200(GCMAPIClient.this).register(new String[] {
            val$gcmSenderId
        });
        val$listener.getGcmRetryWorker().resetBackOff();
        GCMAPIClient.access$000().debug((new StringBuilder()).append("Successfully registered with GCM using Google Play Services. Returned deviceToken:").append(avoid).toString());
        val$listener.sendToken(avoid);
        GCMAPIClient.access$200(GCMAPIClient.this).close();
_L2:
        return null;
        avoid;
        String s = (new StringBuilder()).append("Error :").append(avoid.getMessage()).toString();
        GCMAPIClient.access$000().error((new StringBuilder()).append("Failed to register with GCM using Google Play Services. Error:").append(s).toString());
        if (val$listener.getGcmRetryWorker().isErrorRetriable(avoid.getMessage()))
        {
            break; /* Loop/switch isn't completed */
        }
        val$listener.sendErrorMsg(s, false);
_L3:
        GCMAPIClient.access$200(GCMAPIClient.this).close();
        if (true) goto _L2; else goto _L1
_L1:
        val$listener.getGcmRetryWorker().scheduleRetry();
          goto _L3
        avoid;
        GCMAPIClient.access$200(GCMAPIClient.this).close();
        throw avoid;
    }

    Listener()
    {
        this$0 = final_gcmapiclient;
        val$gcmSenderId = s;
        val$listener = GCMRegistrationListener.this;
        super();
    }
}
