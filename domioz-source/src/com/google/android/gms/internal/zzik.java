// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gms.internal:
//            gd

public class zzik
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new gd();
    private String a;
    private String b;
    private String c;

    public zzik()
    {
    }

    zzik(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
    }

    public zzik(String s, String s1, String s2)
    {
        a = s;
        b = s1;
        c = s2;
    }

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
    }

}
