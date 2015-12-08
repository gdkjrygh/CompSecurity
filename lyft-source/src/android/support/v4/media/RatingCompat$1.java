// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media:
//            RatingCompat

final class 
    implements android.os.tor
{

    public RatingCompat a(Parcel parcel)
    {
        return new RatingCompat(parcel.readInt(), parcel.readFloat(), null);
    }

    public RatingCompat[] a(int i)
    {
        return new RatingCompat[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
