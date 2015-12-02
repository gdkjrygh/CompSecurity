// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.maps;

import com.google.common.d.a.ab;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.maps:
//            GoogleMapFragment, c

class f
    implements Runnable
{

    final GoogleMapFragment a;

    f(GoogleMapFragment googlemapfragment)
    {
        a = googlemapfragment;
        super();
    }

    public void run()
    {
        for (Iterator iterator = GoogleMapFragment.c(a).iterator(); iterator.hasNext(); ((ab)iterator.next()).a_(GoogleMapFragment.b(a).getLastFix())) { }
        GoogleMapFragment.a(a, null);
    }
}
