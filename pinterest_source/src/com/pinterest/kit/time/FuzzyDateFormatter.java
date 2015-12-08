// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.time;

import java.util.Date;

// Referenced classes of package com.pinterest.kit.time:
//            TimeDifference, TimeUnit, FuzzyDateMessages

public class FuzzyDateFormatter
{

    public static String a(TimeDifference timedifference)
    {
        return a(timedifference, false);
    }

    private static String a(TimeDifference timedifference, boolean flag)
    {
        if (timedifference == null)
        {
            throw new IllegalArgumentException("Parameter \"timeDifference\" should not be null!");
        }
        switch (_cls1.a[timedifference.a().ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            if (!flag)
            {
                return FuzzyDateMessages.a();
            } else
            {
                return FuzzyDateMessages.a(timedifference.b(), flag);
            }

        case 2: // '\002'
            return FuzzyDateMessages.b(timedifference.b(), flag);

        case 3: // '\003'
            return FuzzyDateMessages.c(timedifference.b(), flag);

        case 4: // '\004'
            return FuzzyDateMessages.d(timedifference.b(), flag);

        case 5: // '\005'
            return FuzzyDateMessages.e(timedifference.b(), flag);

        case 6: // '\006'
            return FuzzyDateMessages.f(timedifference.b(), flag);

        case 7: // '\007'
            return FuzzyDateMessages.g(timedifference.b(), flag);
        }
    }

    public static String a(Date date)
    {
        return a(date, false);
    }

    public static String a(Date date, boolean flag)
    {
        return a(TimeDifference.a(date), flag);
    }

    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[TimeUnit.values().length];
            try
            {
                a[TimeUnit.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[TimeUnit.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[TimeUnit.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[TimeUnit.d.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[TimeUnit.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[TimeUnit.f.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[TimeUnit.g.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
