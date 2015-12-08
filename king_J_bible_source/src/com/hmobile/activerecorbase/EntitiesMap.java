// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.activerecorbase;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

// Referenced classes of package com.hmobile.activerecorbase:
//            ActiveRecordBase

class EntitiesMap
{

    WeakHashMap _map;
    private Map map;

    EntitiesMap()
    {
        map = new HashMap();
        _map = new WeakHashMap();
    }

    private String makeKey(Class class1, long l)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(class1.getName()).append(l);
        return stringbuilder.toString();
    }

    ActiveRecordBase get(Class class1, long l)
    {
        class1 = makeKey(class1, l);
        class1 = (WeakReference)map.get(class1);
        if (class1 == null)
        {
            return null;
        } else
        {
            return (ActiveRecordBase)class1.get();
        }
    }

    void set(ActiveRecordBase activerecordbase)
    {
        String s = makeKey(activerecordbase.getClass(), activerecordbase.getID());
        map.put(s, new WeakReference(activerecordbase));
    }
}
