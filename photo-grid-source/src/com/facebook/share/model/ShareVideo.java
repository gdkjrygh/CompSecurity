// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareModel

public final class ShareVideo
    implements ShareModel
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final Uri localUrl;

    ShareVideo(Parcel parcel)
    {
        localUrl = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
    }

    private ShareVideo(Builder builder)
    {
        localUrl = builder.localUrl;
    }

    ShareVideo(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Uri getLocalUrl()
    {
        return localUrl;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(localUrl, 0);
    }


    private class Builder
        implements ShareModelBuilder
    {

        private Uri localUrl;

        public final ShareVideo build()
        {
            return new ShareVideo(this, null);
        }

        public final volatile Object build()
        {
            return build();
        }

        public final volatile ShareModelBuilder readFrom(Parcel parcel)
        {
            return readFrom(parcel);
        }

        public final volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((ShareVideo)sharemodel);
        }

        public final Builder readFrom(Parcel parcel)
        {
            return readFrom((ShareVideo)parcel.readParcelable(com/facebook/share/model/ShareVideo.getClassLoader()));
        }

        public final Builder readFrom(ShareVideo sharevideo)
        {
            if (sharevideo == null)
            {
                return this;
            } else
            {
                return setLocalUrl(sharevideo.getLocalUrl());
            }
        }

        public final Builder setLocalUrl(Uri uri)
        {
            localUrl = uri;
            return this;
        }


        public Builder()
        {
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final ShareVideo createFromParcel(Parcel parcel)
        {
            return new ShareVideo(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ShareVideo[] newArray(int i)
        {
            return new ShareVideo[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
