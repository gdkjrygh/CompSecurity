// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.params;

import org.apache.http.HttpVersion;

// Referenced classes of package org.apache.http.params:
//            HttpAbstractParamBean, HttpProtocolParams, HttpParams

public class HttpProtocolParamBean extends HttpAbstractParamBean
{

    public HttpProtocolParamBean(HttpParams httpparams)
    {
        super(httpparams);
    }

    public void setContentCharset(String s)
    {
        HttpProtocolParams.setContentCharset(params, s);
    }

    public void setHttpElementCharset(String s)
    {
        HttpProtocolParams.setHttpElementCharset(params, s);
    }

    public void setUseExpectContinue(boolean flag)
    {
        HttpProtocolParams.setUseExpectContinue(params, flag);
    }

    public void setUserAgent(String s)
    {
        HttpProtocolParams.setUserAgent(params, s);
    }

    public void setVersion(HttpVersion httpversion)
    {
        HttpProtocolParams.setVersion(params, httpversion);
    }
}
