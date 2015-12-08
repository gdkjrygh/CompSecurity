// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzb;
import com.google.android.gms.internal.zzmq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            as, zzdf, zzm, zzj, 
//            zzt, cr, zzdg, bw, 
//            cm, e, zzaf, l, 
//            m, ab, ac, bb, 
//            bs, z, aw, cd, 
//            ce, cf, cg, ch, 
//            ck, cl, cp, a, 
//            b, d, h, n, 
//            o, v, x, zzbb, 
//            af, ah, at, av, 
//            ay, ba, bc, bm, 
//            bn, bv, ca, g, 
//            zzbg, cb, cc, cj, 
//            ag, j, bd, bf, 
//            bk, aq, DataLayer, bg, 
//            f, co, i, be

class bl
{
    static interface a
    {

        public abstract void a(com.google.android.gms.internal.zzmq.zze zze, Set set, Set set1, bg bg1);
    }

    private static class b
    {

        private as a;
        private com.google.android.gms.internal.zzd.zza b;

        public as a()
        {
            return a;
        }

        public com.google.android.gms.internal.zzd.zza b()
        {
            return b;
        }

        public int c()
        {
            int j1 = ((com.google.android.gms.internal.zzd.zza)a.a()).zzAb();
            int i1;
            if (b == null)
            {
                i1 = 0;
            } else
            {
                i1 = b.zzAb();
            }
            return i1 + j1;
        }

        public b(as as1, com.google.android.gms.internal.zzd.zza zza)
        {
            a = as1;
            b = zza;
        }
    }

    private static class c
    {

        private final Set a = new HashSet();
        private final Map b = new HashMap();
        private final Map c = new HashMap();
        private final Map d = new HashMap();
        private final Map e = new HashMap();
        private com.google.android.gms.internal.zzmq.zza f;

        public Set a()
        {
            return a;
        }

        public void a(com.google.android.gms.internal.zzmq.zza zza)
        {
            f = zza;
        }

        public void a(com.google.android.gms.internal.zzmq.zze zze)
        {
            a.add(zze);
        }

        public void a(com.google.android.gms.internal.zzmq.zze zze, com.google.android.gms.internal.zzmq.zza zza)
        {
            List list = (List)b.get(zze);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                b.put(zze, obj);
            }
            ((List) (obj)).add(zza);
        }

        public void a(com.google.android.gms.internal.zzmq.zze zze, String s)
        {
            List list = (List)d.get(zze);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                d.put(zze, obj);
            }
            ((List) (obj)).add(s);
        }

        public Map b()
        {
            return b;
        }

        public void b(com.google.android.gms.internal.zzmq.zze zze, com.google.android.gms.internal.zzmq.zza zza)
        {
            List list = (List)c.get(zze);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                c.put(zze, obj);
            }
            ((List) (obj)).add(zza);
        }

        public void b(com.google.android.gms.internal.zzmq.zze zze, String s)
        {
            List list = (List)e.get(zze);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                e.put(zze, obj);
            }
            ((List) (obj)).add(s);
        }

        public Map c()
        {
            return d;
        }

        public Map d()
        {
            return e;
        }

        public Map e()
        {
            return c;
        }

        public com.google.android.gms.internal.zzmq.zza f()
        {
            return f;
        }

        public c()
        {
        }
    }


    private static final as a = new as(zzdf.zzxW(), true);
    private final com.google.android.gms.internal.zzmq.zzc b;
    private final g c;
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Map f = new HashMap();
    private final cj g;
    private final cj h;
    private final Set i;
    private final DataLayer j;
    private final Map k = new HashMap();
    private volatile String l;
    private int m;

    public bl(Context context, com.google.android.gms.internal.zzmq.zzc zzc, DataLayer datalayer, zzt.zza zza, zzt.zza zza1, g g1)
    {
        if (zzc == null)
        {
            throw new NullPointerException("resource cannot be null");
        }
        b = zzc;
        i = new HashSet(zzc.zzyw());
        j = datalayer;
        c = g1;
        zzc = new zzm.zza() {

            final bl a;

            public int a(com.google.android.gms.internal.zzmq.zza zza2, as as1)
            {
                return ((com.google.android.gms.internal.zzd.zza)as1.a()).zzAb();
            }

            public int sizeOf(Object obj, Object obj1)
            {
                return a((com.google.android.gms.internal.zzmq.zza)obj, (as)obj1);
            }

            
            {
                a = bl.this;
                super();
            }
        };
        g = (new zzm()).a(0x100000, zzc);
        zzc = new zzm.zza() {

            final bl a;

            public int a(String s, b b1)
            {
                return s.length() + b1.c();
            }

            public int sizeOf(Object obj, Object obj1)
            {
                return a((String)obj, (b)obj1);
            }

            
            {
                a = bl.this;
                super();
            }
        };
        h = (new zzm()).a(0x100000, zzc);
        b(new zzj(context));
        b(new zzt(zza1));
        b(new cr(datalayer));
        b(new zzdg(context, datalayer));
        b(new bw(context, datalayer));
        c(new cm());
        c(new e());
        c(new zzaf());
        c(new l());
        c(new m());
        c(new ab());
        c(new ac());
        c(new bb());
        c(new bs());
        a(new z(context));
        a(new aw(context));
        a(new cd(context));
        a(new ce(context));
        a(new cf(context));
        a(new cg(context));
        a(new ch(context));
        a(new ck());
        a(new cl(b.getVersion()));
        a(new zzt(zza));
        a(new cp(datalayer));
        a(new com.google.android.gms.tagmanager.a(context));
        a(new com.google.android.gms.tagmanager.b());
        a(new d());
        a(new h(this));
        a(new n());
        a(new o());
        a(new v(context));
        a(new x());
        a(new zzbb());
        a(new af());
        a(new ah(context));
        a(new at());
        a(new av());
        a(new ay());
        a(new ba());
        a(new bc(context));
        a(new bm());
        a(new bn());
        a(new bv());
        a(new ca());
        for (datalayer = i.iterator(); datalayer.hasNext();)
        {
            zza = (com.google.android.gms.internal.zzmq.zze)datalayer.next();
            if (g1.a())
            {
                a(zza.zzyE(), zza.zzyF(), "add macro");
                a(zza.zzyJ(), zza.zzyG(), "remove macro");
                a(zza.zzyC(), zza.zzyH(), "add tag");
                a(zza.zzyD(), zza.zzyI(), "remove tag");
            }
            for (int i1 = 0; i1 < zza.zzyE().size(); i1++)
            {
                zza1 = (com.google.android.gms.internal.zzmq.zza)zza.zzyE().get(i1);
                zzc = "Unknown";
                context = zzc;
                if (g1.a())
                {
                    context = zzc;
                    if (i1 < zza.zzyF().size())
                    {
                        context = (String)zza.zzyF().get(i1);
                    }
                }
                zzc = a(k, a(zza1));
                zzc.a(zza);
                zzc.a(zza, zza1);
                zzc.a(zza, context);
            }

            int j1 = 0;
            while (j1 < zza.zzyJ().size()) 
            {
                zza1 = (com.google.android.gms.internal.zzmq.zza)zza.zzyJ().get(j1);
                zzc = "Unknown";
                context = zzc;
                if (g1.a())
                {
                    context = zzc;
                    if (j1 < zza.zzyG().size())
                    {
                        context = (String)zza.zzyG().get(j1);
                    }
                }
                zzc = a(k, a(zza1));
                zzc.a(zza);
                zzc.b(zza, zza1);
                zzc.b(zza, context);
                j1++;
            }
        }

        for (context = b.zzyx().entrySet().iterator(); context.hasNext();)
        {
            zzc = (java.util.Map.Entry)context.next();
            datalayer = ((List)zzc.getValue()).iterator();
            while (datalayer.hasNext()) 
            {
                zza = (com.google.android.gms.internal.zzmq.zza)datalayer.next();
                if (!zzdf.zzk((com.google.android.gms.internal.zzd.zza)zza.zzyt().get(zzb.zzel.toString())).booleanValue())
                {
                    a(k, (String)zzc.getKey()).a(zza);
                }
            }
        }

    }

    private as a(com.google.android.gms.internal.zzd.zza zza, Set set, cb cb1)
    {
        if (!zza.zzhu)
        {
            return new as(zza, true);
        }
        com.google.android.gms.internal.zzd.zza zza3;
        int k1;
        switch (zza.type)
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            zzbg.zzak((new StringBuilder()).append("Unknown type: ").append(zza.type).toString());
            return a;

        case 2: // '\002'
            com.google.android.gms.internal.zzd.zza zza1 = zzmq.zzo(zza);
            zza1.zzhl = new com.google.android.gms.internal.zzd.zza[zza.zzhl.length];
            for (int i1 = 0; i1 < zza.zzhl.length; i1++)
            {
                as as1 = a(zza.zzhl[i1], set, cb1.a(i1));
                if (as1 == a)
                {
                    return a;
                }
                zza1.zzhl[i1] = (com.google.android.gms.internal.zzd.zza)as1.a();
            }

            return new as(zza1, false);

        case 3: // '\003'
            com.google.android.gms.internal.zzd.zza zza2 = zzmq.zzo(zza);
            if (zza.zzhm.length != zza.zzhn.length)
            {
                zzbg.zzak((new StringBuilder()).append("Invalid serving value: ").append(zza.toString()).toString());
                return a;
            }
            zza2.zzhm = new com.google.android.gms.internal.zzd.zza[zza.zzhm.length];
            zza2.zzhn = new com.google.android.gms.internal.zzd.zza[zza.zzhm.length];
            for (int j1 = 0; j1 < zza.zzhm.length; j1++)
            {
                as as2 = a(zza.zzhm[j1], set, cb1.b(j1));
                as as4 = a(zza.zzhn[j1], set, cb1.c(j1));
                if (as2 == a || as4 == a)
                {
                    return a;
                }
                zza2.zzhm[j1] = (com.google.android.gms.internal.zzd.zza)as2.a();
                zza2.zzhn[j1] = (com.google.android.gms.internal.zzd.zza)as4.a();
            }

            return new as(zza2, false);

        case 4: // '\004'
            if (set.contains(zza.zzho))
            {
                zzbg.zzak((new StringBuilder()).append("Macro cycle detected.  Current macro reference: ").append(zza.zzho).append(".").append("  Previous macro references: ").append(set.toString()).append(".").toString());
                return a;
            } else
            {
                set.add(zza.zzho);
                cb1 = cc.a(a(zza.zzho, set, cb1.a()), zza.zzht);
                set.remove(zza.zzho);
                return cb1;
            }

        case 7: // '\007'
            zza3 = zzmq.zzo(zza);
            zza3.zzhs = new com.google.android.gms.internal.zzd.zza[zza.zzhs.length];
            k1 = 0;
            break;
        }
        for (; k1 < zza.zzhs.length; k1++)
        {
            as as3 = a(zza.zzhs[k1], set, cb1.d(k1));
            if (as3 == a)
            {
                return a;
            }
            zza3.zzhs[k1] = (com.google.android.gms.internal.zzd.zza)as3.a();
        }

        return new as(zza3, false);
    }

    private as a(String s, Set set, ag ag1)
    {
        m = m + 1;
        Object obj = (b)h.a(s);
        if (obj != null && !c.a())
        {
            a(((b) (obj)).b(), set);
            m = m - 1;
            return ((b) (obj)).a();
        }
        obj = (c)k.get(s);
        if (obj == null)
        {
            zzbg.zzak((new StringBuilder()).append(b()).append("Invalid macro: ").append(s).toString());
            m = m - 1;
            return a;
        }
        as as1 = a(s, ((c) (obj)).a(), ((c) (obj)).b(), ((c) (obj)).c(), ((c) (obj)).e(), ((c) (obj)).d(), set, ag1.b());
        if (((Set)as1.a()).isEmpty())
        {
            obj = ((c) (obj)).f();
        } else
        {
            if (((Set)as1.a()).size() > 1)
            {
                zzbg.zzan((new StringBuilder()).append(b()).append("Multiple macros active for macroName ").append(s).toString());
            }
            obj = (com.google.android.gms.internal.zzmq.zza)((Set)as1.a()).iterator().next();
        }
        if (obj == null)
        {
            m = m - 1;
            return a;
        }
        ag1 = a(f, ((com.google.android.gms.internal.zzmq.zza) (obj)), set, ag1.a());
        boolean flag;
        if (as1.b() && ag1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ag1 == a)
        {
            ag1 = a;
        } else
        {
            ag1 = new as(ag1.a(), flag);
        }
        obj = ((com.google.android.gms.internal.zzmq.zza) (obj)).zzxy();
        if (ag1.b())
        {
            h.a(s, new b(ag1, ((com.google.android.gms.internal.zzd.zza) (obj))));
        }
        a(((com.google.android.gms.internal.zzd.zza) (obj)), set);
        m = m - 1;
        return ag1;
    }

    private as a(Map map, com.google.android.gms.internal.zzmq.zza zza, Set set, bd bd1)
    {
        boolean flag1 = true;
        Object obj = (com.google.android.gms.internal.zzd.zza)zza.zzyt().get(zzb.zzdy.toString());
        if (obj == null)
        {
            zzbg.zzak("No function id in properties");
            map = a;
        } else
        {
            obj = ((com.google.android.gms.internal.zzd.zza) (obj)).zzhp;
            j j1 = (j)map.get(obj);
            if (j1 == null)
            {
                zzbg.zzak((new StringBuilder()).append(((String) (obj))).append(" has no backing implementation.").toString());
                return a;
            }
            map = (as)g.a(zza);
            if (map == null || c.a())
            {
                map = new HashMap();
                Iterator iterator = zza.zzyt().entrySet().iterator();
                boolean flag = true;
                while (iterator.hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    Object obj1 = bd1.a((String)entry.getKey());
                    obj1 = a((com.google.android.gms.internal.zzd.zza)entry.getValue(), set, ((bf) (obj1)).a((com.google.android.gms.internal.zzd.zza)entry.getValue()));
                    if (obj1 == a)
                    {
                        return a;
                    }
                    if (((as) (obj1)).b())
                    {
                        zza.zza((String)entry.getKey(), (com.google.android.gms.internal.zzd.zza)((as) (obj1)).a());
                    } else
                    {
                        flag = false;
                    }
                    map.put(entry.getKey(), ((as) (obj1)).a());
                }
                if (!j1.zzg(map.keySet()))
                {
                    zzbg.zzak((new StringBuilder()).append("Incorrect keys for function ").append(((String) (obj))).append(" required ").append(j1.zzwT()).append(" had ").append(map.keySet()).toString());
                    return a;
                }
                if (!flag || !j1.zzwn())
                {
                    flag1 = false;
                }
                map = new as(j1.zzD(map), flag1);
                if (flag1)
                {
                    g.a(zza, map);
                }
                bd1.a((com.google.android.gms.internal.zzd.zza)map.a());
                return map;
            }
        }
        return map;
    }

    private as a(Set set, Set set1, a a1, bk bk1)
    {
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        set = set.iterator();
        boolean flag = true;
        while (set.hasNext()) 
        {
            com.google.android.gms.internal.zzmq.zze zze = (com.google.android.gms.internal.zzmq.zze)set.next();
            bg bg1 = bk1.a();
            as as1 = a(zze, set1, bg1);
            if (((Boolean)as1.a()).booleanValue())
            {
                a1.a(zze, hashset, hashset1, bg1);
            }
            if (flag && as1.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        hashset.removeAll(hashset1);
        bk1.a(hashset);
        return new as(hashset, flag);
    }

    private static c a(Map map, String s)
    {
        c c2 = (c)map.get(s);
        c c1 = c2;
        if (c2 == null)
        {
            c1 = new c();
            map.put(s, c1);
        }
        return c1;
    }

    private static String a(com.google.android.gms.internal.zzmq.zza zza)
    {
        return zzdf.zzg((com.google.android.gms.internal.zzd.zza)zza.zzyt().get(zzb.zzdJ.toString()));
    }

    private void a(com.google.android.gms.internal.zzd.zza zza, Set set)
    {
        if (zza != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((zza = a(zza, set, ((cb) (new aq())))) != a)
        {
            zza = ((com.google.android.gms.internal.zzd.zza) (zzdf.zzl((com.google.android.gms.internal.zzd.zza)zza.a())));
            if (zza instanceof Map)
            {
                zza = (Map)zza;
                j.push(zza);
                return;
            }
            if (zza instanceof List)
            {
                zza = ((List)zza).iterator();
                while (zza.hasNext()) 
                {
                    set = ((Set) (zza.next()));
                    if (set instanceof Map)
                    {
                        set = (Map)set;
                        j.push(set);
                    } else
                    {
                        zzbg.zzan("pushAfterEvaluate: value not a Map");
                    }
                }
            } else
            {
                zzbg.zzan("pushAfterEvaluate: value not a Map or List");
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static void a(List list, List list1, String s)
    {
        if (list.size() != list1.size())
        {
            zzbg.zzal((new StringBuilder()).append("Invalid resource: imbalance of rule names of functions for ").append(s).append(" operation. Using default rule name instead").toString());
        }
    }

    private static void a(Map map, j j1)
    {
        if (map.containsKey(j1.zzwS()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate function type name: ").append(j1.zzwS()).toString());
        } else
        {
            map.put(j1.zzwS(), j1);
            return;
        }
    }

    private String b()
    {
        if (m <= 1)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(Integer.toString(m));
        for (int i1 = 2; i1 < m; i1++)
        {
            stringbuilder.append(' ');
        }

        stringbuilder.append(": ");
        return stringbuilder.toString();
    }

    as a(com.google.android.gms.internal.zzmq.zza zza, Set set, bd bd1)
    {
        zza = a(e, zza, set, bd1);
        set = zzdf.zzk((com.google.android.gms.internal.zzd.zza)zza.a());
        bd1.a(zzdf.zzE(set));
        return new as(set, zza.b());
    }

    as a(com.google.android.gms.internal.zzmq.zze zze, Set set, bg bg1)
    {
        Iterator iterator = zze.zzyB().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            as as2 = a((com.google.android.gms.internal.zzmq.zza)iterator.next(), set, bg1.a());
            if (((Boolean)as2.a()).booleanValue())
            {
                bg1.a(zzdf.zzE(Boolean.valueOf(false)));
                return new as(Boolean.valueOf(false), as2.b());
            }
            if (flag && as2.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        for (zze = zze.zzyA().iterator(); zze.hasNext();)
        {
            as as1 = a((com.google.android.gms.internal.zzmq.zza)zze.next(), set, bg1.b());
            if (!((Boolean)as1.a()).booleanValue())
            {
                bg1.a(zzdf.zzE(Boolean.valueOf(false)));
                return new as(Boolean.valueOf(false), as1.b());
            }
            if (flag && as1.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }

        bg1.a(zzdf.zzE(Boolean.valueOf(true)));
        return new as(Boolean.valueOf(true), flag);
    }

    as a(String s, Set set, Map map, Map map1, Map map2, Map map3, Set set1, 
            bk bk1)
    {
        return a(set, set1, new a(map, map1, map2, map3) {

            final Map a;
            final Map b;
            final Map c;
            final Map d;
            final bl e;

            public void a(com.google.android.gms.internal.zzmq.zze zze, Set set2, Set set3, bg bg1)
            {
                List list = (List)a.get(zze);
                List list1 = (List)b.get(zze);
                if (list != null)
                {
                    set2.addAll(list);
                    bg1.c().zzc(list, list1);
                }
                set2 = (List)c.get(zze);
                zze = (List)d.get(zze);
                if (set2 != null)
                {
                    set3.addAll(set2);
                    bg1.d().zzc(set2, zze);
                }
            }

            
            {
                e = bl.this;
                a = map;
                b = map1;
                c = map2;
                d = map3;
                super();
            }
        }, bk1);
    }

    as a(Set set, bk bk1)
    {
        return a(set, ((Set) (new HashSet())), new a() {

            final bl a;

            public void a(com.google.android.gms.internal.zzmq.zze zze, Set set1, Set set2, bg bg1)
            {
                set1.addAll(zze.zzyC());
                set2.addAll(zze.zzyD());
                bg1.e().zzc(zze.zzyC(), zze.zzyH());
                bg1.f().zzc(zze.zzyD(), zze.zzyI());
            }

            
            {
                a = bl.this;
                super();
            }
        }, bk1);
    }

    String a()
    {
        this;
        JVM INSTR monitorenter ;
        String s = l;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    void a(j j1)
    {
        a(f, j1);
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        c(s);
        s = c.b(s);
        co co1 = s.b();
        com.google.android.gms.internal.zzmq.zza zza;
        for (Iterator iterator = ((Set)a(i, co1.b()).a()).iterator(); iterator.hasNext(); a(d, zza, ((Set) (new HashSet())), co1.a()))
        {
            zza = (com.google.android.gms.internal.zzmq.zza)iterator.next();
        }

        break MISSING_BLOCK_LABEL_103;
        s;
        throw s;
        s.c();
        c(((String) (null)));
        this;
        JVM INSTR monitorexit ;
    }

    public void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        list = list.iterator();
_L2:
        com.google.android.gms.internal.zzc.zzi zzi;
        do
        {
            if (!list.hasNext())
            {
                break MISSING_BLOCK_LABEL_90;
            }
            zzi = (com.google.android.gms.internal.zzc.zzi)list.next();
            if (zzi.name != null && zzi.name.startsWith("gaExperiment:"))
            {
                break MISSING_BLOCK_LABEL_79;
            }
            zzbg.zzam((new StringBuilder()).append("Ignored supplemental: ").append(zzi).toString());
        } while (true);
        list;
        throw list;
        com.google.android.gms.tagmanager.i.a(j, zzi);
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
    }

    public as b(String s)
    {
        m = 0;
        f f1 = c.a(s);
        s = a(s, new HashSet(), f1.a());
        f1.c();
        return s;
    }

    void b(j j1)
    {
        a(d, j1);
    }

    void c(j j1)
    {
        a(e, j1);
    }

    void c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        l = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

}
