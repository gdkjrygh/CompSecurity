// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ej

public final class zzgq
    implements SafeParcelable
{

    public static final ej CREATOR = new ej();
    public final int a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final List f;
    public final long g;
    public final boolean h;
    public final long i;
    public final List j;
    public final long k;
    public final int l;
    public final String m;
    public final long n;
    public final String o;
    public final boolean p;
    public final String q;
    public final String r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;

    zzgq(int i1, String s1, String s2, List list, int j1, List list1, long l1, boolean flag, long l2, List list2, long l3, 
            int k1, String s3, long l4, String s4, boolean flag1, String s5, 
            String s6, boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6)
    {
        a = i1;
        b = s1;
        c = s2;
        if (list != null)
        {
            s1 = Collections.unmodifiableList(list);
        } else
        {
            s1 = null;
        }
        d = s1;
        e = j1;
        if (list1 != null)
        {
            s1 = Collections.unmodifiableList(list1);
        } else
        {
            s1 = null;
        }
        f = s1;
        g = l1;
        h = flag;
        i = l2;
        if (list2 != null)
        {
            s1 = Collections.unmodifiableList(list2);
        } else
        {
            s1 = null;
        }
        j = s1;
        k = l3;
        l = k1;
        m = s3;
        n = l4;
        o = s4;
        p = flag1;
        q = s5;
        r = s6;
        s = flag2;
        t = flag3;
        u = flag4;
        v = flag5;
        w = flag6;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        ej.a(this, parcel);
    }

}
