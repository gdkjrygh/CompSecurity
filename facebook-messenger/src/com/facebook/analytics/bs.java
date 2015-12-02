// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.os.SystemClock;
import com.facebook.debug.log.b;
import com.google.common.a.ev;
import com.google.common.a.fi;
import java.net.URI;
import java.util.Iterator;

// Referenced classes of package com.facebook.analytics:
//            ck, a

public abstract class bs
    implements ck
{

    private static Class b = com/facebook/analytics/bs;
    protected ev a;
    private final a c;
    private long d;

    public bs(a a1)
    {
        d = 0L;
        c = a1;
    }

    private String a(URI uri)
    {
        return (new StringBuilder()).append(b(uri)).append("_sent").toString();
    }

    private String a(URI uri, String s)
    {
        String s2 = "";
        String s1 = s2;
        if (s != null)
        {
            int i = s.indexOf("/");
            s1 = s2;
            if (i > 0)
            {
                s1 = (new StringBuilder()).append("_").append(s.substring(0, i)).toString();
            }
        }
        return (new StringBuilder()).append(b(uri)).append(s1).append("_received").toString();
    }

    private String b(URI uri)
    {
        b();
        String s = uri.toString();
        for (Iterator iterator = a.a().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (s.startsWith((String)entry.getKey()))
            {
                return (String)entry.getValue();
            }
        }

        s = uri.getAuthority();
        if (s != null && (s.contains("fbcdn") || s.contains("fbexternal")))
        {
            return "cdn";
        }
        if (c(uri))
        {
            return "other_fb";
        } else
        {
            com.facebook.debug.log.b.a(b, (new StringBuilder()).append("Uncategorized Uri: ").append(uri.toString()).toString());
            return "uncategorized";
        }
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null || SystemClock.elapsedRealtime() - d > 0x2932e00L)
        {
            d = SystemClock.elapsedRealtime();
            a = ev.a(a());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean c(URI uri)
    {
        uri = uri.getHost();
        return uri != null && uri.endsWith(".facebook.com");
    }

    public abstract ev a();

    public void a(URI uri, long l)
    {
        uri = a(uri);
        c.a(uri, l);
    }

    public void a(URI uri, String s, long l)
    {
        uri = a(uri, s);
        c.a(uri, l);
    }

    public void a(URI uri, String s, long l, long l1)
    {
        uri = a(uri, s);
        long l2 = l;
        if (l1 >= 0L)
        {
            l2 = l + l1;
        }
        c.a(uri, l2);
    }

}
