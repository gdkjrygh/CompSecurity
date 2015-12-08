// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.util.Log;
import com.umeng.common.b.g;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.umeng.common.net:
//            DownloadingService

class i
    implements Runnable
{

    private final String a[];
    private final boolean b;
    private final Map c;

    i(String as[], boolean flag, Map map)
    {
        a = as;
        b = flag;
        c = map;
        super();
    }

    public void run()
    {
        int k = (new Random()).nextInt(1000);
        if (a != null) goto _L2; else goto _L1
_L1:
        Log.i(DownloadingService.a(), (new StringBuilder(String.valueOf(k))).append("service report: urls is null").toString());
_L4:
        return;
_L2:
        String as[];
        int j;
        int l;
        as = a;
        l = as.length;
        j = 0;
_L9:
        if (j >= l) goto _L4; else goto _L3
_L3:
        String s;
        Object obj;
        Object obj2;
        s = as[j];
        obj = g.a();
        obj2 = ((String) (obj)).split(" ")[0];
        String s1 = ((String) (obj)).split(" ")[1];
        long l1 = System.currentTimeMillis();
        obj = new StringBuilder(s);
        ((StringBuilder) (obj)).append((new StringBuilder("&data=")).append(((String) (obj2))).toString());
        ((StringBuilder) (obj)).append((new StringBuilder("&time=")).append(s1).toString());
        ((StringBuilder) (obj)).append((new StringBuilder("&ts=")).append(l1).toString());
        int i1;
        if (b)
        {
            ((StringBuilder) (obj)).append((new StringBuilder("&action_type=")).append(1).toString());
        } else
        {
            ((StringBuilder) (obj)).append((new StringBuilder("&action_type=")).append(-2).toString());
        }
        if (c == null) goto _L6; else goto _L5
_L5:
        obj2 = c.keySet().iterator();
_L10:
        if (((Iterator) (obj2)).hasNext()) goto _L7; else goto _L6
_L6:
        Log.i(DownloadingService.a(), (new StringBuilder(String.valueOf(k))).append(": service report:\tget: ").append(((StringBuilder) (obj)).toString()).toString());
        obj = new HttpGet(((StringBuilder) (obj)).toString());
        obj2 = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj2)), 10000);
        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj2)), 20000);
        obj = (new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj2)))).execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        Log.i(DownloadingService.a(), (new StringBuilder(String.valueOf(k))).append(": service report:status code:  ").append(((HttpResponse) (obj)).getStatusLine().getStatusCode()).toString());
        i1 = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (i1 == 200) goto _L4; else goto _L8
_L8:
        j++;
          goto _L9
_L7:
        String s2 = (String)((Iterator) (obj2)).next();
        ((StringBuilder) (obj)).append((new StringBuilder("&")).append(s2).append("=").append((String)c.get(s2)).toString());
          goto _L10
        Object obj1;
        obj1;
        Log.d(DownloadingService.a(), (new StringBuilder(String.valueOf(k))).append(": service report:\tClientProtocolException,Failed to send message.").append(s).toString(), ((Throwable) (obj1)));
          goto _L8
        obj1;
        Log.d(DownloadingService.a(), (new StringBuilder(String.valueOf(k))).append(": service report:\tIOException,Failed to send message.").append(s).toString(), ((Throwable) (obj1)));
          goto _L8
    }
}
