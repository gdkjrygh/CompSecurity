// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.service.logging.client.model.Error;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.util:
//            LogUtils

public static class onOnUIError
{

    private UIError error;
    private com.netflix.mediaclient.servicemgr.son reason;
    private final int statusCode;

    private void populate(ActionOnUIError actiononuierror, String s, List list)
    {
        Error error1 = LogUtils.access$000(statusCode, "na");
        if (error1 != null)
        {
            error = new UIError(error1.getRootCause(), actiononuierror, s, list);
            reason = com.netflix.mediaclient.servicemgr.son.failed;
            return;
        } else
        {
            reason = com.netflix.mediaclient.servicemgr.son.success;
            return;
        }
    }

    public UIError getError()
    {
        return error;
    }

    public com.netflix.mediaclient.servicemgr.son getReason()
    {
        return reason;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public onOnUIError(int i, ActionOnUIError actiononuierror, String s, List list)
    {
        statusCode = i;
        populate(actiononuierror, s, list);
    }
}
