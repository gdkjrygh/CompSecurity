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
//            aj, aw

public final class ai
    implements SafeParcelable
{

    public static final aj CREATOR = new aj();
    public final Bundle extras;
    public final long lS;
    public final int lT;
    public final List lU;
    public final boolean lV;
    public final int lW;
    public final boolean lX;
    public final String lY;
    public final aw lZ;
    public final Location ma;
    public final String mb;
    public final Bundle mc;
    public final int versionCode;

    public ai(int i, long l, Bundle bundle, int j, List list, boolean flag, 
            int k, boolean flag1, String s, aw aw, Location location, String s1, Bundle bundle1)
    {
        versionCode = i;
        lS = l;
        extras = bundle;
        lT = j;
        lU = list;
        lV = flag;
        lW = k;
        lX = flag1;
        lY = s;
        lZ = aw;
        ma = location;
        mb = s1;
        mc = bundle1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aj.a(this, parcel, i);
    }

}
