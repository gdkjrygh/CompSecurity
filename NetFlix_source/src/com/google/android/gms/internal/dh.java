// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            bl, bi, br, dz, 
//            ah, bj, ak

public final class dh
{

    public final int errorCode;
    public final bl nA;
    public final List ne;
    public final List nf;
    public final long ni;
    public final bi nx;
    public final br ny;
    public final String nz;
    public final dz oj;
    public final int orientation;
    public final ah pg;
    public final String pj;
    public final long pn;
    public final boolean po;
    public final long pp;
    public final List pq;
    public final String pt;
    public final JSONObject qs;
    public final bj qt;
    public final ak qu;
    public final long qv;
    public final long qw;

    public dh(ah ah, dz dz, List list, int i, List list1, List list2, int j, 
            long l, String s, boolean flag, bi bi, br br, String s1, 
            bj bj, bl bl, long l1, ak ak, long l2, 
            long l3, long l4, String s2, JSONObject jsonobject)
    {
        pg = ah;
        oj = dz;
        if (list != null)
        {
            ah = Collections.unmodifiableList(list);
        } else
        {
            ah = null;
        }
        ne = ah;
        errorCode = i;
        if (list1 != null)
        {
            ah = Collections.unmodifiableList(list1);
        } else
        {
            ah = null;
        }
        nf = ah;
        if (list2 != null)
        {
            ah = Collections.unmodifiableList(list2);
        } else
        {
            ah = null;
        }
        pq = ah;
        orientation = j;
        ni = l;
        pj = s;
        po = flag;
        nx = bi;
        ny = br;
        nz = s1;
        qt = bj;
        nA = bl;
        pp = l1;
        qu = ak;
        pn = l2;
        qv = l3;
        qw = l4;
        pt = s2;
        qs = jsonobject;
    }
}
