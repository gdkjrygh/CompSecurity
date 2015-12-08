// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//            ViewPager

class <init> extends DataSetObserver
{

    final ViewPager a;

    public void onChanged()
    {
        a.dataSetChanged();
    }

    public void onInvalidated()
    {
        a.dataSetChanged();
    }

    private (ViewPager viewpager)
    {
        a = viewpager;
        super();
    }

    a(ViewPager viewpager, a a1)
    {
        this(viewpager);
    }
}
