// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.presentation:
//            ItemAdapter, CellRendererBinding, CellRenderer

public class ListItemAdapter extends BaseAdapter
    implements ItemAdapter
{

    protected static final int DEFAULT_VIEW_TYPE = 0;
    protected final SparseArray cellRenderers;
    public final List items;

    public ListItemAdapter(CellRenderer cellrenderer)
    {
        items = new ArrayList(30);
        cellRenderers = new SparseArray(1);
        cellRenderers.put(0, cellrenderer);
    }

    public transient ListItemAdapter(CellRendererBinding acellrendererbinding[])
    {
        items = new ArrayList(30);
        cellRenderers = new SparseArray(acellrendererbinding.length);
        int j = acellrendererbinding.length;
        for (int i = 0; i < j; i++)
        {
            CellRendererBinding cellrendererbinding = acellrendererbinding[i];
            cellRenderers.put(cellrendererbinding.itemViewType, cellrendererbinding.cellRenderer);
        }

    }

    public void addItem(Object obj)
    {
        items.add(obj);
    }

    public void clear()
    {
        items.clear();
    }

    public int getCount()
    {
        return getItemCount();
    }

    public Object getItem(int i)
    {
        return items.get(i);
    }

    public int getItemCount()
    {
        return items.size();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public List getItems()
    {
        return items;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        CellRenderer cellrenderer = (CellRenderer)cellRenderers.get(getItemViewType(i));
        View view1 = view;
        if (view == null)
        {
            view1 = cellrenderer.createItemView(viewgroup);
        }
        cellrenderer.bindItemView(i, view1, items);
        return view1;
    }

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        throwable.printStackTrace();
    }

    public void onNext(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); addItem(iterable.next())) { }
        notifyDataSetChanged();
    }

    public volatile void onNext(Object obj)
    {
        onNext((Iterable)obj);
    }

    public void prependItem(Object obj)
    {
        items.add(0, obj);
    }

    public void removeItem(int i)
    {
        items.remove(i);
    }
}
