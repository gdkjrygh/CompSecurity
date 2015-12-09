// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class s extends BaseAdapter
{
    public static interface a
    {

        public abstract void a();
    }


    private final BaseAdapter a;
    private View b;
    private final Context c;
    private Vector d;
    private AtomicInteger e;
    private AtomicBoolean f;

    public s(Context context, BaseAdapter baseadapter)
    {
        d = new Vector();
        e = new AtomicInteger(0);
        f = new AtomicBoolean(true);
        a = baseadapter;
        c = context;
    }

    public s(Context context, BaseAdapter baseadapter, int i, int j)
    {
        d = new Vector();
        e = new AtomicInteger(0);
        f = new AtomicBoolean(true);
        c = context;
        a = baseadapter;
        context = (LinearLayout)LayoutInflater.from(context).inflate(0x7f0300dc, null);
        context.setLayoutParams(new android.widget.AbsListView.LayoutParams(i, j));
        context.setPadding(0, 0, 0, 0);
        context.setGravity(17);
        context.setVisibility(0);
        b = context;
    }

    private boolean d()
    {
        return a.getCount() > 0 && f.get();
    }

    public void a(a a1)
    {
        if (a1 != null)
        {
            d.remove(a1);
        }
    }

    public void a(boolean flag)
    {
        if (f.get() != flag)
        {
            f.set(flag);
            notifyDataSetChanged();
        }
    }

    public boolean a()
    {
        return e.get() == 1;
    }

    public boolean a(int i)
    {
        return d() && i == getCount() - 1;
    }

    public boolean areAllItemsEnabled()
    {
        return a.areAllItemsEnabled();
    }

    public void b()
    {
        if (a())
        {
            b.setVisibility(8);
            e.set(0);
        }
    }

    public void b(a a1)
    {
        if (a1 != null && !d.contains(a1))
        {
            d.add(a1);
        }
    }

    public BaseAdapter c()
    {
        return a;
    }

    public int getCount()
    {
        if (d())
        {
            return a.getCount() + 1;
        } else
        {
            return a.getCount();
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (a(i))
        {
            return null;
        } else
        {
            return a.getDropDownView(i, view, viewgroup);
        }
    }

    public Object getItem(int i)
    {
        if (a(i))
        {
            return null;
        } else
        {
            return a.getItem(i);
        }
    }

    public long getItemId(int i)
    {
        if (a(i))
        {
            return -1L;
        } else
        {
            return a.getItemId(i);
        }
    }

    public int getItemViewType(int i)
    {
        if (a(i))
        {
            return -1;
        } else
        {
            return a.getItemViewType(i);
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (a(i))
        {
            if (!a())
            {
                e.set(1);
                if (d != null)
                {
                    for (view = d.iterator(); view.hasNext(); ((a)view.next()).a()) { }
                }
            }
            if (b == null)
            {
                b = LayoutInflater.from(c).inflate(0x7f0300dc, viewgroup, false);
            }
            if (b.getVisibility() == 8)
            {
                b.setVisibility(0);
            }
            return b;
        } else
        {
            return a.getView(i, view, viewgroup);
        }
    }

    public int getViewTypeCount()
    {
        return a.getViewTypeCount();
    }

    public boolean hasStableIds()
    {
        return a.hasStableIds();
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public boolean isEnabled(int i)
    {
        if (a(i))
        {
            return false;
        } else
        {
            return a.isEnabled(i);
        }
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        a.notifyDataSetChanged();
    }

    public void notifyDataSetInvalidated()
    {
        super.notifyDataSetInvalidated();
        a.notifyDataSetInvalidated();
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        a.registerDataSetObserver(datasetobserver);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        a.unregisterDataSetObserver(datasetobserver);
    }
}
