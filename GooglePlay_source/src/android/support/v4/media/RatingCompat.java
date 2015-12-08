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

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return new RatingCompat(parcel.readInt(), parcel.readFloat(), (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new RatingCompat[i];
        }

    };
    private final int mRatingStyle;
    private final float mRatingValue;

    private RatingCompat(int i, float f)
    {
        mRatingStyle = i;
        mRatingValue = f;
    }

    RatingCompat(int i, float f, byte byte0)
    {
        this(i, f);
    }

    public final int describeContents()
    {
        return mRatingStyle;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("Rating:style=")).append(mRatingStyle).append(" rating=");
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

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mRatingStyle);
        parcel.writeFloat(mRatingValue);
    }

}
