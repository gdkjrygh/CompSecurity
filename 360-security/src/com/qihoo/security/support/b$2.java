// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.support;

import android.content.Context;
import com.qihoo.security.d.a;
import com.qihoo.security.service.d;
import com.qihoo360.mobilesafe.b.o;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;

// Referenced classes of package com.qihoo.security.support:
//            b

static final class a
    implements Runnable
{

    final Context a;

    public void run()
    {
        HttpClient httpclient = com.qihoo.security.g.a.a(com.qihoo.security.g.a.a(a, new a(a)));
        String s = o.a();
        if (!s.equals(a.getPackageName()))
        {
            d.a("Statistician2", Integer.valueOf(httpclient.hashCode()));
        }
        b.b(a, httpclient);
        com.qihoo.security.support.b.a(a, httpclient);
        b.c(a, httpclient);
        if (!s.equals(a.getPackageName()))
        {
            d.b("Statistician2", Integer.valueOf(httpclient.hashCode()));
        }
        if (httpclient != null)
        {
            httpclient.getConnectionManager().shutdown();
        }
_L2:
        return;
        Object obj;
        obj;
        if (httpclient == null) goto _L2; else goto _L1
_L1:
        httpclient.getConnectionManager().shutdown();
        return;
        obj;
        if (httpclient != null)
        {
            httpclient.getConnectionManager().shutdown();
        }
        throw obj;
    }

    ectionManager(Context context)
    {
        a = context;
        super();
    }
}
