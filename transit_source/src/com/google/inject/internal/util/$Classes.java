// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// Referenced classes of package com.google.inject.internal.util:
//            $Preconditions

public final class $Classes
{

    public $Classes()
    {
    }

    public static boolean isConcrete(Class class1)
    {
        int i = class1.getModifiers();
        return !class1.isInterface() && !Modifier.isAbstract(i);
    }

    public static boolean isInnerClass(Class class1)
    {
        return !Modifier.isStatic(class1.getModifiers()) && class1.getEnclosingClass() != null;
    }

    public static Class memberType(Member member)
    {
        $Preconditions.checkNotNull(member, "member");
        if (member instanceof Field)
        {
            return java/lang/reflect/Field;
        }
        if (member instanceof Method)
        {
            return java/lang/reflect/Method;
        }
        if (member instanceof Constructor)
        {
            return java/lang/reflect/Constructor;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported implementation class for Member, ").append(member.getClass()).toString());
        }
    }

    public static String toString(Member member)
    {
        Class class1 = memberType(member);
        if (class1 == java/lang/reflect/Method)
        {
            return (new StringBuilder()).append(member.getDeclaringClass().getName()).append(".").append(member.getName()).append("()").toString();
        }
        if (class1 == java/lang/reflect/Field)
        {
            return (new StringBuilder()).append(member.getDeclaringClass().getName()).append(".").append(member.getName()).toString();
        }
        if (class1 == java/lang/reflect/Constructor)
        {
            return (new StringBuilder()).append(member.getDeclaringClass().getName()).append(".<init>()").toString();
        } else
        {
            throw new AssertionError();
        }
    }
}
