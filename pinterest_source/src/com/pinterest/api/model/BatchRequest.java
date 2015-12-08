// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;

public class BatchRequest
{

    private String _method;
    private HashMap _params;
    private String _uri;

    public BatchRequest(String s, String s1)
    {
        _method = "GET";
        _uri = "";
        _params = new HashMap();
        _method = s;
        _uri = s1;
    }

    public BatchRequest(String s, String s1, HashMap hashmap)
    {
        _method = "GET";
        _uri = "";
        _params = new HashMap();
        _method = s;
        _uri = s1;
        _params = hashmap;
    }

    public String getMethod()
    {
        return _method;
    }

    public HashMap getParams()
    {
        return _params;
    }

    public String getUri()
    {
        return _uri;
    }

    public void setMethod(String s)
    {
        _method = s;
    }

    public transient void setParams(String s, String as[])
    {
        if (s != null)
        {
            _params.put(s, StringUtils.join(as, ","));
        }
    }

    public void setParams(HashMap hashmap)
    {
        _params = hashmap;
    }

    public void setUri(String s)
    {
        _uri = s;
    }

    public PinterestJsonObject toRequest()
    {
        PinterestJsonObject pinterestjsonobject;
        try
        {
            pinterestjsonobject = new PinterestJsonObject();
            pinterestjsonobject.b("method", _method);
            pinterestjsonobject.b("uri", _uri);
            if (_params.size() > 0)
            {
                pinterestjsonobject.a("params", new PinterestJsonObject(_params));
            }
        }
        catch (Exception exception)
        {
            PLog.error(exception, "exception occurred", new Object[0]);
            return new PinterestJsonObject();
        }
        return pinterestjsonobject;
    }
}
