// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.jcp.activities.ar;
import com.jcp.productfilter.pojo.Values;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            am, al

public class ak extends BaseAdapter
{

    private List a;
    private int b;
    private int c;
    private ar d;
    private ListView e;
    private ak f;
    private int g;
    private String h;
    private boolean i;
    private Context j;

    public ak(Context context, List list, int k, ListView listview, String s)
    {
        a = new ArrayList();
        a = list;
        c = a(k);
        d = (ar)context;
        b = k;
        e = listview;
        f = this;
        h = s;
        j = context;
    }

    private int a(int k)
    {
        switch (k)
        {
        default:
            return 0;

        case 0: // '\0'
            return 4;

        case 1: // '\001'
            return a.size() + 1;

        case 2: // '\002'
            return a.size();
        }
    }

    static int a(ak ak1)
    {
        return ak1.c;
    }

    static Context b(ak ak1)
    {
        return ak1.j;
    }

    static List c(ak ak1)
    {
        return ak1.a;
    }

    static ListView d(ak ak1)
    {
        return ak1.e;
    }

    static ak e(ak ak1)
    {
        return ak1.f;
    }

    static ar f(ak ak1)
    {
        return ak1.d;
    }

    static int g(ak ak1)
    {
        int k = ak1.g;
        ak1.g = k - 1;
        return k;
    }

    static int h(ak ak1)
    {
        int k = ak1.g;
        ak1.g = k + 1;
        return k;
    }

    static String i(ak ak1)
    {
        return ak1.h;
    }

    static int j(ak ak1)
    {
        return ak1.g;
    }

    public int a()
    {
        return b;
    }

    public void a(int k, boolean flag)
    {
        b = k;
        i = flag;
        c = a(k);
    }

    public void a(am am1)
    {
        am.c(am1).setBackgroundDrawable(d.getResources().getDrawable(0x7f0200fe));
        am.b(am1).setVisibility(0);
        am.a(am1).setSelected(true);
    }

    public void a(am am1, int k)
    {
        if (i || !((Values)a.get(k)).isSelectedStatus())
        {
            b(am1);
        } else
        if (((Values)a.get(k)).isSelectedStatus())
        {
            a(am1);
            return;
        }
    }

    public List b()
    {
        return a;
    }

    public void b(am am1)
    {
        am.c(am1).setBackgroundColor(d.getResources().getColor(0x106000b));
        am.b(am1).setVisibility(4);
        am.a(am1).setSelected(false);
    }

    public int getCount()
    {
        return c;
    }

    public Object getItem(int k)
    {
        return null;
    }

    public long getItemId(int k)
    {
        return 0L;
    }

    public View getView(int k, View view, ViewGroup viewgroup)
    {
        View view1;
        if (view == null)
        {
            view1 = d.getLayoutInflater().inflate(0x7f0300bd, viewgroup, false);
            view = new am(this, null);
            am.a(view, (TextView)view1.findViewById(0x7f0e01bd));
            am.a(view, (LinearLayout)view1.findViewById(0x7f0e03ab));
            am.a(view, (ImageView)view1.findViewById(0x7f0e0348));
            am.c(view).setOnClickListener(new al(this, view, k));
            view1.setTag(view);
            viewgroup = view;
        } else
        {
            viewgroup = (am)view.getTag();
            view1 = view;
        }
        if (c - 1 == k)
        {
            if (b == 0)
            {
                am.a(viewgroup).setText("View all");
                am.b(viewgroup).setImageDrawable(d.getResources().getDrawable(0x7f02018f));
                am.b(viewgroup).setVisibility(0);
                return view1;
            }
            if (b == 1)
            {
                am.a(viewgroup).setText("View less");
                am.b(viewgroup).setImageDrawable(d.getResources().getDrawable(0x7f020249));
                am.b(viewgroup).setVisibility(0);
                return view1;
            }
            if (i)
            {
                am.c(viewgroup).setBackgroundColor(d.getResources().getColor(0x106000b));
            }
            am.a(viewgroup).setText(((Values)a.get(k)).getName());
            return view1;
        } else
        {
            a(viewgroup, k);
            am.a(viewgroup).setText(((Values)a.get(k)).getName());
            return view1;
        }
    }
}
