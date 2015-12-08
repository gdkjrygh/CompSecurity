// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzbf;
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

// Referenced classes of package com.google.android.gms.internal:
//            zzvr

class zzvp
    implements zzvr
{

    private HttpClient zzaCE;

    zzvp()
    {
    }

    private InputStream zza(HttpClient httpclient, HttpResponse httpresponse)
    {
        int i = httpresponse.getStatusLine().getStatusCode();
        if (i == 200)
        {
            zzbf.zzab("Success response");
            return httpresponse.getEntity().getContent();
        }
        httpclient = (new StringBuilder("Bad response: ")).append(i).toString();
        if (i == 404)
        {
            throw new FileNotFoundException(httpclient);
        } else
        {
            throw new IOException(httpclient);
        }
    }

    private void zza(HttpClient httpclient)
    {
        if (httpclient != null && httpclient.getConnectionManager() != null)
        {
            httpclient.getConnectionManager().shutdown();
        }
    }

    public void close()
    {
        zza(zzaCE);
    }

    public InputStream zzdG(String s)
    {
        zzaCE = zzuN();
        s = zzaCE.execute(new HttpGet(s));
        return zza(zzaCE, s);
    }

    HttpClient zzuN()
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 20000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 20000);
        return new DefaultHttpClient(basichttpparams);
    }
}
