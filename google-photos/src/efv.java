// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class efv
    implements android.os.Parcelable.Creator
{

    efv()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new efu(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new efu[i];
    }
}
