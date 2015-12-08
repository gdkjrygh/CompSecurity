// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class iqt
    implements android.os.Parcelable.Creator
{

    iqt()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new iqs(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new iqs[i];
    }
}
