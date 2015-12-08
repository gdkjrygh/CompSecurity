// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.uservoice.uservoicesdk.rest.Callback;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            SearchAdapter

public abstract class ModelAdapter extends SearchAdapter
{

    protected static final int LOADING = 1;
    protected static final int MODEL = 0;
    protected int addedObjects;
    protected LayoutInflater inflater;
    protected final int layoutId;
    protected List objects;

    public ModelAdapter(Context context, int i, List list)
    {
        addedObjects = 0;
        this.context = context;
        layoutId = i;
        objects = list;
        inflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public void add(int i, Object obj)
    {
        objects.add(i, obj);
        addedObjects = addedObjects + 1;
        notifyDataSetChanged();
    }

    protected abstract void customizeLayout(View view, Object obj);

    public int getCount()
    {
        int j = getObjects().size();
        int i;
        if (loading)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j;
    }

    public Object getItem(int i)
    {
        if (i < getObjects().size())
        {
            return getObjects().get(i);
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        if (getItemViewType(i) == 1)
        {
            return -1L;
        } else
        {
            return (long)i;
        }
    }

    public int getItemViewType(int i)
    {
        return i != getObjects().size() ? 0 : 1;
    }

    protected List getObjects()
    {
        return objects;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int k = getItemViewType(i);
        viewgroup = view;
        if (view == null)
        {
            view = inflater;
            int j;
            if (k == 1)
            {
                j = com.uservoice.uservoicesdk.R.layout.uv_loading_item;
            } else
            {
                j = layoutId;
            }
            viewgroup = view.inflate(j, null);
        }
        if (k == 0)
        {
            customizeLayout(viewgroup, getItem(i));
        }
        return viewgroup;
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public boolean isEnabled(int i)
    {
        return getItemViewType(i) == 0;
    }

    protected abstract void loadPage(int i, Callback callback);
}
