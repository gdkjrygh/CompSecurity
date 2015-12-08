// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareContent

public final class ShareLinkContent extends ShareContent
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final String contentDescription;
    private final String contentTitle;
    private final Uri imageUrl;

    ShareLinkContent(Parcel parcel)
    {
        super(parcel);
        contentDescription = parcel.readString();
        contentTitle = parcel.readString();
        imageUrl = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
    }

    private ShareLinkContent(Builder builder)
    {
        super(builder);
        contentDescription = builder.contentDescription;
        contentTitle = builder.contentTitle;
        imageUrl = builder.imageUrl;
    }

    ShareLinkContent(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getContentDescription()
    {
        return contentDescription;
    }

    public final String getContentTitle()
    {
        return contentTitle;
    }

    public final Uri getImageUrl()
    {
        return imageUrl;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(contentDescription);
        parcel.writeString(contentTitle);
        parcel.writeParcelable(imageUrl, 0);
    }


    private class Builder extends ShareContent.Builder
    {

        private String contentDescription;
        private String contentTitle;
        private Uri imageUrl;

        public final ShareLinkContent build()
        {
            return new ShareLinkContent(this, null);
        }

        public final volatile Object build()
        {
            return build();
        }

        public final volatile ShareContent.Builder readFrom(ShareContent sharecontent)
        {
            return readFrom((ShareLinkContent)sharecontent);
        }

        public final Builder readFrom(Parcel parcel)
        {
            return readFrom((ShareLinkContent)parcel.readParcelable(com/facebook/share/model/ShareLinkContent.getClassLoader()));
        }

        public final Builder readFrom(ShareLinkContent sharelinkcontent)
        {
            if (sharelinkcontent == null)
            {
                return this;
            } else
            {
                return ((Builder)super.readFrom(sharelinkcontent)).setContentDescription(sharelinkcontent.getContentDescription()).setImageUrl(sharelinkcontent.getImageUrl()).setContentTitle(sharelinkcontent.getContentTitle());
            }
        }

        public final volatile ShareModelBuilder readFrom(Parcel parcel)
        {
            return readFrom(parcel);
        }

        public final volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((ShareLinkContent)sharemodel);
        }

        public final Builder setContentDescription(String s)
        {
            contentDescription = s;
            return this;
        }

        public final Builder setContentTitle(String s)
        {
            contentTitle = s;
            return this;
        }

        public final Builder setImageUrl(Uri uri)
        {
            imageUrl = uri;
            return this;
        }




        public Builder()
        {
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final ShareLinkContent createFromParcel(Parcel parcel)
        {
            return new ShareLinkContent(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ShareLinkContent[] newArray(int i)
        {
            return new ShareLinkContent[i];
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
