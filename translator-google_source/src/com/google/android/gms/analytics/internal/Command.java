// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            a

public class Command
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public String a;
    public String b;
    public String c;

    public Command()
    {
    }

    Command(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
    }

    public Command(String s, String s1, String s2)
    {
        a = s;
        b = s1;
        c = s2;
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
