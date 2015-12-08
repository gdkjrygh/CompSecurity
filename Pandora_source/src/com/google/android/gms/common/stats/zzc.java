// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import com.google.android.gms.internal.zzhc;

// Referenced classes of package com.google.android.gms.common.stats:
//            zzd

public final class zzc
{
    public static final class zza
    {

        public static zzhc zzVk;
        public static zzhc zzVl = zzhc.zzr("gms:common:stats:connections:ignored_calling_processes", "");
        public static zzhc zzVm = zzhc.zzr("gms:common:stats:connections:ignored_calling_services", "");
        public static zzhc zzVn = zzhc.zzr("gms:common:stats:connections:ignored_target_processes", "");
        public static zzhc zzVo = zzhc.zzr("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
        public static zzhc zzVp = zzhc.zza("gms:common:stats:connections:time_out_duration", Long.valueOf(0x927c0L));

        static 
        {
            zzVk = zzhc.zza("gms:common:stats:connections:level", Integer.valueOf(zzd.zzVq));
        }
    }


    public static zzhc zzVj = zzhc.zzg("gms:common:stats:debug", false);

}
