// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.share;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.messages.model.share:
//            i, j

public class ShareProperty
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    private final String a;
    private final String b;
    private final String c;

    private ShareProperty(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
    }

    ShareProperty(Parcel parcel, i k)
    {
        this(parcel);
    }

    ShareProperty(j j1)
    {
        a = j1.a();
        b = j1.b();
        c = j1.c();
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
    }

}
