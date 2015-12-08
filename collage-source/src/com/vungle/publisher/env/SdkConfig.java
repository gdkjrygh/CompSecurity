// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.env;

import android.content.Context;
import android.content.SharedPreferences;
import com.vungle.log.Logger;
import com.vungle.publisher.EventListener;
import com.vungle.publisher.ca;
import com.vungle.publisher.co;
import com.vungle.publisher.de;
import com.vungle.publisher.event.ClientEventListenerAdapter;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

public class SdkConfig
{

    public final Map a = new HashMap();
    public boolean b;
    public final Set c = EnumSet.noneOf(com/vungle/publisher/co);
    public int d;
    public String e;
    public long f;
    public long g;
    com.vungle.publisher.event.ClientEventListenerAdapter.Factory h;
    Context i;
    public SharedPreferences j;

    SdkConfig()
    {
        e = "isExceptionReportingEnabled";
    }

    public final void a()
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((ca)iterator.next()).unregister()) { }
        a.clear();
    }

    public final void a(long l)
    {
        Logger.d("VungleConfig", (new StringBuilder("setting last app fingerprint timestamp to ")).append(l).toString());
        f = l;
    }

    public final transient void a(EventListener aeventlistener[])
    {
        if (aeventlistener != null)
        {
            int l = aeventlistener.length;
            int k = 0;
            while (k < l) 
            {
                EventListener eventlistener = aeventlistener[k];
                if (eventlistener == null)
                {
                    Logger.d("VungleEvent", "ignoring add null event listener");
                } else
                {
                    boolean flag;
                    if (!a.containsKey(eventlistener))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        Logger.d("VungleEvent", (new StringBuilder("adding event listener ")).append(eventlistener).toString());
                        ClientEventListenerAdapter clienteventlisteneradapter = (ClientEventListenerAdapter)h.a.get();
                        clienteventlisteneradapter.a = eventlistener;
                        a.put(eventlistener, clienteventlisteneradapter);
                        clienteventlisteneradapter.registerSticky();
                    } else
                    {
                        Logger.d("VungleEvent", (new StringBuilder("already added event listener ")).append(eventlistener).toString());
                    }
                }
                k++;
            }
        }
    }

    public final transient void a(co aco[])
    {
        Logger.d("VungleConfig", (new StringBuilder("setting ad streaming connectivity types ")).append(de.b(aco)).toString());
        c.clear();
        if (aco != null)
        {
            int l = aco.length;
            for (int k = 0; k < l; k++)
            {
                co co1 = aco[k];
                if (co1 != null)
                {
                    c.add(co1);
                }
            }

        }
    }

    public final boolean b()
    {
        Logger.d("VungleConfig", (new StringBuilder("isExceptionReportingEnabled: ")).append(j.getBoolean(e, false)).toString());
        return j.getBoolean(e, false);
    }
}
