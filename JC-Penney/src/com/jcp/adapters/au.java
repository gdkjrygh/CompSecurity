// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.jcp.util.ad;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            av

public class au extends ArrayAdapter
{

    private Context a;
    private int b;
    private List c;

    public au(Activity activity, int i, List list)
    {
        super(activity, i, list);
        c = new ArrayList();
        a = activity;
        b = i;
        c = list;
    }

    public int getCount()
    {
        return c.size();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = ((Activity)a).getLayoutInflater().inflate(b, viewgroup, false);
            viewgroup = new av(this);
            av.a(viewgroup, (TextView)view.findViewById(0x7f0e0245));
            av.a(viewgroup, (ImageView)view.findViewById(0x7f0e0244));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (av)view.getTag();
        }
        av.a(viewgroup).setText(((ad)getItem(i)).b());
        av.b(viewgroup).setBackgroundResource(((ad)getItem(i)).a());
        return view;
    }
}
