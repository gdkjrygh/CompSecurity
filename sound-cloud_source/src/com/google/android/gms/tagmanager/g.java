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
//            h, c, R, Y, 
//            j, s, i, aa, 
//            M, X, C, L

public class g
{
    public static interface a
    {
    }


    private static g g;
    final L a;
    final ConcurrentMap b = new ConcurrentHashMap();
    private final a c;
    private final Context d;
    private final c e;
    private final Y f = new Y();

    private g(Context context, a a1, c c1, L l)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        }
        d = context.getApplicationContext();
        a = l;
        c = a1;
        e = c1;
        e.a(new h(this));
        e.a(new R(d));
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            d.registerComponentCallbacks(new j(this));
        }
    }

    public static g a(Context context)
    {
        com/google/android/gms/tagmanager/g;
        JVM INSTR monitorenter ;
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        s.a();
        throw new NullPointerException();
        context;
        com/google/android/gms/tagmanager/g;
        JVM INSTR monitorexit ;
        throw context;
        g = new g(context, new i(), new c(new aa(context)), M.b());
        context = g;
        com/google/android/gms/tagmanager/g;
        JVM INSTR monitorexit ;
        return context;
    }

    static void a(g g1, String s1)
    {
        for (g1 = g1.b.keySet().iterator(); g1.hasNext(); ((X)g1.next()).a(s1)) { }
    }

    final boolean a(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = C.a();
        if (!((C) (obj)).a(uri)) goto _L2; else goto _L1
_L1:
        String s1;
        int k;
        s1 = ((C) (obj)).b;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[C.a.a().length];
                try
                {
                    a[C.a.a - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[C.a.b - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[C.a.c - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        k = _cls1.a[((C) (obj)).a - 1];
        k;
        JVM INSTR tableswitch 1 3: default 60
    //                   1 68
    //                   2 129
    //                   3 129;
           goto _L3 _L4 _L5 _L5
_L3:
        boolean flag = true;
_L14:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        uri = b.keySet().iterator();
        while (uri.hasNext()) 
        {
            obj = (X)uri.next();
            if (((X) (obj)).b().equals(s1))
            {
                ((X) (obj)).c();
                ((X) (obj)).a();
            }
        }
          goto _L3
        uri;
        throw uri;
_L5:
        Iterator iterator = b.keySet().iterator();
_L9:
        if (!iterator.hasNext()) goto _L3; else goto _L6
_L6:
        X x = (X)iterator.next();
        if (!x.b().equals(s1)) goto _L8; else goto _L7
_L7:
        uri = ((C) (obj)).c;
        x.c();
        x.a();
          goto _L9
_L8:
        if (!x.b) goto _L11; else goto _L10
_L10:
        s.a();
        uri = "";
_L13:
        if (uri == null) goto _L9; else goto _L12
_L12:
        x.c();
        x.a();
          goto _L9
_L11:
        uri = x.a.a();
          goto _L13
_L2:
        flag = false;
          goto _L14
    }
}
