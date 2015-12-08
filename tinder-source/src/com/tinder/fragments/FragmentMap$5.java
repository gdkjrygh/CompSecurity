// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.google.android.m4b.maps.model.LatLng;
import com.tinder.managers.a;
import com.tinder.model.SparksEvent;

// Referenced classes of package com.tinder.fragments:
//            FragmentMap

final class a
    implements Runnable
{

    final LatLng a;
    final FragmentMap b;

    public final void run()
    {
        SparksEvent sparksevent = new SparksEvent("Passport.PinSelect");
        sparksevent.put("newLat", Double.valueOf(a.b));
        sparksevent.put("newLon", Double.valueOf(a.c));
        com.tinder.managers.a.a(sparksevent);
    }

    atLng(FragmentMap fragmentmap, LatLng latlng)
    {
        b = fragmentmap;
        a = latlng;
        super();
    }
}
