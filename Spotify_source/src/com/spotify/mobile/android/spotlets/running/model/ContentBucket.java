// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.running.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;
import java.util.TreeMap;

public class ContentBucket
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ContentBucket(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ContentBucket[i];
        }

    };
    public final int defaultTempo;
    public final String imageUrl;
    public final Map tracklists;

    private ContentBucket(Parcel parcel)
    {
        imageUrl = parcel.readString();
        defaultTempo = parcel.readInt();
        tracklists = new TreeMap();
        parcel.readMap(tracklists, com/spotify/mobile/android/spotlets/running/model/ContentBucket.getClassLoader());
    }


    public ContentBucket(String s, int i, Map map)
    {
        imageUrl = s;
        defaultTempo = i;
        tracklists = map;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (getClass() == obj.getClass())
                {
                    obj = (ContentBucket)obj;
                    flag = flag1;
                    if (defaultTempo == ((ContentBucket) (obj)).defaultTempo)
                    {
                        flag = flag1;
                        if (imageUrl.equals(((ContentBucket) (obj)).imageUrl))
                        {
                            return tracklists.equals(((ContentBucket) (obj)).tracklists);
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (imageUrl.hashCode() * 31 + defaultTempo) * 31 + tracklists.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(imageUrl);
        parcel.writeInt(defaultTempo);
        parcel.writeMap(tracklists);
    }

}
