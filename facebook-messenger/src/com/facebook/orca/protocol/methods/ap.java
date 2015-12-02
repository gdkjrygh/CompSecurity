// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.facebook.c.j;
import com.facebook.common.w.e;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            aq, ao

class ap
{

    final ao a;
    private final long b;
    private boolean c;
    private boolean d;
    private BroadcastReceiver e;
    private int f;

    public ap(ao ao1, long l)
    {
        a = ao1;
        super();
        f = -1;
        b = l;
    }

    static int a(ap ap1)
    {
        return ap1.f;
    }

    static boolean b(ap ap1)
    {
        return ap1.c;
    }

    public void a()
    {
        (new IntentFilter()).addAction("com.facebook.push.mqtt.ACTION_MQTT_PUBLISH_ARRIVED");
        aq aq1 = new aq(this);
        ao.b(a).a("com.facebook.push.mqtt.ACTION_MQTT_PUBLISH_ARRIVED", aq1, null, ao.a(a));
    }

    public void a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = "/send_message_response".equals(s);
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        try
        {
            s = ao.c(a).readTree(s1);
            if (com.facebook.common.w.e.c(s.get("msgid")) == b)
            {
                c = s.get("succeeded").booleanValue();
                f = com.facebook.common.w.e.a(s.get("errno"), -1);
                d = true;
                notifyAll();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            this;
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw s;
    }

    public boolean a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        l1 = System.currentTimeMillis() + l;
        l = l1 - System.currentTimeMillis();
_L1:
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (d)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        wait(l);
        l = l1 - System.currentTimeMillis();
          goto _L1
        boolean flag = d;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void b()
    {
        if (e != null)
        {
            ao.a(a).unregisterReceiver(e);
        }
    }
}
