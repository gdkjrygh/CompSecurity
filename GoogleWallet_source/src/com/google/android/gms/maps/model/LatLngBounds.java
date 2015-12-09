// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kl;
import com.google.android.gms.internal.kn;
import com.google.android.gms.maps.internal.aa;

// Referenced classes of package com.google.android.gms.maps.model:
//            g, LatLng, h

public final class LatLngBounds
    implements SafeParcelable
{

    public static final g CREATOR = new g();
    private final int mVersionCode;
    public final LatLng northeast;
    public final LatLng southwest;

    LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        kn.b(latlng, "null southwest");
        kn.b(latlng1, "null northeast");
        boolean flag;
        if (latlng1.latitude >= latlng.latitude)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.b(flag, "southern latitude exceeds northern latitude (%s > %s)", new Object[] {
            Double.valueOf(latlng.latitude), Double.valueOf(latlng1.latitude)
        });
        mVersionCode = i;
        southwest = latlng;
        northeast = latlng1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LatLngBounds))
            {
                return false;
            }
            obj = (LatLngBounds)obj;
            if (!southwest.equals(((LatLngBounds) (obj)).southwest) || !northeast.equals(((LatLngBounds) (obj)).northeast))
            {
                return false;
            }
        }
        return true;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public final int hashCode()
    {
        return kl.hashCode(new Object[] {
            southwest, northeast
        });
    }

    public final String toString()
    {
        return kl.j(this).a("southwest", southwest).a("northeast", northeast).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (aa.qp())
        {
            h.a(this, parcel, i);
            return;
        } else
        {
            g.a(this, parcel, i);
            return;
        }
    }

}
