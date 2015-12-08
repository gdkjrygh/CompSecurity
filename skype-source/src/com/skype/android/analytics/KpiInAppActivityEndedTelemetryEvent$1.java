// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;


// Referenced classes of package com.skype.android.analytics:
//            KpiInAppActivityEndedTelemetryEvent

static final class gger
{

    static final int a[];

    static 
    {
        a = new int[gger.values().length];
        try
        {
            a[gger.f.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[gger.e.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
