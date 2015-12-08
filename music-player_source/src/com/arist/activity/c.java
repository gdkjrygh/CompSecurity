// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.arist.b.b;
import com.arist.c.a.a;
import com.arist.model.skin.ColorCheckBox;
import com.arist.model.skin.ColorImageView;
import java.util.List;

// Referenced classes of package com.arist.activity:
//            AddToListActivity, e, d

final class c extends BaseAdapter
{

    public int a;
    final AddToListActivity b;

    c(AddToListActivity addtolistactivity)
    {
        b = addtolistactivity;
        super();
        a = -1;
    }

    static AddToListActivity a(c c1)
    {
        return c1.b;
    }

    private b a(int i)
    {
        return (b)com.arist.activity.AddToListActivity.a(b).get(i);
    }

    public final int getCount()
    {
        if (com.arist.activity.AddToListActivity.a(b) != null)
        {
            return com.arist.activity.AddToListActivity.a(b).size();
        } else
        {
            return 0;
        }
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        b b1;
        if (view == null)
        {
            view = b.getLayoutInflater().inflate(0x7f030027, null);
            viewgroup = new e(this);
            viewgroup.a = (ColorImageView)view.findViewById(0x7f060086);
            viewgroup.b = (ColorCheckBox)view.findViewById(0x7f060092);
            viewgroup.c = (TextView)view.findViewById(0x7f060093);
            viewgroup.d = (TextView)view.findViewById(0x7f060094);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (e)view.getTag();
        }
        b1 = a(i);
        com.arist.c.a.a.a(b1, ((e) (viewgroup)).a);
        ((e) (viewgroup)).c.setText(b1.d());
        ((e) (viewgroup)).d.setText(b1.j());
        ((e) (viewgroup)).b.a(null);
        if (!com.arist.activity.AddToListActivity.b(b).contains(b1))
        {
            ((e) (viewgroup)).b.setEnabled(true);
            ((e) (viewgroup)).b.a(AddToListActivity.c(b)[i]);
            ((e) (viewgroup)).b.a(new d(this, i));
            return view;
        } else
        {
            ((e) (viewgroup)).b.setEnabled(false);
            return view;
        }
    }
}
