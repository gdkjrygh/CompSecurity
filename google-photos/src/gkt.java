// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class gkt
    implements gkh, gkm, gkq, gks, gli, Thread.UncaughtExceptionHandler
{

    public final gld a;
    private final Context b;
    private final gmb c;
    private final gla d;
    private Handler e;
    private final Handler f;
    private final gky g;
    private final glf h;
    private final gkx i;
    private final List j;
    private final Map k;
    private final noz l;
    private final noz m;
    private final noz n;
    private final ekk o;

    private gkt(Context context, gla gla1, Handler handler, gky gky1, gkx gkx1, gld gld1, glf glf, 
            gmb gmb1, ekk ekk, List list)
    {
        k = new HashMap();
        g = gky1;
        i = gkx1;
        j = list;
        b = context.getApplicationContext();
        d = new gla(context, gld1, this);
        e = a();
        a = gld1;
        h = glf;
        c = gmb1;
        o = ekk;
        f = new Handler(Looper.getMainLooper());
        l = noz.a(context, 2, "MediaPage", new String[0]);
        m = noz.a(context, 3, "MediaPage", new String[0]);
        n = noz.a(context, "MediaPage", new String[0]);
    }

    public gkt(Context context, gld gld1, gmb gmb1, glf glf, ekk ekk, List list)
    {
        this(context, null, null, new gky(), new gkx(), gld1, glf, gmb1, ekk, list);
    }

    private Handler a()
    {
        HandlerThread handlerthread = new HandlerThread("MediaPageFetcher", 9);
        handlerthread.setUncaughtExceptionHandler(this);
        handlerthread.start();
        return new Handler(handlerthread.getLooper());
    }

    static gla a(gkt gkt1)
    {
        return gkt1.d;
    }

    static glj a(gkt gkt1, ehr ehr1)
    {
        return gkt1.e(ehr1);
    }

    private static void a(Handler handler, ehr ehr1, Runnable runnable)
    {
        handler.postAtTime(runnable, ehr1, 0L);
    }

    private void a(ehr ehr1, int i1, glj glj1)
    {
        int j1 = i1 / a.a;
        boolean flag;
        if (d.a(ehr1).a(Integer.valueOf(j1)) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            if (glj1.a.contains(Integer.valueOf(j1)))
            {
                if (l.a())
                {
                    noy.a("key", ehr1);
                    noy.a("position", Integer.valueOf(i1));
                    return;
                }
            } else
            {
                if (m.a())
                {
                    noy.a("key", ehr1);
                    noy.a("position", Integer.valueOf(i1));
                }
                glj1.a.add(Integer.valueOf(j1));
                b(ehr1, new glh(b, j1, 1, ehr1, glj1.e, this, a, d(ehr1), o));
                return;
            }
        }
    }

    private void a(ehr ehr1, glj glj1)
    {
        boolean flag;
        if (glj1.f >= glj1.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            int i1 = glj1.e;
            glj1.f = i1;
            ArrayList arraylist = new ArrayList();
            Object obj = glj1.b.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                int j1 = ((gkj)((Iterator) (obj)).next()).d();
                if (j1 != -1)
                {
                    arraylist.add(Integer.valueOf(j1));
                }
            } while (true);
            obj = b;
            gld gld1 = a;
            glf glf = h;
            b(ehr1, new gkn(((Context) (obj)), ehr1, arraylist, i1, this, d(ehr1), gld1, glf, o, j));
            if (m.a())
            {
                noy.a("key", ehr1);
                noy.a("is monitored", Boolean.valueOf(glj1.b()));
                noy.a("num pages", Integer.valueOf(arraylist.size()));
                return;
            }
        }
    }

    private void a(ehr ehr1, Runnable runnable)
    {
        a(f, ehr1, runnable);
    }

    static glf b(gkt gkt1)
    {
        return gkt1.h;
    }

    private void b(ehr ehr1, Runnable runnable)
    {
        a(e, ehr1, runnable);
    }

    static gld c(gkt gkt1)
    {
        return gkt1.a;
    }

    static noz d(gkt gkt1)
    {
        return gkt1.m;
    }

    private glj e(ehr ehr1)
    {
        glj glj2 = (glj)k.get(ehr1);
        glj glj1 = glj2;
        if (glj2 == null)
        {
            glj1 = new glj();
            k.put(ehr1, glj1);
        }
        return glj1;
    }

    public final Integer a(ehr ehr1, Object obj)
    {
        gla gla1 = d;
        b.u();
        for (ehr1 = gla1.a(ehr1).g().entrySet().iterator(); ehr1.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)ehr1.next();
            gkz gkz1 = (gkz)entry.getValue();
            int i1 = gkz1.c.a(gkz1.b, obj);
            if (i1 != -1)
            {
                return Integer.valueOf(((Integer)entry.getKey()).intValue() * gla1.b.a + i1);
            }
        }

        return null;
    }

    public final void a(int i1, ehr ehr1, List list, int j1)
    {
        a(ehr1, ((Runnable) (new gkv(this, ehr1, j1, i1, list))));
    }

    public final void a(ehr ehr1)
    {
        glj glj1 = e(ehr1);
        glj1.e = glj1.e + 1;
        glj1.a.clear();
        glj1.c = false;
        e.removeCallbacksAndMessages(ehr1);
        f.removeCallbacksAndMessages(ehr1);
        if (glj1.b())
        {
            a(ehr1, glj1);
        }
    }

    public final void a(ehr ehr1, long l1, int i1)
    {
        a(ehr1, ((Runnable) (new gku(this, ehr1, i1, l1))));
    }

    public final void a(ehr ehr1, long l1, List list, int i1, List list1)
    {
        a(ehr1, ((Runnable) (new gkw(this, ehr1, i1, l1, list, list1))));
    }

    public final void a(ehr ehr1, gkj gkj1)
    {
        e(ehr1).b.add(gkj1);
    }

    public final boolean a(ehr ehr1, int i1)
    {
        return d.b(ehr1, i1) != null;
    }

    public final Integer b(ehr ehr1)
    {
        glj glj1 = e(ehr1);
        boolean flag = glj1.a();
        if (flag)
        {
            a(ehr1, glj1);
        }
        Object obj = d;
        b.u();
        obj = (Integer)((gla) (obj)).a.a(ehr1);
        if (obj != null)
        {
            if (l.a())
            {
                noy.a("key", ehr1);
                noy.a(((Integer) (obj)).intValue());
            }
            return ((Integer) (obj));
        }
        if (!flag)
        {
            if (glj1.c)
            {
                if (l.a())
                {
                    noy.a("key", ehr1);
                }
            } else
            {
                if (m.a())
                {
                    noy.a("key", ehr1);
                }
                glj1.c = true;
                b(ehr1, ((Runnable) (new gkr(b, ehr1, glj1.e, this, d(ehr1)))));
            }
        }
        return null;
    }

    public final Object b(ehr ehr1, int i1)
    {
        glj glj1 = e(ehr1);
        boolean flag = glj1.a();
        if (flag)
        {
            a(ehr1, glj1);
        }
        Object obj = d.b(ehr1, i1);
        if (obj != null)
        {
            if (l.a())
            {
                noy.a("key", ehr1);
                noy.a("item", obj);
                noy.a("position", Integer.valueOf(i1));
            }
            return obj;
        }
        if (!flag)
        {
            a(ehr1, i1, glj1);
        }
        return null;
    }

    public final void b(ehr ehr1, gkj gkj1)
    {
        e(ehr1).b.remove(gkj1);
    }

    public final void c(ehr ehr1, int i1)
    {
        glj glj1 = e(ehr1);
        if (glj1.a())
        {
            a(ehr1, glj1);
            return;
        } else
        {
            a(ehr1, i1, glj1);
            return;
        }
    }

    public final boolean c(ehr ehr1)
    {
        gly gly1 = d(ehr1);
        return gly1 != null && gly1.a(ehr1.a);
    }

    public final gly d(ehr ehr1)
    {
        gmb gmb1 = c;
        ehr1 = ehr1.a;
        ehr1 = (glz)gmb1.b.a(ehr1.a());
        if (ehr1 != null)
        {
            return ehr1.a(gmb1.a);
        } else
        {
            return null;
        }
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        for (boolean flag = false; throwable != null && !flag; throwable = throwable.getCause())
        {
            flag = throwable instanceof mvr;
        }

        e = a();
    }
}
