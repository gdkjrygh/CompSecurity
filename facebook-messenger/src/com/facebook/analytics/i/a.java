// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.i;

import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.Process;
import com.facebook.analytics.b.b;
import com.facebook.analytics.cache.d;
import com.facebook.analytics.cb;
import com.facebook.analytics.cl;
import com.facebook.common.hardware.k;
import com.facebook.common.w.n;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.ev;
import com.google.common.a.fi;
import java.util.Iterator;
import java.util.Set;

public class a
{

    private final k a;
    private final com.facebook.analytics.a b;
    private final d c;
    private final com.facebook.analytics.j.a d;
    private final Set e;
    private final b f;
    private long g;
    private long h;

    public a(k k1, com.facebook.analytics.a a1, d d1, com.facebook.analytics.j.a a2, Set set, b b1)
    {
        a = k1;
        b = a1;
        c = d1;
        d = a2;
        f = b1;
        e = fi.a(set);
        g = 0L;
        h = 0L;
        a();
    }

    private void a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            int i = Process.myUid();
            long l = TrafficStats.getUidRxBytes(i);
            if (l != -1L)
            {
                g = l;
            }
            l = TrafficStats.getUidTxBytes(i);
            if (l != -1L)
            {
                h = l;
            }
        }
    }

    private void a(cb cb1, String s, NetworkInfo networkinfo)
    {
        if (networkinfo != null)
        {
            String s2 = networkinfo.getTypeName();
            String s3 = (new StringBuilder()).append(s).append("connection").toString();
            String s1 = s2;
            if (n.a(s2))
            {
                s1 = "none";
            }
            cb1.b(s3, s1);
            networkinfo = networkinfo.getSubtypeName();
            if (!n.a(networkinfo))
            {
                cb1.b((new StringBuilder()).append(s).append("connection_subtype").toString(), networkinfo);
            }
        }
    }

    private void b()
    {
        long l;
        long l3;
        long l4;
label0:
        {
            l3 = -1L;
            l = g;
            l4 = h;
            a();
            long l1 = g - l;
            if (l1 >= 0L)
            {
                l = l1;
                if (l1 <= 0x1f400000L)
                {
                    break label0;
                }
            }
            l = -1L;
        }
        l4 = h - l4;
        long l2 = l3;
        if (l4 >= 0L)
        {
            if (l4 > 0x1f400000L)
            {
                l2 = l3;
            } else
            {
                l2 = l4;
            }
        }
        b.b("total_bytes_received", l);
        b.b("total_bytes_sent", l2);
    }

    public String a(NetworkInfo networkinfo)
    {
        if (networkinfo == null || n.a(networkinfo.getTypeName()))
        {
            return "unknown";
        }
        if (n.a(networkinfo.getSubtypeName()))
        {
            return networkinfo.getTypeName();
        } else
        {
            return (new StringBuilder()).append(networkinfo.getTypeName()).append(".").append(networkinfo.getSubtypeName().replace('.', '_').replace(' ', '_')).toString();
        }
    }

    public void a(NetworkInfo networkinfo, cb cb1)
    {
        b();
        b.a(cb1);
        cb1.a("connection", a(networkinfo));
        cb1.a("counters", b.c().toString());
        b.b();
    }

    public void a(cb cb1)
    {
        a(cb1, "", a.c());
    }

    public void a(cb cb1, NetworkInfo networkinfo)
    {
        a(cb1, "previous_", networkinfo);
    }

    public boolean a(NetworkInfo networkinfo, NetworkInfo networkinfo1)
    {
        if (networkinfo != null) goto _L2; else goto _L1
_L1:
        if (networkinfo1 != null) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (networkinfo1 == null)
        {
            return false;
        }
        if (networkinfo.getType() != networkinfo1.getType() || networkinfo.getSubtype() != networkinfo1.getSubtype())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void b(cb cb1)
    {
        c.a(cb1);
        c.b();
    }

    public void c(cb cb1)
    {
        d.a(cb1);
        d.b();
    }

    public void d(cb cb1)
    {
        if (f != null)
        {
            for (Iterator iterator = f.a().a().iterator(); iterator.hasNext();)
            {
                Object obj = (java.util.Map.Entry)iterator.next();
                String s = (String)((java.util.Map.Entry) (obj)).getKey();
                obj = ((ev)((java.util.Map.Entry) (obj)).getValue()).a().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                    cb1.a((new StringBuilder()).append(s).append("_").append((String)entry.getKey()).toString(), new cl(entry.getValue().toString()));
                }
            }

        }
    }

    public void e(cb cb1)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        ObjectNode objectnode1 = new ObjectNode(JsonNodeFactory.instance);
        com.facebook.analytics.d.a a1;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); objectnode1.put(a1.a(), a1.c()))
        {
            a1 = (com.facebook.analytics.d.a)iterator.next();
            objectnode.put(a1.a(), a1.b());
        }

        cb1.a("features", objectnode);
        cb1.a("features_extra_data", objectnode1);
    }
}
