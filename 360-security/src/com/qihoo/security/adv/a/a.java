// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv.a;

import android.content.Context;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.adv.AdvDataManager;
import com.qihoo.security.adv.c;
import com.qihoo.security.adv.d;
import com.qihoo.security.adv.e;
import com.qihoo.security.locale.language.b;
import com.qihoo360.mobilesafe.b.i;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.adv.a:
//            b, c

public class a
{

    private static a a;
    private final AdvDataManager b = AdvDataManager.a();
    private final Hashtable c = new Hashtable();
    private final HashMap d = new HashMap();
    private final com.qihoo.security.adv.a.b e = com.qihoo.security.adv.a.b.a();
    private final Context f = SecurityApplication.a();
    private final com.qihoo.security.adv.AdvDataManager.c g = new com.qihoo.security.adv.AdvDataManager.c() {

        final a a;

        public void a(com.qihoo.security.adv.AdvDataManager.AdvType advtype, Long long1)
        {
            com.qihoo.security.adv.a.c.a(advtype);
        }

        public void a(com.qihoo.security.adv.AdvDataManager.AdvType advtype, Long long1, int j)
        {
            EventBus.getDefault().post(new com.qihoo.security.f.a(advtype, new ArrayList()));
            com.qihoo.security.adv.a.c.a(advtype, 1, j, System.currentTimeMillis() - long1.longValue());
        }

        public void a(com.qihoo.security.adv.AdvDataManager.a a1, com.qihoo.security.adv.AdvDataManager.AdvType advtype, Long long1)
        {
            long l = long1.longValue();
            Object obj = new ArrayList();
            if (a1 != null && a1.a != null)
            {
                com.qihoo.security.adv.a a2 = a1.a;
                obj = a2;
                if (advtype.isShouldCache())
                {
                    obj = a2.e();
                }
                obj = ((com.qihoo.security.adv.a) (obj)).c();
                if (l == ((Long)a.a(a).get(Integer.valueOf(advtype.getMid()))).longValue())
                {
                    a.a(a, a1.a.c(), advtype);
                    com.qihoo.security.adv.a.a.b(a).put(Integer.valueOf(advtype.getMid()), a1.a);
                }
                com.qihoo.security.adv.a.c.a(advtype, 0, a1.a.c().size(), long1.longValue());
                a1 = ((com.qihoo.security.adv.AdvDataManager.a) (obj));
            } else
            {
                com.qihoo.security.adv.a.c.a(advtype, 0, 0, System.currentTimeMillis() - l);
                a1 = ((com.qihoo.security.adv.AdvDataManager.a) (obj));
            }
            EventBus.getDefault().post(new com.qihoo.security.f.a(advtype, a1));
        }

        public volatile void a(Object obj, Object obj1)
        {
            a((com.qihoo.security.adv.AdvDataManager.AdvType)obj, (Long)obj1);
        }

        public volatile void a(Object obj, Object obj1, int j)
        {
            a((com.qihoo.security.adv.AdvDataManager.AdvType)obj, (Long)obj1, j);
        }

        public volatile void a(Object obj, Object obj1, Object obj2)
        {
            a((com.qihoo.security.adv.AdvDataManager.a)obj, (com.qihoo.security.adv.AdvDataManager.AdvType)obj1, (Long)obj2);
        }

            
            {
                a = a.this;
                super();
            }
    };

    private a()
    {
    }

    public static a a()
    {
        com/qihoo/security/adv/a/a;
        JVM INSTR monitorenter ;
        a a1;
        if (a == null)
        {
            a = new a();
        }
        a1 = a;
        com/qihoo/security/adv/a/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    static HashMap a(a a1)
    {
        return a1.d;
    }

    private List a(com.qihoo.security.adv.AdvDataManager.AdvType advtype, com.qihoo.security.adv.a a1)
    {
        ArrayList arraylist = new ArrayList();
        List list = a(a1.d());
        int k = list.size();
        a1 = a1.c().iterator();
        int j = 0;
        do
        {
            if (!a1.hasNext())
            {
                break;
            }
            d d1 = (d)a1.next();
            if (d1.e() != 0)
            {
                e e1 = d1.i();
                if (e1 != null)
                {
                    if (i.a(f, e1.f()))
                    {
                        b.a(e1.f(), e1.c());
                    } else
                    {
                        d1.a(1);
                        if (11 != d1.d() && TextUtils.isEmpty(e1.j()))
                        {
                            d1.c(11);
                        }
                        arraylist.add(d1);
                        b.a(advtype, e1.c());
                    }
                } else
                if (a(d1, ((List) (arraylist))))
                {
                    d1.a(0);
                    arraylist.add(d1);
                } else
                if (j < k)
                {
                    e e2 = (e)list.get(j);
                    d1.a(1);
                    d1.a(e2);
                    if (11 != d1.d() && TextUtils.isEmpty(e2.j()))
                    {
                        d1.c(11);
                    }
                    arraylist.add(d1);
                    b.a(advtype, e2.c());
                    j++;
                }
            }
        } while (true);
        return arraylist;
    }

    private List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext();)
        {
            e e1 = (e)list.next();
            if (i.a(f, e1.f()))
            {
                b.a(e1.f(), e1.c());
            } else
            {
                arraylist.add(e1);
            }
        }

        return arraylist;
    }

    private void a(com.qihoo.security.adv.AdvDataManager.AdvType advtype, d d1, e e1)
    {
        d1.a(e1);
        if (11 != d1.d() && TextUtils.isEmpty(e1.j()))
        {
            d1.c(11);
        }
        b.a(advtype, e1.c());
    }

    static void a(a a1, List list, com.qihoo.security.adv.AdvDataManager.AdvType advtype)
    {
        a1.a(list, advtype);
    }

    private void a(List list, com.qihoo.security.adv.AdvDataManager.AdvType advtype)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            Iterator iterator = ((d)list.next()).h().iterator();
            while (iterator.hasNext()) 
            {
                c c1 = (c)iterator.next();
                if (c1.a() == 1)
                {
                    e.a(advtype, c1.b());
                }
            }
        }

    }

    private boolean a(e e1)
    {
        if (i.a(f, e1.f()))
        {
            b.a(e1.f(), e1.c());
        } else
        if (!TextUtils.isEmpty(e1.l()))
        {
            return true;
        }
        return false;
    }

    static Hashtable b(a a1)
    {
        return a1.c;
    }

    private void e(com.qihoo.security.adv.AdvDataManager.AdvType advtype)
    {
        if (!advtype.isShouldCache())
        {
            c.remove(Integer.valueOf(advtype.getMid()));
        }
    }

    private List f(com.qihoo.security.adv.AdvDataManager.AdvType advtype)
    {
        ArrayList arraylist;
label0:
        {
            arraylist = new ArrayList();
            advtype = b.a(advtype);
            if (advtype == null)
            {
                break MISSING_BLOCK_LABEL_113;
            }
            advtype = advtype.c().iterator();
            d d1;
            e e1;
            do
            {
                if (!advtype.hasNext())
                {
                    break label0;
                }
                d1 = (d)advtype.next();
                e1 = d1.i();
            } while (e1 == null || i.a(f, e1.f()));
            d1.b(1);
            d1.a(2);
            arraylist.add(d1);
        }
_L1:
        int j;
        if (arraylist.isEmpty())
        {
            j = 0;
        } else
        {
            j = 1;
        }
        com.qihoo.security.adv.a.c.a(j);
        return arraylist;
        a(com.qihoo.security.adv.AdvDataManager.AdvType.PrepareAdvData);
          goto _L1
    }

    public int a(List list, String s)
    {
        int k = list.size();
        int j = 0;
        do
        {
            if (j >= k)
            {
                break;
            }
            for (Iterator iterator = ((d)list.get(j)).h().iterator(); iterator.hasNext();)
            {
                c c1 = (c)iterator.next();
                if (c1.a() == 1 && TextUtils.equals(c1.b(), s))
                {
                    return j;
                }
            }

            j++;
        } while (true);
        return -1;
    }

    public void a(com.qihoo.security.adv.AdvDataManager.AdvType advtype)
    {
        e(advtype);
        long l = System.currentTimeMillis();
        d.put(Integer.valueOf(advtype.getMid()), Long.valueOf(l));
        b.a(g, advtype, l);
    }

    public boolean a(d d1, List list)
    {
        return e.a(d1, list);
    }

    public void b()
    {
        b.b();
    }

    public void b(com.qihoo.security.adv.AdvDataManager.AdvType advtype)
    {
        com.qihoo.security.adv.a a1 = b.a(advtype);
        if (a1 != null && a1.c() != null)
        {
            a(a1.c(), advtype);
            return;
        } else
        {
            a(advtype);
            return;
        }
    }

    public List c(com.qihoo.security.adv.AdvDataManager.AdvType advtype)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = com.qihoo.security.locale.language.b.a(f);
        if (flag) goto _L2; else goto _L1
_L1:
        advtype = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return advtype;
_L2:
        com.qihoo.security.adv.a a1 = (com.qihoo.security.adv.a)c.get(Integer.valueOf(advtype.getMid()));
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        advtype = f(advtype);
        continue; /* Loop/switch isn't completed */
        advtype = a(advtype, a1);
        if (true) goto _L4; else goto _L3
_L3:
        advtype;
        throw advtype;
    }

    public List d(com.qihoo.security.adv.AdvDataManager.AdvType advtype)
    {
        if (!com.qihoo.security.locale.language.b.a(f))
        {
            return null;
        }
        Object obj = (com.qihoo.security.adv.a)c.get(Integer.valueOf(advtype.getMid()));
        if (obj == null)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        obj = ((com.qihoo.security.adv.a) (obj)).c().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            d d1 = (d)((Iterator) (obj)).next();
            if (d1.e() != 0)
            {
                e e1 = d1.i();
                if (e1 != null)
                {
                    if (a(e1))
                    {
                        a(advtype, d1, e1);
                        d1.a(1);
                        arraylist.add(d1);
                    }
                } else
                if (e.a(d1, arraylist))
                {
                    d1.a(0);
                    arraylist.add(d1);
                }
            }
        } while (true);
        return arraylist;
    }
}
