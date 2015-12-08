// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.roidapp.photogrid.common:
//            ag

final class ah
    implements Runnable
{

    final ag a;
    private String b;
    private Context c;

    public ah(ag ag1, String s, Context context)
    {
        a = ag1;
        super();
        b = s;
        c = context.getApplicationContext();
    }

    private static String a(Context context)
    {
        String s = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        context = s;
        if (s != null)
        {
            context = s;
            if (s.length() > 0)
            {
                context = s.replace(":", "");
            }
        }
        return context;
    }

    private static HttpClient a()
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 30000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 30000);
        return new DefaultHttpClient(basichttpparams);
    }

    private String b()
    {
        String s1 = ag.c(c, "udid");
        if (s1 == null || s1.length() <= 0) goto _L2; else goto _L1
_L1:
        return s1;
_L2:
        Object obj1 = c;
        String s = a(((Context) (obj1)));
        Object obj = UUID.randomUUID().toString();
        long l = ag.a(ag.b());
        obj1 = ag.b(((Context) (obj1)));
        String s2 = ag.b((new StringBuilder("1pg")).append(((String) (obj))).append(s).append(l).append(((String) (obj1))).append("m2ziutq1v3vcz#d@98skf@!tt$dcs5qp9m").toString());
        obj = String.format(Locale.ENGLISH, "http://pg.did.ijinshan.com/pg/?v=1&p=pg&u=%s&m=%s&ip=%d&e=%s&s=%s", new Object[] {
            obj, s, Long.valueOf(l), obj1, s2
        });
        s = s1;
        try
        {
            obj = new HttpGet(((String) (obj)));
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return s;
        }
        s = s1;
        obj = a().execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        s = s1;
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() != 200) goto _L1; else goto _L3
_L3:
        s = s1;
        s1 = EntityUtils.toString(((HttpResponse) (obj)).getEntity()).replace("\n", "");
        s = s1;
        ag.a(c, "udid", s1);
        return s1;
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        obj = a(c);
        obj1 = b();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (((String) (obj1)).length() <= 0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        b = (new StringBuilder()).append(b).append("&mac=").append(((String) (obj))).append("&did=").append(((String) (obj1))).toString();
        obj = new HttpGet(b);
        obj1 = a();
        try
        {
            ((HttpClient) (obj1)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj))).getStatusLine().getStatusCode();
        }
        catch (IOException ioexception)
        {
            try
            {
                ioexception.printStackTrace();
            }
            catch (Throwable throwable)
            {
                throwable.printStackTrace();
            }
        }
        c = null;
        return;
    }
}
