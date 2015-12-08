// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.data;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Filter;
import android.widget.Filterable;
import com.skype.android.util.model.DataSource;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.skype.android.app.data:
//            OnUserEventListener

public abstract class DataAdapter extends android.support.v7.widget.RecyclerView.a
    implements Filterable, DataSource
{
    public static abstract class ItemViewAdapter
    {

        SparseBooleanArray checkedState;
        OnUserEventListener listener;

        private ItemViewHolder createViewHolder(View view)
        {
            ItemViewHolder itemviewholder = onCreateViewHolder(view);
            itemviewholder.setItemAdapter(this);
            view.setTag(itemviewholder);
            return itemviewholder;
        }

        public final ItemViewHolder createViewHolder(ViewGroup viewgroup)
        {
            return createViewHolder(onCreateView(viewgroup));
        }

        final void dispatchItemCheck(ItemViewHolder itemviewholder, Object obj, boolean flag)
        {
            checkedState.put(getItemId(obj), flag);
            if (listener != null)
            {
                listener.onItemChecked(itemviewholder, obj, flag);
            }
        }

        final void dispatchItemClick(ItemViewHolder itemviewholder, int i, Object obj)
        {
            if (listener != null)
            {
                listener.onItemClick(itemviewholder, i, obj);
            }
        }

        final boolean dispatchItemLongClick(ItemViewHolder itemviewholder, int i, Object obj)
        {
            return listener != null && listener.onItemLongClick(itemviewholder, i, obj);
        }

        public SparseBooleanArray getCheckedState()
        {
            if (checkedState == null)
            {
                checkedState = new SparseBooleanArray();
            }
            return checkedState;
        }

        protected abstract int getItemId(Object obj);

        public boolean isItemChecked(Object obj)
        {
            return checkedState.get(getItemId(obj));
        }

        protected boolean isMyViewHolder(Object obj)
        {
            return (obj instanceof ItemViewHolder) && ((ItemViewHolder)obj).itemAdapter == this;
        }

        protected abstract View onCreateView(ViewGroup viewgroup);

        protected abstract ItemViewHolder onCreateViewHolder(View view);

        public void onItemCheck(ItemViewHolder itemviewholder, Object obj, boolean flag)
        {
        }

        public void onItemClick(ItemViewHolder itemviewholder, Object obj)
        {
        }

        public boolean onItemLongClick(ItemViewHolder itemviewholder, Object obj)
        {
            return false;
        }

        public void setCheckedState(SparseBooleanArray sparsebooleanarray)
        {
            checkedState = sparsebooleanarray;
        }

        public void setListener(OnUserEventListener onusereventlistener)
        {
            listener = onusereventlistener;
        }

        public void updateCheckedState(SparseBooleanArray sparsebooleanarray)
        {
            for (int i = 0; i < sparsebooleanarray.size(); i++)
            {
                checkedState.put(sparsebooleanarray.keyAt(i), sparsebooleanarray.valueAt(i));
            }

        }

        public ItemViewAdapter()
        {
            checkedState = new SparseBooleanArray();
        }
    }

    public static abstract class ItemViewHolder extends android.support.v7.widget.RecyclerView.v
        implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.CompoundButton.OnCheckedChangeListener
    {

        private Object item;
        ItemViewAdapter itemAdapter;

        private void checkFromAdapter(boolean flag)
        {
            updateCheckboxState(flag);
            updateViewCheckedState(flag);
        }

        private void checkFromUser(boolean flag)
        {
            itemAdapter.dispatchItemCheck(this, item, flag);
            updateViewCheckedState(flag);
        }

        public void checkFromElsewhere(boolean flag)
        {
            itemAdapter.dispatchItemCheck(this, item, flag);
            updateCheckboxState(flag);
            updateViewCheckedState(flag);
        }

        public Object getData()
        {
            return item;
        }

        public boolean isItemChecked()
        {
            return itemAdapter.isItemChecked(item);
        }

        public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            checkFromUser(flag);
        }

        public void onClick(View view)
        {
            itemAdapter.dispatchItemClick(this, view.getId(), item);
        }

        public boolean onLongClick(View view)
        {
            return itemAdapter.dispatchItemLongClick(this, view.getId(), item);
        }

        protected abstract void onSetData(Object obj);

        public void onViewAttachedToWindow()
        {
        }

        public void onViewDetachedFromWindow()
        {
        }

        public void onViewRecycled()
        {
        }

        public final void setData(Object obj)
        {
            item = obj;
            onSetData(obj);
            checkFromAdapter(itemAdapter.isItemChecked(obj));
        }

        final void setItemAdapter(ItemViewAdapter itemviewadapter)
        {
            itemAdapter = itemviewadapter;
        }

        public void toggleCheck()
        {
            checkFromElsewhere(isItemChecked());
        }

        protected void updateCheckboxState(boolean flag)
        {
        }

        protected void updateViewCheckedState(boolean flag)
        {
        }

        public ItemViewHolder(View view)
        {
            super(view);
            view.setOnClickListener(this);
            view.setOnLongClickListener(this);
        }
    }


    public static final int VIEW_TYPE_PAYLOAD = 0;
    private final List itemList = new ArrayList();
    private final SparseArray itemViewAdapters = new SparseArray();
    private boolean notifyOnChange;

    public DataAdapter()
    {
        notifyOnChange = true;
    }

    private ItemViewAdapter getItemAdapter(int i)
    {
        return (ItemViewAdapter)itemViewAdapters.get(i);
    }

    public void add(Object obj)
    {
        int i = itemList.size();
        itemList.add(obj);
        if (notifyOnChange)
        {
            notifyItemInserted(i);
        }
    }

    public void clear()
    {
        itemList.clear();
        if (notifyOnChange)
        {
            notifyDataSetChanged();
        }
    }

    public void clearCheckedState(int i)
    {
        getItemAdapter(i).getCheckedState().clear();
    }

    public int getCheckedItemCount(int i)
    {
        return getCheckedState(i).size();
    }

    public SparseBooleanArray getCheckedState(int i)
    {
        return ((ItemViewAdapter)itemViewAdapters.get(i)).getCheckedState();
    }

    public int getCount()
    {
        return getItemCount();
    }

    public Filter getFilter()
    {
        return null;
    }

    public Object getItem(int i)
    {
        return itemList.get(i);
    }

    public int getItemCount()
    {
        return itemList.size();
    }

    public long getItemId(int i)
    {
        return (long)((ItemViewAdapter)itemViewAdapters.get(getItemViewType(i))).getItemId(getItem(i));
    }

    public boolean isEmpty()
    {
        return getCount() == 0;
    }

    public boolean isItemChecked(int i, int j)
    {
        return getCheckedState(i).get(j);
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
    {
        onBindViewHolder((ItemViewHolder)v, i);
    }

    public void onBindViewHolder(ItemViewHolder itemviewholder, int i)
    {
        itemviewholder.setData(getItem(i));
    }

    public volatile android.support.v7.widget.RecyclerView.v onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public ItemViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return ((ItemViewAdapter)itemViewAdapters.get(i)).createViewHolder(viewgroup);
    }

    public void setCheckedState(int i, SparseBooleanArray sparsebooleanarray)
    {
        getItemAdapter(i).setCheckedState(sparsebooleanarray);
        if (notifyOnChange)
        {
            notifyDataSetChanged();
        }
    }

    public void setData(List list)
    {
        itemList.clear();
        if (list != null)
        {
            itemList.addAll(list);
        }
        if (notifyOnChange)
        {
            notifyDataSetChanged();
        }
    }

    public void setItemChecked(int i, int j, boolean flag)
    {
        getCheckedState(i).put(j, flag);
        if (notifyOnChange)
        {
            notifyDataSetChanged();
        }
    }

    public void setItemViewAdapter(int i, ItemViewAdapter itemviewadapter)
    {
        itemViewAdapters.put(i, itemviewadapter);
    }

    public void setNotifyOnChange(boolean flag)
    {
        notifyOnChange = flag;
    }

    public void setOnUserEventListener(int i, OnUserEventListener onusereventlistener)
    {
        ((ItemViewAdapter)itemViewAdapters.get(i)).setListener(onusereventlistener);
    }
}
