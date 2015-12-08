// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.dominos.android.sdk.core.models.CouponWizardLineHolder;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.views.LabsCouponLineView;
import com.dominos.views.LabsCouponLineView_;
import com.dominos.views.LabsProductLineView;
import com.dominos.views.LabsProductLineView_;
import java.util.Iterator;
import java.util.List;

public class LabsCouponWizardListAdapter extends BaseAdapter
{

    Context context;
    boolean isEditMode;
    List lineList;

    public LabsCouponWizardListAdapter()
    {
        isEditMode = false;
    }

    public int getCount()
    {
        return lineList.size();
    }

    public Object getItem(int i)
    {
        return lineList.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (((CouponWizardLineHolder)getItem(i)).getLine() instanceof LabsProductLine)
        {
            view = LabsProductLineView_.build(context);
            ((LabsProductLineView)view).bindAndHidQuantityBubbles((LabsProductLine)((CouponWizardLineHolder)getItem(i)).getLine());
        } else
        {
            view = LabsCouponLineView_.build(context);
            ((LabsCouponLineView)view).bindCouponWiz((LabsCouponLine)((CouponWizardLineHolder)getItem(i)).getLine());
        }
        if (((CouponWizardLineHolder)getItem(i)).getLine() instanceof LabsProductLine)
        {
            viewgroup = (ImageView)view.findViewById(0x7f0f01d6);
            viewgroup.setTag(Integer.valueOf(i));
            if (isEditMode)
            {
                viewgroup.setVisibility(0);
            } else
            {
                viewgroup.setVisibility(8);
            }
            ((TextView)view.findViewById(0x7f0f037d)).setVisibility(8);
        }
        return view;
    }

    public boolean hasProductLine()
    {
        for (Iterator iterator = lineList.iterator(); iterator.hasNext();)
        {
            if (((CouponWizardLineHolder)iterator.next()).getLine() instanceof LabsProductLine)
            {
                return true;
            }
        }

        return false;
    }

    public boolean isEditMode()
    {
        return isEditMode;
    }

    public void setLineList(List list)
    {
        lineList = list;
    }

    public void toggleEditMode()
    {
        boolean flag;
        if (!isEditMode)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isEditMode = flag;
        notifyDataSetChanged();
    }
}
