// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.system;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import java.util.HashMap;

public class NetworkConfiguration extends MetadataNode
{

    private Metadata _cookieHeaders;
    private HashMap _customHeaders;
    private int _masterUpdateInterval;
    private boolean _useCookieHeadersForAllRequests;
    private boolean _useRedirectedUrl;

    public NetworkConfiguration()
    {
        _cookieHeaders = null;
        _useCookieHeadersForAllRequests = false;
        _useRedirectedUrl = true;
        _customHeaders = null;
        _masterUpdateInterval = -1;
    }

    public void addCustomHeader(String s, String as[])
    {
        if (_customHeaders == null)
        {
            _customHeaders = new HashMap();
        }
        _customHeaders.put(s, as);
    }

    public Metadata getCookieHeaders()
    {
        return _cookieHeaders;
    }

    public HashMap getCustomHeaders()
    {
        return _customHeaders;
    }

    public int getMasterUpdateInterval()
    {
        return _masterUpdateInterval;
    }

    public boolean getUseCookieHeadersForAllRequests()
    {
        return _useCookieHeadersForAllRequests;
    }

    public boolean getUseRedirectedUrl()
    {
        return _useRedirectedUrl;
    }

    public void setCookieHeaders(Metadata metadata)
    {
        _cookieHeaders = metadata;
    }

    public void setMasterUpdateInterval(int i)
    {
        _masterUpdateInterval = i;
    }

    public void setUseCookieHeadersForAllRequests(boolean flag)
    {
        _useCookieHeadersForAllRequests = flag;
    }

    public void setUseRedirectedUrl(boolean flag)
    {
        _useRedirectedUrl = flag;
    }
}
