// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

final class lgf
    implements lgh
{

    private HttpClient a;

    lgf()
    {
    }

    public final InputStream a(String s)
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 20000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 20000);
        a = new DefaultHttpClient(basichttpparams);
        s = a.execute(new HttpGet(s));
        int i = s.getStatusLine().getStatusCode();
        if (i == 200)
        {
            lqh.d("Success response");
            return s.getEntity().getContent();
        }
        s = (new StringBuilder("Bad response: ")).append(i).toString();
        if (i == 404)
        {
            throw new FileNotFoundException(s);
        } else
        {
            throw new IOException(s);
        }
    }

    public final void a()
    {
        HttpClient httpclient = a;
        if (httpclient != null && httpclient.getConnectionManager() != null)
        {
            httpclient.getConnectionManager().shutdown();
        }
    }
}
