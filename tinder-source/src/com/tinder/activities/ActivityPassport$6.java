// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.os.AsyncTask;
import com.google.android.m4b.maps.model.LatLng;
import com.tinder.fragments.FragmentMap;
import com.tinder.managers.g;
import com.tinder.managers.y;

// Referenced classes of package com.tinder.activities:
//            ActivityPassport

final class a
    implements Runnable
{

    final ActivityPassport a;

    public final void run()
    {
        FragmentMap fragmentmap = ActivityPassport.c(a);
        double d = fragmentmap.b.d();
        double d1 = fragmentmap.b.e();
        LatLng latlng = new LatLng(d, d1);
        AsyncTask.execute(new com.tinder.fragments.>(fragmentmap, d, d1));
        fragmentmap.a(latlng, 400, true);
        com.google.android.m4b.maps.model.j j = fragmentmap.a(latlng, true);
        fragmentmap.a.a(latlng.b, latlng.c, fragmentmap, j);
    }

    (ActivityPassport activitypassport)
    {
        a = activitypassport;
        super();
    }
}
