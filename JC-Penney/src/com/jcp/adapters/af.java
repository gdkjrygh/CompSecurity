// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            ag

public class af extends BaseAdapter
{

    private List a;
    private Activity b;

    public af(Activity activity, List list)
    {
        a = list;
        b = activity;
    }

    public int getCount()
    {
        return a.size() + 4;
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
        View view1 = view;
        if (view == null)
        {
            view1 = b.getLayoutInflater().inflate(0x7f03004f, viewgroup, false);
            view = new ag(this);
            ag.a(view, (ImageView)view1.findViewById(0x7f0e0348));
            view1.setTag(view);
        }
        return view1;
    }
}
