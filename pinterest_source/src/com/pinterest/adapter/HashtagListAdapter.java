// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.ui.listview.ListCellText;

// Referenced classes of package com.pinterest.adapter:
//            BaseListAdapter

public class HashtagListAdapter extends BaseListAdapter
{

    public HashtagListAdapter()
    {
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = ListCellText.get(view, viewgroup);
        view.setText((String)getItem(i));
        return view;
    }
}
