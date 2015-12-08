// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.ui.listview.ListCellBasic;

// Referenced classes of package com.pinterest.adapter:
//            BaseListAdapter

public class IconTextListAdapter extends BaseListAdapter
{

    public IconTextListAdapter()
    {
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = ListCellBasic.get(view, viewgroup);
        view.setImageBorderStyle(com.pinterest.ui.imageview.GrayWebImageView.BorderStyle.TRANSPARENT);
        view.enableSmallMode(true);
        setItemView(view, (IconText)getItem(i));
        return view;
    }

    public void setItemView(ListCellBasic listcellbasic, IconText icontext)
    {
        listcellbasic.setText(icontext.text);
        listcellbasic.setImage(icontext.icon);
    }

    private class IconText
    {

        public Drawable icon;
        public String meta;
        public String text;

        public IconText(Drawable drawable, String s, String s1)
        {
            icon = drawable;
            text = s;
            meta = s1;
        }
    }

}
