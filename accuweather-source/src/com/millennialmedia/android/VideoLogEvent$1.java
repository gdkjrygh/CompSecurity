// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.os.Parcel;

// Referenced classes of package com.millennialmedia.android:
//            VideoLogEvent

static final class 
    implements android.os.or
{

    public VideoLogEvent createFromParcel(Parcel parcel)
    {
        return new VideoLogEvent(parcel);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public VideoLogEvent[] newArray(int i)
    {
        return new VideoLogEvent[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
