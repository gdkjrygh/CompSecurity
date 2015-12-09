// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service;

import com.connectsdk.core.Util;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.command.ServiceCommandError;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

// Referenced classes of package com.connectsdk.service:
//            DIALService

class eCommand
    implements Runnable
{

    final DIALService this$0;
    final ServiceCommand val$mCommand;

    public void run()
    {
        Object obj;
        ServiceCommand servicecommand;
        HttpRequestBase httprequestbase;
        servicecommand = val$mCommand;
        obj = servicecommand.getPayload();
        httprequestbase = servicecommand.getRequest();
        if (obj == null || !servicecommand.getHttpMethod().equalsIgnoreCase("POST")) goto _L2; else goto _L1
_L1:
        HttpPost httppost;
        httprequestbase.setHeader("Content-Type", "text/plain; charset=\"utf-8\"");
        httppost = (HttpPost)httprequestbase;
        if (obj instanceof String)
        {
            obj = new StringEntity((String)obj);
            break MISSING_BLOCK_LABEL_64;
        }
        int i;
        try
        {
            if (obj instanceof JSONObject)
            {
                obj = new StringEntity((String)obj);
                continue; /* Loop/switch isn't completed */
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        obj = null;
        continue; /* Loop/switch isn't completed */
_L4:
        if (obj == null)
        {
            Util.postError(servicecommand.getResponseListener(), new ServiceCommandError(0, "Unknown Error while preparing to send message", null));
            return;
        }
        httppost.setEntity(((org.apache.http.HttpEntity) (obj)));
_L2:
        try
        {
            obj = httpClient.execute(httprequestbase);
            i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        }
        catch (IllegalStateException illegalstateexception)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        if (i != 200 && i != 201)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        obj = EntityUtils.toString(((HttpResponse) (obj)).getEntity(), "UTF-8");
        Util.postSuccess(servicecommand.getResponseListener(), obj);
        return;
        Util.postError(servicecommand.getResponseListener(), ServiceCommandError.getError(i));
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    eCommand()
    {
        this$0 = final_dialservice;
        val$mCommand = ServiceCommand.this;
        super();
    }
}
