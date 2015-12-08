// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.b;


// Referenced classes of package com.fitbit.b:
//            a

static class ieldError
{

    static final int a[];

    static 
    {
        a = new int[com.fitbit.data.domain.rLogEntry.WaterUnits.values().length];
        try
        {
            a[com.fitbit.data.domain.rLogEntry.WaterUnits.CUP.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.fitbit.data.domain.rLogEntry.WaterUnits.ML.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.fitbit.data.domain.rLogEntry.WaterUnits.OZ.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
