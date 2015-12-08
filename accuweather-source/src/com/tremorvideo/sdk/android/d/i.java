// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.d;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.tremorvideo.sdk.android.d:
//            j, k, l, m, 
//            v, e

class i
{
    private static interface a
    {

        public abstract e a(Map map, v v);
    }


    private static Map a;

    static e a(String s, Map map, v v)
    {
        s = (a)a.get(s);
        if (s != null)
        {
            return s.a(map, v);
        } else
        {
            return null;
        }
    }

    static 
    {
        a = new HashMap();
        a.put("close", new j());
        a.put("expand", new k());
        a.put("usecustomclose", new l());
        a.put("open", new m());
    }
}
