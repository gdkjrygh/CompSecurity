// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class eqi
    implements android.os.Parcelable.Creator
{

    eqi()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new eqh(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new eqh[i];
    }
}
