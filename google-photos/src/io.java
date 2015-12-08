// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class io
    implements android.os.Parcelable.Creator
{

    private ip a;

    public io(ip ip1)
    {
        a = ip1;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a.a(parcel, null);
    }

    public final Object[] newArray(int i)
    {
        return a.a(i);
    }
}
