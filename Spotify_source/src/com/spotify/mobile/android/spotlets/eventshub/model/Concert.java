// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctv;
import cua;
import cuv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.spotify.mobile.android.spotlets.eventshub.model:
//            Artist

public class Concert
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Concert(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Concert[i];
        }

    };
    private static final int DATE_STYLE_FLAGS = 0x1801a;
    public static final Concert EMPTY = new Concert(null, null, null, null, null, null);
    private Artist mArtists[];
    private Artist mArtistsWithAffinity[];
    private Artist mArtistsWithOutAffinity[];
    private Date mDate;
    private String mDateString;
    private String mId;
    private String mLocation;
    private String mTitle;
    private String mTitleArtists;
    private String mVenue;

    public Concert(Parcel parcel)
    {
        mId = parcel.readString();
        mDateString = parcel.readString();
        mTitle = parcel.readString();
        mLocation = parcel.readString();
        mVenue = parcel.readString();
        mArtists = (Artist[])parcel.createTypedArray(Artist.CREATOR);
        mDate = createConcertDate(mDateString);
        mArtistsWithAffinity = (Artist[])Lists.a(cuv.b(Arrays.asList(mArtists), new cua() {

            public final boolean a(Object obj)
            {
                obj = (Artist)obj;
                return obj != null && ((Artist) (obj)).hasAffinity();
            }

        })).toArray(new Artist[0]);
        mArtistsWithOutAffinity = (Artist[])Lists.a(cuv.b(Arrays.asList(mArtists), new cua() {

            public final boolean a(Object obj)
            {
                obj = (Artist)obj;
                return obj != null && !((Artist) (obj)).hasAffinity();
            }

        })).toArray(new Artist[0]);
    }

    public Concert(String s, String s1, String s2, String s3, String s4, Artist aartist[])
    {
        mId = s;
        mDateString = s1;
        mTitle = s2;
        mLocation = s3;
        mVenue = s4;
        s = aartist;
        if (aartist == null)
        {
            s = new Artist[0];
        }
        mArtists = s;
        mDate = createConcertDate(mDateString);
        mArtistsWithAffinity = (Artist[])Lists.a(cuv.b(Arrays.asList(mArtists), new cua() {

            public final boolean a(Object obj)
            {
                obj = (Artist)obj;
                return obj != null && ((Artist) (obj)).hasAffinity();
            }

        })).toArray(new Artist[0]);
        mArtistsWithOutAffinity = (Artist[])Lists.a(cuv.b(Arrays.asList(mArtists), new cua() {

            public final boolean a(Object obj)
            {
                obj = (Artist)obj;
                return obj != null && !((Artist) (obj)).hasAffinity();
            }

        })).toArray(new Artist[0]);
    }

    static Date createConcertDate(String s)
    {
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).setTime(new Date(0x8000000000000000L));
        obj = ((Calendar) (obj)).getTime();
        if (s == null)
        {
            return ((Date) (obj));
        }
        try
        {
            s = (new SimpleDateFormat("yyyy-MM-dd", Locale.US)).parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.getMessage();
            return ((Date) (obj));
        }
        return s;
    }

    String createTitleArtist()
    {
        Object obj = new ArrayList(Lists.a(Arrays.asList(mArtists), new ctv() {

            public final Object a(Object obj1)
            {
                obj1 = (Artist)obj1;
                if (obj1 == null)
                {
                    return "";
                }
                if (TextUtils.isEmpty(((Artist) (obj1)).getName()))
                {
                    return "";
                } else
                {
                    return ((Artist) (obj1)).getName();
                }
            }

        }));
        ((List) (obj)).removeAll(Arrays.asList(new String[] {
            "", null
        }));
        String s = TextUtils.join(", ", ((Iterable) (obj)));
        obj = s;
        if (TextUtils.isEmpty(s))
        {
            obj = mTitle;
        }
        return ((String) (obj));
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
            obj = (Concert)obj;
            if (!Arrays.equals(mArtists, ((Concert) (obj)).mArtists))
            {
                return false;
            }
            if (mDateString == null ? ((Concert) (obj)).mDateString != null : !mDateString.equals(((Concert) (obj)).mDateString))
            {
                return false;
            }
            if (mId == null ? ((Concert) (obj)).mId != null : !mId.equals(((Concert) (obj)).mId))
            {
                return false;
            }
            if (mLocation == null ? ((Concert) (obj)).mLocation != null : !mLocation.equals(((Concert) (obj)).mLocation))
            {
                return false;
            }
            if (mTitle == null ? ((Concert) (obj)).mTitle != null : !mTitle.equals(((Concert) (obj)).mTitle))
            {
                return false;
            }
            if (mVenue == null ? ((Concert) (obj)).mVenue != null : !mVenue.equals(((Concert) (obj)).mVenue))
            {
                return false;
            }
        }
        return true;
    }

    public String getArtistName()
    {
        Artist aartist[] = mArtists;
        int j = aartist.length;
        String s = "";
        int i = 0;
        String s1;
        do
        {
            s1 = s;
            if (i >= j)
            {
                break;
            }
            s = aartist[i].getName();
            s1 = s;
            if (!TextUtils.isEmpty(s))
            {
                break;
            }
            i++;
        } while (true);
        return s1;
    }

    public Artist[] getArtists()
    {
        return mArtists;
    }

    public Artist[] getArtistsWithAffinity()
    {
        return mArtistsWithAffinity;
    }

    public Artist[] getArtistsWithOutAffinity()
    {
        return mArtistsWithOutAffinity;
    }

    public Date getDate()
    {
        return mDate;
    }

    public String getId()
    {
        return mId;
    }

    public String getImageUri()
    {
        Artist aartist[] = mArtists;
        int j = aartist.length;
        String s = null;
        int i = 0;
        String s1;
        do
        {
            s1 = s;
            if (i >= j)
            {
                break;
            }
            s = aartist[i].getImageUri();
            s1 = s;
            if (!TextUtils.isEmpty(s))
            {
                break;
            }
            i++;
        } while (true);
        return s1;
    }

    public String getLocation()
    {
        return mLocation;
    }

    public String getMetadata()
    {
        StringBuilder stringbuilder = new StringBuilder(DateUtils.getRelativeTimeSpanString(getDate().getTime(), System.currentTimeMillis(), 0x5265c00L, 0x1801a).toString());
        if (!TextUtils.isEmpty(getVenue()))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(" \u2022 ");
            }
            stringbuilder.append(getVenue());
        }
        return stringbuilder.toString();
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getTitleArtist()
    {
        if (mTitleArtists == null)
        {
            mTitleArtists = createTitleArtist();
        }
        return mTitleArtists;
    }

    public String getVenue()
    {
        return mVenue;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (mId != null)
        {
            i = mId.hashCode();
        } else
        {
            i = 0;
        }
        if (mDateString != null)
        {
            j = mDateString.hashCode();
        } else
        {
            j = 0;
        }
        if (mTitle != null)
        {
            k = mTitle.hashCode();
        } else
        {
            k = 0;
        }
        if (mLocation != null)
        {
            l = mLocation.hashCode();
        } else
        {
            l = 0;
        }
        if (mVenue != null)
        {
            i1 = mVenue.hashCode();
        }
        return ((l + (k + (j + i * 31) * 31) * 31) * 31 + i1) * 31 + Arrays.hashCode(mArtists);
    }

    public String toString()
    {
        return (new StringBuilder("Concert{mId='")).append(mId).append('\'').append(", mDateString='").append(mDateString).append('\'').append(", mTitle='").append(mTitle).append('\'').append(", mLocation='").append(mLocation).append('\'').append(", mVenue='").append(mVenue).append('\'').append(", mDate=").append(mDate).append(", mArtists=").append(Arrays.toString(mArtists)).append(", mArtistsWithAffinity=").append(Arrays.toString(mArtistsWithAffinity)).append(", mArtistsWithOutAffinity=").append(Arrays.toString(mArtistsWithOutAffinity)).append(", mTitleArtists='").append(mTitleArtists).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mId);
        parcel.writeString(mDateString);
        parcel.writeString(mTitle);
        parcel.writeString(mLocation);
        parcel.writeString(mVenue);
        parcel.writeTypedArray(mArtists, 0);
    }

}
