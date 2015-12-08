// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ShareIntentListAdapter extends ArrayAdapter
{

    boolean arrows[];
    Activity context;
    Object items[];
    int layoutId;

    public ShareIntentListAdapter(Activity activity, int i, Object aobj[])
    {
        super(activity, i, aobj);
        context = activity;
        items = aobj;
        layoutId = i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = context.getLayoutInflater().inflate(layoutId, null);
        ((TextView)view.findViewById(0x7f0a002f)).setText(((ResolveInfo)items[i]).activityInfo.applicationInfo.loadLabel(context.getPackageManager()).toString());
        ((ImageView)view.findViewById(0x7f0a0040)).setImageDrawable(((ResolveInfo)items[i]).activityInfo.applicationInfo.loadIcon(context.getPackageManager()));
        return view;
    }
}
