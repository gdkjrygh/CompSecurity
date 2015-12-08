// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiaction.model;

import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;
import com.netflix.mediaclient.service.logging.client.model.SessionEndedEvent;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseUIActionSessionEndedEvent extends SessionEndedEvent
{

    public static final String COMMAND_NAME = "commandName";
    public static final String ERROR = "error";
    public static final String MODAL_VIEW = "modalView";
    public static final String REASON = "reason";
    public static final String STARTED = "started";
    protected com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName mAction;
    protected com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason mCompletionReason;
    protected UIError mUIError;
    protected com.netflix.mediaclient.servicemgr.IClientLogging.ModalView mView;

    public BaseUIActionSessionEndedEvent(String s, DeviceUniqueId deviceuniqueid, long l, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, 
            UIError uierror)
    {
        super(s, deviceuniqueid, l);
        mView = modalview;
        mAction = commandname;
        mCompletionReason = completionreason;
        mUIError = uierror;
    }

    public BaseUIActionSessionEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        jsonobject = JsonUtils.getJSONObject(jsonobject, "data", null);
        if (jsonobject != null)
        {
            mCompletionReason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(JsonUtils.getString(jsonobject, "reason", null));
            jsonobject = JsonUtils.getJSONObject(jsonobject, "started", null);
            if (jsonobject != null)
            {
                mView = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(JsonUtils.getString(jsonobject, "modalView", null));
                mAction = com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName.valueOf(JsonUtils.getString(jsonobject, "commandName", null));
                jsonobject = JsonUtils.getJSONObject(jsonobject, "error", null);
                if (jsonobject != null)
                {
                    mUIError = new UIError(jsonobject);
                }
            }
        }
    }

    public com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName getAction()
    {
        return mAction;
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason getCompletionReason()
    {
        return mCompletionReason;
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
        jsonobject1 = new JSONObject();
        jsonobject.put("started", jsonobject1);
        if (mAction != null)
        {
            jsonobject1.put("commandName", mAction.name());
        }
        if (mView != null)
        {
            jsonobject1.put("modalView", mView.name());
        }
        if (mCompletionReason != null)
        {
            jsonobject.put("reason", mCompletionReason.name());
        }
        if (mUIError != null)
        {
            jsonobject.put("error", mUIError.toJSONObject());
        }
        return jsonobject;
    }

    public UIError getUIError()
    {
        return mUIError;
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getView()
    {
        return mView;
    }

    public abstract boolean isMemberEvent();
}
