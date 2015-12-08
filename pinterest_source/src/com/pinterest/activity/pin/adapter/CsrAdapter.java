// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Pin;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.PinGridCell;

public class CsrAdapter extends PinterestBaseAdapter
{

    public CsrAdapter()
    {
    }

    private String getPinDescription(int i, int j)
    {
        return (new StringBuilder()).append(i).append(" x ").append(j).toString();
    }

    private boolean isImageGif(String s)
    {
        return s != null && s.endsWith("gif");
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        if (view == null)
        {
            view = new PinGridCell(ViewHelper.getContext(view, viewgroup));
        } else
        {
            view = (PinGridCell)view;
        }
        viewgroup = (Pin)getItem(i);
        if (viewgroup != null)
        {
            viewgroup.setDescription(getPinDescription(viewgroup.getImageLargeWidth().intValue(), viewgroup.getImageLargeHeight().intValue()));
            viewgroup.setCleanDescription(Pin.cleanDescription(viewgroup.getDescription()));
            viewgroup.setRichIcon("");
            viewgroup.setRichSiteName("");
            viewgroup.setRichTitle("");
            view.setPin(viewgroup, flag);
            view.setRenderSocial(false);
            view.setRenderUser(false);
            view.setRenderOnto(false);
            view.setOverrideClicks(true);
        }
        return view;
    }
}
