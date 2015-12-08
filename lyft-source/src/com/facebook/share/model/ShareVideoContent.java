// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareContent, ShareModel, SharePhoto, ShareVideo

public final class ShareVideoContent extends ShareContent
    implements ShareModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ShareVideoContent createFromParcel(Parcel parcel)
        {
            return new ShareVideoContent(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ShareVideoContent[] newArray(int i)
        {
            return new ShareVideoContent[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final String contentDescription;
    private final String contentTitle;
    private final SharePhoto previewPhoto;
    private final ShareVideo video;

    ShareVideoContent(Parcel parcel)
    {
        super(parcel);
        contentDescription = parcel.readString();
        contentTitle = parcel.readString();
        SharePhoto.Builder builder = (new SharePhoto.Builder()).readFrom(parcel);
        if (builder.getImageUrl() != null || builder.getBitmap() != null)
        {
            previewPhoto = builder.build();
        } else
        {
            previewPhoto = null;
        }
        video = (new ShareVideo.Builder()).readFrom(parcel).build();
    }

    private ShareVideoContent(Builder builder)
    {
        super(builder);
        contentDescription = builder.contentDescription;
        contentTitle = builder.contentTitle;
        previewPhoto = builder.previewPhoto;
        video = builder.video;
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

    public SharePhoto getPreviewPhoto()
    {
        return previewPhoto;
    }

    public ShareVideo getVideo()
    {
        return video;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(contentDescription);
        parcel.writeString(contentTitle);
        parcel.writeParcelable(previewPhoto, 0);
        parcel.writeParcelable(video, 0);
    }


    private class Builder extends ShareContent.Builder
    {

        private String contentDescription;
        private String contentTitle;
        private SharePhoto previewPhoto;
        private ShareVideo video;

        public ShareVideoContent build()
        {
            return new ShareVideoContent(this);
        }

        public volatile Object build()
        {
            return build();
        }

        public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
        {
            return readFrom((ShareVideoContent)sharecontent);
        }

        public volatile ShareModelBuilder readFrom(Parcel parcel)
        {
            return readFrom(parcel);
        }

        public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((ShareVideoContent)sharemodel);
        }

        public Builder readFrom(Parcel parcel)
        {
            return readFrom((ShareVideoContent)parcel.readParcelable(com/facebook/share/model/ShareVideoContent.getClassLoader()));
        }

        public Builder readFrom(ShareVideoContent sharevideocontent)
        {
            if (sharevideocontent == null)
            {
                return this;
            } else
            {
                return ((Builder)super.readFrom(sharevideocontent)).setContentDescription(sharevideocontent.getContentDescription()).setContentTitle(sharevideocontent.getContentTitle()).setPreviewPhoto(sharevideocontent.getPreviewPhoto()).setVideo(sharevideocontent.getVideo());
            }
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

        public Builder setPreviewPhoto(SharePhoto sharephoto)
        {
            if (sharephoto == null)
            {
                sharephoto = null;
            } else
            {
                sharephoto = (new SharePhoto.Builder()).readFrom(sharephoto).build();
            }
            previewPhoto = sharephoto;
            return this;
        }

        public Builder setVideo(ShareVideo sharevideo)
        {
            if (sharevideo == null)
            {
                return this;
            } else
            {
                video = (new ShareVideo.Builder()).readFrom(sharevideo).build();
                return this;
            }
        }





        public Builder()
        {
        }
    }

}
