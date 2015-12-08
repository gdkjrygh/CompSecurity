// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.google.android.libraries.bind.async.AsyncUtil;
import com.google.android.libraries.bind.view.ViewHeap;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.libraries.bind.data:
//            PriorityDataSetObservable, Data

public abstract class DataAdapter
    implements ListAdapter, SpinnerAdapter
{

    private final PriorityDataSetObservable observable;
    protected final ViewHeap viewHeap;

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    public int getCount()
    {
        return 0;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return getView(i, view, viewgroup);
    }

    public volatile Object getItem(int i)
    {
        throw new NullPointerException();
    }

    public long getItemId(int i)
    {
        throw new NullPointerException();
    }

    public int getItemViewType(int i)
    {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        AsyncUtil.checkMainThread();
        throw new NullPointerException();
    }

    public abstract View getView$7f88da85(int i, View view, Data data);

    public int getViewTypeCount()
    {
        return 1;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public boolean isEnabled(int i)
    {
        return true;
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        registerDataSetObserver(datasetobserver, 0);
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver, int i)
    {
        PriorityDataSetObservable prioritydatasetobservable = observable;
        if (datasetobserver == null)
        {
            throw new IllegalArgumentException("Observer is null");
        } else
        {
            prioritydatasetobservable.observerEntries.isEmpty();
            datasetobserver = new PriorityDataSetObservable.ObserverEntry(datasetobserver, i);
            prioritydatasetobservable.observerEntries.add(datasetobserver);
            Collections.sort(prioritydatasetobservable.observerEntries);
            return;
        }
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        PriorityDataSetObservable prioritydatasetobservable;
        prioritydatasetobservable = observable;
        if (datasetobserver == null)
        {
            throw new IllegalArgumentException("Observer is null");
        }
        if (prioritydatasetobservable.observerEntries.isEmpty()) goto _L2; else goto _L1
_L1:
        int i = 0;
_L8:
        if (i >= prioritydatasetobservable.observerEntries.size()) goto _L4; else goto _L3
_L3:
        if (((PriorityDataSetObservable.ObserverEntry)prioritydatasetobservable.observerEntries.get(i)).observer != datasetobserver) goto _L6; else goto _L5
_L5:
        prioritydatasetobservable.observerEntries.remove(i);
_L4:
        prioritydatasetobservable.observerEntries.isEmpty();
_L2:
        return;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
