// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package b.a:
//            gh, hc, he, ca, 
//            hh, hg, hf, a, 
//            bu, fs, fj, fp

public final class gg
{

    public static gg a;
    private final String b = "umeng_it.cache";
    private File c;
    private bu d;
    private long e;
    private long f;
    private Set g;
    private gh h;

    private gg(Context context)
    {
        d = null;
        g = new HashSet();
        h = null;
        c = new File(context.getFilesDir(), "umeng_it.cache");
        f = 0x5265c00L;
        h = new gh(context);
        h.b();
    }

    public static gg a(Context context)
    {
        b/a/gg;
        JVM INSTR monitorenter ;
        Object obj1;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        gg gg1 = new gg(context);
        a = gg1;
        gg1.a(((a) (new hc(context))));
        a.a(((a) (new he(context))));
        a.a(((a) (new ca(context))));
        a.a(((a) (new hh(context))));
        a.a(((a) (new hg(context))));
        a.a(((a) (new hf())));
        context = a;
        obj1 = context.f();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        Object obj = new ArrayList(((gg) (context)).g.size());
        context;
        JVM INSTR monitorenter ;
        context.d = ((bu) (obj1));
        obj1 = ((gg) (context)).g.iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            a a2 = (a)((Iterator) (obj1)).next();
            a2.a(((gg) (context)).d);
            if (!a2.c())
            {
                ((List) (obj)).add(a2);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_212;
        obj;
        context;
        JVM INSTR monitorexit ;
        throw obj;
        context;
        b/a/gg;
        JVM INSTR monitorexit ;
        throw context;
        a a1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((gg) (context)).g.remove(a1))
        {
            a1 = (a)((Iterator) (obj)).next();
        }

        context;
        JVM INSTR monitorexit ;
        context.d();
        context = a;
        b/a/gg;
        JVM INSTR monitorexit ;
        return context;
    }

    private boolean a(a a1)
    {
        if (h.a(a1.b()))
        {
            return g.add(a1);
        } else
        {
            return false;
        }
    }

    private void d()
    {
        bu bu1;
        bu1 = new bu();
        HashMap hashmap = new HashMap();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = g.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (a1.c())
            {
                if (a1.d() != null)
                {
                    hashmap.put(a1.b(), a1.d());
                }
                if (a1.e() != null && !a1.e().isEmpty())
                {
                    arraylist.addAll(a1.e());
                }
            }
        } while (true);
        bu1.a(arraylist);
        bu1.a(hashmap);
        this;
        JVM INSTR monitorenter ;
        d = bu1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void e()
    {
        bu bu1;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        bu1 = d;
        if (bu1 == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        this;
        JVM INSTR monitorenter ;
        byte abyte0[] = (new fs()).a(bu1);
        this;
        JVM INSTR monitorexit ;
        Exception exception;
        if (abyte0 != null)
        {
            try
            {
                fj.a(c, abyte0);
                return;
            }
            catch (Exception exception1)
            {
                exception1.printStackTrace();
            }
        }
        break MISSING_BLOCK_LABEL_55;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private bu f()
    {
        if (!c.exists())
        {
            return null;
        }
        Object obj1 = new FileInputStream(c);
        Object obj = obj1;
        byte abyte0[] = fj.b(((java.io.InputStream) (obj1)));
        obj = obj1;
        bu bu1 = new bu();
        obj = obj1;
        (new fp()).a(bu1, abyte0);
        fj.c(((java.io.InputStream) (obj1)));
        return bu1;
        Object obj2;
        obj2;
        obj1 = null;
_L4:
        obj = obj1;
        ((Exception) (obj2)).printStackTrace();
        fj.c(((java.io.InputStream) (obj1)));
        return null;
        obj;
        java.io.InputStream inputstream;
        inputstream = null;
        obj1 = obj;
_L2:
        fj.c(inputstream);
        throw obj1;
        obj1;
        inputstream = ((java.io.InputStream) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        inputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a()
    {
        long l = System.currentTimeMillis();
        if (l - e >= f)
        {
            Iterator iterator = g.iterator();
            boolean flag = false;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                a a1 = (a)iterator.next();
                if (a1.c() && a1.a())
                {
                    boolean flag1 = true;
                    flag = flag1;
                    if (!a1.c())
                    {
                        h.b(a1.b());
                        flag = flag1;
                    }
                }
            } while (true);
            if (flag)
            {
                d();
                h.a();
                e();
            }
            e = l;
        }
    }

    public final bu b()
    {
        return d;
    }

    public final void c()
    {
        Iterator iterator = g.iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (a1.c() && (a1.e() != null && !a1.e().isEmpty()))
            {
                a1.f();
                flag = true;
            }
        } while (true);
        if (flag)
        {
            d.a(false);
            e();
        }
    }
}
