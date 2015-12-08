// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places:
//            zzb

public class AddPlaceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    final int a;
    private final String b;
    private final LatLng c;
    private final String d;
    private final List e;
    private final String f;
    private final Uri g;

    AddPlaceRequest(int i, String s, LatLng latlng, String s1, List list, String s2, Uri uri)
    {
        a = i;
        b = zzu.a(s);
        c = (LatLng)zzu.a(latlng);
        d = s1;
        e = new ArrayList(list);
        boolean flag;
        if (!TextUtils.isEmpty(s2) || uri != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.b(flag, "One of phone number or URI should be provided.");
        f = s2;
        g = uri;
    }

    public String a()
    {
        return b;
    }

    public LatLng b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public List d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return f;
    }

    public Uri f()
    {
        return g;
    }

    public String toString()
    {
        return zzt.a(this).a("name", b).a("latLng", c).a("address", d).a("placeTypes", e).a("phoneNumer", f).a("websiteUri", g).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.a(this, parcel, i);
    }

}
