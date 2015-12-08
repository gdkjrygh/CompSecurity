// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class ikt
    implements android.os.Parcelable.Creator
{

    ikt()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new iks(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new iks[i];
    }
}
