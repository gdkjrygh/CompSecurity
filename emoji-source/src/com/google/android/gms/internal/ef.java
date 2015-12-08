// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            bl, bu, bo, ex, 
//            ai, al, bm

public final class ef
{

    public final int errorCode;
    public final bl nM;
    public final bu nN;
    public final String nO;
    public final bo nP;
    public final List nt;
    public final List nu;
    public final long nx;
    public final int orientation;
    public final ex oy;
    public final ai pX;
    public final String qa;
    public final long qf;
    public final boolean qg;
    public final long qh;
    public final List qi;
    public final String ql;
    public final al rA;
    public final long rB;
    public final long rC;
    public final JSONObject ry;
    public final bm rz;

    public ef(ai ai, ex ex, List list, int i, List list1, List list2, int j, 
            long l, String s, boolean flag, bl bl, bu bu, String s1, 
            bm bm, bo bo, long l1, al al, long l2, 
            long l3, long l4, String s2, JSONObject jsonobject)
    {
        pX = ai;
        oy = ex;
        if (list != null)
        {
            ai = Collections.unmodifiableList(list);
        } else
        {
            ai = null;
        }
        nt = ai;
        errorCode = i;
        if (list1 != null)
        {
            ai = Collections.unmodifiableList(list1);
        } else
        {
            ai = null;
        }
        nu = ai;
        if (list2 != null)
        {
            ai = Collections.unmodifiableList(list2);
        } else
        {
            ai = null;
        }
        qi = ai;
        orientation = j;
        nx = l;
        qa = s;
        qg = flag;
        nM = bl;
        nN = bu;
        nO = s1;
        rz = bm;
        nP = bo;
        qh = l1;
        rA = al;
        qf = l2;
        rB = l3;
        rC = l4;
        ql = s2;
        ry = jsonobject;
    }
}
