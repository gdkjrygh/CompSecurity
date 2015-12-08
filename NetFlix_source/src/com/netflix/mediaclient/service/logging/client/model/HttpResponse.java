// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import com.netflix.mediaclient.service.logging.JsonSerializer;
import com.netflix.mediaclient.util.JsonUtils;
import com.netflix.mediaclient.util.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class HttpResponse
    implements JsonSerializer
{

    public static final String API_SCRIPT_EXECUTION_TIME = "apiScriptExecutionTime";
    public static final String CONTENT_LENGTH = "contentLength";
    public static final String DNS_TIME = "dnsTime";
    public static final String ENDPOINT_REVISION = "apiScriptRevision";
    public static final String MIME_TYPE = "mimeType";
    public static final String PARSE_TIME = "parseTime";
    public static final String RESPONSE_TIME = "responseTime";
    public static final String SERVER_EXECUTION_TIME = "serverExecutionTime";
    public static final String SSL_TIME = "sslTime";
    public static final String TRANSFER_TIME = "transferTime";
    private Integer apiScriptExecutionTime;
    private Integer contentLength;
    private Integer dnsTime;
    private String endpointRevision;
    private String mimeType;
    private Integer parseTime;
    private Integer responseTime;
    private Integer serverExecutionTime;
    private Integer sslTime;
    private Integer transferTime;

    public HttpResponse()
    {
    }

    public static HttpResponse createInstance(String s)
        throws JSONException
    {
        if (StringUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return createInstance(new JSONObject(s));
        }
    }

    public static HttpResponse createInstance(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            HttpResponse httpresponse = new HttpResponse();
            httpresponse.contentLength = JsonUtils.getIntegerObject(jsonobject, "contentLength", null);
            httpresponse.dnsTime = JsonUtils.getIntegerObject(jsonobject, "dnsTime", null);
            httpresponse.sslTime = JsonUtils.getIntegerObject(jsonobject, "sslTime", null);
            httpresponse.responseTime = JsonUtils.getIntegerObject(jsonobject, "responseTime", null);
            httpresponse.transferTime = JsonUtils.getIntegerObject(jsonobject, "transferTime", null);
            httpresponse.serverExecutionTime = JsonUtils.getIntegerObject(jsonobject, "serverExecutionTime", null);
            httpresponse.parseTime = JsonUtils.getIntegerObject(jsonobject, "parseTime", null);
            httpresponse.mimeType = JsonUtils.getString(jsonobject, "mimeType", null);
            JSONObject jsonobject1 = jsonobject.optJSONObject("custom");
            jsonobject = httpresponse;
            if (jsonobject1 != null)
            {
                httpresponse.apiScriptExecutionTime = JsonUtils.getIntegerObject(jsonobject1, "apiScriptExecutionTime", null);
                httpresponse.endpointRevision = JsonUtils.getString(jsonobject1, "apiScriptRevision", null);
                return httpresponse;
            }
        }
        return jsonobject;
    }

    public Integer getApiScriptExecutionTime()
    {
        return apiScriptExecutionTime;
    }

    public Integer getContentLength()
    {
        return contentLength;
    }

    public Integer getDnsTime()
    {
        return dnsTime;
    }

    public String getEndpointRevision()
    {
        return endpointRevision;
    }

    public String getMimeType()
    {
        return mimeType;
    }

    public Integer getParseTime()
    {
        return parseTime;
    }

    public Integer getResponseTime()
    {
        return responseTime;
    }

    public Integer getServerExecutionTime()
    {
        return serverExecutionTime;
    }

    public Integer getSslTime()
    {
        return sslTime;
    }

    public Integer getTransferTime()
    {
        return transferTime;
    }

    public void setApiScriptExecutionTime(Integer integer)
    {
        apiScriptExecutionTime = integer;
    }

    public void setContentLength(Integer integer)
    {
        contentLength = integer;
    }

    public void setDnsTime(Integer integer)
    {
        dnsTime = integer;
    }

    public void setEndpointRevision(String s)
    {
        endpointRevision = s;
    }

    public void setMimeType(String s)
    {
        mimeType = s;
    }

    public void setParseTime(Integer integer)
    {
        parseTime = integer;
    }

    public void setResponseTime(Integer integer)
    {
        responseTime = integer;
    }

    public void setServerExecutionTime(Integer integer)
    {
        serverExecutionTime = integer;
    }

    public void setSslTime(Integer integer)
    {
        sslTime = integer;
    }

    public void setTransferTime(Integer integer)
    {
        transferTime = integer;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        if (dnsTime != null)
        {
            jsonobject.put("dnsTime", dnsTime);
        }
        if (sslTime != null)
        {
            jsonobject.put("sslTime", sslTime);
        }
        if (responseTime != null)
        {
            jsonobject.put("responseTime", responseTime);
        }
        if (transferTime != null)
        {
            jsonobject.put("transferTime", transferTime);
        }
        if (serverExecutionTime != null)
        {
            jsonobject.put("serverExecutionTime", serverExecutionTime);
        }
        if (parseTime != null)
        {
            jsonobject.put("parseTime", parseTime);
        }
        if (contentLength != null)
        {
            jsonobject.put("contentLength", contentLength);
        }
        if (mimeType != null)
        {
            jsonobject.put("mimeType", mimeType);
        }
        if (apiScriptExecutionTime != null || endpointRevision != null)
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject.put("custom", jsonobject1);
            if (apiScriptExecutionTime != null)
            {
                jsonobject1.put("apiScriptExecutionTime", apiScriptExecutionTime);
            }
            if (endpointRevision != null)
            {
                jsonobject1.put("apiScriptRevision", endpointRevision);
            }
        }
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("HttpResponse [dnsTime=").append(dnsTime).append(", sslTime=").append(sslTime).append(", responseTime=").append(responseTime).append(", transferTime=").append(transferTime).append(", serverExecutionTime=").append(serverExecutionTime).append(", parseTime=").append(parseTime).append(", contentLength=").append(contentLength).append(", mimeType=").append(mimeType).append(", apiScriptExecutionTime=").append(apiScriptExecutionTime).append(", endpointRevision=").append(endpointRevision).append("]").toString();
    }
}
