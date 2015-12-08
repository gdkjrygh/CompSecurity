// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ak, ax

public final class aj
    implements SafeParcelable
{

    public static final ak CREATOR = new ak();
    public final Bundle extras;
    public final long lQ;
    public final int lR;
    public final List lS;
    public final boolean lT;
    public final int lU;
    public final boolean lV;
    public final String lW;
    public final ax lX;
    public final Location lY;
    public final String lZ;
    public final Bundle ma;
    public final int versionCode;

    public aj(int i, long l, Bundle bundle, int j, List list, boolean flag, 
            int k, boolean flag1, String s, ax ax, Location location, String s1, Bundle bundle1)
    {
        versionCode = i;
        lQ = l;
        extras = bundle;
        lR = j;
        lS = list;
        lT = flag;
        lU = k;
        lV = flag1;
        lW = s;
        lX = ax;
        lY = location;
        lZ = s1;
        ma = bundle1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ak.a(this, parcel, i);
    }

}
