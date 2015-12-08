// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;

import com.viewpagerindicator.android.osp.ViewPager;

public interface PageIndicator
    extends com.viewpagerindicator.android.osp.ViewPager.OnPageChangeListener
{

    public abstract void notifyDataSetChanged();

    public abstract void setCurrentItem(int i);

    public abstract void setOnPageChangeListener(com.viewpagerindicator.android.osp.ViewPager.OnPageChangeListener onpagechangelistener);

    public abstract void setViewPager(ViewPager viewpager);

    public abstract void setViewPager(ViewPager viewpager, int i);
}
