// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.filterinfo;

import android.os.Parcel;

// Referenced classes of package com.roidapp.imagelib.filter.filterinfo:
//            CloudFilterInfo

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        CloudFilterInfo cloudfilterinfo = new CloudFilterInfo();
        cloudfilterinfo.a = parcel.readInt();
        cloudfilterinfo.b = parcel.readInt();
        cloudfilterinfo.c = parcel.readString();
        cloudfilterinfo.d = parcel.readString();
        cloudfilterinfo.e = parcel.readString();
        cloudfilterinfo.f = parcel.readBundle();
        return cloudfilterinfo;
    }

    public final volatile Object[] newArray(int i)
    {
        return new CloudFilterInfo[i];
    }
}
