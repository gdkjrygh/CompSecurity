// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm.query;


// Referenced classes of package com.orm.query:
//            Condition

static final class  extends Enum
{

    private static final NOT $VALUES[];
    public static final NOT AND;
    public static final NOT NOT;
    public static final NOT OR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/orm/query/Condition$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        AND = new <init>("AND", 0);
        OR = new <init>("OR", 1);
        NOT = new <init>("NOT", 2);
        $VALUES = (new .VALUES[] {
            AND, OR, NOT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
