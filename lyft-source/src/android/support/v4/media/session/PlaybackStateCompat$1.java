// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media.session:
//            PlaybackStateCompat

final class 
    implements android.os.PlaybackStateCompat._cls1
{

    public PlaybackStateCompat a(Parcel parcel)
    {
        return new PlaybackStateCompat(parcel, null);
    }

    public PlaybackStateCompat[] a(int i)
    {
        return new PlaybackStateCompat[i];
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
