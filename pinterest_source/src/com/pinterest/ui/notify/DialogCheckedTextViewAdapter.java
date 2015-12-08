// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.notify;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.ui.ViewHelper;
import java.util.List;

public class DialogCheckedTextViewAdapter extends BaseAdapter
{

    private static final String ANYONE = "anyone";
    private List _items;
    private PinterestJsonArray _notifs;

    public DialogCheckedTextViewAdapter(List list, PinterestJsonArray pinterestjsonarray)
    {
        _items = list;
        _notifs = pinterestjsonarray;
    }

    public int getCount()
    {
        return _items.size();
    }

    public CharSequence getItem(int i)
    {
        return (CharSequence)_items.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = ViewHelper.viewById(viewgroup.getContext(), 0x7f030144);
        }
        view = (CheckedTextView)view1.findViewById(0x7f0f033a);
        if (view != null)
        {
            view.setText(getItem(i));
            try
            {
                view.setChecked("anyone".equals(_notifs.d(i).a("value", null)));
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return view1;
            }
        }
        return view1;
    }

    public void updateNotifs(PinterestJsonArray pinterestjsonarray)
    {
        _notifs = pinterestjsonarray;
    }
}
