// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;

public final class kon extends kol
{

    private final Object a;

    private kon(Object obj)
    {
        a = obj;
    }

    public static Object a(kok kok1)
    {
        if (kok1 instanceof kon)
        {
            return ((kon)kok1).a;
        }
        kok1 = kok1.asBinder();
        Field afield[] = kok1.getClass().getDeclaredFields();
        if (afield.length == 1)
        {
            Field field = afield[0];
            if (!field.isAccessible())
            {
                field.setAccessible(true);
                try
                {
                    kok1 = ((kok) (field.get(kok1)));
                }
                // Misplaced declaration of an exception variable
                catch (kok kok1)
                {
                    throw new IllegalArgumentException("Binder object is null.", kok1);
                }
                // Misplaced declaration of an exception variable
                catch (kok kok1)
                {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", kok1);
                }
                // Misplaced declaration of an exception variable
                catch (kok kok1)
                {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", kok1);
                }
                return kok1;
            } else
            {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else
        {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }

    public static kok a(Object obj)
    {
        return new kon(obj);
    }
}
