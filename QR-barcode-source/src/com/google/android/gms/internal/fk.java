// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            fl

public final class fk
    implements SafeParcelable
{

    public static final fl CREATOR = new fl();
    public final int errorCode;
    public final int orientation;
    public final List qf;
    public final List qg;
    public final long qj;
    public final String rP;
    public final boolean tF;
    public final String tG;
    public final long tH;
    public final boolean tI;
    public final long tJ;
    public final List tK;
    public final String tL;
    public final long tM;
    public final String tN;
    public final boolean tO;
    public final String tP;
    public final String tQ;
    public final boolean tR;
    public final boolean tS;
    public final boolean tT;
    public final int versionCode;

    public fk(int i)
    {
        this(10, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, false);
    }

    public fk(int i, long l)
    {
        this(10, null, null, null, i, null, -1L, false, -1L, null, l, -1, null, -1L, null, false, null, null, false, false, false, false);
    }

    fk(int i, String s, String s1, List list, int j, List list1, long l, boolean flag, long l1, List list2, long l2, 
            int k, String s2, long l3, String s3, boolean flag1, String s4, 
            String s5, boolean flag2, boolean flag3, boolean flag4, boolean flag5)
    {
        versionCode = i;
        rP = s;
        tG = s1;
        if (list != null)
        {
            s = Collections.unmodifiableList(list);
        } else
        {
            s = null;
        }
        qf = s;
        errorCode = j;
        if (list1 != null)
        {
            s = Collections.unmodifiableList(list1);
        } else
        {
            s = null;
        }
        qg = s;
        tH = l;
        tI = flag;
        tJ = l1;
        if (list2 != null)
        {
            s = Collections.unmodifiableList(list2);
        } else
        {
            s = null;
        }
        tK = s;
        qj = l2;
        orientation = k;
        tL = s2;
        tM = l3;
        tN = s3;
        tO = flag1;
        tP = s4;
        tQ = s5;
        tR = flag2;
        tS = flag3;
        tF = flag4;
        tT = flag5;
    }

    public fk(String s, String s1, List list, List list1, long l, boolean flag, 
            long l1, List list2, long l2, int i, String s2, 
            long l3, String s3, String s4, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4)
    {
        this(10, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, false, null, s4, flag1, flag2, flag3, flag4);
    }

    public fk(String s, String s1, List list, List list1, long l, boolean flag, 
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
        fl.a(this, parcel, i);
    }

}
