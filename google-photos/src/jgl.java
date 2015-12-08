// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class jgl
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new jgm();
    public final int a;
    public final int b;

    public jgl(int i, int j)
    {
        a = i;
        b = j;
    }

    jgl(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readInt();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
    }

}
