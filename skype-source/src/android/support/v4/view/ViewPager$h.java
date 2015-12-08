// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//            ViewPager

private final class <init> extends DataSetObserver
{

    final ViewPager a;

    public final void onChanged()
    {
        a.c();
    }

    public final void onInvalidated()
    {
        a.c();
    }

    private (ViewPager viewpager)
    {
        a = viewpager;
        super();
    }

    it>(ViewPager viewpager, byte byte0)
    {
        this(viewpager);
    }
}
