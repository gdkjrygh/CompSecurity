// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import rx.functions.Action0;

// Referenced classes of package rx.schedulers:
//            TrampolineScheduler

final class <init>
    implements Comparable
{

    final Action0 action;
    final int count;
    final Long execTime;

    public volatile int compareTo(Object obj)
    {
        return compareTo((compareTo)obj);
    }

    public int compareTo(compareTo compareto)
    {
        int j = execTime.compareTo(compareto.execTime);
        int i = j;
        if (j == 0)
        {
            i = TrampolineScheduler.access$300(count, compareto.count);
        }
        return i;
    }

    private (Action0 action0, Long long1, int i)
    {
        action = action0;
        execTime = long1;
        count = i;
    }

    count(Action0 action0, Long long1, int i, count count1)
    {
        this(action0, long1, i);
    }
}
