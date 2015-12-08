// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzqf

public static class <init>
{

    private final List zzaPC;
    private final List zzaPD;
    private final List zzaPE;
    private final List zzaPF;
    private final List zzaPG;
    private final List zzaPH;
    private final List zzaPI;
    private final List zzaPJ;
    private final List zzaPK;
    private final List zzaPL;

    public <init> zzAE()
    {
        return new <init>(zzaPC, zzaPD, zzaPE, zzaPF, zzaPG, zzaPH, zzaPI, zzaPJ, zzaPK, zzaPL, null);
    }

    public zzaPL zzd(zzaPL zzapl)
    {
        zzaPC.add(zzapl);
        return this;
    }

    public zzaPC zze(zzaPC zzapc)
    {
        zzaPD.add(zzapc);
        return this;
    }

    public zzaPD zzeW(String s)
    {
        zzaPK.add(s);
        return this;
    }

    public zzaPK zzeX(String s)
    {
        zzaPL.add(s);
        return this;
    }

    public zzaPL zzeY(String s)
    {
        zzaPI.add(s);
        return this;
    }

    public zzaPI zzeZ(String s)
    {
        zzaPJ.add(s);
        return this;
    }

    public zzaPJ zzf(zzaPJ zzapj)
    {
        zzaPE.add(zzapj);
        return this;
    }

    public zzaPE zzg(zzaPE zzape)
    {
        zzaPF.add(zzape);
        return this;
    }

    public zzaPF zzh(zzaPF zzapf)
    {
        zzaPG.add(zzapf);
        return this;
    }

    public zzaPG zzi(zzaPG zzapg)
    {
        zzaPH.add(zzapg);
        return this;
    }

    private ()
    {
        zzaPC = new ArrayList();
        zzaPD = new ArrayList();
        zzaPE = new ArrayList();
        zzaPF = new ArrayList();
        zzaPG = new ArrayList();
        zzaPH = new ArrayList();
        zzaPI = new ArrayList();
        zzaPJ = new ArrayList();
        zzaPK = new ArrayList();
        zzaPL = new ArrayList();
    }

    zzaPL(zzaPL zzapl)
    {
        this();
    }
}
