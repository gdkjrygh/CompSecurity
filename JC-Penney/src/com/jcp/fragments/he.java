// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments:
//            TrackOrderTabFragment

class he extends DebouncingOnClickListener
{

    final TrackOrderTabFragment a;
    final TrackOrderTabFragment..ViewInjector b;

    he(TrackOrderTabFragment..ViewInjector viewinjector, TrackOrderTabFragment trackordertabfragment)
    {
        b = viewinjector;
        a = trackordertabfragment;
        super();
    }

    public void doClick(View view)
    {
        a.onTabOneClick();
    }
}
