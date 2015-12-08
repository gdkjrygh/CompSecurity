// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.presentation:
//            ItemAdapter, CellRendererBinding, CellRenderer

public abstract class RecyclerItemAdapter extends android.support.v7.widget.RecyclerView.Adapter
    implements ItemAdapter
{
    public static class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public ViewHolder(View view)
        {
            super(view);
        }
    }


    private int backgroundResId;
    protected final SparseArray cellRenderers;
    protected final List items;
    private android.view.View.OnClickListener onClickListener;
    private final Rect paddingHolder;

    public RecyclerItemAdapter(CellRenderer cellrenderer)
    {
        paddingHolder = new Rect();
        items = new ArrayList();
        cellRenderers = new SparseArray(1);
        cellRenderers.put(0, cellrenderer);
    }

    public transient RecyclerItemAdapter(CellRendererBinding acellrendererbinding[])
    {
        paddingHolder = new Rect();
        items = new ArrayList();
        cellRenderers = new SparseArray(acellrendererbinding.length);
        int j = acellrendererbinding.length;
        for (int i = 0; i < j; i++)
        {
            CellRendererBinding cellrendererbinding = acellrendererbinding[i];
            cellRenderers.put(cellrendererbinding.itemViewType, cellrendererbinding.cellRenderer);
        }

    }

    private int getBackgroundResourceId(Context context)
    {
        if (backgroundResId == 0)
        {
            TypedValue typedvalue = new TypedValue();
            context.getTheme().resolveAttribute(com.soundcloud.androidkit.R.attr.selectableItemBackground, typedvalue, true);
            backgroundResId = typedvalue.resourceId;
        }
        return backgroundResId;
    }

    private void setBackgroundWithPadding(View view, int i)
    {
        paddingHolder.set(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        view.setBackgroundResource(i);
        view.setPadding(paddingHolder.left, paddingHolder.top, paddingHolder.right, paddingHolder.bottom);
    }

    public void addItem(Object obj)
    {
        items.add(obj);
    }

    public void clear()
    {
        items.clear();
    }

    public abstract android.support.v7.widget.RecyclerView.ViewHolder createViewHolder(View view);

    public abstract int getBasicItemViewType(int i);

    public Object getItem(int i)
    {
        return items.get(i);
    }

    public int getItemCount()
    {
        return items.size();
    }

    public int getItemViewType(int i)
    {
        return getBasicItemViewType(i);
    }

    public List getItems()
    {
        return items;
    }

    public boolean isEmpty()
    {
        return items.isEmpty();
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        ((CellRenderer)cellRenderers.get(getBasicItemViewType(i))).bindItemView(i, viewholder.itemView, items);
    }

    public void onCompleted()
    {
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        View view = ((CellRenderer)cellRenderers.get(i)).createItemView(viewgroup);
        if (onClickListener != null)
        {
            view.setOnClickListener(onClickListener);
            setBackgroundWithPadding(view, getBackgroundResourceId(viewgroup.getContext()));
        }
        return createViewHolder(view);
    }

    public void onError(Throwable throwable)
    {
        notifyDataSetChanged();
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

    public void setOnItemClickListener(android.view.View.OnClickListener onclicklistener)
    {
        onClickListener = onclicklistener;
    }
}
