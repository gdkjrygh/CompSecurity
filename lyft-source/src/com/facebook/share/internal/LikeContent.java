// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Parcel;
import com.facebook.share.model.ShareModel;

public class LikeContent
    implements ShareModel
{

    private final String objectId;
    private final String objectType;

    LikeContent(Parcel parcel)
    {
        objectId = parcel.readString();
        objectType = parcel.readString();
    }

    private LikeContent(Builder builder)
    {
        objectId = builder.objectId;
        objectType = builder.objectType;
    }


    public int describeContents()
    {
        return 0;
    }

    public String getObjectId()
    {
        return objectId;
    }

    public String getObjectType()
    {
        return objectType;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(objectId);
        parcel.writeString(objectType);
    }

    private class Builder
        implements ShareModelBuilder
    {

        private String objectId;
        private String objectType;

        public LikeContent build()
        {
            return new LikeContent(this);
        }

        public volatile Object build()
        {
            return build();
        }

        public Builder readFrom(Parcel parcel)
        {
            return readFrom((LikeContent)parcel.readParcelable(com/facebook/share/internal/LikeContent.getClassLoader()));
        }

        public Builder readFrom(LikeContent likecontent)
        {
            if (likecontent == null)
            {
                return this;
            } else
            {
                return setObjectId(likecontent.getObjectId()).setObjectType(likecontent.getObjectType());
            }
        }

        public volatile ShareModelBuilder readFrom(Parcel parcel)
        {
            return readFrom(parcel);
        }

        public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((LikeContent)sharemodel);
        }

        public Builder setObjectId(String s)
        {
            objectId = s;
            return this;
        }

        public Builder setObjectType(String s)
        {
            objectType = s;
            return this;
        }



        public Builder()
        {
        }
    }

}
