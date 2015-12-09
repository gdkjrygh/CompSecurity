// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            MenuItemCache, MenuItem

public class MenuBuilder extends ArrayAdapter
{

    private LayoutInflater inflater;

    public MenuBuilder(Context context, LayoutInflater layoutinflater, List list)
    {
        super(context, 0x1090003, list);
        inflater = null;
        inflater = layoutinflater;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = inflater.inflate(0x7f030014, null);
            viewgroup = new MenuItemCache(view, getContext());
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (MenuItemCache)view.getTag();
        }
        viewgroup.populate((MenuItem)getItem(i));
        return view;
    }
}
