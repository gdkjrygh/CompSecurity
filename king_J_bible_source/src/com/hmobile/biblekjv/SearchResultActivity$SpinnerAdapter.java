// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            SearchResultActivity

public class m_list extends BaseAdapter
{

    ArrayList m_list;
    final SearchResultActivity this$0;

    public int getCount()
    {
        return m_list.size();
    }

    public Object getItem(int i)
    {
        return m_list.get(i);
    }

    public long getItemId(int i)
    {
        return (long)((String)m_list.get(i)).hashCode();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = new inner(SearchResultActivity.this);
        String s;
        if (view == null)
        {
            view = getLayoutInflater().inflate(0x7f030030, null);
            view.setTag(viewgroup);
            viewgroup.txtBookName = (TextView)view.findViewById(0x7f0e006c);
            viewgroup.rl_spinner_item = (RelativeLayout)view.findViewById(0x7f0e0122);
        } else
        {
            viewgroup = (inner)view.getTag();
        }
        s = (String)m_list.get(i);
        ((inner) (viewgroup)).txtBookName.setText(s.trim());
        return view;
    }

    public inner(ArrayList arraylist)
    {
        this$0 = SearchResultActivity.this;
        super();
        m_list = new ArrayList();
        m_list = arraylist;
    }
}
