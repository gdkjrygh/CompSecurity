// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public class eer
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ees();
    public final long a;
    public final dui b;

    eer(long l, dui dui1)
    {
        a = l;
        b = dui1;
    }

    eer(Parcel parcel)
    {
        a = parcel.readLong();
        b = (dui)parcel.readParcelable(dui.getClassLoader());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(a);
        parcel.writeParcelable(b, i);
    }

}
