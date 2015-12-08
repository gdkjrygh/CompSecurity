// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm;

import com.netflix.mediaclient.service.logging.apm.model.UIAssetRequestSessionEndedEvent;
import com.netflix.mediaclient.service.logging.client.model.Error;
import com.netflix.mediaclient.service.logging.client.model.HttpResponse;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm:
//            BaseApmSession

public class UIAssetRequestSession extends BaseApmSession
{

    public static final String NAME = "uiAssetRequest";
    private com.netflix.mediaclient.servicemgr.IClientLogging.AssetType mAssetType;
    private String mUrl;

    public UIAssetRequestSession(String s, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype)
    {
        mUrl = s;
        mAssetType = assettype;
    }

    public UIAssetRequestSessionEndedEvent createEndedEvent(com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, HttpResponse httpresponse, Error error)
    {
        UIAssetRequestSessionEndedEvent uiassetrequestsessionendedevent = new UIAssetRequestSessionEndedEvent(System.currentTimeMillis() - mStarted);
        uiassetrequestsessionendedevent.setCategory(getCategory());
        uiassetrequestsessionendedevent.setSessionId(mId);
        uiassetrequestsessionendedevent.setUrl(mUrl);
        uiassetrequestsessionendedevent.setAssetType(mAssetType);
        uiassetrequestsessionendedevent.setError(error);
        uiassetrequestsessionendedevent.setReason(completionreason);
        uiassetrequestsessionendedevent.setResponse(httpresponse);
        return uiassetrequestsessionendedevent;
    }

    public String getName()
    {
        return "uiAssetRequest";
    }
}
