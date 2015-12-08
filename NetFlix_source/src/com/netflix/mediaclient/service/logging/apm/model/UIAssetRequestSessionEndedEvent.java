// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;

import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;
import com.netflix.mediaclient.service.logging.client.model.Error;
import com.netflix.mediaclient.service.logging.client.model.HttpResponse;
import com.netflix.mediaclient.service.logging.client.model.SessionEndedEvent;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class UIAssetRequestSessionEndedEvent extends SessionEndedEvent
{

    public static final String ASSET_TYPE = "assetType";
    public static final String ERROR = "error";
    public static final String REASON = "reason";
    public static final String RESPONSE = "response";
    private static final String UI_ASSET_NAME = "uiAssetRequest";
    public static final String URL = "url";
    private com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assetType;
    private Error error;
    private com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason reason;
    private HttpResponse response;
    private String url;

    public UIAssetRequestSessionEndedEvent(long l)
    {
        super("uiAssetRequest", new DeviceUniqueId(), l);
    }

    public UIAssetRequestSessionEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        jsonobject = JsonUtils.getJSONObject(jsonobject, "data", null);
        if (jsonobject != null)
        {
            String s = JsonUtils.getString(jsonobject, "assetType", null);
            if (s != null)
            {
                assetType = com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.valueOf(s);
            }
            s = JsonUtils.getString(jsonobject, "reason", null);
            if (s != null)
            {
                reason = (com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason)com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(com/netflix/mediaclient/servicemgr/IClientLogging$CompletionReason, s);
            }
            url = JsonUtils.getString(jsonobject, "url", null);
            error = UIError.createInstance(JsonUtils.getJSONObject(jsonobject, "error", null));
            response = HttpResponse.createInstance(JsonUtils.getJSONObject(jsonobject, "response", null));
        }
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.AssetType getAssetType()
    {
        return assetType;
    }

    protected JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject1 = super.getData();
        JSONObject jsonobject = jsonobject1;
        if (jsonobject1 == null)
        {
            jsonobject = new JSONObject();
        }
        if (url != null)
        {
            jsonobject.put("url", url);
        }
        if (error != null)
        {
            jsonobject.put("error", error.toJSONObject());
        }
        if (response != null)
        {
            jsonobject.put("response", response.toJSONObject());
        }
        if (reason != null)
        {
            jsonobject.put("reason", reason.name());
        }
        if (assetType != null)
        {
            jsonobject.put("assetType", assetType.name());
        }
        return jsonobject;
    }

    public Error getError()
    {
        return error;
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason getReason()
    {
        return reason;
    }

    public HttpResponse getResponse()
    {
        return response;
    }

    public String getUrl()
    {
        return url;
    }

    public void setAssetType(com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype)
    {
        assetType = assettype;
    }

    public void setError(Error error1)
    {
        error = error1;
    }

    public void setReason(com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason)
    {
        reason = completionreason;
    }

    public void setResponse(HttpResponse httpresponse)
    {
        response = httpresponse;
    }

    public void setUrl(String s)
    {
        url = s;
    }
}
