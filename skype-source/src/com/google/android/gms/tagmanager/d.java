// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import com.google.android.gms.common.api.e;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.gms.tagmanager:
//            c, cf, de, ak, 
//            di, bz, da, db, 
//            bg, by

public class d
{
    public static interface a
    {

        public abstract db a(Context context, d d1, String s, de de1);
    }


    private static d g;
    private final a a;
    private final Context b;
    private final c c;
    private final by d;
    private final ConcurrentMap e = new ConcurrentHashMap();
    private final de f = new de();

    private d(Context context, a a1, c c1, by by1)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        }
        b = context.getApplicationContext();
        d = by1;
        a = a1;
        c = c1;
        c.a(new c.b() {

            final d a;

            public final void a(Map map)
            {
                map = ((Map) (map.get("event")));
                if (map != null)
                {
                    d.a(a, map.toString());
                }
            }

            
            {
                a = d.this;
                super();
            }
        });
        c.a(new cf(b));
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b.registerComponentCallbacks(new ComponentCallbacks2() {

                final d a;

                public final void onConfigurationChanged(Configuration configuration)
                {
                }

                public final void onLowMemory()
                {
                }

                public final void onTrimMemory(int i)
                {
                    if (i == 20)
                    {
                        a.b();
                    }
                }

            
            {
                a = d.this;
                super();
            }
            });
        }
    }

    public static d a(Context context)
    {
        com/google/android/gms/tagmanager/d;
        JVM INSTR monitorenter ;
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        ak.a("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
        context;
        com/google/android/gms/tagmanager/d;
        JVM INSTR monitorexit ;
        throw context;
        g = new d(context, new a() {

            public final db a(Context context1, d d1, String s, de de1)
            {
                return new db(context1, d1, s, de1);
            }

        }, new c(new di(context)), bz.c());
        context = g;
        com/google/android/gms/tagmanager/d;
        JVM INSTR monitorexit ;
        return context;
    }

    static void a(d d1, String s)
    {
        for (d1 = d1.e.keySet().iterator(); d1.hasNext(); ((da)d1.next()).a(s)) { }
    }

    public final e a(String s, String s1)
    {
        s = a.a(b, this, s, f);
        s.a(s1);
        return s;
    }

    public final c a()
    {
        return c;
    }

    final void a(da da1)
    {
        e.put(da1, Boolean.valueOf(true));
    }

    final boolean a(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = bg.a();
        if (!((bg) (obj)).a(uri)) goto _L2; else goto _L1
_L1:
        int i;
        uri = ((bg) (obj)).d();
        static final class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[bg.a.values().length];
                try
                {
                    a[bg.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[bg.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[bg.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        i = _cls4.a[((bg) (obj)).b().ordinal()];
        i;
        JVM INSTR tableswitch 1 3: default 60
    //                   1 68
    //                   2 130
    //                   3 130;
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
            da da1 = (da)((Iterator) (obj)).next();
            if (da1.d().equals(uri))
            {
                da1.b(null);
                da1.c();
            }
        }
          goto _L3
        uri;
        throw uri;
_L5:
        Iterator iterator = e.keySet().iterator();
_L7:
        da da2;
        while (iterator.hasNext()) 
        {
            da2 = (da)iterator.next();
            if (!da2.d().equals(uri))
            {
                continue; /* Loop/switch isn't completed */
            }
            da2.b(((bg) (obj)).c());
            da2.c();
        }
          goto _L3
        if (da2.e() == null) goto _L7; else goto _L6
_L6:
        da2.b(null);
        da2.c();
        if (true) goto _L7; else goto _L8
_L8:
          goto _L3
_L2:
        flag = false;
          goto _L9
    }

    public final void b()
    {
        d.a();
    }

    final boolean b(da da1)
    {
        return e.remove(da1) != null;
    }
}
