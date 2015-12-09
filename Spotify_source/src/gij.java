// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class gij
    implements android.os.Parcelable.Creator
{

    gij()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return parcel.readString();
    }

    public final volatile Object[] newArray(int i)
    {
        return new String[i];
    }
}
