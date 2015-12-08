// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc;

import android.os.Handler;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.type.ApiParameter;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc:
//            HostConnection, ApiException, ApiCallback

public abstract class ApiMethod
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/jsonrpc/ApiMethod);
    private static int lastId = 0;
    protected static final ObjectMapper objectMapper = new ObjectMapper();
    protected final int id;
    protected final ObjectNode jsonRequest;

    public ApiMethod()
    {
        this;
        JVM INSTR monitorenter ;
        int i = lastId + 1;
        lastId = i;
        id = i % 10000;
        this;
        JVM INSTR monitorexit ;
        jsonRequest = objectMapper.createObjectNode();
        jsonRequest.put("jsonrpc", "2.0");
        jsonRequest.put("method", getMethodName());
        jsonRequest.put("id", id);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static ApiCallback getDefaultActionCallback()
    {
        return new ApiCallback() {

            public void onError(int i, String s)
            {
                LogUtils.LOGD(ApiMethod.TAG, (new StringBuilder()).append("Got an error calling a method. Error code: ").append(i).append(", description: ").append(s).toString());
            }

            public void onSuccess(Object obj)
            {
            }

        };
    }

    protected void addParameterToRequest(String s, int i)
    {
        getParametersNode().put(s, i);
    }

    protected void addParameterToRequest(String s, JsonNode jsonnode)
    {
        if (jsonnode != null)
        {
            getParametersNode().put(s, jsonnode);
        }
    }

    protected void addParameterToRequest(String s, Double double1)
    {
        if (double1 != null)
        {
            getParametersNode().put(s, double1);
        }
    }

    protected void addParameterToRequest(String s, Integer integer)
    {
        if (integer != null)
        {
            getParametersNode().put(s, integer);
        }
    }

    protected void addParameterToRequest(String s, String s1)
    {
        if (s1 != null)
        {
            getParametersNode().put(s, s1);
        }
    }

    protected void addParameterToRequest(String s, ApiParameter apiparameter)
    {
        if (apiparameter != null)
        {
            getParametersNode().put(s, apiparameter.toJsonNode());
        }
    }

    protected void addParameterToRequest(String s, boolean flag)
    {
        getParametersNode().put(s, flag);
    }

    protected void addParameterToRequest(String s, String as[])
    {
        if (as != null)
        {
            ArrayNode arraynode = objectMapper.createArrayNode();
            for (int i = 0; i < as.length; i++)
            {
                arraynode.add(as[i]);
            }

            getParametersNode().put(s, arraynode);
        }
    }

    public void execute(HostConnection hostconnection, ApiCallback apicallback, Handler handler)
    {
        if (hostconnection != null)
        {
            hostconnection.execute(this, apicallback, handler);
            return;
        } else
        {
            apicallback.onError(ApiException.API_NO_CONNECTION, "No connection specified.");
            return;
        }
    }

    public int getId()
    {
        return id;
    }

    public abstract String getMethodName();

    protected ObjectNode getParametersNode()
    {
        if (jsonRequest.has("params"))
        {
            return (ObjectNode)jsonRequest.get("params");
        } else
        {
            ObjectNode objectnode = objectMapper.createObjectNode();
            jsonRequest.put("params", objectnode);
            return objectnode;
        }
    }

    public abstract Object resultFromJson(ObjectNode objectnode)
        throws ApiException;

    public String toJsonString()
    {
        return jsonRequest.toString();
    }


}
