// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.provider;

import android.os.Parcel;

// Referenced classes of package com.spotify.mobile.android.provider:
//            PaymentState

final class 
    implements android.os.tor
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new PaymentState(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PaymentState[i];
    }

    ()
    {
    }
}
