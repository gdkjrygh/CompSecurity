// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.share;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.messages.model.share:
//            c, ShareMediaPhoto, ShareMediaVideo, d

public class ShareMedia
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final ShareMediaPhoto e;
    private final ShareMediaVideo f;

    private ShareMedia(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = (ShareMediaPhoto)parcel.readParcelable(com/facebook/messages/model/share/ShareMediaPhoto.getClassLoader());
        f = (ShareMediaVideo)parcel.readParcelable(com/facebook/messages/model/share/ShareMediaVideo.getClassLoader());
    }

    ShareMedia(Parcel parcel, c c1)
    {
        this(parcel);
    }

    ShareMedia(d d1)
    {
        a = d1.a();
        b = d1.b();
        c = d1.c();
        d = d1.d();
        e = d1.e();
        f = d1.f();
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

    public ShareMediaPhoto e()
    {
        return e;
    }

    public ShareMediaVideo f()
    {
        return f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeParcelable(e, i);
        parcel.writeParcelable(f, i);
    }

}
