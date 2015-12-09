// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            ad

public class LocationSettingsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ad();
    private final int a;
    private final List b;
    private final boolean c;
    private final boolean d;

    LocationSettingsRequest(int i, List list, boolean flag, boolean flag1)
    {
        a = i;
        b = list;
        c = flag;
        d = flag1;
    }

    public final int a()
    {
        return a;
    }

    public final List b()
    {
        return Collections.unmodifiableList(b);
    }

    public final boolean c()
    {
        return c;
    }

    public final boolean d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ad.a(this, parcel);
    }

}
