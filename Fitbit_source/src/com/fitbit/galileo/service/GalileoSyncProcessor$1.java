// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;


// Referenced classes of package com.fitbit.galileo.service:
//            GalileoSyncProcessor

static class lper.SoftTrackerSyncError
{

    static final int a[];

    static 
    {
        a = new int[com.fitbit.pedometer.service.er.SoftTrackerSyncError.values().length];
        try
        {
            a[com.fitbit.pedometer.service.er.SoftTrackerSyncError.c.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.fitbit.pedometer.service.er.SoftTrackerSyncError.d.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.fitbit.pedometer.service.er.SoftTrackerSyncError.a.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.fitbit.pedometer.service.er.SoftTrackerSyncError.e.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
