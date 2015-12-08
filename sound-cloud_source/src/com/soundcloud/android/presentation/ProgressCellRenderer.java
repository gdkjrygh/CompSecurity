// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.content.Context;
import android.view.View;

public class ProgressCellRenderer
{

    private final int layoutResId;
    private android.view.View.OnClickListener retryListener;

    public ProgressCellRenderer(int i)
    {
        layoutResId = i;
    }

    public void bindView(View view, boolean flag)
    {
        if (flag)
        {
            view.setBackgroundResource(com.soundcloud.androidkit.R.drawable.ak_list_selector_gray);
            view.findViewById(com.soundcloud.androidkit.R.id.ak_list_progress).setVisibility(8);
            view.findViewById(com.soundcloud.androidkit.R.id.ak_list_retry).setVisibility(0);
            view.setOnClickListener(retryListener);
            return;
        } else
        {
            view.setBackgroundResource(0x106000d);
            view.findViewById(com.soundcloud.androidkit.R.id.ak_list_progress).setVisibility(0);
            view.findViewById(com.soundcloud.androidkit.R.id.ak_list_retry).setVisibility(8);
            view.setOnClickListener(null);
            return;
        }
    }

    public View createView(Context context)
    {
        return View.inflate(context, layoutResId, null);
    }

    public void setRetryListener(android.view.View.OnClickListener onclicklistener)
    {
        retryListener = onclicklistener;
    }
}
