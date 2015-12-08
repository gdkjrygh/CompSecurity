// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public final class fz
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ga();
    private final int a;
    private final float b;

    fz(int i, float f)
    {
        a = i;
        b = f;
    }

    public static fz a(Object obj)
    {
        float f;
        int i;
        f = 1.0F;
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        }
        i = ((Rating)obj).getRatingStyle();
        if (!((Rating)obj).isRated()) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 1 6: default 72
    //                   1 74
    //                   2 101
    //                   3 126
    //                   4 126
    //                   5 126
    //                   6 244;
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
        return new fz(1, f);
_L5:
        if (!((Rating)obj).isThumbUp())
        {
            f = 0.0F;
        }
        return new fz(2, f);
_L6:
        float f2 = ((Rating)obj).getStarRating();
        i;
        JVM INSTR tableswitch 3 5: default 160
    //                   3 191
    //                   4 219
    //                   5 225;
           goto _L8 _L9 _L10 _L11
_L8:
        Log.e("Rating", (new StringBuilder("Invalid rating style (")).append(i).append(") for a star rating").toString());
        obj = null;
_L12:
        return ((fz) (obj));
_L9:
        f = 3F;
_L13:
        if (f2 < 0.0F || f2 > f)
        {
            Log.e("Rating", "Trying to set out of range star-based rating");
            obj = null;
        } else
        {
            obj = new fz(i, f2);
        }
        if (true) goto _L12; else goto _L10
_L10:
        f = 4F;
          goto _L13
_L11:
        f = 5F;
          goto _L13
_L7:
        float f1 = ((Rating)obj).getPercentRating();
        if (f1 < 0.0F || f1 > 100F)
        {
            Log.e("Rating", "Invalid percentage-based rating value");
            return null;
        } else
        {
            return new fz(6, f1);
        }
_L2:
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
            return new fz(i, -1F);
        }
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
