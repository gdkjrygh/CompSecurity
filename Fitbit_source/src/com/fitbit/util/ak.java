// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ak
{

    public ak()
    {
    }

    public static void a(ListView listview, ListAdapter listadapter)
    {
        int i = 0;
        int j = listview.getFirstVisiblePosition();
        View view = listview.getChildAt(0);
        if (view != null)
        {
            i = view.getTop();
        }
        listview.setAdapter(null);
        listview.setAdapter(listadapter);
        listview.setSelectionFromTop(j, i);
    }
}
