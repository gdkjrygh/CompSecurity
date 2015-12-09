// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook:
//            ad, q

public class <init>
    implements Parcelable
{

    public static final android.os.e.b CREATOR = new ad();
    private final String a;
    private final Parcelable b;

    public final String a()
    {
        return a;
    }

    public final Parcelable b()
    {
        return b;
    }

    public int describeContents()
    {
        return 1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeParcelable(b, i);
    }


    private (Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readParcelable(q.f().getClassLoader());
    }

    b(Parcel parcel, byte byte0)
    {
        this(parcel);
    }
}
