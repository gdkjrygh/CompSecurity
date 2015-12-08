// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package de.greenrobot.event:
//            ThreadMode, j, EventBusException, c

final class k
{

    private static final Map a = new HashMap();
    private final Map b = new ConcurrentHashMap();

    k(List list)
    {
        if (list != null)
        {
            Class class1;
            for (list = list.iterator(); list.hasNext(); b.put(class1, class1))
            {
                class1 = (Class)list.next();
            }

        }
    }

    final List a(Class class1)
    {
        String s1;
        s1 = class1.getName();
        List list;
        synchronized (a)
        {
            list = (List)a.get(s1);
        }
        if (list != null)
        {
            return list;
        }
        break MISSING_BLOCK_LABEL_39;
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
        Class class2;
        ArrayList arraylist;
        HashSet hashset;
        StringBuilder stringbuilder;
        arraylist = new ArrayList();
        hashset = new HashSet();
        stringbuilder = new StringBuilder();
        class2 = class1;
_L14:
        Method amethod[];
        int i;
        int l;
        if (class2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        String s = class2.getName();
        if (s.startsWith("java.") || s.startsWith("javax.") || s.startsWith("android."))
        {
            break; /* Loop/switch isn't completed */
        }
        amethod = class2.getDeclaredMethods();
        l = amethod.length;
        i = 0;
_L6:
        Method method;
        String s2;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_418;
        }
        method = amethod[i];
        s2 = method.getName();
        if (!s2.startsWith("onEvent")) goto _L2; else goto _L1
_L1:
        Class aclass[];
        int i1 = method.getModifiers();
        if ((i1 & 1) == 0 || (i1 & 0x1448) != 0)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        aclass = method.getParameterTypes();
        if (aclass.length != 1) goto _L2; else goto _L3
_L3:
        Object obj = s2.substring(7);
        if (((String) (obj)).length() != 0) goto _L5; else goto _L4
_L4:
        obj = ThreadMode.a;
_L8:
        Class class3 = aclass[0];
        stringbuilder.setLength(0);
        stringbuilder.append(s2);
        stringbuilder.append('>').append(class3.getName());
        if (hashset.add(stringbuilder.toString()))
        {
            arraylist.add(new j(method, ((ThreadMode) (obj)), class3));
        }
_L2:
        i++;
          goto _L6
_L5:
label0:
        {
            if (!((String) (obj)).equals("MainThread"))
            {
                break label0;
            }
            obj = ThreadMode.b;
        }
        if (true) goto _L8; else goto _L7
_L7:
label1:
        {
            if (!((String) (obj)).equals("BackgroundThread"))
            {
                break label1;
            }
            obj = ThreadMode.c;
        }
        if (true) goto _L8; else goto _L9
_L9:
        if (!((String) (obj)).equals("Async")) goto _L11; else goto _L10
_L10:
        obj = ThreadMode.d;
          goto _L8
_L11:
        if (b.containsKey(class2)) goto _L2; else goto _L12
_L12:
        throw new EventBusException((new StringBuilder("Illegal onEvent method, check for typos: ")).append(method).toString());
        if (!b.containsKey(class2))
        {
            Log.d(c.a, (new StringBuilder("Skipping method (not public, static or abstract): ")).append(class2).append(".").append(s2).toString());
        }
          goto _L2
        class2 = class2.getSuperclass();
        if (true) goto _L14; else goto _L13
_L13:
        if (arraylist.isEmpty())
        {
            throw new EventBusException((new StringBuilder("Subscriber ")).append(class1).append(" has no public methods called onEvent").toString());
        }
        synchronized (a)
        {
            a.put(s1, arraylist);
        }
        return arraylist;
        exception;
        class1;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
