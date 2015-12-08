// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.media:
//            d

public final class RatingCompat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    private final int a;
    private final float b;

    private RatingCompat(int i, float f)
    {
        a = i;
        b = f;
    }

    RatingCompat(int i, float f, byte byte0)
    {
        this(i, f);
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
