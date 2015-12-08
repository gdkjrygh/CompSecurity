// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;

// Referenced classes of package com.google.inject.internal.util:
//            $SourceProvider, $Classes

public class $StackTraceElements
{

    public $StackTraceElements()
    {
    }

    public static Object forMember(Member member)
    {
        if (member == null)
        {
            return $SourceProvider.UNKNOWN_SOURCE;
        }
        Class class1 = member.getDeclaringClass();
        if ($Classes.memberType(member) == java/lang/reflect/Constructor)
        {
            member = "<init>";
        } else
        {
            member = member.getName();
        }
        return new StackTraceElement(class1.getName(), member, null, -1);
    }

    public static Object forType(Class class1)
    {
        return new StackTraceElement(class1.getName(), "class", null, -1);
    }
}
