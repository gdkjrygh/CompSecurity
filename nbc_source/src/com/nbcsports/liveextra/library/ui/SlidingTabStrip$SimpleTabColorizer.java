// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui;


// Referenced classes of package com.nbcsports.liveextra.library.ui:
//            SlidingTabStrip

private static class <init>
    implements <init>
{

    private int mDividerColors[];
    private int mIndicatorColors[];

    public final int getDividerColor(int i)
    {
        return mDividerColors[i % mDividerColors.length];
    }

    public final int getIndicatorColor(int i)
    {
        return mIndicatorColors[i % mIndicatorColors.length];
    }

    transient void setDividerColors(int ai[])
    {
        mDividerColors = ai;
    }

    transient void setIndicatorColors(int ai[])
    {
        mIndicatorColors = ai;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
