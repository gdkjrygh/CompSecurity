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

public final class UpgradeStreamsEndedEvent extends BaseUIActionSessionEndedEvent
{

    private static final String CURRENT_STREAMS = "currentStreams";
    private static final String END_STREAMS = "endStreams";
    private static final String UIA_NAME = "upgradeStreams";
    private com.netflix.mediaclient.servicemgr.UserActionLogging.Streams mCurrentStreams;
    private com.netflix.mediaclient.servicemgr.UserActionLogging.Streams mEndStreams;

    public UpgradeStreamsEndedEvent(DeviceUniqueId deviceuniqueid, long l, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror, 
            com.netflix.mediaclient.servicemgr.UserActionLogging.Streams streams, com.netflix.mediaclient.servicemgr.UserActionLogging.Streams streams1)
    {
        super("upgradeStreams", deviceuniqueid, l, modalview, commandname, completionreason, uierror);
        mCurrentStreams = streams;
        mEndStreams = streams1;
    }

    public UpgradeStreamsEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        mCurrentStreams = com.netflix.mediaclient.servicemgr.UserActionLogging.Streams.valueOf(JsonUtils.getString(jsonobject, "currentStreams", null));
        mEndStreams = com.netflix.mediaclient.servicemgr.UserActionLogging.Streams.valueOf(JsonUtils.getString(jsonobject, "endStreams", null));
    }

    protected JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject = super.getData();
        if (mCurrentStreams != null)
        {
            jsonobject.put("currentStreams", mCurrentStreams.getValue());
        }
        if (mEndStreams != null)
        {
            jsonobject.put("endStreams", mEndStreams.getValue());
        }
        return jsonobject;
    }

    public boolean isMemberEvent()
    {
        return true;
    }
}
