// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzl, PlaceImpl

public class PlaceLikelihoodEntity
    implements SafeParcelable, PlaceLikelihood
{

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    final int a;
    final PlaceImpl b;
    final float c;

    PlaceLikelihoodEntity(int i, PlaceImpl placeimpl, float f)
    {
        a = i;
        b = placeimpl;
        c = f;
    }

    public static PlaceLikelihoodEntity a(PlaceImpl placeimpl, float f)
    {
        return new PlaceLikelihoodEntity(0, (PlaceImpl)zzu.a(placeimpl), f);
    }

    public Object a()
    {
        return c();
    }

    public Place b()
    {
        return b;
    }

    public PlaceLikelihood c()
    {
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceLikelihoodEntity))
            {
                return false;
            }
            obj = (PlaceLikelihoodEntity)obj;
            if (!b.equals(((PlaceLikelihoodEntity) (obj)).b) || c != ((PlaceLikelihoodEntity) (obj)).c)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzt.a(new Object[] {
            b, Float.valueOf(c)
        });
    }

    public String toString()
    {
        return zzt.a(this).a("place", b).a("likelihood", Float.valueOf(c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.a(this, parcel, i);
    }

}
