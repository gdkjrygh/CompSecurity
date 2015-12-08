// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;

import android.os.Parcel;
import com.netflix.mediaclient.servicemgr.GenreList;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.webclient.model.leafs:
//            TrackableListSummary

public class ListOfGenreSummary extends TrackableListSummary
    implements GenreList
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ListOfGenreSummary createFromParcel(Parcel parcel)
        {
            return new ListOfGenreSummary(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ListOfGenreSummary[] newArray(int i)
        {
            return new ListOfGenreSummary[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private LoMoType enumType;
    private String genreExperience;
    private String genreId;
    private String genreName;
    private boolean isKidsGenre;

    public ListOfGenreSummary(int i, int j, int k, String s, String s1, String s2, boolean flag, 
            String s3)
    {
        super(i, j, k, s);
        genreName = s1;
        genreId = s2;
        isKidsGenre = flag;
        genreExperience = s3;
    }

    public ListOfGenreSummary(Parcel parcel)
    {
        super(parcel);
        genreName = parcel.readString();
        genreId = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isKidsGenre = flag;
        genreExperience = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return genreId;
    }

    public int getNumVideos()
    {
        return getLength();
    }

    public String getTitle()
    {
        return StringUtils.decodeHtmlEntities(genreName);
    }

    public LoMoType getType()
    {
        if (enumType == null)
        {
            enumType = LoMoType.create(genreExperience);
        }
        return enumType;
    }

    public boolean isKidsGenre()
    {
        return isKidsGenre;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ListOfGenreSummary [genreName=").append(genreName).append(", genreId=").append(genreId).append(", isKidsGenre=").append(isKidsGenre).append(", genreExperience=").append(genreExperience).append(", enumType=").append(enumType).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(genreName);
        parcel.writeString(genreId);
        if (isKidsGenre)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        parcel.writeString(genreExperience);
    }

}
