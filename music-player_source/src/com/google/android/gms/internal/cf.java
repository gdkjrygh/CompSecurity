// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            da

public final class cf
    implements SafeParcelable
{

    public static final da a = new da();
    public final int b;
    public final String c;
    public final String d;
    public final List e;
    public final int f;
    public final List g;
    public final long h;
    public final boolean i;
    public final long j;
    public final List k;
    public final long l;
    public final int m;
    public final String n;
    public final long o;

    public cf(int i1)
    {
        this(3, null, null, null, i1, null, -1L, false, -1L, null, -1L, -1, null, -1L);
    }

    cf(int i1, String s, String s1, List list, int j1, List list1, long l1, boolean flag, long l2, List list2, long l3, 
            int k1, String s2, long l4)
    {
        b = i1;
        c = s;
        d = s1;
        if (list != null)
        {
            s = Collections.unmodifiableList(list);
        } else
        {
            s = null;
        }
        e = s;
        f = j1;
        if (list1 != null)
        {
            s = Collections.unmodifiableList(list1);
        } else
        {
            s = null;
        }
        g = s;
        h = l1;
        i = flag;
        j = l2;
        if (list2 != null)
        {
            s = Collections.unmodifiableList(list2);
        } else
        {
            s = null;
        }
        k = s;
        l = l3;
        m = k1;
        n = s2;
        o = l4;
    }

    public cf(String s, String s1, List list, List list1, long l1, boolean flag, 
            List list2, long l2, int i1, String s2, long l3)
    {
        this(3, s, s1, list, -2, list1, l1, flag, -1L, list2, l2, i1, s2, l3);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        da.a(this, parcel);
    }

}
