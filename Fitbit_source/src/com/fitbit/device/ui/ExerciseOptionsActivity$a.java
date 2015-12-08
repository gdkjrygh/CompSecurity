// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.fitbit.data.domain.device.ExerciseOption;
import com.mobeta.android.dslv.DragSortListView;
import java.util.List;

// Referenced classes of package com.fitbit.device.ui:
//            ExerciseOptionsActivity

private class a extends ArrayAdapter
{

    final ExerciseOptionsActivity a;

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f04015a, viewgroup, false);
        }
        view = (ExerciseOption)getItem(i);
        (new <init>(view1)).a(view.b());
        if (ExerciseOptionsActivity.a(a).getCount() == 1)
        {
            a.c.b(false);
            return view1;
        } else
        {
            a.c.b(true);
            return view1;
        }
    }

    public (ExerciseOptionsActivity exerciseoptionsactivity, Context context, List list)
    {
        a = exerciseoptionsactivity;
        super(context, 0, list);
    }
}
