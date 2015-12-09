// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

// Referenced classes of package com.c.b:
//            ak, bb, n, ac, 
//            o, c, y, ag, 
//            q, am, al, a, 
//            aw, bj, p, ar, 
//            ay, d, k, bc, 
//            ae, ap, ao

public class aj
{

    static final Handler a = new ak(Looper.getMainLooper());
    static volatile aj b = null;
    final Context c;
    final q d;
    final k e;
    final bc f;
    final Map g = new WeakHashMap();
    final Map h = new WeakHashMap();
    final ReferenceQueue i = new ReferenceQueue();
    final android.graphics.Bitmap.Config j;
    boolean k;
    volatile boolean l;
    boolean m;
    private final ao n;
    private final ar o;
    private final am p;
    private final List q;

    aj(Context context, q q1, k k1, ao ao, ar ar1, List list, bc bc1, 
            android.graphics.Bitmap.Config config, boolean flag, boolean flag1)
    {
        c = context;
        d = q1;
        e = k1;
        n = ao;
        o = ar1;
        j = config;
        int i1;
        if (list != null)
        {
            i1 = list.size();
        } else
        {
            i1 = 0;
        }
        k1 = new ArrayList(i1 + 7);
        k1.add(new bb(context));
        if (list != null)
        {
            k1.addAll(list);
        }
        k1.add(new n(context));
        k1.add(new ac(context));
        k1.add(new o(context));
        k1.add(new c(context));
        k1.add(new y(context));
        k1.add(new ag(q1.d, bc1));
        q = Collections.unmodifiableList(k1);
        f = bc1;
        k = flag;
        l = flag1;
        p = new am(i, a);
        p.start();
    }

    public static aj a(Context context)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/c/b/aj;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = (new al(context)).a();
        }
        com/c/b/aj;
        JVM INSTR monitorexit ;
_L2:
        return b;
        context;
        com/c/b/aj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void a(Bitmap bitmap, ap ap1, a a1)
    {
        if (!a1.l) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!a1.k)
        {
            g.remove(a1.c());
        }
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (ap1 == null)
        {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        a1.a(bitmap, ap1);
        if (l)
        {
            bj.a("Main", "completed", a1.b.a(), (new StringBuilder("from ")).append(ap1).toString());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        a1.a();
        if (l)
        {
            bj.a("Main", "errored", a1.b.a());
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    static void a(aj aj1, Object obj)
    {
        aj1.a(obj);
    }

    private void a(Object obj)
    {
        bj.a();
        a a1 = (a)g.remove(obj);
        if (a1 != null)
        {
            a1.b();
            q q1 = d;
            q1.i.sendMessage(q1.i.obtainMessage(2, a1));
        }
        if (obj instanceof ImageView)
        {
            obj = (ImageView)obj;
            obj = (p)h.remove(obj);
            if (obj != null)
            {
                obj.c = null;
                Object obj1 = (ImageView)((p) (obj)).b.get();
                if (obj1 != null)
                {
                    obj1 = ((ImageView) (obj1)).getViewTreeObserver();
                    if (((ViewTreeObserver) (obj1)).isAlive())
                    {
                        ((ViewTreeObserver) (obj1)).removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (obj)));
                    }
                }
            }
        }
    }

    final aw a(aw aw1)
    {
        aw aw2 = o.a(aw1);
        if (aw2 == null)
        {
            throw new IllegalStateException((new StringBuilder("Request transformer ")).append(o.getClass().getCanonicalName()).append(" returned null for ").append(aw1).toString());
        } else
        {
            return aw2;
        }
    }

    public final ay a(String s)
    {
        if (s == null)
        {
            return new ay(this, null);
        }
        if (s.trim().length() == 0)
        {
            throw new IllegalArgumentException("Path must not be empty.");
        } else
        {
            return new ay(this, Uri.parse(s));
        }
    }

    final List a()
    {
        return q;
    }

    public final void a(ImageView imageview)
    {
        a(imageview);
    }

    final void a(a a1)
    {
        Object obj = a1.c();
        if (obj != null && g.get(obj) != a1)
        {
            a(obj);
            g.put(obj, a1);
        }
        obj = d;
        ((q) (obj)).i.sendMessage(((q) (obj)).i.obtainMessage(1, a1));
    }

    final void a(d d1)
    {
        a a1;
        List list;
        boolean flag;
        boolean flag2 = true;
        a1 = d1.k;
        list = d1.l;
        boolean flag1;
        if (list != null && !list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag2;
        if (a1 == null)
        {
            if (flag)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = d1.g.d;
        obj = d1.p;
        obj = d1.m;
        d1 = d1.o;
        if (a1 != null)
        {
            a(((Bitmap) (obj)), ((ap) (d1)), a1);
        }
        if (flag)
        {
            int j1 = list.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                a(((Bitmap) (obj)), ((ap) (d1)), (a)list.get(i1));
                i1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    final Bitmap b(String s)
    {
        s = e.a(s);
        if (s != null)
        {
            f.a();
            return s;
        } else
        {
            f.c.sendEmptyMessage(1);
            return s;
        }
    }

    final void b(a a1)
    {
        Bitmap bitmap = null;
        if (ae.a(a1.e))
        {
            bitmap = b(a1.i);
        }
        if (bitmap != null)
        {
            a(bitmap, ap.a, a1);
            if (l)
            {
                bj.a("Main", "completed", a1.b.a(), (new StringBuilder("from ")).append(ap.a).toString());
            }
        } else
        {
            a(a1);
            if (l)
            {
                bj.a("Main", "resumed", a1.b.a());
                return;
            }
        }
    }

}
