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
//            aj, dh, bh

class s extends aj
{
    public static interface a
    {

        public abstract Object b(String s1, Map map);
    }


    private static final String ID;
    private static final String WC;
    private static final String Xn;
    private final a Xo;

    public s(a a1)
    {
        super(ID, new String[] {
            Xn
        });
        Xo = a1;
    }

    public boolean jX()
    {
        return false;
    }

    public com.google.android.gms.internal.d.a x(Map map)
    {
        String s1 = dh.j((com.google.android.gms.internal.d.a)map.get(Xn));
        HashMap hashmap = new HashMap();
        map = (com.google.android.gms.internal.d.a)map.get(WC);
        if (map != null)
        {
            map = ((Map) (dh.o(map)));
            if (!(map instanceof Map))
            {
                bh.z("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return dh.lT();
            }
            java.util.Map.Entry entry;
            for (map = ((Map)map).entrySet().iterator(); map.hasNext(); hashmap.put(entry.getKey().toString(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        try
        {
            map = dh.r(Xo.b(s1, hashmap));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            bh.z((new StringBuilder()).append("Custom macro/tag ").append(s1).append(" threw exception ").append(map.getMessage()).toString());
            return dh.lT();
        }
        return map;
    }

    static 
    {
        ID = com.google.android.gms.internal.a.J.toString();
        Xn = b.cy.toString();
        WC = b.aX.toString();
    }
}
