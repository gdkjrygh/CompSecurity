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
    private final int BR;
    private final String Wq;
    private final int Wr;

    public ConnectionInfo(int i, String s, int j)
    {
        BR = i;
        Wq = s;
        Wr = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public String jX()
    {
        return Wq;
    }

    public int jY()
    {
        return Wr;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ConnectionInfoCreator.a(this, parcel, i);
    }

}
