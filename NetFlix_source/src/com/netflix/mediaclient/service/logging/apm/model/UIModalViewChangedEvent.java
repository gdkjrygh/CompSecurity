// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;

import com.netflix.mediaclient.service.logging.client.model.DiscreteEvent;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm.model:
//            Orientation

public final class UIModalViewChangedEvent extends DiscreteEvent
{

    protected static final String CATEGORY = "uiQOE";
    protected static final String NAME = "uiModalViewChanged";
    public static final String ORIENTATION = "orientation";
    private Orientation orientation;

    public UIModalViewChangedEvent(JSONObject jsonobject)
        throws JSONException
    {
label0:
        {
            super(jsonobject);
            jsonobject = JsonUtils.getJSONObject(jsonobject, "data", null);
            if (jsonobject != null)
            {
                jsonobject = JsonUtils.getString(jsonobject, "orientation", null);
                if (jsonobject == null)
                {
                    break label0;
                }
                orientation = Orientation.valueOf(jsonobject);
            }
            return;
        }
        orientation = Orientation.portrait;
    }

    public UIModalViewChangedEvent(boolean flag, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
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
        category = "uiQOE";
        name = "uiModalViewChanged";
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
        return jsonobject;
    }

    public Orientation getOrientation()
    {
        return orientation;
    }
}
