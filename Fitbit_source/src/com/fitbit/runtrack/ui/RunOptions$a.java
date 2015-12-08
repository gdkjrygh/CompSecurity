// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.ui.a.c;
import com.fitbit.util.fonts.FitbitFont;
import java.util.Collection;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RunOptions

private static class a extends c
{

    private Typeface a;

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = LayoutInflater.from(viewgroup.getContext()).inflate(0x1090003, viewgroup, false);
        }
        viewgroup = (TextView)view;
        viewgroup.setText((CharSequence)((Pair)getItem(i)).second);
        viewgroup.setTypeface(a);
        return view;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = LayoutInflater.from(viewgroup.getContext()).inflate(0x1090003, viewgroup, false);
        }
        viewgroup = (TextView)view;
        viewgroup.setText((CharSequence)((Pair)getItem(i)).second);
        viewgroup.setTypeface(a);
        viewgroup.setGravity(80);
        return view;
    }

    public (Context context, Collection collection)
    {
        addAll(collection);
        a = FitbitFont.h.a(context, Typeface.DEFAULT);
    }
}
