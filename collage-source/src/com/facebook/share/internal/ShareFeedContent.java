// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

public class ShareFeedContent extends ShareContent
{
    public static final class Builder extends com.facebook.share.model.ShareContent.Builder
    {

        private String link;
        private String linkCaption;
        private String linkDescription;
        private String linkName;
        private String mediaSource;
        private String picture;
        private String toId;

        public ShareFeedContent build()
        {
            return new ShareFeedContent(this);
        }

        public volatile Object build()
        {
            return build();
        }

        public Builder readFrom(Parcel parcel)
        {
            return readFrom((ShareFeedContent)parcel.readParcelable(com/facebook/share/internal/ShareFeedContent.getClassLoader()));
        }

        public Builder readFrom(ShareFeedContent sharefeedcontent)
        {
            if (sharefeedcontent == null)
            {
                return this;
            } else
            {
                return ((Builder)super.readFrom(sharefeedcontent)).setToId(sharefeedcontent.getToId()).setLink(sharefeedcontent.getLink()).setLinkName(sharefeedcontent.getLinkName()).setLinkCaption(sharefeedcontent.getLinkCaption()).setLinkDescription(sharefeedcontent.getLinkDescription()).setPicture(sharefeedcontent.getPicture()).setMediaSource(sharefeedcontent.getMediaSource());
            }
        }

        public volatile com.facebook.share.model.ShareContent.Builder readFrom(ShareContent sharecontent)
        {
            return readFrom((ShareFeedContent)sharecontent);
        }

        public volatile ShareModelBuilder readFrom(Parcel parcel)
        {
            return readFrom(parcel);
        }

        public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((ShareFeedContent)sharemodel);
        }

        public Builder setLink(String s)
        {
            link = s;
            return this;
        }

        public Builder setLinkCaption(String s)
        {
            linkCaption = s;
            return this;
        }

        public Builder setLinkDescription(String s)
        {
            linkDescription = s;
            return this;
        }

        public Builder setLinkName(String s)
        {
            linkName = s;
            return this;
        }

        public Builder setMediaSource(String s)
        {
            mediaSource = s;
            return this;
        }

        public Builder setPicture(String s)
        {
            picture = s;
            return this;
        }

        public Builder setToId(String s)
        {
            toId = s;
            return this;
        }








        public Builder()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ShareFeedContent createFromParcel(Parcel parcel)
        {
            return new ShareFeedContent(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ShareFeedContent[] newArray(int i)
        {
            return new ShareFeedContent[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final String link;
    private final String linkCaption;
    private final String linkDescription;
    private final String linkName;
    private final String mediaSource;
    private final String picture;
    private final String toId;

    ShareFeedContent(Parcel parcel)
    {
        super(parcel);
        toId = parcel.readString();
        link = parcel.readString();
        linkName = parcel.readString();
        linkCaption = parcel.readString();
        linkDescription = parcel.readString();
        picture = parcel.readString();
        mediaSource = parcel.readString();
    }

    private ShareFeedContent(Builder builder)
    {
        super(builder);
        toId = builder.toId;
        link = builder.link;
        linkName = builder.linkName;
        linkCaption = builder.linkCaption;
        linkDescription = builder.linkDescription;
        picture = builder.picture;
        mediaSource = builder.mediaSource;
    }


    public int describeContents()
    {
        return 0;
    }

    public String getLink()
    {
        return link;
    }

    public String getLinkCaption()
    {
        return linkCaption;
    }

    public String getLinkDescription()
    {
        return linkDescription;
    }

    public String getLinkName()
    {
        return linkName;
    }

    public String getMediaSource()
    {
        return mediaSource;
    }

    public String getPicture()
    {
        return picture;
    }

    public String getToId()
    {
        return toId;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(toId);
        parcel.writeString(link);
        parcel.writeString(linkName);
        parcel.writeString(linkCaption);
        parcel.writeString(linkDescription);
        parcel.writeString(picture);
        parcel.writeString(mediaSource);
    }

}
