// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.List;

public final class cyg
    implements ListAdapter
{

    private final List a;
    private final LayoutInflater b;

    public cyg(List list, LayoutInflater layoutinflater)
    {
        a = list;
        b = layoutinflater;
    }

    public final String a(int i)
    {
        return (String)a.get(i);
    }

    public final boolean areAllItemsEnabled()
    {
        return true;
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final int getItemViewType(int i)
    {
        if (i == 0)
        {
            return 0;
        }
        return i != a.size() - 1 ? 2 : 1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        int j;
        j = -1;
        view1 = view;
        if (view != null) goto _L2; else goto _L1
_L1:
        getItemViewType(i);
        JVM INSTR tableswitch 0 2: default 40
    //                   0 82
    //                   1 89
    //                   2 96;
           goto _L3 _L4 _L5 _L6
_L3:
        view1 = b.inflate(j, viewgroup, false);
_L2:
        ((TextView)view1.findViewById(0x7f110321)).setText((String)a.get(i));
        return view1;
_L4:
        j = 0x7f030063;
        continue; /* Loop/switch isn't completed */
_L5:
        j = 0x7f030064;
        continue; /* Loop/switch isn't completed */
_L6:
        j = 0x7f030065;
        if (true) goto _L3; else goto _L7
_L7:
    }

    public final int getViewTypeCount()
    {
        return 3;
    }

    public final boolean hasStableIds()
    {
        return true;
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final boolean isEnabled(int i)
    {
        return true;
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver)
    {
    }

    public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
    }
}
