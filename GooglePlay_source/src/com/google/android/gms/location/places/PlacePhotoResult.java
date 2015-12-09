// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacePhotoResultCreator

public class PlacePhotoResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PlacePhotoResultCreator();
    private final Bitmap mBitmap;
    final Status mStatus;
    final BitmapTeleporter mTeleporter;
    final int mVersionCode;

    PlacePhotoResult(int i, Status status, BitmapTeleporter bitmapteleporter)
    {
        mVersionCode = i;
        mStatus = status;
        mTeleporter = bitmapteleporter;
        if (mTeleporter != null)
        {
            mBitmap = bitmapteleporter.get();
            return;
        } else
        {
            mBitmap = null;
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

    public String toString()
    {
        return Objects.toStringHelper(this).add("status", mStatus).add("bitmap", mBitmap).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlacePhotoResultCreator.writeToParcel(this, parcel, i);
    }

}
