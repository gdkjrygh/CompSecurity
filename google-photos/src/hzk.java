// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class hzk
    implements android.os.Parcelable.Creator
{

    hzk()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new hzj(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new hzj[i];
    }
}
