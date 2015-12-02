// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.server;

import android.net.Uri;
import com.facebook.base.broadcast.a;
import com.facebook.common.w.n;
import com.facebook.http.c.i;
import com.facebook.http.c.j;
import com.facebook.http.f.c;
import com.facebook.mqtt.t;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;

// Referenced classes of package com.facebook.config.server:
//            j, c, q, i, 
//            a

class b
    implements com.facebook.config.server.j
{

    private static final Class a = com/facebook/config/server/b;
    private final d b;
    private final a c;
    private final javax.inject.a d;
    private final javax.inject.a e;
    private final com.facebook.config.a.a f;
    private final f g = new com.facebook.config.server.c(this);
    private final com.facebook.common.v.a h;
    private final String i;
    private final i j;
    private final t k = new t("orcart.facebook.com", 5228, 443, true);
    private i l;
    private i m;
    private t n;
    private boolean o;

    public b(d d1, a a1, javax.inject.a a2, javax.inject.a a3, com.facebook.config.a.a a4, com.facebook.common.v.a a5, q q1)
    {
        b = d1;
        c = a1;
        d = a2;
        e = a3;
        f = a4;
        h = a5;
        d1.a(g);
        i = q1.a();
        j = new com.facebook.config.server.i(new j("facebook.com", true), a5, i);
    }

    private i a(String s, boolean flag)
    {
        return new com.facebook.config.server.i(new j(s, flag), h, e());
    }

    static void a(b b1, ae ae1)
    {
        b1.a(ae1);
    }

    private void a(ae ae1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!ae1.a(c.i)) goto _L2; else goto _L1
_L1:
        if (l != null)
        {
            l = null;
            o = false;
            c.a("com.facebook.config.server.ACTION_SERVER_CONFIG_CHANGED");
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (ae1.a(c.l) && n != null)
        {
            n = null;
            c.a("com.facebook.mqtt.ACTION_MQTT_CONFIG_CHANGED");
        }
        if (true) goto _L4; else goto _L3
_L3:
        ae1;
        throw ae1;
    }

    private boolean f()
    {
        return ((Boolean)d.b()).booleanValue() || f.h() != com.facebook.config.a.b.PUBLIC;
    }

    private void g()
    {
        if (l == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        if (f())
        {
            s = b.a(c.j, "default");
            if (!"intern".equals(s))
            {
                break; /* Loop/switch isn't completed */
            }
            l = a("intern.facebook.com", false);
        }
_L4:
        if (l == null)
        {
            l = j;
            o = true;
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if ("dev".equals(s))
        {
            l = a("dev.facebook.com", false);
        } else
        if ("sandbox".equals(s))
        {
            String s1 = b.a(c.k, null);
            if (!com.facebook.common.w.n.a(s1))
            {
                try
                {
                    Uri.parse(s1);
                }
                catch (Throwable throwable)
                {
                    com.facebook.debug.log.b.d(a, "Failed to parse web sandbox URL", throwable);
                }
                l = a(s1, false);
            }
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void h()
    {
        if (n == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        if (!f() || !"sandbox".equals(b.a(c.m, "default")))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        obj = b.a(c.n, null);
        if (com.facebook.common.w.n.a(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (!((String) (obj)).contains(":"))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        obj = ((String) (obj)).split(":", 2);
        String s = obj[0];
        try
        {
            int i1 = Integer.parseInt(obj[1]);
            n = new t(s, i1, i1, false);
        }
        catch (Throwable throwable)
        {
            com.facebook.debug.log.b.d(a, "Failed to parse mqtt sandbox URL", throwable);
        }
        if (n == null)
        {
            n = k;
            return;
        }
        continue; /* Loop/switch isn't completed */
        n = new t(((String) (obj)), 8883, 8883, false);
        break MISSING_BLOCK_LABEL_101;
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void i()
    {
        if (m != null)
        {
            return;
        }
        if (((Boolean)e.b()).booleanValue())
        {
            m = new com.facebook.config.server.i(new com.facebook.config.server.a(), h, e());
            return;
        } else
        {
            m = l;
            return;
        }
    }

    public i a()
    {
        this;
        JVM INSTR monitorenter ;
        i i1;
        g();
        i1 = l;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public i b()
    {
        return j;
    }

    public i c()
    {
        this;
        JVM INSTR monitorenter ;
        i i1;
        i();
        i1 = m;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public t d()
    {
        this;
        JVM INSTR monitorenter ;
        t t1;
        h();
        t1 = n;
        this;
        JVM INSTR monitorexit ;
        return t1;
        Exception exception;
        exception;
        throw exception;
    }

    public String e()
    {
        return i;
    }

}
