// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            p

public final class LocationSettingsRequest
    implements SafeParcelable
{
    public static final class a
    {

        public final ArrayList a = new ArrayList();
        public boolean b;
        public boolean c;
        public boolean d;

        public a()
        {
            b = false;
            c = false;
            d = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new p();
    final int a;
    final List b;
    final boolean c;
    final boolean d;
    final boolean e;

    LocationSettingsRequest(int i, List list, boolean flag, boolean flag1, boolean flag2)
    {
        a = i;
        b = list;
        c = flag;
        d = flag1;
        e = flag2;
    }

    private LocationSettingsRequest(List list, boolean flag, boolean flag1, boolean flag2)
    {
        this(2, list, flag, flag1, flag2);
    }

    public LocationSettingsRequest(List list, boolean flag, boolean flag1, boolean flag2, byte byte0)
    {
        this(list, flag, flag1, flag2);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel);
    }

}
