// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.lang.reflect.Field;

// Referenced classes of package com.google.android.gms.dynamic:
//            d

public final class e extends d.a
{

    private final Object Hw;

    private e(Object obj)
    {
        Hw = obj;
    }

    public static Object d(d d1)
    {
        if (d1 instanceof e)
        {
            return ((e)d1).Hw;
        }
        d1 = d1.asBinder();
        Field afield[] = d1.getClass().getDeclaredFields();
        if (afield.length == 1)
        {
            Field field = afield[0];
            if (!field.isAccessible())
            {
                field.setAccessible(true);
                try
                {
                    d1 = ((d) (field.get(d1)));
                }
                // Misplaced declaration of an exception variable
                catch (d d1)
                {
                    throw new IllegalArgumentException("Binder object is null.", d1);
                }
                // Misplaced declaration of an exception variable
                catch (d d1)
                {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", d1);
                }
                // Misplaced declaration of an exception variable
                catch (d d1)
                {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", d1);
                }
                return d1;
            } else
            {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else
        {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }

    public static d h(Object obj)
    {
        return new e(obj);
    }
}
