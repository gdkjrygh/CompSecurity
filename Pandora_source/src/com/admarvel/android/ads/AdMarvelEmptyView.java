// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class AdMarvelEmptyView extends RelativeLayout
{

    public AdMarvelEmptyView(Context context)
    {
        this(context, null);
    }

    public AdMarvelEmptyView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
    }
}
