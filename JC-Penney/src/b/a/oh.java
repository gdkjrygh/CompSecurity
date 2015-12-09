// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.lang.reflect.Field;

// Referenced classes of package b.a:
//            de

public final class oh
{

    public static Object a(Field field, Object obj)
    {
        while (field == null || field == null) 
        {
            return null;
        }
        field.setAccessible(true);
        try
        {
            field = ((Field) (field.get(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Field field)
        {
            throw field;
        }
        // Misplaced declaration of an exception variable
        catch (Field field)
        {
            throw new de("Unable to get value of field", field);
        }
        return field;
    }

    public static Field a(Class class1, Class class2, boolean flag)
    {
        Field afield[] = class1.getDeclaredFields();
        class1 = null;
        for (int i = 0; i < afield.length;)
        {
            Object obj = class1;
            if (class2.isAssignableFrom(afield[i].getType()))
            {
                if (class1 != null)
                {
                    throw new de((new StringBuilder("Field is ambiguous: ")).append(class1.getName()).append(", ").append(afield[i].getName()).toString());
                }
                obj = afield[i];
            }
            i++;
            class1 = ((Class) (obj));
        }

        if (class1 == null)
        {
            if (flag)
            {
                throw new de((new StringBuilder("Could not find field matching type: ")).append(class2.getName()).toString());
            }
        } else
        {
            class1.setAccessible(true);
        }
        return class1;
    }
}
