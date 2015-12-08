// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareOpenGraphValueContainer

public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ShareOpenGraphObject(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ShareOpenGraphObject[i];
        }

    };

    ShareOpenGraphObject(Parcel parcel)
    {
        super(parcel);
    }

}
