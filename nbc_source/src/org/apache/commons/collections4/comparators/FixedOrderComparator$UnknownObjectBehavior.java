// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.comparators;


// Referenced classes of package org.apache.commons.collections4.comparators:
//            FixedOrderComparator

public static final class  extends Enum
{

    private static final EXCEPTION $VALUES[];
    public static final EXCEPTION AFTER;
    public static final EXCEPTION BEFORE;
    public static final EXCEPTION EXCEPTION;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/apache/commons/collections4/comparators/FixedOrderComparator$UnknownObjectBehavior, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BEFORE = new <init>("BEFORE", 0);
        AFTER = new <init>("AFTER", 1);
        EXCEPTION = new <init>("EXCEPTION", 2);
        $VALUES = (new .VALUES[] {
            BEFORE, AFTER, EXCEPTION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
