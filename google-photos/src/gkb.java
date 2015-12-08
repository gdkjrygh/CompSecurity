// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class gkb
    implements android.os.Parcelable.Creator
{

    gkb()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new gka(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new gka[i];
    }
}
