// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.groupinfo;

import android.os.Parcel;

// Referenced classes of package com.roidapp.imagelib.filter.groupinfo:
//            CloudGroupInfo, IGroupInfo

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        CloudGroupInfo cloudgroupinfo = new CloudGroupInfo(parcel);
        cloudgroupinfo.b = parcel.readString();
        cloudgroupinfo.c = parcel.readString();
        cloudgroupinfo.d = parcel.readString();
        cloudgroupinfo.g = parcel.readInt();
        cloudgroupinfo.e = parcel.readInt();
        return cloudgroupinfo;
    }

    public final volatile Object[] newArray(int i)
    {
        return new IGroupInfo[i];
    }
}
