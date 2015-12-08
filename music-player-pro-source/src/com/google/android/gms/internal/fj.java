// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            fk

public final class fj
    implements SafeParcelable
{

    public static final fk CREATOR = new fk();
    public final int errorCode;
    public final int orientation;
    public final long qA;
    public final List qw;
    public final List qx;
    public final String sg;
    public final boolean tT;
    public final String tU;
    public final long tV;
    public final boolean tW;
    public final long tX;
    public final List tY;
    public final String tZ;
    public final long ua;
    public final String ub;
    public final boolean uc;
    public final String ud;
    public final String ue;
    public final boolean uf;
    public final boolean ug;
    public final boolean uh;
    public final int versionCode;

    public fj(int i)
    {
        this(10, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, false);
    }

    public fj(int i, long l)
    {
        this(10, null, null, null, i, null, -1L, false, -1L, null, l, -1, null, -1L, null, false, null, null, false, false, false, false);
    }

    fj(int i, String s, String s1, List list, int j, List list1, long l, boolean flag, long l1, List list2, long l2, 
            int k, String s2, long l3, String s3, boolean flag1, String s4, 
            String s5, boolean flag2, boolean flag3, boolean flag4, boolean flag5)
    {
        versionCode = i;
        sg = s;
        tU = s1;
        if (list != null)
        {
            s = Collections.unmodifiableList(list);
        } else
        {
            s = null;
        }
        qw = s;
        errorCode = j;
        if (list1 != null)
        {
            s = Collections.unmodifiableList(list1);
        } else
        {
            s = null;
        }
        qx = s;
        tV = l;
        tW = flag;
        tX = l1;
        if (list2 != null)
        {
            s = Collections.unmodifiableList(list2);
        } else
        {
            s = null;
        }
        tY = s;
        qA = l2;
        orientation = k;
        tZ = s2;
        ua = l3;
        ub = s3;
        uc = flag1;
        ud = s4;
        ue = s5;
        uf = flag2;
        ug = flag3;
        tT = flag4;
        uh = flag5;
    }

    public fj(String s, String s1, List list, List list1, long l, boolean flag, 
            long l1, List list2, long l2, int i, String s2, 
            long l3, String s3, String s4, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4)
    {
        this(10, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, false, null, s4, flag1, flag2, flag3, flag4);
    }

    public fj(String s, String s1, List list, List list1, long l, boolean flag, 
            long l1, List list2, long l2, int i, String s2, 
            long l3, String s3, boolean flag1, String s4, String s5, boolean flag2, 
            boolean flag3, boolean flag4, boolean flag5)
    {
        this(10, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, flag1, s4, s5, flag2, flag3, flag4, flag5);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fk.a(this, parcel, i);
    }

}
