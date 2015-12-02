// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//            ViewPager, at

class bc extends DataSetObserver
{

    final ViewPager a;

    private bc(ViewPager viewpager)
    {
        a = viewpager;
        super();
    }

    bc(ViewPager viewpager, at at)
    {
        this(viewpager);
    }

    public void onChanged()
    {
        a.b();
    }

    public void onInvalidated()
    {
        a.b();
    }
}
