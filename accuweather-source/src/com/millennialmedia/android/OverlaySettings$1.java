// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.os.Parcel;

// Referenced classes of package com.millennialmedia.android:
//            OverlaySettings

static final class 
    implements android.os.
{

    public OverlaySettings createFromParcel(Parcel parcel)
    {
        return new OverlaySettings(parcel);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public OverlaySettings[] newArray(int i)
    {
        return new OverlaySettings[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
