// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cr

public static class <init>
{

    private final List aqI;
    private final List aqJ;
    private final List aqK;
    private final List aqL;
    private final List aqM;
    private final List aqN;
    private final List aqO;
    private final List aqP;
    private final List aqQ;
    private final List aqR;

    public <init> b(<init> <init>1)
    {
        aqI.add(<init>1);
        return this;
    }

    public aqI c(aqI aqi)
    {
        aqJ.add(aqi);
        return this;
    }

    public aqJ cN(String s)
    {
        aqQ.add(s);
        return this;
    }

    public aqQ cO(String s)
    {
        aqR.add(s);
        return this;
    }

    public aqR cP(String s)
    {
        aqO.add(s);
        return this;
    }

    public aqO cQ(String s)
    {
        aqP.add(s);
        return this;
    }

    public aqP d(aqP aqp)
    {
        aqK.add(aqp);
        return this;
    }

    public aqK e(aqK aqk)
    {
        aqL.add(aqk);
        return this;
    }

    public aqL f(aqL aql)
    {
        aqM.add(aql);
        return this;
    }

    public aqM g(aqM aqm)
    {
        aqN.add(aqm);
        return this;
    }

    public aqN pm()
    {
        return new <init>(aqI, aqJ, aqK, aqL, aqM, aqN, aqO, aqP, aqQ, aqR, null);
    }

    private ()
    {
        aqI = new ArrayList();
        aqJ = new ArrayList();
        aqK = new ArrayList();
        aqL = new ArrayList();
        aqM = new ArrayList();
        aqN = new ArrayList();
        aqO = new ArrayList();
        aqP = new ArrayList();
        aqQ = new ArrayList();
        aqR = new ArrayList();
    }

    aqR(aqR aqr)
    {
        this();
    }
}
