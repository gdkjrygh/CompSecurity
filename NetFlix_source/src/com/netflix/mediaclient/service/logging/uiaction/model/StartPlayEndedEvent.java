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

public final class StartPlayEndedEvent extends BaseUIActionSessionEndedEvent
{

    public static final String RANK_TITLE = "rankTitle";
    private static final String UIA_NAME = "startPlay";
    private Integer mRankTitle;

    public StartPlayEndedEvent(DeviceUniqueId deviceuniqueid, long l, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror, 
            Integer integer)
    {
        super("startPlay", deviceuniqueid, l, modalview, commandname, completionreason, uierror);
        mRankTitle = integer;
    }

    public StartPlayEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        mRankTitle = JsonUtils.getIntegerObject(jsonobject, "rankTitle", null);
    }

    protected JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject = super.getData();
        if (mRankTitle != null)
        {
            jsonobject.put("rankTitle", mRankTitle.intValue());
        }
        return jsonobject;
    }

    public boolean isMemberEvent()
    {
        return true;
    }
}
