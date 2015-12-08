// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.JacksonModel;
import cua;
import cuv;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.eventshub.model:
//            ConcertResult, SourceType

public class ConcertResults
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ConcertResults(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ConcertResults[i];
        }

    };
    private ConcertResult mConcertResults[];
    private String mHeaderImageUri;
    private String mLocation;

    public ConcertResults(Parcel parcel)
    {
        mConcertResults = (ConcertResult[])parcel.createTypedArray(ConcertResult.CREATOR);
        mHeaderImageUri = parcel.readString();
        mLocation = parcel.readString();
    }

    public ConcertResults(ConcertResult aconcertresult[], String s, String s1)
    {
        ConcertResult aconcertresult1[] = aconcertresult;
        if (aconcertresult == null)
        {
            aconcertresult1 = new ConcertResult[0];
        }
        mConcertResults = aconcertresult1;
        mHeaderImageUri = s;
        mLocation = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (ConcertResults)obj;
        if (!Arrays.equals(mConcertResults, ((ConcertResults) (obj)).mConcertResults))
        {
            return false;
        }
        if (mLocation == null ? ((ConcertResults) (obj)).mLocation != null : !mLocation.equals(((ConcertResults) (obj)).mLocation))
        {
            return false;
        }
        if (mHeaderImageUri == null) goto _L4; else goto _L3
_L3:
        if (mHeaderImageUri.equals(((ConcertResults) (obj)).mHeaderImageUri)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((ConcertResults) (obj)).mHeaderImageUri == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public ConcertResult[] getConcertResults()
    {
        return mConcertResults;
    }

    public List getConcertResultsInSource(SourceType sourcetype)
    {
        return Lists.a(cuv.b(Arrays.asList(mConcertResults), new cua(sourcetype) {

            private SourceType a;

            public final boolean a(Object obj)
            {
                obj = (ConcertResult)obj;
                return obj != null && ((ConcertResult) (obj)).getSourceType() == a;
            }

            
            {
                a = sourcetype;
                super();
            }
        }));
    }

    public String getHeaderImageUri()
    {
        return mHeaderImageUri;
    }

    public String getLocation()
    {
        return mLocation;
    }

    public boolean hasConcerts()
    {
        return mConcertResults.length != 0;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (mConcertResults != null)
        {
            i = Arrays.hashCode(mConcertResults);
        } else
        {
            i = 0;
        }
        if (mLocation != null)
        {
            j = mLocation.hashCode();
        } else
        {
            j = 0;
        }
        if (mHeaderImageUri != null)
        {
            k = mHeaderImageUri.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    public String toString()
    {
        return (new StringBuilder("ConcertResults{mConcertResults=")).append(Arrays.toString(mConcertResults)).append(", mLocation='").append(mLocation).append('\'').append(", mHeaderImageUri='").append(mHeaderImageUri).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedArray(mConcertResults, 0);
        parcel.writeString(mHeaderImageUri);
        parcel.writeString(mLocation);
    }

}
