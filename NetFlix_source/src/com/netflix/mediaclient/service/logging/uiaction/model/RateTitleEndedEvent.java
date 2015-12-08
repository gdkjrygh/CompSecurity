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

public final class RateTitleEndedEvent extends BaseUIActionSessionEndedEvent
{

    public static final String RANK_TITLE = " rankTitle";
    public static final String RATING = " rating";
    private static final String UIA_NAME = "rateTitle";
    private Integer mRankTitle;
    private int mRating;

    public RateTitleEndedEvent(DeviceUniqueId deviceuniqueid, long l, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror, 
            Integer integer, int i)
    {
        super("rateTitle", deviceuniqueid, l, modalview, commandname, completionreason, uierror);
        mRating = i;
        mRankTitle = integer;
    }

    public RateTitleEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        mRankTitle = JsonUtils.getIntegerObject(jsonobject, " rankTitle", null);
        mRating = JsonUtils.getInt(jsonobject, " rating", 0);
    }

    protected JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject = super.getData();
        if (mRankTitle != null)
        {
            jsonobject.put(" rankTitle", mRankTitle.intValue());
        }
        jsonobject.put(" rating", mRating);
        return jsonobject;
    }

    public boolean isMemberEvent()
    {
        return true;
    }
}
