// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.Set;

final class gay
    implements gax
{

    public static final android.os.Parcelable.Creator CREATOR = new gaz();
    private final gaw d;

    gay(Parcel parcel)
    {
        d = gaw.valueOf(parcel.readString());
    }

    gay(Set set)
    {
        d = gaw.a(set);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Set q()
    {
        return d.e;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(d.name());
    }

}
