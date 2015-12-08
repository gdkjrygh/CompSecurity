// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.cast.CastDevice;

final class lyp
    implements lxl
{

    public static final android.os.Parcelable.Creator CREATOR = new lyq();
    final CastDevice a;

    public lyp()
    {
        a = null;
    }

    public lyp(Parcel parcel)
    {
        a = (CastDevice)parcel.readParcelable(lyp.getClassLoader());
    }

    public lyp(CastDevice castdevice)
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
