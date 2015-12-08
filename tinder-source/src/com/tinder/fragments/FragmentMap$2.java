// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.google.android.m4b.maps.model.LatLng;
import com.tinder.model.TinderLocation;

// Referenced classes of package com.tinder.fragments:
//            FragmentMap

public final class b
    implements Runnable
{

    final LatLng a;
    final TinderLocation b;
    final FragmentMap c;

    public final void run()
    {
        com.google.android.m4b.maps.model.j j = c.a(a, false);
        c.a(j, b);
    }

    public atLng(FragmentMap fragmentmap, LatLng latlng, TinderLocation tinderlocation)
    {
        c = fragmentmap;
        a = latlng;
        b = tinderlocation;
        super();
    }
}
