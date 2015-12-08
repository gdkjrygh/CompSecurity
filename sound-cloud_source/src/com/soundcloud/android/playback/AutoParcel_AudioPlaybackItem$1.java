// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.os.Parcel;

// Referenced classes of package com.soundcloud.android.playback:
//            AutoParcel_AudioPlaybackItem

final class 
    implements android.os._AudioPlaybackItem._cls1
{

    public final AutoParcel_AudioPlaybackItem createFromParcel(Parcel parcel)
    {
        return new AutoParcel_AudioPlaybackItem(parcel, null);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final AutoParcel_AudioPlaybackItem[] newArray(int i)
    {
        return new AutoParcel_AudioPlaybackItem[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
