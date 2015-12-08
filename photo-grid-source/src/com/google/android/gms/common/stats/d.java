// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import com.google.android.gms.internal.ve;

// Referenced classes of package com.google.android.gms.common.stats:
//            f

public final class d
{

    public static ve a;
    public static ve b = ve.a("gms:common:stats:connections:ignored_calling_processes", "");
    public static ve c = ve.a("gms:common:stats:connections:ignored_calling_services", "");
    public static ve d = ve.a("gms:common:stats:connections:ignored_target_processes", "");
    public static ve e = ve.a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
    public static ve f = ve.a("gms:common:stats:connections:time_out_duration", Long.valueOf(0x927c0L));

    static 
    {
        a = ve.a("gms:common:stats:connections:level", Integer.valueOf(f.b));
    }
}
