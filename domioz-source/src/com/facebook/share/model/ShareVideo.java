// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareModel, m, n

public final class ShareVideo
    implements ShareModel
{

    public static final android.os.Parcelable.Creator CREATOR = new m();
    private final Uri a;

    ShareVideo(Parcel parcel)
    {
        a = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
    }

    private ShareVideo(n n1)
    {
        a = n.a(n1);
    }

    ShareVideo(n n1, byte byte0)
    {
        this(n1);
    }

    public final Uri a()
    {
        return a;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, 0);
    }

}
