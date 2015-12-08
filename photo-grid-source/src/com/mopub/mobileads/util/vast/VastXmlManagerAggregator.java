// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.util.vast;

import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import com.mopub.common.HttpClient;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Strings;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

// Referenced classes of package com.mopub.mobileads.util.vast:
//            b, e

public class VastXmlManagerAggregator extends AsyncTask
{

    private final WeakReference a;
    private int b;

    VastXmlManagerAggregator(e e1)
    {
        a = new WeakReference(e1);
    }

    private transient List a(String as[])
    {
        AndroidHttpClient androidhttpclient = HttpClient.getHttpClient();
        if (as == null) goto _L2; else goto _L1
_L1:
        Object obj = androidhttpclient;
        if (as.length <= 0) goto _L2; else goto _L3
_L3:
        as = as[0];
        obj = androidhttpclient;
        Object obj1 = new ArrayList();
_L9:
        if (as == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = androidhttpclient;
        if (as.length() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = androidhttpclient;
        if (isCancelled())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = androidhttpclient;
        b b1 = new b();
        obj = androidhttpclient;
        b1.a(as);
        obj = androidhttpclient;
        ((List) (obj1)).add(b1);
        obj = androidhttpclient;
        as = b1.a();
        if (as == null) goto _L5; else goto _L4
_L4:
        obj = androidhttpclient;
        if (b >= 20) goto _L5; else goto _L6
_L6:
        obj = androidhttpclient;
        b = b + 1;
        obj = androidhttpclient;
        as = androidhttpclient.execute(HttpClient.initializeHttpGet(as)).getEntity();
        if (as != null)
        {
            obj = androidhttpclient;
            try
            {
                as = Strings.fromStream(as.getContent());
                continue; /* Loop/switch isn't completed */
            }
            catch (Exception exception)
            {
                as = ((String []) (obj1));
                obj1 = exception;
            }
            finally { }
        } else
        {
            as = null;
            continue; /* Loop/switch isn't completed */
        }
          goto _L7
_L5:
        as = null;
        if (true) goto _L9; else goto _L8
_L8:
        as = ((String []) (obj1));
_L13:
        obj = as;
        if (androidhttpclient != null)
        {
            androidhttpclient.close();
            obj = as;
        }
_L11:
        return ((List) (obj));
        obj1;
        androidhttpclient = null;
        as = null;
_L7:
        obj = androidhttpclient;
        MoPubLog.d("Failed to parse VAST XML", ((Throwable) (obj1)));
        obj = as;
        if (androidhttpclient == null) goto _L11; else goto _L10
_L10:
        androidhttpclient.close();
        return as;
        as;
        obj = null;
        if (obj != null)
        {
            ((AndroidHttpClient) (obj)).close();
        }
        throw as;
        obj1;
        as = null;
          goto _L7
_L2:
        as = null;
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onCancelled()
    {
        e e1 = (e)a.get();
        if (e1 != null)
        {
            e1.onAggregationComplete(null);
        }
    }

    protected void onPostExecute(Object obj)
    {
        obj = (List)obj;
        e e1 = (e)a.get();
        if (e1 != null)
        {
            e1.onAggregationComplete(((List) (obj)));
        }
    }
}
