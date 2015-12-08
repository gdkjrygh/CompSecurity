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
//            EventBusException, ThreadMode, SubscriberMethod, EventBus

class SubscriberMethodFinder
{

    private static final Map methodCache = new HashMap();
    private final Map skipMethodVerificationForClasses = new ConcurrentHashMap();

    SubscriberMethodFinder(List list)
    {
        if (list != null)
        {
            Class class1;
            for (list = list.iterator(); list.hasNext(); skipMethodVerificationForClasses.put(class1, class1))
            {
                class1 = (Class)list.next();
            }

        }
    }

    List findSubscriberMethods(Class class1)
    {
        String s1;
        s1 = class1.getName();
        List list;
        synchronized (methodCache)
        {
            list = (List)methodCache.get(s1);
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
        class2 = class1;
        hashset = new HashSet();
        stringbuilder = new StringBuilder();
_L14:
        Method amethod[];
        int i;
        int j;
label0:
        {
            if (class2 != null)
            {
                String s = class2.getName();
                if (!s.startsWith("java.") && !s.startsWith("javax.") && !s.startsWith("android."))
                {
                    break label0;
                }
            }
            if (arraylist.isEmpty())
            {
                throw new EventBusException((new StringBuilder()).append("Subscriber ").append(class1).append(" has no public methods called ").append("onEvent").toString());
            }
            break; /* Loop/switch isn't completed */
        }
        amethod = class2.getDeclaredMethods();
        j = amethod.length;
        i = 0;
_L6:
        Method method;
        String s2;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_474;
        }
        method = amethod[i];
        s2 = method.getName();
        if (!s2.startsWith("onEvent")) goto _L2; else goto _L1
_L1:
        Class aclass[];
        int k = method.getModifiers();
        if ((k & 1) == 0 || (k & 0x1448) != 0)
        {
            break MISSING_BLOCK_LABEL_422;
        }
        aclass = method.getParameterTypes();
        if (aclass.length != 1) goto _L2; else goto _L3
_L3:
        Object obj = s2.substring("onEvent".length());
        if (((String) (obj)).length() != 0) goto _L5; else goto _L4
_L4:
        obj = ThreadMode.PostThread;
_L8:
        Class class3 = aclass[0];
        stringbuilder.setLength(0);
        stringbuilder.append(s2);
        stringbuilder.append('>').append(class3.getName());
        if (hashset.add(stringbuilder.toString()))
        {
            arraylist.add(new SubscriberMethod(method, ((ThreadMode) (obj)), class3));
        }
_L2:
        i++;
          goto _L6
_L5:
label1:
        {
            if (!((String) (obj)).equals("MainThread"))
            {
                break label1;
            }
            obj = ThreadMode.MainThread;
        }
        if (true) goto _L8; else goto _L7
_L7:
label2:
        {
            if (!((String) (obj)).equals("BackgroundThread"))
            {
                break label2;
            }
            obj = ThreadMode.BackgroundThread;
        }
        if (true) goto _L8; else goto _L9
_L9:
        if (!((String) (obj)).equals("Async")) goto _L11; else goto _L10
_L10:
        obj = ThreadMode.Async;
          goto _L8
_L11:
        if (skipMethodVerificationForClasses.containsKey(class2)) goto _L2; else goto _L12
_L12:
        throw new EventBusException((new StringBuilder()).append("Illegal onEvent method, check for typos: ").append(method).toString());
        if (!skipMethodVerificationForClasses.containsKey(class2))
        {
            Log.d(EventBus.TAG, (new StringBuilder()).append("Skipping method (not public, static or abstract): ").append(class2).append(".").append(s2).toString());
        }
          goto _L2
        class2 = class2.getSuperclass();
        if (true) goto _L14; else goto _L13
_L13:
        synchronized (methodCache)
        {
            methodCache.put(s1, arraylist);
        }
        return arraylist;
        exception;
        class1;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
