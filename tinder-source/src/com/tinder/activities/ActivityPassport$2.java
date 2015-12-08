// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.os.Handler;
import com.google.android.m4b.maps.model.LatLng;
import com.tinder.adapters.g;
import com.tinder.fragments.FragmentMap;
import com.tinder.model.TinderLocation;

// Referenced classes of package com.tinder.activities:
//            ActivityPassport

final class a
    implements Runnable
{

    final int a;
    final ActivityPassport b;

    public final void run()
    {
        TinderLocation tinderlocation = (TinderLocation)ActivityPassport.a(b).getItem(a);
        FragmentMap fragmentmap = ActivityPassport.c(b);
        LatLng latlng = new LatLng(tinderlocation.getLatitude(), tinderlocation.getLongitude());
        fragmentmap.a(latlng, 850, true);
        (new Handler()).postDelayed(new com.tinder.fragments.>(fragmentmap, latlng, tinderlocation), 850L);
    }

    (ActivityPassport activitypassport, int i)
    {
        b = activitypassport;
        a = i;
        super();
    }
}
