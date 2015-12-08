// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class ndz
    implements android.os.Parcelable.Creator
{

    ndz()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new ndy(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new ndy[i];
    }
}
