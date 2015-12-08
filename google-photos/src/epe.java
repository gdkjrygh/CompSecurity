// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class epe
    implements android.os.Parcelable.Creator
{

    epe()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new epd(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new epd[i];
    }
}
