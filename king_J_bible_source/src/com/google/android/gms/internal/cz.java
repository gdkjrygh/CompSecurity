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

public final class cz
    implements SafeParcelable
{

    public static final da CREATOR = new da();
    public final int errorCode;
    public final List ne;
    public final List nf;
    public final long ni;
    public final String ol;
    public final int orientation;
    public final String pm;
    public final long pn;
    public final boolean po;
    public final long pp;
    public final List pq;
    public final String pr;
    public final long ps;
    public final String pt;
    public final boolean pu;
    public final String pv;
    public final String pw;
    public final int versionCode;

    public cz(int i)
    {
        this(7, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null);
    }

    public cz(int i, long l)
    {
        this(7, null, null, null, i, null, -1L, false, -1L, null, l, -1, null, -1L, null, false, null, null);
    }

    cz(int i, String s, String s1, List list, int j, List list1, long l, boolean flag, long l1, List list2, long l2, 
            int k, String s2, long l3, String s3, boolean flag1, String s4, 
            String s5)
    {
        versionCode = i;
        ol = s;
        pm = s1;
        if (list != null)
        {
            s = Collections.unmodifiableList(list);
        } else
        {
            s = null;
        }
        ne = s;
        errorCode = j;
        if (list1 != null)
        {
            s = Collections.unmodifiableList(list1);
        } else
        {
            s = null;
        }
        nf = s;
        pn = l;
        po = flag;
        pp = l1;
        if (list2 != null)
        {
            s = Collections.unmodifiableList(list2);
        } else
        {
            s = null;
        }
        pq = s;
        ni = l2;
        orientation = k;
        pr = s2;
        ps = l3;
        pt = s3;
        pu = flag1;
        pv = s4;
        pw = s5;
    }

    public cz(String s, String s1, List list, List list1, long l, boolean flag, 
            long l1, List list2, long l2, int i, String s2, 
            long l3, String s3, String s4)
    {
        this(7, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, false, null, s4);
    }

    public cz(String s, String s1, List list, List list1, long l, boolean flag, 
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
        da.a(this, parcel, i);
    }

}
