// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class gtl
    implements android.os.Parcelable.Creator
{

    gtl()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new gtk(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new gtk[i];
    }
}
