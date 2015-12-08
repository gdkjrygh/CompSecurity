// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public RatingCompat createFromParcel(Parcel parcel)
        {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public RatingCompat[] newArray(int i)
        {
            return new RatingCompat[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final int mRatingStyle;
    private final float mRatingValue;

    private RatingCompat(int i, float f)
    {
        mRatingStyle = i;
        mRatingValue = f;
    }


    public int describeContents()
    {
        return mRatingStyle;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Rating:style=").append(mRatingStyle).append(" rating=");
        String s;
        if (mRatingValue < 0.0F)
        {
            s = "unrated";
        } else
        {
            s = String.valueOf(mRatingValue);
        }
        return stringbuilder.append(s).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mRatingStyle);
        parcel.writeFloat(mRatingValue);
    }

}
