// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.http;

import android.content.Context;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.auditude.ads.util.http:
//            PersistentCookieStore

public class ConnectionManager
{

    public static final int MAX_CONNECTIONS = 10;
    private static ConnectionManager instance;
    private ArrayList active;
    private HashMap httpContextList;
    private ArrayList queue;

    public ConnectionManager()
    {
        active = new ArrayList();
        queue = new ArrayList();
        httpContextList = new HashMap();
    }

    public static ConnectionManager getInstance()
    {
        if (instance == null)
        {
            instance = new ConnectionManager();
        }
        return instance;
    }

    private void startNext()
    {
        this;
        JVM INSTR monitorenter ;
        if (!queue.isEmpty())
        {
            Runnable runnable = (Runnable)queue.get(0);
            queue.remove(0);
            active.add(runnable);
            (new Thread(runnable)).start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void didComplete(Runnable runnable)
    {
        active.remove(runnable);
        startNext();
    }

    public HttpContext getLocalContext(String s)
    {
        if (!httpContextList.containsKey(s))
        {
            BasicHttpContext basichttpcontext = new BasicHttpContext();
            Context context = (Context)AuditudeEnv.getInstance().getAdSettings().getProperty("applicationContext");
            if (context != null)
            {
                basichttpcontext.setAttribute("http.cookie-store", new PersistentCookieStore(context));
            } else
            {
                basichttpcontext.setAttribute("http.cookie-store", new BasicCookieStore());
            }
            httpContextList.put(s, basichttpcontext);
        }
        s = (HttpContext)httpContextList.get(s);
        ((CookieStore)s.getAttribute("http.cookie-store")).clearExpired(new Date());
        return s;
    }

    public void push(Runnable runnable)
    {
        queue.add(runnable);
        if (active.size() < 10)
        {
            startNext();
        }
    }
}
