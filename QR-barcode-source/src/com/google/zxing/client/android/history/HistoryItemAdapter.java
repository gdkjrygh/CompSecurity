// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.history;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.zxing.Result;
import java.util.ArrayList;

// Referenced classes of package com.google.zxing.client.android.history:
//            HistoryItem

final class HistoryItemAdapter extends ArrayAdapter
{

    private final Activity activity;

    HistoryItemAdapter(Activity activity1)
    {
        super(activity1, com.google.zxing.client.android.R.layout.history_list_item, new ArrayList());
        activity = activity1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        if (view instanceof LinearLayout)
        {
            view = (LinearLayout)view;
        } else
        {
            view = (LinearLayout)LayoutInflater.from(activity).inflate(com.google.zxing.client.android.R.layout.history_list_item, viewgroup, false);
        }
        viewgroup = (HistoryItem)getItem(i);
        obj = viewgroup.getResult();
        if (obj != null)
        {
            obj = ((Result) (obj)).getText();
            viewgroup = viewgroup.getDisplayAndDetails();
        } else
        {
            viewgroup = getContext().getResources();
            obj = viewgroup.getString(com.google.zxing.client.android.R.string.history_empty);
            viewgroup = viewgroup.getString(com.google.zxing.client.android.R.string.history_empty_detail);
        }
        ((TextView)view.findViewById(com.google.zxing.client.android.R.id.history_title)).setText(((CharSequence) (obj)));
        ((TextView)view.findViewById(com.google.zxing.client.android.R.id.history_detail)).setText(viewgroup);
        return view;
    }
}
