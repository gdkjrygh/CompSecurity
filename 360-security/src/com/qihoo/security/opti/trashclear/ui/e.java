// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.clearengine.TrashType;
import com.qihoo.security.locale.d;
import com.qihoo.security.support.b;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import com.qihoo360.mobilesafe.support.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            f, d, TrashItemInfo, i

public class e
{

    public static int a = 1;
    private static f d = null;
    private static com.qihoo.security.opti.trashclear.ui.d e = null;
    private static Map g;
    private d b;
    private Context c;
    private boolean f;
    private boolean h;
    private long i;

    public e(Context context)
    {
        b = null;
        c = null;
        f = false;
        h = false;
        c = context;
        b = com.qihoo.security.locale.d.a();
        d = new f(c);
        e = new com.qihoo.security.opti.trashclear.ui.d(c);
        f = com.qihoo360.mobilesafe.support.a.c(c);
    }

    public static List a(int j)
    {
        a = j;
        if (j == 0)
        {
            return d.a();
        } else
        {
            return e.a();
        }
    }

    public static void a(TrashInfo trashinfo)
    {
        byte byte0;
        long l;
        byte0 = 1;
        long l1 = 0x40000000L;
        List list = Utils.openConfigFile(SecurityApplication.a(), "lm.dat");
        l = l1;
        if (list != null)
        {
            l = l1;
            if (list.size() > 0)
            {
                l = Utils.str2Int((String)list.get(0), 1024) * 0x100000;
            }
        }
        if (trashinfo.size < l || TextUtils.isEmpty(trashinfo.path)) goto _L2; else goto _L1
_L1:
        int j;
        if (trashinfo.clearType == 2)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        trashinfo.type;
        JVM INSTR lookupswitch 14: default 216
    //                   33: 284
    //                   34: 294
    //                   35: 289
    //                   321: 218
    //                   322: 278
    //                   323: 278
    //                   361: 278
    //                   362: 278
    //                   363: 278
    //                   364: 278
    //                   365: 278
    //                   366: 278
    //                   367: 278
    //                   368: 278;
           goto _L3 _L4 _L5 _L6 _L7 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2
_L5:
        break MISSING_BLOCK_LABEL_294;
_L7:
        break; /* Loop/switch isn't completed */
_L3:
        byte0 = 5;
_L8:
        String s;
        if (trashinfo.packageName == null)
        {
            s = "";
        } else
        {
            s = trashinfo.packageName;
        }
        com.qihoo.security.support.b.a(18016, s, trashinfo.path, (new StringBuilder()).append(trashinfo.size / 0x100000L).append("; ").append(byte0).append("; ").append(j).toString());
_L2:
        return;
_L4:
        byte0 = 2;
          goto _L8
_L6:
        byte0 = 3;
          goto _L8
        byte0 = 4;
          goto _L8
    }

    private boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = h;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public Map a()
    {
        return g;
    }

    public void a(int j, int k)
    {
        if (j == 0)
        {
            d.a(k);
            return;
        } else
        {
            e.b(k);
            return;
        }
    }

    public void a(int j, int k, long l)
    {
        if (j == 0)
        {
            d.a(k, l);
            return;
        } else
        {
            e.a(k, l);
            return;
        }
    }

    public void a(int j, int k, String s, int l)
    {
        if (j == 0)
        {
            d.a(k, s, l);
            return;
        } else
        {
            e.a(k, s, l);
            return;
        }
    }

    public void a(int j, int k, String s, long l)
    {
        if (j == 0)
        {
            d.a(k, s, l);
            return;
        } else
        {
            e.a(k, s, l);
            return;
        }
    }

    public void a(int j, TrashItemInfo trashiteminfo)
    {
        if (j == 0)
        {
            d.b(trashiteminfo);
            return;
        } else
        {
            e.b(trashiteminfo);
            return;
        }
    }

    public void a(int j, TrashInfo trashinfo)
    {
        if (j == 0)
        {
            d.a(trashinfo);
            return;
        } else
        {
            e.a(trashinfo);
            return;
        }
    }

    public void a(long l)
    {
        i = l;
    }

    public void a(Map map)
    {
        g = map;
    }

    public boolean a(int j, i k)
    {
        if (j == 0)
        {
            return d.a(k);
        } else
        {
            return e.a(k);
        }
    }

    public boolean a(int j, Object obj)
    {
        if (j == 0)
        {
            return d.a(obj);
        } else
        {
            return e.a(obj);
        }
    }

    public long b()
    {
        return i;
    }

    public List b(int j)
    {
        if (j == 0)
        {
            return d.b();
        } else
        {
            return e.b();
        }
    }

    public void b(int j, int k, long l)
    {
        if (j == 0)
        {
            d.b(k, l);
            return;
        } else
        {
            e.b(k, l);
            return;
        }
    }

    public void b(int j, TrashItemInfo trashiteminfo)
    {
        if (j == 0)
        {
            d.a(trashiteminfo);
            return;
        } else
        {
            e.a(trashiteminfo);
            return;
        }
    }

    public void b(int j, i k)
    {
        if (j == 0)
        {
            d.b(k);
            return;
        } else
        {
            e.b(k);
            return;
        }
    }

    public void b(int j, Object obj)
    {
        if (j == 0)
        {
            d.b(obj);
            return;
        } else
        {
            e.b(obj);
            return;
        }
    }

    public void b(Map map)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c();
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        obj = new HashMap();
        ArrayList arraylist;
        Iterator iterator;
        map = new ArrayList();
        arraylist = new ArrayList();
        iterator = ((Map) (obj)).keySet().iterator();
_L8:
        Object obj1;
        Object obj2;
        int k;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_721;
        }
        obj1 = (TrashType)iterator.next();
        obj2 = (List)((Map) (obj)).get(obj1);
        map.clear();
        arraylist.clear();
        k = ((List) (obj2)).size();
        Object obj3;
        TrashItemInfo trashiteminfo;
        Object obj4;
        int l;
        for (int j = 0; j >= k; j++)
        {
            break MISSING_BLOCK_LABEL_612;
        }

        obj3 = (TrashInfo)((List) (obj2)).get(j);
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_747;
        }
        if (((TrashInfo) (obj3)).bundle.containsKey("subList"))
        {
            break MISSING_BLOCK_LABEL_452;
        }
        if (((TrashInfo) (obj3)).clearType != 2)
        {
            break MISSING_BLOCK_LABEL_366;
        }
        trashiteminfo = e.a(((TrashType) (obj1)), ((TrashInfo) (obj3)));
        if (trashiteminfo == null)
        {
            break MISSING_BLOCK_LABEL_747;
        }
        obj4 = e.g();
        if (obj1 != TrashType.CATE_BIGFILE && obj1 != TrashType.CATE_APK && obj1 != TrashType.CATE_ADPLUGIN || obj4 == null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        if (arraylist.contains(obj4))
        {
            arraylist.remove(obj4);
        }
        if (obj1 == TrashType.CATE_CACHE)
        {
            if (!((TrashInfo) (obj3)).bundle.containsKey("dbType"))
            {
                break MISSING_BLOCK_LABEL_332;
            }
            l = ((Integer)((TrashInfo) (obj3)).bundle.get("dbType")).intValue();
            obj3 = e.a(l);
            e.a(((String) (obj3)), trashiteminfo);
            e.a(l, trashiteminfo);
        }
_L3:
        arraylist.add(trashiteminfo);
        break MISSING_BLOCK_LABEL_747;
        map;
        throw map;
        obj3 = b.a(0x7f0c0248);
        e.a(((String) (obj3)), trashiteminfo);
        e.a(0, trashiteminfo);
          goto _L3
        obj3 = d.a(((TrashType) (obj1)), ((TrashInfo) (obj3)));
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_747;
        }
        trashiteminfo = d.f();
        if (obj1 != TrashType.CATE_BIGFILE && obj1 != TrashType.CATE_APK && obj1 != TrashType.CATE_ADPLUGIN || trashiteminfo == null)
        {
            break MISSING_BLOCK_LABEL_440;
        }
        if (map.contains(trashiteminfo))
        {
            map.remove(trashiteminfo);
        }
        map.add(obj3);
        break MISSING_BLOCK_LABEL_747;
        trashiteminfo = e.a(((TrashType) (obj1)), ((TrashInfo) (obj3)));
        if (trashiteminfo == null) goto _L5; else goto _L4
_L4:
        if (obj1 == TrashType.CATE_CACHE)
        {
            if (!((TrashInfo) (obj3)).bundle.containsKey("dbType"))
            {
                break MISSING_BLOCK_LABEL_578;
            }
            l = ((Integer)((TrashInfo) (obj3)).bundle.get("dbType")).intValue();
            obj4 = e.a(l);
            e.a(((String) (obj4)), trashiteminfo);
            e.a(l, trashiteminfo);
        }
_L6:
        arraylist.add(trashiteminfo);
_L5:
        obj3 = d.a(((TrashType) (obj1)), ((TrashInfo) (obj3)));
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_747;
        }
        map.add(obj3);
        break MISSING_BLOCK_LABEL_747;
        obj4 = b.a(0x7f0c0248);
        e.a(((String) (obj4)), trashiteminfo);
        e.a(0, trashiteminfo);
          goto _L6
        if (obj1 == TrashType.CATE_CACHE)
        {
            break MISSING_BLOCK_LABEL_653;
        }
        obj2 = e.a(((TrashType) (obj1)), -1);
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_653;
        }
        if (arraylist.size() > 0)
        {
            e.a(((String) (obj2)), arraylist);
        }
        if (obj1 != TrashType.CATE_SYSTEM && obj1 != TrashType.CATE_APP_SYSTEM_CACHE && obj1 != TrashType.CATE_ADPLUGIN)
        {
            if (obj1 != TrashType.CATE_APK);
        }
        obj1 = d.a(((TrashType) (obj1)), -1);
        if (map == null) goto _L8; else goto _L7
_L7:
        if (map.size() <= 0) goto _L8; else goto _L9
_L9:
        d.a(((String) (obj1)), map);
          goto _L8
        d.g();
        e.h();
        e.f();
        h = true;
          goto _L1
    }

    public long c(int j)
    {
        if (j == 0)
        {
            return d.c();
        } else
        {
            return e.c();
        }
    }

    public void c(int j, i k)
    {
        if (j == 0)
        {
            d.c(k);
            return;
        } else
        {
            e.c(k);
            return;
        }
    }

    public void c(int j, Object obj)
    {
        if (j == 0)
        {
            d.c(obj);
            return;
        } else
        {
            e.c(obj);
            return;
        }
    }

    public long d(int j)
    {
        if (j == 0)
        {
            return d.d();
        } else
        {
            return e.d();
        }
    }

    public long e(int j)
    {
        if (j == 0)
        {
            return d.e();
        } else
        {
            return e.e();
        }
    }

    public List f(int j)
    {
        if (j == 0)
        {
            return d.h();
        } else
        {
            return e.i();
        }
    }

}
