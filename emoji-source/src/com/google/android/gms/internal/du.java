// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            dv

public final class du
    implements SafeParcelable
{

    public static final dv CREATOR = new dv();
    public final int errorCode;
    public final List nt;
    public final List nu;
    public final long nx;
    public final String oA;
    public final int orientation;
    public final String qe;
    public final long qf;
    public final boolean qg;
    public final long qh;
    public final List qi;
    public final String qj;
    public final long qk;
    public final String ql;
    public final boolean qm;
    public final String qn;
    public final String qo;
    public final int versionCode;

    public du(int i)
    {
        this(7, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null);
    }

    public du(int i, long l)
    {
        this(7, null, null, null, i, null, -1L, false, -1L, null, l, -1, null, -1L, null, false, null, null);
    }

    du(int i, String s, String s1, List list, int j, List list1, long l, boolean flag, long l1, List list2, long l2, 
            int k, String s2, long l3, String s3, boolean flag1, String s4, 
            String s5)
    {
        versionCode = i;
        oA = s;
        qe = s1;
        if (list != null)
        {
            s = Collections.unmodifiableList(list);
        } else
        {
            s = null;
        }
        nt = s;
        errorCode = j;
        if (list1 != null)
        {
            s = Collections.unmodifiableList(list1);
        } else
        {
            s = null;
        }
        nu = s;
        qf = l;
        qg = flag;
        qh = l1;
        if (list2 != null)
        {
            s = Collections.unmodifiableList(list2);
        } else
        {
            s = null;
        }
        qi = s;
        nx = l2;
        orientation = k;
        qj = s2;
        qk = l3;
        ql = s3;
        qm = flag1;
        qn = s4;
        qo = s5;
    }

    public du(String s, String s1, List list, List list1, long l, boolean flag, 
            long l1, List list2, long l2, int i, String s2, 
            long l3, String s3, String s4)
    {
        this(7, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, false, null, s4);
    }

    public du(String s, String s1, List list, List list1, long l, boolean flag, 
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
        dv.a(this, parcel, i);
    }

}
