// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.lang.reflect.Field;

final class s
{
    static final class a
    {

        final Field a;

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

        private a(Field field)
        {
            a = field;
            field.setAccessible(true);
        }

        a(Field field, byte byte0)
        {
            this(field);
        }
    }


    static a a(Class class1, String s1)
    {
        try
        {
            class1 = new a(class1.getDeclaredField(s1), (byte)0);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new AssertionError(class1);
        }
        return class1;
    }
}
