// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.share;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.messages.model.share:
//            g, h

public class ShareMediaVideo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    private ShareMediaVideo(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
    }

    ShareMediaVideo(Parcel parcel, g g1)
    {
        this(parcel);
    }

    ShareMediaVideo(h h1)
    {
        a = h1.a();
        b = h1.b();
        c = h1.c();
        d = h1.d();
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

    public String d()
    {
        return d;
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
        parcel.writeString(d);
    }

}
