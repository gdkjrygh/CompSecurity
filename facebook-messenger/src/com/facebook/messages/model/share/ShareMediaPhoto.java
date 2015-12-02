// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.share;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.messages.model.share:
//            e, f

public class ShareMediaPhoto
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final int f;

    private ShareMediaPhoto(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readInt();
        f = parcel.readInt();
    }

    ShareMediaPhoto(Parcel parcel, e e1)
    {
        this(parcel);
    }

    ShareMediaPhoto(f f1)
    {
        a = f1.a();
        b = f1.b();
        c = f1.c();
        d = f1.d();
        e = f1.e();
        f = f1.f();
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

    public int e()
    {
        return e;
    }

    public int f()
    {
        return f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeInt(e);
        parcel.writeInt(f);
    }

}
