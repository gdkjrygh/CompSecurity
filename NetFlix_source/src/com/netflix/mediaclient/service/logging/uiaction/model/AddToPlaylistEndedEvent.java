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

public class AddToPlaylistEndedEvent extends BaseUIActionSessionEndedEvent
{

    public static final String TITLE_RANK = "titleRank";
    public static final String UIA_SESSION_NAME = "addToPlaylist";
    private int mTitleRank;

    public AddToPlaylistEndedEvent(DeviceUniqueId deviceuniqueid, long l, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror, 
            int i)
    {
        super("addToPlaylist", deviceuniqueid, l, modalview, commandname, completionreason, uierror);
        mTitleRank = i;
    }

    public AddToPlaylistEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        mTitleRank = JsonUtils.getInt(jsonobject, "titleRank", 0);
    }

    protected JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject = super.getData();
        jsonobject.put("titleRank", mTitleRank);
        return jsonobject;
    }

    public boolean isMemberEvent()
    {
        return true;
    }
}
