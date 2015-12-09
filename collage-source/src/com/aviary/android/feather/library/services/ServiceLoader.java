// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.aviary.android.feather.library.services:
//            IAviaryController, BaseContextService

public class ServiceLoader
{

    final ConcurrentHashMap a = new ConcurrentHashMap();
    final ConcurrentHashMap b = new ConcurrentHashMap();
    IAviaryController c;

    public ServiceLoader(IAviaryController iaviarycontroller)
    {
        c = iaviarycontroller;
    }

    private BaseContextService a(Class class1, IAviaryController iaviarycontroller)
        throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException
    {
        return (BaseContextService)class1.getConstructor(new Class[] {
            com/aviary/android/feather/library/services/IAviaryController
        }).newInstance(new Object[] {
            iaviarycontroller
        });
    }

    private BaseContextService a(String s, IAviaryController iaviarycontroller)
        throws IllegalAccessException, InstantiationException
    {
        Log.i("ServiceLoader", (new StringBuilder()).append("get: ").append(s).toString());
        if (!a.containsKey(s)) goto _L2; else goto _L1
_L1:
        s = (Class)a.get(s);
        s = a(((Class) (s)), iaviarycontroller);
        return s;
        s;
        s.printStackTrace();
_L4:
        return null;
_L2:
        Log.w("ServiceLoader", (new StringBuilder()).append(s).append(" not registered").toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

    public BaseContextService a(BaseContextService basecontextservice)
    {
        String s = basecontextservice.getClass().getName();
        Log.i("ServiceLoader", (new StringBuilder()).append("register: ").append(s).toString());
        return (BaseContextService)b.put(s, basecontextservice);
    }

    public BaseContextService a(Class class1)
        throws IllegalAccessException
    {
        String s = class1.getName();
        if (b.containsKey(s))
        {
            return (BaseContextService)b.get(s);
        }
        if (!a.containsKey(s))
        {
            Log.v("ServiceLoader", "class not yet registered, register it...");
            b(class1);
        }
        try
        {
            class1 = a(s, c);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1.printStackTrace();
            throw new IllegalAccessException(class1.getMessage());
        }
        if (class1 != null)
        {
            a(((BaseContextService) (class1)));
            return class1;
        } else
        {
            Log.w("ServiceLoader", "service is not registered!");
            return null;
        }
    }

    public void a()
    {
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); ((BaseContextService)b.get(iterator.next())).f()) { }
        break MISSING_BLOCK_LABEL_57;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        b.clear();
        return;
        b.clear();
        return;
        obj;
        b.clear();
        throw obj;
    }

    public Class b(Class class1)
    {
        return (Class)a.put(class1.getName(), class1);
    }
}
