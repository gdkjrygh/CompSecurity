// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareContent, ShareModel, o, k, 
//            SharePhoto, ShareVideo, n

public final class ShareVideoContent extends ShareContent
    implements ShareModel
{

    public static final android.os.Parcelable.Creator CREATOR = new o();
    private final String a;
    private final String b;
    private final SharePhoto c;
    private final ShareVideo d;

    ShareVideoContent(Parcel parcel)
    {
        super(parcel);
        a = parcel.readString();
        b = parcel.readString();
        k k1 = (new k()).a(parcel);
        if (k1.a() != null || k1.b() != null)
        {
            c = new SharePhoto(k1, (byte)0);
        } else
        {
            c = null;
        }
        d = new ShareVideo((new n()).a(parcel), (byte)0);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeParcelable(c, 0);
        parcel.writeParcelable(d, 0);
    }

}
