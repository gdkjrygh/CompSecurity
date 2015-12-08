// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Scheduler;
import rx.schedulers.Timestamped;

final class maxAgeInMillis extends maxAgeInMillis
{

    private static final long serialVersionUID = 0x2ffd21f3bea38aacL;
    final int limit;
    final long maxAgeInMillis;
    final Scheduler scheduler;

    Object enterTransform(Object obj)
    {
        return new Timestamped(scheduler.now(), obj);
    }

    Object leaveTransform(Object obj)
    {
        return ((Timestamped)obj).getValue();
    }

    void truncate()
    {
        long l = scheduler.now();
        long l1 = maxAgeInMillis;
        scheduler scheduler2 = (maxAgeInMillis)get();
        scheduler scheduler1 = (get)scheduler2.get();
        int i = 0;
        do
        {
            if (scheduler1 == null)
            {
                break;
            }
            if (size > limit)
            {
                i++;
                size = size - 1;
                scheduler scheduler3 = (size)scheduler1.size();
                scheduler2 = scheduler1;
                scheduler1 = scheduler3;
                continue;
            }
            if (((Timestamped)scheduler1.size).getTimestampMillis() > l - l1)
            {
                break;
            }
            i++;
            size = size - 1;
            scheduler scheduler4 = (size)scheduler1.size();
            scheduler2 = scheduler1;
            scheduler1 = scheduler4;
        } while (true);
        if (i != 0)
        {
            setFirst(scheduler2);
        }
    }

    void truncateFinal()
    {
        long l = scheduler.now();
        long l1 = maxAgeInMillis;
        setFirst setfirst = (maxAgeInMillis)get();
        setFirst setfirst2 = (get)setfirst.get();
        int i = 0;
        setFirst setfirst4 = setfirst;
        for (setFirst setfirst1 = setfirst2; setfirst1 != null && size > 1 && ((Timestamped)setfirst1.size).getTimestampMillis() <= l - l1;)
        {
            i++;
            size = size - 1;
            setfirst4 = (size)setfirst1.size();
            setFirst setfirst3 = setfirst1;
            setfirst1 = setfirst4;
            setfirst4 = setfirst3;
        }

        if (i != 0)
        {
            setFirst(setfirst4);
        }
    }

    public (int i, long l, Scheduler scheduler1)
    {
        scheduler = scheduler1;
        limit = i;
        maxAgeInMillis = l;
    }
}
