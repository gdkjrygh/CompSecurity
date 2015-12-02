// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.a;

import com.facebook.abtest.qe.c;
import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.debug.log.b;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.d.a.i;

// Referenced classes of package com.facebook.orca.a:
//            j, l, m

public class k
{

    private static final Class a = com/facebook/orca/a/k;
    private final c b;
    private j c;

    public k(c c1)
    {
        c = j.a;
        b = c1;
        b();
    }

    private void a(QuickExperimentInfo quickexperimentinfo)
    {
        Object obj;
        Optional optional;
        Optional optional1;
        Optional optional2;
        Optional optional3;
        if (Objects.equal("local_default_group", quickexperimentinfo.b()))
        {
            com.facebook.debug.log.b.b(a, "Using local default group");
            return;
        }
        obj = quickexperimentinfo.a("mqtt_pub_ack_timeout_ms");
        optional = quickexperimentinfo.a("mqtt_publish_timeout_ms");
        optional1 = quickexperimentinfo.a("mqtt_attempt_count");
        optional2 = quickexperimentinfo.a("mqtt_connect_timeout_ms");
        optional3 = quickexperimentinfo.a("mqtt_connect_attempt_count");
        quickexperimentinfo = quickexperimentinfo.a("mqtt_sleep_time_between_connection_attempts");
        obj = new j(Long.parseLong((String)((Optional) (obj)).get()), Long.parseLong((String)optional.get()), Integer.parseInt((String)optional1.get()), Long.parseLong((String)optional2.get()), Integer.parseInt((String)optional3.get()), Long.parseLong((String)quickexperimentinfo.get()));
        synchronized (c)
        {
            c = ((j) (obj));
        }
        return;
        exception;
        quickexperimentinfo;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (QuickExperimentInfo quickexperimentinfo)
        {
            com.facebook.debug.log.b.e(a, "error parsing experiment parameters - missing or invalid: %s", new Object[] {
                quickexperimentinfo.toString()
            });
        }
        return;
    }

    static void a(k k1, QuickExperimentInfo quickexperimentinfo)
    {
        k1.a(quickexperimentinfo);
    }

    static Class c()
    {
        return a;
    }

    public j a()
    {
        j j2;
        synchronized (c)
        {
            j2 = c;
        }
        return j2;
        exception;
        j1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
        com.facebook.debug.log.b.b(a, "Init");
        i.a(b.a("android_messenger_send_message_parameters", new l(this)), new m(this));
    }

}
