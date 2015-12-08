// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.games.internal:
//            ConnectionInfoCreator

public class ConnectionInfo
    implements SafeParcelable
{

    public static final ConnectionInfoCreator CREATOR = new ConnectionInfoCreator();
    public final String mClientAddress;
    public final int mRegistrationLatency;
    final int mVersionCode;

    public ConnectionInfo(int i, String s, int j)
    {
        mVersionCode = i;
        mClientAddress = s;
        mRegistrationLatency = j;
    }

    public ConnectionInfo(String s, int i)
    {
        this(1, s, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ConnectionInfoCreator.writeToParcel$139b888c(this, parcel);
    }

}
