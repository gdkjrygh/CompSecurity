// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;

import com.netflix.mediaclient.service.logging.client.model.SessionStartedEvent;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm.model:
//            Orientation

public final class UIModelessViewSessionStartedEvent extends SessionStartedEvent
{

    public static final String MODELESS_VIEW = "modelessView";
    public static final String ORIENTATION = "orientation";
    private static final String UI_SESSION_NAME = "uiModelessView";
    private com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modelessView;
    private Orientation orientation;

    public UIModelessViewSessionStartedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        jsonobject = JsonUtils.getJSONObject(jsonobject, "data", null);
        if (jsonobject != null)
        {
            String s = JsonUtils.getString(jsonobject, "orientation", null);
            if (s != null)
            {
                orientation = Orientation.valueOf(s);
            } else
            {
                orientation = Orientation.portrait;
            }
            jsonobject = JsonUtils.getString(jsonobject, "modelessView", null);
            if (jsonobject != null)
            {
                modelessView = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(jsonobject);
            }
        }
    }

    public UIModelessViewSessionStartedEvent(boolean flag, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        super("uiModelessView");
        Orientation orientation1;
        if (flag)
        {
            orientation1 = Orientation.portrait;
        } else
        {
            orientation1 = Orientation.landscape;
        }
        orientation = orientation1;
        modalView = modalview;
        modelessView = modalview;
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
        jsonobject.put("orientation", orientation.name());
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

    public Orientation getOrientation()
    {
        return orientation;
    }
}
