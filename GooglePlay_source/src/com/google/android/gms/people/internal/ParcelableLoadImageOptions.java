// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.people.internal:
//            ParcelableLoadImageOptionsCreator

public class ParcelableLoadImageOptions
    implements SafeParcelable
{

    public static final ParcelableLoadImageOptionsCreator CREATOR = new ParcelableLoadImageOptionsCreator();
    final int mAvatarOptions;
    final int mImageSize;
    final boolean mUseLargePictureForCp2Images;
    final int mVersionCode;

    ParcelableLoadImageOptions(int i, int j, int k, boolean flag)
    {
        mVersionCode = i;
        mImageSize = j;
        mAvatarOptions = k;
        mUseLargePictureForCp2Images = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("imageSize", Integer.valueOf(mImageSize)).add("avatarOptions", Integer.valueOf(mAvatarOptions)).add("useLargePictureForCp2Images", Boolean.valueOf(mUseLargePictureForCp2Images)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParcelableLoadImageOptionsCreator.writeToParcel$277d357a(this, parcel);
    }

}
