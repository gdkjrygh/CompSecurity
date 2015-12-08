// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.a;

import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.arist.activity.MainActivity;
import com.arist.activity.MyApplication;
import com.arist.b.b;
import com.arist.b.c;
import com.arist.c.g;
import com.arist.model.skin.ColorImageView;
import java.util.ArrayList;

// Referenced classes of package com.arist.a:
//            c, d, b

public final class a extends BaseAdapter
    implements android.widget.AdapterView.OnItemLongClickListener
{

    private LayoutInflater a;
    private ArrayList b;
    private MainActivity c;
    private int d;
    private int e;
    private int f;
    private int g;

    public a(MainActivity mainactivity, ArrayList arraylist)
    {
        c = mainactivity;
        a = LayoutInflater.from(mainactivity);
        b = arraylist;
        g = com.arist.c.g.a(mainactivity, 8F);
    }

    static MainActivity a(a a1)
    {
        return a1.c;
    }

    static void a(a a1, int i)
    {
        a1.f = i;
    }

    static int b(a a1)
    {
        return a1.d;
    }

    public final int a()
    {
        return d;
    }

    public final void a(int i)
    {
        d = i;
    }

    public final void a(int i, int j)
    {
        d = i;
        e = j;
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            a(((c)MyApplication.p.get(j)).f());
            return;

        case 3: // '\003'
            a(((c)MyApplication.l.get(j)).f());
            return;

        case 1: // '\001'
            a(((c)MyApplication.n.get(j)).f());
            return;

        case 2: // '\002'
            a(((c)MyApplication.o.get(j)).f());
            return;

        case 4: // '\004'
            a(((c)MyApplication.m.get(j)).f());
            break;
        }
    }

    public final void a(View view, b b1)
    {
        LinearLayout linearlayout;
        TextView textview;
        TextView textview1;
        TextView textview2;
        TextView textview3;
        PopupWindow popupwindow;
        TextView textview4;
        int ai[];
        TextView textview5;
        boolean flag;
        boolean flag1;
        int i;
        if (d == 0 && e == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d == 3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        linearlayout = (LinearLayout)a.inflate(0x7f030042, null);
        textview4 = (TextView)linearlayout.findViewById(0x7f0600f1);
        textview = (TextView)linearlayout.findViewById(0x7f0600f3);
        textview1 = (TextView)linearlayout.findViewById(0x7f0600f5);
        textview2 = (TextView)linearlayout.findViewById(0x7f0600f6);
        textview5 = (TextView)linearlayout.findViewById(0x7f0600f2);
        textview3 = (TextView)linearlayout.findViewById(0x7f0600f4);
        popupwindow = new PopupWindow(linearlayout, -2, -2, true);
        popupwindow.setBackgroundDrawable(new ColorDrawable(0));
        popupwindow.setOutsideTouchable(true);
        b1 = new com.arist.a.c(this, popupwindow, b1);
        textview4.setOnClickListener(b1);
        textview2.setOnClickListener(b1);
        textview1.setOnClickListener(b1);
        textview5.setOnClickListener(b1);
        ai = new int[2];
        view.getLocationOnScreen(ai);
        i = ai[1];
        popupwindow.showAtLocation(linearlayout, 53, g, i - view.getHeight());
        if (flag1 || flag)
        {
            textview.setVisibility(0);
            textview.setOnClickListener(b1);
            textview1.setVisibility(8);
            textview3.setVisibility(0);
            textview3.setOnClickListener(b1);
            textview2.setVisibility(8);
        }
    }

    public final void a(b b1)
    {
        b.remove(b1);
        notifyDataSetChanged();
    }

    public final void a(ArrayList arraylist)
    {
        b = arraylist;
        notifyDataSetChanged();
    }

    public final int b()
    {
        return e;
    }

    public final void b(int i)
    {
        Log.i("MainAc", (new StringBuilder("-secondPosition-")).append(i).toString());
        e = i;
    }

    public final int c()
    {
        return f;
    }

    public final b c(int i)
    {
        return (b)b.get(i);
    }

    public final int getCount()
    {
        if (b != null)
        {
            return b.size();
        } else
        {
            return 0;
        }
    }

    public final Object getItem(int i)
    {
        return c(i);
    }

    public final long getItemId(int i)
    {
        if (b.isEmpty())
        {
            return 0L;
        } else
        {
            return (long)((b)b.get(i)).c();
        }
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        b b1;
        if (view == null)
        {
            view = a.inflate(0x7f030021, null);
            viewgroup = new d();
            com.arist.a.d.a(viewgroup, (TextView)view.findViewById(0x7f060088));
            com.arist.a.d.b(viewgroup, (TextView)view.findViewById(0x7f060089));
            com.arist.a.d.a(viewgroup, (ColorImageView)view.findViewById(0x7f06008b));
            com.arist.a.d.a(viewgroup, view.findViewById(0x7f060087));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (d)view.getTag();
        }
        b1 = (b)b.get(i);
        com.arist.a.d.a(viewgroup).setOnClickListener(new com.arist.a.b(this, i, b1));
        if (MyApplication.g() != null && b1.c() == MyApplication.g().c())
        {
            view.setBackgroundColor(0xffc3d4de);
        } else
        {
            view.setBackgroundColor(0);
        }
        com.arist.a.d.b(viewgroup).setText(b1.d());
        com.arist.a.d.c(viewgroup).setText((new StringBuilder(String.valueOf(b1.j()))).append(" - ").append(b1.h()).toString());
        com.arist.c.a.a.a(b1, com.arist.a.d.d(viewgroup));
        return view;
    }

    public final void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        MainActivity mainactivity = c;
        boolean flag;
        if (getCount() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mainactivity.a(flag);
    }

    public final boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        f = i;
        a(view.findViewById(0x7f060087), c(i));
        return true;
    }
}
