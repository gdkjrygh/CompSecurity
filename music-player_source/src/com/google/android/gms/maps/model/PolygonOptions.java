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
//            i

public final class PolygonOptions
    implements SafeParcelable
{

    public static final i a = new i();
    private final int b;
    private final List c;
    private final List d;
    private float e;
    private int f;
    private int g;
    private float h;
    private boolean i;
    private boolean j;

    public PolygonOptions()
    {
        e = 10F;
        f = 0xff000000;
        g = 0;
        h = 0.0F;
        i = true;
        j = false;
        b = 1;
        c = new ArrayList();
        d = new ArrayList();
    }

    PolygonOptions(int k, List list, List list1, float f1, int l, int i1, float f2, 
            boolean flag, boolean flag1)
    {
        e = 10F;
        f = 0xff000000;
        g = 0;
        h = 0.0F;
        i = true;
        j = false;
        b = k;
        c = list;
        d = list1;
        e = f1;
        f = l;
        g = i1;
        h = f2;
        i = flag;
        j = flag1;
    }

    final int a()
    {
        return b;
    }

    final List b()
    {
        return d;
    }

    public final List c()
    {
        return c;
    }

    public final float d()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int e()
    {
        return f;
    }

    public final int f()
    {
        return g;
    }

    public final float g()
    {
        return h;
    }

    public final boolean h()
    {
        return i;
    }

    public final boolean i()
    {
        return j;
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            k = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, b);
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 2, c, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, d);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, e);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, f);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, g);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, h);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, i);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, j);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, k);
            return;
        } else
        {
            com.google.android.gms.maps.model.i.a(this, parcel);
            return;
        }
    }

}
