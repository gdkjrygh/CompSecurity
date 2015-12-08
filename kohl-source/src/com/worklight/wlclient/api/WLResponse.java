// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.common.Logger;
import com.worklight.nativeandroid.common.WLUtils;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api:
//            WLRequestOptions

public class WLResponse
{

    private static Logger logger = Logger.getInstance("wl.response");
    private Header headers[];
    private HttpResponse httpResponseCache;
    private WLRequestOptions requestOptions;
    private byte responseBytes[];
    private JSONObject responseJSON;
    private String responseText;
    private int status;

    WLResponse(int i, String s, WLRequestOptions wlrequestoptions)
    {
        status = i;
        requestOptions = wlrequestoptions;
        responseText = s;
        responseTextToJSON(s);
    }

    WLResponse(WLResponse wlresponse)
    {
        status = wlresponse.status;
        requestOptions = wlresponse.requestOptions;
        responseText = wlresponse.responseText;
        responseJSON = wlresponse.responseJSON;
        httpResponseCache = wlresponse.httpResponseCache;
        headers = wlresponse.headers;
        responseBytes = wlresponse.responseBytes;
    }

    public WLResponse(HttpResponse httpresponse)
    {
        status = httpresponse.getStatusLine().getStatusCode();
        headers = httpresponse.getAllHeaders();
        httpResponseCache = httpresponse;
        try
        {
            if (status == 204)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            logger.error((new StringBuilder()).append("Error getting content from server response: ").append(httpresponse.getMessage()).toString(), httpresponse);
            return;
        }
        if (status == 201)
        {
            httpresponse.getEntity().consumeContent();
            return;
        }
        if (httpresponse.getHeaders("Content-Encoding").length <= 0)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        logger.trace((new StringBuilder()).append("Content encoding is ").append(httpresponse.getHeaders("Content-Encoding")[0].getValue()).toString());
        if (httpresponse.getHeaders("Content-Encoding")[0].getValue().equalsIgnoreCase("gzip"))
        {
            responseBytes = WLUtils.readStreamToByteArray(new GZIPInputStream(httpresponse.getEntity().getContent()));
            return;
        }
        responseBytes = WLUtils.readStreamToByteArray(httpresponse.getEntity().getContent());
        return;
        if (httpresponse.getFirstHeader("Content-Length") != null)
        {
            logger.trace("Response does not include a Content-Encoding header. Attempting to read response body.");
        }
        responseBytes = WLUtils.readStreamToByteArray(httpresponse.getEntity().getContent());
        return;
    }

    private void responseTextToJSON(String s)
    {
        int i = responseText.indexOf('{');
        int j = responseText.lastIndexOf('}');
        if (i == -1 || j == -1)
        {
            responseJSON = null;
            return;
        }
        s = responseText.substring(i, j + 1);
        try
        {
            responseJSON = new JSONObject(s);
            return;
        }
        catch (JSONException jsonexception)
        {
            logger.error((new StringBuilder()).append("Response from MobileFirst Platform server failed because could not read JSON from response with text ").append(s).toString(), jsonexception);
        }
        responseJSON = null;
    }

    public Header getFirstHeader(String s)
    {
        return getHeader(s);
    }

    public Header getHeader(String s)
    {
        if (headers != null)
        {
            for (int i = 0; i < headers.length; i++)
            {
                if (headers[i].getName().equalsIgnoreCase(s))
                {
                    return headers[i];
                }
            }

        }
        return null;
    }

    public String[] getHeaderNames()
    {
        ArrayList arraylist = new ArrayList();
        Header aheader[] = headers;
        int j = aheader.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(aheader[i].getName());
        }

        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public Header[] getHeaders()
    {
        return headers;
    }

    public Header[] getHeaders(String s)
    {
        ArrayList arraylist = new ArrayList();
        Header aheader[] = headers;
        int j = aheader.length;
        for (int i = 0; i < j; i++)
        {
            Header header = aheader[i];
            if (header.getName().equals(s))
            {
                arraylist.add(header);
            }
        }

        return (Header[])arraylist.toArray(new Header[arraylist.size()]);
    }

    public Object getInvocationContext()
    {
        if (requestOptions == null)
        {
            return null;
        } else
        {
            return requestOptions.getInvocationContext();
        }
    }

    public WLRequestOptions getOptions()
    {
        return requestOptions;
    }

    public byte[] getResponseBytes()
    {
        return responseBytes;
    }

    public JSONObject getResponseJSON()
    {
        if (responseJSON == null)
        {
            getResponseText();
            if (responseText != null)
            {
                responseTextToJSON(getResponseText());
            }
        }
        return responseJSON;
    }

    public String getResponseText()
    {
        if (responseText == null)
        {
            if (responseBytes == null)
            {
                responseText = "";
            } else
            {
                responseText = new String(responseBytes);
            }
        }
        return responseText;
    }

    public int getStatus()
    {
        return status;
    }

    void setInvocationContext(Object obj)
    {
        requestOptions.setInvocationContext(obj);
    }

    public void setOptions(WLRequestOptions wlrequestoptions)
    {
        requestOptions = wlrequestoptions;
    }

    void setResponseHeader(String s, String s1)
    {
        httpResponseCache.setHeader(s, s1);
        headers = httpResponseCache.getAllHeaders();
    }

    public void setResponseText(String s)
    {
        responseText = s;
        responseTextToJSON(responseText);
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("WLResponse [invocationContext=");
        Object obj;
        if (requestOptions != null)
        {
            obj = requestOptions.getInvocationContext();
        } else
        {
            obj = "null";
        }
        return stringbuilder.append(obj).append(", responseText=").append(getResponseText()).append(", status=").append(status).append("]").toString();
    }

}
