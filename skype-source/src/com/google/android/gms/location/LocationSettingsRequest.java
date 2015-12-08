// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            o, LocationRequest

public final class LocationSettingsRequest
    implements SafeParcelable
{
    public static final class a
    {

        private final ArrayList a = new ArrayList();
        private boolean b;
        private boolean c;
        private boolean d;

        public final a a()
        {
            b = true;
            return this;
        }

        public final a a(LocationRequest locationrequest)
        {
            a.add(locationrequest);
            return this;
        }

        public final LocationSettingsRequest b()
        {
            return new LocationSettingsRequest(a, b, c, d, (byte)0);
        }

        public a()
        {
            b = false;
            c = false;
            d = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new o();
    private final int a;
    private final List b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

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

    LocationSettingsRequest(List list, boolean flag, boolean flag1, boolean flag2, byte byte0)
    {
        this(list, flag, flag1, flag2);
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

    public final int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return e;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel);
    }

}
