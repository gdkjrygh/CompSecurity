// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzgr

public final class zzgq
    implements SafeParcelable
{

    public static final zzgr CREATOR = new zzgr();
    public final int errorCode;
    public final int orientation;
    public final int versionCode;
    public final List zzst;
    public final List zzsu;
    public final long zzsx;
    public final String zzus;
    public final String zzwG;
    public final long zzwH;
    public final boolean zzwI;
    public final long zzwJ;
    public final List zzwK;
    public final String zzwL;
    public final long zzwM;
    public final String zzwN;
    public final boolean zzwO;
    public final String zzwP;
    public final String zzwQ;
    public final boolean zzwR;
    public final boolean zzwS;
    public final boolean zzwT;
    public final boolean zzwU;
    public final boolean zzwv;

    public zzgq(int i)
    {
        this(11, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, true, false);
    }

    public zzgq(int i, long l)
    {
        this(11, null, null, null, i, null, -1L, false, -1L, null, l, -1, null, -1L, null, false, null, null, false, false, false, true, false);
    }

    zzgq(int i, String s, String s1, List list, int j, List list1, long l, boolean flag, long l1, List list2, long l2, 
            int k, String s2, long l3, String s3, boolean flag1, String s4, 
            String s5, boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6)
    {
        versionCode = i;
        zzus = s;
        zzwG = s1;
        if (list != null)
        {
            s = Collections.unmodifiableList(list);
        } else
        {
            s = null;
        }
        zzst = s;
        errorCode = j;
        if (list1 != null)
        {
            s = Collections.unmodifiableList(list1);
        } else
        {
            s = null;
        }
        zzsu = s;
        zzwH = l;
        zzwI = flag;
        zzwJ = l1;
        if (list2 != null)
        {
            s = Collections.unmodifiableList(list2);
        } else
        {
            s = null;
        }
        zzwK = s;
        zzsx = l2;
        orientation = k;
        zzwL = s2;
        zzwM = l3;
        zzwN = s3;
        zzwO = flag1;
        zzwP = s4;
        zzwQ = s5;
        zzwR = flag2;
        zzwS = flag3;
        zzwv = flag4;
        zzwT = flag5;
        zzwU = flag6;
    }

    public zzgq(String s, String s1, List list, List list1, long l, boolean flag, 
            long l1, List list2, long l2, int i, String s2, 
            long l3, String s3, String s4, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4, boolean flag5)
    {
        this(11, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, false, null, s4, flag1, flag2, flag3, flag4, flag5);
    }

    public zzgq(String s, String s1, List list, List list1, long l, boolean flag, 
            long l1, List list2, long l2, int i, String s2, 
            long l3, String s3, boolean flag1, String s4, String s5, boolean flag2, 
            boolean flag3, boolean flag4, boolean flag5, boolean flag6)
    {
        this(11, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, flag1, s4, s5, flag2, flag3, flag4, flag5, flag6);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzgr.zza(this, parcel, i);
    }

}
