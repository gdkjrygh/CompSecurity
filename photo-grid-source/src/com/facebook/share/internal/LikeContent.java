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
    private final com.facebook.share.widget.LikeView.ObjectType objectType;

    LikeContent(Parcel parcel)
    {
        objectId = parcel.readString();
        objectType = com.facebook.share.widget.LikeView.ObjectType.fromInt(parcel.readInt());
    }

    private LikeContent(Builder builder)
    {
        objectId = builder.objectId;
        objectType = builder.objectType;
    }

    LikeContent(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getObjectId()
    {
        return objectId;
    }

    public com.facebook.share.widget.LikeView.ObjectType getObjectType()
    {
        return objectType;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(objectId);
        parcel.writeInt(objectType.getValue());
    }

    private class Builder
        implements ShareModelBuilder
    {

        private String objectId;
        private com.facebook.share.widget.LikeView.ObjectType objectType;

        public LikeContent build()
        {
            return new LikeContent(this, null);
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

        public Builder setObjectType(com.facebook.share.widget.LikeView.ObjectType objecttype)
        {
            com.facebook.share.widget.LikeView.ObjectType objecttype1 = objecttype;
            if (objecttype == null)
            {
                objecttype1 = com.facebook.share.widget.LikeView.ObjectType.UNKNOWN;
            }
            objectType = objecttype1;
            return this;
        }



        public Builder()
        {
            objectType = com.facebook.share.widget.LikeView.ObjectType.UNKNOWN;
        }
    }

}
