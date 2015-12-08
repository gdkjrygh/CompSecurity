// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//            RatingCompatApi21

public final class RatingCompat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1F;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final String TAG = "Rating";
    private Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;

    private RatingCompat(int i, float f)
    {
        mRatingStyle = i;
        mRatingValue = f;
    }

    RatingCompat(int i, float f, _cls1 _pcls1)
    {
        this(i, f);
    }

    public static RatingCompat fromRating(Object obj)
    {
        int i;
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        }
        i = RatingCompatApi21.getRatingStyle(obj);
        if (!RatingCompatApi21.isRated(obj)) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 1 6: default 64
    //                   1 66
    //                   2 81
    //                   3 92
    //                   4 92
    //                   5 92
    //                   6 104;
           goto _L3 _L4 _L5 _L6 _L6 _L6 _L7
_L3:
        return null;
_L4:
        RatingCompat ratingcompat = newHeartRating(RatingCompatApi21.hasHeart(obj));
_L9:
        ratingcompat.mRatingObj = obj;
        return ratingcompat;
_L5:
        ratingcompat = newThumbRating(RatingCompatApi21.isThumbUp(obj));
        continue; /* Loop/switch isn't completed */
_L6:
        ratingcompat = newStarRating(i, RatingCompatApi21.getStarRating(obj));
        continue; /* Loop/switch isn't completed */
_L7:
        ratingcompat = newPercentageRating(RatingCompatApi21.getPercentRating(obj));
        continue; /* Loop/switch isn't completed */
_L2:
        ratingcompat = newUnratedRating(i);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static RatingCompat newHeartRating(boolean flag)
    {
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.0F;
        }
        return new RatingCompat(1, f);
    }

    public static RatingCompat newPercentageRating(float f)
    {
        if (f < 0.0F || f > 100F)
        {
            Log.e("Rating", "Invalid percentage-based rating value");
            return null;
        } else
        {
            return new RatingCompat(6, f);
        }
    }

    public static RatingCompat newStarRating(int i, float f)
    {
        i;
        JVM INSTR tableswitch 3 5: default 28
    //                   3 57
    //                   4 82
    //                   5 88;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_88;
_L1:
        Log.e("Rating", (new StringBuilder("Invalid rating style (")).append(i).append(") for a star rating").toString());
        return null;
_L2:
        float f1 = 3F;
_L5:
        if (f < 0.0F || f > f1)
        {
            Log.e("Rating", "Trying to set out of range star-based rating");
            return null;
        } else
        {
            return new RatingCompat(i, f);
        }
_L3:
        f1 = 4F;
          goto _L5
        f1 = 5F;
          goto _L5
    }

    public static RatingCompat newThumbRating(boolean flag)
    {
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.0F;
        }
        return new RatingCompat(2, f);
    }

    public static RatingCompat newUnratedRating(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return new RatingCompat(i, -1F);
        }
    }

    public final int describeContents()
    {
        return mRatingStyle;
    }

    public final float getPercentRating()
    {
        if (mRatingStyle != 6 || !isRated())
        {
            return -1F;
        } else
        {
            return mRatingValue;
        }
    }

    public final Object getRating()
    {
        if (mRatingObj != null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return mRatingObj;
        }
        if (!isRated())
        {
            break MISSING_BLOCK_LABEL_132;
        }
        mRatingStyle;
        JVM INSTR tableswitch 1 6: default 68
    //                   1 70
    //                   2 86
    //                   3 100
    //                   4 100
    //                   5 100
    //                   6 118;
           goto _L1 _L2 _L3 _L4 _L4 _L4 _L5
_L1:
        return null;
_L2:
        mRatingObj = RatingCompatApi21.newHeartRating(hasHeart());
_L6:
        return mRatingObj;
_L3:
        mRatingObj = RatingCompatApi21.newThumbRating(isThumbUp());
          goto _L6
_L4:
        mRatingObj = RatingCompatApi21.newStarRating(mRatingStyle, getStarRating());
          goto _L6
_L5:
        mRatingObj = RatingCompatApi21.newPercentageRating(getPercentRating());
          goto _L1
        mRatingObj = RatingCompatApi21.newUnratedRating(mRatingStyle);
          goto _L6
    }

    public final int getRatingStyle()
    {
        return mRatingStyle;
    }

    public final float getStarRating()
    {
        mRatingStyle;
        JVM INSTR tableswitch 3 5: default 32
    //                   3 35
    //                   4 35
    //                   5 35;
           goto _L1 _L2 _L2 _L2
_L1:
        return -1F;
_L2:
        if (isRated())
        {
            return mRatingValue;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean hasHeart()
    {
        while (mRatingStyle != 1 || mRatingValue != 1.0F) 
        {
            return false;
        }
        return true;
    }

    public final boolean isRated()
    {
        return mRatingValue >= 0.0F;
    }

    public final boolean isThumbUp()
    {
        while (mRatingStyle != 2 || mRatingValue != 1.0F) 
        {
            return false;
        }
        return true;
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


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final RatingCompat createFromParcel(Parcel parcel)
        {
            return new RatingCompat(parcel.readInt(), parcel.readFloat(), null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final RatingCompat[] newArray(int i)
        {
            return new RatingCompat[i];
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
