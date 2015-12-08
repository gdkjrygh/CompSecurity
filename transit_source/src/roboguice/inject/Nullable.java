// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import roboguice.util.Strings;

public class Nullable
{

    private Nullable()
    {
    }

    public static boolean isNullable(Field field)
    {
        field = field.getAnnotations();
        int j = field.length;
        for (int i = 0; i < j; i++)
        {
            if (Strings.equals("Nullable", field[i].annotationType().getSimpleName()))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean notNullable(Field field)
    {
        return !isNullable(field);
    }
}
