// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareMedia

public final class ShareVideo extends ShareMedia
{
    public static final class a extends ShareMedia.a
    {

        Uri b;

        private a a(ShareVideo sharevideo)
        {
            if (sharevideo == null)
            {
                return this;
            } else
            {
                a a1 = (a)super.a(sharevideo);
                a1.b = sharevideo.b;
                return a1;
            }
        }

        public final volatile ShareMedia.a a(ShareMedia sharemedia)
        {
            return a((ShareVideo)sharemedia);
        }

        public final a a(Parcel parcel)
        {
            return a((ShareVideo)parcel.readParcelable(com/facebook/share/model/ShareVideo.getClassLoader()));
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ShareVideo(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ShareVideo[i];
        }

    };
    final Uri b;

    ShareVideo(Parcel parcel)
    {
        super(parcel);
        b = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
    }

    private ShareVideo(a a1)
    {
        super(a1);
        b = a1.b;
    }

    ShareVideo(a a1, byte byte0)
    {
        this(a1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(b, 0);
    }

}
