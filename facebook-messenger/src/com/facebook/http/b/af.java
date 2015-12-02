// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import com.facebook.analytics.e.i;
import com.facebook.inject.d;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.facebook.http.b:
//            o, l, aq, t, 
//            au, u, w, x, 
//            m

class af extends d
{

    final w a;

    private af(w w)
    {
        a = w;
        super();
    }

    af(w w, x x)
    {
        this(w);
    }

    public m a()
    {
        Object obj = new o((ClientConnectionManager)a(org/apache/http/conn/ClientConnectionManager), (HttpParams)a(org/apache/http/params/HttpParams), (l)a(com/facebook/http/b/l), (HttpRequestRetryHandler)a(com/facebook/http/b/aq), c(com/facebook/http/b/t), c(com/facebook/http/b/au), (i)a(com/facebook/analytics/e/i));
        for (Iterator iterator = c(com/facebook/http/b/u).iterator(); iterator.hasNext();)
        {
            obj = ((u)iterator.next()).a(((m) (obj)));
        }

        return ((m) (obj));
    }

    public Object b()
    {
        return a();
    }
}
