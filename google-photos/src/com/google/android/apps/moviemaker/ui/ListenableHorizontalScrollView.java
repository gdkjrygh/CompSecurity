// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import java.util.ArrayList;
import java.util.List;

public class ListenableHorizontalScrollView extends HorizontalScrollView
{

    private List a;

    public ListenableHorizontalScrollView(Context context)
    {
        super(context);
        a = new ArrayList();
    }

    public ListenableHorizontalScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
    }

    public ListenableHorizontalScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ArrayList();
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        for (i = 0; i < a.size(); i++)
        {
            a.get(i);
        }

    }
}
