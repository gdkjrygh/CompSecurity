// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.app.ac;
import android.widget.Toast;
import com.google.android.gms.maps.f;
import com.google.android.gms.maps.model.LatLng;
import com.jcp.storepickup.pojo.Stores;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            FindStoreDetailsFragment

class aq
    implements f
{

    final FindStoreDetailsFragment a;

    aq(FindStoreDetailsFragment findstoredetailsfragment)
    {
        a = findstoredetailsfragment;
        super();
    }

    public void a(LatLng latlng)
    {
        latlng = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("geo:").append(FindStoreDetailsFragment.a(a).getLatitude()).append(",").append(FindStoreDetailsFragment.a(a).getLongitude()).toString()));
        boolean flag;
        if (a.i().getPackageManager().queryIntentActivities(latlng, 0).size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            latlng.setPackage("com.google.android.apps.maps");
            a.a(latlng);
            return;
        } else
        {
            Toast.makeText(a.i(), a.i().getResources().getString(0x7f07005d), 0).show();
            return;
        }
    }
}
