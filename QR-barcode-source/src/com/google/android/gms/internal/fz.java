// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            fi, fk, co, cl, 
//            cu, gv, av, cm, 
//            ay

public final class fz
{
    public static final class a
    {

        public final int errorCode;
        public final ay lH;
        public final JSONObject vp;
        public final cm vq;
        public final long vs;
        public final long vt;
        public final fi vv;
        public final fk vw;

        public a(fi fi1, fk fk1, cm cm, ay ay, int i, long l, 
                long l1, JSONObject jsonobject)
        {
            vv = fi1;
            vw = fk1;
            vq = cm;
            lH = ay;
            errorCode = i;
            vs = l;
            vt = l1;
            vp = jsonobject;
        }
    }


    public final int errorCode;
    public final int orientation;
    public final String qA;
    public final co qB;
    public final List qf;
    public final List qg;
    public final long qj;
    public final cl qy;
    public final cu qz;
    public final gv rN;
    public final String tA;
    public final long tH;
    public final boolean tI;
    public final long tJ;
    public final List tK;
    public final String tN;
    public final av tx;
    public final JSONObject vp;
    public final cm vq;
    public final ay vr;
    public final long vs;
    public final long vt;
    public final bq.a vu;

    public fz(av av, gv gv, List list, int i, List list1, List list2, int j, 
            long l, String s, boolean flag, cl cl, cu cu, String s1, 
            cm cm, co co, long l1, ay ay, long l2, 
            long l3, long l4, String s2, JSONObject jsonobject, bq.a a1)
    {
        tx = av;
        rN = gv;
        if (list != null)
        {
            av = Collections.unmodifiableList(list);
        } else
        {
            av = null;
        }
        qf = av;
        errorCode = i;
        if (list1 != null)
        {
            av = Collections.unmodifiableList(list1);
        } else
        {
            av = null;
        }
        qg = av;
        if (list2 != null)
        {
            av = Collections.unmodifiableList(list2);
        } else
        {
            av = null;
        }
        tK = av;
        orientation = j;
        qj = l;
        tA = s;
        tI = flag;
        qy = cl;
        qz = cu;
        qA = s1;
        vq = cm;
        qB = co;
        tJ = l1;
        vr = ay;
        tH = l2;
        vs = l3;
        vt = l4;
        tN = s2;
        vp = jsonobject;
        vu = a1;
    }

    public fz(a a1, gv gv, cl cl, cu cu, String s, co co, bq.a a2)
    {
        this(a1.vv.tx, gv, a1.vw.qf, a1.errorCode, a1.vw.qg, a1.vw.tK, a1.vw.orientation, a1.vw.qj, a1.vv.tA, a1.vw.tI, cl, cu, s, a1.vq, co, a1.vw.tJ, a1.lH, a1.vw.tH, a1.vs, a1.vt, a1.vw.tN, a1.vp, a2);
    }
}
