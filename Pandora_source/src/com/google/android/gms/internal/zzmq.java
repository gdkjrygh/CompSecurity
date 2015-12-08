// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzbg;
import com.google.android.gms.tagmanager.zzdf;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzb

public class zzmq
{
    public static class zza
    {

        private final zzd.zza zzaFi;
        private final Map zzaHk;

        public static zzb zzys()
        {
            return new zzb();
        }

        public String toString()
        {
            return (new StringBuilder()).append("Properties: ").append(zzyt()).append(" pushAfterEvaluate: ").append(zzaFi).toString();
        }

        public void zza(String s, zzd.zza zza1)
        {
            zzaHk.put(s, zza1);
        }

        public zzd.zza zzxy()
        {
            return zzaFi;
        }

        public Map zzyt()
        {
            return Collections.unmodifiableMap(zzaHk);
        }

        private zza(Map map, zzd.zza zza1)
        {
            zzaHk = map;
            zzaFi = zza1;
        }

    }

    public static class zzb
    {

        private zzd.zza zzaFi;
        private final Map zzaHk;

        public zzb zzb(String s, zzd.zza zza1)
        {
            zzaHk.put(s, zza1);
            return this;
        }

        public zzb zzq(zzd.zza zza1)
        {
            zzaFi = zza1;
            return this;
        }

        public zza zzyu()
        {
            return new zza(zzaHk, zzaFi);
        }

        private zzb()
        {
            zzaHk = new HashMap();
        }

    }

    public static class zzc
    {

        private final List zzaHl;
        private final Map zzaHm;
        private final int zzaHn;
        private final String zzacK;

        public static zzd zzyv()
        {
            return new zzd();
        }

        public String getVersion()
        {
            return zzacK;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Rules: ").append(zzyw()).append("  Macros: ").append(zzaHm).toString();
        }

        public List zzyw()
        {
            return zzaHl;
        }

        public Map zzyx()
        {
            return zzaHm;
        }

        private zzc(List list, Map map, String s, int i)
        {
            zzaHl = Collections.unmodifiableList(list);
            zzaHm = Collections.unmodifiableMap(map);
            zzacK = s;
            zzaHn = i;
        }

    }

    public static class zzd
    {

        private final List zzaHl;
        private final Map zzaHm;
        private int zzaHn;
        private String zzacK;

        public zzd zzb(zze zze1)
        {
            zzaHl.add(zze1);
            return this;
        }

        public zzd zzc(zza zza1)
        {
            String s = zzdf.zzg((zzd.zza)zza1.zzyt().get(com.google.android.gms.internal.zzb.zzdJ.toString()));
            List list = (List)zzaHm.get(s);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                zzaHm.put(s, obj);
            }
            ((List) (obj)).add(zza1);
            return this;
        }

        public zzd zzen(String s)
        {
            zzacK = s;
            return this;
        }

        public zzd zzhM(int i)
        {
            zzaHn = i;
            return this;
        }

        public zzc zzyy()
        {
            return new zzc(zzaHl, zzaHm, zzacK, zzaHn);
        }

        private zzd()
        {
            zzaHl = new ArrayList();
            zzaHm = new HashMap();
            zzacK = "";
            zzaHn = 0;
        }

    }

    public static class zze
    {

        private final List zzaHo;
        private final List zzaHp;
        private final List zzaHq;
        private final List zzaHr;
        private final List zzaHs;
        private final List zzaHt;
        private final List zzaHu;
        private final List zzaHv;
        private final List zzaHw;
        private final List zzaHx;

        public static zzf zzyz()
        {
            return new zzf();
        }

        public String toString()
        {
            return (new StringBuilder()).append("Positive predicates: ").append(zzyA()).append("  Negative predicates: ").append(zzyB()).append("  Add tags: ").append(zzyC()).append("  Remove tags: ").append(zzyD()).append("  Add macros: ").append(zzyE()).append("  Remove macros: ").append(zzyJ()).toString();
        }

        public List zzyA()
        {
            return zzaHo;
        }

        public List zzyB()
        {
            return zzaHp;
        }

        public List zzyC()
        {
            return zzaHq;
        }

        public List zzyD()
        {
            return zzaHr;
        }

        public List zzyE()
        {
            return zzaHs;
        }

        public List zzyF()
        {
            return zzaHu;
        }

        public List zzyG()
        {
            return zzaHv;
        }

        public List zzyH()
        {
            return zzaHw;
        }

        public List zzyI()
        {
            return zzaHx;
        }

        public List zzyJ()
        {
            return zzaHt;
        }

        private zze(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
                List list7, List list8, List list9)
        {
            zzaHo = Collections.unmodifiableList(list);
            zzaHp = Collections.unmodifiableList(list1);
            zzaHq = Collections.unmodifiableList(list2);
            zzaHr = Collections.unmodifiableList(list3);
            zzaHs = Collections.unmodifiableList(list4);
            zzaHt = Collections.unmodifiableList(list5);
            zzaHu = Collections.unmodifiableList(list6);
            zzaHv = Collections.unmodifiableList(list7);
            zzaHw = Collections.unmodifiableList(list8);
            zzaHx = Collections.unmodifiableList(list9);
        }

    }

    public static class zzf
    {

        private final List zzaHo;
        private final List zzaHp;
        private final List zzaHq;
        private final List zzaHr;
        private final List zzaHs;
        private final List zzaHt;
        private final List zzaHu;
        private final List zzaHv;
        private final List zzaHw;
        private final List zzaHx;

        public zzf zzd(zza zza1)
        {
            zzaHo.add(zza1);
            return this;
        }

        public zzf zze(zza zza1)
        {
            zzaHp.add(zza1);
            return this;
        }

        public zzf zzeo(String s)
        {
            zzaHw.add(s);
            return this;
        }

        public zzf zzep(String s)
        {
            zzaHx.add(s);
            return this;
        }

        public zzf zzeq(String s)
        {
            zzaHu.add(s);
            return this;
        }

        public zzf zzer(String s)
        {
            zzaHv.add(s);
            return this;
        }

        public zzf zzf(zza zza1)
        {
            zzaHq.add(zza1);
            return this;
        }

        public zzf zzg(zza zza1)
        {
            zzaHr.add(zza1);
            return this;
        }

        public zzf zzh(zza zza1)
        {
            zzaHs.add(zza1);
            return this;
        }

        public zzf zzi(zza zza1)
        {
            zzaHt.add(zza1);
            return this;
        }

        public zze zzyK()
        {
            return new zze(zzaHo, zzaHp, zzaHq, zzaHr, zzaHs, zzaHt, zzaHu, zzaHv, zzaHw, zzaHx);
        }

        private zzf()
        {
            zzaHo = new ArrayList();
            zzaHp = new ArrayList();
            zzaHq = new ArrayList();
            zzaHr = new ArrayList();
            zzaHs = new ArrayList();
            zzaHt = new ArrayList();
            zzaHu = new ArrayList();
            zzaHv = new ArrayList();
            zzaHw = new ArrayList();
            zzaHx = new ArrayList();
        }

    }

    public static class zzg extends Exception
    {

        public zzg(String s)
        {
            super(s);
        }
    }


    private static zzd.zza zza(int i, zzc.zzf zzf1, zzd.zza azza[], Set set)
        throws zzg
    {
        Object obj;
        zzd.zza zza1;
        int j1;
        int i2;
        int l2;
        i2 = 0;
        l2 = 0;
        j1 = 0;
        if (set.contains(Integer.valueOf(i)))
        {
            zzel((new StringBuilder()).append("Value cycle detected.  Current value reference: ").append(i).append(".").append("  Previous value references: ").append(set).append(".").toString());
        }
        zza1 = (zzd.zza)zza(((Object []) (zzf1.zzgv)), i, "values");
        if (azza[i] != null)
        {
            return azza[i];
        }
        obj = null;
        set.add(Integer.valueOf(i));
        zza1.type;
        JVM INSTR tableswitch 1 8: default 152
    //                   1 653
    //                   2 199
    //                   3 291
    //                   4 525
    //                   5 653
    //                   6 653
    //                   7 557
    //                   8 653;
           goto _L1 _L2 _L3 _L4 _L5 _L2 _L2 _L6 _L2
_L1:
        if (obj == null)
        {
            zzel((new StringBuilder()).append("Invalid value: ").append(zza1).toString());
        }
        azza[i] = ((zzd.zza) (obj));
        set.remove(Integer.valueOf(i));
        return ((zzd.zza) (obj));
_L3:
        obj = zzp(zza1);
        zzd.zza zza2 = zzo(zza1);
        zza2.zzhl = new zzd.zza[((zzc.zzh) (obj)).zzgW.length];
        int ai[] = ((zzc.zzh) (obj)).zzgW;
        i2 = ai.length;
        int j = 0;
        do
        {
            obj = zza2;
            if (j1 >= i2)
            {
                continue; /* Loop/switch isn't completed */
            }
            l2 = ai[j1];
            zza2.zzhl[j] = zza(l2, zzf1, azza, set);
            j1++;
            j++;
        } while (true);
_L4:
        zzd.zza zza3 = zzo(zza1);
        obj = zzp(zza1);
        if (((zzc.zzh) (obj)).zzgX.length != ((zzc.zzh) (obj)).zzgY.length)
        {
            zzel((new StringBuilder()).append("Uneven map keys (").append(((zzc.zzh) (obj)).zzgX.length).append(") and map values (").append(((zzc.zzh) (obj)).zzgY.length).append(")").toString());
        }
        zza3.zzhm = new zzd.zza[((zzc.zzh) (obj)).zzgX.length];
        zza3.zzhn = new zzd.zza[((zzc.zzh) (obj)).zzgX.length];
        int ai1[] = ((zzc.zzh) (obj)).zzgX;
        l2 = ai1.length;
        int k1 = 0;
        for (int k = 0; k1 < l2; k++)
        {
            int j3 = ai1[k1];
            zza3.zzhm[k] = zza(j3, zzf1, azza, set);
            k1++;
        }

        ai1 = ((zzc.zzh) (obj)).zzgY;
        l2 = ai1.length;
        int l = 0;
        k1 = i2;
        do
        {
            obj = zza3;
            if (k1 >= l2)
            {
                continue; /* Loop/switch isn't completed */
            }
            int j2 = ai1[k1];
            zza3.zzhn[l] = zza(j2, zzf1, azza, set);
            k1++;
            l++;
        } while (true);
_L5:
        obj = zzo(zza1);
        obj.zzho = zzdf.zzg(zza(zzp(zza1).zzhb, zzf1, azza, set));
        continue; /* Loop/switch isn't completed */
_L6:
        zzd.zza zza4 = zzo(zza1);
        obj = zzp(zza1);
        zza4.zzhs = new zzd.zza[((zzc.zzh) (obj)).zzha.length];
        int ai2[] = ((zzc.zzh) (obj)).zzha;
        int k2 = ai2.length;
        int i1 = 0;
        int l1 = l2;
        do
        {
            obj = zza4;
            if (l1 >= k2)
            {
                continue; /* Loop/switch isn't completed */
            }
            int i3 = ai2[l1];
            zza4.zzhs[i1] = zza(i3, zzf1, azza, set);
            l1++;
            i1++;
        } while (true);
_L2:
        obj = zza1;
        if (true) goto _L1; else goto _L7
_L7:
    }

    private static zza zza(zzc.zzb zzb1, zzc.zzf zzf1, zzd.zza azza[], int i)
        throws zzg
    {
        zzb zzb2 = zza.zzys();
        zzb1 = zzb1.zzgf;
        int j = zzb1.length;
        i = 0;
        while (i < j) 
        {
            int k = zzb1[i];
            Object obj = (zzc.zze)zza(((Object []) (zzf1.zzgw)), Integer.valueOf(k).intValue(), "properties");
            String s = (String)zza(((Object []) (zzf1.zzgu)), ((zzc.zze) (obj)).key, "keys");
            obj = (zzd.zza)zza(((Object []) (azza)), ((zzc.zze) (obj)).value, "values");
            if (com.google.android.gms.internal.zzb.zzeK.toString().equals(s))
            {
                zzb2.zzq(((zzd.zza) (obj)));
            } else
            {
                zzb2.zzb(s, ((zzd.zza) (obj)));
            }
            i++;
        }
        return zzb2.zzyu();
    }

    private static zze zza(zzc.zzg zzg1, List list, List list1, List list2, zzc.zzf zzf1)
    {
        zzf zzf2 = zze.zzyz();
        int ai[] = zzg1.zzgK;
        int k2 = ai.length;
        for (int i = 0; i < k2; i++)
        {
            zzf2.zzd((zza)list2.get(Integer.valueOf(ai[i]).intValue()));
        }

        ai = zzg1.zzgL;
        k2 = ai.length;
        for (int j = 0; j < k2; j++)
        {
            zzf2.zze((zza)list2.get(Integer.valueOf(ai[j]).intValue()));
        }

        list2 = zzg1.zzgM;
        k2 = list2.length;
        for (int k = 0; k < k2; k++)
        {
            zzf2.zzf((zza)list.get(Integer.valueOf(list2[k]).intValue()));
        }

        list2 = zzg1.zzgO;
        k2 = list2.length;
        for (int l = 0; l < k2; l++)
        {
            int l2 = list2[l];
            zzf2.zzeo(zzf1.zzgv[Integer.valueOf(l2).intValue()].zzhk);
        }

        list2 = zzg1.zzgN;
        k2 = list2.length;
        for (int i1 = 0; i1 < k2; i1++)
        {
            zzf2.zzg((zza)list.get(Integer.valueOf(list2[i1]).intValue()));
        }

        list = zzg1.zzgP;
        k2 = list.length;
        for (int j1 = 0; j1 < k2; j1++)
        {
            int i3 = list[j1];
            zzf2.zzep(zzf1.zzgv[Integer.valueOf(i3).intValue()].zzhk);
        }

        list = zzg1.zzgQ;
        k2 = list.length;
        for (int k1 = 0; k1 < k2; k1++)
        {
            zzf2.zzh((zza)list1.get(Integer.valueOf(list[k1]).intValue()));
        }

        list = zzg1.zzgS;
        k2 = list.length;
        for (int l1 = 0; l1 < k2; l1++)
        {
            int j3 = list[l1];
            zzf2.zzeq(zzf1.zzgv[Integer.valueOf(j3).intValue()].zzhk);
        }

        list = zzg1.zzgR;
        k2 = list.length;
        for (int i2 = 0; i2 < k2; i2++)
        {
            zzf2.zzi((zza)list1.get(Integer.valueOf(list[i2]).intValue()));
        }

        zzg1 = zzg1.zzgT;
        k2 = zzg1.length;
        for (int j2 = 0; j2 < k2; j2++)
        {
            int k3 = zzg1[j2];
            zzf2.zzer(zzf1.zzgv[Integer.valueOf(k3).intValue()].zzhk);
        }

        return zzf2.zzyK();
    }

    private static Object zza(Object aobj[], int i, String s)
        throws zzg
    {
        if (i < 0 || i >= aobj.length)
        {
            zzel((new StringBuilder()).append("Index out of bounds detected: ").append(i).append(" in ").append(s).toString());
        }
        return aobj[i];
    }

    public static zzc zzb(zzc.zzf zzf1)
        throws zzg
    {
        boolean flag = false;
        Object aobj[] = new zzd.zza[zzf1.zzgv.length];
        for (int i = 0; i < zzf1.zzgv.length; i++)
        {
            zza(i, zzf1, ((zzd.zza []) (aobj)), new HashSet(0));
        }

        zzd zzd1 = zzc.zzyv();
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < zzf1.zzgy.length; j++)
        {
            arraylist.add(zza(zzf1.zzgy[j], zzf1, ((zzd.zza []) (aobj)), j));
        }

        ArrayList arraylist1 = new ArrayList();
        for (int k = 0; k < zzf1.zzgz.length; k++)
        {
            arraylist1.add(zza(zzf1.zzgz[k], zzf1, ((zzd.zza []) (aobj)), k));
        }

        ArrayList arraylist2 = new ArrayList();
        for (int l = 0; l < zzf1.zzgx.length; l++)
        {
            zza zza1 = zza(zzf1.zzgx[l], zzf1, ((zzd.zza []) (aobj)), l);
            zzd1.zzc(zza1);
            arraylist2.add(zza1);
        }

        aobj = zzf1.zzgA;
        int j1 = aobj.length;
        for (int i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
        {
            zzd1.zzb(zza(aobj[i1], arraylist, arraylist2, arraylist1, zzf1));
        }

        zzd1.zzen(zzf1.version);
        zzd1.zzhM(zzf1.zzgI);
        return zzd1.zzyy();
    }

    public static void zzc(InputStream inputstream, OutputStream outputstream)
        throws IOException
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

    private static void zzel(String s)
        throws zzg
    {
        zzbg.zzak(s);
        throw new zzg(s);
    }

    public static zzd.zza zzo(zzd.zza zza1)
    {
        zzd.zza zza2 = new zzd.zza();
        zza2.type = zza1.type;
        zza2.zzht = (int[])zza1.zzht.clone();
        if (zza1.zzhu)
        {
            zza2.zzhu = zza1.zzhu;
        }
        return zza2;
    }

    private static zzc.zzh zzp(zzd.zza zza1)
        throws zzg
    {
        if ((zzc.zzh)zza1.zza(zzc.zzh.zzgU) == null)
        {
            zzel((new StringBuilder()).append("Expected a ServingValue and didn't get one. Value is: ").append(zza1).toString());
        }
        return (zzc.zzh)zza1.zza(zzc.zzh.zzgU);
    }
}
