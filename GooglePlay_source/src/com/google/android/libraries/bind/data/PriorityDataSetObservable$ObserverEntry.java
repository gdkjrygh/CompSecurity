// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import android.database.DataSetObserver;

// Referenced classes of package com.google.android.libraries.bind.data:
//            PriorityDataSetObservable

private static final class priority
    implements Comparable
{

    public final DataSetObserver observer;
    public final int priority;

    public final volatile int compareTo(Object obj)
    {
        obj = (priority)obj;
        if (priority > ((priority) (obj)).priority)
        {
            return 1;
        }
        return priority >= ((priority) (obj)).priority ? 0 : -1;
    }

    public (DataSetObserver datasetobserver, int i)
    {
        observer = datasetobserver;
        priority = i;
    }
}
