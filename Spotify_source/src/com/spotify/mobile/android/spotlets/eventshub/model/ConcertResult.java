// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.eventshub.model:
//            Concert, SourceType

public class ConcertResult
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ConcertResult(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ConcertResult[i];
        }

    };
    private final String mClickThruUrl;
    private final Concert mConcert;
    private final String mSource;
    private final SourceType mSourceType;

    public ConcertResult(Parcel parcel)
    {
        mConcert = (Concert)parcel.readParcelable(com/spotify/mobile/android/spotlets/eventshub/model/Concert.getClassLoader());
        mClickThruUrl = parcel.readString();
        mSource = parcel.readString();
        mSourceType = createSourceFromString(mSource);
    }

    public ConcertResult(Concert concert, String s, String s1)
    {
        Concert concert1 = concert;
        if (concert == null)
        {
            concert1 = Concert.EMPTY;
        }
        mConcert = concert1;
        mClickThruUrl = s;
        mSource = s1;
        mSourceType = createSourceFromString(mSource);
    }

    static SourceType createSourceFromString(String s)
    {
        SourceType sourcetype = SourceType.a;
        if (!TextUtils.isEmpty(s))
        {
            SourceType asourcetype[] = SourceType.values();
            int j = asourcetype.length;
            int i = 0;
            while (i < j) 
            {
                SourceType sourcetype1 = asourcetype[i];
                if (TextUtils.equals(sourcetype1.mSourceName, s))
                {
                    return sourcetype1;
                }
                i++;
            }
        }
        return sourcetype;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ConcertResult)obj;
            if (mClickThruUrl == null ? ((ConcertResult) (obj)).mClickThruUrl != null : !mClickThruUrl.equals(((ConcertResult) (obj)).mClickThruUrl))
            {
                return false;
            }
            if (!mConcert.equals(((ConcertResult) (obj)).mConcert))
            {
                return false;
            }
            if (mSource == null ? ((ConcertResult) (obj)).mSource != null : !mSource.equals(((ConcertResult) (obj)).mSource))
            {
                return false;
            }
        }
        return true;
    }

    public String getClickThruUrl()
    {
        return mClickThruUrl;
    }

    public Concert getConcert()
    {
        return mConcert;
    }

    public String getSource()
    {
        return mSource;
    }

    public SourceType getSourceType()
    {
        return mSourceType;
    }

    public int hashCode()
    {
        int j = 0;
        int k = mConcert.hashCode();
        int i;
        if (mClickThruUrl != null)
        {
            i = mClickThruUrl.hashCode();
        } else
        {
            i = 0;
        }
        if (mSource != null)
        {
            j = mSource.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }

    public String toString()
    {
        return (new StringBuilder("ConcertResult{mConcert=")).append(mConcert).append(", mClickThruUrl='").append(mClickThruUrl).append('\'').append(", mSource='").append(mSource).append('\'').append(", mSourceType=").append(mSourceType).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(mConcert, 0);
        parcel.writeString(mClickThruUrl);
        parcel.writeString(mSource);
    }

}
