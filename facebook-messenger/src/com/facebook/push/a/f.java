// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.a;

import com.facebook.analytics.cb;
import com.facebook.analytics.cm;
import com.facebook.push.c2dm.x;

// Referenced classes of package com.facebook.push.a:
//            g

public final class f
{

    public f()
    {
    }

    public static cb a(x x1, String s)
    {
        return cm.a("push_reg_server_initial_status", a(x1), null, "registration_id", s);
    }

    private static String a(x x1)
    {
        if (x1 == null)
        {
            return "not_applicable";
        }
        switch (g.a[x1.ordinal()])
        {
        default:
            return "none";

        case 1: // '\001'
            return "current";

        case 2: // '\002'
            return "expired";
        }
    }
}
