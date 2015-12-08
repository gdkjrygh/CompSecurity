// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.common.WLUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

// Referenced classes of package com.worklight.wlclient.api:
//            WLRequestOptions

public class WLResponse
{

    protected WLRequestOptions requestOptions;
    protected String responseText;
    protected int status;

    protected WLResponse(int i, String s, WLRequestOptions wlrequestoptions)
    {
        status = i;
        requestOptions = wlrequestoptions;
        responseText = s;
    }

    public WLResponse(WLResponse wlresponse)
    {
        status = wlresponse.status;
        requestOptions = wlresponse.requestOptions;
        responseText = wlresponse.responseText;
    }

    public WLResponse(HttpResponse httpresponse)
    {
        status = httpresponse.getStatusLine().getStatusCode();
        try
        {
            responseText = WLUtils.convertStreamToString(httpresponse.getEntity().getContent());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            WLUtils.error("Exception while try to read response body", httpresponse);
        }
    }

    public Object getInvocationContext()
    {
        return requestOptions.getInvocationContext();
    }

    public WLRequestOptions getOptions()
    {
        return requestOptions;
    }

    public String getResponseText()
    {
        return responseText;
    }

    public int getStatus()
    {
        return status;
    }

    public void setInvocationContext(Object obj)
    {
        requestOptions.setInvocationContext(obj);
    }

    public void setOptions(WLRequestOptions wlrequestoptions)
    {
        requestOptions = wlrequestoptions;
    }

    public String toString()
    {
        return (new StringBuilder("WLResponse [invocationContext=")).append(requestOptions.getInvocationContext()).append(", responseText=").append(responseText).append(", status=").append(status).append("]").toString();
    }
}
