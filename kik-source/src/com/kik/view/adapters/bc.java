// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.app.Activity;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public final class bc extends ArrayAdapter
{

    Activity a;
    List b;
    int c;

    public bc(Activity activity, List list)
    {
        super(activity, 0x7f030007, list);
        a = activity;
        b = list;
        c = 0x7f030007;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        LayoutInflater layoutinflater = a.getLayoutInflater();
        View view1 = view;
        if (view == null)
        {
            view1 = layoutinflater.inflate(c, viewgroup, false);
        }
        if (i >= 0 && i < b.size())
        {
            ((TextView)view1.findViewById(0x7f0e003b)).setText(((ResolveInfo)b.get(i)).loadLabel(a.getPackageManager()).toString());
            ((ImageView)view1.findViewById(0x7f0e003a)).setImageDrawable(((ResolveInfo)b.get(i)).loadIcon(a.getPackageManager()));
        }
        return view1;
    }
}
