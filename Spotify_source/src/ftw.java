// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

public final class ftw extends BaseAdapter
{

    public final ListAdapter a;
    private final Context b;
    private final int c;

    public ftw(Context context, ListAdapter listadapter, int i)
    {
        b = (Context)ctz.a(context);
        a = (ListAdapter)ctz.a(listadapter);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "What do you mean '%d' cells per row?! cellsPerRow must be greater than zero.");
        c = i;
    }

    private int a(int i, int j)
    {
        return c * i + j;
    }

    public final int getCount()
    {
        if (c == 1)
        {
            return a.getCount();
        } else
        {
            return (int)Math.ceil((double)a.getCount() / (double)c);
        }
    }

    public final Object getItem(int i)
    {
        i = a(i, 0);
        return a.getItem(i);
    }

    public final long getItemId(int i)
    {
        i = a(i, 0);
        return a.getItemId(i);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (c != 1) goto _L2; else goto _L1
_L1:
        viewgroup = a.getView(i, view, viewgroup);
_L4:
        return viewgroup;
_L2:
        int j;
        int k;
        if (view == null)
        {
            view = new fty(this, b);
        } else
        {
            view = (fty)view;
        }
        j = 0;
        viewgroup = view;
        if (j < ((fty) (view)).a.c)
        {
            k = ((fty) (view)).a.a(i, j);
            viewgroup = view.getChildAt(j);
            if (k < ((fty) (view)).a.a.getCount())
            {
                boolean flag;
                if (viewgroup instanceof ftx)
                {
                    view.removeView(viewgroup);
                    viewgroup = null;
                    flag = true;
                } else
                if (viewgroup == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                viewgroup = ((fty) (view)).a.a.getView(k, viewgroup, view);
                if (flag)
                {
                    view.addView(viewgroup, j, new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0F));
                }
                viewgroup.setVisibility(0);
            } else
            if (viewgroup != null)
            {
                viewgroup.setVisibility(4);
            } else
            {
                view.addView(new ftx(((fty) (view)).a.b), j, new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0F));
            }
            j++;
            break MISSING_BLOCK_LABEL_43;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        a.registerDataSetObserver(datasetobserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        a.unregisterDataSetObserver(datasetobserver);
    }
}
