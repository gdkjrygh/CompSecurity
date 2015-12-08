// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl, ak

final class df extends o
{
    public static interface a
    {

        public abstract Object a(String s);
    }


    private static final String a;
    private static final String b;
    private static final String c;
    private final a d;

    public df(a a1)
    {
        super(a, new String[] {
            b
        });
        d = a1;
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        String s = cl.a((com.google.android.gms.internal.h.a)map.get(b));
        HashMap hashmap = new HashMap();
        map = (com.google.android.gms.internal.h.a)map.get(c);
        if (map != null)
        {
            map = ((Map) (com.google.android.gms.tagmanager.cl.e(map)));
            if (!(map instanceof Map))
            {
                ak.b("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return com.google.android.gms.tagmanager.cl.f();
            }
            java.util.Map.Entry entry;
            for (map = ((Map)map).entrySet().iterator(); map.hasNext(); hashmap.put(entry.getKey().toString(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        try
        {
            map = cl.a(d.a(s));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            ak.b((new StringBuilder("Custom macro/tag ")).append(s).append(" threw exception ").append(map.getMessage()).toString());
            return com.google.android.gms.tagmanager.cl.f();
        }
        return map;
    }

    public final boolean a()
    {
        return false;
    }

    static 
    {
        a = e.r.toString();
        b = f.ba.toString();
        c = f.d.toString();
    }
}
