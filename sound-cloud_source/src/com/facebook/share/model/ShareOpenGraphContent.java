// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareContent, c, ShareOpenGraphAction

public final class ShareOpenGraphContent extends ShareContent
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    public final ShareOpenGraphAction a;
    public final String b;

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
