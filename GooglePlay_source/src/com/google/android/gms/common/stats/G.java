// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import com.google.android.gms.common.config.GservicesValue;

public final class G
{
    public static final class connections
    {

        public static GservicesValue ignoredCallingProcesses = GservicesValue.value("gms:common:stats:connections:ignored_calling_processes", "");
        public static GservicesValue ignoredCallingServices = GservicesValue.value("gms:common:stats:connections:ignored_calling_services", "");
        public static GservicesValue ignoredTargetProcesses = GservicesValue.value("gms:common:stats:connections:ignored_target_processes", "");
        public static GservicesValue ignoredTargetServices = GservicesValue.value("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
        public static GservicesValue level = GservicesValue.value("gms:common:stats:connections:level", Integer.valueOf(0));
        public static GservicesValue timeOutDurationMillis = GservicesValue.value("gms:common:stats:connections:time_out_duration", Long.valueOf(0x927c0L));

    }


    public static GservicesValue maxChunkSize = GservicesValue.value("gms:common:stats:max_chunk_size", Integer.valueOf(100));
    public static GservicesValue maxNumOfEvents = GservicesValue.value("gms:common:stats:max_num_of_events", Integer.valueOf(100));

}
