// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media:
//            RatingCompat

static final class 
    implements android.os.tor
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new RatingCompat(parcel.readInt(), parcel.readFloat(), (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new RatingCompat[i];
    }

    ()
    {
    }
}
