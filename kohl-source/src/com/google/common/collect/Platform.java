// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.collect:
//            MapMaker

class Platform
{

    private static final Logger logger = Logger.getLogger(com/google/common/collect/Platform.getCanonicalName());

    private Platform()
    {
    }

    static Object[] clone(Object aobj[])
    {
        return (Object[])((Object []) (aobj)).clone();
    }

    static Object[] newArray(Class class1, int i)
    {
        return (Object[])(Object[])Array.newInstance(class1, i);
    }

    static Object[] newArray(Object aobj[], int i)
    {
        return (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i);
    }

    static MapMaker tryWeakKeys(MapMaker mapmaker)
    {
        return mapmaker.weakKeys();
    }

    static void unsafeArrayCopy(Object aobj[], int i, Object aobj1[], int j, int k)
    {
        System.arraycopy(((Object) (aobj)), i, ((Object) (aobj1)), j, k);
    }

}
