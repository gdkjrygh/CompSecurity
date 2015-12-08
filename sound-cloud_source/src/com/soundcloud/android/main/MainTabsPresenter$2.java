// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.support.design.widget.TabLayout;

final class r extends android.support.design.widget.nPageChangeListener
{

    final TabLayout val$tabBar;

    public final void onPageSelected(int i)
    {
        if (val$tabBar.getSelectedTabPosition() != i)
        {
            super.onPageSelected(i);
        }
    }

    tOnPageChangeListener(TabLayout tablayout1)
    {
        val$tabBar = tablayout1;
        super(final_tablayout);
    }
}
