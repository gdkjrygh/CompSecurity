// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            fh, fj, cq, cz, 
//            ct, gu, av, cr, 
//            ay

public final class fy
{
    public static final class a
    {

        public final int errorCode;
        public final ay lS;
        public final JSONObject vD;
        public final cr vE;
        public final long vG;
        public final long vH;
        public final fh vJ;
        public final fj vK;

        public a(fh fh1, fj fj1, cr cr, ay ay, int i, long l, 
                long l1, JSONObject jsonobject)
        {
            vJ = fh1;
            vK = fj1;
            vE = cr;
            lS = ay;
            errorCode = i;
            vG = l;
            vH = l1;
            vD = jsonobject;
        }
    }


    public final int errorCode;
    public final int orientation;
    public final long qA;
    public final cq qP;
    public final cz qQ;
    public final String qR;
    public final ct qS;
    public final List qw;
    public final List qx;
    public final gu se;
    public final av tL;
    public final String tO;
    public final long tV;
    public final boolean tW;
    public final long tX;
    public final List tY;
    public final String ub;
    public final JSONObject vD;
    public final cr vE;
    public final ay vF;
    public final long vG;
    public final long vH;
    public final bv.a vI;

    public fy(av av, gu gu, List list, int i, List list1, List list2, int j, 
            long l, String s, boolean flag, cq cq, cz cz, String s1, 
            cr cr, ct ct, long l1, ay ay, long l2, 
            long l3, long l4, String s2, JSONObject jsonobject, bv.a a1)
    {
        tL = av;
        se = gu;
        if (list != null)
        {
            av = Collections.unmodifiableList(list);
        } else
        {
            av = null;
        }
        qw = av;
        errorCode = i;
        if (list1 != null)
        {
            av = Collections.unmodifiableList(list1);
        } else
        {
            av = null;
        }
        qx = av;
        if (list2 != null)
        {
            av = Collections.unmodifiableList(list2);
        } else
        {
            av = null;
        }
        tY = av;
        orientation = j;
        qA = l;
        tO = s;
        tW = flag;
        qP = cq;
        qQ = cz;
        qR = s1;
        vE = cr;
        qS = ct;
        tX = l1;
        vF = ay;
        tV = l2;
        vG = l3;
        vH = l4;
        ub = s2;
        vD = jsonobject;
        vI = a1;
    }

    public fy(a a1, gu gu, cq cq, cz cz, String s, ct ct, bv.a a2)
    {
        this(a1.vJ.tL, gu, a1.vK.qw, a1.errorCode, a1.vK.qx, a1.vK.tY, a1.vK.orientation, a1.vK.qA, a1.vJ.tO, a1.vK.tW, cq, cz, s, a1.vE, ct, a1.vK.tX, a1.lS, a1.vK.tV, a1.vG, a1.vH, a1.vK.ub, a1.vD, a2);
    }
}
