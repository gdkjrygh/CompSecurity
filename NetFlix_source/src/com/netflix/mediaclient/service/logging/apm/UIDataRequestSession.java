// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm;

import com.netflix.mediaclient.service.logging.apm.model.UIDataRequestSessionEndedEvent;
import com.netflix.mediaclient.service.logging.client.model.Error;
import com.netflix.mediaclient.service.logging.client.model.HttpResponse;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm:
//            BaseApmSession

public final class UIDataRequestSession extends BaseApmSession
{

    public static final String NAME = "uiDataRequest";
    private String mRequestId;
    private String mUrl;

    public UIDataRequestSession(String s, String s1)
    {
        mUrl = s;
        mRequestId = s1;
    }

    public UIDataRequestSessionEndedEvent createEndedEvent(com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, HttpResponse httpresponse, Error error)
    {
        UIDataRequestSessionEndedEvent uidatarequestsessionendedevent = new UIDataRequestSessionEndedEvent(System.currentTimeMillis() - mStarted);
        uidatarequestsessionendedevent.setCategory(getCategory());
        uidatarequestsessionendedevent.setSessionId(mId);
        uidatarequestsessionendedevent.setUrl(mUrl);
        uidatarequestsessionendedevent.setRequestId(mRequestId);
        uidatarequestsessionendedevent.setError(error);
        uidatarequestsessionendedevent.setReason(completionreason);
        uidatarequestsessionendedevent.setRequestId(mRequestId);
        uidatarequestsessionendedevent.setResponse(httpresponse);
        return uidatarequestsessionendedevent;
    }

    public String getName()
    {
        return "uiDataRequest";
    }
}
