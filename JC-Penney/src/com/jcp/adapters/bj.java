// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            bk

public class bj
    implements WrapperListAdapter
{

    private final ListAdapter a;
    private final int b;
    private final int c;
    private final WeakReference d;
    private final android.widget.LinearLayout.LayoutParams e;
    private final android.widget.AbsListView.LayoutParams f;

    public bj(Context context, ListAdapter listadapter, int i, int j)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("Number of items per row must be positive");
        } else
        {
            d = new WeakReference(context);
            a = listadapter;
            b = i;
            c = j;
            e = new android.widget.LinearLayout.LayoutParams(0, -1);
            e.setMargins(j, j, 0, 0);
            e.weight = 1.0F;
            f = new android.widget.AbsListView.LayoutParams(-1, -2);
            return;
        }
    }

    public boolean areAllItemsEnabled()
    {
        if (a != null)
        {
            return a.areAllItemsEnabled();
        } else
        {
            return true;
        }
    }

    public int getCount()
    {
        if (a != null)
        {
            return (int)Math.ceil((1.0F * (float)a.getCount()) / (float)b);
        } else
        {
            return 0;
        }
    }

    public Object getItem(int i)
    {
        if (a != null)
        {
            ArrayList arraylist = new ArrayList(b);
            for (int j = 0; j < b; j++)
            {
                int k = b * i + j;
                if (k < a.getCount())
                {
                    arraylist.add(a.getItem(k));
                }
            }

            return arraylist;
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        if (a != null)
        {
            return (long)i;
        } else
        {
            return -1L;
        }
    }

    public int getItemViewType(int i)
    {
        if (a != null)
        {
            return a.getItemViewType(i);
        } else
        {
            return -1;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Context context;
        int j;
        j = 0;
        context = (Context)d.get();
        if (context != null && a != null) goto _L2; else goto _L1
_L1:
        view = null;
_L4:
        return view;
_L2:
        if (view == null || !(view instanceof LinearLayout) || !view.getTag().equals(Integer.valueOf(b)))
        {
            viewgroup = new LinearLayout(context);
            viewgroup.setPadding(0, 0, c, 0);
            viewgroup.setLayoutParams(f);
            viewgroup.setOrientation(0);
            viewgroup.setBaselineAligned(false);
            viewgroup.setTag(Integer.valueOf(b));
        } else
        {
            viewgroup = (LinearLayout)view;
        }
        view = viewgroup;
        if (j < b)
        {
            View view1;
            int k;
            if (j < viewgroup.getChildCount())
            {
                view = viewgroup.getChildAt(j);
            } else
            {
                view = null;
            }
            k = b * i + j;
            if (k < a.getCount())
            {
                view1 = view;
                if (view instanceof bk)
                {
                    viewgroup.removeView(view);
                    view1 = null;
                }
                view = a.getView(k, view1, viewgroup);
            } else
            if (view == null || !(view instanceof bk))
            {
                bk bk1 = new bk(context);
                view1 = view;
                view = bk1;
            } else
            {
                view1 = view;
            }
            if (view != view1 || j >= viewgroup.getChildCount())
            {
                if (j < viewgroup.getChildCount())
                {
                    viewgroup.removeView(view1);
                }
                view.setLayoutParams(e);
                viewgroup.addView(view, j);
            }
            j++;
            break MISSING_BLOCK_LABEL_109;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getViewTypeCount()
    {
        if (a != null)
        {
            return a.getViewTypeCount();
        } else
        {
            return 1;
        }
    }

    public ListAdapter getWrappedAdapter()
    {
        return a;
    }

    public boolean hasStableIds()
    {
        if (a != null)
        {
            return a.hasStableIds();
        } else
        {
            return false;
        }
    }

    public boolean isEmpty()
    {
        return a == null || a.isEmpty();
    }

    public boolean isEnabled(int i)
    {
        int j = 0;
        boolean flag1;
        if (a != null)
        {
            boolean flag = false;
            do
            {
                flag1 = flag;
                if (j >= b)
                {
                    break;
                }
                int k = b * i + j;
                flag1 = flag;
                if (k < a.getCount())
                {
                    flag1 = flag | a.isEnabled(k);
                }
                j++;
                flag = flag1;
            } while (true);
        } else
        {
            flag1 = true;
        }
        return flag1;
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        if (a != null)
        {
            a.registerDataSetObserver(datasetobserver);
        }
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        if (a != null)
        {
            a.unregisterDataSetObserver(datasetobserver);
        }
    }
}
