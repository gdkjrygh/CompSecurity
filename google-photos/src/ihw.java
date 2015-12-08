// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class ihw
    implements android.os.Parcelable.Creator
{

    ihw()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new ihv(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new ihv[i];
    }
}
