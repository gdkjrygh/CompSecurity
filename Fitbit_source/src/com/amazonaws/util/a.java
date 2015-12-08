// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.util;

import com.amazonaws.metrics.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// Referenced classes of package com.amazonaws.util:
//            AWSRequestMetrics, v

public class a extends AWSRequestMetrics
{

    private static final Log d = LogFactory.getLog("com.amazonaws.latency");
    private static final Object e = "=";
    private static final Object f = ", ";
    private final Map b = new HashMap();
    private final Map c = new HashMap();

    public a()
    {
        super(v.b());
    }

    private void a(Object obj, Object obj1, StringBuilder stringbuilder)
    {
        stringbuilder.append(obj).append(e).append(obj1).append(f);
    }

    public void a(f f1)
    {
        a(f1.name());
    }

    public void a(f f1, long l)
    {
        a(f1.name(), l);
    }

    public void a(f f1, Object obj)
    {
        a(f1.name(), obj);
    }

    public void a(String s)
    {
        c.put(s, v.a(System.nanoTime()));
    }

    public void a(String s, long l)
    {
        a.a(s, l);
    }

    public void a(String s, Object obj)
    {
        List list = (List)b.get(s);
        Object obj1 = list;
        if (list == null)
        {
            obj1 = new ArrayList();
            b.put(s, obj1);
        }
        ((List) (obj1)).add(obj);
    }

    public void b(f f1)
    {
        b(f1.name());
    }

    public void b(String s)
    {
        v v1 = (v)c.get(s);
        if (v1 == null)
        {
            LogFactory.getLog(getClass()).warn((new StringBuilder()).append("Trying to end an event which was never started: ").append(s).toString());
            return;
        } else
        {
            v1.q();
            a.a(s, v.a(v1.f(), Long.valueOf(v1.j())));
            return;
        }
    }

    public final boolean b()
    {
        return true;
    }

    public void c()
    {
        if (d.isInfoEnabled())
        {
            StringBuilder stringbuilder = new StringBuilder();
            java.util.Map.Entry entry;
            for (Iterator iterator = b.entrySet().iterator(); iterator.hasNext(); a(entry.getKey(), entry.getValue(), stringbuilder))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            java.util.Map.Entry entry1;
            for (Iterator iterator1 = a.s().entrySet().iterator(); iterator1.hasNext(); a(entry1.getKey(), entry1.getValue(), stringbuilder))
            {
                entry1 = (java.util.Map.Entry)iterator1.next();
            }

            java.util.Map.Entry entry2;
            for (Iterator iterator2 = a.r().entrySet().iterator(); iterator2.hasNext(); a(entry2.getKey(), entry2.getValue(), stringbuilder))
            {
                entry2 = (java.util.Map.Entry)iterator2.next();
            }

            d.info(stringbuilder.toString());
        }
    }

    public void c(f f1)
    {
        c(f1.name());
    }

    public void c(String s)
    {
        a.e(s);
    }

    public List d(f f1)
    {
        return d(f1.name());
    }

    public List d(String s)
    {
        return (List)b.get(s);
    }

}
