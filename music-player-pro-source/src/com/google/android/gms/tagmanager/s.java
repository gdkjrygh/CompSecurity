// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, di, bh

class s extends aj
{
    public static interface a
    {

        public abstract Object b(String s1, Map map);
    }


    private static final String ID;
    private static final String aqO;
    private static final String aqf;
    private final a aqP;

    public s(a a1)
    {
        super(ID, new String[] {
            aqO
        });
        aqP = a1;
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        String s1 = di.j((com.google.android.gms.internal.d.a)map.get(aqO));
        HashMap hashmap = new HashMap();
        map = (com.google.android.gms.internal.d.a)map.get(aqf);
        if (map != null)
        {
            map = ((Map) (di.o(map)));
            if (!(map instanceof Map))
            {
                bh.W("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return di.rb();
            }
            java.util.Map.Entry entry;
            for (map = ((Map)map).entrySet().iterator(); map.hasNext(); hashmap.put(entry.getKey().toString(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        try
        {
            map = di.u(aqP.b(s1, hashmap));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            bh.W((new StringBuilder()).append("Custom macro/tag ").append(s1).append(" threw exception ").append(map.getMessage()).toString());
            return di.rb();
        }
        return map;
    }

    public boolean pe()
    {
        return false;
    }

    static 
    {
        ID = com.google.android.gms.internal.a.L.toString();
        aqO = b.cV.toString();
        aqf = b.bl.toString();
    }
}
