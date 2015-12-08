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
//            k, b, aw, be, 
//            t, l, bg, bc, 
//            ae, m, af, n

public class j
{

    private static j f;
    private final n a;
    private final Context b;
    private final b c;
    private final ConcurrentMap d;
    private final be e;

    private j(Context context, n n, b b1)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        } else
        {
            b = context.getApplicationContext();
            a = n;
            d = new ConcurrentHashMap();
            c = b1;
            c.a(new k(this));
            c.a(new aw(b));
            e = new be();
            return;
        }
    }

    public static j a(Context context)
    {
        com/google/android/gms/tagmanager/j;
        JVM INSTR monitorenter ;
        if (f != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        t.a("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
        context;
        com/google/android/gms/tagmanager/j;
        JVM INSTR monitorexit ;
        throw context;
        f = new j(context, new l(), new b(new bg(context)));
        context = f;
        com/google/android/gms/tagmanager/j;
        JVM INSTR monitorexit ;
        return context;
    }

    static void a(j j1, String s)
    {
        for (j1 = j1.d.keySet().iterator(); j1.hasNext(); ((bc)j1.next()).a(s)) { }
    }

    final boolean a(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = ae.a();
        if (!((ae) (obj)).a(uri)) goto _L2; else goto _L1
_L1:
        int i;
        uri = ((ae) (obj)).d();
        i = m.a[((ae) (obj)).b().ordinal()];
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
        obj = d.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            bc bc1 = (bc)((Iterator) (obj)).next();
            if (bc1.b().equals(uri))
            {
                bc1.c();
                bc1.a();
            }
        }
          goto _L3
        uri;
        throw uri;
_L5:
        Iterator iterator = d.keySet().iterator();
_L7:
        bc bc2;
        while (iterator.hasNext()) 
        {
            bc2 = (bc)iterator.next();
            if (!bc2.b().equals(uri))
            {
                continue; /* Loop/switch isn't completed */
            }
            ((ae) (obj)).c();
            bc2.c();
            bc2.a();
        }
          goto _L3
        if (bc2.d() == null) goto _L7; else goto _L6
_L6:
        bc2.c();
        bc2.a();
        if (true) goto _L7; else goto _L8
_L8:
          goto _L3
_L2:
        flag = false;
          goto _L9
    }
}
