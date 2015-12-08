// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;

import android.support.v4.view.ViewPager;

public interface PageIndicator
    extends android.support.v4.view.ViewPager.OnPageChangeListener
{

    public abstract void notifyDataSetChanged();

    public abstract void setCurrentItem(int i);

    public abstract void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener);

    public abstract void setViewPager(ViewPager viewpager);

    public abstract void setViewPager(ViewPager viewpager, int i);
}
