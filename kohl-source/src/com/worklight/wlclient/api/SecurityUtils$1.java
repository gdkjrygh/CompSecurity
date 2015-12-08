// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import android.content.Context;
import com.worklight.wlclient.WLRequestListener;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.worklight.wlclient.api:
//            SecurityUtils, WLResponse, WLFailResponse, WLErrorCode

static final class val.listener
    implements Runnable
{

    final int val$byteLength;
    final Context val$context;
    final WLRequestListener val$listener;

    public void run()
    {
        Object obj;
        obj = SecurityUtils.access$000(val$context);
        obj = (HttpURLConnection)SecurityUtils.buildURL(val$byteLength, ((com.worklight.common.WLConfig) (obj))).openConnection();
        WLResponse wlresponse = new WLResponse(200, SecurityUtils.readRandomStringFromInputStream(((HttpURLConnection) (obj))), null);
        val$listener.onSuccess(wlresponse);
        Exception exception;
        try
        {
            ((HttpURLConnection) (obj)).disconnect();
            return;
        }
        catch (Throwable throwable)
        {
            throwable = new WLFailResponse(WLErrorCode.UNEXPECTED_ERROR, throwable.getMessage(), null);
        }
        break MISSING_BLOCK_LABEL_78;
        exception;
        ((HttpURLConnection) (obj)).disconnect();
        throw exception;
        val$listener.onFailure(throwable);
        return;
    }

    (Context context1, int i, WLRequestListener wlrequestlistener)
    {
        val$context = context1;
        val$byteLength = i;
        val$listener = wlrequestlistener;
        super();
    }
}
