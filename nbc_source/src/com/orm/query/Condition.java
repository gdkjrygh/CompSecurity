// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm.query;


public class Condition
{
    static final class Check extends Enum
    {

        private static final Check $VALUES[];
        public static final Check EQUALS;
        public static final Check GREATER_THAN;
        public static final Check LESSER_THAN;
        public static final Check LIKE;
        public static final Check NOT_EQUALS;
        public static final Check NOT_LIKE;
        private String symbol;

        public static Check valueOf(String s)
        {
            return (Check)Enum.valueOf(com/orm/query/Condition$Check, s);
        }

        public static Check[] values()
        {
            return (Check[])$VALUES.clone();
        }

        public String getSymbol()
        {
            return symbol;
        }

        static 
        {
            EQUALS = new Check("EQUALS", 0, " = ");
            GREATER_THAN = new Check("GREATER_THAN", 1, " > ");
            LESSER_THAN = new Check("LESSER_THAN", 2, " < ");
            NOT_EQUALS = new Check("NOT_EQUALS", 3, " != ");
            LIKE = new Check("LIKE", 4, " LIKE ");
            NOT_LIKE = new Check("NOT_LIKE", 5, " NOT LIKE ");
            $VALUES = (new Check[] {
                EQUALS, GREATER_THAN, LESSER_THAN, NOT_EQUALS, LIKE, NOT_LIKE
            });
        }

        private Check(String s, int i, String s1)
        {
            super(s, i);
            symbol = s1;
        }
    }

    static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type AND;
        public static final Type NOT;
        public static final Type OR;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/orm/query/Condition$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            AND = new Type("AND", 0);
            OR = new Type("OR", 1);
            NOT = new Type("NOT", 2);
            $VALUES = (new Type[] {
                AND, OR, NOT
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private Check check;
    private String property;
    private Object value;

    public Condition(String s)
    {
        property = s;
    }

    public static Condition prop(String s)
    {
        return new Condition(s);
    }

    public Condition eq(Object obj)
    {
        value = obj;
        check = Check.EQUALS;
        return this;
    }

    public Check getCheck()
    {
        return check;
    }

    public String getCheckSymbol()
    {
        return check.getSymbol();
    }

    public String getProperty()
    {
        return property;
    }

    public Object getValue()
    {
        return value;
    }

    public Condition gt(Object obj)
    {
        value = obj;
        check = Check.GREATER_THAN;
        return this;
    }

    public Condition like(Object obj)
    {
        value = obj;
        check = Check.LIKE;
        return this;
    }

    public Condition lt(Object obj)
    {
        value = obj;
        check = Check.LESSER_THAN;
        return this;
    }

    public Condition notEq(Object obj)
    {
        value = obj;
        check = Check.NOT_EQUALS;
        return this;
    }

    public Condition notLike(Object obj)
    {
        value = obj;
        check = Check.NOT_LIKE;
        return this;
    }
}
