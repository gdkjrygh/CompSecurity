// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kl;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.location.places:
//            g, PlaceFilter

public final class PlaceRequest
    implements SafeParcelable
{

    public static final g CREATOR = new g();
    public static final long DEFAULT_INTERVAL;
    private final long atz;
    private final PlaceFilter awp;
    private final int mPriority;
    final int mVersionCode;

    public PlaceRequest(int i, PlaceFilter placefilter, long l, int j)
    {
        mVersionCode = i;
        awp = placefilter;
        atz = l;
        mPriority = j;
    }

    public final int describeContents()
    {
        g g1 = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceRequest))
            {
                return false;
            }
            obj = (PlaceRequest)obj;
            if (!kl.equal(awp, ((PlaceRequest) (obj)).awp) || atz != ((PlaceRequest) (obj)).atz || mPriority != ((PlaceRequest) (obj)).mPriority)
            {
                return false;
            }
        }
        return true;
    }

    public final PlaceFilter getFilter()
    {
        return awp;
    }

    public final long getInterval()
    {
        return atz;
    }

    public final int getPriority()
    {
        return mPriority;
    }

    public final int hashCode()
    {
        return kl.hashCode(new Object[] {
            awp, Long.valueOf(atz), Integer.valueOf(mPriority)
        });
    }

    public final String toString()
    {
        return kl.j(this).a("filter", awp).a("interval", Long.valueOf(atz)).a("priority", Integer.valueOf(mPriority)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        g g1 = CREATOR;
        g.a(this, parcel, i);
    }

    static 
    {
        DEFAULT_INTERVAL = TimeUnit.HOURS.toMillis(1L);
    }
}
