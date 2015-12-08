// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            WebPhoto, CBCollagesResponse

public class WebPhotosData
    implements Parcelable
{
    public static class Creator
        implements android.os.Parcelable.Creator
    {

        public WebPhotosData createFromParcel(Parcel parcel)
        {
            return new WebPhotosData(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public WebPhotosData[] newArray(int i)
        {
            return new WebPhotosData[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public Creator()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    private String mListRevision;
    private String mNextPageUrl;
    private int mOffset;
    private List mPhotos;
    private int mTotal;

    WebPhotosData()
    {
        mPhotos = new LinkedList();
        init();
    }

    WebPhotosData(Parcel parcel)
    {
        mPhotos = new LinkedList();
        readFromParcel(parcel);
    }

    public WebPhotosData(String s, List list)
    {
        mPhotos = new LinkedList();
        init();
        mNextPageUrl = s;
        mPhotos = list;
    }

    private void init()
    {
        mOffset = 0;
        mTotal = 0;
        mNextPageUrl = "";
        mListRevision = "";
    }

    private void readFromParcel(Parcel parcel)
    {
        mOffset = parcel.readInt();
        mTotal = parcel.readInt();
        mNextPageUrl = parcel.readString();
        parcel.readTypedList(mPhotos, WebPhoto.CREATOR);
        mListRevision = parcel.readString();
    }

    void addMoreCollage(CBCollagesResponse cbcollagesresponse)
    {
        mNextPageUrl = cbcollagesresponse.getCollages().getNextPageUrl();
        cbcollagesresponse = cbcollagesresponse.getCollages().getPhotos().iterator();
        do
        {
            if (!cbcollagesresponse.hasNext())
            {
                break;
            }
            WebPhoto webphoto = (WebPhoto)cbcollagesresponse.next();
            int i = mPhotos.indexOf(webphoto);
            if (i != -1)
            {
                if (i >= 0 || i < mPhotos.size())
                {
                    WebPhoto webphoto1 = (WebPhoto)mPhotos.get(i);
                    webphoto1.setIsLiked(webphoto.isLiked());
                    webphoto1.setLikeNum(webphoto.getLikeNum());
                    webphoto1.setEchoesNum(webphoto.getEchoesNum());
                }
            } else
            {
                mPhotos.add(webphoto);
            }
        } while (true);
    }

    void deletePhoto(int i)
    {
        if (mPhotos != null && mPhotos.size() > i)
        {
            mPhotos.remove(i);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj != null && (obj instanceof WebPhotosData) && mListRevision.equals(((WebPhotosData)obj).mListRevision);
    }

    public String getListRevision()
    {
        return mListRevision;
    }

    public String getNextPageUrl()
    {
        return mNextPageUrl;
    }

    public int getOffset()
    {
        return mOffset;
    }

    public List getPhotos()
    {
        return mPhotos;
    }

    public int getTotal()
    {
        return mTotal;
    }

    public void setNextPageUrl(String s)
    {
        mNextPageUrl = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mOffset);
        parcel.writeInt(mTotal);
        parcel.writeString(mNextPageUrl);
        parcel.writeTypedList(mPhotos);
        parcel.writeString(mListRevision);
    }

}
