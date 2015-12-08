// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

final class nzn extends nzx
{

    public static final android.os.Parcelable.Creator CREATOR = new nzo();
    String a;

    public nzn(Parcel parcel)
    {
        super(parcel);
        a = parcel.readString();
    }

    public nzn(Parcelable parcelable)
    {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(a);
    }

}
