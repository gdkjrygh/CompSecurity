// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.qihoo.security.clearengine.TrashType;
import com.qihoo.security.locale.d;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashClearCategory;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
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

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            TrashItemInfo, i, e

public class f
{
    class a
    {

        public int a;
        public int b;
        public int c;
        public long d;
        final f e;

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
            e = f.this;
            super();
            a = 0;
            b = 0;
            c = 0;
            d = 0L;
        }
    }


    public static NumberFormat a;
    private static final int ah[] = {
        0x7f0b00e2, 0x7f0b00e5, 0x7f0b00e6, 0x7f0b00e4, 0x7f0b00e3, 0x7f0b00f5, 0x7f0b00e7, 0x7f0b00e8
    };
    private static final int ai[] = {
        0x7f0b00e1, 0x7f0b00e9, 0x7f0b00e2, 0x7f0b00e5, 0x7f0b00e6, 0x7f0b00e4, 0x7f0b00e3, 0x7f0b00f5, 0x7f0b00e7, 0x7f0b00e8
    };
    private static Map e = null;
    private long A;
    private long B;
    private final long C = 0L;
    private final long D = 0L;
    private final long E = 0L;
    private final long F = 0L;
    private final long G = 0L;
    private final long H = 0L;
    private final long I = 0L;
    private final long J = 0L;
    private final long K = 0L;
    private final int L = 0;
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
    private final boolean ad = false;
    private final boolean ae = false;
    private final boolean af = false;
    private final Map ag = new HashMap();
    private PackageManager aj;
    private boolean ak;
    private final ArrayList al = new ArrayList();
    private final List am = new ArrayList();
    private final Map an = new HashMap();
    private final Map ao = new HashMap();
    private final List ap = new ArrayList();
    private final Map aq = new HashMap();
    private final Map ar = new HashMap();
    private final Comparator as = new Comparator() {

        final f a;
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
                a = f.this;
                super();
            }
    };
    private d b;
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
    private final TrashClearCategory o[] = null;
    private final ArrayList p = null;
    private ArrayList q;
    private ArrayList r;
    private final HashMap s = null;
    private List t;
    private List u;
    private List v;
    private boolean w;
    private boolean x;
    private boolean y;
    private final List z = null;

    public f(Context context)
    {
        b = null;
        c = null;
        g = null;
        i = new TrashItemInfo();
        q = null;
        r = null;
        t = null;
        u = null;
        v = null;
        w = false;
        x = false;
        y = false;
        A = 0L;
        B = 0L;
        aj = null;
        ak = false;
        c = context;
        aj = c.getPackageManager();
        b = com.qihoo.security.locale.d.a();
        ak = com.qihoo360.mobilesafe.support.a.c(c);
        v = new ArrayList();
        g = new HashMap();
        e = new HashMap();
        context = Arrays.asList(new String[] {
            b.a(0x7f0c0216), i(), b.a(0x7f0c003e), b.a(0x7f0c005b)
        });
        ap.addAll(context);
        aq.put(b.a(0x7f0c0216), b.a(0x7f0c024d));
        aq.put(i(), b.a(0x7f0c024b));
        aq.put(b.a(0x7f0c003e), b.a(0x7f0c024e));
        aq.put(b.a(0x7f0c005b), b.a(0x7f0c024c));
        ar.put(i(), Integer.valueOf(0));
        ar.put(b.a(0x7f0c005b), Integer.valueOf(2));
        ar.put(b.a(0x7f0c0216), Integer.valueOf(3));
        ar.put(b.a(0x7f0c003e), Integer.valueOf(1));
    }

    private String a(TrashType trashtype, int i1, TrashItemInfo trashiteminfo, boolean flag, String s1, int j1, int k1)
    {
        i1;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 35
    //                   1 667
    //                   2 712
    //                   3 737;
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
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[TrashType.CATE_APP_SYSTEM_CACHE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[TrashType.CATE_ADPLUGIN.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[TrashType.CATE_APK.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[TrashType.CATE_CACHE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[TrashType.CATE_UNINSTALLED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[TrashType.CATE_BIGFILE.ordinal()] = 7;
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
        String s2 = s1;
        if (!TextUtils.isEmpty(s1))
        {
            s2 = (new StringBuilder()).append(s1.substring(0, 1).toUpperCase(Locale.US)).append(s1.substring(1)).toString();
        }
        return s2;
    }

    private void a(String s1, int i1, List list)
    {
        int k1 = list.size();
        if (k1 > 0)
        {
            Map map = (Map)g.get(s1);
            int j1 = 0;
            while (j1 < k1) 
            {
                ArrayList arraylist = new ArrayList();
                TrashItemInfo trashiteminfo = (TrashItemInfo)list.get(j1);
                String s2 = trashiteminfo.pkgName;
                if (s1.equals(i()))
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
                    com.qihoo.security.opti.trashclear.ui.j.a.a((i)((i)t.get(i1)).b().get(j1), arraylist, 0x7f03003f);
                }
                j1++;
            }
        }
    }

    private void a(List list)
    {
        list;
        JVM INSTR monitorenter ;
        Collections.sort(list, as);
        list;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String i()
    {
        return (new StringBuilder()).append(a(Build.BRAND)).append(" ").append(b.a(0x7f0c0251)).toString();
    }

    public int a(TrashType trashtype)
    {
        switch (com.qihoo.security.opti.trashclear.ui._cls2.a[trashtype.ordinal()])
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        default:
            return 0;

        case 5: // '\005'
            return 1;

        case 6: // '\006'
            return 2;

        case 7: // '\007'
            return 3;
        }
    }

    public TrashItemInfo a(TrashType trashtype, TrashInfo trashinfo)
    {
        Object obj;
        Object obj1;
        TrashItemInfo trashiteminfo;
        String s2;
        ArrayList arraylist1;
        int i1;
        int k1;
        int i3;
        long l3;
label0:
        {
            trashiteminfo = new TrashItemInfo();
            arraylist1 = new ArrayList();
            i1 = 10;
            if (trashinfo.bundle.containsKey("dbType"))
            {
                i1 = ((Integer)trashinfo.bundle.get("dbType")).intValue();
            }
            s2 = a(trashtype, i1);
            i3 = a(trashtype);
            obj1 = trashinfo.packageName;
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
        k1 = 0;
        l3 = 0L;
        obj = "";
        trashinfo.clearType;
        JVM INSTR tableswitch 0 2: default 184
    //                   0 371
    //                   1 385
    //                   2 399;
           goto _L1 _L2 _L3 _L4
_L1:
        ArrayList arraylist;
        arraylist = new ArrayList();
        arraylist.add(trashinfo);
        trashiteminfo.name = trashinfo.desc;
        trashiteminfo.rootTitle = s2;
        trashiteminfo.desc = ((String) (obj));
        trashiteminfo.size = trashinfo.size;
        trashiteminfo.oraginalData = arraylist;
        trashiteminfo.lineType = 2;
        trashiteminfo.TrashType = i3;
        trashiteminfo.level = 2;
        if (i3 != 1);
        if (i3 != 0);
        if (!i1) goto _L6; else goto _L5
_L5:
        Object obj3;
        obj3 = new HashMap();
        if (g.containsKey(s2))
        {
            obj3 = (Map)g.get(s2);
        }
        if (i3 != 3 && obj1 != null && ((Map) (obj3)).containsKey(obj1))
        {
            arraylist1.addAll((List)((Map) (obj3)).get(obj1));
        }
        if (i3 != 3) goto _L8; else goto _L7
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
            if (trashinfo.clearType == 2)
            {
                return null;
            }
            trashiteminfo.isExpand = 2;
            obj1 = b.a(0x7f0c0223);
            Exception exception;
            Object obj2;
            ArrayList arraylist2;
            Object obj4;
            TrashItemInfo trashiteminfo1;
            int j1;
            int l1;
            int i2;
            int j2;
            int k2;
            int l2;
            long l4;
            long l5;
            if (trashinfo.isInWhiteList)
            {
                j1 = 1;
                k1 = 3;
            } else
            {
                j1 = 0;
                k1 = 1;
            }
            l1 = 1;
            l3 = 0L + trashinfo.size;
            A = A + trashinfo.size;
            arraylist2 = new ArrayList();
            arraylist2.add(trashinfo);
            trashiteminfo.oraginalData = arraylist2;
            trashiteminfo.checkStatus = k1;
            if (trashinfo.bundle.containsKey("comeFormPath"))
            {
                String s1 = trashinfo.bundle.getString("comeFormPath");
                obj1 = trashinfo.bundle.getString("comeFormPathDesc");
                obj = obj1;
                if (obj1 == null)
                {
                    obj = b.a(0x7f0c0216);
                }
                obj1 = b.a(0x7f0c0224, new Object[] {
                    trashinfo.bundle.getString("src")
                });
                trashiteminfo.bigFileFrom = trashinfo.bundle.getString("src");
                trashiteminfo.desc = ((String) (obj1));
                obj1 = obj;
                obj = s1;
            } else
            {
                obj = "bigfile_default";
            }
            trashiteminfo.name = ((String) (obj1));
            trashiteminfo.path = ((String) (obj));
            if (obj != null && ((Map) (obj3)).containsKey(obj))
            {
                arraylist1.addAll((List)((Map) (obj3)).get(obj));
            }
            obj2 = trashiteminfo.clone();
            obj2.isExpand = 0;
            obj2.oraginalData = arraylist;
            obj2.level = 3;
            obj2.desc = null;
            obj2.name = trashinfo.desc;
            a(trashtype, i3, ((TrashItemInfo) (obj2)), true, trashinfo.packageName, trashinfo.type, -1);
            if (((TrashItemInfo) (obj2)).size == 0L)
            {
                return null;
            }
            arraylist1.add(obj2);
            if (h.containsKey(obj))
            {
                i = (TrashItemInfo)h.get(obj);
                if (i.checkStatus == 1 && k1 == 3)
                {
                    trashiteminfo.checkStatus = 1;
                }
                arraylist2.addAll(i.oraginalData);
                trashiteminfo.oraginalData = arraylist2;
                trashiteminfo.size = i.size + trashinfo.size;
                k1 = i.keepCount;
            } else
            {
                k1 = 0;
            }
            if (trashinfo.clearType == 2);
            obj2 = trashinfo.packageName;
            if (((String) (obj1)).equals(b.a(0x7f0c0223)))
            {
                obj2 = b.a(0x7f0c0223);
            }
            a(trashtype, i3, trashiteminfo, false, ((String) (obj2)), trashinfo.type, -1);
            trashiteminfo.keepCount = 1 - j1;
            h.put(obj, trashiteminfo);
            ((Map) (obj3)).put(obj, arraylist1);
            k1 = l1;
        }
        g.put(s2, obj3);
          goto _L9
_L8:
        if (!trashinfo.bundle.containsKey("subList")) goto _L11; else goto _L10
_L10:
        trashiteminfo.isExpand = 2;
        arraylist2 = (ArrayList)trashinfo.bundle.get("subList");
        trashiteminfo.oraginalData = arraylist2;
        if (i3 != 1);
        if (i3 == 2 && !trashinfo.bundle.containsKey("dbType"))
        {
            trashiteminfo.name = b.a(0x7f0c0229);
        }
        l2 = arraylist2.size();
        l4 = 0L;
        if (i3 == 0)
        {
            arraylist = new ArrayList();
        } else
        {
            arraylist = null;
        }
        l1 = 0;
        k2 = 0;
        i2 = l2;
        j1 = 0;
        if (k2 >= l2) goto _L13; else goto _L12
_L12:
        obj4 = (TrashInfo)arraylist2.get(k2);
        if (((TrashInfo) (obj4)).clearType != 2) goto _L15; else goto _L14
_L14:
        i2--;
        j2 = l1;
        obj = obj1;
        l1 = j1;
        j1 = i2;
_L18:
        k2++;
        i2 = j1;
        j1 = l1;
        l1 = j2;
        obj1 = obj;
        break MISSING_BLOCK_LABEL_1076;
_L15:
        A = A + ((TrashInfo) (obj4)).size;
        if (((TrashInfo) (obj4)).isInWhiteList)
        {
            j2 = l1 + 1;
            l1 = j1 + 1;
        } else
        {
            j2 = l1;
            l1 = j1;
        }
        j1 = k1 + 1;
        l3 += ((TrashInfo) (obj4)).size;
        obj = obj1;
        if (obj1 == null)
        {
            if (i3 == 0)
            {
                obj = trashinfo.desc;
            } else
            if (((TrashInfo) (obj4)).packageName == null)
            {
                obj = trashinfo.desc;
            } else
            {
                obj = ((TrashInfo) (obj4)).packageName;
            }
        }
        trashiteminfo1 = new TrashItemInfo();
        obj2 = ((TrashInfo) (obj4)).desc;
        if (i3 != 0) goto _L17; else goto _L16
_L16:
        obj1 = ((TrashInfo) (obj4)).packageName;
        obj2 = obj1;
_L35:
        obj1 = obj2;
        l5 = l4;
        if (arraylist != null)
        {
            arraylist.add(((TrashInfo) (obj4)).desc);
            l5 = ((TrashInfo) (obj4)).size + l4;
            obj1 = obj2;
        }
_L19:
        trashiteminfo1.name = ((String) (obj1));
        trashiteminfo1.rootTitle = s2;
        a(trashtype, i3, trashiteminfo1, true, ((TrashInfo) (obj4)).packageName, ((TrashInfo) (obj4)).type, -1);
        trashiteminfo1.size = ((TrashInfo) (obj4)).size;
        trashiteminfo1.TrashType = i3;
        trashiteminfo1.isExpand = 0;
        if (((TrashInfo) (obj4)).isInWhiteList)
        {
            if (i3 != 0)
            {
                trashiteminfo1.checkStatus = 3;
            } else
            {
                trashiteminfo1.checkStatus = 1;
            }
        } else
        {
            trashiteminfo1.checkStatus = 1;
        }
        trashiteminfo1.lineType = 2;
        trashiteminfo1.level = 3;
        obj1 = new ArrayList();
        ((List) (obj1)).add(obj4);
        trashiteminfo1.oraginalData = ((List) (obj1));
        if (trashiteminfo1.size == 0L)
        {
            i2--;
            k1 = j1;
            j1 = i2;
            l4 = l5;
        } else
        {
            arraylist1.add(trashiteminfo1);
            k1 = j1;
            j1 = i2;
            l4 = l5;
        }
          goto _L18
_L17:
        obj1 = obj2;
        l5 = l4;
        if (i3 == 2)
        {
            if (!trashinfo.bundle.containsKey("dbType"))
            {
                obj1 = b.a(0x7f0c0222);
                l5 = l4;
            } else
            {
                obj1 = obj2;
                l5 = l4;
                if (((TrashInfo) (obj4)).dataType == 8)
                {
                    obj1 = b.a(0x7f0c021c);
                    l5 = l4;
                }
            }
        }
          goto _L19
_L13:
        if (i2 == 0)
        {
            return null;
        }
        if (l1 == i2)
        {
            l1 = 3;
        } else
        {
            l1 = 1;
        }
        if (arraylist1.size() == 0)
        {
            return null;
        }
        if (i3 != 0) goto _L21; else goto _L20
_L20:
        trashinfo = a(trashtype, i3, trashiteminfo, false, null, trashinfo.type, -1);
        obj1 = trashinfo;
        if (arraylist == null) goto _L23; else goto _L22
_L22:
        if (arraylist.size() == 1)
        {
            if (TextUtils.isEmpty((CharSequence)arraylist.get(0)))
            {
                break MISSING_BLOCK_LABEL_3151;
            }
            trashtype = b.a(0x7f0c0241, new Object[] {
                arraylist.get(0)
            });
        } else
        {
            if (TextUtils.isEmpty((CharSequence)arraylist.get(0)) || TextUtils.isEmpty((CharSequence)arraylist.get(1)))
            {
                break MISSING_BLOCK_LABEL_3151;
            }
            trashtype = (new StringBuilder()).append((String)arraylist.get(0)).append(b.a(0x7f0c0235)).append((String)arraylist.get(1)).toString();
        }
_L36:
        trashiteminfo.systemDialogTitle = trashtype;
        trashiteminfo.systemDialogSize = l4;
        obj1 = trashinfo;
_L23:
        ((Map) (obj3)).put(obj1, arraylist1);
        trashiteminfo.size = l3;
        trashiteminfo.pkgName = ((String) (obj1));
        trashiteminfo.checkStatus = l1;
        trashiteminfo.keepCount = k1 - j1;
        break MISSING_BLOCK_LABEL_930;
_L21:
        obj2 = trashinfo.packageName;
        obj = obj2;
        if (obj2 == null)
        {
            try
            {
                obj = ((ArrayList)trashinfo.bundle.get("pkgList")).get(0).toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj2;
            }
        }
        a(trashtype, i3, trashiteminfo, false, ((String) (obj)), trashinfo.type, -1);
        if (true) goto _L23; else goto _L11
_L11:
        if (trashinfo.clearType == 2)
        {
            return null;
        }
        if (trashinfo.isInWhiteList)
        {
            j1 = 1;
            k1 = 3;
        } else
        {
            j1 = 0;
            k1 = 1;
        }
        l1 = 1;
        l3 = 0L + trashinfo.size;
        A = A + trashinfo.size;
        arraylist2 = new ArrayList();
        arraylist2.add(trashinfo);
        trashiteminfo.oraginalData = arraylist2;
        trashiteminfo.checkStatus = k1;
        if (obj1 == null)
        {
            obj1 = trashinfo.path;
        }
        trashiteminfo.isExpand = 2;
        obj4 = trashiteminfo.clone();
        obj4.pkgName = ((String) (obj1));
        if (trashtype == TrashType.CATE_APK)
        {
            a(trashtype, i3, ((TrashItemInfo) (obj4)), true, trashinfo.path, trashinfo.type, -1);
        } else
        {
            a(trashtype, i3, ((TrashItemInfo) (obj4)), true, trashinfo.packageName, trashinfo.type, -1);
        }
        obj4.isExpand = 0;
        obj4.oraginalData = arraylist;
        obj4.level = 3;
        if (trashtype != TrashType.CATE_APK)
        {
            break MISSING_BLOCK_LABEL_2509;
        }
        obj2 = b.a(0x7f0c000e);
        trashiteminfo.name = ((String) (obj2));
        obj = "";
        trashinfo.dataType;
        JVM INSTR tableswitch 0 8: default 2136
    //                   0 2230
    //                   1 2261
    //                   2 2292
    //                   3 2323
    //                   4 2354
    //                   5 2385
    //                   6 2416
    //                   7 2447
    //                   8 2478;
           goto _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33
_L24:
        obj4.desc = ((String) (obj));
        obj4.name = trashinfo.desc;
        obj = obj2;
_L34:
        trashiteminfo.keepCount = 1 - j1;
        if (obj != null && ((Map) (obj3)).containsKey(obj))
        {
            arraylist1.addAll((List)((Map) (obj3)).get(obj));
        }
        if (((TrashItemInfo) (obj4)).size == 0L)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_2536;
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
        arraylist1.add(obj4);
        if (trashtype == TrashType.CATE_APK || trashtype == TrashType.CATE_ADPLUGIN)
        {
            if (!TextUtils.isEmpty(((CharSequence) (obj))) && h.containsKey(obj))
            {
                i = (TrashItemInfo)h.get(obj);
                if (i.checkStatus == 1 && k1 == 3)
                {
                    trashiteminfo.checkStatus = 0;
                }
                arraylist2.addAll(i.oraginalData);
                trashiteminfo.oraginalData = arraylist2;
                trashiteminfo.size = i.size + trashinfo.size;
                trashiteminfo.keepCount = i.keepCount + (1 - j1);
            }
            h.put(obj, trashiteminfo);
            ((Map) (obj3)).put(obj, arraylist1);
        } else
        {
            ((Map) (obj3)).put(obj1, arraylist1);
        }
        if (i3 == 0)
        {
            a(trashtype, i3, trashiteminfo, false, trashinfo.desc, trashinfo.type, -1);
            k1 = l1;
        } else
        {
            a(trashtype, i3, trashiteminfo, false, trashinfo.packageName, trashinfo.type, -1);
            k1 = l1;
        }
        break MISSING_BLOCK_LABEL_930;
_L6:
        if (trashinfo.clearType == 2)
        {
            return null;
        }
        if (trashinfo.isInWhiteList)
        {
            j1 = 1;
            k1 = 3;
        } else
        {
            j1 = 0;
            k1 = 1;
        }
        i2 = 1;
        if (trashinfo.type == 362 && trashinfo.size == 0L)
        {
            A = A + 4L;
            trashiteminfo.size = 4L;
            l3 = 4L + 0L;
        } else
        {
            l3 = trashinfo.size;
            A = A + trashinfo.size;
            l3 += 0L;
        }
        obj = trashinfo.packageName;
        if (trashtype == TrashType.CATE_APK)
        {
            obj = trashinfo.path;
        } else
        if (i3 == 0)
        {
            obj = null;
        }
        j2 = -1;
        l1 = j2;
        if (i3 == 0)
        {
            l1 = j2;
            if (trashinfo.type == 366)
            {
                l1 = trashinfo.dataType;
            }
        }
        a(trashtype, i3, trashiteminfo, false, ((String) (obj)), trashinfo.type, l1);
        trashiteminfo.pkgName = ((String) (obj1));
        trashiteminfo.checkStatus = k1;
        trashiteminfo.isExpand = 0;
        trashiteminfo.oraginalData = arraylist;
        trashiteminfo.keepCount = 1 - j1;
        k1 = i2;
_L9:
        if (trashiteminfo.size == 0L)
        {
            return null;
        }
        if (ag.containsKey(s2))
        {
            trashtype = (a)ag.get(s2);
            trashtype.b = ((a) (trashtype)).b + j1;
            trashtype.c = ((a) (trashtype)).c + k1;
            trashtype.d = ((a) (trashtype)).d + l3;
            ag.put(s2, trashtype);
        } else
        {
            trashtype = new a();
            trashtype.b = j1;
            trashtype.c = k1;
            trashtype.d = l3;
            ag.put(s2, trashtype);
        }
        return trashiteminfo;
        exception;
          goto _L35
        trashtype = "";
          goto _L36
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
            return i();

        case 5: // '\005'
            return b.a(0x7f0c003e);

        case 6: // '\006'
            return b.a(0x7f0c005b);

        case 7: // '\007'
            return b.a(0x7f0c0216);
        }
    }

    public List a()
    {
        if (t == null)
        {
            t = new ArrayList();
        }
        return t;
    }

    public void a(int i1)
    {
        if (!w && i1 == 0)
        {
            w = true;
        }
        if (!x && i1 == 1)
        {
            x = true;
        }
        if (!y && (i1 == 2 || i1 == 3))
        {
            y = true;
        }
    }

    public void a(int i1, long l1)
    {
        a(l1);
    }

    public void a(int i1, String s1, int j1)
    {
        if (i1 == 0)
        {
            if (!TextUtils.isEmpty(s1))
            {
                a a1 = (a)ag.get(s1);
                if (a1 != null)
                {
                    a1.a = a1.a + j1;
                    ag.put(s1, a1);
                }
            }
        } else
        if (1 == i1 && !TextUtils.isEmpty(s1))
        {
            a a2 = (a)ag.get(s1);
            if (a2 != null)
            {
                a2.a = a2.a - j1;
                ag.put(s1, a2);
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
                a a1 = (a)ag.get(s1);
                if (a1 != null)
                {
                    a1.d = a1.d + l1;
                    ag.put(s1, a1);
                }
            }
        } else
        if (1 == i1 && !TextUtils.isEmpty(s1))
        {
            a a2 = (a)ag.get(s1);
            if (a2 != null)
            {
                a2.d = a2.d - l1;
                ag.put(s1, a2);
                return;
            }
        }
    }

    public void a(long l1)
    {
        B = B + l1;
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
        if (r == null)
        {
            r = new ArrayList();
        }
        r.add(trashinfo);
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
        if (u == null)
        {
            u = new ArrayList();
        } else
        if (u.contains(i1))
        {
            return true;
        }
        return false;
    }

    public boolean a(Object obj)
    {
        if (v == null)
        {
            v = new ArrayList();
        } else
        if (v.contains(obj))
        {
            return true;
        }
        return false;
    }

    public List b()
    {
        return v;
    }

    public void b(int i1, long l1)
    {
        b(l1);
    }

    public void b(long l1)
    {
        B = B - l1;
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
        if (u == null)
        {
            u = new ArrayList();
        }
        u.add(i1);
    }

    public void b(Object obj)
    {
        if (v == null)
        {
            v = new ArrayList();
        }
        v.add(obj);
    }

    public long c()
    {
        Iterator iterator = ag.entrySet().iterator();
        long l1;
        for (l1 = 0L; iterator.hasNext(); l1 = ((a)((java.util.Map.Entry)iterator.next()).getValue()).d + l1) { }
        return l1;
    }

    public void c(i i1)
    {
        if (u == null)
        {
            return;
        } else
        {
            u.remove(i1);
            return;
        }
    }

    public void c(Object obj)
    {
        if (v == null)
        {
            return;
        } else
        {
            v.remove(obj);
            return;
        }
    }

    public long d()
    {
        return B;
    }

    public long e()
    {
        return B;
    }

    public TrashItemInfo f()
    {
        return i;
    }

    public void g()
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        int l1 = ap.size();
        int i1 = 0;
        while (i1 < l1) 
        {
            TrashItemInfo trashiteminfo = new TrashItemInfo();
            String s2 = (String)ap.get(i1);
            if (ag.containsKey(s2))
            {
                if (!s2.equals(i()));
                trashiteminfo.name = s2;
                trashiteminfo.desc = (String)aq.get(s2);
                a a1 = (a)ag.get(s2);
                trashiteminfo.size = a1.d;
                trashiteminfo.data = (List)e.get(s2);
                if (a1.c > 0)
                {
                    if (a1.b == a1.c)
                    {
                        trashiteminfo.checkStatus = 3;
                    } else
                    if (a1.a == a1.c)
                    {
                        trashiteminfo.checkStatus = 1;
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
                    trashiteminfo.TrashType = ((Integer)ar.get(s2)).intValue();
                    arraylist.add(trashiteminfo);
                }
            }
            i1++;
        }
        l1 = arraylist.size();
        ArrayList arraylist1 = new ArrayList();
        for (int j1 = 0; j1 < l1; j1++)
        {
            arraylist1.add(String.valueOf(((TrashItemInfo)arraylist.get(j1)).name));
        }

        ap.clear();
        ap.addAll(arraylist1);
        t = com.qihoo.security.opti.trashclear.ui.j.a.a(arraylist, 0x7f030042);
        for (int k1 = ((flag) ? 1 : 0); k1 < l1; k1++)
        {
            String s1 = (String)ap.get(k1);
            List list = (List)e.get(s1);
            a(list);
            ((TrashItemInfo)list.get(list.size() - 1)).lineType = 1;
            com.qihoo.security.opti.trashclear.ui.j.a.a((i)t.get(k1), list, 0x7f030041);
            a(s1, k1, list);
        }

    }

    public List h()
    {
        if (v == null)
        {
            return null;
        }
        if (q == null)
        {
            q = new ArrayList();
        } else
        {
            q.clear();
        }
        if (v.size() > 0)
        {
            Iterator iterator = v.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = iterator.next();
                if (obj instanceof TrashInfo)
                {
                    q.add((TrashInfo)obj);
                    com.qihoo.security.opti.trashclear.ui.e.a((TrashInfo)obj);
                } else
                if (obj instanceof List)
                {
                    q.addAll((List)obj);
                }
            } while (true);
        }
        return q;
    }

    static 
    {
        a = NumberFormat.getInstance();
        a.setMaximumFractionDigits(2);
    }
}
