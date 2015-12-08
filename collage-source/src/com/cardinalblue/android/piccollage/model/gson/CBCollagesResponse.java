// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.o;
import com.google.b.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            WebPhotosData, WebPromotionData, WebPhoto

public class CBCollagesResponse
    implements Parcelable
{
    public static class CBCollagesResponseDeserializer
        implements k
    {

        private static final String PC_API_FEED_NODE = "collages";
        private static final String PC_API_LIKES_NODE = "likes";
        private static final String PC_API_PROMOTION_NODE = "promotion";
        private static final String PC_API_SEARCH_NODE = "search";

        public CBCollagesResponse deserialize(l l1, Type type, j j1)
            throws p
        {
            Object obj = null;
            WebPhotosData webphotosdata = new WebPhotosData();
            o o1 = l1.m();
            if (o1.b("promotion"))
            {
                type = (WebPromotionData)j1.a(o1.c("promotion"), com/cardinalblue/android/piccollage/model/gson/WebPromotionData);
            } else
            {
                type = null;
            }
            if (o1.b("collages"))
            {
                l1 = o1.c("collages");
            } else
            if (o1.b("likes"))
            {
                l1 = o1.c("likes");
            } else
            {
                l1 = obj;
                if (o1.b("search"))
                {
                    l1 = o1.c("search");
                }
            }
            if (l1 != null)
            {
                l1 = (WebPhotosData)j1.a(l1, com/cardinalblue/android/piccollage/model/gson/WebPhotosData);
            } else
            {
                l1 = webphotosdata;
            }
            return new CBCollagesResponse(l1, type);
        }

        public volatile Object deserialize(l l1, Type type, j j1)
            throws p
        {
            return deserialize(l1, type, j1);
        }

        public CBCollagesResponseDeserializer()
        {
        }
    }

    public static class Creator
        implements android.os.Parcelable.Creator
    {

        public CBCollagesResponse createFromParcel(Parcel parcel)
        {
            return new CBCollagesResponse(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public CBCollagesResponse[] newArray(int i)
        {
            return new CBCollagesResponse[i];
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
    private WebPhotosData mCollages;
    private Date mDownloadedDate;
    private WebPromotionData mPromotion;

    public CBCollagesResponse()
    {
        this(new WebPhotosData(), null);
    }

    public CBCollagesResponse(Parcel parcel)
    {
        mDownloadedDate = null;
        mCollages = (WebPhotosData)parcel.readParcelable(com/cardinalblue/android/piccollage/model/gson/WebPhotosData.getClassLoader());
        mPromotion = (WebPromotionData)parcel.readParcelable(com/cardinalblue/android/piccollage/model/gson/WebPromotionData.getClassLoader());
        mDownloadedDate = (Date)parcel.readSerializable();
    }

    CBCollagesResponse(WebPhotosData webphotosdata, WebPromotionData webpromotiondata)
    {
        mDownloadedDate = null;
        mPromotion = webpromotiondata;
        mCollages = webphotosdata;
    }

    public static CBCollagesResponse newInstance(WebPhoto webphoto)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(webphoto);
        return new CBCollagesResponse(new WebPhotosData("", arraylist), null);
    }

    public void addMoreCollage(CBCollagesResponse cbcollagesresponse)
    {
        mCollages.addMoreCollage(cbcollagesresponse);
        setDownloadedDate(new Date());
    }

    public void deleteById(String s)
    {
        int i = 0;
_L3:
        if (i >= mCollages.getPhotos().size())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (!((WebPhoto)mCollages.getPhotos().get(i)).getId().equals(s)) goto _L2; else goto _L1
_L1:
        if (i != -1)
        {
            mCollages.deletePhoto(i);
        }
        return;
_L2:
        i++;
          goto _L3
        i = -1;
          goto _L1
    }

    public void deletePhoto(int i)
    {
        mCollages.deletePhoto(i);
    }

    public int describeContents()
    {
        return 0;
    }

    public WebPhotosData getCollages()
    {
        return mCollages;
    }

    public Date getDownloadedDate()
    {
        return mDownloadedDate;
    }

    public String getListRevision()
    {
        return mCollages.getListRevision();
    }

    public String getNextPageUrl()
    {
        return mCollages.getNextPageUrl();
    }

    public int getOffset()
    {
        return mCollages.getOffset();
    }

    public List getPhotos()
    {
        return mCollages.getPhotos();
    }

    public WebPromotionData getPromotion()
    {
        return mPromotion;
    }

    public int getTotal()
    {
        return mCollages.getTotal();
    }

    public void setCollages(WebPhotosData webphotosdata)
    {
        mCollages = webphotosdata;
    }

    public void setDownloadedDate(Date date)
    {
        mDownloadedDate = date;
    }

    public void setPromotion(WebPromotionData webpromotiondata)
    {
        mPromotion = webpromotiondata;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(getCollages(), i);
        parcel.writeParcelable(getPromotion(), i);
        parcel.writeSerializable(mDownloadedDate);
    }

}
