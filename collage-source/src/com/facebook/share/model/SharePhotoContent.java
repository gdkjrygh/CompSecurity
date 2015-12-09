// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//            ShareContent, SharePhoto, ShareModelBuilder, ShareModel

public final class SharePhotoContent extends ShareContent
{
    public static class Builder extends ShareContent.Builder
    {

        private final List photos = new ArrayList();

        public Builder addPhoto(SharePhoto sharephoto)
        {
            if (sharephoto != null)
            {
                photos.add((new SharePhoto.Builder()).readFrom(sharephoto).build());
            }
            return this;
        }

        public Builder addPhotos(List list)
        {
            if (list != null)
            {
                for (list = list.iterator(); list.hasNext(); addPhoto((SharePhoto)list.next())) { }
            }
            return this;
        }

        public SharePhotoContent build()
        {
            return new SharePhotoContent(this);
        }

        public volatile Object build()
        {
            return build();
        }

        public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
        {
            return readFrom((SharePhotoContent)sharecontent);
        }

        public volatile ShareModelBuilder readFrom(Parcel parcel)
        {
            return readFrom(parcel);
        }

        public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((SharePhotoContent)sharemodel);
        }

        public Builder readFrom(Parcel parcel)
        {
            return readFrom((SharePhotoContent)parcel.readParcelable(com/facebook/share/model/SharePhotoContent.getClassLoader()));
        }

        public Builder readFrom(SharePhotoContent sharephotocontent)
        {
            if (sharephotocontent == null)
            {
                return this;
            } else
            {
                return ((Builder)super.readFrom(sharephotocontent)).addPhotos(sharephotocontent.getPhotos());
            }
        }

        public Builder setPhotos(List list)
        {
            photos.clear();
            addPhotos(list);
            return this;
        }


        public Builder()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public SharePhotoContent createFromParcel(Parcel parcel)
        {
            return new SharePhotoContent(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public SharePhotoContent[] newArray(int i)
        {
            return new SharePhotoContent[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final List photos;

    SharePhotoContent(Parcel parcel)
    {
        super(parcel);
        photos = Collections.unmodifiableList(SharePhoto.Builder.readListFrom(parcel));
    }

    private SharePhotoContent(Builder builder)
    {
        super(builder);
        photos = Collections.unmodifiableList(builder.photos);
    }


    public int describeContents()
    {
        return 0;
    }

    public List getPhotos()
    {
        return photos;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        SharePhoto.Builder.writeListTo(parcel, photos);
    }

}
