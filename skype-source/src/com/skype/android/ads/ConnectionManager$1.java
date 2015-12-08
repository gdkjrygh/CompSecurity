// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import android.os.Handler;
import android.util.Log;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.skype.android.ads:
//            ConnectionManager

static final class c
    implements Runnable
{

    final HttpRequestBase a;
    final Handler b = null;
    final TPResponseListener c;

    public final void run()
    {
        Object obj;
        Object obj1;
        Object obj3;
        Object obj4;
        Object obj6;
        Object obj7;
        obj3 = null;
        obj1 = null;
        obj7 = null;
        obj4 = null;
        obj = null;
        obj6 = null;
        Object obj2 = new DefaultHttpClient();
        obj1 = obj4;
        obj = obj7;
        ((HttpClient) (obj2)).getParams().setParameter("http.useragent", ConnectionManager.a());
        obj1 = obj4;
        obj = obj7;
        HttpConnectionParams.setConnectionTimeout(((HttpClient) (obj2)).getParams(), 15000);
        obj1 = obj4;
        obj = obj7;
        HttpConnectionParams.setSoTimeout(((HttpClient) (obj2)).getParams(), 20000);
        obj1 = obj4;
        obj = obj7;
        obj3 = ((HttpClient) (obj2)).execute(a);
        obj1 = obj3;
        obj = obj3;
        if (b == null) goto _L2; else goto _L1
_L1:
        obj1 = obj3;
        obj = obj3;
        if (c == null) goto _L2; else goto _L3
_L3:
        obj1 = obj3;
        obj = obj3;
        b.post(new Runnable(((HttpResponse) (obj3))) {

            final HttpResponse a;
            final ConnectionManager._cls1 b;

            public final void run()
            {
                b.c.a(b.a, a);
            }

            
            {
                b = ConnectionManager._cls1.this;
                a = httpresponse;
                super();
            }
        });
_L5:
        if (obj3 != null)
        {
            ConnectionManager.a(((HttpResponse) (obj3)));
        }
        obj = ((HttpClient) (obj2)).getConnectionManager();
        if (obj instanceof SingleClientConnManager)
        {
            ((ClientConnectionManager) (obj)).shutdown();
        }
_L6:
        return;
_L2:
        obj1 = obj3;
        obj = obj3;
        if (c == null) goto _L5; else goto _L4
_L4:
        obj1 = obj3;
        obj = obj3;
        c.a(a, ((HttpResponse) (obj3)));
          goto _L5
        Object obj5;
        obj5;
        obj3 = obj1;
_L9:
        obj = obj2;
        obj1 = obj3;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        obj = obj2;
        obj1 = obj3;
        c.a(a, ((Exception) (obj5)));
        if (obj3 != null)
        {
            ConnectionManager.a(((HttpResponse) (obj3)));
        }
        if (obj2 != null)
        {
            try
            {
                obj = ((HttpClient) (obj2)).getConnectionManager();
                if (obj instanceof SingleClientConnManager)
                {
                    ((ClientConnectionManager) (obj)).shutdown();
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("SkypeAdConnMgr", (new StringBuilder("shutdown http connection exception ")).append(((Exception) (obj)).getMessage()).toString());
                return;
            }
        }
          goto _L6
        obj;
        Log.e("SkypeAdConnMgr", (new StringBuilder("shutdown http connection exception ")).append(((Exception) (obj)).getMessage()).toString());
        return;
        obj2;
        obj3 = obj1;
        obj1 = obj;
_L8:
        if (obj3 != null)
        {
            ConnectionManager.a(((HttpResponse) (obj3)));
        }
        if (obj1 != null)
        {
            try
            {
                obj = ((HttpClient) (obj1)).getConnectionManager();
                if (obj instanceof SingleClientConnManager)
                {
                    ((ClientConnectionManager) (obj)).shutdown();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("SkypeAdConnMgr", (new StringBuilder("shutdown http connection exception ")).append(((Exception) (obj)).getMessage()).toString());
            }
        }
        throw obj2;
        obj5;
        obj1 = obj2;
        obj3 = obj;
        obj2 = obj5;
        if (true) goto _L8; else goto _L7
_L7:
        obj5;
        obj2 = obj6;
          goto _L9
    }

    TPResponseListener(HttpRequestBase httprequestbase, TPResponseListener tpresponselistener)
    {
        a = httprequestbase;
        c = tpresponselistener;
        super();
    }
}
