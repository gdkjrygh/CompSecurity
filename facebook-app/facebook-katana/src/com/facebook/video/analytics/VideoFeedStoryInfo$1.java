// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import android.os.Parcel;

// Referenced classes of package com.facebook.video.analytics:
//            VideoFeedStoryInfo

final class 
    implements android.os.eoFeedStoryInfo._cls1
{

    private static VideoFeedStoryInfo a(Parcel parcel)
    {
        return new VideoFeedStoryInfo(parcel, (byte)0);
    }

    private static VideoFeedStoryInfo[] a(int i)
    {
        return new VideoFeedStoryInfo[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
