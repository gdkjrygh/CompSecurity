// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.arist.activity.MyApplication;
import com.arist.b.b;
import java.util.ArrayList;

public final class i extends BaseAdapter
{

    int a;
    private ArrayList b;
    private LayoutInflater c;
    private Context d;

    public i(Context context, ArrayList arraylist)
    {
        d = context;
        c = LayoutInflater.from(context);
        b = arraylist;
        a = context.getResources().getColor(0x7f0b002a);
    }

    private b a(int j)
    {
        return (b)b.get(j);
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int j)
    {
        return a(j);
    }

    public final long getItemId(int j)
    {
        return (long)j;
    }

    public final View getView(int j, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = c.inflate(0x7f030037, null);
        }
        viewgroup = (TextView)view;
        viewgroup.setText((new StringBuilder(String.valueOf(j + 1))).append("  ").append(a(j).d()).append(" - ").append(a(j).j()).toString());
        if (j == MyApplication.h)
        {
            j = com.arist.model.skin.b.a().b();
        } else
        {
            j = a;
        }
        viewgroup.setTextColor(j);
        return view;
    }
}
