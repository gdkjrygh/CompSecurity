// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceRequestCreator, PlaceFilter

public final class PlaceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PlaceRequestCreator();
    static final long DEFAULT_INTERVAL;
    final long mExpireAt;
    final PlaceFilter mFilter;
    final long mInterval;
    final int mPriority;
    final int mVersionCode;

    public PlaceRequest(int i, PlaceFilter placefilter, long l, int j, long l1)
    {
        mVersionCode = i;
        mFilter = placefilter;
        mInterval = l;
        mPriority = j;
        mExpireAt = l1;
    }

    public final int describeContents()
    {
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
            if (!Objects.equal(mFilter, ((PlaceRequest) (obj)).mFilter) || mInterval != ((PlaceRequest) (obj)).mInterval || mPriority != ((PlaceRequest) (obj)).mPriority || mExpireAt != ((PlaceRequest) (obj)).mExpireAt)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mFilter, Long.valueOf(mInterval), Integer.valueOf(mPriority), Long.valueOf(mExpireAt)
        });
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).add("filter", mFilter).add("interval", Long.valueOf(mInterval)).add("priority", Integer.valueOf(mPriority)).add("expireAt", Long.valueOf(mExpireAt)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PlaceRequestCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        DEFAULT_INTERVAL = TimeUnit.HOURS.toMillis(1L);
    }
}
