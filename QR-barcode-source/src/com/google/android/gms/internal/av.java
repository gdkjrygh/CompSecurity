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
//            aw, bj

public final class av
    implements SafeParcelable
{

    public static final aw CREATOR = new aw();
    public final Bundle extras;
    public final long nT;
    public final int nU;
    public final List nV;
    public final boolean nW;
    public final int nX;
    public final boolean nY;
    public final String nZ;
    public final bj oa;
    public final Location ob;
    public final String oc;
    public final Bundle od;
    public final int versionCode;

    public av(int i, long l, Bundle bundle, int j, List list, boolean flag, 
            int k, boolean flag1, String s, bj bj, Location location, String s1, Bundle bundle1)
    {
        versionCode = i;
        nT = l;
        extras = bundle;
        nU = j;
        nV = list;
        nW = flag;
        nX = k;
        nY = flag1;
        nZ = s;
        oa = bj;
        ob = location;
        oc = s1;
        od = bundle1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aw.a(this, parcel, i);
    }

}
