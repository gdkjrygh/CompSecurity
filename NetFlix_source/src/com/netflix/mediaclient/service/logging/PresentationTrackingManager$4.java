// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.presentation.PresentationRequest;
import com.netflix.mediaclient.service.logging.presentation.PresentationWebClient;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            PresentationTrackingManager

class val.deliveryRequestId
    implements com.netflix.mediaclient.util.data.ack
{

    final PresentationTrackingManager this$0;
    final String val$deliveryRequestId;

    public void onDataLoaded(String s, byte abyte0[], long l)
    {
        if (abyte0 == null || abyte0.length < 1)
        {
            Log.e("nf_presentation", "We failed to retrieve payload. Trying to delete it");
            PresentationTrackingManager.access$500(PresentationTrackingManager.this, val$deliveryRequestId);
            return;
        }
        s = new PresentationRequest();
        try
        {
            abyte0 = new String(abyte0, "utf-8");
            s.initFromString(abyte0);
            PresentationTrackingManager.access$600(PresentationTrackingManager.this).sendPresentationEvents(val$deliveryRequestId, s, new esentationWebCallbackImpl(PresentationTrackingManager.this, abyte0));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_presentation", "Failed to send events. Try to delete it.", s);
        }
        PresentationTrackingManager.access$500(PresentationTrackingManager.this, val$deliveryRequestId);
    }

    ient()
    {
        this$0 = final_presentationtrackingmanager;
        val$deliveryRequestId = String.this;
        super();
    }
}
