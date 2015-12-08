// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            q

public final class LocationSettingsStates
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new q();
    private final int a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    LocationSettingsStates(int i, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5, 
            boolean flag6)
    {
        a = i;
        b = flag;
        c = flag1;
        d = flag2;
        e = flag3;
        f = flag4;
        g = flag5;
        h = flag6;
    }

    public final int a()
    {
        return a;
    }

    public final boolean b()
    {
        return b;
    }

    public final boolean c()
    {
        return e;
    }

    public final boolean d()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return f;
    }

    public final boolean f()
    {
        return d;
    }

    public final boolean g()
    {
        return g;
    }

    public final boolean h()
    {
        return h;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        q.a(this, parcel);
    }

}
