// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;


// Referenced classes of package org.apache.commons.lang3.time:
//            StopWatch

private static final class  extends Enum
{

    private static final UNSPLIT $VALUES[];
    public static final UNSPLIT SPLIT;
    public static final UNSPLIT UNSPLIT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/apache/commons/lang3/time/StopWatch$SplitState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SPLIT = new <init>("SPLIT", 0);
        UNSPLIT = new <init>("UNSPLIT", 1);
        $VALUES = (new .VALUES[] {
            SPLIT, UNSPLIT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
