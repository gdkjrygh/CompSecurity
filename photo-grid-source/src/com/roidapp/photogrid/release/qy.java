// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Parcel;
import java.util.HashMap;

// Referenced classes of package com.roidapp.photogrid.release:
//            StickerInfo

final class qy
    implements android.os.Parcelable.Creator
{

    qy()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag1 = true;
        StickerInfo stickerinfo = new StickerInfo();
        stickerinfo.b = parcel.readString();
        stickerinfo.c = parcel.readString();
        stickerinfo.a = parcel.readInt();
        stickerinfo.d = parcel.readInt();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stickerinfo.e = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stickerinfo.f = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        stickerinfo.g = flag;
        stickerinfo.h = parcel.readInt();
        stickerinfo.i = parcel.readString();
        stickerinfo.j = parcel.readHashMap(java/util/HashMap.getClassLoader());
        stickerinfo.m = parcel.readString();
        stickerinfo.n = parcel.readString();
        stickerinfo.o = parcel.readInt();
        stickerinfo.p = parcel.readLong();
        return stickerinfo;
    }

    public final volatile Object[] newArray(int i)
    {
        return new StickerInfo[i];
    }
}
