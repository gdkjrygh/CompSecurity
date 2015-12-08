// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.ui.listview.ListCellBasic;

// Referenced classes of package com.pinterest.adapter:
//            BaseListAdapter

public class SimpleTextListAdapter extends BaseListAdapter
{

    private boolean _smallMode;

    public SimpleTextListAdapter(boolean flag)
    {
        _smallMode = true;
        _smallMode = flag;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = ListCellBasic.get(view, viewgroup);
        view.enableSmallMode(_smallMode);
        view.setText((String)getItem(i));
        return view;
    }
}
