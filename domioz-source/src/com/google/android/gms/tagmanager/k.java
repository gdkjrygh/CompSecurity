// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.gms.tagmanager:
//            l, c, bc, bl, 
//            n, y, m, bn, 
//            ax, bi, aw, aj, 
//            o, p

public class k
{

    private static k g;
    private final p a;
    private final Context b;
    private final c c;
    private final aw d;
    private final ConcurrentMap e = new ConcurrentHashMap();
    private final bl f = new bl();

    private k(Context context, p p, c c1, aw aw1)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        }
        b = context.getApplicationContext();
        d = aw1;
        a = p;
        c = c1;
        c.a(new l(this));
        c.a(new bc(b));
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b.registerComponentCallbacks(new n(this));
        }
    }

    public static k a(Context context)
    {
        com/google/android/gms/tagmanager/k;
        JVM INSTR monitorenter ;
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        y.a("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
        context;
        com/google/android/gms/tagmanager/k;
        JVM INSTR monitorexit ;
        throw context;
        g = new k(context, new m(), new c(new bn(context)), ax.b());
        context = g;
        com/google/android/gms/tagmanager/k;
        JVM INSTR monitorexit ;
        return context;
    }

    static void a(k k1, String s)
    {
        for (k1 = k1.e.keySet().iterator(); k1.hasNext(); ((bi)k1.next()).a(s)) { }
    }

    public final void a()
    {
        d.a();
    }

    final boolean a(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = aj.a();
        if (!((aj) (obj)).a(uri)) goto _L2; else goto _L1
_L1:
        int i;
        uri = ((aj) (obj)).d();
        i = o.a[((aj) (obj)).b() - 1];
        i;
        JVM INSTR tableswitch 1 3: default 60
    //                   1 68
    //                   2 129
    //                   3 129;
           goto _L3 _L4 _L5 _L5
_L3:
        boolean flag = true;
_L9:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        obj = e.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            bi bi1 = (bi)((Iterator) (obj)).next();
            if (bi1.d().equals(uri))
            {
                bi1.e();
                bi1.c();
            }
        }
          goto _L3
        uri;
        throw uri;
_L5:
        Iterator iterator = e.keySet().iterator();
_L7:
        bi bi2;
        while (iterator.hasNext()) 
        {
            bi2 = (bi)iterator.next();
            if (!bi2.d().equals(uri))
            {
                continue; /* Loop/switch isn't completed */
            }
            ((aj) (obj)).c();
            bi2.e();
            bi2.c();
        }
          goto _L3
        if (bi2.f() == null) goto _L7; else goto _L6
_L6:
        bi2.e();
        bi2.c();
        if (true) goto _L7; else goto _L8
_L8:
          goto _L3
_L2:
        flag = false;
          goto _L9
    }

    final boolean a(bi bi1)
    {
        return e.remove(bi1) != null;
    }
}
