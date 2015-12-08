// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SeparatedListAdapter extends BaseAdapter
{

    private static final int TYPE_SECTION_HEADER = 0;
    private final ArrayAdapter headers;
    private final Map sections = new LinkedHashMap();

    public SeparatedListAdapter(Context context)
    {
        headers = new ArrayAdapter(context, 0x7f03009d);
    }

    public void addSection(String s, Adapter adapter)
    {
        headers.add(s);
        sections.put(s, adapter);
    }

    public int getCount()
    {
        Iterator iterator = sections.values().iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((Adapter)iterator.next()).getCount() + 1 + i) { }
        return i;
    }

    public Object getItem(int i)
    {
        for (Iterator iterator = sections.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = iterator.next();
            Adapter adapter = (Adapter)sections.get(obj);
            int j = adapter.getCount() + 1;
            if (i == 0)
            {
                return obj;
            }
            if (i < j)
            {
                return adapter.getItem(i - 1);
            }
            i -= j;
        }

        return null;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        Iterator iterator = sections.keySet().iterator();
        boolean flag = true;
        int j = i;
        Object obj;
        for (i = ((flag) ? 1 : 0); iterator.hasNext(); i = ((Adapter) (obj)).getViewTypeCount() + i)
        {
            obj = iterator.next();
            obj = (Adapter)sections.get(obj);
            int k = ((Adapter) (obj)).getCount() + 1;
            if (j == 0)
            {
                return 0;
            }
            if (j < k)
            {
                return ((Adapter) (obj)).getItemViewType(j - 1) + i;
            }
            j -= k;
        }

        return -1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Iterator iterator = sections.keySet().iterator();
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); iterator.hasNext(); i++)
        {
            Object obj = iterator.next();
            obj = (Adapter)sections.get(obj);
            int k = ((Adapter) (obj)).getCount() + 1;
            if (j == 0)
            {
                return headers.getView(i, view, viewgroup);
            }
            if (j < k)
            {
                return ((Adapter) (obj)).getView(j - 1, view, viewgroup);
            }
            j -= k;
        }

        return null;
    }

    public int getViewTypeCount()
    {
        Iterator iterator = sections.values().iterator();
        int i;
        for (i = 1; iterator.hasNext(); i = ((Adapter)iterator.next()).getViewTypeCount() + i) { }
        return i;
    }

    public boolean isEnabled(int i)
    {
        return getItemViewType(i) != 0;
    }
}
