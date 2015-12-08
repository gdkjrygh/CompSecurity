// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kl;

// Referenced classes of package com.google.android.gms.location.places:
//            c, PlaceFilter

public final class NearbyAlertRequest
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    private final int atm;
    private final int awb;
    private final PlaceFilter awc;
    private final int mVersionCode;

    NearbyAlertRequest(int i, int j, int k, PlaceFilter placefilter)
    {
        mVersionCode = i;
        atm = j;
        awb = k;
        awc = placefilter;
    }

    public final int describeContents()
    {
        c c1 = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof NearbyAlertRequest))
            {
                return false;
            }
            obj = (NearbyAlertRequest)obj;
            if (atm != ((NearbyAlertRequest) (obj)).atm || awb != ((NearbyAlertRequest) (obj)).awb || !awc.equals(((NearbyAlertRequest) (obj)).awc))
            {
                return false;
            }
        }
        return true;
    }

    public final PlaceFilter getFilter()
    {
        return awc;
    }

    public final int getLoiteringTimeMillis()
    {
        return awb;
    }

    public final int getTransitionTypes()
    {
        return atm;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final int hashCode()
    {
        return kl.hashCode(new Object[] {
            Integer.valueOf(atm), Integer.valueOf(awb)
        });
    }

    public final String toString()
    {
        return kl.j(this).a("transitionTypes", Integer.valueOf(atm)).a("loiteringTimeMillis", Integer.valueOf(awb)).a("placeFilter", awc).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        c c1 = CREATOR;
        c.a(this, parcel, i);
    }

}
