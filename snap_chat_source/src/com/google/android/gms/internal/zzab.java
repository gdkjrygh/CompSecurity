// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzgj, zzei, zzem, zzgc, 
//            zzho, zzie, zzhp, zzhg, 
//            zzlx, zzcd, zzby, zzbz, 
//            zzfj, zzdp, zzlv

public class zzab
{

    private static zzab zzmN;
    private static final Object zzmz = new Object();
    private final zzgj zzmO = new zzgj();
    private final zzei zzmP = new zzei();
    private final zzem zzmQ = new zzem();
    private final zzgc zzmR = new zzgc();
    private final zzho zzmS = new zzho();
    private final zzie zzmT = new zzie();
    private final zzhp zzmU;
    private final zzhg zzmV;
    private final zzlv zzmW = new zzlx();
    private final zzcd zzmX = new zzcd();
    private final zzby zzmY = new zzby();
    private final zzbz zzmZ = new zzbz();
    private final zzfj zzna = new zzfj();
    private final zzdp zznb = new zzdp();

    protected zzab()
    {
        zzmU = zzhp.zzz(android.os.Build.VERSION.SDK_INT);
        zzmV = new zzhg(zzmS);
    }

    protected static void zza(zzab zzab1)
    {
        synchronized (zzmz)
        {
            zzmN = zzab1;
        }
        return;
        zzab1;
        obj;
        JVM INSTR monitorexit ;
        throw zzab1;
    }

    private static zzab zzaH()
    {
        zzab zzab1;
        synchronized (zzmz)
        {
            zzab1 = zzmN;
        }
        return zzab1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static zzgj zzaI()
    {
        return zzaH().zzmO;
    }

    public static zzei zzaJ()
    {
        return zzaH().zzmP;
    }

    public static zzem zzaK()
    {
        return zzaH().zzmQ;
    }

    public static zzgc zzaL()
    {
        return zzaH().zzmR;
    }

    public static zzho zzaM()
    {
        return zzaH().zzmS;
    }

    public static zzie zzaN()
    {
        return zzaH().zzmT;
    }

    public static zzhp zzaO()
    {
        return zzaH().zzmU;
    }

    public static zzhg zzaP()
    {
        return zzaH().zzmV;
    }

    public static zzlv zzaQ()
    {
        return zzaH().zzmW;
    }

    public static zzcd zzaR()
    {
        return zzaH().zzmX;
    }

    public static zzby zzaS()
    {
        return zzaH().zzmY;
    }

    public static zzbz zzaT()
    {
        return zzaH().zzmZ;
    }

    public static zzfj zzaU()
    {
        return zzaH().zzna;
    }

    public static zzdp zzaV()
    {
        return zzaH().zznb;
    }

    static 
    {
        zza(new zzab());
    }
}
