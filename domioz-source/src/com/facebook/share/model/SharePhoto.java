// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareModel, j, k

public final class SharePhoto
    implements ShareModel
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    private final Bitmap a;
    private final Uri b;
    private final boolean c;

    SharePhoto(Parcel parcel)
    {
        a = (Bitmap)parcel.readParcelable(android/graphics/Bitmap.getClassLoader());
        b = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    private SharePhoto(k k1)
    {
        a = k.a(k1);
        b = k.b(k1);
        c = k.c(k1);
    }

    SharePhoto(k k1, byte byte0)
    {
        this(k1);
    }

    public final Bitmap a()
    {
        return a;
    }

    public final Uri b()
    {
        return b;
    }

    public final boolean c()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        i = 0;
        parcel.writeParcelable(a, 0);
        parcel.writeParcelable(b, 0);
        if (c)
        {
            i = 1;
        }
        parcel.writeByte((byte)i);
    }

}
