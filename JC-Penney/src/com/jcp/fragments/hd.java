// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.support.v4.view.di;

// Referenced classes of package com.jcp.fragments:
//            TrackOrderTabFragment

class hd
    implements di
{

    final TrackOrderTabFragment a;
    final TrackOrderTabFragment..ViewInjector b;

    hd(TrackOrderTabFragment..ViewInjector viewinjector, TrackOrderTabFragment trackordertabfragment)
    {
        b = viewinjector;
        a = trackordertabfragment;
        super();
    }

    public void a(int i)
    {
        a.onPageSelected(i);
    }

    public void a(int i, float f, int j)
    {
    }

    public void b(int i)
    {
    }
}
