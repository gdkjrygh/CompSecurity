// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import android.os.Parcel;

// Referenced classes of package com.spotify.mobile.android.service:
//            ConnectDevice

final class 
    implements android.os.or
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new ConnectDevice(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ConnectDevice[i];
    }

    ()
    {
    }
}
