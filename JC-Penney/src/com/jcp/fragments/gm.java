// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.location.Address;
import android.location.Location;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.jcp.c.n;
import com.jcp.helper.z;
import com.jcp.util.an;

// Referenced classes of package com.jcp.fragments:
//            gh, gr

class gm
    implements an
{

    final gh a;

    gm(gh gh1)
    {
        a = gh1;
        super();
    }

    public void a()
    {
        gh.d(a).setVisibility(4);
        gh.o(a).setVisibility(0);
    }

    public void a(Location location)
    {
        if (location == null)
        {
            return;
        }
        z z1 = new z(a.i(), location);
        z1.a(gh.r(a));
        z1.execute(new Void[0]);
        if (gh.i(a))
        {
            gh.m(a).a(gr.a(gh.l(a)), Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
        } else
        if (com.jcp.fragments.gh.n(a))
        {
            gh.m(a).a(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()), Integer.valueOf(50));
        } else
        if (gh.b(a) != null)
        {
            gh.m(a).a(Double.valueOf(gh.b(a).getLatitude()), Double.valueOf(gh.b(a).getLongitude()));
        } else
        {
            gh.m(a).a(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
        }
        gh.d(a).setVisibility(4);
        gh.o(a).setVisibility(0);
    }
}
