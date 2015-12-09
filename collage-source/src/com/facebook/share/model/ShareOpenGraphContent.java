// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareContent, ShareOpenGraphAction, ShareModelBuilder, ShareModel

public final class ShareOpenGraphContent extends ShareContent
{
    public static final class Builder extends ShareContent.Builder
    {

        private ShareOpenGraphAction action;
        private String previewPropertyName;

        public ShareOpenGraphContent build()
        {
            return new ShareOpenGraphContent(this);
        }

        public volatile Object build()
        {
            return build();
        }

        public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
        {
            return readFrom((ShareOpenGraphContent)sharecontent);
        }

        public volatile ShareModelBuilder readFrom(Parcel parcel)
        {
            return readFrom(parcel);
        }

        public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((ShareOpenGraphContent)sharemodel);
        }

        public Builder readFrom(Parcel parcel)
        {
            return readFrom((ShareOpenGraphContent)parcel.readParcelable(com/facebook/share/model/ShareOpenGraphContent.getClassLoader()));
        }

        public Builder readFrom(ShareOpenGraphContent shareopengraphcontent)
        {
            if (shareopengraphcontent == null)
            {
                return this;
            } else
            {
                return ((Builder)super.readFrom(shareopengraphcontent)).setAction(shareopengraphcontent.getAction()).setPreviewPropertyName(shareopengraphcontent.getPreviewPropertyName());
            }
        }

        public Builder setAction(ShareOpenGraphAction shareopengraphaction)
        {
            if (shareopengraphaction == null)
            {
                shareopengraphaction = null;
            } else
            {
                shareopengraphaction = (new ShareOpenGraphAction.Builder()).readFrom(shareopengraphaction).build();
            }
            action = shareopengraphaction;
            return this;
        }

        public Builder setPreviewPropertyName(String s)
        {
            previewPropertyName = s;
            return this;
        }



        public Builder()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ShareOpenGraphContent createFromParcel(Parcel parcel)
        {
            return new ShareOpenGraphContent(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ShareOpenGraphContent[] newArray(int i)
        {
            return new ShareOpenGraphContent[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final ShareOpenGraphAction action;
    private final String previewPropertyName;

    ShareOpenGraphContent(Parcel parcel)
    {
        super(parcel);
        action = (new ShareOpenGraphAction.Builder()).readFrom(parcel).build();
        previewPropertyName = parcel.readString();
    }

    private ShareOpenGraphContent(Builder builder)
    {
        super(builder);
        action = builder.action;
        previewPropertyName = builder.previewPropertyName;
    }


    public int describeContents()
    {
        return 0;
    }

    public ShareOpenGraphAction getAction()
    {
        return action;
    }

    public String getPreviewPropertyName()
    {
        return previewPropertyName;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(action, 0);
        parcel.writeString(previewPropertyName);
    }

}
