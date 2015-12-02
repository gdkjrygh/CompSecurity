// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.qihoo.security.clearengine.TrashType;
import com.qihoo.security.opti.trashclear.b;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashClearCategory;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import com.qihoo360.mobilesafe.share.SharedPref;
import com.qihoo360.mobilesafe.support.a;
import java.text.Collator;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            TrashItemInfo, i, e

public class d
{
    class a
    {

        public int a;
        public int b;
        public int c;
        public long d;
        final d e;

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("clearListLevelOneData [selectedCount=");
            stringbuilder.append(a);
            stringbuilder.append(", lockedCount=");
            stringbuilder.append(b);
            stringbuilder.append(", totalCount=");
            stringbuilder.append(c);
            stringbuilder.append(", totalLength=");
            stringbuilder.append(d);
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        a()
        {
            e = d.this;
            super();
            a = 0;
            b = 0;
            c = 0;
            d = 0L;
        }
    }


    public static NumberFormat a;
    private static final int ai[] = {
        0x7f0b00e2, 0x7f0b00e5, 0x7f0b00e6, 0x7f0b00e4, 0x7f0b00e3, 0x7f0b00f5, 0x7f0b00e7, 0x7f0b00e8
    };
    private static final int aj[] = {
        0x7f0b00e1, 0x7f0b00e9, 0x7f0b00e2, 0x7f0b00e5, 0x7f0b00e6, 0x7f0b00e4, 0x7f0b00e3, 0x7f0b00f5, 0x7f0b00e7, 0x7f0b00e8
    };
    private static Map e = null;
    private final List A = null;
    private long B;
    private long C;
    private final long D = 0L;
    private final long E = 0L;
    private final long F = 0L;
    private final long G = 0L;
    private final long H = 0L;
    private final long I = 0L;
    private final long J = 0L;
    private final long K = 0L;
    private final long L = 0L;
    private final int M = 0;
    private final int N = 0;
    private final int O = 0;
    private final int P = 0;
    private final int Q = 0;
    private final int R = 0;
    private final int S = 0;
    private final int T = 0;
    private final int U = 0;
    private final int V = 0;
    private final int W = 0;
    private final int X = 0;
    private final int Y = 0;
    private final int Z = 0;
    private final int aa = 0;
    private final int ab = 0;
    private final int ac = 0;
    private final int ad = 0;
    private final boolean ae = false;
    private final boolean af = false;
    private final boolean ag = false;
    private final Map ah = new HashMap();
    private boolean ak;
    private final ArrayList al = new ArrayList();
    private List am;
    private final Map an = new HashMap();
    private final Map ao = new HashMap();
    private final List ap = new ArrayList();
    private final Map aq = new HashMap();
    private final Map ar = new HashMap();
    private final Map as = new HashMap();
    private final List at = new ArrayList();
    private long au;
    private long av;
    private final Comparator aw = new Comparator() {

        final d a;
        private final Collator b = Collator.getInstance();

        public int a(TrashItemInfo trashiteminfo, TrashItemInfo trashiteminfo1)
        {
            if (trashiteminfo.size < trashiteminfo1.size)
            {
                return 1;
            }
            if (trashiteminfo.size > trashiteminfo1.size)
            {
                return -1;
            }
            String s2 = trashiteminfo.name;
            String s1 = trashiteminfo1.name;
            trashiteminfo = s2;
            if (s2 == null)
            {
                trashiteminfo = "";
            }
            trashiteminfo1 = s1;
            if (s1 == null)
            {
                trashiteminfo1 = "";
            }
            return b.compare(trashiteminfo, trashiteminfo1);
        }

        public int compare(Object obj, Object obj1)
        {
            return a((TrashItemInfo)obj, (TrashItemInfo)obj1);
        }

            
            {
                a = d.this;
                super();
            }
    };
    private com.qihoo.security.locale.d b;
    private Context c;
    private final int d = 0;
    private final List f = new ArrayList();
    private Map g;
    private final Map h = new HashMap();
    private TrashItemInfo i;
    private final Map j = new HashMap();
    private final Map k = new HashMap();
    private final int l = 0;
    private final int m = -1;
    private final int n = -1;
    private final TrashItemInfo o = null;
    private final TrashClearCategory p[] = null;
    private final ArrayList q = null;
    private ArrayList r;
    private ArrayList s;
    private final HashMap t = null;
    private List u;
    private List v;
    private List w;
    private boolean x;
    private boolean y;
    private boolean z;

    public d(Context context)
    {
        b = null;
        c = null;
        g = null;
        i = new TrashItemInfo();
        r = null;
        s = null;
        u = null;
        v = null;
        w = null;
        x = false;
        y = false;
        z = false;
        B = 0L;
        C = 0L;
        ak = false;
        am = new ArrayList();
        au = 0L;
        av = 0L;
        c = context;
        b = com.qihoo.security.locale.d.a();
        ak = com.qihoo360.mobilesafe.support.a.c(c);
        w = new ArrayList();
        g = new HashMap();
        e = new HashMap();
        j();
    }

    private String a(TrashType trashtype, int i1, TrashItemInfo trashiteminfo, boolean flag, String s1, int j1, int k1)
    {
        i1;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 35
    //                   1 681
    //                   2 726
    //                   3 751;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return s1;
_L2:
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[TrashType.values().length];
                try
                {
                    a[TrashType.CATE_SYSTEM.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[TrashType.CATE_APP_SYSTEM_CACHE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[TrashType.CATE_ADPLUGIN.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[TrashType.CATE_APK.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[TrashType.CATE_MEMORY.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[TrashType.CATE_CACHE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[TrashType.CATE_UNINSTALLED.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[TrashType.CATE_BIGFILE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (flag)
        {
            switch (com.qihoo.security.opti.trashclear.ui._cls2.a[trashtype.ordinal()])
            {
            default:
                trashiteminfo.iconId = 0x7f02005e;
                return s1;

            case 3: // '\003'
                trashiteminfo.iconId = 0x7f02005e;
                return s1;

            case 4: // '\004'
                break;
            }
            if (s1 != null)
            {
                trashiteminfo.path = s1;
                return s1;
            } else
            {
                trashiteminfo.iconId = 0x7f02005e;
                return s1;
            }
        }
        switch (com.qihoo.security.opti.trashclear.ui._cls2.a[trashtype.ordinal()])
        {
        default:
            return s1;

        case 1: // '\001'
        case 2: // '\002'
            switch (j1)
            {
            default:
                trashiteminfo.iconId = 0x7f02014c;
                return s1;

            case 368: 
                trashiteminfo.iconId = 0x7f02014c;
                trashtype = s1;
                if (s1 == null)
                {
                    trashtype = b.a(0x7f0c020d);
                }
                trashiteminfo.name = trashtype;
                return trashtype;

            case 365: 
                trashiteminfo.iconId = 0x7f020148;
                trashtype = s1;
                if (s1 == null)
                {
                    trashtype = b.a(0x7f0c0212);
                }
                trashiteminfo.name = trashtype;
                return trashtype;

            case 363: 
                trashiteminfo.iconId = 0x7f020149;
                trashtype = s1;
                if (s1 == null)
                {
                    trashtype = b.a(0x7f0c0210);
                }
                trashiteminfo.name = trashtype;
                return trashtype;

            case 364: 
                trashiteminfo.iconId = 0x7f02014a;
                trashtype = s1;
                if (s1 == null)
                {
                    trashtype = b.a(0x7f0c0211);
                }
                trashiteminfo.name = trashtype;
                return trashtype;

            case 361: 
                trashiteminfo.iconId = 0x7f02014d;
                trashtype = s1;
                if (s1 == null)
                {
                    trashtype = b.a(0x7f0c020f);
                }
                trashiteminfo.name = trashtype;
                return trashtype;

            case 362: 
                trashiteminfo.iconId = 0x7f02014e;
                trashtype = s1;
                if (s1 == null)
                {
                    trashtype = b.a(0x7f0c020e);
                }
                trashiteminfo.name = trashtype;
                return trashtype;

            case 366: 
                trashiteminfo.iconId = 0x7f02014c;
                trashtype = s1;
                if (s1 == null)
                {
                    if (k1 == 0)
                    {
                        trashtype = b.a(0x7f0c021e);
                    } else
                    if (k1 == 1)
                    {
                        trashtype = b.a(0x7f0c021f);
                    } else
                    if (k1 == 2)
                    {
                        trashtype = b.a(0x7f0c0220);
                    } else
                    if (k1 == 3)
                    {
                        trashtype = b.a(0x7f0c0221);
                    } else
                    {
                        trashtype = s1;
                        if (k1 == 4)
                        {
                            trashtype = b.a(0x7f0c022a);
                        }
                    }
                }
                trashiteminfo.name = trashtype;
                return trashtype;

            case 367: 
                trashiteminfo.iconId = 0x7f02014c;
                trashtype = s1;
                if (s1 == null)
                {
                    trashtype = b.a(0x7f0c021d);
                }
                trashiteminfo.name = trashtype;
                return trashtype;

            case 322: 
                trashiteminfo.iconId = 0x7f02014c;
                trashtype = s1;
                if (s1 == null)
                {
                    trashtype = b.a(0x7f0c020d);
                }
                s1 = trashtype;
                break;
            }
            break;

        case 3: // '\003'
            trashiteminfo.iconId = 0x7f020146;
            return s1;

        case 4: // '\004'
            trashiteminfo.iconId = 0x7f02014f;
            return s1;

        case 5: // '\005'
            trashiteminfo.iconId = 0x7f02004b;
            return s1;
        }
        if (!flag)
        {
            trashiteminfo.name = trashtype;
            return trashtype;
        }
          goto _L1
_L3:
        if (!flag)
        {
            if (s1 != null)
            {
                trashiteminfo.pkgName = s1;
                trashiteminfo.iconId = -2;
                return s1;
            } else
            {
                trashiteminfo.iconId = 0x7f020044;
                return s1;
            }
        } else
        {
            trashiteminfo.iconId = 0x7f02005e;
            return s1;
        }
_L4:
        if (flag)
        {
            trashiteminfo.iconId = 0x7f02005e;
            return s1;
        } else
        {
            trashiteminfo.iconId = 0x7f02014b;
            return s1;
        }
_L5:
        if (!flag)
        {
            if (s1 == null || s1.equals(b.a(0x7f0c0223)))
            {
                trashiteminfo.iconId = 0x7f020147;
                return s1;
            } else
            {
                trashiteminfo.pkgName = s1;
                trashiteminfo.iconId = -2;
                return s1;
            }
        } else
        {
            trashiteminfo.iconId = 0x7f020149;
            return s1;
        }
    }

    private String a(String s1)
    {
        String s2 = "";
        Object obj = s1;
        if (s1.contains("[[["))
        {
            obj = s1;
            if (s1.contains("]]]"))
            {
                Matcher matcher = Pattern.compile("\\[\\[\\[(\\d)\\]\\]\\]").matcher(s1);
                for (obj = s2; matcher.find(); obj = matcher.group(1)) { }
                s1 = s1.toString().replace("[[[", "").replace("]]]", "").replace(((CharSequence) (obj)), "");
                obj = Integer.valueOf(((String) (obj)));
                obj = (new StringBuilder()).append(s1).append(b.a(0x7f0c005f, new Object[] {
                    obj
                })).toString();
            }
        }
        return ((String) (obj));
    }

    private void a(String s1, int i1, List list)
    {
        int k1;
        int l1;
        k1 = list.size();
        l1 = ((i)u.get(i1)).b().size();
        if (k1 <= 0) goto _L2; else goto _L1
_L1:
        Map map;
        int j1;
        map = (Map)g.get(s1);
        j1 = 0;
_L4:
        if (j1 < k1)
        {
            ArrayList arraylist = new ArrayList();
            TrashItemInfo trashiteminfo = (TrashItemInfo)list.get(j1);
            String s2 = trashiteminfo.pkgName;
            if (s1.equals(l()))
            {
                s2 = trashiteminfo.name;
            } else
            if (s1.equals(b.a(0x7f0c0216)))
            {
                s2 = trashiteminfo.path;
            }
            if (s2 != null && map != null && map.containsKey(s2))
            {
                arraylist.addAll((Collection)map.get(s2));
            }
            if (arraylist.size() > 0)
            {
                a(((List) (arraylist)));
                ((TrashItemInfo)arraylist.get(arraylist.size() - 1)).lineType = 1;
                if (l1 >= 0 && j1 <= l1)
                {
                    com.qihoo.security.opti.trashclear.ui.j.a.a((i)((i)u.get(i1)).b().get(j1), arraylist, 0x7f03003f);
                }
            }
            j1++;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(List list)
    {
        list;
        JVM INSTR monitorenter ;
        Collections.sort(list, aw);
        list;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String b(String s1)
    {
        String s2 = s1;
        if (!TextUtils.isEmpty(s1))
        {
            s2 = (new StringBuilder()).append(s1.substring(0, 1).toUpperCase(Locale.US)).append(s1.substring(1)).toString();
        }
        return s2;
    }

    private void j()
    {
        if (SharedPref.b(c, "clear_timestamp", 0L) == 0L || com.qihoo.security.opti.trashclear.a.a == null)
        {
            com.qihoo.security.opti.trashclear.a.a();
            com.qihoo.security.opti.trashclear.a.c();
        }
        k();
    }

    private void k()
    {
        Object obj;
        Object obj1;
        String s2;
        String s3;
        String as2[];
        String as3[];
        String s4;
        int j1;
        int k1;
label0:
        {
            String s1 = SharedPref.b(c, "clear_title_id", null);
            obj = com.qihoo.security.opti.trashclear.a.a;
            s3 = SharedPref.b(c, "clear_up", null);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                s2 = s1;
                if (!TextUtils.isEmpty(s1))
                {
                    break label0;
                }
            }
            obj = b.a(0x7f0c01f0);
            s2 = b.a(0x7f0c01f1);
            SharedPref.a(c, "clear_langue", null);
            SharedPref.a(c, "clear_title_id", null);
            SharedPref.a(c, "clear_timestamp", 0L);
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_921;
        }
        as2 = ((String) (obj)).split("#");
        as3 = new String[as2.length];
        if (as2 != null && as2.length > 0)
        {
            for (int i1 = 0; i1 < as2.length; i1++)
            {
                as3[i1] = as2[i1].split(":")[0];
            }

        }
        s4 = com.qihoo.security.locale.d.a(c);
        k1 = as2.length;
        obj1 = null;
        j1 = 0;
_L6:
        if (j1 >= k1) goto _L2; else goto _L1
_L1:
        if (!as3[j1].contains(s4)) goto _L4; else goto _L3
_L3:
        obj = as2[j1];
        j1 = 1;
_L7:
        String as1[];
        int l1;
        int i2;
        if (j1 != 0)
        {
            obj1 = obj;
        }
        obj = ((String) (obj1)).split(":")[1].split(";");
          goto _L5
_L4:
        if (as2[j1].contains("en:"))
        {
            obj1 = as2[j1];
        }
        j1++;
          goto _L6
_L5:
        if (!TextUtils.isEmpty(s2))
        {
            obj1 = s2.split(";");
            l1 = obj1.length;
            for (j1 = 0; j1 < l1; j1++)
            {
                as1 = obj1[j1].split("-");
                an.put(Integer.valueOf(as1[0]), Integer.valueOf(as1[1]));
            }

        }
        if (ap != null)
        {
            ap.add(l());
            aq.put(l(), b.a(0x7f0c024b));
            as.put(l(), Integer.valueOf(0));
        }
        if (obj != null)
        {
            for (j1 = 0; j1 < obj.length; j1++)
            {
                obj1 = obj[j1].split("-");
                as1 = obj1[1].split("\\^");
                ao.put(Integer.valueOf(obj1[0]), as1);
                ap.add(as1[0]);
                aq.put(as1[0], as1[1]);
                ar.put(as1[0], as1[2]);
                at.add(as1[0]);
                as.put(as1[0], Integer.valueOf(1));
            }

        }
        if (ap != null)
        {
            ap.add(b.a(0x7f0c0248));
            aq.put(b.a(0x7f0c0248), b.a(0x7f0c0249));
            as.put(b.a(0x7f0c0248), Integer.valueOf(1));
            ap.add(b.a(0x7f0c005b));
            aq.put(b.a(0x7f0c005b), b.a(0x7f0c024c));
            as.put(b.a(0x7f0c005b), Integer.valueOf(2));
        }
        if (!TextUtils.isEmpty(s3))
        {
            obj = s3.split(";");
            if (obj != null && obj.length > 0)
            {
                am = Arrays.asList(((Object []) (obj)));
                if (am != null && am.size() > 0)
                {
                    obj = new ArrayList();
                    l1 = am.size();
                    for (j1 = 0; j1 < l1; j1++)
                    {
                        i2 = Integer.valueOf((String)am.get(j1)).intValue();
                        obj1 = ((String[])ao.get(Integer.valueOf(i2)))[0];
                        ((List) (obj)).add(obj1);
                        if (ap.contains(obj1))
                        {
                            ap.remove(obj1);
                            at.remove(obj1);
                        }
                    }

                    ((List) (obj)).addAll(ap);
                    ap.clear();
                    ap.addAll(((Collection) (obj)));
                    ((List) (obj)).clear();
                }
            }
        }
        return;
_L2:
        j1 = 0;
          goto _L7
        obj = null;
          goto _L5
    }

    private String l()
    {
        return (new StringBuilder()).append(b(Build.BRAND)).append(" ").append(b.a(0x7f0c005d)).toString();
    }

    public int a(TrashType trashtype)
    {
        switch (com.qihoo.security.opti.trashclear.ui._cls2.a[trashtype.ordinal()])
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        default:
            return 0;

        case 6: // '\006'
            return 1;

        case 7: // '\007'
            return 2;

        case 8: // '\b'
            return 3;
        }
    }

    public TrashItemInfo a(TrashType trashtype, TrashInfo trashinfo)
    {
        Object obj;
        Object obj2;
        TrashItemInfo trashiteminfo;
        String s1;
        ArrayList arraylist1;
        int i1;
        int l1;
        int k3;
        long l3;
label0:
        {
            System.currentTimeMillis();
            trashiteminfo = new TrashItemInfo();
            arraylist1 = new ArrayList();
            i1 = 10;
            if (trashinfo.bundle.containsKey("dbType"))
            {
                i1 = ((Integer)trashinfo.bundle.get("dbType")).intValue();
            }
            s1 = a(trashtype, i1);
            k3 = a(trashtype);
            obj2 = trashinfo.packageName;
            boolean flag = false;
            if (trashtype != TrashType.CATE_BIGFILE && trashtype != TrashType.CATE_CACHE && trashtype != TrashType.CATE_APK && trashtype != TrashType.CATE_ADPLUGIN && trashtype != TrashType.CATE_UNINSTALLED)
            {
                i1 = ((flag) ? 1 : 0);
                if (trashtype != TrashType.CATE_SYSTEM)
                {
                    break label0;
                }
                i1 = ((flag) ? 1 : 0);
                if (!trashinfo.bundle.containsKey("subList"))
                {
                    break label0;
                }
            }
            i1 = 1;
        }
        l1 = 0;
        l3 = 0L;
        obj = "";
        trashinfo.clearType;
        JVM INSTR tableswitch 0 2: default 188
    //                   0 683
    //                   1 697
    //                   2 711;
           goto _L1 _L2 _L3 _L4
_L1:
        ArrayList arraylist;
        arraylist = new ArrayList();
        arraylist.add(trashinfo);
        trashiteminfo.name = trashinfo.desc;
        trashiteminfo.rootTitle = s1;
        trashiteminfo.desc = ((String) (obj));
        trashiteminfo.size = trashinfo.size;
        trashiteminfo.oraginalData = arraylist;
        trashiteminfo.lineType = 2;
        trashiteminfo.TrashType = k3;
        trashiteminfo.level = 2;
        if (trashtype != TrashType.CATE_APK);
        if (k3 != 0);
        if (!i1) goto _L6; else goto _L5
_L5:
        Object obj3;
        obj3 = new HashMap();
        if (g.containsKey(s1))
        {
            obj3 = (Map)g.get(s1);
        }
        if (k3 != 3 && obj2 != null && ((Map) (obj3)).containsKey(obj2))
        {
            arraylist1.addAll((List)((Map) (obj3)).get(obj2));
        }
        if (k3 != 3) goto _L8; else goto _L7
_L2:
        obj = b.a(0x7f0c022c);
          goto _L1
_L3:
        obj = b.a(0x7f0c022b);
          goto _L1
_L4:
        obj = null;
          goto _L1
_L7:
        {
            trashiteminfo.isExpand = 2;
            obj = b.a(0x7f0c0223);
            Object obj1;
            ArrayList arraylist2;
            int j1;
            int k1;
            int i2;
            if (trashinfo.isInWhiteList)
            {
                j1 = 0;
                k1 = 1;
                l1 = 3;
            } else
            {
                a(trashinfo.size);
                b(trashinfo);
                j1 = 1;
                k1 = 0;
                l1 = 0;
            }
            i2 = 1;
            l3 = 0L + trashinfo.size;
            B = B + trashinfo.size;
            arraylist2 = new ArrayList();
            arraylist2.add(trashinfo);
            trashiteminfo.oraginalData = arraylist2;
            trashiteminfo.checkStatus = l1;
            Object obj4;
            TrashItemInfo trashiteminfo1;
            int j2;
            int k2;
            int l2;
            int i3;
            int j3;
            long l4;
            long l5;
            if (trashinfo.bundle.containsKey("comeFormPath"))
            {
                obj1 = trashinfo.bundle.getString("comeFormPath");
                obj2 = trashinfo.bundle.getString("comeFormPathDesc");
                obj = obj2;
                if (obj2 == null)
                {
                    obj = b.a(0x7f0c0216);
                }
                obj2 = b.a(0x7f0c0224, new Object[] {
                    trashinfo.bundle.getString("src")
                });
                trashiteminfo.bigFileFrom = trashinfo.bundle.getString("src");
                trashiteminfo.desc = ((String) (obj2));
            } else
            {
                obj1 = "bigfile_default";
            }
            trashiteminfo.name = ((String) (obj));
            trashiteminfo.path = ((String) (obj1));
            if (obj1 != null && ((Map) (obj3)).containsKey(obj1))
            {
                arraylist1.addAll((List)((Map) (obj3)).get(obj1));
            }
            obj2 = trashiteminfo.clone();
            obj2.isExpand = 0;
            obj2.oraginalData = arraylist;
            obj2.level = 3;
            obj2.desc = null;
            obj2.name = trashinfo.desc;
            a(trashtype, k3, ((TrashItemInfo) (obj2)), true, trashinfo.packageName, trashinfo.type, -1);
            if (((TrashItemInfo) (obj2)).size == 0L)
            {
                return null;
            }
            if (!trashinfo.isInWhiteList)
            {
                f.add(obj2);
            }
            arraylist1.add(obj2);
            if (h.containsKey(obj1))
            {
                i = (TrashItemInfo)h.get(obj1);
                if (i.checkStatus == 0 && l1 == 3)
                {
                    trashiteminfo.checkStatus = 0;
                }
                arraylist2.addAll(i.oraginalData);
                trashiteminfo.oraginalData = arraylist2;
                trashiteminfo.size = i.size + trashinfo.size;
                l1 = i.keepCount;
            } else
            {
                l1 = 0;
            }
            if (trashinfo.clearType == 2);
            trashiteminfo.keepCount = 1 - k1;
            obj2 = trashinfo.packageName;
            if (((String) (obj)).equals(b.a(0x7f0c0223)))
            {
                obj2 = b.a(0x7f0c0223);
            }
            a(trashtype, k3, trashiteminfo, false, ((String) (obj2)), trashinfo.type, -1);
            h.put(obj, trashiteminfo);
            ((Map) (obj3)).put(obj1, arraylist1);
            l1 = i2;
        }
        g.put(s1, obj3);
        i2 = l1;
        l1 = k1;
        k1 = j1;
          goto _L9
_L8:
        if (!trashinfo.bundle.containsKey("subList")) goto _L11; else goto _L10
_L10:
        trashiteminfo.isExpand = 2;
        arraylist2 = (ArrayList)trashinfo.bundle.get("subList");
        trashiteminfo.oraginalData = arraylist2;
        if (k3 != 0);
        if (k3 == 2 && !trashinfo.bundle.containsKey("dbType"))
        {
            trashiteminfo.name = b.a(0x7f0c0229);
        }
        j3 = arraylist2.size();
        l4 = 0L;
        if (k3 == 0)
        {
            arraylist = new ArrayList();
        } else
        {
            arraylist = null;
        }
        i2 = 0;
        i3 = 0;
        j2 = j3;
        k1 = 0;
        obj = obj2;
        j1 = 0;
        if (i3 >= j3) goto _L13; else goto _L12
_L12:
        obj4 = (TrashInfo)arraylist2.get(i3);
        if (((TrashInfo) (obj4)).clearType == 2) goto _L15; else goto _L14
_L14:
        j2--;
        l2 = i2;
        i2 = k1;
        k2 = j1;
        k1 = l1;
        j1 = j2;
_L18:
        i3++;
        j2 = j1;
        l1 = k1;
        j1 = k2;
        k1 = i2;
        i2 = l2;
        break MISSING_BLOCK_LABEL_1132;
_L15:
        if (!"QQ/db".equals(((TrashInfo) (obj4)).path));
        B = B + ((TrashInfo) (obj4)).size;
        if (((TrashInfo) (obj4)).isInWhiteList)
        {
            k1++;
            l2 = i2 + 1;
            i2 = k1;
            k2 = j1;
        } else
        {
            a(((TrashInfo) (obj4)).size);
            b(obj4);
            k2 = j1 + 1;
            l2 = i2;
            i2 = k1;
        }
        j1 = l1 + 1;
        l3 += ((TrashInfo) (obj4)).size;
        obj1 = obj;
        if (obj == null)
        {
            if (k3 == 0)
            {
                obj1 = trashinfo.desc;
            } else
            {
                if (((TrashInfo) (obj4)).packageName == null)
                {
                    obj = trashinfo.desc;
                } else
                {
                    obj = ((TrashInfo) (obj4)).packageName;
                }
                obj1 = obj;
            }
        }
        trashiteminfo1 = new TrashItemInfo();
        obj2 = ((TrashInfo) (obj4)).desc;
        if (k3 != 0) goto _L17; else goto _L16
_L16:
        System.currentTimeMillis();
        obj = ((TrashInfo) (obj4)).packageName;
        obj2 = obj;
_L35:
        obj = obj2;
        l5 = l4;
        if (arraylist != null)
        {
            arraylist.add(((TrashInfo) (obj4)).desc);
            l5 = ((TrashInfo) (obj4)).size + l4;
            obj = obj2;
        }
_L19:
        trashiteminfo1.name = ((String) (obj));
        trashiteminfo1.rootTitle = s1;
        a(trashtype, k3, trashiteminfo1, true, ((TrashInfo) (obj4)).packageName, ((TrashInfo) (obj4)).type, -1);
        trashiteminfo1.size = ((TrashInfo) (obj4)).size;
        trashiteminfo1.TrashType = k3;
        trashiteminfo1.isExpand = 0;
        if (((TrashInfo) (obj4)).isInWhiteList)
        {
            if (k3 != 0)
            {
                trashiteminfo1.checkStatus = 3;
            } else
            {
                trashiteminfo1.checkStatus = 0;
            }
        } else
        {
            trashiteminfo1.checkStatus = 0;
        }
        trashiteminfo1.lineType = 2;
        trashiteminfo1.level = 3;
        obj = new ArrayList();
        ((List) (obj)).add(obj4);
        trashiteminfo1.oraginalData = ((List) (obj));
        if (trashiteminfo1.size == 0L)
        {
            l1 = j2 - 1;
            k1 = j1;
            j1 = l1;
            obj = obj1;
            l4 = l5;
        } else
        {
            if (!((TrashInfo) (obj4)).isInWhiteList)
            {
                f.add(trashiteminfo1);
            }
            arraylist1.add(trashiteminfo1);
            k1 = j1;
            j1 = j2;
            obj = obj1;
            l4 = l5;
        }
          goto _L18
_L17:
        if (k3 == 2)
        {
            if (!trashinfo.bundle.containsKey("dbType"))
            {
                obj = b.a(0x7f0c0222);
                l5 = l4;
            } else
            {
                obj = obj2;
                l5 = l4;
                if (((TrashInfo) (obj4)).dataType == 8)
                {
                    obj = b.a(0x7f0c021c);
                    l5 = l4;
                }
            }
        } else
        {
            obj = obj2;
            l5 = l4;
            if (k3 == 1)
            {
                obj = a(((String) (obj2)));
                l5 = l4;
            }
        }
          goto _L19
_L13:
        if (j2 == 0)
        {
            return null;
        }
        if (i2 == j2)
        {
            i2 = 3;
        } else
        {
            i2 = 0;
        }
        if (k3 != 0) goto _L21; else goto _L20
_L20:
        trashinfo = a(trashtype, k3, trashiteminfo, false, null, trashinfo.type, -1);
        obj = trashinfo;
        if (arraylist == null) goto _L23; else goto _L22
_L22:
        if (arraylist.size() == 1)
        {
            if (TextUtils.isEmpty((CharSequence)arraylist.get(0)))
            {
                break MISSING_BLOCK_LABEL_3319;
            }
            trashtype = b.a(0x7f0c0241, new Object[] {
                arraylist.get(0)
            });
        } else
        {
            if (TextUtils.isEmpty((CharSequence)arraylist.get(0)) || TextUtils.isEmpty((CharSequence)arraylist.get(1)))
            {
                break MISSING_BLOCK_LABEL_3319;
            }
            trashtype = (new StringBuilder()).append((String)arraylist.get(0)).append(b.a(0x7f0c0235)).append((String)arraylist.get(1)).toString();
            trashtype = b.a(0x7f0c0241, new Object[] {
                trashtype
            });
        }
_L36:
        trashiteminfo.systemDialogTitle = trashtype;
        trashiteminfo.systemDialogSize = l4;
        obj = trashinfo;
_L23:
        ((Map) (obj3)).put(obj, arraylist1);
        trashiteminfo.size = l3;
        trashiteminfo.pkgName = ((String) (obj));
        trashiteminfo.checkStatus = i2;
        trashiteminfo.keepCount = l1 - k1;
        break MISSING_BLOCK_LABEL_969;
_L21:
        obj2 = trashinfo.packageName;
        obj1 = obj2;
        if (obj2 == null)
        {
            try
            {
                obj1 = ((ArrayList)trashinfo.bundle.get("pkgList")).get(0).toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                obj1 = obj2;
            }
        }
        a(trashtype, k3, trashiteminfo, false, ((String) (obj1)), trashinfo.type, -1);
        if (true) goto _L23; else goto _L11
_L11:
        if (trashinfo.isInWhiteList)
        {
            j1 = 0;
            k1 = 1;
            l1 = 3;
        } else
        {
            a(trashinfo.size);
            b(trashinfo);
            j1 = 1;
            k1 = 0;
            l1 = 0;
        }
        i2 = 1;
        l3 = 0L + trashinfo.size;
        B = B + trashinfo.size;
        arraylist2 = new ArrayList();
        arraylist2.add(trashinfo);
        trashiteminfo.oraginalData = arraylist2;
        trashiteminfo.checkStatus = l1;
        obj1 = obj2;
        if (obj2 == null)
        {
            obj1 = trashinfo.path;
        }
        trashiteminfo.isExpand = 2;
        obj4 = trashiteminfo.clone();
        obj4.pkgName = ((String) (obj1));
        if (trashtype == TrashType.CATE_APK)
        {
            a(trashtype, k3, ((TrashItemInfo) (obj4)), true, trashinfo.path, trashinfo.type, -1);
        } else
        {
            a(trashtype, k3, ((TrashItemInfo) (obj4)), true, trashinfo.packageName, trashinfo.type, -1);
        }
        obj4.isExpand = 0;
        obj4.oraginalData = arraylist;
        obj4.level = 3;
        if (trashtype != TrashType.CATE_APK)
        {
            break MISSING_BLOCK_LABEL_2689;
        }
        obj2 = b.a(0x7f0c000d);
        trashiteminfo.name = ((String) (obj2));
        obj = "";
        trashinfo.dataType;
        JVM INSTR tableswitch 0 8: default 2300
    //                   0 2410
    //                   1 2441
    //                   2 2472
    //                   3 2503
    //                   4 2534
    //                   5 2565
    //                   6 2596
    //                   7 2627
    //                   8 2658;
           goto _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33
_L24:
        obj4.desc = ((String) (obj));
        obj4.name = trashinfo.desc;
        obj = obj2;
_L34:
        if (obj != null && ((Map) (obj3)).containsKey(obj))
        {
            arraylist1.addAll((List)((Map) (obj3)).get(obj));
        }
        if (((TrashItemInfo) (obj4)).size == 0L)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_2716;
_L25:
        obj = b.a(0x7f0c0225, new Object[] {
            b.a(0x7f0c00ef)
        });
          goto _L24
_L26:
        obj = b.a(0x7f0c0225, new Object[] {
            b.a(0x7f0c0219)
        });
          goto _L24
_L27:
        obj = b.a(0x7f0c0225, new Object[] {
            b.a(0x7f0c0218)
        });
          goto _L24
_L28:
        obj = b.a(0x7f0c0225, new Object[] {
            b.a(0x7f0c000f)
        });
          goto _L24
_L29:
        obj = b.a(0x7f0c0225, new Object[] {
            b.a(0x7f0c0013)
        });
          goto _L24
_L30:
        obj = b.a(0x7f0c0225, new Object[] {
            b.a(0x7f0c0012)
        });
          goto _L24
_L31:
        obj = b.a(0x7f0c0225, new Object[] {
            b.a(0x7f0c0010)
        });
          goto _L24
_L32:
        obj = b.a(0x7f0c0225, new Object[] {
            b.a(0x7f0c021a)
        });
          goto _L24
_L33:
        obj = b.a(0x7f0c0225, new Object[] {
            b.a(0x7f0c021b)
        });
          goto _L24
        if (trashtype == TrashType.CATE_ADPLUGIN)
        {
            obj = b.a(0x7f0c005e);
            trashiteminfo.name = ((String) (obj));
        } else
        {
            obj = null;
        }
          goto _L34
        if (!trashinfo.isInWhiteList)
        {
            f.add(obj4);
        }
        arraylist1.add(obj4);
        if (trashtype == TrashType.CATE_APK || trashtype == TrashType.CATE_ADPLUGIN)
        {
            if (!TextUtils.isEmpty(((CharSequence) (obj))) && h.containsKey(obj))
            {
                i = (TrashItemInfo)h.get(obj);
                if (i.checkStatus == 0 && l1 == 3)
                {
                    trashiteminfo.checkStatus = 0;
                }
                arraylist2.addAll(i.oraginalData);
                trashiteminfo.oraginalData = arraylist2;
                trashiteminfo.size = i.size + trashinfo.size;
                trashiteminfo.keepCount = i.keepCount + (1 - k1);
            }
            h.put(obj, trashiteminfo);
            ((Map) (obj3)).put(obj, arraylist1);
        } else
        {
            ((Map) (obj3)).put(obj1, arraylist1);
        }
        if (k3 == 0)
        {
            a(trashtype, k3, trashiteminfo, false, trashinfo.desc, trashinfo.type, -1);
            l1 = i2;
        } else
        {
            a(trashtype, k3, trashiteminfo, false, trashinfo.packageName, trashinfo.type, -1);
            l1 = i2;
        }
        break MISSING_BLOCK_LABEL_969;
_L6:
        if (trashinfo.isInWhiteList)
        {
            k1 = 0;
            j1 = 1;
            l1 = 3;
        } else
        {
            a(trashinfo.size);
            b(trashinfo);
            k1 = 1;
            j1 = 0;
            l1 = 0;
        }
        j2 = 1;
        l3 = 0L + trashinfo.size;
        B = B + trashinfo.size;
        obj = trashinfo.packageName;
        if (trashtype == TrashType.CATE_APK)
        {
            obj = trashinfo.path;
        } else
        if (k3 == 0)
        {
            obj = null;
        }
        k2 = -1;
        i2 = k2;
        if (k3 == 0)
        {
            i2 = k2;
            if (trashinfo.type == 366)
            {
                i2 = trashinfo.dataType;
            }
        }
        a(trashtype, k3, trashiteminfo, false, ((String) (obj)), trashinfo.type, i2);
        trashiteminfo.pkgName = ((String) (obj2));
        trashiteminfo.checkStatus = l1;
        trashiteminfo.isExpand = 0;
        trashiteminfo.oraginalData = arraylist;
        trashiteminfo.keepCount = 1 - j1;
        l1 = j1;
        i2 = j2;
_L9:
        if (trashiteminfo.size == 0L)
        {
            return null;
        }
        if (ah.containsKey(s1))
        {
            trashtype = (a)ah.get(s1);
            trashtype.a = ((a) (trashtype)).a + k1;
            trashtype.b = ((a) (trashtype)).b + l1;
            trashtype.c = ((a) (trashtype)).c + i2;
            trashtype.d = ((a) (trashtype)).d + l3;
            ah.put(s1, trashtype);
        } else
        {
            trashtype = new a();
            trashtype.a = k1;
            trashtype.b = l1;
            trashtype.c = i2;
            trashtype.d = l3;
            ah.put(s1, trashtype);
        }
        f();
        return trashiteminfo;
        obj;
          goto _L35
        trashtype = "";
          goto _L36
    }

    public String a(int i1)
    {
        if (an.containsKey(Integer.valueOf(i1)))
        {
            i1 = ((Integer)an.get(Integer.valueOf(i1))).intValue();
            String as1[] = (String[])ao.get(Integer.valueOf(i1));
            if (as1 != null && as1.length >= 1)
            {
                return as1[0];
            }
        }
        return b.a(0x7f0c0248);
    }

    public String a(TrashType trashtype, int i1)
    {
        switch (com.qihoo.security.opti.trashclear.ui._cls2.a[trashtype.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return l();

        case 6: // '\006'
            return a(i1);

        case 7: // '\007'
            return b.a(0x7f0c005b);

        case 8: // '\b'
            return b.a(0x7f0c0216);
        }
    }

    public List a()
    {
        if (u == null)
        {
            u = new ArrayList();
        }
        return u;
    }

    public void a(int i1, long l1)
    {
        a(l1);
    }

    public void a(int i1, TrashItemInfo trashiteminfo)
    {
        String s1 = a(i1);
        ArrayList arraylist = new ArrayList();
        if (e.containsKey(s1))
        {
            arraylist.addAll((Collection)e.get(s1));
        }
        arraylist.add(trashiteminfo);
        e.put(s1, arraylist);
    }

    public void a(int i1, String s1, int j1)
    {
        if (i1 == 0)
        {
            if (!TextUtils.isEmpty(s1))
            {
                a a1 = (a)ah.get(s1);
                if (a1 != null)
                {
                    a1.a = a1.a + j1;
                    ah.put(s1, a1);
                }
            }
        } else
        if (1 == i1 && !TextUtils.isEmpty(s1))
        {
            a a2 = (a)ah.get(s1);
            if (a2 != null)
            {
                a2.a = a2.a - j1;
                ah.put(s1, a2);
                return;
            }
        }
    }

    public void a(int i1, String s1, long l1)
    {
        if (i1 == 0)
        {
            if (!TextUtils.isEmpty(s1))
            {
                a a1 = (a)ah.get(s1);
                if (a1 != null)
                {
                    a1.d = a1.d + l1;
                    ah.put(s1, a1);
                }
            }
        } else
        if (1 == i1 && !TextUtils.isEmpty(s1))
        {
            a a2 = (a)ah.get(s1);
            if (a2 != null)
            {
                a2.d = a2.d - l1;
                ah.put(s1, a2);
                return;
            }
        }
    }

    public void a(long l1)
    {
        C = C + l1;
    }

    public void a(TrashItemInfo trashiteminfo)
    {
        if (!f.contains(trashiteminfo))
        {
            f.add(trashiteminfo);
        }
    }

    public void a(TrashInfo trashinfo)
    {
        if (s == null)
        {
            s = new ArrayList();
        }
        s.add(trashinfo);
    }

    public void a(String s1, TrashItemInfo trashiteminfo)
    {
        if (ar.containsKey(s1))
        {
            trashiteminfo.desc = (String)ar.get(s1);
        }
    }

    public void a(String s1, List list)
    {
        ArrayList arraylist = new ArrayList();
        if (e.containsKey(s1))
        {
            arraylist.addAll((Collection)e.get(s1));
        }
        arraylist.addAll(list);
        e.put(s1, arraylist);
    }

    public boolean a(i i1)
    {
        if (v == null)
        {
            v = new ArrayList();
        } else
        if (v.contains(i1))
        {
            return true;
        }
        return false;
    }

    public boolean a(Object obj)
    {
        if (w == null)
        {
            w = new ArrayList();
        } else
        if (w.contains(obj))
        {
            return true;
        }
        return false;
    }

    public List b()
    {
        return w;
    }

    public void b(int i1)
    {
        if (!x && i1 == 0)
        {
            x = true;
        }
        if (!y && i1 == 1)
        {
            y = true;
        }
        if (!z && (i1 == 2 || i1 == 3))
        {
            z = true;
        }
    }

    public void b(int i1, long l1)
    {
        b(l1);
    }

    public void b(long l1)
    {
        C = C - l1;
    }

    public void b(TrashItemInfo trashiteminfo)
    {
        if (f.contains(trashiteminfo))
        {
            f.remove(trashiteminfo);
        }
    }

    public void b(i i1)
    {
        if (v == null)
        {
            v = new ArrayList();
        }
        v.add(i1);
    }

    public void b(Object obj)
    {
        if (w == null)
        {
            w = new ArrayList();
        }
        w.add(obj);
    }

    public long c()
    {
        Iterator iterator = ah.entrySet().iterator();
        long l1;
        for (l1 = 0L; iterator.hasNext(); l1 = ((a)((java.util.Map.Entry)iterator.next()).getValue()).d + l1) { }
        return l1;
    }

    public void c(i i1)
    {
        if (v == null)
        {
            return;
        } else
        {
            v.remove(i1);
            return;
        }
    }

    public void c(Object obj)
    {
        if (w == null)
        {
            return;
        } else
        {
            w.remove(obj);
            return;
        }
    }

    public long d()
    {
        return C;
    }

    public long e()
    {
        return C;
    }

    public void f()
    {
    }

    public TrashItemInfo g()
    {
        return i;
    }

    public void h()
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        Object obj;
        ArrayList arraylist2;
        int i1;
        int j1;
        obj = new ArrayList();
        arraylist2 = new ArrayList();
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        int i3 = ap.size();
        j1 = 0;
        i1 = 0;
        int k1 = 0;
        while (k1 < i3) 
        {
            TrashItemInfo trashiteminfo = new TrashItemInfo();
            String s1 = (String)ap.get(k1);
            int j2;
            int l2;
            if (!ah.containsKey(s1))
            {
                l2 = j1;
                j2 = i1;
            } else
            {
                trashiteminfo.name = s1;
                trashiteminfo.desc = (String)aq.get(s1);
                a a1 = (a)ah.get(s1);
                trashiteminfo.size = a1.d;
                trashiteminfo.data = (List)e.get(s1);
                j2 = i1;
                l2 = j1;
                if (a1.c > 0)
                {
                    if (a1.b == a1.c)
                    {
                        trashiteminfo.checkStatus = 3;
                    } else
                    if (a1.a == a1.c)
                    {
                        trashiteminfo.checkStatus = 0;
                    } else
                    if (a1.a == 0)
                    {
                        trashiteminfo.checkStatus = 1;
                    } else
                    if (a1.a + a1.b == a1.c)
                    {
                        trashiteminfo.checkStatus = 0;
                    } else
                    {
                        trashiteminfo.checkStatus = 4;
                    }
                    trashiteminfo.isExpand = 2;
                    trashiteminfo.lineType = 1;
                    trashiteminfo.level = 1;
                    trashiteminfo.TrashType = ((Integer)as.get(s1)).intValue();
                    if (at.contains(s1))
                    {
                        arraylist2.add(trashiteminfo);
                        arraylist1.add(s1);
                    } else
                    {
                        ((List) (obj)).add(trashiteminfo);
                        i1++;
                    }
                    if (s1.equals(l()))
                    {
                        j1 = i1;
                    }
                    if (b.a(0x7f0c0248).equals(s1))
                    {
                        arraylist1.add(s1);
                    }
                    j2 = i1;
                    l2 = j1;
                }
            }
            k1++;
            i1 = j2;
            j1 = l2;
        }
        i1 = arraylist2.size();
        if (i1 != 1) goto _L2; else goto _L1
_L1:
        ((List) (obj)).addAll(j1, arraylist2);
_L4:
        j1 = ((List) (obj)).size();
        arraylist2 = new ArrayList();
        for (i1 = 0; i1 < j1; i1++)
        {
            arraylist2.add(String.valueOf(((TrashItemInfo)((List) (obj)).get(i1)).name));
        }

        break; /* Loop/switch isn't completed */
_L2:
        if (i1 > 1)
        {
            a(arraylist2);
            ((List) (obj)).addAll(j1, arraylist2);
        }
        if (true) goto _L4; else goto _L3
_L3:
        ap.clear();
        ap.addAll(arraylist2);
        u = com.qihoo.security.opti.trashclear.ui.j.a.a(((List) (obj)), 0x7f030042);
        i1 = 0;
        while (i1 < j1) 
        {
            obj = (String)ap.get(i1);
            List list = (List)e.get(obj);
            if (list != null)
            {
                int l1 = list.size();
                if (l1 > 0)
                {
                    if (arraylist1.contains(obj))
                    {
                        arraylist.addAll(list);
                    }
                    a(list);
                    f.addAll(list);
                    ((TrashItemInfo)list.get(l1 - 1)).lineType = 1;
                    com.qihoo.security.opti.trashclear.ui.j.a.a((i)u.get(i1), list, 0x7f030041);
                    a(((String) (obj)), i1, list);
                }
            }
            i1++;
        }
        if (arraylist == null || arraylist.size() < 10) goto _L6; else goto _L5
_L5:
        int i2;
        int k2;
        a(arraylist);
        arraylist1.clear();
        k2 = arraylist.size();
        i1 = 0;
        i2 = 0;
_L12:
        if (i2 >= k2) goto _L8; else goto _L7
_L7:
        obj = ((TrashItemInfo)arraylist.get(i2)).pkgName;
        if (!(obj instanceof String)) goto _L10; else goto _L9
_L9:
        obj = (String)obj;
        j1 = i1;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            j1 = i1 + 1;
            arraylist1.add(obj);
        }
        i1 = j1;
        if (j1 != 10) goto _L11; else goto _L8
_L8:
        if (arraylist1.size() == 10)
        {
            com.qihoo.security.opti.trashclear.b.a().a(arraylist1);
            return;
        } else
        {
            com.qihoo.security.opti.trashclear.b.a().a(null);
            return;
        }
_L10:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (String)obj;
        j1 = i1;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            j1 = i1 + 1;
            arraylist1.add(obj);
        }
        i1 = j1;
        if (i1 == 10) goto _L8; else goto _L11
_L11:
        i2++;
        if (true) goto _L12; else goto _L6
_L6:
        com.qihoo.security.opti.trashclear.b.a().a(null);
        return;
    }

    public List i()
    {
        if (w == null)
        {
            return null;
        }
        if (r == null)
        {
            r = new ArrayList();
        } else
        {
            r.clear();
        }
        if (w.size() > 0)
        {
            Iterator iterator = w.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = iterator.next();
                if (obj instanceof TrashInfo)
                {
                    r.add((TrashInfo)obj);
                    com.qihoo.security.opti.trashclear.ui.e.a((TrashInfo)obj);
                } else
                if (obj instanceof List)
                {
                    r.addAll((List)obj);
                }
            } while (true);
        }
        return r;
    }

    static 
    {
        a = NumberFormat.getInstance();
        a.setMaximumFractionDigits(2);
    }
}
