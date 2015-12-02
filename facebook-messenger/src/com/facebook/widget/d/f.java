// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.k;
import java.util.List;

// Referenced classes of package com.facebook.widget.d:
//            b, c

class f extends ArrayAdapter
{

    final c a;
    private final Context b;
    private final List c;

    public f(c c1, Context context, List list)
    {
        a = c1;
        super(context, k.orca_quick_action_menu_item, list);
        b = context;
        c = list;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        view = LayoutInflater.from(b).inflate(k.orca_quick_action_menu_item, viewgroup, false);
        viewgroup = (TextView)view.findViewById(i.menu_item_caption);
        b b1 = (b)c.get(j);
        if (b1.c())
        {
            boolean flag = b1.d();
            RadioButton radiobutton = (RadioButton)view.findViewById(i.radio_button);
            radiobutton.setVisibility(0);
            radiobutton.setChecked(flag);
        }
        viewgroup.setText(b1.a());
        view.setTag(b1);
        return view;
    }
}
