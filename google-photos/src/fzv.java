// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class fzv
    implements android.os.Parcelable.Creator
{

    fzv()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new fzu(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new fzu[i];
    }
}
