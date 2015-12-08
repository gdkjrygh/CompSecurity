// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.adapter.BaseListAdapter;
import com.pinterest.ui.TopicAnnotationCell;
import java.util.List;
import org.apache.commons.lang3.text.WordUtils;

public class FlashlightAnnotationListAdapter extends BaseListAdapter
{

    private List _selectedAnnotations;

    public FlashlightAnnotationListAdapter(List list)
    {
        _selectedAnnotations = list;
    }

    public int getCount()
    {
        if (dataSource == null)
        {
            return 0;
        } else
        {
            return dataSource.size();
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag1 = true;
        String s = (String)getItem(i);
        if (s != null)
        {
            boolean flag2 = _selectedAnnotations.contains(s);
            viewgroup = TopicAnnotationCell.get(view, viewgroup);
            view = WordUtils.capitalize(s);
            boolean flag;
            if (i == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (i != getCount() - 1)
            {
                flag1 = false;
            }
            viewgroup.updateUI(view, flag2, flag, flag1);
            view = viewgroup;
            if (!flag2)
            {
                viewgroup.setBackgroundResource(0x7f020270);
                return viewgroup;
            }
        }
        return view;
    }
}
