// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.b.a.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            a, p, am

public final class z
    implements SafeParcelable
{

    public static final com.google.android.gms.internal.a a = new com.google.android.gms.internal.a();
    public final int b;
    public final long c;
    public final Bundle d;
    public final int e;
    public final List f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final String j;
    public final am k;
    public final Location l;
    public final String m;

    z(int i1, long l1, Bundle bundle, int j1, List list, boolean flag, 
            int k1, boolean flag1, String s, am am1, Location location, String s1)
    {
        b = i1;
        c = l1;
        d = bundle;
        e = j1;
        f = list;
        g = flag;
        h = k1;
        i = flag1;
        j = s;
        k = am1;
        l = location;
        m = s1;
    }

    public z(Context context, p p1)
    {
        Object obj1 = null;
        super();
        b = 3;
        Object obj = p1.a();
        long l1;
        if (obj != null)
        {
            l1 = ((Date) (obj)).getTime();
        } else
        {
            l1 = -1L;
        }
        c = l1;
        m = p1.b();
        e = p1.c();
        obj = p1.d();
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        f = ((List) (obj));
        g = p1.a(context);
        h = p1.j();
        l = p1.e();
        context = (a)p1.a(com/google/android/gms/ads/b/a/a);
        if (context != null)
        {
            context = context.a();
        } else
        {
            context = null;
        }
        d = context;
        i = p1.f();
        j = p1.g();
        p1 = p1.h();
        context = obj1;
        if (p1 != null)
        {
            context = new am(p1);
        }
        k = context;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.internal.a.a(this, parcel, i1);
    }

}
