// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;


public class _name
{

    private final String _name;
    private final Type _type;

    public static _name back(String s)
    {
        class Type extends Enum
        {

            private static final Type $VALUES[];
            public static final Type BACK_REFERENCE;
            public static final Type MANAGED_REFERENCE;

            public static Type valueOf(String s1)
            {
                return (Type)Enum.valueOf(com/fasterxml/jackson/databind/AnnotationIntrospector$ReferenceProperty$Type, s1);
            }

            public static Type[] values()
            {
                return (Type[])$VALUES.clone();
            }

            static 
            {
                MANAGED_REFERENCE = new Type("MANAGED_REFERENCE", 0);
                BACK_REFERENCE = new Type("BACK_REFERENCE", 1);
                $VALUES = (new Type[] {
                    MANAGED_REFERENCE, BACK_REFERENCE
                });
            }

            private Type(String s, int i)
            {
                super(s, i);
            }
        }

        return new <init>(Type.BACK_REFERENCE, s);
    }

    public static Type managed(String s)
    {
        return new <init>(Type.MANAGED_REFERENCE, s);
    }

    public String getName()
    {
        return _name;
    }

    public boolean isBackReference()
    {
        return _type == Type.BACK_REFERENCE;
    }

    public boolean isManagedReference()
    {
        return _type == Type.MANAGED_REFERENCE;
    }

    public Type(Type type, String s)
    {
        _type = type;
        _name = s;
    }
}
