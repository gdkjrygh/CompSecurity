// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.kik.m.d;
import java.util.ArrayList;
import kik.android.chat.KikApplication;

public final class com.kik.view.adapters.a extends BaseAdapter
{
    public static final class a
    {

        public ImageView a;
        public TextView b;

        public a()
        {
        }
    }


    protected final LayoutInflater a;
    protected int b;
    protected ArrayList c;

    public com.kik.view.adapters.a(Context context, int i)
    {
        c = new ArrayList();
        a = LayoutInflater.from(context);
        b = i;
        if ((i & 1) != 0)
        {
            c.add("FIND PEOPLE");
        }
        if ((i & 2) != 0)
        {
            c.add("START GROUP");
        }
        if ((i & 4) != 0)
        {
            c.add("EXPLICIT SEARCH");
        }
        if ((i & 0x20) != 0)
        {
            c.add("SHOW KIK CODE SCANNER");
        }
        if ((i & 8) != 0)
        {
            c.add("SHARE PROFILE");
        }
        if ((i & 0x10) != 0)
        {
            c.add("PROMOTED CHATS");
        }
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Object getItem(int i)
    {
        return c.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        String s;
        if (view == null)
        {
            view = a.inflate(0x7f030061, viewgroup, false);
            viewgroup = new a();
            viewgroup.b = (TextView)view.findViewById(0x7f0e0141);
            viewgroup.a = (ImageView)view.findViewById(0x7f0e0140);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (a)view.getTag();
        }
        s = (String)c.get(i);
        if (s.equals("FIND PEOPLE"))
        {
            ((a) (viewgroup)).b.setText(KikApplication.f(0x7f0900fb));
            ((a) (viewgroup)).a.setImageResource(0x7f070001);
            d.a(view, "AUTOMATION_FIND_PEOPLE_CELL");
        } else
        {
            if (s.equals("START GROUP"))
            {
                ((a) (viewgroup)).b.setText(KikApplication.f(0x7f0900f7));
                ((a) (viewgroup)).a.setImageResource(0x7f070007);
                d.a(view, "AUTOMATION_START_GROUP_CELL");
                return view;
            }
            if (s.equals("EXPLICIT SEARCH"))
            {
                ((a) (viewgroup)).b.setText(KikApplication.f(0x7f0900f3));
                ((a) (viewgroup)).a.setImageResource(0x7f070000);
                d.a(view, "AUTOMATION_EXPLICIT_SEARCH_CELL");
                return view;
            }
            if (s.equals("SHARE PROFILE"))
            {
                ((a) (viewgroup)).b.setText(KikApplication.f(0x7f0900f5));
                ((a) (viewgroup)).a.setImageResource(0x7f070003);
                d.a(view, "AUTOMATION_SHARE_PROFILE_CELL");
                return view;
            }
            if (s.equals("PROMOTED CHATS"))
            {
                ((a) (viewgroup)).b.setText(KikApplication.f(0x7f0900f2));
                ((a) (viewgroup)).a.setImageResource(0x7f070002);
                d.a(view, "AUTOMATION_PROMOTED_CHATS_CELL");
                return view;
            }
            if (s.equals("SHOW KIK CODE SCANNER"))
            {
                ((a) (viewgroup)).b.setText(KikApplication.f(0x7f090215));
                ((a) (viewgroup)).a.setImageResource(0x7f070006);
                d.a(view, "AUTOMATION_SHOW_KIK_CODE_CELL");
                return view;
            }
        }
        return view;
    }

    public final boolean hasStableIds()
    {
        return false;
    }

    public final boolean isEmpty()
    {
        return false;
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver)
    {
    }

    public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
    }
}
