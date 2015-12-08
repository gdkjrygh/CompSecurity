// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid;

import com.googlecode.flickrjandroid.oauth.OAuthTokenParameter;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import java.util.List;

// Referenced classes of package com.googlecode.flickrjandroid:
//            Parameter, Response

public abstract class Transport
{

    public static final String REST = "REST";
    private String host;
    private String path;
    private int port;
    protected Class responseClass;
    private String transportType;

    public Transport()
    {
        port = 443;
    }

    public abstract Response get(String s, List list);

    public String getHost()
    {
        return host;
    }

    public String getPath()
    {
        return path;
    }

    public int getPort()
    {
        return port;
    }

    public Class getResponseClass()
    {
        return responseClass;
    }

    public String getTransportType()
    {
        return transportType;
    }

    protected abstract Response post(String s, List list);

    public Response postJSON(String s, List list)
    {
        int i;
        boolean flag;
        flag = false;
        i = list.size() - 1;
_L6:
        if (i >= 0) goto _L2; else goto _L1
_L1:
        i = ((flag) ? 1 : 0);
_L4:
        list.add(new Parameter("nojsoncallback", "1"));
        list.add(new Parameter("format", "json"));
        if (i != 0)
        {
            OAuthUtils.addOAuthParams(s, "https://api.flickr.com/services/rest", list);
        }
        return post("/services/rest", list);
_L2:
        if (!(list.get(i) instanceof OAuthTokenParameter))
        {
            break; /* Loop/switch isn't completed */
        }
        i = 1;
        if (true) goto _L4; else goto _L3
_L3:
        i--;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Response replace(String s, List list)
    {
        OAuthUtils.addOAuthParams(s, "https://api.flickr.com/services/replace/", list);
        return sendUpload("/services/replace/", list);
    }

    protected abstract Response sendUpload(String s, List list);

    public void setHost(String s)
    {
        host = s;
    }

    public void setPath(String s)
    {
        path = s;
    }

    public void setPort(int i)
    {
        port = i;
    }

    public void setResponseClass(Class class1)
    {
        if (class1 == null)
        {
            throw new IllegalArgumentException("The response Class cannot be null");
        } else
        {
            responseClass = class1;
            return;
        }
    }

    public void setTransportType(String s)
    {
        transportType = s;
    }

    public Response upload(String s, List list)
    {
        OAuthUtils.addOAuthParams(s, "https://api.flickr.com/services/upload/", list);
        return sendUpload("/services/upload/", list);
    }
}
