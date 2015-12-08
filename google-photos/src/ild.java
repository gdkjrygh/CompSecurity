// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class ild
    implements android.os.Parcelable.Creator
{

    ild()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new ilc(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new ilc[i];
    }
}
