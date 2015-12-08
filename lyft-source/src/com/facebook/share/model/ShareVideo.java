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

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ShareVideo createFromParcel(Parcel parcel)
        {
            return new ShareVideo(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ShareVideo[] newArray(int i)
        {
            return new ShareVideo[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final Uri localUrl;

    ShareVideo(Parcel parcel)
    {
        super(parcel);
        localUrl = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
    }

    private ShareVideo(Builder builder)
    {
        super(builder);
        localUrl = builder.localUrl;
    }


    public int describeContents()
    {
        return 0;
    }

    public Uri getLocalUrl()
    {
        return localUrl;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(localUrl, 0);
    }


    private class Builder extends ShareMedia.Builder
    {

        private Uri localUrl;

        public ShareVideo build()
        {
            return new ShareVideo(this);
        }

        public volatile Object build()
        {
            return build();
        }

        public volatile ShareMedia.Builder readFrom(ShareMedia sharemedia)
        {
            return readFrom((ShareVideo)sharemedia);
        }

        public volatile ShareModelBuilder readFrom(Parcel parcel)
        {
            return readFrom(parcel);
        }

        public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((ShareVideo)sharemodel);
        }

        public Builder readFrom(Parcel parcel)
        {
            return readFrom((ShareVideo)parcel.readParcelable(com/facebook/share/model/ShareVideo.getClassLoader()));
        }

        public Builder readFrom(ShareVideo sharevideo)
        {
            if (sharevideo == null)
            {
                return this;
            } else
            {
                return ((Builder)super.readFrom(sharevideo)).setLocalUrl(sharevideo.getLocalUrl());
            }
        }

        public Builder setLocalUrl(Uri uri)
        {
            localUrl = uri;
            return this;
        }


        public Builder()
        {
        }
    }

}
