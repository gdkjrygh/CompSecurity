// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//            ShareContent

public final class SharePhotoContent extends ShareContent
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
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

    SharePhotoContent(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final List getPhotos()
    {
        return photos;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        SharePhoto.Builder.writeListTo(parcel, photos);
    }


    private class Builder extends ShareContent.Builder
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
            return new SharePhotoContent(this, null);
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


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final SharePhotoContent createFromParcel(Parcel parcel)
        {
            return new SharePhotoContent(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final SharePhotoContent[] newArray(int i)
        {
            return new SharePhotoContent[i];
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
