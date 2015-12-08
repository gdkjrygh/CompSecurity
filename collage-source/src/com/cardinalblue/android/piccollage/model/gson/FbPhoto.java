// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FbPhoto
    implements Parcelable
{
    public class DifferentSizeImage
    {

        public int height;
        final FbPhoto this$0;
        public String url;
        public int width;

        public DifferentSizeImage()
        {
            this$0 = FbPhoto.this;
            super();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public FbPhoto createFromParcel(Parcel parcel)
        {
            return new FbPhoto(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public FbPhoto[] newArray(int i)
        {
            return new FbPhoto[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public static final String EXTRA_PHOTOS = "extra_fb_photos";
    private transient boolean isSelected;
    private List mImages;
    private String mSourceUrl;
    private String mThumbnailUrl;

    public FbPhoto()
    {
        mImages = new ArrayList();
    }

    private FbPhoto(Parcel parcel)
    {
        mImages = new ArrayList();
        mThumbnailUrl = parcel.readString();
        mSourceUrl = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isSelected = flag;
    }


    public int describeContents()
    {
        return 0;
    }

    public String getSourceUrl()
    {
        if (mSourceUrl == null && mImages.size() > 0)
        {
            mSourceUrl = ((DifferentSizeImage)mImages.get(0)).url;
        }
        return mSourceUrl;
    }

    public String getThumbnailUrl()
    {
        int i = mImages.size();
        if (mThumbnailUrl == null && i > 0)
        {
            Iterator iterator = mImages.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                DifferentSizeImage differentsizeimage = (DifferentSizeImage)iterator.next();
                if (!differentsizeimage.url.matches("p480x480") && !differentsizeimage.url.matches("p320x320"))
                {
                    continue;
                }
                mThumbnailUrl = differentsizeimage.url;
                break;
            } while (true);
            if (mThumbnailUrl == null)
            {
                mThumbnailUrl = ((DifferentSizeImage)mImages.get(i - 1)).url;
            }
        }
        return mThumbnailUrl;
    }

    public boolean isSelected()
    {
        return isSelected;
    }

    public void setSelected(boolean flag)
    {
        isSelected = flag;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(getThumbnailUrl());
        parcel.writeString(getSourceUrl());
        byte byte0;
        if (isSelected)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
    }

}
