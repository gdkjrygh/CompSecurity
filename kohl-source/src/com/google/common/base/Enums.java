// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Function, Preconditions

public final class Enums
{
    private static final class ValueOfFunction
        implements Function
    {

        private final Class enumClass;

        public Enum apply(String s)
        {
            try
            {
                s = Enum.valueOf(enumClass, s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return s;
        }

        public volatile Object apply(Object obj)
        {
            return apply((String)obj);
        }

        private ValueOfFunction(Class class1)
        {
            enumClass = (Class)Preconditions.checkNotNull(class1);
        }

    }


    private Enums()
    {
    }

    public static Function valueOfFunction(Class class1)
    {
        return new ValueOfFunction(class1);
    }
}
