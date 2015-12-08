// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class hq
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new hr();
    final Object a;

    hq(Object obj)
    {
        a = obj;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            parcel.writeParcelable((Parcelable)a, i);
            return;
        } else
        {
            parcel.writeStrongBinder((IBinder)a);
            return;
        }
    }

}
