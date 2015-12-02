// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.orca.stickers:
//            b

public class Sticker
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final String a;
    private final Uri b;
    private final Uri c;

    private Sticker(Parcel parcel)
    {
        a = parcel.readString();
        b = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        c = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
    }

    Sticker(Parcel parcel, b b1)
    {
        this(parcel);
    }

    public Sticker(String s, Uri uri, Uri uri1)
    {
        a = s;
        b = uri;
        c = uri1;
    }

    public String a()
    {
        return a;
    }

    public Uri b()
    {
        return b;
    }

    public Uri c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof Sticker))
        {
            return false;
        } else
        {
            obj = (Sticker)obj;
            return Objects.equal(a(), ((Sticker) (obj)).a());
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(c, i);
    }

}
