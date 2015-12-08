// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.reflect.Field;

final class eb
{

    private final Field a;

    eb(Field field)
    {
        a = field;
        field.setAccessible(true);
    }

    final void a(Object obj, int i)
    {
        try
        {
            a.set(obj, Integer.valueOf(i));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
    }

    final void a(Object obj, Object obj1)
    {
        try
        {
            a.set(obj, obj1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
    }
}
