// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.jcp.activities.MainActivity;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            co

public class cn extends ArrayAdapter
{

    private MainActivity a;

    public cn(Context context, List list)
    {
        super(context, 0x1090003, list);
        a = (MainActivity)context;
    }

    static MainActivity a(cn cn1)
    {
        return cn1.a;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(a).inflate(0x1090003, viewgroup, false);
        }
        view = (TextView)view1.findViewById(0x1020014);
        view.setText((CharSequence)getItem(i));
        view.setOnClickListener(new co(this, i));
        return view1;
    }
}
