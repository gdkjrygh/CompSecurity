// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class hsy
    implements hsv
{

    public static final android.os.Parcelable.Creator CREATOR = new hsz();
    private final String a;

    hsy(Parcel parcel)
    {
        a = parcel.readString();
    }

    public hsy(String s)
    {
        a = (String)p.a(s, "cannot have empty query");
    }

    public final hsw a()
    {
        return hsw.h;
    }

    public final boolean at_()
    {
        return true;
    }

    public final String c()
    {
        return a;
    }

    public final String d()
    {
        return null;
    }

    public final ekq d_(int i)
    {
        dki dki1 = new dki();
        dki1.c = i;
        dki1.a = a;
        return dki1.a();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void h_(boolean flag)
    {
        throw new UnsupportedOperationException("Can't set visibility on text suggestions");
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }

}
