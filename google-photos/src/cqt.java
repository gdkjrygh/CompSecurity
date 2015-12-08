// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class cqt
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cqu();
    public final cnq a;

    cqt(Parcel parcel)
    {
        a = (cnq)parcel.readParcelable(getClass().getClassLoader());
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof cqt)
        {
            return ((cqt)obj).a.equals(a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return b.h(a, 17);
    }

    public final String toString()
    {
        String s = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 11)).append("Inclusion(").append(s).append(")").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, 0);
    }

}
