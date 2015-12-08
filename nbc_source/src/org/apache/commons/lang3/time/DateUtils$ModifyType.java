// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;


// Referenced classes of package org.apache.commons.lang3.time:
//            DateUtils

private static final class  extends Enum
{

    private static final CEILING $VALUES[];
    public static final CEILING CEILING;
    public static final CEILING ROUND;
    public static final CEILING TRUNCATE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/apache/commons/lang3/time/DateUtils$ModifyType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TRUNCATE = new <init>("TRUNCATE", 0);
        ROUND = new <init>("ROUND", 1);
        CEILING = new <init>("CEILING", 2);
        $VALUES = (new .VALUES[] {
            TRUNCATE, ROUND, CEILING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
