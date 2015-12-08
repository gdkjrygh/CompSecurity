// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cj, cl, ak, v, 
//            ca, dl

class cv extends cj
{
    public static interface a
    {

        public abstract v a();
    }


    static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final Set f = new HashSet();
    private final a g;
    private final Context h;

    public cv(Context context)
    {
        this(context, new a(context) {

            final Context a;

            public final v a()
            {
                return dl.a(a);
            }

            
            {
                a = context;
                super();
            }
        });
    }

    private cv(Context context, a a1)
    {
        super(b, new String[] {
            c
        });
        g = a1;
        h = context;
    }

    private boolean a(String s)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = f.contains(s);
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (h.getSharedPreferences(a, 0).contains(s))
        {
            f.add(s);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_60;
        s;
        throw s;
        flag = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void b(Map map)
    {
        String s;
        if (map.get(e) != null)
        {
            s = cl.a((com.google.android.gms.internal.h.a)map.get(e));
        } else
        {
            s = null;
        }
        if (s == null || !a(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.net.Uri.Builder builder = Uri.parse(cl.a((com.google.android.gms.internal.h.a)map.get(c))).buildUpon();
        map = (com.google.android.gms.internal.h.a)map.get(d);
        if (map != null)
        {
            map = ((Map) (com.google.android.gms.tagmanager.cl.e(map)));
            if (!(map instanceof List))
            {
                ak.a((new StringBuilder("ArbitraryPixel: additional params not a list: not sending partial hit: ")).append(builder.build().toString()).toString());
                return;
            }
            for (map = ((List)map).iterator(); map.hasNext();)
            {
                Object obj = map.next();
                if (!(obj instanceof Map))
                {
                    ak.a((new StringBuilder("ArbitraryPixel: additional params contains non-map: not sending partial hit: ")).append(builder.build().toString()).toString());
                    return;
                }
                obj = ((Map)obj).entrySet().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                    builder.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                }
            }

        }
        map = builder.build().toString();
        g.a().a(map);
        ak.b();
        if (s == null) goto _L1; else goto _L3
_L3:
        com/google/android/gms/tagmanager/cv;
        JVM INSTR monitorenter ;
        f.add(s);
        ca.a(h, a, s, "true");
        com/google/android/gms/tagmanager/cv;
        JVM INSTR monitorexit ;
        return;
        map;
        com/google/android/gms/tagmanager/cv;
        JVM INSTR monitorexit ;
        throw map;
    }

    static 
    {
        b = e.aj.toString();
        c = f.dn.toString();
        d = f.d.toString();
        e = f.dm.toString();
        a = (new StringBuilder("gtm_")).append(b).append("_unrepeatable").toString();
    }
}
