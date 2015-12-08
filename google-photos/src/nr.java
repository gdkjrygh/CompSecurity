// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.support.v4.view.ViewPager;

public final class nr extends DataSetObserver
{

    private ViewPager a;

    public nr(ViewPager viewpager)
    {
        a = viewpager;
        super();
    }

    public final void onChanged()
    {
        a.c();
    }

    public final void onInvalidated()
    {
        a.c();
    }
}
