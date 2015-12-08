// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.lang.reflect.Field;

// Referenced classes of package com.google.android.gms.b:
//            c

public final class d extends c.a
{

    private final Object a;

    private d(Object obj)
    {
        a = obj;
    }

    public static c a(Object obj)
    {
        return new d(obj);
    }

    public static Object a(c c1)
    {
        if (c1 instanceof d)
        {
            return ((d)c1).a;
        }
        c1 = c1.asBinder();
        Field afield[] = c1.getClass().getDeclaredFields();
        if (afield.length == 1)
        {
            Field field = afield[0];
            if (!field.isAccessible())
            {
                field.setAccessible(true);
                try
                {
                    c1 = ((c) (field.get(c1)));
                }
                // Misplaced declaration of an exception variable
                catch (c c1)
                {
                    throw new IllegalArgumentException("Binder object is null.", c1);
                }
                // Misplaced declaration of an exception variable
                catch (c c1)
                {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", c1);
                }
                // Misplaced declaration of an exception variable
                catch (c c1)
                {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", c1);
                }
                return c1;
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
