// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class asv
{
    public static final class a
    {

        public static atr a;
        public static atr b = atr.a("gms:common:stats:connections:ignored_calling_processes", "");
        public static atr c = atr.a("gms:common:stats:connections:ignored_calling_services", "");
        public static atr d = atr.a("gms:common:stats:connections:ignored_target_processes", "");
        public static atr e = atr.a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
        public static atr f = atr.a("gms:common:stats:connections:time_out_duration", Long.valueOf(0x927c0L));

        static 
        {
            a = atr.a("gms:common:stats:connections:level", Integer.valueOf(asw.a));
        }
    }


    public static atr a = atr.a("gms:common:stats:debug", false);
    public static atr b = atr.a("gms:common:stats:max_num_of_events", Integer.valueOf(100));

}
