// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.jcp.activities.ProductFilterSortActivity;
import com.jcp.productlistentity.ProductListSortOptionEntity;
import com.jcp.util.bi;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            bb, ba

public class az extends BaseAdapter
{

    private LayoutInflater a;
    private List b;
    private ProductFilterSortActivity c;
    private RadioButton d;
    private int e;

    public az(Activity activity, List list, String s)
    {
        e = -1;
        a = LayoutInflater.from(activity);
        b = list;
        c = (ProductFilterSortActivity)activity;
        e = a(b, s);
    }

    static int a(az az1)
    {
        return az1.e;
    }

    static int a(az az1, int i)
    {
        az1.e = i;
        return i;
    }

    private int a(List list, String s)
    {
        list = list.iterator();
        int i = -1;
        while (list.hasNext()) 
        {
            ProductListSortOptionEntity productlistsortoptionentity = (ProductListSortOptionEntity)list.next();
            int j = i + 1;
            i = j;
            if (productlistsortoptionentity.getName().equalsIgnoreCase(s))
            {
                return j;
            }
        }
        return -1;
    }

    static RadioButton a(az az1, RadioButton radiobutton)
    {
        az1.d = radiobutton;
        return radiobutton;
    }

    static RadioButton b(az az1)
    {
        return az1.d;
    }

    static List c(az az1)
    {
        return az1.b;
    }

    static ProductFilterSortActivity d(az az1)
    {
        return az1.c;
    }

    public int getCount()
    {
        return b.size();
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null || view.getTag() == null)
        {
            view = a.inflate(0x7f0300c4, viewgroup, false);
            viewgroup = new bb(this, null);
            bb.a(viewgroup, (TextView)view.findViewById(0x7f0e005a));
            bb.a(viewgroup, (RadioButton)view.findViewById(0x7f0e03c8));
            if (i == e)
            {
                d = bb.a(viewgroup);
            }
            bb.a(viewgroup).setOnClickListener(new ba(this, i));
        } else
        {
            viewgroup = (bb)view.getTag();
        }
        if (e == i) goto _L2; else goto _L1
_L1:
        bb.a(viewgroup).setChecked(false);
_L4:
        if (b != null)
        {
            String s = ((ProductListSortOptionEntity)b.get(i)).getName();
            if (s != null)
            {
                s = bi.a(s);
                bb.b(viewgroup).setText(s);
            }
        }
        return view;
_L2:
        bb.a(viewgroup).setChecked(true);
        if (d != null && bb.a(viewgroup) != d)
        {
            d = bb.a(viewgroup);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
