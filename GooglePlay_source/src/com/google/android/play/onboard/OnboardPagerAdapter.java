// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.data.DataList;
import com.google.android.libraries.bind.data.DataPagerAdapter;
import com.google.android.libraries.bind.data.DataView;
import com.google.android.libraries.bind.data.LayoutResIdFilter;
import com.google.android.libraries.bind.util.Util;
import com.google.android.libraries.bind.view.ViewHeap;

public class OnboardPagerAdapter extends DataPagerAdapter
{
    public static interface PageGenerator
    {

        public abstract View makePage$4edf3998(Context context);
    }


    public static final int DK_PAGE_GENERATOR = 0x7f0d0057;

    public OnboardPagerAdapter(ViewHeap viewheap)
    {
        super(viewheap);
    }

    public final View getView(ViewGroup viewgroup, int i, Data data)
    {
        Integer integer = data.getAsInteger(0x7f0d0003);
        if (integer == null)
        {
            data = (PageGenerator)data.get(0x7f0d0057);
            boolean flag;
            if (data != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Util.checkPrecondition(flag, "Missing both view resource ID and page generator");
            viewgroup = data._mth4edf3998(viewgroup.getContext());
        } else
        {
            View view = LayoutInflater.from(viewgroup.getContext()).inflate(integer.intValue(), null);
            viewgroup = view;
            if (view instanceof DataView)
            {
                viewgroup = (int[])data.get(0x7f0d0001);
                ((DataView)view).setDataRow(super.list.filterRow(super.list.getItemId(i), new LayoutResIdFilter(integer.intValue(), 0x7f0d0003), viewgroup));
                return view;
            }
        }
        return viewgroup;
    }

}
