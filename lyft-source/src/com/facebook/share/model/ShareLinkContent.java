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

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ShareLinkContent createFromParcel(Parcel parcel)
        {
            return new ShareLinkContent(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ShareLinkContent[] newArray(int i)
        {
            return new ShareLinkContent[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
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


    public int describeContents()
    {
        return 0;
    }

    public String getContentDescription()
    {
        return contentDescription;
    }

    public String getContentTitle()
    {
        return contentTitle;
    }

    public Uri getImageUrl()
    {
        return imageUrl;
    }

    public void writeToParcel(Parcel parcel, int i)
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

        public ShareLinkContent build()
        {
            return new ShareLinkContent(this);
        }

        public volatile Object build()
        {
            return build();
        }

        public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
        {
            return readFrom((ShareLinkContent)sharecontent);
        }

        public Builder readFrom(Parcel parcel)
        {
            return readFrom((ShareLinkContent)parcel.readParcelable(com/facebook/share/model/ShareLinkContent.getClassLoader()));
        }

        public Builder readFrom(ShareLinkContent sharelinkcontent)
        {
            if (sharelinkcontent == null)
            {
                return this;
            } else
            {
                return ((Builder)super.readFrom(sharelinkcontent)).setContentDescription(sharelinkcontent.getContentDescription()).setImageUrl(sharelinkcontent.getImageUrl()).setContentTitle(sharelinkcontent.getContentTitle());
            }
        }

        public volatile ShareModelBuilder readFrom(Parcel parcel)
        {
            return readFrom(parcel);
        }

        public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((ShareLinkContent)sharemodel);
        }

        public Builder setContentDescription(String s)
        {
            contentDescription = s;
            return this;
        }

        public Builder setContentTitle(String s)
        {
            contentTitle = s;
            return this;
        }

        public Builder setImageUrl(Uri uri)
        {
            imageUrl = uri;
            return this;
        }




        public Builder()
        {
        }
    }

}
