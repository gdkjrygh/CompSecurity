// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

// Referenced classes of package com.fitbit.ui:
//            AbsChartActivity, CustomTextView

class > extends ArrayAdapter
{

    final AbsChartActivity a;

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (getCount() <= i)
        {
            return null;
        } else
        {
            view = (CustomTextView)super.getView(i, view, viewgroup);
            view.a(0x7f0f018b);
            return view;
        }
    }

    (AbsChartActivity abschartactivity, Context context, int i)
    {
        a = abschartactivity;
        super(context, i);
    }
}
