// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class nzs
    implements android.os.Parcelable.Creator
{

    nzs()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new nzr(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new nzr[i];
    }
}
