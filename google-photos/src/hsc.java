// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class hsc
    implements hsv
{

    public static final android.os.Parcelable.Creator CREATOR = new hsd();
    public final hsb a;
    private boolean b;

    hsc(Parcel parcel)
    {
        b = true;
        a = (hsb)parcel.readSerializable();
    }

    hsc(hsb hsb1)
    {
        b = true;
        a = hsb1;
    }

    public final hsw a()
    {
        return hsw.d;
    }

    public final boolean at_()
    {
        return b;
    }

    public final String c()
    {
        return hsb.a(a);
    }

    public final String d()
    {
        return null;
    }

    public final ekq d_(int i)
    {
        dki dki1 = new dki();
        dki1.c = i;
        dki1.a = hsb.a(a);
        return dki1.a();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void h_(boolean flag)
    {
        b = flag;
    }

    public final String toString()
    {
        String s = String.valueOf("TypeSuggestion{type=");
        String s1 = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(s1).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeSerializable(a);
    }

}
