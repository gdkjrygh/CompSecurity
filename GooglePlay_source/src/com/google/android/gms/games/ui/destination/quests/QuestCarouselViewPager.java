// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.quests;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

public final class QuestCarouselViewPager extends ViewPager
{

    private Context mContext;

    public QuestCarouselViewPager(Context context)
    {
        super(context);
        mContext = context;
    }

    public QuestCarouselViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mContext = context;
    }

    protected final void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        Resources resources = mContext.getResources();
        j = resources.getDimensionPixelOffset(0x7f0c0130);
        int k = getMeasuredWidth();
        if (resources.getBoolean(0x7f0a000e))
        {
            i = resources.getDimensionPixelSize(0x7f0c01d5);
        } else
        {
            i = resources.getDimensionPixelSize(0x7f0c0255);
        }
        i = -k + i + j;
        if (super.mPageMargin != i)
        {
            setPageMargin(i);
        }
        setOffscreenPageLimit(3);
    }
}
