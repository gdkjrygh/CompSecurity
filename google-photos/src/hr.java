// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class hr
    implements android.os.Parcelable.Creator
{

    hr()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            parcel = parcel.readParcelable(null);
        } else
        {
            parcel = parcel.readStrongBinder();
        }
        return new hq(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new hq[i];
    }
}
