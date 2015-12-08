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
    public final long od;
    public final int oe;
    public final List of;
    public final boolean og;
    public final int oh;
    public final boolean oi;
    public final String oj;
    public final bj ok;
    public final Location ol;
    public final String om;
    public final Bundle on;
    public final int versionCode;

    public av(int i, long l, Bundle bundle, int j, List list, boolean flag, 
            int k, boolean flag1, String s, bj bj, Location location, String s1, Bundle bundle1)
    {
        versionCode = i;
        od = l;
        extras = bundle;
        oe = j;
        of = list;
        og = flag;
        oh = k;
        oi = flag1;
        oj = s;
        ok = bj;
        ol = location;
        om = s1;
        on = bundle1;
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
