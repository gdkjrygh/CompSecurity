// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;

public final class bye extends byc
{

    private final Object a;

    private bye(Object obj)
    {
        a = obj;
    }

    public static byb a(Object obj)
    {
        return new bye(obj);
    }

    public static Object a(byb byb1)
    {
        if (byb1 instanceof bye)
        {
            return ((bye)byb1).a;
        }
        byb1 = byb1.asBinder();
        Field afield[] = byb1.getClass().getDeclaredFields();
        if (afield.length == 1)
        {
            Field field = afield[0];
            if (!field.isAccessible())
            {
                field.setAccessible(true);
                try
                {
                    byb1 = ((byb) (field.get(byb1)));
                }
                // Misplaced declaration of an exception variable
                catch (byb byb1)
                {
                    throw new IllegalArgumentException("Binder object is null.", byb1);
                }
                // Misplaced declaration of an exception variable
                catch (byb byb1)
                {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", byb1);
                }
                // Misplaced declaration of an exception variable
                catch (byb byb1)
                {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", byb1);
                }
                return byb1;
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
