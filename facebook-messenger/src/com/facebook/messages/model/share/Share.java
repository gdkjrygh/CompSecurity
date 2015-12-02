// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.es;

// Referenced classes of package com.facebook.messages.model.share:
//            a, ShareMedia, ShareProperty, b

public class Share
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final es f;
    private final es g;

    private Share(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        f = es.a(parcel.readArrayList(com/facebook/messages/model/share/ShareMedia.getClassLoader()));
        d = parcel.readString();
        e = parcel.readString();
        g = es.a(parcel.readArrayList(com/facebook/messages/model/share/ShareProperty.getClassLoader()));
    }

    Share(Parcel parcel, a a1)
    {
        this(parcel);
    }

    Share(b b1)
    {
        a = b1.a();
        b = b1.b();
        c = b1.c();
        f = es.a(b1.d());
        d = b1.e();
        e = b1.f();
        g = es.a(b1.g());
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

    public es d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return d;
    }

    public String f()
    {
        return e;
    }

    public es g()
    {
        return g;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeList(f);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeList(g);
    }

}
