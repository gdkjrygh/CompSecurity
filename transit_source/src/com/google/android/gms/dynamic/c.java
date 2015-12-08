// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.lang.reflect.Field;

// Referenced classes of package com.google.android.gms.dynamic:
//            b

public final class c extends b.a
{

    private final Object mh;

    private c(Object obj)
    {
        mh = obj;
    }

    public static Object b(b b1)
    {
        if (b1 instanceof c)
        {
            return ((c)b1).mh;
        }
        b1 = b1.asBinder();
        Field afield[] = b1.getClass().getDeclaredFields();
        if (afield.length == 1)
        {
            Field field = afield[0];
            if (!field.isAccessible())
            {
                field.setAccessible(true);
                try
                {
                    b1 = ((b) (field.get(b1)));
                }
                // Misplaced declaration of an exception variable
                catch (b b1)
                {
                    throw new IllegalArgumentException("Binder object is null.", b1);
                }
                // Misplaced declaration of an exception variable
                catch (b b1)
                {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", b1);
                }
                // Misplaced declaration of an exception variable
                catch (b b1)
                {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", b1);
                }
                return b1;
            } else
            {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else
        {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }

    public static b g(Object obj)
    {
        return new c(obj);
    }
}
