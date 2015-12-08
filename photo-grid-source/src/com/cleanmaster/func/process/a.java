// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.func.process;

import android.os.Parcel;

// Referenced classes of package com.cleanmaster.func.process:
//            PhoneMemoryInfo

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        PhoneMemoryInfo phonememoryinfo = new PhoneMemoryInfo();
        phonememoryinfo.a = parcel.readLong();
        phonememoryinfo.b = parcel.readLong();
        phonememoryinfo.c = parcel.readInt();
        phonememoryinfo.d = parcel.readInt();
        phonememoryinfo.e = parcel.readLong();
        return phonememoryinfo;
    }

    public final Object[] newArray(int i)
    {
        return new PhoneMemoryInfo[i];
    }
}
