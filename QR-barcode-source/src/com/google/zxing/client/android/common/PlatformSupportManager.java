// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.common;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public abstract class PlatformSupportManager
{

    private static final String TAG = com/google/zxing/client/android/common/PlatformSupportManager.getSimpleName();
    private final Object defaultImplementation;
    private final SortedMap implementations;
    private final Class managedInterface;

    protected PlatformSupportManager(Class class1, Object obj)
    {
        if (!class1.isInterface())
        {
            throw new IllegalArgumentException();
        }
        if (!class1.isInstance(obj))
        {
            throw new IllegalArgumentException();
        } else
        {
            managedInterface = class1;
            defaultImplementation = obj;
            implementations = new TreeMap(Collections.reverseOrder());
            return;
        }
    }

    protected final void addImplementationClass(int i, String s)
    {
        implementations.put(Integer.valueOf(i), s);
    }

    public final Object build()
    {
        Iterator iterator = implementations.keySet().iterator();
_L2:
        Object obj;
        Object obj2;
        do
        {
            if (!iterator.hasNext())
            {
                Log.i(TAG, (new StringBuilder("Using default implementation ")).append(defaultImplementation.getClass()).append(" of ").append(managedInterface).toString());
                return defaultImplementation;
            }
            obj = (Integer)iterator.next();
        } while (android.os.Build.VERSION.SDK_INT < ((Integer) (obj)).intValue());
        obj2 = (String)implementations.get(obj);
        obj2 = Class.forName(((String) (obj2))).asSubclass(managedInterface);
        Log.i(TAG, (new StringBuilder("Using implementation ")).append(obj2).append(" of ").append(managedInterface).append(" for SDK ").append(obj).toString());
        obj = ((Class) (obj2)).getConstructor(new Class[0]).newInstance(new Object[0]);
        return obj;
        Object obj1;
        obj1;
        Log.w(TAG, ((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.w(TAG, ((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.w(TAG, ((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.w(TAG, ((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.w(TAG, ((Throwable) (obj1)));
        if (true) goto _L2; else goto _L1
_L1:
    }

}
