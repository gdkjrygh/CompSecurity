// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.widget:
//            ActionSpinner

public class c extends ArrayAdapter
{

    final ActionSpinner a;
    private ArrayList b;
    private LayoutInflater c;

    public int getCount()
    {
        return b.size();
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (viewgroup instanceof ListView)
        {
            ListView listview = (ListView)viewgroup;
            if (!(listview.getOnItemClickListener() instanceof b))
            {
                listview.setOnItemClickListener(new b(a, listview.getOnItemClickListener()));
            }
        }
        return a.a(i, view, c, viewgroup);
    }

    public Object getItem(int i)
    {
        return (c)b.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
label0:
        {
            if (view != null)
            {
                obj = view;
                if (view instanceof ImageView)
                {
                    break label0;
                }
            }
            obj = new ImageView(getContext());
        }
        viewgroup.setPadding(0, 0, 0, 0);
        view = (ImageView)obj;
        view.setImageDrawable(a.a());
        view.setScaleType(android.widget.SIDE);
        view.setPadding(5, 5, 5, 5);
        view.setContentDescription(a.c);
        view.setLayoutParams(new android.view.(-1, a.getResources().getDimensionPixelSize(0x7f0c0002)));
        return view;
    }

    public (ActionSpinner actionspinner, Context context, int i, ArrayList arraylist)
    {
        a = actionspinner;
        super(context, i, arraylist);
        setDropDownViewResource(i);
        b = arraylist;
        c = LayoutInflater.from(context);
    }
}
