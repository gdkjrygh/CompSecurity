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

public final class SearchEndedEvent extends BaseUIActionSessionEndedEvent
{

    public static final String TERM = "term";
    private static final String UIA_NAME = "search";
    private String mTerm;

    public SearchEndedEvent(DeviceUniqueId deviceuniqueid, long l, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror, 
            String s)
    {
        super("search", deviceuniqueid, l, modalview, commandname, completionreason, uierror);
        mTerm = s;
    }

    public SearchEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        mTerm = JsonUtils.getString(jsonobject, "term", null);
    }

    protected JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject = super.getData();
        if (mTerm != null)
        {
            jsonobject.put("term", mTerm);
        }
        return jsonobject;
    }

    public boolean isMemberEvent()
    {
        return true;
    }
}
