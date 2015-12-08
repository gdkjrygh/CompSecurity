// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.data;

import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.skype.android.app.data:
//            DataAdapter, OnUserEventListener

public static abstract class checkedState
{

    SparseBooleanArray checkedState;
    OnUserEventListener listener;

    private checkedState createViewHolder(View view)
    {
        checkedState checkedstate = onCreateViewHolder(view);
        checkedstate.etItemAdapter(this);
        view.setTag(checkedstate);
        return checkedstate;
    }

    public final etItemAdapter createViewHolder(ViewGroup viewgroup)
    {
        return createViewHolder(onCreateView(viewgroup));
    }

    final void dispatchItemCheck(onCreateView oncreateview, Object obj, boolean flag)
    {
        checkedState.put(getItemId(obj), flag);
        if (listener != null)
        {
            listener.onItemChecked(oncreateview, obj, flag);
        }
    }

    final void dispatchItemClick(ecked ecked, int i, Object obj)
    {
        if (listener != null)
        {
            listener.onItemClick(ecked, i, obj);
        }
    }

    final boolean dispatchItemLongClick(ick ick, int i, Object obj)
    {
        return listener != null && listener.onItemLongClick(ick, i, obj);
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
        return (obj instanceof getItemId) && ((getItemId)obj).temAdapter == this;
    }

    protected abstract View onCreateView(ViewGroup viewgroup);

    protected abstract temAdapter onCreateViewHolder(View view);

    public void onItemCheck(temAdapter temadapter, Object obj, boolean flag)
    {
    }

    public void onItemClick(temAdapter temadapter, Object obj)
    {
    }

    public boolean onItemLongClick(temAdapter temadapter, Object obj)
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

    public ()
    {
        checkedState = new SparseBooleanArray();
    }
}
