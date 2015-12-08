// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.android.a.d;
import com.android.a.e;
import java.util.List;

class c
    implements ListAdapter
{

    private final List a;
    private final LayoutInflater b;

    public c(List list, LayoutInflater layoutinflater)
    {
        a = list;
        b = layoutinflater;
    }

    public String a(int i)
    {
        return (String)a.get(i);
    }

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    public int getCount()
    {
        return a.size();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        if (i == 0)
        {
            return 0;
        }
        return i != a.size() - 1 ? 2 : 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        int j;
        j = -1;
        view1 = view;
        if (view != null) goto _L2; else goto _L1
_L1:
        getItemViewType(i);
        JVM INSTR tableswitch 0 2: default 40
    //                   0 83
    //                   1 91
    //                   2 99;
           goto _L3 _L4 _L5 _L6
_L3:
        view1 = b.inflate(j, viewgroup, false);
_L2:
        ((TextView)view1.findViewById(d.com_mixpanel_android_multiple_choice_answer_text)).setText((String)a.get(i));
        return view1;
_L4:
        j = e.com_mixpanel_android_first_choice_answer;
        continue; /* Loop/switch isn't completed */
_L5:
        j = e.com_mixpanel_android_last_choice_answer;
        continue; /* Loop/switch isn't completed */
_L6:
        j = e.com_mixpanel_android_middle_choice_answer;
        if (true) goto _L3; else goto _L7
_L7:
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public boolean isEnabled(int i)
    {
        return true;
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
    }
}
