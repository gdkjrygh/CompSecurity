// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class fuw
    implements android.os.Parcelable.Creator
{

    fuw()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new fuv(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new fuv[i];
    }
}
