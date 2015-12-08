// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.params;


// Referenced classes of package org.apache.http.params:
//            HttpAbstractParamBean, HttpConnectionParams, HttpParams

public class HttpConnectionParamBean extends HttpAbstractParamBean
{

    public HttpConnectionParamBean(HttpParams httpparams)
    {
        super(httpparams);
    }

    public void setConnectionTimeout(int i)
    {
        HttpConnectionParams.setConnectionTimeout(params, i);
    }

    public void setLinger(int i)
    {
        HttpConnectionParams.setLinger(params, i);
    }

    public void setSoTimeout(int i)
    {
        HttpConnectionParams.setSoTimeout(params, i);
    }

    public void setSocketBufferSize(int i)
    {
        HttpConnectionParams.setSocketBufferSize(params, i);
    }

    public void setStaleCheckingEnabled(boolean flag)
    {
        HttpConnectionParams.setStaleCheckingEnabled(params, flag);
    }

    public void setTcpNoDelay(boolean flag)
    {
        HttpConnectionParams.setTcpNoDelay(params, flag);
    }
}
