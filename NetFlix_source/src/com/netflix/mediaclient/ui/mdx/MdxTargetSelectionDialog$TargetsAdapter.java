// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxTargetSelectionDialog

private static class data extends BaseAdapter
{

    private List data;
    private final LayoutInflater inflater;
    private int selectedIndex;
    private String subText;

    public int getCount()
    {
        return data.size();
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public String getItem(int i)
    {
        return (String)data.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag = false;
        Object obj;
        TextView textview;
        boolean flag1;
        if (view == null)
        {
            view = inflater.inflate(0x7f03004b, null);
            viewgroup = new t>((TextView)view.findViewById(0x7f070101), (TextView)view.findViewById(0x7f070102), (CheckBox)view.findViewById(0x7f070100));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (t>)view.getTag();
        }
        ((t>) (viewgroup)).e.setText(getItem(i));
        if (i == selectedIndex)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        textview = ((selectedIndex) (viewgroup)).itle;
        if (flag1)
        {
            obj = subText;
        } else
        {
            obj = "";
        }
        textview.setText(((CharSequence) (obj)));
        if (flag1)
        {
            if (subText != null && !"".equals(subText.trim()))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            obj = ((subText) (viewgroup)).itle;
            if (i != 0)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            ((TextView) (obj)).setVisibility(i);
        } else
        {
            ((itle) (viewgroup)).itle.setVisibility(8);
        }
        ((itle) (viewgroup)).kBox.setChecked(flag1);
        if (flag1)
        {
            view.setBackgroundColor(MdxTargetSelectionDialog.access$000());
            return view;
        } else
        {
            view.setBackgroundColor(MdxTargetSelectionDialog.access$100());
            return view;
        }
    }

    public void setData(List list)
    {
        data = list;
        notifyDataSetChanged();
    }

    public void setSelected(int i, String s)
    {
        selectedIndex = i;
        subText = s;
        notifyDataSetChanged();
    }

    public (LayoutInflater layoutinflater)
    {
        inflater = layoutinflater;
        data = new ArrayList();
    }
}
