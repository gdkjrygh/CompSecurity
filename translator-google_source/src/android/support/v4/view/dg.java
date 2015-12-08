// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//            ViewPager

final class dg extends DataSetObserver
{

    final ViewPager a;

    dg(ViewPager viewpager)
    {
        a = viewpager;
        super();
    }

    public final void onChanged()
    {
        a.a();
    }

    public final void onInvalidated()
    {
        a.a();
    }
}
