// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.session;

import android.os.Parcel;
import com.spotify.mobile.android.provider.PaymentState;

// Referenced classes of package com.spotify.mobile.android.service.session:
//            SessionState

final class 
    implements android.os.tor
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new SessionState(parcel.readString(), parcel.readString(), ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue(), ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue(), ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue(), ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue(), parcel.readInt(), parcel.readString(), ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue(), ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue(), ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue(), (PaymentState)parcel.readParcelable(com/spotify/mobile/android/provider/PaymentState.getClassLoader()), parcel.readString(), parcel.readString());
    }

    public final volatile Object[] newArray(int i)
    {
        return new SessionState[i];
    }

    ()
    {
    }
}
