// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media:
//            MediaMetadataCompat

static final class 
    implements android.os.adataCompat._cls1
{

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return new MediaMetadataCompat(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new MediaMetadataCompat[i];
    }

    ()
    {
    }
}
