// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            j

public final class PolygonOptions
    implements SafeParcelable
{

    public static final j CREATOR = new j();
    final int a;
    final List b;
    final List c;
    float d;
    int e;
    int f;
    float g;
    boolean h;
    boolean i;

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

    PolygonOptions(int k, List list, List list1, float f1, int l, int i1, float f2, 
            boolean flag, boolean flag1)
    {
        d = 10F;
        e = 0xff000000;
        f = 0;
        g = 0.0F;
        h = true;
        i = false;
        a = k;
        b = list;
        c = list1;
        d = f1;
        e = l;
        f = i1;
        g = f2;
        h = flag;
        i = flag1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        j.a(this, parcel);
    }

}
