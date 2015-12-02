// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;

import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.analytics.c.g;
import com.facebook.analytics.c.h;
import com.facebook.analytics.cl;
import com.facebook.analytics.i.b;
import com.facebook.common.hardware.k;
import com.facebook.config.a.c;
import com.facebook.config.b.a;
import com.facebook.device_id.l;
import com.facebook.http.protocol.aq;
import com.facebook.http.protocol.m;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.analytics.service:
//            v

public class u
{

    private static final Class a = com/facebook/analytics/service/u;
    private final a b;
    private final c c;
    private final g d;
    private final TelephonyManager e;
    private final aq f;
    private final v g;
    private final l h;
    private final k i;
    private final com.facebook.common.time.a j;

    public u(a a1, c c1, g g1, TelephonyManager telephonymanager, l l1, k k1, aq aq1, 
            v v1, com.facebook.common.time.a a2)
    {
        b = a1;
        c = c1;
        d = g1;
        e = telephonymanager;
        f = aq1;
        g = v1;
        i = k1;
        h = l1;
        j = a2;
    }

    private String a(h h1)
    {
        String s1 = d.b(h1.a);
        if (TextUtils.isEmpty(s1))
        {
            return null;
        }
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("time", h1.c);
        objectnode.put("app_id", c.b());
        objectnode.put("app_ver", b.a());
        objectnode.put("device_id", h.b());
        objectnode.put("session_id", h1.b);
        objectnode.put("seq", h1.d);
        if (h1.e != null)
        {
            objectnode.put("uid", h1.e);
        }
        String s = e.getNetworkOperatorName();
        h1 = s;
        if (TextUtils.isEmpty(s))
        {
            h1 = "n/a";
        }
        objectnode.put("carrier", h1);
        objectnode.put("device", Build.MODEL);
        objectnode.put("os_ver", android.os.Build.VERSION.RELEASE);
        objectnode.put("build_num", b.b());
        h1 = i.c();
        if (h1 != null)
        {
            h1 = h1.getTypeName();
        } else
        {
            h1 = "none";
        }
        objectnode.put("conn", h1);
        objectnode.put("sent_time", com.facebook.analytics.i.b.a(j.a()));
        objectnode.put("data", new cl((new StringBuilder()).append("[").append(s1).append("]").toString()));
        return objectnode.toString();
    }

    public void a()
    {
        Object obj;
        int i1;
        long l2;
        com.facebook.debug.log.b.b(a, "Trying to upload analytics logs.");
        if (!i.b())
        {
            com.facebook.debug.log.b.b(a, "No network connection to upload analytics right now. Bailing.");
            return;
        }
        l2 = SystemClock.elapsedRealtime();
        obj = d.b();
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Uploading!  Number of batches to upload: ").append(((List) (obj)).size()).toString());
        obj = ((List) (obj)).iterator();
        i1 = 0;
_L2:
        h h1;
        String s;
        com.facebook.http.protocol.l l1;
        int j1;
        int k1;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        h1 = (h)((Iterator) (obj)).next();
        s = a(h1);
        if (s == null)
        {
            d.a(h1.a);
            continue; /* Loop/switch isn't completed */
        }
        l1 = new com.facebook.http.protocol.l();
        l1.a(m.BOOTSTRAP);
        k1 = i1;
        j1 = i1;
        if (!((Boolean)f.a(g, com.facebook.analytics.service.v.b(s), l1)).booleanValue())
        {
            break MISSING_BLOCK_LABEL_197;
        }
        k1 = i1 + 1;
        j1 = k1;
        d.a(h1.a);
        i1 = k1;
_L3:
        if (SystemClock.elapsedRealtime() - l2 <= 0x1d4c0L)
        {
            continue; /* Loop/switch isn't completed */
        }
        com.facebook.debug.log.b.b(a, "Analytics upload taking too long. Will resume later.");
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Finished uploading. Total batches uploaded: ").append(i1).toString());
        return;
        Exception exception;
        exception;
        i1 = j1;
        com.facebook.debug.log.b.b(a, "error upload analytic logs", exception);
          goto _L3
    }

}
