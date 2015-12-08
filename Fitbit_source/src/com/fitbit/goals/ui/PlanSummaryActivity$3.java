// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.goals.ui;


// Referenced classes of package com.fitbit.goals.ui:
//            PlanSummaryActivity

static class evel
{

    static final int a[];

    static 
    {
        a = new int[com.fitbit.data.domain.l.values().length];
        try
        {
            a[com.fitbit.data.domain.l.EASIER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.fitbit.data.domain.l.MEDIUM.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.fitbit.data.domain.l.KINDA_HARD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.fitbit.data.domain.l.HARDER.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
