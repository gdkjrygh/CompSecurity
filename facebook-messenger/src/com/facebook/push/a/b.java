// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.a;

import com.facebook.analytics.cb;
import com.facebook.analytics.cm;
import com.facebook.push.c2dm.q;

// Referenced classes of package com.facebook.push.a:
//            c

public final class b
{

    public b()
    {
    }

    public static cb a(q q1, String s)
    {
        return cm.a("push_reg_gcm_initial_status", a(q1), null, "registration_id", s);
    }

    private static String a(q q1)
    {
        if (q1 == null)
        {
            return "not_applicable";
        }
        switch (c.a[q1.ordinal()])
        {
        default:
            return "unknown";

        case 1: // '\001'
            return "current";

        case 2: // '\002'
            return "expired";

        case 3: // '\003'
            return "wrong_type";

        case 4: // '\004'
            return "none";
        }
    }
}
