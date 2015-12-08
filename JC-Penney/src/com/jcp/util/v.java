// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.util:
//            u, x

class v extends BaseAdapter
    implements android.view.View.OnClickListener
{

    final u a;
    private List b;
    private List c;
    private List d;
    private int e;

    public v(u u1, List list, int i)
    {
        a = u1;
        super();
        b = list;
        e = i;
        c = new ArrayList();
        d = new ArrayList();
    }

    public String a(int i)
    {
        return (String)b.get(i);
    }

    public List a()
    {
        d.clear();
        Integer integer;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); d.add(b.get(integer.intValue())))
        {
            integer = (Integer)iterator.next();
        }

        return d;
    }

    public void a(List list)
    {
        d.addAll(list);
        for (list = b.iterator(); list.hasNext();)
        {
            String s = (String)list.next();
            Iterator iterator = d.iterator();
            while (iterator.hasNext()) 
            {
                if (s.equals((String)iterator.next()))
                {
                    c.add(Integer.valueOf(b.indexOf(s)));
                }
            }
        }

        notifyDataSetChanged();
    }

    public void b()
    {
        c.clear();
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return b.size();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = u.a(a).inflate(0x7f0300e7, null);
        }
        view = (TextView)viewgroup.findViewById(0x7f0e005a);
        CheckBox checkbox = (CheckBox)viewgroup.findViewById(0x7f0e0066);
        RadioButton radiobutton = (RadioButton)viewgroup.findViewById(0x7f0e0068);
        if (e == 1)
        {
            radiobutton.setVisibility(8);
            checkbox.setVisibility(0);
            checkbox.setTag(Integer.valueOf(i));
            checkbox.setChecked(c.contains(Integer.valueOf(i)));
            checkbox.setOnClickListener(this);
        } else
        {
            checkbox.setVisibility(8);
            radiobutton.setVisibility(0);
            radiobutton.setTag(Integer.valueOf(i));
            radiobutton.setChecked(c.contains(Integer.valueOf(i)));
            radiobutton.setOnClickListener(this);
        }
        view.setText(a(i));
        return viewgroup;
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f0e0066)
        {
            if (((CheckBox)view).isChecked())
            {
                c.add((Integer)view.getTag());
            } else
            {
                c.remove((Integer)view.getTag());
            }
            notifyDataSetChanged();
        } else
        if (view.getId() == 0x7f0e0068)
        {
            c.clear();
            c.add((Integer)view.getTag());
            notifyDataSetChanged();
            if (u.b(a) != null)
            {
                u.b(a).a(a());
                u.c(a).dismiss();
                return;
            }
        }
    }
}
