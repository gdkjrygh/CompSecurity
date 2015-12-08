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
    private String a;
    private String b;
    private String c;

    public Command()
    {
    }

    Command(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
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
