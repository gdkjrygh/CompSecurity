// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.cmcm.a.a.d;
import com.cmcm.adsdk.a;
import com.cmcm.adsdk.b;
import com.cmcm.adsdk.b.a.c;
import com.cmcm.adsdk.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.Timer;
import java.util.Vector;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            w, h, ad, ae, 
//            x, af, m, ac, 
//            ab

public final class aa extends w
    implements h, Observer
{

    private int a;
    private boolean b;
    private Handler c;
    private List d;
    private Object e;
    private Vector f;
    private volatile boolean g;
    private d h;
    private boolean i;
    private Timer j;
    private boolean k;
    private boolean l;
    private int m;
    private long n;
    private boolean o;
    private Map p;
    private Map q;
    private List r;
    private Runnable s;
    private Runnable t;

    public aa(Context context, String s1)
    {
        super(context, s1, "ad");
        b = true;
        e = new Object();
        f = new Vector();
        g = true;
        i = false;
        j = null;
        k = false;
        l = false;
        o = false;
        p = new HashMap();
        q = new HashMap();
        r = new ArrayList();
        s = new ad(this);
        t = new ae(this);
        c = new Handler(Looper.getMainLooper());
        a = com.cmcm.adsdk.b.j();
        com.cmcm.adsdk.b.a.a(com.cmcm.adsdk.a.e()).addObserver(this);
    }

    private w a(String s1, Context context, String s2, String s3)
    {
        if (TextUtils.isEmpty(s1))
        {
            return null;
        }
        if (!p.containsKey(s1))
        {
            context = com.cmcm.adsdk.nativead.x.a(s1, context, s2, s3);
            if (context != null)
            {
                p.put(s1, context);
                context.setLoadCallBack(this);
                context.setRequestParams(requestParams);
            }
        }
        return (w)p.get(s1);
    }

    static Object a(aa aa1)
    {
        return aa1.e;
    }

    static List a(aa aa1, List list)
    {
        aa1.d = list;
        return list;
    }

    private static void a()
    {
        if (com.cmcm.adsdk.b.k() != null)
        {
            com.cmcm.adsdk.b.k();
        }
    }

    private void a(int i1)
    {
        com.cmcm.a.b.a.a(c.getLooper(), Looper.myLooper());
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "notifyAdFailed");
        if (h != null)
        {
            h.a(i1);
        }
    }

    private void a(String s1, boolean flag, String s2)
    {
        synchronized (q)
        {
            com.cmcm.adsdk.b.c.b.a("CMCMADSDK", (new StringBuilder("push ")).append(s1).append(" to result map ,is scuccess:").append(flag).toString());
            q.put(s1, new k(flag, s2));
        }
        return;
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private boolean a(c c1)
    {
        boolean flag;
        if (c1.e.intValue() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "skip weight<=0 config");
            return false;
        }
        String s1 = c1.d;
        c1 = a(s1, mContext, mPositionId, c1.c);
        if (c1 != null)
        {
            r.add(c1);
            com.cmcm.adsdk.b.c.b.a("CMCMADSDK", (new StringBuilder("to load ")).append(s1).toString());
            m = m + 1;
            c1.loadAd();
            return true;
        } else
        {
            a(s1, false, "10005");
            return false;
        }
    }

    private com.cmcm.a.a.a b(c c1)
    {
        String s1 = c1.d;
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        c1 = null;
_L4:
        return c1;
_L2:
        int i1 = 0;
label0:
        do
        {
label1:
            {
                if (i1 >= f.size())
                {
                    break label1;
                }
                com.cmcm.a.a.a a1 = (com.cmcm.a.a.a)f.get(i1);
                c1 = a1;
                if (s1.equalsIgnoreCase(a1.c()))
                {
                    break label0;
                }
                i1++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    static List b(aa aa1)
    {
        return aa1.d;
    }

    private void b()
    {
        int i1 = 0;
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (d != null && !d.isEmpty())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (!com.cmcm.adsdk.a.c())
        {
            break MISSING_BLOCK_LABEL_50;
        }
        k = true;
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "the cloud config is loading,to suspend this request");
_L2:
        return;
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", (new StringBuilder("the posid:")).append(mPositionId).append("no config, may be has closed").toString());
        a(10001);
        g = true;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        f.clear();
        q.clear();
        r.clear();
        n = System.currentTimeMillis();
        m = 0;
        l = false;
        i = false;
        try
        {
            j = new Timer();
            j.schedule(new af(this), 8000L);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
        }
        if (d.size() > 1)
        {
            c.postDelayed(s, 4000L);
            o = true;
        }
        obj = e;
        obj;
        JVM INSTR monitorenter ;
_L4:
        if (i1 >= Math.min(d.size(), 2))
        {
            break; /* Loop/switch isn't completed */
        }
        a((c)d.get(i1));
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void c(aa aa1)
    {
        Object obj = aa1.e;
        obj;
        JVM INSTR monitorenter ;
        aa1.p.clear();
        c c1;
        w w1;
        for (Iterator iterator = aa1.d.iterator(); iterator.hasNext(); aa1.p.put(c1.d, w1))
        {
            c1 = (c)iterator.next();
            w1 = aa1.a(c1.d, aa1.mContext, aa1.mPositionId, c1.c);
        }

        break MISSING_BLOCK_LABEL_91;
        aa1;
        obj;
        JVM INSTR monitorexit ;
        throw aa1;
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", (new StringBuilder("mConfigBeans size:")).append(aa1.d.size()).toString());
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", (new StringBuilder("mLoaderCache size:")).append(aa1.p.size()).toString());
        obj;
        JVM INSTR monitorexit ;
    }

    private boolean c()
    {
        if (p.containsKey("cm")) goto _L2; else goto _L1
_L1:
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "now loaders no picks, no need to delay");
_L4:
        return false;
_L2:
        synchronized (q)
        {
            if (!q.containsKey("cm"))
            {
                break MISSING_BLOCK_LABEL_64;
            }
            com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "result map has picks, no need to delay");
        }
        return false;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", (new StringBuilder("has delay to check finish :")).append(l).toString());
        if (!l)
        {
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void d()
    {
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "issue to load low priority ad");
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", (new StringBuilder("next load index :")).append(m).append(",config size:").append(d.size()).toString());
        if (m >= d.size())
        {
            break MISSING_BLOCK_LABEL_98;
        }
        a((c)d.get(m));
_L2:
        return;
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "the load index is last one,remove no callback task");
        c.removeCallbacks(t);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static boolean d(aa aa1)
    {
        return aa1.k;
    }

    private void e()
    {
        c.post(t);
    }

    static void e(aa aa1)
    {
        aa1.b();
    }

    private boolean f()
    {
        Map map = q;
        map;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (r.size() == q.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        map;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static boolean f(aa aa1)
    {
        aa1.k = false;
        return false;
    }

    private void g()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        iterator = d.iterator();
        c c1;
        com.cmcm.a.a.a a1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_103;
            }
            c1 = (c)iterator.next();
            a1 = b(c1);
        } while (a1 == null);
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", (new StringBuilder("match ad:")).append(c1.d).append(" ").append(a1.d()).toString());
        h();
        obj;
        JVM INSTR monitorexit ;
        return;
        obj;
        JVM INSTR monitorexit ;
        com.cmcm.adsdk.b.c.b.c("CMCMADSDK", " fatal config or adtype");
        a(10003);
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static boolean g(aa aa1)
    {
        aa1.i = true;
        return true;
    }

    private void h()
    {
        com.cmcm.a.b.a.a(c.getLooper(), Looper.myLooper());
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "notifyAdLoaded");
        if (h != null)
        {
            h.a();
        }
    }

    static void h(aa aa1)
    {
        aa1.e();
    }

    static Map i(aa aa1)
    {
        return aa1.q;
    }

    static Handler j(aa aa1)
    {
        return aa1.c;
    }

    static void k(aa aa1)
    {
        aa1.d();
    }

    static void l(aa aa1)
    {
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "check finish");
        if (!aa1.g) goto _L2; else goto _L1
_L1:
        com.cmcm.adsdk.b.c.b.b("CMCMADSDK", "already finished");
_L8:
        return;
_L2:
        if (aa1.l)
        {
            com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "remove delay task");
            aa1.c.removeCallbacks(aa1.t);
        }
        if (aa1.o)
        {
            com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "remove no callback task");
            aa1.c.removeCallbacks(aa1.s);
        }
        Object obj1 = aa1.e;
        obj1;
        JVM INSTR monitorenter ;
        if (aa1.d == null || aa1.d.isEmpty())
        {
            break MISSING_BLOCK_LABEL_347;
        }
          goto _L3
_L5:
        obj1;
        JVM INSTR monitorexit ;
        Object obj;
        if (obj == null && !aa1.i && !aa1.f())
        {
            com.cmcm.adsdk.b.c.b.b("CMCMADSDK", (new StringBuilder("is timeout:")).append(aa1.i).toString());
            return;
        }
          goto _L4
_L3:
        obj = aa1.b((c)aa1.d.get(0));
          goto _L5
        aa1;
        obj1;
        JVM INSTR monitorexit ;
        throw aa1;
_L4:
        if (aa1.f.isEmpty()) goto _L7; else goto _L6
_L6:
        aa1.g = true;
        aa1.g();
_L10:
        if ((aa1.g || aa1.i) && aa1.j != null)
        {
            aa1.g = true;
            aa1.j.cancel();
            aa1.j = null;
            return;
        }
          goto _L8
_L7:
label0:
        {
            if (!aa1.f())
            {
                break label0;
            }
            aa1.g = true;
            aa1.a(10002);
        }
        if (true) goto _L10; else goto _L9
_L9:
label1:
        {
            if (!aa1.q.isEmpty())
            {
                break label1;
            }
            aa1.g = true;
            aa1.a(10004);
        }
        if (true) goto _L10; else goto _L11
_L11:
        obj = aa1.q.keySet().iterator();
_L14:
        if (!((Iterator) (obj)).hasNext()) goto _L10; else goto _L12
_L12:
        obj1 = (String)((Iterator) (obj)).next();
        if (((k)aa1.q.get(obj1)).a()) goto _L14; else goto _L13
_L13:
        aa1.a(10004);
          goto _L10
        obj = null;
          goto _L5
    }

    public final void a(com.cmcm.a.a.a a1)
    {
        if (a1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        synchronized (q)
        {
            if (!q.containsKey(a1.c()))
            {
                break MISSING_BLOCK_LABEL_38;
            }
        }
        return;
        a1;
        map;
        JVM INSTR monitorexit ;
        throw a1;
        map;
        JVM INSTR monitorexit ;
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", (new StringBuilder()).append(a1.c()).append(" load success").toString());
        a(a1.c(), true, null);
        if (!g)
        {
            if (a1 != null)
            {
                f.add(a1);
            }
            if ((a1 instanceof m) && ((m)a1).o())
            {
                com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "picks ad is priority");
                h();
                g = true;
                if (j != null)
                {
                    j.cancel();
                    j = null;
                }
            }
            if (c())
            {
                l = true;
                long l1 = System.currentTimeMillis() - n;
                com.cmcm.adsdk.b.c.b.a("CMCMADSDK", (new StringBuilder("load spend time: ")).append(l1).append(",picks protect time :").append(a).toString());
                if (l1 > (long)a)
                {
                    l1 = 0L;
                } else
                {
                    l1 = (long)a - l1;
                }
                com.cmcm.adsdk.b.c.b.a("CMCMADSDK", (new StringBuilder("delay to check finish , need delay time :")).append(l1).toString());
                c.postDelayed(t, l1);
                return;
            } else
            {
                e();
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void a(String s1, String s2)
    {
label0:
        {
            synchronized (q)
            {
                if (!q.containsKey(s1))
                {
                    break label0;
                }
            }
            return;
        }
        map;
        JVM INSTR monitorexit ;
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", (new StringBuilder()).append(s1).append(" load fail").toString());
        a(s1, false, s2);
        if (!g)
        {
            d();
            e();
            return;
        } else
        {
            return;
        }
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void b(com.cmcm.a.a.a a1)
    {
        if (h != null)
        {
            h.a(a1);
        }
    }

    public final List getAdList(int i1)
    {
        ArrayList arraylist;
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "getAdList");
        if (!com.cmcm.adsdk.a.d())
        {
            com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "sdk has stop work");
            return null;
        }
        arraylist = new ArrayList();
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (d == null || d.isEmpty() || p == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = d.iterator();
_L3:
        Object obj1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (c)iterator.next();
        obj1 = (w)p.get(((c) (obj1)).d);
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((w) (obj1)).getAdList(i1 - arraylist.size());
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((List) (obj1)).isEmpty())
        {
            arraylist.addAll(((java.util.Collection) (obj1)));
        }
        if (arraylist.size() < i1) goto _L3; else goto _L2
_L2:
        obj;
        JVM INSTR monitorexit ;
        return arraylist;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void loadAd()
    {
        a();
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", (new StringBuilder("posid ")).append(mPositionId).append(" loadAd...").toString());
        if (!com.cmcm.adsdk.a.d())
        {
            com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "sdk has stop work");
            return;
        }
        if (!g)
        {
            a();
            com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "wait and reuse for last result");
            return;
        }
        g = false;
        if (b)
        {
            com.cmcm.adsdk.c.a.a(new ac(this), new Void[0]);
            b = false;
            return;
        } else
        {
            b();
            return;
        }
    }

    protected final void removeAdFromPool(com.cmcm.a.a.a a1)
    {
        if (p != null && a1 != null)
        {
            w w1 = (w)p.get(a1.c());
            if (w1 != null)
            {
                w1.removeAdFromPool(a1);
            }
        }
    }

    public final void setAdListener(d d1)
    {
        h = d1;
    }

    public final void update(Observable observable, Object obj)
    {
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "config has update");
        com.cmcm.adsdk.c.a.a(new ab(this), new Void[0]);
    }
}
