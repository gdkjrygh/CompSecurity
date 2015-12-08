// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.functors;


// Referenced classes of package org.apache.commons.collections4.functors:
//            ComparatorPredicate

public static final class  extends Enum
{

    private static final LESS_OR_EQUAL $VALUES[];
    public static final LESS_OR_EQUAL EQUAL;
    public static final LESS_OR_EQUAL GREATER;
    public static final LESS_OR_EQUAL GREATER_OR_EQUAL;
    public static final LESS_OR_EQUAL LESS;
    public static final LESS_OR_EQUAL LESS_OR_EQUAL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/apache/commons/collections4/functors/ComparatorPredicate$Criterion, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        EQUAL = new <init>("EQUAL", 0);
        GREATER = new <init>("GREATER", 1);
        LESS = new <init>("LESS", 2);
        GREATER_OR_EQUAL = new <init>("GREATER_OR_EQUAL", 3);
        LESS_OR_EQUAL = new <init>("LESS_OR_EQUAL", 4);
        $VALUES = (new .VALUES[] {
            EQUAL, GREATER, LESS, GREATER_OR_EQUAL, LESS_OR_EQUAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
