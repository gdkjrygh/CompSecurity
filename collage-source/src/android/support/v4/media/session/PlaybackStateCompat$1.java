// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media.session:
//            PlaybackStateCompat

static final class 
    implements android.os.PlaybackStateCompat._cls1
{

    public PlaybackStateCompat createFromParcel(Parcel parcel)
    {
        return new PlaybackStateCompat(parcel, null);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public PlaybackStateCompat[] newArray(int i)
    {
        return new PlaybackStateCompat[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
