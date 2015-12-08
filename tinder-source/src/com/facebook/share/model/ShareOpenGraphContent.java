// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareContent, ShareOpenGraphAction

public final class ShareOpenGraphContent extends ShareContent
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ShareOpenGraphContent(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ShareOpenGraphContent[i];
        }

    };
    private final ShareOpenGraphAction a;
    private final String b;

    ShareOpenGraphContent(Parcel parcel)
    {
        super(parcel);
        a = new ShareOpenGraphAction((new ShareOpenGraphAction.a()).a(parcel), (byte)0);
        b = parcel.readString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(a, 0);
        parcel.writeString(b);
    }

}
