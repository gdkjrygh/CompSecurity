// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class hkg
    implements android.os.Parcelable.Creator
{

    hkg()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new hkf(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new hkf[i];
    }
}
