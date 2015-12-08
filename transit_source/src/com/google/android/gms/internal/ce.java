// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            cq, ao, ax, ar, 
//            v, ap

public final class ce
{

    public final List eW;
    public final List eX;
    public final int errorCode;
    public final cq fU;
    public final long fa;
    public final ao fm;
    public final ax fn;
    public final String fo;
    public final ar fp;
    public final v gB;
    public final String gE;
    public final long gH;
    public final boolean gI;
    public final long gJ;
    public final List gK;
    public final ap hA;
    public final int orientation;

    public ce(v v, cq cq, List list, int i, List list1, List list2, int j, 
            long l, String s, boolean flag, ao ao, ax ax, String s1, 
            ap ap, ar ar, long l1, long l2)
    {
        gB = v;
        fU = cq;
        if (list != null)
        {
            v = Collections.unmodifiableList(list);
        } else
        {
            v = null;
        }
        eW = v;
        errorCode = i;
        if (list1 != null)
        {
            v = Collections.unmodifiableList(list1);
        } else
        {
            v = null;
        }
        eX = v;
        if (list2 != null)
        {
            v = Collections.unmodifiableList(list2);
        } else
        {
            v = null;
        }
        gK = v;
        orientation = j;
        fa = l;
        gE = s;
        gI = flag;
        fm = ao;
        fn = ax;
        fo = s1;
        hA = ap;
        fp = ar;
        gJ = l1;
        gH = l2;
    }
}
