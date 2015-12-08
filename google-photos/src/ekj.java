// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ekj
{

    private static final Map a = new HashMap();

    private static Class a(String s)
    {
        ekj;
        JVM INSTR monitorenter ;
        Class class2 = (Class)a.get(s);
        Class class1;
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        class1 = Class.forName(s);
        a.put(s, class1);
        ekj;
        JVM INSTR monitorexit ;
        return class1;
        s;
        throw new RuntimeException("Failed to instantiate Feature class", s);
        s;
        ekj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static List a(String as[])
    {
        if (as != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList(as.length);
        int j = as.length;
        int i = 0;
        do
        {
            obj = arraylist;
            if (i >= j)
            {
                continue;
            }
            arraylist.add(a(as[i]));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String[] a(Collection collection)
    {
        if (collection == null)
        {
            return null;
        }
        String as[] = new String[collection.size()];
        collection = collection.iterator();
        for (int i = 0; collection.hasNext(); i++)
        {
            as[i] = ((Class)collection.next()).getName();
        }

        return as;
    }

}
