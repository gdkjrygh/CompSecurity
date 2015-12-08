// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareMedia, e

public final class SharePhoto extends ShareMedia
{
    public static final class a extends ShareMedia.a
    {

        Bitmap b;
        Uri c;
        boolean d;
        String e;

        private a a(SharePhoto sharephoto)
        {
            if (sharephoto == null)
            {
                return this;
            } else
            {
                a a1 = (a)super.a(sharephoto);
                a1.b = sharephoto.b;
                a1.c = sharephoto.c;
                a1.d = sharephoto.d;
                a1.e = sharephoto.e;
                return a1;
            }
        }

        public final volatile ShareMedia.a a(ShareMedia sharemedia)
        {
            return a((SharePhoto)sharemedia);
        }

        public final a a(Parcel parcel)
        {
            return a((SharePhoto)parcel.readParcelable(com/facebook/share/model/SharePhoto.getClassLoader()));
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new e();
    public final Bitmap b;
    public final Uri c;
    public final boolean d;
    final String e;

    SharePhoto(Parcel parcel)
    {
        super(parcel);
        b = (Bitmap)parcel.readParcelable(android/graphics/Bitmap.getClassLoader());
        c = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        e = parcel.readString();
    }

    private SharePhoto(a a1)
    {
        super(a1);
        b = a1.b;
        c = a1.c;
        d = a1.d;
        e = a1.e;
    }

    SharePhoto(a a1, byte byte0)
    {
        this(a1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = false;
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(b, 0);
        parcel.writeParcelable(c, 0);
        i = ((flag) ? 1 : 0);
        if (d)
        {
            i = 1;
        }
        parcel.writeByte((byte)i);
        parcel.writeString(e);
    }

}
