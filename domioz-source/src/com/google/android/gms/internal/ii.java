// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            hk, ij

public final class ii
{

    public static hk a = hk.a("gms:common:stats:logging:debug");
    public static hk b;
    public static hk c = hk.a("gms:common:stats:logging:ignored_calling_processes", "");
    public static hk d = hk.a("gms:common:stats:logging:ignored_calling_services", "");
    public static hk e = hk.a("gms:common:stats:logging:ignored_target_processes", "");
    public static hk f = hk.a("gms:common:stats:logging:ignored_target_services", "com.google.android.gms.auth.GetToken");
    public static hk g = hk.a("gms:common:stats:logging:time_out_duration", Long.valueOf(0x927c0L));

    static 
    {
        b = hk.a("gms:common:stats:logging:level", Integer.valueOf(ij.a));
    }
}
