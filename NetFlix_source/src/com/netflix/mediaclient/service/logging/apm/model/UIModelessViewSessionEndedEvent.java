// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;

import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;
import com.netflix.mediaclient.service.logging.client.model.SessionEndedEvent;
import com.netflix.mediaclient.service.logging.client.model.SessionStartedEvent;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class UIModelessViewSessionEndedEvent extends SessionEndedEvent
{

    public static final String MODELESS_VIEW = "modelessView";
    private static final String UI_SESSION_NAME = "uiModelessView";
    private com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modelessView;

    public UIModelessViewSessionEndedEvent(DeviceUniqueId deviceuniqueid, long l, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        super("uiModelessView", deviceuniqueid, l);
        modalView = modalview;
        modelessView = modalview;
    }

    public UIModelessViewSessionEndedEvent(SessionStartedEvent sessionstartedevent, long l, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        super(sessionstartedevent, l);
        modalView = modalview;
        modelessView = modalview;
    }

    public UIModelessViewSessionEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        jsonobject = JsonUtils.getJSONObject(jsonobject, "data", null);
        if (jsonobject != null)
        {
            jsonobject = JsonUtils.getString(jsonobject, "modelessView", null);
            if (jsonobject != null)
            {
                modelessView = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(jsonobject);
            }
        }
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
        if (modelessView != null)
        {
            jsonobject.put("modelessView", modelessView.name());
        }
        return jsonobject;
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getModelessView()
    {
        return modelessView;
    }
}
