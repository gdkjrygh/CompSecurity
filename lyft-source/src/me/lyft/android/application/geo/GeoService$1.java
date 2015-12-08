// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import java.util.concurrent.TimeUnit;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.geo:
//            GeoService

final class 
    implements Func1
{

    public Long call(Long long1)
    {
        long l = 1L;
        if (long1.longValue() > 0L)
        {
            long l1 = TimeUnit.SECONDS.toMinutes(long1.longValue());
            if (l1 >= 1L)
            {
                l = l1;
            }
            return Long.valueOf(l);
        } else
        {
            return Long.valueOf(0L);
        }
    }

    public volatile Object call(Object obj)
    {
        return call((Long)obj);
    }

    ()
    {
    }
}
