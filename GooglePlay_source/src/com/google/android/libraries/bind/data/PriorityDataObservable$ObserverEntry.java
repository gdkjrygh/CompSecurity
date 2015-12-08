// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;


// Referenced classes of package com.google.android.libraries.bind.data:
//            PriorityDataObservable, DataObserver

private static final class observer
    implements Comparable
{

    public final DataObserver observer;
    public final int priority = 0;

    public final volatile int compareTo(Object obj)
    {
        obj = (observer)obj;
        if (priority > ((priority) (obj)).priority)
        {
            return 1;
        }
        return priority >= ((priority) (obj)).priority ? 0 : -1;
    }

    public Q(DataObserver dataobserver, int i)
    {
        observer = dataobserver;
    }
}
