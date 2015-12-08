// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import com.google.android.gms.d.h;

// Referenced classes of package com.google.android.gms.common.stats:
//            f

public final class d
{

    public static h a;
    public static h b = h.a("gms:common:stats:connections:ignored_calling_processes", "");
    public static h c = h.a("gms:common:stats:connections:ignored_calling_services", "");
    public static h d = h.a("gms:common:stats:connections:ignored_target_processes", "");
    public static h e = h.a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
    public static h f = h.a("gms:common:stats:connections:time_out_duration", Long.valueOf(0x927c0L));

    static 
    {
        a = h.a("gms:common:stats:connections:level", Integer.valueOf(f.a));
    }
}
