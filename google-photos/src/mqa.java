// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class mqa
    implements android.os.Parcelable.Creator
{

    mqa()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new mpz(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new mpz[i];
    }
}
