// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.a.b;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            j

public final class PolylineOptions
    implements SafeParcelable
{

    public static final j a = new j();
    private final int b;
    private final List c;
    private float d;
    private int e;
    private float f;
    private boolean g;
    private boolean h;

    public PolylineOptions()
    {
        d = 10F;
        e = 0xff000000;
        f = 0.0F;
        g = true;
        h = false;
        b = 1;
        c = new ArrayList();
    }

    PolylineOptions(int i, List list, float f1, int k, float f2, boolean flag, boolean flag1)
    {
        d = 10F;
        e = 0xff000000;
        f = 0.0F;
        g = true;
        h = false;
        b = i;
        c = list;
        d = f1;
        e = k;
        f = f2;
        g = flag;
        h = flag1;
    }

    final int a()
    {
        return b;
    }

    public final List b()
    {
        return c;
    }

    public final float c()
    {
        return d;
    }

    public final int d()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final float e()
    {
        return f;
    }

    public final boolean f()
    {
        return g;
    }

    public final boolean g()
    {
        return h;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, b);
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 2, c, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, d);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, e);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, f);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, g);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, h);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
            return;
        } else
        {
            j.a(this, parcel);
            return;
        }
    }

}
