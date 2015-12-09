// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalblue.android.piccollage.a.e;
import com.google.b.i;
import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.o;
import com.google.b.p;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            WebPromotionData, CBYoutubeData

public class CBYoutubeSearchResponse
    implements Parcelable
{
    public static class CBYoutubeSearchResponseDeserializer
        implements k
    {

        private static final String KEY_DATA = "data";
        private static final String KEY_NEXT_PAGE = "next_page";
        private static final String KEY_OFFSET = "offset";
        private static final String KEY_TOTAL = "total";
        private static final String PC_API_PROMOTION_NODE = "promotion";
        private static final String PC_API_SEARCH_NODE = "search";
        private static final String PC_API_VIDEO_NODE = "videos";

        public CBYoutubeSearchResponse deserialize(l l1, Type type, j j1)
            throws p
        {
            Object obj = null;
            CBYoutubeSearchResponse cbyoutubesearchresponse = new CBYoutubeSearchResponse();
            o o1 = l1.m();
            if (o1.b("promotion"))
            {
                type = (WebPromotionData)j1.a(o1.c("promotion"), com/cardinalblue/android/piccollage/model/gson/WebPromotionData);
            } else
            {
                type = null;
            }
            if (o1.b("search"))
            {
                l1 = o1.e("search");
            } else
            {
                l1 = obj;
                if (o1.b("videos"))
                {
                    l1 = o1.e("videos");
                }
            }
            if (l1 != null)
            {
                cbyoutubesearchresponse.mPromotion = type;
                cbyoutubesearchresponse.mOffset = e.a(l1, "offset", 0);
                cbyoutubesearchresponse.mTotal = e.a(l1, "total", 0);
                cbyoutubesearchresponse.mNextPageUrl = e.a(l1, "next_page", "");
                if (l1.b("data"))
                {
                    type = l1.d("data");
                    l1 = new LinkedList();
                    for (type = type.iterator(); type.hasNext(); l1.add((CBYoutubeData)j1.a((l)type.next(), com/cardinalblue/android/piccollage/model/gson/CBYoutubeData))) { }
                    cbyoutubesearchresponse.mVideos = l1;
                }
            }
            return cbyoutubesearchresponse;
        }

        public volatile Object deserialize(l l1, Type type, j j1)
            throws p
        {
            return deserialize(l1, type, j1);
        }

        public CBYoutubeSearchResponseDeserializer()
        {
        }
    }


    private static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public CBYoutubeSearchResponse createFromParcel(Parcel parcel)
        {
            return new CBYoutubeSearchResponse(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public CBYoutubeSearchResponse[] newArray(int i)
        {
            return new CBYoutubeSearchResponse[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String mNextPageUrl;
    private int mOffset;
    private WebPromotionData mPromotion;
    private int mTotal;
    private List mVideos;

    public CBYoutubeSearchResponse()
    {
        mVideos = new LinkedList();
        mVideos = null;
        mPromotion = null;
    }

    CBYoutubeSearchResponse(Parcel parcel)
    {
        mVideos = new LinkedList();
        readFromParcel(parcel);
    }

    private void readFromParcel(Parcel parcel)
    {
        mPromotion = (WebPromotionData)parcel.readParcelable(com/cardinalblue/android/piccollage/model/gson/WebPromotionData.getClassLoader());
        mOffset = parcel.readInt();
        mTotal = parcel.readInt();
        mNextPageUrl = parcel.readString();
        parcel.readTypedList(mVideos, CBYoutubeData.CREATOR);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getNextPageUrl()
    {
        return mNextPageUrl;
    }

    public int getOffset()
    {
        return mOffset;
    }

    public int getTotal()
    {
        return mTotal;
    }

    public List getVideos()
    {
        return mVideos;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(mPromotion, i);
        parcel.writeInt(mOffset);
        parcel.writeInt(mTotal);
        parcel.writeString(mNextPageUrl);
        parcel.writeTypedList(mVideos);
    }



/*
    static WebPromotionData access$002(CBYoutubeSearchResponse cbyoutubesearchresponse, WebPromotionData webpromotiondata)
    {
        cbyoutubesearchresponse.mPromotion = webpromotiondata;
        return webpromotiondata;
    }

*/


/*
    static int access$102(CBYoutubeSearchResponse cbyoutubesearchresponse, int i)
    {
        cbyoutubesearchresponse.mOffset = i;
        return i;
    }

*/


/*
    static int access$202(CBYoutubeSearchResponse cbyoutubesearchresponse, int i)
    {
        cbyoutubesearchresponse.mTotal = i;
        return i;
    }

*/


/*
    static String access$302(CBYoutubeSearchResponse cbyoutubesearchresponse, String s)
    {
        cbyoutubesearchresponse.mNextPageUrl = s;
        return s;
    }

*/


/*
    static List access$402(CBYoutubeSearchResponse cbyoutubesearchresponse, List list)
    {
        cbyoutubesearchresponse.mVideos = list;
        return list;
    }

*/
}
