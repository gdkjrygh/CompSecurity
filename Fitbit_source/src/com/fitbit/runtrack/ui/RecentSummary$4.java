// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.data.domain.Type;
import com.fitbit.runtrack.SupportedActivity;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecentSummary

static class 
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[Type.values().length];
        try
        {
            b[Type.MOBILE_RUN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        a = new int[SupportedActivity.values().length];
        try
        {
            a[SupportedActivity.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[SupportedActivity.c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[SupportedActivity.b.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[SupportedActivity.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
