// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import org.apache.commons.lang3.ClassUtils;

abstract class MemberUtils
{

    private static final int ACCESS_TEST = 7;
    private static final Class ORDERED_PRIMITIVE_TYPES[];

    MemberUtils()
    {
    }

    static int compareParameterTypes(Class aclass[], Class aclass1[], Class aclass2[])
    {
        float f = getTotalTransformationCost(aclass2, aclass);
        float f1 = getTotalTransformationCost(aclass2, aclass1);
        if (f < f1)
        {
            return -1;
        }
        return f1 >= f ? 0 : 1;
    }

    private static float getObjectTransformationCost(Class class1, Class class2)
    {
        if (!class2.isPrimitive()) goto _L2; else goto _L1
_L1:
        float f1 = getPrimitivePromotionCost(class1, class2);
_L4:
        return f1;
_L2:
        f1 = 0.0F;
        do
        {
label0:
            {
                float f = f1;
                if (class1 != null)
                {
                    f = f1;
                    if (!class2.equals(class1))
                    {
                        if (!class2.isInterface() || !ClassUtils.isAssignable(class1, class2))
                        {
                            break label0;
                        }
                        f = f1 + 0.25F;
                    }
                }
                f1 = f;
                if (class1 == null)
                {
                    return f + 1.5F;
                }
            }
            if (true)
            {
                continue;
            }
            f1++;
            class1 = class1.getSuperclass();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static float getPrimitivePromotionCost(Class class1, Class class2)
    {
        float f = 0.0F;
        Class class3 = class1;
        class1 = class3;
        if (!class3.isPrimitive())
        {
            f = 0.0F + 0.1F;
            class1 = ClassUtils.wrapperToPrimitive(class3);
        }
        int i = 0;
        float f1;
        for (f1 = f; class1 != class2 && i < ORDERED_PRIMITIVE_TYPES.length; f1 = f)
        {
            Class class4 = class1;
            f = f1;
            if (class1 == ORDERED_PRIMITIVE_TYPES[i])
            {
                f1 += 0.1F;
                class4 = class1;
                f = f1;
                if (i < ORDERED_PRIMITIVE_TYPES.length - 1)
                {
                    class4 = ORDERED_PRIMITIVE_TYPES[i + 1];
                    f = f1;
                }
            }
            i++;
            class1 = class4;
        }

        return f1;
    }

    private static float getTotalTransformationCost(Class aclass[], Class aclass1[])
    {
        float f = 0.0F;
        for (int i = 0; i < aclass.length; i++)
        {
            f += getObjectTransformationCost(aclass[i], aclass1[i]);
        }

        return f;
    }

    static boolean isAccessible(Member member)
    {
        return member != null && Modifier.isPublic(member.getModifiers()) && !member.isSynthetic();
    }

    static boolean isPackageAccess(int i)
    {
        return (i & 7) == 0;
    }

    static void setAccessibleWorkaround(AccessibleObject accessibleobject)
    {
        Member member;
        if (accessibleobject != null && !accessibleobject.isAccessible())
        {
            if (Modifier.isPublic((member = (Member)accessibleobject).getModifiers()) && isPackageAccess(member.getDeclaringClass().getModifiers()))
            {
                try
                {
                    accessibleobject.setAccessible(true);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (AccessibleObject accessibleobject)
                {
                    return;
                }
            }
        }
    }

    static 
    {
        ORDERED_PRIMITIVE_TYPES = (new Class[] {
            Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE
        });
    }
}
