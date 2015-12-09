// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.a;

import java.lang.reflect.Field;

// Referenced classes of package com.google.android.gms.a:
//            a

public final class b extends a.a
{

    private final Object a;

    private b(Object obj)
    {
        a = obj;
    }

    public static a a(Object obj)
    {
        return new b(obj);
    }

    public static Object a(a a1)
    {
        if (a1 instanceof b)
        {
            return ((b)a1).a;
        }
        a1 = a1.asBinder();
        Field afield[] = a1.getClass().getDeclaredFields();
        if (afield.length == 1)
        {
            Field field = afield[0];
            if (!field.isAccessible())
            {
                field.setAccessible(true);
                try
                {
                    a1 = ((a) (field.get(a1)));
                }
                // Misplaced declaration of an exception variable
                catch (a a1)
                {
                    throw new IllegalArgumentException("Binder object is null.", a1);
                }
                // Misplaced declaration of an exception variable
                catch (a a1)
                {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", a1);
                }
                // Misplaced declaration of an exception variable
                catch (a a1)
                {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", a1);
                }
                return a1;
            } else
            {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else
        {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }
}
