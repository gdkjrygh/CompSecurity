// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacePhotoMetadataResultCreator, PlacePhotoMetadataBuffer

public class PlacePhotoMetadataResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PlacePhotoMetadataResultCreator();
    private final PlacePhotoMetadataBuffer mPhotosBuffer;
    final DataHolder mPhotosDataHolder;
    final Status mStatus;
    final int mVersionCode;

    PlacePhotoMetadataResult(int i, Status status, DataHolder dataholder)
    {
        mVersionCode = i;
        mStatus = status;
        mPhotosDataHolder = dataholder;
        if (dataholder == null)
        {
            mPhotosBuffer = null;
            return;
        } else
        {
            mPhotosBuffer = new PlacePhotoMetadataBuffer(mPhotosDataHolder);
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlacePhotoMetadataResultCreator.writeToParcel(this, parcel, i);
    }

}
