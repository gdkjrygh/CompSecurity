// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

final class gww
{

    private static final Comparator b = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (Field)obj;
            obj1 = (Field)obj1;
            return ((Field) (obj)).getName().compareTo(((Field) (obj1)).getName());
        }

    };
    final List a = new ArrayList();

    public gww(Class class1)
    {
        Object obj = class1.getName();
        Object obj1 = ((String) (obj)).substring(0, ((String) (obj)).length() - 8);
        Field afield[];
        int i;
        int j;
        try
        {
            obj1 = Class.forName(((String) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new AssertionError((new StringBuilder("No message class found for builder type ")).append(((String) (obj))).toString());
        }
        afield = ((Class) (obj1)).getDeclaredFields();
        j = afield.length;
        i = 0;
        while (i < j) 
        {
            obj = afield[i];
            gxj gxj1 = (gxj)((Field) (obj)).getAnnotation(gxj);
            if (gxj1 != null && gxj1.c() == com.squareup.wire.Message.Label.REQUIRED)
            {
                try
                {
                    a.add(class1.getField(((Field) (obj)).getName()));
                }
                // Misplaced declaration of an exception variable
                catch (Class class1)
                {
                    throw new AssertionError((new StringBuilder("No builder field found for message field ")).append(((Field) (obj)).getName()).toString());
                }
            }
            i++;
        }
        Collections.sort(a, b);
    }

}
