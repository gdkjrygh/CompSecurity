// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.Context;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;
import com.facebook.base.c;
import com.facebook.debug.log.b;
import com.facebook.mqtt.x;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;
import com.facebook.push.b.a;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.push.mqtt:
//            aj, ak, v, am, 
//            al

public class ai
    implements c
{

    private static final Class a = com/facebook/push/mqtt/ai;
    private final Context b;
    private final com.facebook.common.v.a c;
    private final com.facebook.common.v.d d;
    private final v e;
    private final com.facebook.common.executors.a f;
    private final d g;
    private final javax.inject.a h;
    private final f i = new ak(this);
    private final ExecutorService j;
    private q k;
    private boolean l;
    private boolean m;
    private boolean n;
    private final Runnable o = new aj(this);

    public ai(Context context, com.facebook.common.v.a a1, com.facebook.common.v.d d1, v v1, com.facebook.common.executors.a a2, d d2, javax.inject.a a3, 
            ExecutorService executorservice)
    {
        b = context;
        c = a1;
        d = d1;
        e = v1;
        f = a2;
        g = d2;
        h = a3;
        j = executorservice;
    }

    static v a(ai ai1)
    {
        return ai1.e;
    }

    private void a(ae ae1)
    {
        if (a.a.equals(ae1))
        {
            boolean flag = g.a(a.a, true);
            ae1 = new ObjectNode(JsonNodeFactory.instance);
            ae1.put("make_user_available_when_in_foreground", flag);
            e.a("/set_client_settings", ae1, x.FIRE_AND_FORGET);
        }
    }

    static void a(ai ai1, ae ae1)
    {
        ai1.a(ae1);
    }

    static boolean a(ai ai1, boolean flag)
    {
        ai1.l = flag;
        return flag;
    }

    private boolean a(boolean flag, boolean flag1)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("foreground", flag);
        if (((Boolean)h.b()).booleanValue())
        {
            objectnode.put("foreground_device", flag1);
        }
        flag1 = e.a(flag);
        int i1;
        if (flag1)
        {
            i1 = e.b(flag);
            com.facebook.debug.log.b.b(a, "Sending /foreground_state appstate:%b with keepalive_timeout:%d seconds", new Object[] {
                Boolean.valueOf(flag), Integer.valueOf(i1)
            });
            objectnode.put("keepalive_timeout", i1);
        } else
        {
            i1 = 0;
        }
        com.facebook.debug.log.b.b(a, "Submitting publish foreground state runnable.");
        j.submit(new am(this, objectnode, flag1, i1));
        return true;
    }

    static Class c()
    {
        return a;
    }

    public void a()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(com.facebook.common.v.a.a);
        intentfilter.addAction(com.facebook.common.v.d.a);
        k = new al(this, b, intentfilter);
        k.a();
        g.a(i);
    }

    void b()
    {
        boolean flag = c.b(10000L);
        boolean flag1 = d.a(10000L);
        if ((m != flag || n != flag1) && a(flag, flag1))
        {
            m = flag;
            n = flag1;
        }
        if ((flag || flag1) && !l)
        {
            f.a(o, 60000L);
            l = true;
        }
    }

}
