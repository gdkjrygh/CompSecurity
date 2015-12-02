// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.device_id;

import com.facebook.base.c;
import com.facebook.common.h.a;
import com.facebook.common.w.i;
import com.facebook.debug.log.b;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import java.util.UUID;

// Referenced classes of package com.facebook.device_id:
//            i

public class l
    implements c
{

    private static final Class a = com/facebook/device_id/l;
    private volatile com.facebook.device_id.i b;
    private final d c;
    private final com.facebook.common.time.a d;

    public l(d d1, com.facebook.common.time.a a1)
    {
        c = d1;
        d = a1;
    }

    public static com.facebook.device_id.i a(com.facebook.common.time.a a1)
    {
        return new com.facebook.device_id.i(com.facebook.common.h.a.a().toString(), a1.a());
    }

    private void e()
    {
        com.facebook.debug.log.b.b(a, "loading device id from shared prefs");
        String s = c.a(aj.e, null);
        long l1 = c.a(aj.f, 0x7fffffffffffffffL);
        if (s == null || l1 == 0x7fffffffffffffffL)
        {
            b = a(d);
            f();
        } else
        {
            b = new com.facebook.device_id.i(s, l1);
        }
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("loaded device id from shared prefs: ").append(b).toString());
    }

    private void f()
    {
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("saving device id from shared prefs: ").append(b).toString());
        com.facebook.device_id.i j = b;
        c.b().a(aj.f, j.b()).a(aj.e, j.a()).a();
    }

    public void a()
    {
        e();
    }

    public void a(com.facebook.device_id.i j)
    {
        b = j;
        f();
    }

    public String b()
    {
        if (b == null)
        {
            return null;
        } else
        {
            return b.a();
        }
    }

    public String c()
    {
        return i.a(b()).substring(0, 20);
    }

    public com.facebook.device_id.i d()
    {
        return b;
    }

}
