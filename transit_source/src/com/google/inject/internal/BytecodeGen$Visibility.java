// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

// Referenced classes of package com.google.inject.internal:
//            BytecodeGen

public static abstract class <init> extends Enum
{

    private static final SAME_PACKAGE $VALUES[];
    public static final SAME_PACKAGE PUBLIC;
    public static final SAME_PACKAGE SAME_PACKAGE;

    public static <init> forMember(Member member)
    {
        if ((member.getModifiers() & 5) == 0)
        {
            return SAME_PACKAGE;
        }
        int j;
        if (member instanceof Constructor)
        {
            member = ((Constructor)member).getParameterTypes();
        } else
        {
            member = (Method)member;
            if (forType(member.getReturnType()) == SAME_PACKAGE)
            {
                return SAME_PACKAGE;
            }
            member = member.getParameterTypes();
        }
        j = member.length;
        for (int i = 0; i < j; i++)
        {
            if (forType(member[i]) == SAME_PACKAGE)
            {
                return SAME_PACKAGE;
            }
        }

        return PUBLIC;
    }

    public static PUBLIC forType(Class class1)
    {
        if ((class1.getModifiers() & 5) != 0)
        {
            return PUBLIC;
        } else
        {
            return SAME_PACKAGE;
        }
    }

    public static SAME_PACKAGE valueOf(String s)
    {
        return (SAME_PACKAGE)Enum.valueOf(com/google/inject/internal/BytecodeGen$Visibility, s);
    }

    public static SAME_PACKAGE[] values()
    {
        return (SAME_PACKAGE[])$VALUES.clone();
    }

    public abstract y_3B_.clone and(y_3B_.clone clone);

    static 
    {
        PUBLIC = new BytecodeGen.Visibility("PUBLIC", 0) {

            public BytecodeGen.Visibility and(BytecodeGen.Visibility visibility)
            {
                return visibility;
            }

        };
        SAME_PACKAGE = new BytecodeGen.Visibility("SAME_PACKAGE", 1) {

            public BytecodeGen.Visibility and(BytecodeGen.Visibility visibility)
            {
                return this;
            }

        };
        $VALUES = (new .VALUES[] {
            PUBLIC, SAME_PACKAGE
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, _cls2 _pcls2)
    {
        this(s, i);
    }
}
