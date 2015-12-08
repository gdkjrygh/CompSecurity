// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.ui;

import android.database.DataSetObserver;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class a
    implements ListAdapter
{

    protected Set d;
    protected List e;

    public a()
    {
        d = new HashSet();
        e = new ArrayList();
    }

    protected void a()
    {
    }

    public final void a(Collection collection)
    {
        e.clear();
        e.addAll(collection);
        a();
        for (collection = d.iterator(); collection.hasNext(); ((DataSetObserver)collection.next()).onChanged()) { }
    }

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    public int getCount()
    {
        return e.size();
    }

    public Object getItem(int i)
    {
        return e.get(i);
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isEmpty()
    {
        return e.isEmpty();
    }

    public boolean isEnabled(int i)
    {
        return true;
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        d.add(datasetobserver);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        d.remove(datasetobserver);
    }
}
