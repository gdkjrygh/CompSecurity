// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.soundcloud.android.api.legacy.model.ScModel;
import com.soundcloud.android.collections.tasks.ReturnData;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.soundcloud.android.collections:
//            ListRow

public abstract class ScBaseAdapter extends BaseAdapter
{

    public List data;
    protected boolean isLoadingData;
    public int page;
    private View progressView;

    public ScBaseAdapter()
    {
        data = new ArrayList();
    }

    public void addItems(List list)
    {
        data.addAll(list);
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public void bindRow(int i, View view)
    {
        if (view instanceof ListRow)
        {
            ((ListRow)view).display(i, getItem(i));
        }
    }

    public void clearData()
    {
        data.clear();
        page = 0;
    }

    public abstract View createRow(Context context, int i, ViewGroup viewgroup);

    public int getCount()
    {
        if (isLoadingData)
        {
            return data.size() + 1;
        } else
        {
            return data.size();
        }
    }

    public ScModel getItem(int i)
    {
        return (ScModel)data.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public int getItemCount()
    {
        return data.size();
    }

    public long getItemId(int i)
    {
        if (i >= data.size())
        {
            return 0x8000000000000000L;
        }
        ScModel scmodel = getItem(i);
        if (scmodel.getListItemId() != -1L)
        {
            return scmodel.getListItemId();
        } else
        {
            return (long)i;
        }
    }

    public int getItemViewType(int i)
    {
        return !isPositionOfProgressElement(i) ? 0 : -1;
    }

    public List getItems()
    {
        return data;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (isPositionOfProgressElement(i))
        {
            if (progressView == null)
            {
                progressView = View.inflate(viewgroup.getContext().getApplicationContext(), 0x7f030020, null);
            }
            return progressView;
        }
        View view1 = view;
        if (view == null)
        {
            view1 = createRow(viewgroup.getContext(), i, viewgroup);
        }
        bindRow(i, view1);
        return view1;
    }

    public void handleTaskReturnData(ReturnData returndata)
    {
        if (returndata.success)
        {
            if (returndata.wasRefresh)
            {
                onSuccessfulRefresh();
            }
            page = page + 1;
            addItems(returndata.newItems);
        }
        setIsLoadingData(false);
    }

    public boolean isEmpty()
    {
        int i = getCount();
        return i == 0 || i == 1 && isLoadingData;
    }

    public boolean isEnabled(int i)
    {
        return !isPositionOfProgressElement(i);
    }

    protected boolean isPositionOfProgressElement(int i)
    {
        return isLoadingData && i == data.size();
    }

    public boolean needsItems()
    {
        return getCount() == 0;
    }

    public void onSuccessfulRefresh()
    {
        clearData();
    }

    public void setIsLoadingData(boolean flag)
    {
        isLoadingData = flag;
        notifyDataSetChanged();
    }

    public boolean shouldRequestNextPage(int i, int j, int k)
    {
        int l = k;
        if (isLoadingData)
        {
            l = k - 1;
        }
        if (l > 0 && l - j * 2 <= i)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return !isLoadingData && i != 0;
    }
}
