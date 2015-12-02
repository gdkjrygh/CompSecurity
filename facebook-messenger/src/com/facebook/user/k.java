// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;

// Referenced classes of package com.facebook.user:
//            PicCropInfo

final class k
    implements android.os.Parcelable.Creator
{

    k()
    {
    }

    public PicCropInfo a(Parcel parcel)
    {
        return new PicCropInfo(parcel, null);
    }

    public PicCropInfo[] a(int i)
    {
        return new PicCropInfo[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
