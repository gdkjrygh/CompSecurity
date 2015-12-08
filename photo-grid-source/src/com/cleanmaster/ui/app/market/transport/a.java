// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.transport;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.cleanmaster.ui.app.market.transport:
//            b

public class a
{

    protected String mHost;
    protected int mPort;
    protected String mQuery;
    protected List qparams;

    public a()
    {
        mHost = b.c();
        mPort = b.a;
        mQuery = "";
        qparams = new ArrayList();
        v(16);
    }

    public a android_id()
    {
        qparams.add(new BasicNameValuePair("android_id", com.cleanmaster.common.a.a()));
        return this;
    }

    public a brand()
    {
        qparams.add(new BasicNameValuePair("brand", com.cleanmaster.functionevent.report.a.a("ro.product.brand", "unknow")));
        return this;
    }

    public a ch()
    {
        qparams.add(new BasicNameValuePair("ch", String.valueOf(com.cleanmaster.common.a.b())));
        return this;
    }

    public a country(String s)
    {
        qparams.add(new BasicNameValuePair("country", String.valueOf(s)));
        return this;
    }

    public a cver(int i)
    {
        qparams.add(new BasicNameValuePair("cver", String.valueOf(i)));
        return this;
    }

    public a k(int i)
    {
        qparams.add(new BasicNameValuePair("k", String.valueOf(i)));
        return this;
    }

    public a lan(String s)
    {
        qparams.add(new BasicNameValuePair("lan", String.valueOf(s)));
        return this;
    }

    public a mcc(String s)
    {
        qparams.add(new BasicNameValuePair("mcc", s));
        return this;
    }

    public a model()
    {
        qparams.add(new BasicNameValuePair("model", com.cleanmaster.functionevent.report.a.a("ro.product.model", "unknow")));
        return this;
    }

    public a net(int i)
    {
        qparams.add(new BasicNameValuePair("net", String.valueOf(i)));
        return this;
    }

    public a os_version()
    {
        qparams.add(new BasicNameValuePair("os_version", (new StringBuilder()).append(android.os.Build.VERSION.SDK_INT).toString()));
        return this;
    }

    public a resolution(String s)
    {
        qparams.add(new BasicNameValuePair("resolution", String.valueOf(s)));
        return this;
    }

    public void setHost(String s)
    {
        mHost = s;
    }

    public void setPort(int i)
    {
        mPort = i;
    }

    public void setQuery(String s)
    {
        mQuery = s;
    }

    public URI toURI()
    {
        URI uri;
        try
        {
            uri = URIUtils.createURI("http", mHost, mPort, mQuery, URLEncodedUtils.format(qparams, "UTF-8"), null);
        }
        catch (URISyntaxException urisyntaxexception)
        {
            urisyntaxexception.printStackTrace();
            return null;
        }
        return uri;
    }

    public a v(int i)
    {
        qparams.add(new BasicNameValuePair("v", String.valueOf(i)));
        return this;
    }
}
