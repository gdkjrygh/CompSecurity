// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.filterinfo;

import android.os.Parcel;

// Referenced classes of package com.roidapp.imagelib.filter.filterinfo:
//            LocalFilterInfo, CloudFilterInfo

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        LocalFilterInfo localfilterinfo = new LocalFilterInfo();
        localfilterinfo.a = parcel.readInt();
        localfilterinfo.b = parcel.readInt();
        localfilterinfo.c = parcel.readString();
        localfilterinfo.d = parcel.readInt();
        return localfilterinfo;
    }

    public final volatile Object[] newArray(int i)
    {
        return new CloudFilterInfo[i];
    }
}
