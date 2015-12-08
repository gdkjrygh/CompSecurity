// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.lang.reflect.Field;

// Referenced classes of package com.google.android.gms.b:
//            k, j

public final class m extends k
{

    private final Object a;

    private m(Object obj)
    {
        a = obj;
    }

    public static j a(Object obj)
    {
        return new m(obj);
    }

    public static Object a(j j1)
    {
        if (j1 instanceof m)
        {
            return ((m)j1).a;
        }
        j1 = j1.asBinder();
        Field afield[] = j1.getClass().getDeclaredFields();
        if (afield.length == 1)
        {
            Field field = afield[0];
            if (!field.isAccessible())
            {
                field.setAccessible(true);
                try
                {
                    j1 = ((j) (field.get(j1)));
                }
                // Misplaced declaration of an exception variable
                catch (j j1)
                {
                    throw new IllegalArgumentException("Binder object is null.", j1);
                }
                // Misplaced declaration of an exception variable
                catch (j j1)
                {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", j1);
                }
                // Misplaced declaration of an exception variable
                catch (j j1)
                {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", j1);
                }
                return j1;
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
