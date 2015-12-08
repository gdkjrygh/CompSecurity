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
    private static final String aeW;
    private static final String aem;
    private final a aeX;

    public s(a a1)
    {
        super(ID, new String[] {
            aeW
        });
        aeX = a1;
    }

    public boolean lh()
    {
        return false;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        String s1 = dh.j((com.google.android.gms.internal.d.a)map.get(aeW));
        HashMap hashmap = new HashMap();
        map = (com.google.android.gms.internal.d.a)map.get(aem);
        if (map != null)
        {
            map = ((Map) (dh.o(map)));
            if (!(map instanceof Map))
            {
                bh.D("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return dh.nd();
            }
            java.util.Map.Entry entry;
            for (map = ((Map)map).entrySet().iterator(); map.hasNext(); hashmap.put(entry.getKey().toString(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        try
        {
            map = dh.r(aeX.b(s1, hashmap));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            bh.D((new StringBuilder()).append("Custom macro/tag ").append(s1).append(" threw exception ").append(map.getMessage()).toString());
            return dh.nd();
        }
        return map;
    }

    static 
    {
        ID = com.google.android.gms.internal.a.J.toString();
        aeW = b.cy.toString();
        aem = b.aX.toString();
    }
}
