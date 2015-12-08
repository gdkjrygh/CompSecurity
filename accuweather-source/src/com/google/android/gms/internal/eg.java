// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            bm, bv, bp, ey, 
//            aj, bn, am

public final class eg
{

    public final int errorCode;
    public final bm nK;
    public final bv nL;
    public final String nM;
    public final bp nN;
    public final List nr;
    public final List ns;
    public final long nv;
    public final int orientation;
    public final ey ow;
    public final aj pV;
    public final String pY;
    public final long qc;
    public final boolean qd;
    public final long qe;
    public final List qf;
    public final String qi;
    public final JSONObject rv;
    public final bn rw;
    public final am rx;
    public final long ry;
    public final long rz;

    public eg(aj aj, ey ey, List list, int i, List list1, List list2, int j, 
            long l, String s, boolean flag, bm bm, bv bv, String s1, 
            bn bn, bp bp, long l1, am am, long l2, 
            long l3, long l4, String s2, JSONObject jsonobject)
    {
        pV = aj;
        ow = ey;
        if (list != null)
        {
            aj = Collections.unmodifiableList(list);
        } else
        {
            aj = null;
        }
        nr = aj;
        errorCode = i;
        if (list1 != null)
        {
            aj = Collections.unmodifiableList(list1);
        } else
        {
            aj = null;
        }
        ns = aj;
        if (list2 != null)
        {
            aj = Collections.unmodifiableList(list2);
        } else
        {
            aj = null;
        }
        qf = aj;
        orientation = j;
        nv = l;
        pY = s;
        qd = flag;
        nK = bm;
        nL = bv;
        nM = s1;
        rw = bn;
        nN = bp;
        qe = l1;
        rx = am;
        qc = l2;
        ry = l3;
        rz = l4;
        qi = s2;
        rv = jsonobject;
    }
}
