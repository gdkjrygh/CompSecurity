// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.util.bn;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

// Referenced classes of package com.fitbit.data.bl:
//            SyncDataForLongPeriodOperation

public static class b
{

    public final int a;
    public final int b;

    public b a()
    {
        int k = a;
        int l = b + 1;
        int j = l;
        int i = k;
        if (l > 11)
        {
            j = 0;
            i = k + 1;
        }
        return new <init>(i, j);
    }

    public Date a(TimeZone timezone)
    {
        timezone = Calendar.getInstance(timezone);
        timezone.set(a, b, 1, 0, 0, 0);
        timezone.set(14, 0);
        return timezone.getTime();
    }

    public Date b()
    {
        return a(bn.b());
    }

    public Date b(TimeZone timezone)
    {
        timezone = Calendar.getInstance(timezone);
        timezone.set(a, b, 1, 23, 59, 59);
        timezone.set(14, 999);
        timezone.set(5, timezone.getActualMaximum(5));
        return timezone.getTime();
    }

    public Date c()
    {
        return b(bn.b());
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof b))
            {
                return false;
            }
            obj = (b)obj;
            if (b != ((b) (obj)).b)
            {
                return false;
            }
            if (a != ((a) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (b + 31) * 31 + a;
    }

    public _cls9(int i, int j)
    {
        a = i;
        b = j;
    }
}
