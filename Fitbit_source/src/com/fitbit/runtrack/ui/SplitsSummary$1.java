// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.runtrack.SupportedActivity;

// Referenced classes of package com.fitbit.runtrack.ui:
//            SplitsSummary

static class 
{

    static final int a[];

    static 
    {
        a = new int[SupportedActivity.values().length];
        try
        {
            a[SupportedActivity.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[SupportedActivity.c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[SupportedActivity.b.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
