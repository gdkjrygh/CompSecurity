// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            bx

public final class bw
    implements SafeParcelable
{

    public static final bx CREATOR = new bx();
    public final List eW;
    public final List eX;
    public final int errorCode;
    public final String fW;
    public final long fa;
    public final String gG;
    public final long gH;
    public final boolean gI;
    public final long gJ;
    public final List gK;
    public final int orientation;
    public final int versionCode;

    public bw(int i)
    {
        this(1, null, null, null, i, null, -1L, false, -1L, null, -1L, -1);
    }

    bw(int i, String s, String s1, List list, int j, List list1, long l, boolean flag, long l1, List list2, long l2, 
            int k)
    {
        versionCode = i;
        fW = s;
        gG = s1;
        if (list != null)
        {
            s = Collections.unmodifiableList(list);
        } else
        {
            s = null;
        }
        eW = s;
        errorCode = j;
        if (list1 != null)
        {
            s = Collections.unmodifiableList(list1);
        } else
        {
            s = null;
        }
        eX = s;
        gH = l;
        gI = flag;
        gJ = l1;
        if (list2 != null)
        {
            s = Collections.unmodifiableList(list2);
        } else
        {
            s = null;
        }
        gK = s;
        fa = l2;
        orientation = k;
    }

    public bw(String s, String s1, List list, List list1, long l, boolean flag, 
            long l1, List list2, long l2, int i)
    {
        this(1, s, s1, list, -2, list1, l, flag, l1, list2, l2, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bx.a(this, parcel, i);
    }

}
