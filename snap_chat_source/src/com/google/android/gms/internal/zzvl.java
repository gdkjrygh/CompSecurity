// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzde;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzb

public class zzvl
{
    public static class zza
    {

        private final zzd.zza zzaAo;
        private final Map zzaCj;

        public static zzb zzuu()
        {
            return new zzb();
        }

        public String toString()
        {
            return (new StringBuilder("Properties: ")).append(zzuv()).append(" pushAfterEvaluate: ").append(zzaAo).toString();
        }

        public void zza(String s, zzd.zza zza1)
        {
            zzaCj.put(s, zza1);
        }

        public zzd.zza zztK()
        {
            return zzaAo;
        }

        public Map zzuv()
        {
            return Collections.unmodifiableMap(zzaCj);
        }

        private zza(Map map, zzd.zza zza1)
        {
            zzaCj = map;
            zzaAo = zza1;
        }

    }

    public static class zzb
    {

        private zzd.zza zzaAo;
        private final Map zzaCj;

        public zzb zzb(String s, zzd.zza zza1)
        {
            zzaCj.put(s, zza1);
            return this;
        }

        public zzb zzq(zzd.zza zza1)
        {
            zzaAo = zza1;
            return this;
        }

        public zza zzuw()
        {
            return new zza(zzaCj, zzaAo);
        }

        private zzb()
        {
            zzaCj = new HashMap();
        }

    }

    public static class zzc
    {

        private final String zzYw;
        private final List zzaCk;
        private final Map zzaCl;
        private final int zzaCm;

        public static zzd zzux()
        {
            return new zzd();
        }

        public String getVersion()
        {
            return zzYw;
        }

        public String toString()
        {
            return (new StringBuilder("Rules: ")).append(zzuy()).append("  Macros: ").append(zzaCl).toString();
        }

        public List zzuy()
        {
            return zzaCk;
        }

        public Map zzuz()
        {
            return zzaCl;
        }

        private zzc(List list, Map map, String s, int i)
        {
            zzaCk = Collections.unmodifiableList(list);
            zzaCl = Collections.unmodifiableMap(map);
            zzYw = s;
            zzaCm = i;
        }

    }

    public static class zzd
    {

        private String zzYw;
        private final List zzaCk;
        private final Map zzaCl;
        private int zzaCm;

        public zzd zzb(zze zze1)
        {
            zzaCk.add(zze1);
            return this;
        }

        public zzd zzc(zza zza1)
        {
            String s = zzde.zzg((zzd.zza)zza1.zzuv().get(com.google.android.gms.internal.zzb.zzdf.toString()));
            List list = (List)zzaCl.get(s);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                zzaCl.put(s, obj);
            }
            ((List) (obj)).add(zza1);
            return this;
        }

        public zzd zzdy(String s)
        {
            zzYw = s;
            return this;
        }

        public zzd zzhk(int i)
        {
            zzaCm = i;
            return this;
        }

        public zzc zzuA()
        {
            return new zzc(zzaCk, zzaCl, zzYw, zzaCm);
        }

        private zzd()
        {
            zzaCk = new ArrayList();
            zzaCl = new HashMap();
            zzYw = "";
            zzaCm = 0;
        }

    }

    public static class zze
    {

        private final List zzaCn;
        private final List zzaCo;
        private final List zzaCp;
        private final List zzaCq;
        private final List zzaCr;
        private final List zzaCs;
        private final List zzaCt;
        private final List zzaCu;
        private final List zzaCv;
        private final List zzaCw;

        public static zzf zzuB()
        {
            return new zzf();
        }

        public String toString()
        {
            return (new StringBuilder("Positive predicates: ")).append(zzuC()).append("  Negative predicates: ").append(zzuD()).append("  Add tags: ").append(zzuE()).append("  Remove tags: ").append(zzuF()).append("  Add macros: ").append(zzuG()).append("  Remove macros: ").append(zzuL()).toString();
        }

        public List zzuC()
        {
            return zzaCn;
        }

        public List zzuD()
        {
            return zzaCo;
        }

        public List zzuE()
        {
            return zzaCp;
        }

        public List zzuF()
        {
            return zzaCq;
        }

        public List zzuG()
        {
            return zzaCr;
        }

        public List zzuH()
        {
            return zzaCt;
        }

        public List zzuI()
        {
            return zzaCu;
        }

        public List zzuJ()
        {
            return zzaCv;
        }

        public List zzuK()
        {
            return zzaCw;
        }

        public List zzuL()
        {
            return zzaCs;
        }

        private zze(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
                List list7, List list8, List list9)
        {
            zzaCn = Collections.unmodifiableList(list);
            zzaCo = Collections.unmodifiableList(list1);
            zzaCp = Collections.unmodifiableList(list2);
            zzaCq = Collections.unmodifiableList(list3);
            zzaCr = Collections.unmodifiableList(list4);
            zzaCs = Collections.unmodifiableList(list5);
            zzaCt = Collections.unmodifiableList(list6);
            zzaCu = Collections.unmodifiableList(list7);
            zzaCv = Collections.unmodifiableList(list8);
            zzaCw = Collections.unmodifiableList(list9);
        }

    }

    public static class zzf
    {

        private final List zzaCn;
        private final List zzaCo;
        private final List zzaCp;
        private final List zzaCq;
        private final List zzaCr;
        private final List zzaCs;
        private final List zzaCt;
        private final List zzaCu;
        private final List zzaCv;
        private final List zzaCw;

        public zzf zzd(zza zza1)
        {
            zzaCn.add(zza1);
            return this;
        }

        public zzf zzdA(String s)
        {
            zzaCw.add(s);
            return this;
        }

        public zzf zzdB(String s)
        {
            zzaCt.add(s);
            return this;
        }

        public zzf zzdC(String s)
        {
            zzaCu.add(s);
            return this;
        }

        public zzf zzdz(String s)
        {
            zzaCv.add(s);
            return this;
        }

        public zzf zze(zza zza1)
        {
            zzaCo.add(zza1);
            return this;
        }

        public zzf zzf(zza zza1)
        {
            zzaCp.add(zza1);
            return this;
        }

        public zzf zzg(zza zza1)
        {
            zzaCq.add(zza1);
            return this;
        }

        public zzf zzh(zza zza1)
        {
            zzaCr.add(zza1);
            return this;
        }

        public zzf zzi(zza zza1)
        {
            zzaCs.add(zza1);
            return this;
        }

        public zze zzuM()
        {
            return new zze(zzaCn, zzaCo, zzaCp, zzaCq, zzaCr, zzaCs, zzaCt, zzaCu, zzaCv, zzaCw);
        }

        private zzf()
        {
            zzaCn = new ArrayList();
            zzaCo = new ArrayList();
            zzaCp = new ArrayList();
            zzaCq = new ArrayList();
            zzaCr = new ArrayList();
            zzaCs = new ArrayList();
            zzaCt = new ArrayList();
            zzaCu = new ArrayList();
            zzaCv = new ArrayList();
            zzaCw = new ArrayList();
        }

    }

    public static class zzg extends Exception
    {

        public zzg(String s)
        {
            super(s);
        }
    }


    public static void zzc(InputStream inputstream, OutputStream outputstream)
    {
        byte abyte0[] = new byte[1024];
        do
        {
            int i = inputstream.read(abyte0);
            if (i == -1)
            {
                return;
            }
            outputstream.write(abyte0, 0, i);
        } while (true);
    }

    public static zzd.zza zzo(zzd.zza zza1)
    {
        zzd.zza zza2 = new zzd.zza();
        zza2.type = zza1.type;
        zza2.zzgE = (int[])zza1.zzgE.clone();
        if (zza1.zzgF)
        {
            zza2.zzgF = zza1.zzgF;
        }
        return zza2;
    }
}
