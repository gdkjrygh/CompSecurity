// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.common.WLConfig;
import com.worklight.wlclient.AsynchronousRequestSender;
import com.worklight.wlclient.RequestMethod;
import com.worklight.wlclient.WLHybridHttpListener;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;

public class WLNativeXHRSender
{

    public WLNativeXHRSender()
    {
    }

    void addGlobalHeader(JSONObject jsonobject)
        throws JSONException
    {
        String s = jsonobject.getString("headerName");
        jsonobject = jsonobject.getString("headerValue");
        AsynchronousRequestSender.getInstance().addGlobalHeader(s, jsonobject);
    }

    JSONObject getGlobalHeaders()
        throws JSONException
    {
        Object obj = AsynchronousRequestSender.getInstance().getGlobalHeaders();
        JSONObject jsonobject = new JSONObject();
        java.util.Map.Entry entry;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); jsonobject.put((String)entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        return jsonobject;
    }

    void removeGlobalHeader(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.getString("headerName");
        AsynchronousRequestSender.getInstance().removeGlobalHeader(jsonobject);
    }

    void sendRequest(JSONObject jsonobject, WLHybridHttpListener wlhybridhttplistener)
    {
        Object obj;
        Object obj1;
        JSONObject jsonobject1;
        String s;
        String s1;
        Pattern pattern;
        int i;
        boolean flag;
        boolean flag1;
        try
        {
            obj = jsonobject.getString("url");
            s = jsonobject.getString("body");
            jsonobject1 = jsonobject.getJSONObject("headers");
            i = jsonobject.getInt("timeout");
            obj1 = jsonobject.getString("method");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new RuntimeException((new StringBuilder()).append("Failed to send request. JSONException :: ").append(jsonobject.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new RuntimeException((new StringBuilder()).append("UnsupportedEncodingException :: ").append(jsonobject.getMessage()).toString());
        }
        flag1 = true;
        flag = flag1;
        if (!jsonobject.has("isResourceRequest"))
        {
            break MISSING_BLOCK_LABEL_71;
        }
        flag = flag1;
        if (jsonobject.getBoolean("isResourceRequest"))
        {
            flag = false;
        }
        s1 = WLConfig.getInstance().getRootURL();
        pattern = Pattern.compile("^[a-z]+://.*", 2);
        if (!((String) (obj)).endsWith("/../../invoke")) goto _L2; else goto _L1
_L1:
        jsonobject = (new StringBuilder()).append(s1).append("/invoke").toString();
_L3:
        obj1 = RequestMethod.fromSring(((String) (obj1)));
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        obj = RequestMethod.POST;
        jsonobject = ((RequestMethod) (obj)).createHttpRequest(jsonobject);
        if (jsonobject instanceof HttpEntityEnclosingRequestBase)
        {
            ((HttpEntityEnclosingRequestBase)jsonobject).setEntity(new StringEntity(s, "UTF-8"));
        }
        for (obj = jsonobject1.keys(); ((Iterator) (obj)).hasNext(); jsonobject.addHeader(((String) (obj1)), jsonobject1.getString(((String) (obj1)))))
        {
            obj1 = (String)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_310;
_L2:
label0:
        {
            if (!((String) (obj)).endsWith("/../../oauth/token"))
            {
                break label0;
            }
            jsonobject = (new StringBuilder()).append(s1).append("/oauth/token").toString();
        }
          goto _L3
        jsonobject = ((JSONObject) (obj));
        if (pattern.matcher(((CharSequence) (obj))).matches()) goto _L3; else goto _L4
_L4:
        jsonobject = (new StringBuilder()).append(s1).append(((String) (obj))).toString();
          goto _L3
        AsynchronousRequestSender.getInstance().sendWLHybridRequestAsync(jsonobject, i, wlhybridhttplistener, flag);
        return;
    }
}
