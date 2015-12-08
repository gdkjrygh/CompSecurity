// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareContent, ShareOpenGraphAction

public final class ShareOpenGraphContent extends ShareContent
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
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

    ShareOpenGraphContent(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final ShareOpenGraphAction getAction()
    {
        return action;
    }

    public final String getPreviewPropertyName()
    {
        return previewPropertyName;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(action, 0);
        parcel.writeString(previewPropertyName);
    }


    private class Builder extends ShareContent.Builder
    {

        private ShareOpenGraphAction action;
        private String previewPropertyName;

        public final ShareOpenGraphContent build()
        {
            return new ShareOpenGraphContent(this, null);
        }

        public final volatile Object build()
        {
            return build();
        }

        public final volatile ShareContent.Builder readFrom(ShareContent sharecontent)
        {
            return readFrom((ShareOpenGraphContent)sharecontent);
        }

        public final volatile ShareModelBuilder readFrom(Parcel parcel)
        {
            return readFrom(parcel);
        }

        public final volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((ShareOpenGraphContent)sharemodel);
        }

        public final Builder readFrom(Parcel parcel)
        {
            return readFrom((ShareOpenGraphContent)parcel.readParcelable(com/facebook/share/model/ShareOpenGraphContent.getClassLoader()));
        }

        public final Builder readFrom(ShareOpenGraphContent shareopengraphcontent)
        {
            if (shareopengraphcontent == null)
            {
                return this;
            } else
            {
                return ((Builder)super.readFrom(shareopengraphcontent)).setAction(shareopengraphcontent.getAction()).setPreviewPropertyName(shareopengraphcontent.getPreviewPropertyName());
            }
        }

        public final Builder setAction(ShareOpenGraphAction shareopengraphaction)
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

        public final Builder setPreviewPropertyName(String s)
        {
            previewPropertyName = s;
            return this;
        }



        public Builder()
        {
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final ShareOpenGraphContent createFromParcel(Parcel parcel)
        {
            return new ShareOpenGraphContent(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ShareOpenGraphContent[] newArray(int i)
        {
            return new ShareOpenGraphContent[i];
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
