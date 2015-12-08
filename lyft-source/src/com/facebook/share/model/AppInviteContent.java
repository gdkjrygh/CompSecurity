// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareModel

public final class AppInviteContent
    implements ShareModel
{

    private final String applinkUrl;
    private final String previewImageUrl;

    AppInviteContent(Parcel parcel)
    {
        applinkUrl = parcel.readString();
        previewImageUrl = parcel.readString();
    }

    private AppInviteContent(Builder builder)
    {
        applinkUrl = builder.applinkUrl;
        previewImageUrl = builder.previewImageUrl;
    }


    public int describeContents()
    {
        return 0;
    }

    public String getApplinkUrl()
    {
        return applinkUrl;
    }

    public String getPreviewImageUrl()
    {
        return previewImageUrl;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(applinkUrl);
        parcel.writeString(previewImageUrl);
    }

    private class Builder
        implements ShareModelBuilder
    {

        private String applinkUrl;
        private String previewImageUrl;

        public AppInviteContent build()
        {
            return new AppInviteContent(this);
        }

        public volatile Object build()
        {
            return build();
        }

        public Builder readFrom(Parcel parcel)
        {
            return readFrom((AppInviteContent)parcel.readParcelable(com/facebook/share/model/AppInviteContent.getClassLoader()));
        }

        public Builder readFrom(AppInviteContent appinvitecontent)
        {
            if (appinvitecontent == null)
            {
                return this;
            } else
            {
                return setApplinkUrl(appinvitecontent.getApplinkUrl()).setPreviewImageUrl(appinvitecontent.getPreviewImageUrl());
            }
        }

        public volatile ShareModelBuilder readFrom(Parcel parcel)
        {
            return readFrom(parcel);
        }

        public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((AppInviteContent)sharemodel);
        }

        public Builder setApplinkUrl(String s)
        {
            applinkUrl = s;
            return this;
        }

        public Builder setPreviewImageUrl(String s)
        {
            previewImageUrl = s;
            return this;
        }



        public Builder()
        {
        }
    }

}
