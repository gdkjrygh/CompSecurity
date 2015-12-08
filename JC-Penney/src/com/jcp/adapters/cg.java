// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.jcp.model.Registry;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            ci

public class cg extends BaseAdapter
{

    private List a;
    private LayoutInflater b;

    public cg(Context context, List list)
    {
        a = list;
        b = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public int getCount()
    {
        return a.size();
    }

    public Object getItem(int i)
    {
        return a.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        String s;
        if (view == null)
        {
            view = b.inflate(0x7f0300cd, null);
            viewgroup = new ci(this, null);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ci)view.getTag();
        }
        ci.a(viewgroup, (TextView)view.findViewById(0x7f0e040f));
        s = ((Registry)a.get(i)).getName();
        ci.a(viewgroup).setText(s);
        return view;
    }
}
