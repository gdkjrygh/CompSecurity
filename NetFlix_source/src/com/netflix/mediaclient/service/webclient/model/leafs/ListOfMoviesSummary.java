// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;

import android.os.Parcel;
import com.netflix.mediaclient.servicemgr.Genre;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.util.StringUtils;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.webclient.model.leafs:
//            TrackableListSummary, SocialEvidence

public class ListOfMoviesSummary extends TrackableListSummary
    implements LoMo, Genre
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ListOfMoviesSummary createFromParcel(Parcel parcel)
        {
            return new ListOfMoviesSummary(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ListOfMoviesSummary[] newArray(int i)
        {
            return new ListOfMoviesSummary[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String displayName;
    private LoMoType enumType;
    private String id;
    private List moreImgs;
    private SocialEvidence socialEvidence;
    private String type;

    public ListOfMoviesSummary(Parcel parcel)
    {
        super(parcel);
        id = parcel.readString();
        type = parcel.readString();
        displayName = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public List getFacebookFriends()
    {
        if (socialEvidence != null)
        {
            return socialEvidence.getFacebookFriends();
        } else
        {
            return null;
        }
    }

    public String getId()
    {
        return id;
    }

    public List getMoreImages()
    {
        return moreImgs;
    }

    public int getNumVideos()
    {
        return getLength();
    }

    public String getTitle()
    {
        return StringUtils.decodeHtmlEntities(displayName);
    }

    public LoMoType getType()
    {
        if (enumType == null)
        {
            enumType = LoMoType.create(type);
        }
        return enumType;
    }

    public boolean isBillboard()
    {
        return getType() == LoMoType.BILLBOARD;
    }

    public void setId(String s)
    {
        id = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ListOfMoviesSummary [id=").append(id).append(", type=").append(type).append(", displayName=").append(displayName).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(id);
        parcel.writeString(type);
        parcel.writeString(displayName);
    }

}
