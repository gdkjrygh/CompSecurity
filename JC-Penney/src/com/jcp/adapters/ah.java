// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jcp.activities.ar;
import com.jcp.productfilter.pojo.Values;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            aj, ai

public class ah extends BaseAdapter
{

    private List a;
    private ar b;
    private Activity c;
    private int d;
    private String e;
    private boolean f;
    private int g;
    private ah h;
    private GridView i;
    private int j;
    private boolean k;

    public ah(Activity activity, List list, int l, String s, GridView gridview, boolean flag, boolean flag1)
    {
        a = list;
        c = activity;
        b = (ar)activity;
        d = l;
        e = s;
        f = flag;
        g = a(l);
        h = this;
        i = gridview;
        k = flag1;
    }

    private int a(int l)
    {
        switch (l)
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

    static int a(ah ah1)
    {
        return ah1.g;
    }

    private void a(aj aj1, int l)
    {
        if (k || !((Values)a.get(l)).isSelectedStatus())
        {
            b(aj1, l);
        } else
        if (((Values)a.get(l)).isSelectedStatus())
        {
            a(l, aj1);
            return;
        }
    }

    static List b(ah ah1)
    {
        return ah1.a;
    }

    private void b(aj aj1, int l)
    {
        aj.b(aj1).setBackgroundColor(c.getResources().getColor(0x7f0d0061));
        aj.b(aj1).setSelected(false);
        ((Values)a.get(l)).setSelectedStatus(false);
    }

    static GridView c(ah ah1)
    {
        return ah1.i;
    }

    static ah d(ah ah1)
    {
        return ah1.h;
    }

    static boolean e(ah ah1)
    {
        return ah1.f;
    }

    static ar f(ah ah1)
    {
        return ah1.b;
    }

    static int g(ah ah1)
    {
        int l = ah1.j;
        ah1.j = l - 1;
        return l;
    }

    static Activity h(ah ah1)
    {
        return ah1.c;
    }

    static int i(ah ah1)
    {
        int l = ah1.j;
        ah1.j = l + 1;
        return l;
    }

    static String j(ah ah1)
    {
        return ah1.e;
    }

    static int k(ah ah1)
    {
        return ah1.j;
    }

    public List a()
    {
        return a;
    }

    public void a(int l, aj aj1)
    {
        aj.b(aj1).setBackgroundDrawable(c.getResources().getDrawable(0x7f020127));
        ((Values)a.get(l)).setSelectedStatus(true);
        aj.b(aj1).setSelected(true);
    }

    public void a(int l, boolean flag, boolean flag1)
    {
        f = flag1;
        d = l;
        g = a(l);
        k = flag;
    }

    public int b()
    {
        return d;
    }

    public int getCount()
    {
        return g;
    }

    public Object getItem(int l)
    {
        return null;
    }

    public long getItemId(int l)
    {
        return 0L;
    }

    public View getView(int l, View view, ViewGroup viewgroup)
    {
        View view1;
        if (view == null)
        {
            view1 = c.getLayoutInflater().inflate(0x7f0300bc, viewgroup, false);
            view = new aj(this, null);
            aj.a(view, (TextView)view1.findViewById(0x7f0e03aa));
            aj.a(view, (LinearLayout)view1.findViewById(0x7f0e03a9));
            aj.b(view).setOnClickListener(new ai(this, view, l));
            view1.setTag(view);
            viewgroup = view;
        } else
        {
            viewgroup = (aj)view.getTag();
            view1 = view;
        }
        if (g - 1 == l)
        {
            if (d == 0)
            {
                aj.a(viewgroup).setText("View all");
                return view1;
            }
            if (d == 1)
            {
                aj.a(viewgroup).setText("View less");
                return view1;
            } else
            {
                aj.a(viewgroup).setText(((Values)a.get(l)).getName());
                return view1;
            }
        } else
        {
            a(viewgroup, l);
            aj.a(viewgroup).setText(((Values)a.get(l)).getName());
            return view1;
        }
    }
}
