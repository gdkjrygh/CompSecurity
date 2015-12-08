// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.translate.core.j;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.k;
import com.google.android.libraries.translate.e.l;
import com.google.android.libraries.translate.f;
import com.google.android.libraries.translate.languages.c;
import com.google.common.collect.ed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            n, PackageType, OfflineDataProfileException, u, 
//            TranslateLocationProfileProf, al, i, LocationProfile, 
//            LocationProfileProf, x, ac, ai, 
//            t, q, p, h, 
//            OfflinePackage, v, j, d, 
//            OfflineTranslationException, ah, PackageProcessService, e

public final class o
    implements j
{

    private static final Set g = ed.a(new Integer[] {
        Integer.valueOf(2)
    });
    public final Map a = new HashMap();
    public final e b;
    final SharedPreferences c;
    public final com.google.android.libraries.translate.offline.d d;
    boolean e;
    public boolean f;
    private final Map h = new HashMap();
    private final Map i = new HashMap();
    private final Context j;
    private final n k;
    private final Map l = new HashMap();
    private LocationProfile m;

    public o(Context context, com.google.android.libraries.translate.offline.d d1, e e1)
    {
        int i1 = 0;
        super();
        e = false;
        f = false;
        j = context;
        b = e1;
        c = context.getSharedPreferences("ol_opm", 0);
        k = new n(j);
        d = d1;
        context = PackageType.values();
        for (int j1 = context.length; i1 < j1; i1++)
        {
            d1 = context[i1];
            a.put(d1, new ArrayList());
        }

    }

    static LocationProfile a(o o1)
    {
        return o1.m;
    }

    static LocationProfile a(o o1, LocationProfile locationprofile)
    {
        o1.m = locationprofile;
        return locationprofile;
    }

    static List a(SharedPreferences sharedpreferences)
    {
        HashSet hashset;
        hashset = new HashSet();
        sharedpreferences = sharedpreferences.getString("key_offline_locprof", "");
        if (TextUtils.isEmpty(sharedpreferences)) goto _L2; else goto _L1
_L1:
        String as[];
        int i1;
        int j1;
        as = sharedpreferences.split("\t");
        j1 = as.length;
        i1 = 0;
_L8:
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        String s;
        s = as[i1];
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_198;
        }
        sharedpreferences = new JSONObject(s);
        if (sharedpreferences.has(LocationProfileProf.Key.TYPE.name()))
        {
            sharedpreferences = PackageType.valueOf(sharedpreferences.getString(LocationProfileProf.Key.TYPE.name()));
        } else
        {
            sharedpreferences = PackageType.TRANSLATE;
        }
        u.b[sharedpreferences.ordinal()];
        JVM INSTR tableswitch 1 2: default 194
    //                   1 141
    //                   2 157;
           goto _L4 _L5 _L6
_L4:
        throw new OfflineDataProfileException("Error, unable to parse LocalProfileProf from package manager properties");
_L5:
        sharedpreferences = TranslateLocationProfileProf.a(s);
_L7:
        hashset.add(sharedpreferences);
        break MISSING_BLOCK_LABEL_198;
_L6:
        sharedpreferences = al.a(s);
        if (true) goto _L7; else goto _L2
_L2:
        sharedpreferences = new ArrayList();
        sharedpreferences.addAll(hashset);
        Collections.sort(sharedpreferences, new i());
        return sharedpreferences;
        sharedpreferences;
_L9:
        i1++;
          goto _L8
        sharedpreferences;
          goto _L9
    }

    static void a(o o1, LocationProfile locationprofile, boolean flag, l l1, PackageType packagetype)
    {
        Object obj;
        Set set;
        Iterator iterator;
        int i1;
        set = g;
        i1 = ((Integer)com.google.android.libraries.translate.e.d.d().second).intValue();
        iterator = locationprofile.a.iterator();
        obj = null;
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj2 = (LocationProfileProf)iterator.next();
        if (packagetype.equals(((LocationProfileProf) (obj2)).b))
        {
            Object obj4 = ((LocationProfileProf) (obj2)).b();
            if (set.contains(Integer.valueOf(((x) (obj4)).c)) && ((LocationProfileProf) (obj2)).f <= i1)
            {
                Object obj1 = obj2;
                ac ac1;
                Object obj3;
                if (obj != null)
                {
                    if (((x) (obj4)).a(((LocationProfileProf) (obj)).b()))
                    {
                        obj1 = obj2;
                    } else
                    {
                        obj1 = obj;
                    }
                }
                obj = obj1;
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (obj == null)
        {
            ac1 = null;
        } else
        {
            ac1 = ((LocationProfileProf) (obj)).a(o1.j, o1.b);
        }
        obj3 = new HashSet();
        obj4 = a(o1.c).iterator();
        obj = null;
        do
        {
            if (!((Iterator) (obj4)).hasNext())
            {
                break;
            }
            obj1 = (LocationProfileProf)((Iterator) (obj4)).next();
            if (((LocationProfileProf) (obj1)).b == packagetype)
            {
                if (ac1 == null || !((LocationProfileProf) (obj1)).b().equals(ac1.a()))
                {
                    obj2 = ((LocationProfileProf) (obj1)).a(o1.j, o1.b);
                    if (obj2 != null)
                    {
                        if (((ac) (obj2)).f().size() <= 1)
                        {
                            ((Set) (obj3)).add(obj1);
                            obj1 = obj2;
                        } else
                        {
                            o1.h.put(((ac) (obj2)).a(), obj2);
                            if (obj == null || ((ac) (obj2)).a().a(((ac) (obj)).a()))
                            {
                                obj1 = obj2;
                                obj = obj2;
                            } else
                            {
                                obj1 = obj2;
                            }
                        }
                    } else
                    {
                        ((LocationProfileProf) (obj1)).b();
                        obj1 = obj2;
                    }
                } else
                {
                    obj1 = ac1;
                }
                if (packagetype == PackageType.TRANSLATE && obj1 != null)
                {
                    ((ai)obj1).n();
                }
            }
        } while (true);
        if (!((Set) (obj3)).isEmpty())
        {
            obj1 = o1.c;
            obj2 = new ArrayList();
            ((List) (obj2)).addAll(a(((SharedPreferences) (obj1))));
            ((List) (obj2)).removeAll(((Collection) (obj3)));
            Collections.sort(((List) (obj2)), new i());
            obj3 = ((SharedPreferences) (obj1)).getString("\t", "");
            obj2 = TextUtils.join("\t", ((Iterable) (obj2)));
            if (!TextUtils.equals(((CharSequence) (obj3)), ((CharSequence) (obj2))))
            {
                obj1 = ((SharedPreferences) (obj1)).edit();
                ((android.content.SharedPreferences.Editor) (obj1)).putString("key_offline_locprof", ((String) (obj2)));
                ((android.content.SharedPreferences.Editor) (obj1)).commit();
            }
        }
        if (ac1 != null)
        {
            o1.f = false;
            obj = ac1;
        } else
        {
            o1.f = true;
        }
        if (obj != null)
        {
            ((ac) (obj)).a(o1, new t(o1, packagetype, ((ac) (obj)), locationprofile, l1), flag);
            return;
        } else
        {
            l1.a(Boolean.valueOf(true));
            return;
        }
    }

    static Map b(o o1)
    {
        return o1.l;
    }

    static Map c(o o1)
    {
        return o1.h;
    }

    public static final Set e()
    {
        return g;
    }

    public final void a()
    {
    }

    public final void a(l l1, boolean flag)
    {
        if (l1 == null)
        {
            l1 = new p(this);
        }
        l1 = new q(this, l1);
        if (m != null && flag)
        {
            l1.a(m);
            return;
        } else
        {
            com.google.android.libraries.translate.offline.h h1 = new com.google.android.libraries.translate.offline.h(true);
            h1.f = l1;
            h1.a(new Void[0]);
            return;
        }
    }

    public final void a(OfflinePackage offlinepackage, boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        offlinepackage.e();
        offlinepackage.a(true);
        f(offlinepackage);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (offlinepackage.d())
        {
            break MISSING_BLOCK_LABEL_167;
        }
        Object obj = new ArrayList();
        ((List) (obj)).addAll(offlinepackage.d);
        Collections.sort(((List) (obj)), new v());
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_167;
            }
            com.google.android.libraries.translate.offline.j j1 = (com.google.android.libraries.translate.offline.j)((Iterator) (obj)).next();
            switch (u.a[j1.e.ordinal()])
            {
            case 3: // '\003'
                j1.e = OfflinePackage.Status.DOWNLOAD_NOT_STARTED;
                j1.c();
                d.a(j1, flag, j1.a.a(j1, offlinepackage));
                break;
            }
        } while (true);
        offlinepackage;
        throw offlinepackage;
        offlinepackage.e();
        offlinepackage.a(false);
        TreeSet treeset = new TreeSet(k);
        List list = (List)a.get(offlinepackage.b);
        treeset.addAll(list);
        treeset.remove(offlinepackage);
        treeset.add(offlinepackage);
        list.clear();
        list.addAll(treeset);
        this;
        JVM INSTR monitorexit ;
    }

    public final boolean a(OfflinePackage offlinepackage)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = (ac)h.get(offlinepackage.a());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        ((ac) (obj)).c(offlinepackage);
        Iterator iterator;
        obj = (List)a.get(offlinepackage.b);
        iterator = ((List) (obj)).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        OfflinePackage offlinepackage1 = (OfflinePackage)iterator.next();
        if (!offlinepackage1.a.equals(offlinepackage.a)) goto _L4; else goto _L3
_L3:
        boolean flag = ((List) (obj)).remove(offlinepackage1);
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
        offlinepackage;
        throw offlinepackage;
    }

    public final boolean a(PackageType packagetype)
    {
        return l != null && l.get(packagetype) != null && ((ac)l.get(packagetype)).d();
    }

    public final boolean a(String s, String s1)
    {
        if (TextUtils.equals(s, "en") || TextUtils.equals(s1, "en")) goto _L2; else goto _L1
_L1:
        if (c(s, "en") == null || c("en", s1) == null) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (c(s, s1) == null)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final OfflinePackage b(OfflinePackage offlinepackage)
    {
        PackageType apackagetype[] = PackageType.values();
        int j1 = apackagetype.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                break;
            }
            for (Iterator iterator = d(apackagetype[i1]).iterator(); iterator.hasNext();)
            {
                OfflinePackage offlinepackage1 = (OfflinePackage)iterator.next();
                if (offlinepackage1.a.equals(offlinepackage.a))
                {
                    return offlinepackage1;
                }
            }

            i1++;
        } while (true);
        return null;
    }

    public final OfflinePackage b(String s, String s1)
    {
        s = com.google.android.libraries.translate.languages.c.c(s);
        s1 = com.google.android.libraries.translate.languages.c.c(s1);
        String s2 = String.valueOf("_");
        s1 = (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s2).length() + String.valueOf(s1).length())).append(s).append(s2).append(s1).toString();
        Iterator iterator = d(PackageType.WORD_LENS).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        boolean flag;
        s = (OfflinePackage)iterator.next();
        flag = ((OfflinePackage) (s)).a.equals(s1);
        if (!flag) goto _L4; else goto _L3
_L3:
        if (s == null)
        {
            s1 = String.valueOf(s1);
            if (s1.length() == 0)
            {
                break; /* Loop/switch isn't completed */
            }
            "WL Lang Pair not available for: ".concat(s1);
        }
        return s;
_L2:
        s = null;
        continue; /* Loop/switch isn't completed */
        s;
        s = null;
        if (true) goto _L3; else goto _L5
_L5:
        new String("WL Lang Pair not available for: ");
        return s;
    }

    public final ac b(PackageType packagetype)
    {
        return (ac)l.get(packagetype);
    }

    public final boolean b()
    {
        boolean flag2 = true;
        this;
        JVM INSTR monitorenter ;
        PackageType apackagetype[];
        Object obj1;
        int j1;
        obj1 = new HashMap();
        apackagetype = PackageType.values();
        j1 = apackagetype.length;
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Map) (obj1)).put(apackagetype[i1], new TreeSet(k));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        Object obj = null;
        Object obj2 = a(c).iterator();
_L3:
        LocationProfileProf locationprofileprof;
        ac ac1;
        if (!((Iterator) (obj2)).hasNext())
        {
            break MISSING_BLOCK_LABEL_182;
        }
        locationprofileprof = (LocationProfileProf)((Iterator) (obj2)).next();
        ac1 = (ac)h.get(locationprofileprof.b());
        if (ac1 != null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        locationprofileprof.b();
          goto _L3
        obj;
        throw obj;
        ac1.e();
        ((TreeSet)((Map) (obj1)).get(locationprofileprof.b)).addAll(ac1.f());
        if (obj != null) goto _L3; else goto _L4
_L4:
        obj = ac1.g();
          goto _L3
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        ((TreeSet)((Map) (obj1)).get(PackageType.TRANSLATE)).add(obj);
        obj = PackageType.values();
        j1 = obj.length;
        i1 = 0;
_L6:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = obj[i1];
        ((List)a.get(obj2)).clear();
        ((List)a.get(obj2)).addAll((Collection)((Map) (obj1)).get(obj2));
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        int i2;
        obj = PackageType.values();
        i2 = obj.length;
        boolean flag;
        int k1;
        flag = false;
        j1 = 0;
        k1 = 0;
_L12:
        if (k1 >= i2) goto _L8; else goto _L7
_L7:
        obj1 = obj[k1];
        obj1 = ((List)a.get(obj1)).iterator();
        boolean flag1 = j1;
        j1 = ((flag) ? 1 : 0);
        flag = flag1;
_L10:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (OfflinePackage)((Iterator) (obj1)).next();
        f(((OfflinePackage) (obj2)));
        if (((OfflinePackage) (obj2)).f())
        {
            j1 = 1;
            continue; /* Loop/switch isn't completed */
        }
        if (m.a(((OfflinePackage) (obj2))))
        {
            flag = true;
        }
        if (true) goto _L10; else goto _L9
_L8:
        d();
        com.google.android.libraries.translate.e.h.a(20);
        if (!j1 || flag)
        {
            flag2 = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag2;
_L9:
        int l1 = k1 + 1;
        k1 = ((flag) ? 1 : 0);
        flag = j1;
        j1 = k1;
        k1 = l1;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final OfflinePackage c(OfflinePackage offlinepackage)
    {
        for (Iterator iterator = ((List)a.get(offlinepackage.b)).iterator(); iterator.hasNext();)
        {
            OfflinePackage offlinepackage1 = (OfflinePackage)iterator.next();
            if (offlinepackage1.a.equals(offlinepackage.a))
            {
                return offlinepackage1;
            }
        }

        return null;
    }

    public final ac c(String s, String s1)
    {
        s = ah.a(s);
        if (!"en".equals(s))
        {
            return (ac)i.get(s);
        } else
        {
            s = ah.a(s1);
            return (ac)i.get(s);
        }
    }

    public final List c()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); arraylist.addAll((List)iterator.next())) { }
        return arraylist;
    }

    public final List c(PackageType packagetype)
    {
        return (List)a.get(packagetype);
    }

    public final Collection d(OfflinePackage offlinepackage)
    {
        this;
        JVM INSTR monitorenter ;
        HashSet hashset;
        Iterator iterator;
        hashset = new HashSet();
        iterator = offlinepackage.d.iterator();
_L3:
        com.google.android.libraries.translate.offline.j j1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_183;
        }
        j1 = (com.google.android.libraries.translate.offline.j)iterator.next();
        if (j1.e != OfflinePackage.Status.ERROR) goto _L2; else goto _L1
_L1:
        hashset.add(j1);
          goto _L3
        offlinepackage;
        throw offlinepackage;
_L2:
        Iterator iterator1 = a.values().iterator();
        boolean flag = false;
_L5:
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Iterator iterator2 = ((List)iterator1.next()).iterator();
        OfflinePackage offlinepackage1;
        do
        {
            if (!iterator2.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            offlinepackage1 = (OfflinePackage)iterator2.next();
        } while (offlinepackage1.equals(offlinepackage) || !offlinepackage1.d.contains(j1));
        flag = true;
        if (true) goto _L5; else goto _L4
_L4:
        if (flag) goto _L3; else goto _L6
_L6:
        hashset.add(j1);
          goto _L3
        this;
        JVM INSTR monitorexit ;
        return hashset;
    }

    public final List d(PackageType packagetype)
    {
        if (!a(packagetype))
        {
            return new ArrayList();
        } else
        {
            return ((ac)l.get(packagetype)).h();
        }
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator;
        i.clear();
        iterator = a(c).iterator();
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (LocationProfileProf)iterator.next();
        obj = (ac)h.get(((LocationProfileProf) (obj)).b());
        Exception exception;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            Iterator iterator1 = ((ac) (obj)).f().iterator();
            do
            {
                OfflinePackage offlinepackage;
                String s;
                do
                {
                    do
                    {
                        if (!iterator1.hasNext())
                        {
                            continue; /* Loop/switch isn't completed */
                        }
                        offlinepackage = (OfflinePackage)iterator1.next();
                    } while (offlinepackage.f);
                    s = offlinepackage.a;
                } while (i.get(s) != null || offlinepackage.c != OfflinePackage.Status.DOWNLOADED_POST_PROCESSED);
                i.put(s, obj);
            } while (true);
        }
        catch (OfflineTranslationException offlinetranslationexception) { }
        finally
        {
            this;
        }
        if (true) goto _L2; else goto _L1
_L1:
        return;
        throw exception;
    }

    public final void e(OfflinePackage offlinepackage)
    {
        ac ac1;
label0:
        for (Iterator iterator = a(c).iterator(); iterator.hasNext(); ac1.d(offlinepackage))
        {
            Object obj = (LocationProfileProf)iterator.next();
            ac1 = (ac)h.get(((LocationProfileProf) (obj)).b());
            if (ac1 == null)
            {
                ((LocationProfileProf) (obj)).b();
            }
            ((LocationProfileProf) (obj)).b();
            if (ac1.b() >= offlinepackage.g)
            {
                continue;
            }
            obj = ac1.f().iterator();
            do
            {
                OfflinePackage offlinepackage1;
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        continue label0;
                    }
                    offlinepackage1 = (OfflinePackage)((Iterator) (obj)).next();
                } while (!offlinepackage.a(offlinepackage1));
                ac1.d(offlinepackage1);
                ac1.c(offlinepackage1);
            } while (true);
        }

    }

    public final void f(OfflinePackage offlinepackage)
    {
        switch (u.a[offlinepackage.c.ordinal()])
        {
        default:
            Map map = d.b(offlinepackage.d);
            Iterator iterator = offlinepackage.d.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.libraries.translate.offline.j j3 = (com.google.android.libraries.translate.offline.j)iterator.next();
                j3.d();
                if (j3.e != OfflinePackage.Status.DOWNLOADED_POST_PROCESSED && j3.e != OfflinePackage.Status.ERROR)
                {
                    com.google.android.libraries.translate.offline.j j1;
                    if (j3.b())
                    {
                        j1 = (com.google.android.libraries.translate.offline.j)map.get(Long.valueOf(j3.j));
                    } else
                    {
                        j1 = null;
                    }
                    if (j1 != null)
                    {
                        j3.e = j1.e;
                        j3.b(j1.l);
                        if (j1.k >= 0L)
                        {
                            j3.a(j1.k);
                        }
                        j3.d = j1.a();
                        j3.c();
                    } else
                    {
                        OfflinePackage.Status status = j3.e;
                        if (status == OfflinePackage.Status.INPROGRESS || status == OfflinePackage.Status.PAUSED)
                        {
                            j3.e = OfflinePackage.Status.ERROR;
                            j3.d = j.getString(f.msg_download_canceled);
                        }
                    }
                }
            } while (true);
            offlinepackage.e();
            offlinepackage.a(false);
            if (offlinepackage.c == OfflinePackage.Status.DOWNLOADED)
            {
                offlinepackage = offlinepackage.d.iterator();
                do
                {
                    if (!offlinepackage.hasNext())
                    {
                        break;
                    }
                    com.google.android.libraries.translate.offline.j j2 = (com.google.android.libraries.translate.offline.j)offlinepackage.next();
                    if (j2.e == OfflinePackage.Status.DOWNLOADED && j2.b())
                    {
                        long l1 = j2.j;
                        PackageProcessService.a(j, l1);
                    }
                } while (true);
            } else
            if (offlinepackage.c == OfflinePackage.Status.DOWNLOADED_POST_PROCESSED)
            {
                offlinepackage.j.a(offlinepackage);
            }
            // fall through

        case 1: // '\001'
        case 2: // '\002'
            return;
        }
    }

}
