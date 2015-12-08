// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.model:
//            m

public final class PolygonOptions
    implements c
{

    public static final m CREATOR = new m();
    final int a;
    public final List b;
    public final List c;
    public float d;
    public int e;
    public int f;
    public float g;
    public boolean h;
    public boolean i;

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

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        m.a(this, parcel);
    }

}
