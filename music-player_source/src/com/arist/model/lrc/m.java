// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.lrc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.io.File;
import java.util.List;

// Referenced classes of package com.arist.model.lrc:
//            n, i

final class m extends BaseAdapter
{

    final i a;
    private List b;
    private LayoutInflater c;

    public m(i i, LayoutInflater layoutinflater, List list)
    {
        a = i;
        super();
        b = list;
        c = layoutinflater;
    }

    public final String a(int i)
    {
        return (String)b.get(i);
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
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        File file;
        if (view == null)
        {
            view = c.inflate(0x7f030013, null);
            viewgroup = new n(this);
            viewgroup.a = (TextView)view.findViewById(0x7f060065);
            viewgroup.b = (TextView)view.findViewById(0x7f060066);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (n)view.getTag();
        }
        file = new File(a(i));
        ((n) (viewgroup)).a.setText(file.getName());
        ((n) (viewgroup)).b.setText(a(i));
        return view;
    }
}
