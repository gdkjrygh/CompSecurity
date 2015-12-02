// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.selfupdate:
//            b

public class AppServerParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final int a;
    private final String b;

    public AppServerParams(int i, String s)
    {
        a = i;
        b = s;
    }

    public AppServerParams(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
    }

    public String a()
    {
        return b;
    }

    public long b()
    {
        return (long)a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
    }

}
