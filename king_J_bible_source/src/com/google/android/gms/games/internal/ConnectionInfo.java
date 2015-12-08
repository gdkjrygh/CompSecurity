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
    private final String Is;
    private final int It;
    private final int xH;

    public ConnectionInfo(int i, String s, int j)
    {
        xH = i;
        Is = s;
        It = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public String gi()
    {
        return Is;
    }

    public int gj()
    {
        return It;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ConnectionInfoCreator.a(this, parcel, i);
    }

}
