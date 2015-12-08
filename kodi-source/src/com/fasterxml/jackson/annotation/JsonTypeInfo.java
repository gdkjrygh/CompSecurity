// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.lang.annotation.Annotation;

public interface JsonTypeInfo
    extends Annotation
{
    public static final class As extends Enum
    {

        private static final As $VALUES[];
        public static final As EXISTING_PROPERTY;
        public static final As EXTERNAL_PROPERTY;
        public static final As PROPERTY;
        public static final As WRAPPER_ARRAY;
        public static final As WRAPPER_OBJECT;

        public static As valueOf(String s)
        {
            return (As)Enum.valueOf(com/fasterxml/jackson/annotation/JsonTypeInfo$As, s);
        }

        public static As[] values()
        {
            return (As[])$VALUES.clone();
        }

        static 
        {
            PROPERTY = new As("PROPERTY", 0);
            WRAPPER_OBJECT = new As("WRAPPER_OBJECT", 1);
            WRAPPER_ARRAY = new As("WRAPPER_ARRAY", 2);
            EXTERNAL_PROPERTY = new As("EXTERNAL_PROPERTY", 3);
            EXISTING_PROPERTY = new As("EXISTING_PROPERTY", 4);
            $VALUES = (new As[] {
                PROPERTY, WRAPPER_OBJECT, WRAPPER_ARRAY, EXTERNAL_PROPERTY, EXISTING_PROPERTY
            });
        }

        private As(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Id extends Enum
    {

        private static final Id $VALUES[];
        public static final Id CLASS;
        public static final Id CUSTOM;
        public static final Id MINIMAL_CLASS;
        public static final Id NAME;
        public static final Id NONE;
        private final String _defaultPropertyName;

        public static Id valueOf(String s)
        {
            return (Id)Enum.valueOf(com/fasterxml/jackson/annotation/JsonTypeInfo$Id, s);
        }

        public static Id[] values()
        {
            return (Id[])$VALUES.clone();
        }

        public String getDefaultPropertyName()
        {
            return _defaultPropertyName;
        }

        static 
        {
            NONE = new Id("NONE", 0, null);
            CLASS = new Id("CLASS", 1, "@class");
            MINIMAL_CLASS = new Id("MINIMAL_CLASS", 2, "@c");
            NAME = new Id("NAME", 3, "@type");
            CUSTOM = new Id("CUSTOM", 4, null);
            $VALUES = (new Id[] {
                NONE, CLASS, MINIMAL_CLASS, NAME, CUSTOM
            });
        }

        private Id(String s, int i, String s1)
        {
            super(s, i);
            _defaultPropertyName = s1;
        }
    }

    public static abstract class None
    {

        public None()
        {
        }
    }


    public abstract Class defaultImpl();

    public abstract As include();

    public abstract String property();

    public abstract Id use();

    public abstract boolean visible();
}
