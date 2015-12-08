// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;


// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengesFragment

static class ate
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[com.fitbit.data.domain.challenges.atus.values().length];
        try
        {
            b[com.fitbit.data.domain.challenges.atus.INVITED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            b[com.fitbit.data.domain.challenges.atus.ACTIVE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[com.fitbit.data.domain.challenges.atus.COMPLETE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[com.fitbit.data.domain.challenges.atus.UNKNOWN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        a = new int[ate.values().length];
        try
        {
            a[ate.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[ate.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[ate.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[ate.e.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ate.d.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
