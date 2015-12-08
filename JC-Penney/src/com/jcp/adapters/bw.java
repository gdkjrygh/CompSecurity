// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.activities.ProductFilterSortActivity;
import com.jcp.productlistentity.ProductListFilterEntity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jcp.adapters:
//            by, bx

public class bw extends BaseAdapter
{

    private ProductFilterSortActivity a;
    private List b;
    private LayoutInflater c;
    private Map d;
    private int e;

    public bw(Activity activity, List list, Map map, int i)
    {
        d = new HashMap();
        b = list;
        c = LayoutInflater.from(activity);
        a = (ProductFilterSortActivity)activity;
        d.clear();
        d.putAll(map);
        e = i;
    }

    private String a(String s)
    {
        s = (List)d.get(s);
        StringBuilder stringbuilder = new StringBuilder();
        if (s != null && s.size() != 0)
        {
            int i = 0;
            while (i < s.size()) 
            {
                if (i != s.size() - 1)
                {
                    stringbuilder.append((new StringBuilder()).append((String)s.get(i)).append(", ").toString());
                } else
                {
                    stringbuilder.append((String)s.get(i));
                }
                i++;
            }
        }
        return stringbuilder.toString();
    }

    static List a(bw bw1)
    {
        return bw1.b;
    }

    static ProductFilterSortActivity b(bw bw1)
    {
        return bw1.a;
    }

    public void a(Map map, int i)
    {
        d.clear();
        d.putAll(map);
        e = i;
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
        ProductListFilterEntity productlistfilterentity;
        String s;
        if (view == null || view.getTag() == null)
        {
            view = c.inflate(0x7f0300c2, viewgroup, false);
            viewgroup = new by(this, null);
            by.a(viewgroup, (TextView)view.findViewById(0x7f0e03c4));
            by.b(viewgroup, (TextView)view.findViewById(0x7f0e03c5));
            by.a(viewgroup, (RelativeLayout)view.findViewById(0x7f0e03c3));
            by.a(viewgroup, (RatingBar)view.findViewById(0x7f0e03c6));
            by.a(viewgroup).setOnClickListener(new bx(this, i));
        } else
        {
            viewgroup = (by)view.getTag();
        }
        productlistfilterentity = (ProductListFilterEntity)b.get(i);
        if (productlistfilterentity == null || viewgroup == null) goto _L2; else goto _L1
_L1:
        if ("RANGE".equalsIgnoreCase(productlistfilterentity.getType()))
        {
            by.b(viewgroup).setVisibility(8);
            by.c(viewgroup).setVisibility(0);
            by.c(viewgroup).setRating(e);
        }
        if ("Average Rating".equalsIgnoreCase(productlistfilterentity.getName()))
        {
            by.d(viewgroup).setText("Minimum Rating");
        } else
        {
            by.d(viewgroup).setText(productlistfilterentity.getName());
        }
        if (d.size() == 0) goto _L4; else goto _L3
_L3:
        s = a(productlistfilterentity.getId());
        if (s.length() == 0) goto _L6; else goto _L5
_L5:
        by.b(viewgroup).setText(s);
_L2:
        return view;
_L6:
        if (!"RANGE".equalsIgnoreCase(productlistfilterentity.getType()))
        {
            by.b(viewgroup).setVisibility(8);
            return view;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!"RANGE".equalsIgnoreCase(productlistfilterentity.getType()))
        {
            by.b(viewgroup).setVisibility(8);
            return view;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }
}
