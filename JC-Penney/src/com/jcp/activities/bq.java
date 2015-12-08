// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.location.Location;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.jcp.c.n;
import com.jcp.helper.z;
import com.jcp.util.an;

// Referenced classes of package com.jcp.activities:
//            SelectPickUpStoreActivity

class bq
    implements an
{

    final SelectPickUpStoreActivity a;

    bq(SelectPickUpStoreActivity selectpickupstoreactivity)
    {
        a = selectpickupstoreactivity;
        super();
    }

    public void a()
    {
        a.mProgressBar.setVisibility(4);
        a.mLocationView.setVisibility(0);
    }

    public void a(Location location)
    {
        if (location == null)
        {
            return;
        } else
        {
            z z1 = new z(a, location);
            z1.a(SelectPickUpStoreActivity.f(a));
            z1.execute(new Void[0]);
            SelectPickUpStoreActivity.g(a).a(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()), Boolean.valueOf(SelectPickUpStoreActivity.e(a)), 5);
            return;
        }
    }
}
