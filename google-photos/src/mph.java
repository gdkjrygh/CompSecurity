// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class mph
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new mpi();
    public final int a;
    public final int b;
    public final Intent c;

    public mph(int i, int j, Intent intent)
    {
        a = i;
        b = j;
        c = intent;
    }

    mph(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readInt();
        c = (Intent)parcel.readParcelable(android/content/Intent.getClassLoader());
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeParcelable(c, i);
    }

}
