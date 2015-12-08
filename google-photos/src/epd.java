// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class epd
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new epe();
    public final String a;
    public final ekq b;

    epd(Parcel parcel)
    {
        b = (ekq)parcel.readParcelable(ekq.getClassLoader());
        a = ((hpe)b.a(hpe)).a.a;
    }

    public epd(ekq ekq1)
    {
        b = ekq1;
        a = ((hpe)ekq1.a(hpe)).a.a;
    }

    public static boolean a(ekq ekq1)
    {
        return ekq1.b(hpe) != null;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(b, i);
    }

}
