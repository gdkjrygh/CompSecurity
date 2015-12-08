// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.cast.CastDevice;

final class lyc
    implements lxl
{

    public static final android.os.Parcelable.Creator CREATOR = new lyd();
    final CastDevice a;

    public lyc()
    {
        a = null;
    }

    public lyc(Parcel parcel)
    {
        a = (CastDevice)parcel.readParcelable(lyc.getClassLoader());
    }

    public lyc(CastDevice castdevice)
    {
        a = castdevice;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
    }

}
