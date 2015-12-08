// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import com.google.android.gms.internal.ds;

// Referenced classes of package com.google.android.gms.common.stats:
//            c, d

public static final class 
{

    public static ds a;
    public static ds b = ds.a("gms:common:stats:connections:ignored_calling_processes", "");
    public static ds c = ds.a("gms:common:stats:connections:ignored_calling_services", "");
    public static ds d = ds.a("gms:common:stats:connections:ignored_target_processes", "");
    public static ds e = ds.a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
    public static ds f = ds.a("gms:common:stats:connections:time_out_duration", Long.valueOf(0x927c0L));

    static 
    {
        a = ds.a("gms:common:stats:connections:level", Integer.valueOf(d.b));
    }
}
