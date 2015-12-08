// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public final class RatingCompat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new RatingCompat(parcel.readInt(), parcel.readFloat(), (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new RatingCompat[i];
        }

    };
    public final int a;
    public final float b;
    public Object c;

    private RatingCompat(int i, float f)
    {
        a = i;
        b = f;
    }

    RatingCompat(int i, float f, byte byte0)
    {
        this(i, f);
    }

    public static RatingCompat a(Object obj)
    {
        float f;
        RatingCompat ratingcompat;
        int i;
        f = 1.0F;
        ratingcompat = null;
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        }
        i = ((Rating)obj).getRatingStyle();
        if (!((Rating)obj).isRated()) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 1 6: default 76
    //                   1 78
    //                   2 112
    //                   3 140
    //                   4 140
    //                   5 140
    //                   6 263;
           goto _L3 _L4 _L5 _L6 _L6 _L6 _L7
_L3:
        return null;
_L4:
        if (((Rating)obj).hasHeart())
        {
            f = 1.0F;
        } else
        {
            f = 0.0F;
        }
        ratingcompat = new RatingCompat(1, f);
_L13:
        ratingcompat.c = obj;
        return ratingcompat;
_L5:
        if (!((Rating)obj).isThumbUp())
        {
            f = 0.0F;
        }
        ratingcompat = new RatingCompat(2, f);
        continue; /* Loop/switch isn't completed */
_L6:
        float f2 = ((Rating)obj).getStarRating();
        i;
        JVM INSTR tableswitch 3 5: default 176
    //                   3 209
    //                   4 237
    //                   5 243;
           goto _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_243;
_L8:
        Log.e("Rating", (new StringBuilder("Invalid rating style (")).append(i).append(") for a star rating").toString());
        ratingcompat = null;
        continue; /* Loop/switch isn't completed */
_L9:
        f = 3F;
_L12:
        if (f2 < 0.0F || f2 > f)
        {
            Log.e("Rating", "Trying to set out of range star-based rating");
            ratingcompat = null;
        } else
        {
            ratingcompat = new RatingCompat(i, f2);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        f = 4F;
          goto _L12
        f = 5F;
          goto _L12
_L7:
        float f1 = ((Rating)obj).getPercentRating();
        if (f1 < 0.0F || f1 > 100F)
        {
            Log.e("Rating", "Invalid percentage-based rating value");
        } else
        {
            ratingcompat = new RatingCompat(6, f1);
        }
        if (true) goto _L13; else goto _L2
_L2:
        switch (i)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            ratingcompat = new RatingCompat(i, -1F);
            break;
        }
        if (true) goto _L13; else goto _L14
_L14:
    }

    public final boolean a()
    {
        return b >= 0.0F;
    }

    public final int describeContents()
    {
        return a;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("Rating:style=")).append(a).append(" rating=");
        String s;
        if (b < 0.0F)
        {
            s = "unrated";
        } else
        {
            s = String.valueOf(b);
        }
        return stringbuilder.append(s).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeFloat(b);
    }

}
