// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            MealType

static class 
{

    static final int a[];

    static 
    {
        a = new int[MealType.values().length];
        try
        {
            a[MealType.BREAKFAST.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[MealType.MORNINGSNACK.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[MealType.LUNCH.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[MealType.AFTERNOONSNACK.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[MealType.DINNER.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[MealType.EVENING_SNACK.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[MealType.ANYTIME.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
