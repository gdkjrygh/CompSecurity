// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiaction.model;

import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.uiaction.model:
//            BaseUIActionSessionEndedEvent

public final class RegisterEndedEvent extends BaseUIActionSessionEndedEvent
{

    private static final String UIA_NAME = "register";

    public RegisterEndedEvent(DeviceUniqueId deviceuniqueid, long l, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror)
    {
        super("register", deviceuniqueid, l, modalview, commandname, completionreason, uierror);
    }

    public RegisterEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
    }

    public boolean isMemberEvent()
    {
        return false;
    }
}
