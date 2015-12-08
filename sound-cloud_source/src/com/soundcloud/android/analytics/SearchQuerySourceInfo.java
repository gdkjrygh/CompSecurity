// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.objects.MoreObjects;
import java.util.ArrayList;
import java.util.List;

public class SearchQuerySourceInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private int clickPosition;
    private Urn clickUrn;
    private List queryResults;
    private final Urn queryUrn;

    public SearchQuerySourceInfo(Parcel parcel)
    {
        clickPosition = -1;
        clickUrn = Urn.NOT_SET;
        queryUrn = (Urn)parcel.readParcelable(com/soundcloud/android/analytics/SearchQuerySourceInfo.getClassLoader());
        clickPosition = parcel.readInt();
        clickUrn = (Urn)parcel.readParcelable(com/soundcloud/android/analytics/SearchQuerySourceInfo.getClassLoader());
        queryResults = parcel.readArrayList(getClass().getClassLoader());
    }

    public SearchQuerySourceInfo(Urn urn)
    {
        clickPosition = -1;
        clickUrn = Urn.NOT_SET;
        queryUrn = urn;
    }

    public SearchQuerySourceInfo(Urn urn, int i, Urn urn1)
    {
        clickPosition = -1;
        clickUrn = Urn.NOT_SET;
        queryUrn = urn;
        clickPosition = i;
        clickUrn = urn1;
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
            obj = (SearchQuerySourceInfo)obj;
            if (!MoreObjects.equal(((SearchQuerySourceInfo) (obj)).queryUrn, queryUrn) || !MoreObjects.equal(Integer.valueOf(((SearchQuerySourceInfo) (obj)).clickPosition), Integer.valueOf(clickPosition)) || !MoreObjects.equal(((SearchQuerySourceInfo) (obj)).clickUrn, clickUrn) || !MoreObjects.equal(((SearchQuerySourceInfo) (obj)).queryResults, queryResults))
            {
                return false;
            }
        }
        return true;
    }

    public int getClickPosition()
    {
        return clickPosition;
    }

    public Urn getClickUrn()
    {
        return clickUrn;
    }

    List getQueryResults()
    {
        return queryResults;
    }

    public Urn getQueryUrn()
    {
        return queryUrn;
    }

    public int getUpdatedResultPosition(Urn urn)
    {
        if (clickUrn.isTrack() && queryResults != null)
        {
            return queryResults.indexOf(urn);
        } else
        {
            return clickPosition;
        }
    }

    public int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            queryUrn, Integer.valueOf(clickPosition), clickUrn, queryResults
        });
    }

    public void setQueryResults(List list)
    {
        queryResults = new ArrayList(list);
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(com/soundcloud/android/analytics/SearchQuerySourceInfo).add("queryUrn", queryUrn).add("clickPosition", clickPosition).add("clickUrn", clickUrn).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(queryUrn, 0);
        parcel.writeInt(clickPosition);
        parcel.writeParcelable(clickUrn, 0);
        parcel.writeList(queryResults);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final SearchQuerySourceInfo createFromParcel(Parcel parcel)
        {
            return new SearchQuerySourceInfo(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final SearchQuerySourceInfo[] newArray(int i)
        {
            return new SearchQuerySourceInfo[i];
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
