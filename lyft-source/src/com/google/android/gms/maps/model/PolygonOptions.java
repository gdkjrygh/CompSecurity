// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzg

public final class PolygonOptions
    implements SafeParcelable
{

    public static final zzg CREATOR = new zzg();
    private final int a;
    private final List b;
    private final List c;
    private float d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private boolean i;

    public PolygonOptions()
    {
        d = 10F;
        e = 0xff000000;
        f = 0;
        g = 0.0F;
        h = true;
        i = false;
        a = 1;
        b = new ArrayList();
        c = new ArrayList();
    }

    PolygonOptions(int j, List list, List list1, float f1, int k, int l, float f2, 
            boolean flag, boolean flag1)
    {
        d = 10F;
        e = 0xff000000;
        f = 0;
        g = 0.0F;
        h = true;
        i = false;
        a = j;
        b = list;
        c = list1;
        d = f1;
        e = k;
        f = l;
        g = f2;
        h = flag;
        i = flag1;
    }

    int a()
    {
        return a;
    }

    List b()
    {
        return c;
    }

    public List c()
    {
        return b;
    }

    public float d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return e;
    }

    public int f()
    {
        return f;
    }

    public float g()
    {
        return g;
    }

    public boolean h()
    {
        return h;
    }

    public boolean i()
    {
        return i;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        zzg.a(this, parcel, j);
    }

}
