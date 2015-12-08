// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzdf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzae

public class zzqf
{
    public static class zza
    {

        private final zzag.zza zzaNw;
        private final Map zzaPy;

        public static zzb zzAm()
        {
            return new zzb();
        }

        public String toString()
        {
            return (new StringBuilder()).append("Properties: ").append(zzAn()).append(" pushAfterEvaluate: ").append(zzaNw).toString();
        }

        public Map zzAn()
        {
            return Collections.unmodifiableMap(zzaPy);
        }

        public void zza(String s, zzag.zza zza1)
        {
            zzaPy.put(s, zza1);
        }

        public zzag.zza zzzs()
        {
            return zzaNw;
        }

        private zza(Map map, zzag.zza zza1)
        {
            zzaPy = map;
            zzaNw = zza1;
        }

    }

    public static class zzb
    {

        private zzag.zza zzaNw;
        private final Map zzaPy;

        public zza zzAo()
        {
            return new zza(zzaPy, zzaNw);
        }

        public zzb zzb(String s, zzag.zza zza1)
        {
            zzaPy.put(s, zza1);
            return this;
        }

        public zzb zzq(zzag.zza zza1)
        {
            zzaNw = zza1;
            return this;
        }

        private zzb()
        {
            zzaPy = new HashMap();
        }

    }

    public static class zzc
    {

        private final String zzTQ;
        private final Map zzaPA;
        private final int zzaPB;
        private final List zzaPz;

        public static zzd zzAp()
        {
            return new zzd();
        }

        public String getVersion()
        {
            return zzTQ;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Rules: ").append(zzAq()).append("  Macros: ").append(zzaPA).toString();
        }

        public List zzAq()
        {
            return zzaPz;
        }

        public Map zzAr()
        {
            return zzaPA;
        }

        private zzc(List list, Map map, String s, int i)
        {
            zzaPz = Collections.unmodifiableList(list);
            zzaPA = Collections.unmodifiableMap(map);
            zzTQ = s;
            zzaPB = i;
        }

    }

    public static class zzd
    {

        private String zzTQ;
        private final Map zzaPA;
        private int zzaPB;
        private final List zzaPz;

        public zzc zzAs()
        {
            return new zzc(zzaPz, zzaPA, zzTQ, zzaPB);
        }

        public zzd zzb(zze zze1)
        {
            zzaPz.add(zze1);
            return this;
        }

        public zzd zzc(zza zza1)
        {
            String s = zzdf.zzg((zzag.zza)zza1.zzAn().get(zzae.zzfr.toString()));
            List list = (List)zzaPA.get(s);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                zzaPA.put(s, obj);
            }
            ((List) (obj)).add(zza1);
            return this;
        }

        public zzd zzeV(String s)
        {
            zzTQ = s;
            return this;
        }

        public zzd zzjb(int i)
        {
            zzaPB = i;
            return this;
        }

        private zzd()
        {
            zzaPz = new ArrayList();
            zzaPA = new HashMap();
            zzTQ = "";
            zzaPB = 0;
        }

    }

    public static class zze
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

        public static zzf zzAt()
        {
            return new zzf();
        }

        public String toString()
        {
            return (new StringBuilder()).append("Positive predicates: ").append(zzAu()).append("  Negative predicates: ").append(zzAv()).append("  Add tags: ").append(zzAw()).append("  Remove tags: ").append(zzAx()).append("  Add macros: ").append(zzAy()).append("  Remove macros: ").append(zzAD()).toString();
        }

        public List zzAA()
        {
            return zzaPJ;
        }

        public List zzAB()
        {
            return zzaPK;
        }

        public List zzAC()
        {
            return zzaPL;
        }

        public List zzAD()
        {
            return zzaPH;
        }

        public List zzAu()
        {
            return zzaPC;
        }

        public List zzAv()
        {
            return zzaPD;
        }

        public List zzAw()
        {
            return zzaPE;
        }

        public List zzAx()
        {
            return zzaPF;
        }

        public List zzAy()
        {
            return zzaPG;
        }

        public List zzAz()
        {
            return zzaPI;
        }

        private zze(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
                List list7, List list8, List list9)
        {
            zzaPC = Collections.unmodifiableList(list);
            zzaPD = Collections.unmodifiableList(list1);
            zzaPE = Collections.unmodifiableList(list2);
            zzaPF = Collections.unmodifiableList(list3);
            zzaPG = Collections.unmodifiableList(list4);
            zzaPH = Collections.unmodifiableList(list5);
            zzaPI = Collections.unmodifiableList(list6);
            zzaPJ = Collections.unmodifiableList(list7);
            zzaPK = Collections.unmodifiableList(list8);
            zzaPL = Collections.unmodifiableList(list9);
        }

    }

    public static class zzf
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

        public zze zzAE()
        {
            return new zze(zzaPC, zzaPD, zzaPE, zzaPF, zzaPG, zzaPH, zzaPI, zzaPJ, zzaPK, zzaPL);
        }

        public zzf zzd(zza zza1)
        {
            zzaPC.add(zza1);
            return this;
        }

        public zzf zze(zza zza1)
        {
            zzaPD.add(zza1);
            return this;
        }

        public zzf zzeW(String s)
        {
            zzaPK.add(s);
            return this;
        }

        public zzf zzeX(String s)
        {
            zzaPL.add(s);
            return this;
        }

        public zzf zzeY(String s)
        {
            zzaPI.add(s);
            return this;
        }

        public zzf zzeZ(String s)
        {
            zzaPJ.add(s);
            return this;
        }

        public zzf zzf(zza zza1)
        {
            zzaPE.add(zza1);
            return this;
        }

        public zzf zzg(zza zza1)
        {
            zzaPF.add(zza1);
            return this;
        }

        public zzf zzh(zza zza1)
        {
            zzaPG.add(zza1);
            return this;
        }

        public zzf zzi(zza zza1)
        {
            zzaPH.add(zza1);
            return this;
        }

        private zzf()
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

    }

    public static class zzg extends Exception
    {

        public zzg(String s)
        {
            super(s);
        }
    }


    public static zzag.zza zzo(zzag.zza zza1)
    {
        zzag.zza zza2 = new zzag.zza();
        zza2.type = zza1.type;
        zza2.zzja = (int[])zza1.zzja.clone();
        if (zza1.zzjb)
        {
            zza2.zzjb = zza1.zzjb;
        }
        return zza2;
    }
}
