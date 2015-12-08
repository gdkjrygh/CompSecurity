// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.b;


// Referenced classes of package com.fitbit.b:
//            b

static class ieldError
{

    static final int a[];

    static 
    {
        a = new int[com.fitbit.data.domain.htLogEntry.WeightUnits.values().length];
        try
        {
            a[com.fitbit.data.domain.htLogEntry.WeightUnits.GRAMS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.fitbit.data.domain.htLogEntry.WeightUnits.KG.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.fitbit.data.domain.htLogEntry.WeightUnits.LBS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.fitbit.data.domain.htLogEntry.WeightUnits.STONE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
