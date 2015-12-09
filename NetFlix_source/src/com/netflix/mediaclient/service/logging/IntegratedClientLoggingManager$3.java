// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.ClientLoggingWebClient;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            IntegratedClientLoggingManager

class val.deliveryRequestId
    implements com.netflix.mediaclient.util.data.
{

    final IntegratedClientLoggingManager this$0;
    final String val$deliveryRequestId;

    public void onDataLoaded(String s, byte abyte0[], long l)
    {
        if (abyte0 == null || abyte0.length < 1)
        {
            Log.e("nf_log", "We failed to retrieve payload. Trying to delete it");
            IntegratedClientLoggingManager.access$400(IntegratedClientLoggingManager.this, val$deliveryRequestId);
            return;
        }
        try
        {
            s = new String(abyte0, "utf-8");
            IntegratedClientLoggingManager.access$500(IntegratedClientLoggingManager.this).sendLoggingEvents(val$deliveryRequestId, s, new ientLoggingWebCallbackImpl(IntegratedClientLoggingManager.this, s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_log", "Failed to send events. Try to delete it.", s);
        }
        IntegratedClientLoggingManager.access$400(IntegratedClientLoggingManager.this, val$deliveryRequestId);
    }

    ientLoggingWebCallbackImpl()
    {
        this$0 = final_integratedclientloggingmanager;
        val$deliveryRequestId = String.this;
        super();
    }
}
