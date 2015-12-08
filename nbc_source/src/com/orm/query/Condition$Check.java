// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm.query;


// Referenced classes of package com.orm.query:
//            Condition

static final class symbol extends Enum
{

    private static final NOT_LIKE $VALUES[];
    public static final NOT_LIKE EQUALS;
    public static final NOT_LIKE GREATER_THAN;
    public static final NOT_LIKE LESSER_THAN;
    public static final NOT_LIKE LIKE;
    public static final NOT_LIKE NOT_EQUALS;
    public static final NOT_LIKE NOT_LIKE;
    private String symbol;

    public static symbol valueOf(String s)
    {
        return (symbol)Enum.valueOf(com/orm/query/Condition$Check, s);
    }

    public static symbol[] values()
    {
        return (symbol[])$VALUES.clone();
    }

    public String getSymbol()
    {
        return symbol;
    }

    static 
    {
        EQUALS = new <init>("EQUALS", 0, " = ");
        GREATER_THAN = new <init>("GREATER_THAN", 1, " > ");
        LESSER_THAN = new <init>("LESSER_THAN", 2, " < ");
        NOT_EQUALS = new <init>("NOT_EQUALS", 3, " != ");
        LIKE = new <init>("LIKE", 4, " LIKE ");
        NOT_LIKE = new <init>("NOT_LIKE", 5, " NOT LIKE ");
        $VALUES = (new .VALUES[] {
            EQUALS, GREATER_THAN, LESSER_THAN, NOT_EQUALS, LIKE, NOT_LIKE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        symbol = s1;
    }
}
