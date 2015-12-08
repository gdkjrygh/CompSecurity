// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package com.skype.android.widget:
//            DynamicListWrapper

public class DynamicListView extends ListView
    implements DynamicListWrapper
{

    private SparseBooleanArray a;

    public DynamicListView(Context context)
    {
        super(context);
        a = new SparseBooleanArray();
    }

    public DynamicListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new SparseBooleanArray();
    }

    public DynamicListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new SparseBooleanArray();
    }

    public int getCheckedItemCount()
    {
        return a.size();
    }

    public int getChoiceMode()
    {
        return super.getChoiceMode();
    }

    public boolean isItemChecked(int i)
    {
        return a.get(i, false);
    }

    public void setChoiceMode(int i)
    {
        super.setChoiceMode(i);
    }

    public void setContentAdapter(Adapter adapter)
    {
        if (adapter instanceof ListAdapter)
        {
            setAdapter((ListAdapter)adapter);
            return;
        } else
        {
            throw new RuntimeException("Listview needs a list adapter!");
        }
    }

    public void setItemChecked(int i, boolean flag)
    {
        a.put(i, flag);
        super.setItemChecked(i, flag);
    }

    public void setMaxItemsPerRow(int i)
    {
    }

    public void setOnRowItemsCountChangeListener(DynamicListWrapper.OnRowItemsCountChangedListener onrowitemscountchangedlistener)
    {
    }

    public void setSelection(int i)
    {
        super.setSelection(i);
    }
}
