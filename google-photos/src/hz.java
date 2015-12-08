// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class hz
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ia();
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public hz(int i, int j, int k, int l, int i1)
    {
        a = i;
        b = j;
        c = k;
        d = l;
        e = i1;
    }

    public hz(Parcel parcel)
    {
        a = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readInt();
        e = parcel.readInt();
        b = parcel.readInt();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeInt(e);
        parcel.writeInt(b);
    }

}
