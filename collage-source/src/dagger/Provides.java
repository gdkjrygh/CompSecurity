// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger;

import java.lang.annotation.Annotation;

public interface Provides
    extends Annotation
{
    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type SET;
        public static final Type SET_VALUES;
        public static final Type UNIQUE;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(dagger/Provides$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            UNIQUE = new Type("UNIQUE", 0);
            SET = new Type("SET", 1);
            SET_VALUES = new Type("SET_VALUES", 2);
            $VALUES = (new Type[] {
                UNIQUE, SET, SET_VALUES
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract Type type();
}
