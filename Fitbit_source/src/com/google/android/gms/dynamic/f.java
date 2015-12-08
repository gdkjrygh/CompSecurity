// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.lang.reflect.Field;

// Referenced classes of package com.google.android.gms.dynamic:
//            e

public final class f extends e.a
{

    private final Object a;

    private f(Object obj)
    {
        a = obj;
    }

    public static e a(Object obj)
    {
        return new f(obj);
    }

    public static Object a(e e1)
    {
        if (e1 instanceof f)
        {
            return ((f)e1).a;
        }
        e1 = e1.asBinder();
        Field afield[] = e1.getClass().getDeclaredFields();
        if (afield.length == 1)
        {
            Field field = afield[0];
            if (!field.isAccessible())
            {
                field.setAccessible(true);
                try
                {
                    e1 = ((e) (field.get(e1)));
                }
                // Misplaced declaration of an exception variable
                catch (e e1)
                {
                    throw new IllegalArgumentException("Binder object is null.", e1);
                }
                // Misplaced declaration of an exception variable
                catch (e e1)
                {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e1);
                }
                // Misplaced declaration of an exception variable
                catch (e e1)
                {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e1);
                }
                return e1;
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
