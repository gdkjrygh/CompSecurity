// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            dw

public final class dv
    implements SafeParcelable
{

    public static final dw CREATOR = new dw();
    public final int errorCode;
    public final List nr;
    public final List ns;
    public final long nv;
    public final int orientation;
    public final String oy;
    public final String qb;
    public final long qc;
    public final boolean qd;
    public final long qe;
    public final List qf;
    public final String qg;
    public final long qh;
    public final String qi;
    public final boolean qj;
    public final String qk;
    public final String ql;
    public final int versionCode;

    public dv(int i)
    {
        this(7, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null);
    }

    public dv(int i, long l)
    {
        this(7, null, null, null, i, null, -1L, false, -1L, null, l, -1, null, -1L, null, false, null, null);
    }

    dv(int i, String s, String s1, List list, int j, List list1, long l, boolean flag, long l1, List list2, long l2, 
            int k, String s2, long l3, String s3, boolean flag1, String s4, 
            String s5)
    {
        versionCode = i;
        oy = s;
        qb = s1;
        if (list != null)
        {
            s = Collections.unmodifiableList(list);
        } else
        {
            s = null;
        }
        nr = s;
        errorCode = j;
        if (list1 != null)
        {
            s = Collections.unmodifiableList(list1);
        } else
        {
            s = null;
        }
        ns = s;
        qc = l;
        qd = flag;
        qe = l1;
        if (list2 != null)
        {
            s = Collections.unmodifiableList(list2);
        } else
        {
            s = null;
        }
        qf = s;
        nv = l2;
        orientation = k;
        qg = s2;
        qh = l3;
        qi = s3;
        qj = flag1;
        qk = s4;
        ql = s5;
    }

    public dv(String s, String s1, List list, List list1, long l, boolean flag, 
            long l1, List list2, long l2, int i, String s2, 
            long l3, String s3, String s4)
    {
        this(7, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, false, null, s4);
    }

    public dv(String s, String s1, List list, List list1, long l, boolean flag, 
            long l1, List list2, long l2, int i, String s2, 
            long l3, String s3, boolean flag1, String s4, String s5)
    {
        this(7, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, flag1, s4, s5);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        dw.a(this, parcel, i);
    }

}
