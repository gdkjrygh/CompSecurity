// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.viewercontext;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.parcels.a;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.auth.viewercontext:
//            b, c

public class ViewerContext
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final String e;
    private final String f;
    private final String g;

    private ViewerContext(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = com.facebook.common.parcels.a.a(parcel);
        e = parcel.readString();
        f = parcel.readString();
        g = parcel.readString();
    }

    ViewerContext(Parcel parcel, b b1)
    {
        this(parcel);
    }

    ViewerContext(c c1)
    {
        a = (String)Preconditions.checkNotNull(c1.a());
        b = (String)Preconditions.checkNotNull(c1.b());
        c = c1.c();
        d = c1.d();
        e = c1.e();
        f = c1.f();
        g = c1.g();
    }

    public static c newBuilder()
    {
        return new c();
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public boolean c()
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
        com.facebook.common.parcels.a.a(parcel, d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
    }

}
