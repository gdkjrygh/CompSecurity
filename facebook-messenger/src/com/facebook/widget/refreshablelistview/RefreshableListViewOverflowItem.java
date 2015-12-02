// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.refreshablelistview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

public class RefreshableListViewOverflowItem extends View
{

    public RefreshableListViewOverflowItem(Context context)
    {
        super(context);
        a();
    }

    public RefreshableListViewOverflowItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public RefreshableListViewOverflowItem(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        setMinimumHeight((int)(500F * getContext().getResources().getDisplayMetrics().density));
        setBackgroundDrawable(new ColorDrawable(Color.rgb(255, 255, 255)));
    }
}
