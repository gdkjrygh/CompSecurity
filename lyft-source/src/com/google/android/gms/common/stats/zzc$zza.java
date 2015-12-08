// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import com.google.android.gms.internal.zzkf;

// Referenced classes of package com.google.android.gms.common.stats:
//            zzd

public final class 
{

    public static zzkf a;
    public static zzkf b = zzkf.a("gms:common:stats:connections:ignored_calling_processes", "");
    public static zzkf c = zzkf.a("gms:common:stats:connections:ignored_calling_services", "");
    public static zzkf d = zzkf.a("gms:common:stats:connections:ignored_target_processes", "");
    public static zzkf e = zzkf.a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
    public static zzkf f = zzkf.a("gms:common:stats:connections:time_out_duration", Long.valueOf(0x927c0L));

    static 
    {
        a = zzkf.a("gms:common:stats:connections:level", Integer.valueOf(zzd.a));
    }
}
