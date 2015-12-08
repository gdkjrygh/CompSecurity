// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.share;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import java.util.List;

// Referenced classes of package com.google.zxing.client.android.share:
//            LoadPackagesAsyncTask, AppInfo

class val.results extends ArrayAdapter
{

    final LoadPackagesAsyncTask this$0;
    private final List val$results;

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        viewgroup = ((AppInfo)val$results.get(i)).getIcon();
        if (viewgroup != null)
        {
            ((ImageView)view.findViewById(com.google.zxing.client.android.m_icon)).setImageDrawable(viewgroup);
        }
        return view;
    }

    (int i, int j, List list, List list1)
    {
        this$0 = final_loadpackagesasynctask;
        val$results = list1;
        super(Context.this, i, j, list);
    }
}
