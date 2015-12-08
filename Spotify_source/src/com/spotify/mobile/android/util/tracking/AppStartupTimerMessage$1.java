// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util.tracking;

import android.os.Parcel;

// Referenced classes of package com.spotify.mobile.android.util.tracking:
//            AppStartupTimerMessage

final class 
    implements android.os.king.AppStartupTimerMessage._cls1
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new AppStartupTimerMessage(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AppStartupTimerMessage[i];
    }

    ()
    {
    }
}
