// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class djp
    implements android.os.Parcelable.Creator
{

    djp()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new djo(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new djo[i];
    }
}
