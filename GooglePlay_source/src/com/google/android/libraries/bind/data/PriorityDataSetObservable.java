// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import android.database.DataSetObserver;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class PriorityDataSetObservable
{
    private static final class ObserverEntry
        implements Comparable
    {

        public final DataSetObserver observer;
        public final int priority;

        public final volatile int compareTo(Object obj)
        {
            obj = (ObserverEntry)obj;
            if (priority > ((ObserverEntry) (obj)).priority)
            {
                return 1;
            }
            return priority >= ((ObserverEntry) (obj)).priority ? 0 : -1;
        }

        public ObserverEntry(DataSetObserver datasetobserver, int i)
        {
            observer = datasetobserver;
            priority = i;
        }
    }


    final List observerEntries;

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(String.format(Locale.US, "  observers count: %d\n", new Object[] {
            Integer.valueOf(observerEntries.size())
        }));
        for (Iterator iterator = observerEntries.iterator(); iterator.hasNext(); stringbuilder.append("\n"))
        {
            ObserverEntry observerentry = (ObserverEntry)iterator.next();
            stringbuilder.append("    ");
            stringbuilder.append(observerentry.toString());
        }

        return stringbuilder.toString();
    }
}
