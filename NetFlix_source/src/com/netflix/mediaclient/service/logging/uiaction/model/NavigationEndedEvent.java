// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiaction.model;

import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.uiaction.model:
//            BaseUIActionSessionEndedEvent

public class NavigationEndedEvent extends BaseUIActionSessionEndedEvent
{

    public static final String DESTINATION_VIEW = "destinationView";
    public static final String START_VIEW = "sourceModalView";
    public static final String UIA_SESSION_NAME = "navigate";
    private com.netflix.mediaclient.servicemgr.IClientLogging.ModalView mDestinationView;
    private com.netflix.mediaclient.servicemgr.IClientLogging.ModalView mStartView;

    public NavigationEndedEvent(DeviceUniqueId deviceuniqueid, long l, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, 
            com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview1)
    {
        super("navigate", deviceuniqueid, l, modalview1, commandname, completionreason, uierror);
        mStartView = modalview;
        mDestinationView = modalview1;
    }

    public NavigationEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        mStartView = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(JsonUtils.getString(jsonobject, "sourceModalView", null));
        mDestinationView = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(JsonUtils.getString(jsonobject, "destinationView", null));
    }

    protected JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject = super.getData();
        if (mDestinationView != null)
        {
            jsonobject.put("destinationView", mDestinationView.name());
        }
        if (mStartView != null)
        {
            jsonobject.put("sourceModalView", mStartView.name());
        }
        return jsonobject;
    }

    public boolean isMemberEvent()
    {
        return true;
    }
}
