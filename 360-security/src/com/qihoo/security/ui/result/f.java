// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.NativeAd;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.adv.a.a;
import com.qihoo.security.adv.d;
import com.qihoo.security.adv.e;
import com.qihoo.security.appbox.core.c;
import com.qihoo.security.ui.result.card.a.b;
import com.qihoo360.common.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.qihoo.security.ui.result:
//            AdvData, d

public class f
{
    private class a
        implements Comparator
    {

        final f a;

        public int a(com.qihoo.security.ui.result.card.a a1, com.qihoo.security.ui.result.card.a a2)
        {
            if (a1.e && a2.e || !a1.e && !a2.e)
            {
                return a1.d - a2.d;
            }
            if (a1.e && !a2.e)
            {
                return -1;
            }
            return a1.e || !a2.e ? 0 : 1;
        }

        public int compare(Object obj, Object obj1)
        {
            return a((com.qihoo.security.ui.result.card.a)obj, (com.qihoo.security.ui.result.card.a)obj1);
        }

        private a()
        {
            a = f.this;
            super();
        }

    }


    public static f a = null;
    public com.qihoo.security.adv.AdvDataManager.AdvType b;
    private final Context c = SecurityApplication.a();

    private f()
    {
        b = null;
    }

    private int a(String s)
    {
        byte byte0 = 0;
        if (TextUtils.equals("clean", s))
        {
            byte0 = 3;
        } else
        {
            if (TextUtils.equals("anti_virus", s))
            {
                return 4;
            }
            if (TextUtils.equals("space_manager", s))
            {
                return 6;
            }
            if (TextUtils.equals("full_anti_virus", s))
            {
                return 8;
            }
            if (TextUtils.equals("game_booster", s))
            {
                return 11;
            }
        }
        return byte0;
    }

    public static f a()
    {
        com/qihoo/security/ui/result/f;
        JVM INSTR monitorenter ;
        f f1;
        if (a == null)
        {
            a = new f();
        }
        f1 = a;
        com/qihoo/security/ui/result/f;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public static List a(com.qihoo.security.adv.AdvDataManager.AdvType advtype, List list, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        if (list == null)
        {
            return null;
        }
        try
        {
            a(advtype, ((List) (arraylist)), list);
            advtype = arraylist.iterator();
            do
            {
                if (!advtype.hasNext())
                {
                    break;
                }
                list = (AdvData)advtype.next();
                if (((AdvData) (list)).type != 0 && ((AdvData) (list)).type != 1 && ((AdvData) (list)).type != 2)
                {
                    advtype.remove();
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (com.qihoo.security.adv.AdvDataManager.AdvType advtype) { }
        return arraylist;
    }

    private static void a(com.qihoo.security.adv.AdvDataManager.AdvType advtype, List list, List list1)
    {
        for (list1 = list1.iterator(); list1.hasNext();)
        {
            d d1 = (d)list1.next();
            if (d1.c() > 0)
            {
                AdvData advdata = new AdvData();
                advdata.pid = d1.c();
                advdata.mid = advtype.getMid();
                advdata.p1 = d1.f();
                advdata.p2 = d1.g();
                advdata.tp = d1.d();
                advdata.type = d1.a();
                if (d1.a != null)
                {
                    advdata.adid = d1.a.c();
                    advdata.title = d1.a.d();
                    advdata.des = d1.a.e();
                    if (!TextUtils.isEmpty(d1.a.h()))
                    {
                        advdata.starLevel = Float.valueOf(d1.a.h()).floatValue();
                    }
                    advdata.icon = d1.a.i();
                    advdata.creatives = d1.a.j();
                    advdata.openUrl = d1.a.l();
                    advdata.openType = d1.a.k();
                    advdata.pkg = d1.a.f();
                    advdata.c1 = d1.a.n();
                    advdata.c2 = d1.a.o();
                    advdata.c3 = d1.a.p();
                    advdata.btnDesc = d1.a.b();
                    advdata.btnName = d1.a.a();
                    advdata.size = d1.a.g();
                    advdata.installs = d1.a.m();
                } else
                if (d1.b != null)
                {
                    advdata.nativeAd = d1.b.o;
                    advdata.title = d1.b.j;
                    advdata.des = d1.b.b;
                    advdata.starLevel = d1.b.m;
                    advdata.icon = d1.b.h;
                    advdata.creatives = d1.b.e;
                    advdata.openUrl = d1.b.f;
                    advdata.openType = d1.b.g;
                    advdata.pkg = d1.b.k;
                    if (advdata.nativeAd != null)
                    {
                        advdata.btnDesc = advdata.nativeAd.i();
                        advdata.btnName = advdata.nativeAd.h();
                    }
                }
                list.add(advdata);
            }
        }

    }

    private String d(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return "booster";

        case 1: // '\001'
            return "battery_life";

        case 2: // '\002'
            return "temper";

        case 3: // '\003'
            return "clean";

        case 4: // '\004'
            return "deep_clean";

        case 5: // '\005'
            return "anti_virus";

        case 6: // '\006'
            return "full_anti_virus";
        }
    }

    private com.qihoo.security.adv.AdvDataManager.AdvType e(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return com.qihoo.security.adv.AdvDataManager.AdvType.BoosterResultAdvData;

        case 1: // '\001'
        case 2: // '\002'
            return com.qihoo.security.adv.AdvDataManager.AdvType.BatteryLifeAdvData;

        case 3: // '\003'
            return com.qihoo.security.adv.AdvDataManager.AdvType.CleanResultAdvData;

        case 4: // '\004'
            return com.qihoo.security.adv.AdvDataManager.AdvType.CleanDeepResultAdvData;

        case 5: // '\005'
            return com.qihoo.security.adv.AdvDataManager.AdvType.VirusResultAdvData;

        case 6: // '\006'
            return com.qihoo.security.adv.AdvDataManager.AdvType.VirusFullScanResultAdvData;
        }
    }

    public Map a(List list)
    {
        HashMap hashmap = new HashMap();
        if (list == null) goto _L2; else goto _L1
_L1:
        if (list.isEmpty()) goto _L2; else goto _L3
_L3:
        int l = list.size();
        int i = 0;
_L4:
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        AdvData advdata;
        int j;
        int k;
        try
        {
            advdata = (AdvData)list.get(i);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            break; /* Loop/switch isn't completed */
        }
        if (advdata == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        k = advdata.pid - 1;
        j = k;
        if (k < 0)
        {
            j = 0;
        }
        hashmap.put(Integer.valueOf(j), advdata);
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L2
_L2:
        return hashmap;
    }

    public void a(int i)
    {
        b = e(i);
        if (b != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        com.qihoo.security.adv.a.a.a().a(b);
        com.qihoo.security.adv.a.a.a().b(com.qihoo.security.adv.AdvDataManager.AdvType.FaceBookAdvData);
        obj = d(i);
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L4; else goto _L3
_L3:
        obj = com.qihoo.security.ui.result.card.a.b.a().a(((String) (obj))).entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                continue;
            }
            switch (a((String)((java.util.Map.Entry)((Iterator) (obj)).next()).getKey()))
            {
            case 11: // '\013'
                com.qihoo.security.ui.result.d.a().c();
                break;
            }
        } while (true);
          goto _L5
_L4:
        if (true) goto _L1; else goto _L5
_L5:
        Exception exception;
        exception;
    }

    public com.qihoo.security.adv.AdvDataManager.AdvType b()
    {
        return b;
    }

    public List b(int i)
    {
        ArrayList arraylist = new ArrayList();
        Object obj;
        obj = d(i);
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_144;
        }
        obj = com.qihoo.security.ui.result.card.a.b.a().a(((String) (obj))).entrySet().iterator();
_L1:
        Object obj1;
        Object obj2;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_128;
            }
            obj2 = (java.util.Map.Entry)((Iterator) (obj)).next();
            obj1 = (String)((java.util.Map.Entry) (obj2)).getKey();
            obj2 = (String)((java.util.Map.Entry) (obj2)).getValue();
            i = a(((String) (obj1)));
            obj1 = com.qihoo.security.ui.result.card.b.a(i);
        } while (obj1 == null);
        obj1.a = i;
        obj1.d = Utils.str2Int(((String) (obj2)), 0);
        arraylist.add(obj1);
          goto _L1
        Collections.sort(arraylist, new a());
        return arraylist;
        Exception exception;
        exception;
        return arraylist;
    }

    public List c(int i)
    {
        b = e(i);
        if (b != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        ArrayList arraylist = new ArrayList();
        List list = com.qihoo.security.adv.a.a.a().c(b);
        if (list != null)
        {
            try
            {
                a(b, arraylist, list);
            }
            catch (Exception exception) { }
            return arraylist;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

}
